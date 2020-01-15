/*
tasks
1.初始化位置，不做任何移动，获取当前位置
    Position(1,1,N) -> "(1,1) N"
2.输入空指令,获取结束位置
    Position(1,1,N)，"" -> (1,1) N
3.输入指令前进M,获取结束位置
    Position(1,1,N)，"M" -> (1,2) N
    Position(1,1,S)，"M" -> (1,0) S
    Position(1,1,E)，"M" -> (2,1) E
    Position(1,1,W)，"M" -> (0,1) W
4.输入指令左转L，获取结束位置W
    Position(1,1,N)，"L" -> (1,1) W
5.输入指令右转转R，获取结束位置E
    Position(1,1,N)，"R" -> (1,1) E
6.输入指令前进,左转，获取结束位置
    Position(1,1,N)，"M L" -> (1,2) W
7.输入指令前进,右转，获取结束位置
    Position(1,1,N)，"M R" -> (1,2) E
8.输入指令前进，左转，右转，获取结束位置
    Position(1,1,N)，"M R M L" -> (2,2) N
 */

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class MarsRoverTest {

    @Test
    public void return_init_position_when_not_move() {
        Position initPosition = new Position(1,1,"N");
        MarsRover marsRover = new MarsRover(initPosition);

        assertThat(marsRover.printPosition()).isEqualTo("(1,1) N");
    }

    @Test
    public void return_init_position_when_move_order_is_empty() {
        Position initPosition = new Position(1,1,"N");
        assertMarsRoverPosition("(1,1) N", "", initPosition);
    }

    @Test
    public void return_final_position_when_move_forward_to_North() {
        Position initPosition = new Position(1,1,"N");
        assertMarsRoverPosition("(1,2) N", "M", initPosition);
    }

    @Test
    public void return_final_position_when_move_forward_to_South() {
        Position initPosition = new Position(1,1,"S");
        assertMarsRoverPosition("(1,0) S", "M", initPosition);
    }

    private void assertMarsRoverPosition(String expect,String order, Position initPosition) {
        MarsRover marsRover = new MarsRover(initPosition);
        marsRover.sendOrder(order);

        assertThat(marsRover.printPosition()).isEqualTo(expect);
    }

}
