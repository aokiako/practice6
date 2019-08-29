package s2omikuji.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

/**
 * Resultエンティティクラス
 *@author a_aoki
 */
@Entity
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl" }, date = "2019/08/20 19:02:22")
public class Result implements Serializable {

	private static final long serialVersionUID = 1L;

	/** fortuneDayプロパティ */
	@Id
	@Column(nullable = false, unique = false)
	public Date fortuneDay;

	/** birthdayプロパティ */
	@Id
	@Column(nullable = false, unique = false)
	public Date birthday;

	/** changerプロパティ */
	@Column(length = 10, nullable = false, unique = false)
	public String changer;

	/** updateプロパティ */
	@Column(nullable = false, unique = false)
	public Date update;

	/** createrプロパティ */
	@Column(length = 10, nullable = false, unique = false)
	public String creater;

	/** createDayプロパティ */
	@Column(nullable = false, unique = false)
	public Date createDay;

	/** omikujiIdプロパティ */
	@Column(precision = 10, nullable = true, unique = false)
	public Integer omikujiId;

	@Transient
	@ManyToMany
	@JoinColumn(name = "OMIKUJI_ID", referencedColumnName = "OMIKUJI_ID")
	public int count;

}