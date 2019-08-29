package s2omikuji.service;

import javax.annotation.Generated;

import org.seasar.extension.unit.S2TestCase;

/**
 * {@link OmikujiService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2019/08/20 19:02:32")
public class OmikujiServiceTest extends S2TestCase {

    private OmikujiService omikujiService;

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
     * {@link #omikujiService}が利用可能であることをテストします。
     *
     * @throws Exception 例外
     */
    public void testAvailable() throws Exception {
        assertNotNull(omikujiService);
    }
}