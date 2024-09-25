package com.sample.mail;

public class StringContent {
    //Write a Java Developer Email CoverLetter
    public static String getmessage(String positon,String Company){
        String text = "Dear Hiring Manager at "+Company+",\n" +
                "\n" +
                "I am writing to express my interest in the "+positon+" position at "+Company+". As a highly skilled and motivated Java developer with a passion for creating innovative solutions, I am confident that I would be an excellent fit for your team.\n" +
                "\n" +
                "With 6 months of Internship experience in Java development, I have developed a strong proficiency in Java programming language, HTML, CSS, Javascript, Springboot, Hibernate, postgresSql . My expertise in [specific area of expertise] has allowed me to deliver high-quality solutions that meet and exceed expectations.\n" +
                "\n" +
                "I am particularly drawn to "+Company+" because of its [reputation, mission, or values that resonate with you]. As a developer, I believe that it is essential to be part of a team that shares my passion for innovation and excellence.\n" +
                "\n" +
                "Thank you for considering my application. I would be thrilled to discuss my qualifications further and explain in greater detail why I am the ideal candidate for this role.\n" +
                "\n" +
                "Sincerely,\n \n Shashank Sharma \n +917658815417 \n shashanksh72@gmail.com";
        return text;
    }
}
