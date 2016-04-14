package BBS.beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Posts {

	private int _id;
	private String _title;
	private String _text;
	private String _category;
	private int _userId;
	private String _userName;
	private Date _createdDate;
	private Date _updatedDate;
	private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy年MM月dd日 E曜日 HH:mm:ss");
	private List<Comments> _comments;

	//Posts.idのセッター・ゲッター
	public void setId(int id){
		_id = id;
	}
	public int getId(){
		return _id;
	}

	//Posts.titleのセッター・ゲッター
	public void setTitle(String title){
		_title = title;
	}
	public String getTitle(){
		return _title;
	}

	//Posts.textのセッター・ゲッター
	public void setText(String text){
		_text = text;
	}
	public String getText(){
		return _text;
	}
	//Posts.categoryのセッター・ゲッター
	public void setCategory(String category){
		_category = category;
	}
	public String getCategory(){
		return _category;
	}

	//Posts.user_idのセッター・ゲッター
	public void setUserId(int userId){
		_userId = userId;
	}
	public int getUserId(){
		return _userId;
	}

	//Posts.created_dateのセッター・ゲッター
	public void setCreatedDate(Date createdDate){
		_createdDate = createdDate;
	}
	public Date getCreatedDate(){
		return _createdDate;
	}
	public String getCreatedDateString(){
		return _dateFormat.format(_createdDate);
	}

	//Posts.updated_dateのセッター・ゲッター
	public void setUpdatedDate(Date updatedDate){
		_updatedDate = updatedDate;
	}
	public Date getUpdatedDate(){
		return _updatedDate;
	}

	//user_idに紐づくUsers.nameのセッター・ゲッター
	public void setUserName(String userName){
		_userName = userName;
	}
	public String getUserName(){
		return _userName;
	}

	//Posts.idに紐づくCommentsのセッター・ゲッター
	public void setComments(List<Comments> comments){
		_comments = comments;
	}
	public List<Comments> getComments(){
		return _comments;
	}
}
