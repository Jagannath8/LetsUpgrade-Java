package com.quizapp;

public class Game {

    Question[] questions=new Question[5];
    Player player=new Player();

    String[] questionsdata={"The depletion of the ozone layer causes?", "What is the closest planet to sun?",
             "Which one of the following is an artificial ecosystem?", " Environment Day falls on _____",
             " Sardar Sarovar Dam is constructed on which river?"};
    String[] options1={"global warming", "Earth", "Lake", "28th February", "Sutlej"};
    String[] options2={"increased UV radiations", "Venus", "Forest", " 23rd March", "Ganga"};
    String[] options3={"acid rain", "Mercury", "Pond", "5th June", "Narmada"};
    String[] options4={"earthquakes", "Jupiter", "Crop field", "16th August", "Kaveri"};
    int[] answers={2,3,4,3,1};


    public void initGame()
    {

        for(int i=0;i<5;i++){
            questions[i]=new Question();
        }

        for(int i=0;i<5;i++)
        {

            questions[i].question = questionsdata[i];
            questions[i].option1 = options1[i];
            questions[i].option2 = options2[i];
            questions[i].option3 = options3[i];
            questions[i].option4 = options4[i];
            questions[i].correctAnswer = answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<5;i++)
        {
            System.out.println("");
            System.out.println("***** " + "QUESTION " + (i+1) + " *****");
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Well played!! You got this correct!");
                player.score=player.score+10;
            }
            else{
                System.out.println("OOPS!! Wrong answer!");
                player.score=player.score-5;
            }
        }

        System.out.println(player.name + " your score is " + player.score);

    }

}