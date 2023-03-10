import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Owner("ewstafiew")
@Feature("Маршруты")

public class RoutesTest {

    @Test
    @Story("Модалка создания/редактирования маршрута (верстка)")
    @DisplayName("Поиск по названию города/ПВЗ")
    public void SearchRoutesModal() {

        step("Поиск осуществляется как по городам, так и по ПВЗ", () -> {
        });

        step("При нажатии на город в правой части блока " +
                "появляется список ПВЗ этого города", () -> {
        });

    }

    @Test
    @Story("Модалка создания/редактирования маршрута (верстка)")
    @DisplayName("Проверка отображения чекбоксов в модалке создания/редактирования маршрута")
    public void CheckingCheckboxesRouteWindow() {

        step("Чек-бокс невыбранного города белый и активный", () -> {
        });

        step("Чек-бокс города, ПВЗ которого выбраны частично, " +
                "красный с белой горизонтальной полоской", () -> {
        });

        step("При нажатии на чек-бокс с белой полоской происходит 'довыбор'" +
                " всех не выбранных ПВЗ со всеми типами доставки", () -> {
        });

        step("При нажатии на чек-бокс с белой галочкой происходит " +
                "отмена выбора всех ПВЗ со всеми типами доставки.", () -> {
        });

        step("При нажатии на полностью белый чек-бокс происходит" +
                " выбор всех ПВЗ города со всеми типами доставки.", () -> {
        });

        step("При нажатии на неактивный чек-бокс города " +
                "или ПВЗ ничего не происходит.", () -> {
        });

        step("В блоке с ПВЗ для уже привязанных к маршрутам ПВЗ в чек-боксах" +
                "выводятся цифры - номера маршрутов, к которым они привязаны", () -> {
        });

    }

    @Test
    @Story("Модалка создания/редактирования маршрута (верстка)")
    @DisplayName("Проверка взаиможействия с элементами модалки создания/редактирования маршрута")
    public void InteractionModalElements() {

        step("При нажатии на знак вопроса в блоке с ПВЗ" +
                " появляется текстовая подсказка", () -> {
        });

        step("При нажатии на область вне модалки или на крестик" +
                " появляется предупреждение о том, что изменения не будут сохранены.", () -> {
        });

        step("Если в модалке нажать 'да', при закрытии, изменения не сохранятся", () -> {
        });

        step("Если в модалке нажать 'нет', при закрытии, модалка останется открытой", () -> {
        });

        step("Кнопка 'Сохранить' сохраняет все примененные изменения", () -> {
        });

    }


}
