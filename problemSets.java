import java.util.HashMap;
public class problemSets {
	
	public problem[] problems;
	public HashMap<Integer, String> questionNumToQuestion;
	public HashMap<Integer, String[]> questionNumToPossAns;
	public HashMap<Integer, String> questionNumToAnswer;
	public int questionNum;
	public problemSets(problem[] problems, int questionNum){
	    this.problems = problems;
	    this.questionNum = questionNum;
	    
	    questionNumToPossAns = new HashMap<Integer, String[]>();
		questionNumToAnswer = new HashMap<Integer, String>();
		questionNumToQuestion = new  HashMap<Integer, String>();
		
	    for(Integer i = 0; i < questionNum; i++) {
	    	questionNumToQuestion.put(i + 1, problems[i].question);
	    	questionNumToPossAns.put(i + 1, problems[i].possAns);
	    	questionNumToAnswer.put(i + 1, problems[i].ans);
	    }
	    
   }
}

class problem{
	public String question;
	public String[] possAns;
	public String ans;
	public String topic;
	public problem(String topic, String question, String[] possAns, String ans) {
		this.topic = topic;
		this.question = question;
		this.possAns = possAns;
		this.ans = ans;
		
	}
	
}