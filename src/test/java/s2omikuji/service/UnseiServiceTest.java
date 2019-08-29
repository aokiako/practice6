package s2omikuji.service;

import javax.annotation.Generated;

import org.seasar.extension.unit.S2TestCase;

/**
 * {@link UnseiService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2019/08/20 19:02:32")
public class UnseiServiceTest extends S2TestCase {

    private UnseiService unseiService;

    /**
     * 事前処理をします。
     *
     * @throws Exception 例外
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #unseiService}が利用可能であることをテストします。
     *
     * @throws Exception 例外
     */
    public void testAvailable() throws Exception {
        assertNotNull(unseiService);
    }
}