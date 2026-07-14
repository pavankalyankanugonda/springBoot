package com.Pavan.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/myself")
    public String mySelf() {
        return "<h1>Pavan Kalyan</h1>" +
                "<p>I am a Computer Science and Engineering student at Lovely Professional University with a passion for Full Stack Development. " +
                "I enjoy building scalable web applications using Java, Spring Boot, React.js, and MySQL. " +
                "I am currently looking for internship and full-time opportunities where I can contribute and grow as a software developer.</p>" +
                "<ul>" +
                "<li>Email: your-email@example.com</li>" +
                "<li>LinkedIn: https://www.linkedin.com/in/your-linkedin</li>" +
                "<li>GitHub: https://github.com/your-github</li>" +
                "<li>LeetCode: https://leetcode.com/u/your-username/</li>" +
                "</ul>";
    }

    @GetMapping("/skills")
    public String mySkills() {
        return "<h1>Skills</h1>" +
                "<b>Languages:</b> Java, Python, C, C++, HTML, CSS, JavaScript<br>" +
                "<b>Frameworks:</b> Spring Boot, React.js, Node.js, Express.js<br>" +
                "<b>Databases:</b> MySQL, MongoDB, H2 Database<br>" +
                "<b>Tools:</b> Git, GitHub, Maven, Postman, VS Code, IntelliJ IDEA<br>" +
                "<b>Soft Skills:</b> Problem Solving, Teamwork, Communication, Leadership<br>";
    }

    @GetMapping("/education")
    public String myEducation() {
        return "<h1>Education</h1>" +

                "<h2>Bachelor of Technology (CSE)</h2>" +
                "<ul>" +
                "<li>Lovely Professional University</li>" +
                "<li>Phagwara, Punjab</li>" +
                "<li>2023 - 2027</li>" +
                "</ul><br>" +

                "<h2>Intermediate</h2>" +
                "<ul>" +
                "<li>Narayana Junior College</li>" +
                "<li>Andhra Pradesh</li>" +
                "<li>2021 - 2023</li>" +
                "</ul><br>" +

                "<h2>SSC</h2>" +
                "<ul>" +
                "<li>Jeevan Jyothi English Medium High School</li>" +
                "<li>Andhra Pradesh</li>" +
                "<li>2020 - 2021</li>" +
                "</ul>";
    }

    @GetMapping("/projects")
    public String myProjects() {
        return "<h1>Projects</h1>" +

                "<h2>ParkNova - Smart Parking Management System</h2>" +
                "<ul>" +
                "<li>Developed a full-stack Smart Parking Management System using Spring Boot, React.js, and MySQL/H2 Database.</li>" +
                "<li>Implemented user authentication, parking slot booking, vehicle management, and admin dashboard.</li>" +
                "<li>Designed REST APIs using Spring Boot and integrated them with the React frontend.</li>" +
                "</ul><br>" +

                "<h2>AI-Based Ethical Contract Checker (EthicaCheck)</h2>" +
                "<ul>" +
                "<li>Designed an AI-powered system to analyze employee contracts and identify unethical or unfair clauses.</li>" +
                "<li>Prepared and submitted a patent for the solution.</li>" +
                "<li>Focused on improving transparency and legal compliance using AI techniques.</li>" +
                "</ul><br>" +

                "<h2>Civic Issue Reporting Management System</h2>" +
                "<ul>" +
                "<li>Developed a web application that enables citizens to report civic issues online.</li>" +
                "<li>Built responsive user interfaces using React.js and integrated backend APIs.</li>" +
                "<li>Implemented issue tracking and status management features.</li>" +
                "</ul>";
    }
}