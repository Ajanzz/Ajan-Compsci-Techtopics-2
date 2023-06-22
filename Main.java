public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        QuizSection section1 = new QuizSection("Section 1: Recycling");
        section1.addInformation("Recycling is the process of converting waste materials into reusable materials. " +
                "Recycling electronics is an essential practice for reducing the environmental impact of electronic waste. Electronic devices contain valuable materials such as gold, silver, copper, and rare earth metals that can be recovered and reused. By recycling these materials, we can conserve natural resources, reduce energy consumption, and minimize the pollution associated with extracting new resources. According to the Environmental Protection Agency (EPA), recycling one million laptops can save the energy equivalent of electricity used by 3,657 U.S. homes in a year. Additionally, recycling electronics prevents hazardous substances like lead, mercury, and cadmium from leaching into soil and water, safeguarding both human health and the environment. These toxic metals can cause respiratory problems in both humans and other animals. There are many organizations and initiatives that help reduce e-waste like BAN. BAN is an international non-profit organization that aims to prevent toxic trade and promote responsible e-waste recycling. They advocate for environmentally sound practices and work to enforce legal and responsible e-waste management.");
        section1.addQuestion("Which of the following items is NOT recyclable from electronics?");
        section1.addChoice("gold");
        section1.addChoice("silver");
        section1.addChoice("tungsten");
        section1.addChoice("copper");
        section1.setAnswer(2);

        section1.addQuestion("You can save energy used to power ____ homes by recycling one million laptops.");
                section1.addChoice("3657");
                section1.addChoice("2657");
                section1.addChoice("100");
                section1.addChoice("30");
                section1.setAnswer(0);

        section1.addQuestion("Why is e-waste recycling important?");
                section1.addChoice("Ensures human and marine health");
                section1.addChoice("To conserve energy");
                section1.addChoice("To conserve natural resources");
                section1.addChoice("All of the above");
                section1.setAnswer(3);

        QuizSection section2 = new QuizSection("Section 2: Energy Conservation");
        section2.addInformation("Energy conservation is the practice of reducing energy consumption to achieve a sustainable " +
                "Technology has a significant impact on energy conservation, offering both positive and negative aspects. On the positive side, technological advancements have led to the development of energy-efficient appliances, smart grids, and renewable energy technologies, reducing energy consumption and promoting sustainability. Digital tools enable better monitoring and control of energy usage, facilitating informed decision-making and behavioral changes that contribute to energy conservation. However, technology also has negative impacts, such as the energy consumption and environmental pollution associated with the production, use, and disposal of electronic devices. To mitigate these negative impacts, individuals and communities can adopt energy-efficient practices, responsibly consume electronics, promote renewable energy adoption, and raise awareness through education. Numerous organizations and initiatives support energy conservation efforts, including the Canadian Department of Energy, U.S. Environmental Protection Agency's ENERGY STAR program, and the World Wildlife Fund, which provide resources, tips, and programs to promote energy conservation. " +
                "");
        section2.addQuestion("Which of the following is a technology that has a positive significant impact on energy conservation?");
                section2.addChoice("Smart grids");
                section2.addChoice("Diesel vehicles");
                section2.addChoice("Smart watch");
                section2.addChoice("Fossil Fuels");
                section2.setAnswer(0);

        section2.addQuestion("What is an organization supports energy conservation efforts?");
                section2.addChoice("World Wildlife Fund");
                section2.addChoice("NASA");
                section2.addChoice("LG");
                section2.addChoice("Microsoft");
                section2.setAnswer(0);

        section2.addQuestion("Education helps to improve energy conservation.");
                section2.addChoice("False");
                section2.addChoice("True");
               
                section2.setAnswer(1);

        QuizSection section3 = new QuizSection("Section 3: Transportation");
        section3.addInformation("Technology has had a profound impact on transportation, both positive and negative. On the positive side, technology has revolutionized the efficiency and accessibility of transportation systems. It has led to the development of faster and more comfortable vehicles, such as high-speed trains and airplanes, allowing people to travel longer distances in shorter time. Additionally, advancements in navigation systems and GPS technology have made it easier for individuals to navigate unfamiliar routes, reducing travel time and minimizing the chances of getting lost.Moreover, technology has played a significant role in improving the safety of transportation. The introduction of advanced driver-assistance systems (ADAS) and autonomous vehicles has the potential to greatly reduce accidents caused by human error. However, technology has also brought about negative impacts on transportation. One major concern is the increasing reliance on fossil fuels, leading to climate change. The majority of vehicles still rely on gasoline or diesel, which emit greenhouse gases and contribute to air pollution. Additionally, the manufacturing and disposal of technology-based transportation infrastructure can generate electronic waste, further impacting the environment.To help reduce these negative impacts, individuals can adopt sustainable transportation practices. One way is to utilize public transportation systems, such as buses or trains, which can help reduce congestion and decrease carbon emissions. Carpooling and ridesharing services are also effective in optimizing vehicle occupancy and reducing the number of cars on the road.Another approach is to embrace alternative modes of transportation. Bicycling and walking are eco-friendly options for short-distance travel, improving personal health while minimizing environmental impact. Furthermore, the adoption of electric vehicles (EVs) can significantly reduce greenhouse gas emissions. In addition to individual efforts, various programs and initiatives have been implemented by local, global, government, and private organizations to address these challenges. For instance, cities are investing in the development of bike lanes and pedestrian-friendly infrastructure to encourage active transportation. Governments and automobile manufacturers are incentivizing the adoption of EVs through tax breaks and subsidies.Moreover, organizations like the UN and the World Health Organization are promoting sustainable transportation policies on a global scale. They encourage the use of low-carbon transportation modes and advocate for the integration of technology and sustainable practices in urban planning.");
        section3.addQuestion("What is a negative effect of technology on transportarion");
               section3 .addChoice("Faster travel times");
                section3.addChoice("Causes more accidents");
                section3.addChoice("Encourages people to travel unknown routes");
                section3.addChoice("Causes gas emissions");
                section3.setAnswer(3);

        section3.addQuestion("Electric Vehicles (EVs) overall help reduce emissions.");
                section3.addChoice("True");
                section3.addChoice("False");
                
                section3.setAnswer(0);

        section3.addQuestion("What is a global organization promoting sustainable transportation policies?");
                section3.addChoice("UN");
                section3.addChoice("NASA");
                section3.addChoice("CRA");
               
                section3.setAnswer(0);

        QuizSection section4 = new QuizSection("Section 4: Technology's impact on human health");
        section4.addInformation("Technology has had profound impacts on human health, both positive and negative. On the positive side, it has led to significant medical advancements, revolutionizing research, diagnostics, and treatment methods. Telemedicine has emerged as a game-changer, providing remote access to healthcare professionals, consultations, and monitoring, particularly beneficial for individuals in remote areas or with limited mobility. For example, initiatives like the American Well platform and the NHS Digital's GP at Hand service offer virtual consultations and healthcare services. Wearable devices and health apps have empowered individuals to take charge of their well-being, allowing them to track vital signs, fitness levels, sleep patterns, and overall health trends. Popular examples include Fitbit, Apple Watch, and health apps like MyFitnessPal and Strava. These technological advancements have enhanced healthcare accessibility, efficiency, and self-awareness.However, there are negative impacts associated with technology and human health. The sedentary lifestyle that often accompanies excessive technology use has contributed to a rise in obesity, cardiovascular diseases, and musculoskeletal issues. To combat this, initiatives such as Let's Move! by the U.S. Department of Health and Human Services and the Active Schools program promote physical activity in schools and communities. Extended screen time has been linked to eye strain, dry eyes, and vision problems. Additionally, the omnipresence of social media and constant connectivity can take a toll on mental health, leading to issues like anxiety, depression, and addiction. Initiatives like the #MoveForMentalHealth campaign by Active Minds and mental health awareness programs in schools and workplaces aim to raise awareness and provide resources for mental well-being.To address these negative impacts, various initiatives and campaigns have been launched by governments, non-profit organizations, and private entities. For example, the Digital Wellness Program by Google promotes healthy technology use through features like Digital Wellbeing, which helps users monitor and manage their screen time. The Be Internet Awesome program, developed by Google in collaboration with organizations like the Family Online Safety Institute, educates children and families about online safety and responsible digital citizenship. By leveraging these efforts, individuals can become more mindful of their technology use, prioritize their physical and mental well-being, and establish healthy habits for themselves and their families." );
        section4.addQuestion("One way technology positively impacts human health is by:");
                section4.addChoice("Glueing people to their phones");
                section4.addChoice("Improving internet speeds");
                section4.addChoice("Improving healthcare accessibility");
                
                section4.setAnswer(2);

        section4.addQuestion("Technology has an impact on mental health.");
                section4.addChoice("True");
                section4.addChoice("False");
                
                section4.setAnswer(0);

        section4.addQuestion("Who was the Be Internet Awesome program designed by?");
                section4.addChoice("Microsoft");
                section4.addChoice("Facebook");
                section4.addChoice("Google");
                section4.addChoice("Meta");
                section4.setAnswer(2);

        quiz.addSection(section1);
        quiz.addSection(section2);
        quiz.addSection(section3);
        quiz.addSection(section4);

        quiz.start();
    }
}
