package com.game.flag.service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.game.flag.dao.CountryDao;
import com.game.flag.models.Country;

@Service
public class CountryService {
    static  final int[] numbers = {
        4, 8, 12, 20, 24, 28, 31, 32, 36, 40,
        44, 48, 50, 51, 52, 56, 64, 68, 70, 72,
        76, 84, 90, 96, 100, 104, 108, 112, 116, 120,
        124, 132, 140, 144, 148, 152, 156, 170, 174, 178,
        180, 188, 191, 192, 196, 203, 204, 208, 212, 214,
        218, 222, 226, 231, 232, 233, 242, 246, 250, 262,
        266, 268, 270, 276, 288, 296, 300, 308, 320, 324,
        328, 332, 340, 348, 352, 356, 360, 364, 368, 372,
        376, 380, 384, 388, 392, 398, 400, 404, 408, 410,
        414, 417, 418, 422, 426, 428, 430, 434, 438, 440,
        442, 450, 454, 458, 462, 466, 470, 478, 480, 484,
        492, 496, 498, 499, 504, 508, 512, 516, 520, 524,
        528, 548, 554, 558, 562, 566, 578, 583, 584, 585,
        586, 591, 598, 600, 604, 608, 616, 620, 624, 626,
        634, 642, 643, 646, 659, 662, 670, 674, 678, 682,
        686, 688, 690, 694, 702, 703, 704, 705, 706, 710,
        716, 724, 728, 729, 740, 748, 752, 756, 760, 762,
        764, 768, 776, 780, 784, 788, 792, 795, 798, 800,
        804, 807, 818, 826, 834, 840, 854, 858, 860, 862,
        882, 887, 894
    };

    private CountryDao contryDao;

    public CountryService(CountryDao contryDao){
        this.contryDao = contryDao ;
    }

    


    public static int[] GeneratedValue(int valeur) {
        Random rand = new Random();
        int[] indices = new int[4];
        int count = 0;

        
        for (int i = 0; i < 3; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(numbers.length); 
            } while (randomNumber == valeur); 
            indices[i] = randomNumber;
        }

        
        indices[3] = valeur;

        return indices;
    }

    public  void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            
            int index = rand.nextInt(i + 1);
            
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
    }

    public Country findByid(Integer id){
        Optional<Country> optionalContry = contryDao.findById(id);
        return optionalContry.orElse(null); 
    }


    public java.util.List<Country> ResponseContry(Integer val){
        java.util.List<Country> myList = new ArrayList<>();
        int[] indices = GeneratedValue(val);
        shuffleArray(indices);

        for(int i=0 ; i<=indices.length - 1 ; i++){
            myList.add(findByid(numbers[indices[i]]));

        }

        System.out.println(val);
        

        return myList;
        

    }


}
