package org.hbrs.se1.ws21.uebung2;

public class MemberItem implements Member{

    Integer id;
        public MemberItem(Integer id){
            this.id = id;
        }

        @Override
        public Integer getID() {
            return this.id;
        }

        public void setID(Integer id){
        this.id = id;
        }

        @Override
        public String toString(){
            return "Member ID " + this.id;
        }
}
