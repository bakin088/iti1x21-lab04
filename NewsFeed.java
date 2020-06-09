/* *
 * Use static array for NewsFeed
 * with constant MAX_SIZE
 * */

public class NewsFeed {

  private Post[] messages;
  private int size;
  public static final int MAX_SIZE = 25;

  public NewsFeed() {

    postArray = new Post[MAX_SIZE];
       size =0;

  }

  public void add(Post message) {

    postArray[size] = message;
       this.size++;

  }

  public Post get(int index) {
    return messages[index];
  }

  public int size() {
    return size;
  }

  public void sort(){
    int i, j, argMin;
    Post tmp;
    for (i = 0; i < size - 1; i++) {
      argMin = i;
      for (j = i + 1; j < size(); j++) {
        if (messages[j].compareTo(messages[argMin]) < 0) {
          argMin = j;
        }
      }

      tmp = messages[argMin];
      messages[argMin] = messages[i];
      messages[i] = tmp;
    }

  }

  public NewsFeed getPhotoPost(){

     NewsFeed newsfeed1 = new NewsFeed();
      Post [] postArrayTemp = new Post[MAX_SIZE];
      for(int i=0;i<postArray.length ;i++){
          if(postArray[i] instanceof PhotoPost){
              postArrayTemp[0] = postArray[i];
           }
       }
       newsfeed1.setPostArray(postArrayTemp);
       return newsfeed1 ;


  }

  public NewsFeed plus(NewsFeed other){

       NewsFeed newsfeed1 = new NewsFeed();
       Post [] postArrayTemp = new Post[MAX_SIZE];
       for(int i=0;i<other.getPostArray().length ;i++){
           this.addPostMessage(other.getPostArray()[i]) ;
       }
       this.sort();
       return newsfeed;
   }
  
   public Post[] getPostArray() {
       return postArray;
   }
   public void setPostArray(Post[] postArray) {
       this.postArray = postArray;
   }
   public int getCount() {
       return count;
   }
   public void setCount(int count) {
       this.count = count;
   }
   public static int getMaxSize() {
       return MAX_SIZE;

  }

}
