package vtb.geekbrains.market.command;

public class ModifyProductCommand implements Command {
    @Override
    public void exec(String params) {
//        if (params.length() != 0) {
//            if (!MarketApp.factory.getCurrentSession().getTransaction().getStatus().equals(TransactionStatus.ACTIVE)) {
//                MarketApp.factory.getCurrentSession().beginTransaction();
//            }
//            String[] parameters = params.split(",");
//            if (parameters.length == 2) {
//                Map<String, Object> properties = new HashMap<>();
//                properties.put("javax.persistence.lock.timeout", 0L);
//
//                try {
//                    Product product = MarketApp.factory.getCurrentSession().find(
//                            Product.class,
//                            Integer.valueOf(parameters[0]),
//                            LockModeType.PESSIMISTIC_READ, properties);
//
//                    if (product == null) {
//                        System.out.println("продукт не найден");
//                    } else {
//                        product.setPrice(new BigDecimal(parameters[1]));
//                    }
//                    System.out.println("продукт изменен: " + product.toString());
//                }
//                catch (LockTimeoutException ex) {
//                    System.out.println("продукт продукт заблоирован, попытайтесь выполнить операцию позже");
//                }
//            } else {
//                System.out.println("параметр указаны не корректно");
//            }
//        } else {
//            System.out.println("параметр указаны не корректно");
//        }
    }
}