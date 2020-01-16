package com.thoughtworks;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MarsRoverProcessorTest {
    /*
        1.初始化位置，不做任何移动，获取当前位置
            Position(1,1,N) -> "(1,1) N"
     */
    @Test
    public void return_init_position_when_not_move() {
        Coord coord = new Coord(1,1);
        Rover rover = new Rover(coord, "N");
        MarsRoverProcessor marsRoverProcessor = new MarsRoverProcessor(rover);

        assertThat(marsRoverProcessor.printLocation()).isEqualTo("(1,1) N");
    }

    /*
        2.输入空指令,获取结束位置
        Position(1,1,N)，"" -> (1,1) N
     */
    @Test
    public void return_init_position_when_move_order_is_empty() {
        assertMarsRoverPosition("(1,1) N", "", "N");
    }

    /*
        3.输入指令前进M,获取结束位置
        Position(1,1,N)，"M" -> (1,2) N
        Position(1,1,S)，"M" -> (1,0) S
        Position(1,1,E)，"M" -> (2,1) E
        Position(1,1,W)，"M" -> (0,1) W
     */
    @Test
    public void return_final_position_when_move_forward_to_North() {
        assertMarsRoverPosition("(1,2) N", "M", "N");
    }

    @Test
    public void return_final_position_when_move_forward_to_South() {
        assertMarsRoverPosition("(1,0) S", "M", "S");
    }

    @Test
    public void return_final_position_when_move_forward_to_East() {
        assertMarsRoverPosition("(2,1) E", "M", "E");
    }

    @Test
    public void return_final_position_when_move_forward_to_West() {
        assertMarsRoverPosition("(0,1) W", "M", "W");
    }

    /*
        4.输入指令左转L，获取结束位置W
        Position(1,1,N)，"L" -> (1,1) W
        Position(1,1,S)，"L" -> (1,1) E
        Position(1,1,E)，"L" -> (1,1) N
        Position(1,1,W)，"L" -> (1,1) S
     */
    @Test
    public void return_final_position_when_move_left_from_North() {
        assertMarsRoverPosition("(1,1) W", "L", "N");
    }

    @Test
    public void return_final_position_when_move_left_from_South() {
        assertMarsRoverPosition("(1,1) E", "L", "S");
    }

    @Test
    public void return_final_position_when_move_left_from_East() {
        assertMarsRoverPosition("(1,1) N", "L", "E");
    }

    @Test
    public void return_final_position_when_move_left_from_West() {
        assertMarsRoverPosition("(1,1) S", "L", "W");
    }

    /*
        5.输入指令右转转R，获取结束位置E
        Position(1,1,N)，"R" -> (1,1) E
        Position(1,1,S)，"R" -> (1,1) W
        Position(1,1,E)，"R" -> (1,1) S
        Position(1,1,W)，"R" -> (1,1) N
     */
    @Test
    public void return_final_position_when_move_right_from_North() {
        assertMarsRoverPosition("(1,1) E", "R", "N");
    }

    @Test
    public void return_final_position_when_move_right_from_South() {
        assertMarsRoverPosition("(1,1) W", "R", "S");
    }

    @Test
    public void return_final_position_when_move_right_from_East() {
        assertMarsRoverPosition("(1,1) S", "R", "E");
    }

    @Test
    public void return_final_position_when_move_right_from_West() {
        assertMarsRoverPosition("(1,1) N", "R", "W");
    }

    /*
        6.输入指令前进，左转，右转，获取结束位置
        Position(1,1,N)，"M R M L" -> (2,2) N
     */
    @Test
    public void return_final_position_when_send_multiple_command() {
        assertMarsRoverPosition("(2,2) N", "M R M L", "N");
    }

    private void assertMarsRoverPosition(String expect,String command, String direction) {
        Coord coord = new Coord(1,1);
        Rover rover = new Rover(coord, direction);
        MarsRoverProcessor marsRoverProcessor = new MarsRoverProcessor(rover);
        marsRoverProcessor.sendCommand(command);

        assertThat(marsRoverProcessor.printLocation()).isEqualTo(expect);
    }

}
