package org.hw4;

import java.util.Arrays;

public class Box {
    private String color;
    private int size;
    private boolean isopen;
    private String[] box;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
        this.isopen = false;
        this.box = new String[size];
        Arrays.fill(this.box,"");
        System.out.println("Коробка "+color+" цвета на "+size+" предметов готова.");
    }

    public void getInfo(){
        System.out.println("Коробка "+color+" цвета, свободное место на "+size+" предметов. Открыта: "+isopen);
        System.out.print("В коробке находятся: ");
        for(int i = 0; i<=box.length-size;i++){
            if(box[i] != ""){
                System.out.print(box[i]+" ");
            }
        }
    }

    public void open(boolean isopen){
        this.isopen = isopen;
    }

    public void put(String item){
        if(isopen & box.length >= size){
            for(int i = 0; i<=box.length-size;i++){
                if(box[i] == ""){
                    box[i] = item;
                    size -= 1;
                    System.out.println("В коробку положили "+item+" - свободное место "+size);
                    break;
                }
            }
        }
    }
    public void get(String item){
        if(isopen){
            for(int i = 0; i<=box.length-size;i++){
                if(box[i] == item){
                    box[i] = "";
                    size += 1;
                    System.out.println("Из коробки достали - "+item+" размер "+size);
                    break;
                }
            }
        }
    }
}
