package com.codenjoy.dojo.games.tetris;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2012 - 2022 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.client.AbstractJsonSolver;
import com.codenjoy.dojo.services.Dice;
import com.codenjoy.dojo.services.printer.CharElement;

import java.util.List;

import static com.codenjoy.dojo.services.Direction.ACT;

/**
 * Author: your name
 *
 * This is your AI algorithm for the game.
 * Implement it at your own discretion.
 * Pay attention to {@link YourSolverTest} - there is
 * a test framework for you.
 */
public class YourSolver extends AbstractJsonSolver<Board> {

    private Dice dice;
    static int count=0;

    public YourSolver(Dice dice) {
        this.dice = dice;
    }

    @Override
    public String getAnswer(Board board) {

        // TODO your code here
        List<Element> result= board.getFutureFigures();
        var pt=board.getCurrentFigurePoint();
        var x=board.getCurrentFigureType();
        board.getGlass().getFreeSpace();
//        if(x.ch()=='O' && count%2==0){
//            count++;
//            return "LEFT";
//        }
//       else if(x.ch()=='O' && count%2!=0){
//           count++;
//            return "RIGHT";
//        }
        for(Element element:result){
//            if(count<17){
//                count++;
//                return "DOWN";
//            }
        if(count%2==0){
            count+=1;
            return "LEFT";
        }
         if(count%2!=0){
            count++;
            return "RIGHT";
        }
//         if(count%5==0){
//             count++;
//             return "DOWN";
//         }
//        if(element.ch()=='O'){
//            return ACT(0,0);
//        }
//        else{
//            count++;
//            return ACT(3);
//        }
//        else if (count%3==0) {
//            return ACT(2);
//        }
//        else if(count==2){
//            count++;
//            return "RIGHT";
//        }
//        else{
//            return  "LEFT"  ;
//        }
        }
        return "RIGHT";
    }
}