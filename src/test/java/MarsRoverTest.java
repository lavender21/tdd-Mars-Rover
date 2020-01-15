/*
tasks
1.初始化位置，不做任何移动，获取当前位置
    Position(1,1,N) -> "(1,1) N"
2.输入指令前进M,获取结束位置
    Position(1,1,N)，"M" -> (1,2) N
3.输入指令左转L，获取结束位置W
    Position(1,1,N)，"L" -> (1,1) W
4.输入指令右转转R，获取结束位置E
    Position(1,1,N)，"R" -> (1,1) E
5.输入指令前进,左转，获取结束位置
    Position(1,1,N)，"M L" -> (1,2) W
6.输入指令前进,右转，获取结束位置
    Position(1,1,N)，"M R" -> (1,2) E
7.输入指令前进，左转，右转，获取结束位置
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
}
