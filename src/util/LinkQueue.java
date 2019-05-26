package util;

public class LinkQueue<E> {
    // ��ջ�Ľڵ�
    public class ListNode<E> {
        E e;
        ListNode<E> next;

        public ListNode() {
        }

        public ListNode(E e, ListNode next) {
            this.e = e;
            this.next = next;
        }

		public E getE() {
			return e;
		}

		public void setE(E e) {
			this.e = e;
		}

		public ListNode<E> getNext() {
			return next;
		}

		public void setNext(ListNode<E> next) {
			this.next = next;
		}
        
        
    }
    
    private ListNode front;// ����ͷ������ɾ��  
    private ListNode rear;// ����β���������  
    private int size; //���е�ǰ���� 
    
    public LinkQueue() {
        front = null;
        rear = null;
    }
    
    //�п�
      public boolean empty(){
          return size==0;
      }
      
      //����
      public boolean add(E e){
          if(empty()){    //�������Ϊ��
              front = new ListNode(e,null);//ֻ��һ���ڵ㣬front��rear��ָ��ýڵ�
              rear = front;
          }else{
        	  ListNode<E> newNode = new ListNode<E>(e, null);
              rear.next = newNode; //��β�ڵ��nextָ�������Ľڵ�
              rear = newNode; //���½ڵ���Ϊ�µ�β�ڵ�
          }
          size ++;
          return true;
      }
      
      //���ض���Ԫ�أ�����ɾ��
      public ListNode<E> peek(){
          if(empty()){
              throw new RuntimeException("�ն����쳣��");
          }else{
              return front;
          }
      }
      
      //����
      public ListNode<E> poll(){
          if(empty()){
              throw new RuntimeException("�ն����쳣��");
          }else{
        	  ListNode<E> value = front; //�õ�����ͷԪ��
              front = front.next;//��front����ָ��ԭ����ͷԪ�ص���һ��Ԫ��
              value.next = null; //�ͷ�ԭ����ͷԪ�ص�next����
              size --;
              return value;
          }        
      }
      
      //���г���
      public int length(){
          return size;
      }

	public ListNode getFront() {
		return front;
	}

	public void setFront(ListNode front) {
		this.front = front;
	}

	public ListNode getRear() {
		return rear;
	}

	public void setRear(ListNode rear) {
		this.rear = rear;
	}


	
      
}
