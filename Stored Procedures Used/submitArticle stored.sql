CREATE PROCEDURE submitArticle
(
	@path VARCHAR(255),
	@atitle VARCHAR(255),
	@apages INT,
	@astatus VARCHAR(255),
	@asummary VARCHAR(255),
	@keyword VARCHAR(255),
	@chiefeditoremail VARCHAR(255),
	@catid INT,
	@pagenum INT,
	@date DATE,
	@editemail VARCHAR(255),
	@pagestart INT
)
	AS
		INSERT INTO article(article_path,title,pages,status,summary,key_word,chief_editor_email,category_id,page_number,approve_date,editor_email,page_start)VALUES(@path,@atitle,@apages,@astatus,@asummary,@keyword,@chiefeditoremail,@catid,@pagenum,@date,@editemail,@pagestart)