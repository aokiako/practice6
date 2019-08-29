package s2omikuji.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Unseiエンティティクラス
 *@author a_aoki
 */
@Entity
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl" }, date = "2019/08/20 19:02:22")
public class Unsei implements Serializable {

	private static final long serialVersionUID = 1L;

	/** unseiIdプロパティ */
	@Id
	@Column(precision = 10, nullable = false, unique = true)
	public Integer unseiId;

	/** unseiNameプロパティ */
	@Column(length = 2, nullable = false, unique = false)
	public String unseiName;

	/** changerプロパティ */
	@Column(length = 10, nullable = false, unique = false)
	public String changer;

	/** updateプロパティ */
	@Column(nullable = false, unique = false)
	public Date update;

	/** createrプロパティ */
	@Column(length = 10, nullable = false, unique = false)
	public String creater;

	/** createdayプロパティ */
	@Column(nullable = false, unique = false)
	public Date createday;

	@OneToMany(mappedBy = "unsei")
	public List<Omikuji> omikujiList;
}