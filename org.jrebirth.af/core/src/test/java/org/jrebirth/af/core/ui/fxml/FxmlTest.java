package org.jrebirth.af.core.ui.fxml;

import javafx.scene.Node;
import javafx.scene.text.Text;

import org.jrebirth.af.core.test.AbstractTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * The class <strong>FxmlTest</strong>.
 *
 * @author Sébastien Bordes
 */
@Ignore
public class FxmlTest extends AbstractTest {

    private TestFXMLModel model;

    /**
     * TODO To complete.
     *
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void loadFXML1() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class);

        final FXMLComponentBase comp = FXMLUtils.loadFXML(this.model, "fxml:org/jrebirth/core/ui/fxml/Test1.fxml");
        checkFxmlNode(comp.node());
    }

    @Test
    public void loadFXML2() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class);

        final FXMLComponentBase comp = FXMLUtils.loadFXML(this.model, "fxml:Test1.fxml");
        checkFxmlNode(comp.node());
    }

    @Test
    public void loadFXML3() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class);

        final FXMLComponentBase comp = FXMLUtils.loadFXML(this.model, "fxml:org/jrebirth/core/ui/fxml/Test1.fxml", "rb:org.jrebirth.af.core.ui.fxml.Test1");
        checkFxmlNode(comp.node());

    }

    @Test
    public void loadFXML4() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class);

        final FXMLComponentBase comp = FXMLUtils.loadFXML(this.model, "fxml:Test1.fxml", "rb:org.jrebirth.af.core.ui.fxml.Test1");
        checkFxmlNode(comp.node());
    }

    @Test
    public void loadFXMLModel1() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class, "fxml:Test1.fxml");

        checkFxmlNode(this.model.node());
    }

    @Test
    public void loadFXMLModel2() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class, "fxml:org/jrebirth/core/ui/fxml/Test1.fxml");

        checkFxmlNode(this.model.node());
    }

    @Test
    public void loadFXMLModel3() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class, "fxml:Test1.fxml", "rb:Test1");

        checkFxmlNode(this.model.node());
    }

    @Test
    public void loadFXMLModel4() {

        this.model = AbstractTest.globalFacade.uiFacade().retrieve(TestFXMLModel.class, "fxml:org/jrebirth/core/ui/fxml/Test1.fxml", "rb:Test1");

        checkFxmlNode(this.model.node());
    }

    /**
     * TODO To complete.
     *
     * @param node
     */
    private void checkFxmlNode(final Node node) {
        if (node == null) {
            Assert.fail("The node is null");
        } else if (node instanceof Text) {
            if (((Text) node).getText().startsWith("FXML Error : ")) {
                Assert.fail("The FXMLnode has not been loaded");
            }
        }

    }

    /**
     * TODO To complete.
     *
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception {
    }

}
