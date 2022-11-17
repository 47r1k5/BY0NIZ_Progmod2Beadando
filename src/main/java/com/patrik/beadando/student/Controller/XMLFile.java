package com.patrik.beadando.student.Controller;

import com.patrik.beadando.student.Model.CourseTypeEnum;
import com.patrik.beadando.student.Model.FinancingTypeEnum;
import com.patrik.beadando.student.Model.MajorEnum;
import com.patrik.beadando.student.Model.StudentClass;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XMLFile{
    public static Document fileBuilder() {
        try {
            File file = new File("src/main/java/com/patrik/beadando/student/StudentsXML.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(file);
            doc.getDocumentElement().normalize();
            return doc;
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            Logger.getLogger(XMLFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static List<StudentClass> XMLReader() {
        Document doc=fileBuilder();
        List<StudentClass> listOfStudents = new LinkedList<>();
        StudentClass student;

        NodeList studentNodes = doc.getElementsByTagName("Student");
        for (int i = 0; i < studentNodes.getLength(); i++) {
            Node studentNode = studentNodes.item(i);

            if (studentNode.getNodeType() == Node.ELEMENT_NODE) {
                Element studentElement = (Element) studentNode;

                Integer id = Integer.parseInt(studentElement.getElementsByTagName("Id").item(0).getTextContent());
                String name = studentElement.getElementsByTagName("Name").item(0).getTextContent();
                LocalDate birthDate = LocalDate.parse(studentElement.getElementsByTagName("BirthDate").item(0).getTextContent());
                String email = studentElement.getElementsByTagName("Email").item(0).getTextContent();
                MajorEnum major = MajorEnum.valueOf(studentElement.getElementsByTagName("Major").item(0).getTextContent());
                FinancingTypeEnum financingType = FinancingTypeEnum.valueOf(studentElement.getElementsByTagName("FinancingType").item(0).getTextContent());
                CourseTypeEnum courseType = CourseTypeEnum.valueOf(studentElement.getElementsByTagName("CourseType").item(0).getTextContent());

                student = new StudentClass(id, name, birthDate, email, major, financingType, courseType);
                listOfStudents.add(student);
            }
        }
        return listOfStudents;
    }
}