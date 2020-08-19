package com.mf.warmtouch;

import com.mf.warmtouch.model.dtos.AboutMeDTO;
import com.mf.warmtouch.model.dtos.AboutMeElement;
import io.jsonwebtoken.lang.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class AboutMeDTOTest {

    @Test
    public void textFirstImageSecond()
    {
        // given
        String textToTest = "lorem ipsum {testing_image}";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assertions.assertEquals( "lorem ipsum ", elements.get(0).getContent());
        Assertions.assertEquals( "TEXT", elements.get(0).getType());
        Assertions.assertEquals( "testing_image", elements.get(1).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(1).getType());
    }

    @Test
    public void imageFirstTextSecond()
    {
        // given
        String textToTest = "{testing_image} lorem ipsum";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assertions.assertEquals( "testing_image", elements.get(0).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(0).getType());
        Assertions.assertEquals( " lorem ipsum", elements.get(1).getContent());
        Assertions.assertEquals( "TEXT", elements.get(1).getType());
    }

    @Test
    public void twoImagesOneText()
    {
        // given
        String textToTest = "{testing_image} lorem ipsum {testing_image}";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assertions.assertEquals( "testing_image", elements.get(0).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(0).getType());
        Assertions.assertEquals( " lorem ipsum ", elements.get(1).getContent());
        Assertions.assertEquals( "TEXT", elements.get(1).getType());
        Assertions.assertEquals( "testing_image", elements.get(2).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(2).getType());
    }

    @Test
    public void twoTextsOneImage()
    {
        // given
        String textToTest = "lorem ipsum {testing_image} lorem ipsum";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assertions.assertEquals( "lorem ipsum ", elements.get(0).getContent());
        Assertions.assertEquals( "TEXT", elements.get(0).getType());
        Assertions.assertEquals( "testing_image", elements.get(1).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(1).getType());
        Assertions.assertEquals( " lorem ipsum", elements.get(2).getContent());
        Assertions.assertEquals( "TEXT", elements.get(2).getType());
    }

    @Test
    public void twoTextsTwoImages()
    {
        // given
        String textToTest = "lorem ipsum {testing_image} lorem ipsum {testing_image}";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assert.isTrue(elements.get(0).getContent().equals("lorem ipsum "));
        Assert.isTrue(elements.get(0).getType().equals("TEXT"));
        Assert.isTrue(elements.get(1).getContent().equals("testing_image"));
        Assert.isTrue(elements.get(1).getType().equals("IMAGE"));
        Assert.isTrue(elements.get(2).getContent().equals(" lorem ipsum "));
        Assert.isTrue(elements.get(2).getType().equals("TEXT"));
        Assert.isTrue(elements.get(3).getContent().equals("testing_image"));
        Assert.isTrue(elements.get(3).getType().equals("IMAGE"));

        Assertions.assertEquals( "lorem ipsum ", elements.get(0).getContent());
        Assertions.assertEquals( "TEXT", elements.get(0).getType());
        Assertions.assertEquals( "testing_image", elements.get(1).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(1).getType());
        Assertions.assertEquals( " lorem ipsum ", elements.get(2).getContent());
        Assertions.assertEquals( "TEXT", elements.get(2).getType());
        Assertions.assertEquals( "testing_image", elements.get(3).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(3).getType());
    }

    @Test
    public void noImageOnlyText()
    {
        // given
        String textToTest = "lorem ipsum dolor sit amet";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assertions.assertEquals( "lorem ipsum dolor sit amet", elements.get(0).getContent());
        Assertions.assertEquals( "TEXT", elements.get(0).getType());
    }

    @Test
    public void noTextOnlyImage()
    {
        // given
        String textToTest = "{testing_image}";

        // when
        AboutMeDTO testedDTO = new AboutMeDTO(textToTest);
        List<AboutMeElement> elements = testedDTO.getElements();

        // then
        Assertions.assertEquals( "testing_image", elements.get(0).getContent());
        Assertions.assertEquals( "IMAGE", elements.get(0).getType());
    }
}
