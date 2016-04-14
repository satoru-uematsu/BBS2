package BBS.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import BBS.validation.BBSForm;

public class BBSServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected Map<String, List<String>> validate(BBSForm form){

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<BBSForm>> validationResult = validator.validate(form);

		Map<String, List<String>> violationMessages = new HashMap<String, List<String>>();

		for(ConstraintViolation<BBSForm> violation : validationResult){

			String propertyPath = violation.getPropertyPath().toString();
			List<String> messages = violationMessages.get(propertyPath);
			if(messages == null){
				messages = new ArrayList<String>();
				violationMessages.put(propertyPath, messages);
			}
			messages.add(violation.getMessage());
		}
		return violationMessages;
	}

	//改行コードを<br>に変換
	protected String lineSeparatorEncoder(String traget){
		String decode;
		decode = traget.replaceAll(System.lineSeparator(), "<br>");
		return decode;
	}
}
