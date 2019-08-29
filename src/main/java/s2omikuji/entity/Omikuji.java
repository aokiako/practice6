package s2omikuji.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Omikujiエンティティクラス
 *@author a_aoki
 */
@Entity
@Generated(value = { "S2JDBC-Gen 2.4.46",
		"org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl" }, date = "2019/08/20 19:02:22")
public class Omikuji implements Serializable {

	private static final long serialVersionUID = 1L;

	/** omikujiIdプロパティ */
	@Id
	@Column(precision = 10, nullable = false, unique = true)
	public Integer omikujiId;

	/** unseiIdプロパティ */
	@Column(precision = 10, nullable = false, unique = false)
	public Integer unseiId;

	/** negaigotoプロパティ */
	@Column(length = 50, nullable = false, unique = false)
	public String negaigoto;

	/** akinaiプロパティ */
	@Column(length = 50, nullable = false, unique = false)
	public String akinai;

	/** gakumonプロパティ */
	@Column(length = 50, nullable = false, unique = false)
	public String gakumon;

	/** updateプロパティ */
	@Column(nullable = false, unique = false)
	public Date update;

	/** changerプロパティ */
	@Column(length = 10, nullable = false, unique = false)
	public String changer;

	/** createdayプロパティ */
	@Column(nullable = false, unique = false)
	public Date createday;

	/** createrプロパティ */
	@Column(length = 10, nullable = false, unique = false)
	public String creater;

	/** 運勢オブジェクト */
	@ManyToOne
	@JoinColumn(name = "UNSEI_ID", referencedColumnName = "UNSEI_ID")
	public Unsei unsei;

}