package fightproject.fight;

import fightproject.unit.Unit;

/**
 * @author Alexey Dvoryaninov
 * @mail lexxzone@gmail.com
 * created: 2019-02-23
 *
 * Класс описывает объект УДАР.
 *
 * === Описание переменных ===
 *
 * countTurn        - номер хода,
 * owner            - юнит, которому принадлежит удар,
 * target           - куда наносится удар,
 * chanceToCritical - шанс нанести критический урон (0 - невозможно, 100 - обязательно будет нанесен),
 * criticalDamage   - величина критического удара,
 * missHitChance    - шанс промахнуться при ударе (удар будет: 0 - без промаха, 100 - без попаданий по цели),
 * powerVariety     - случайное отклонение (в уменьшение) по силе удара, например если скользящий, в поцентах,
 * chanceToStun     - шанс оглушить противника. Противник пропускает ход. Зависит от др.крит.параметров,
 * isBlocked        - может ли юнит наносить удары,
 *
 *
 */
public class Hit {
    private int countTurn;
    private Unit owner;
    private Target target;
    private int chanceToCritical;
    private int criticalDamage;
    private int missHitChance;
    private int powerVariety;
    private int chanceToStun;
    private boolean isBlocked;


    /**
     * Рассчитывает возможность и параметры наносимого удара.
     */
    private void setHit() {

    }







}
