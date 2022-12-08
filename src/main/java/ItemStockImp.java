public class ItemStockImp implements ItemStock {

  ItemStockImp() {
    item_Map.clear();
  }

  @Override
  public void add(String item, int num) {
    // TODO Auto-generated method stub
    item_Map.put(item, num);
  }

  @Override
  public int size(String item) {
    // TODO Auto-generated method stub
    return item_Map.size() > 0 ? item_Map.size() : 0;
  }

  @Override
  public boolean contain(String item) {
    // TODO Auto-generated method stub
    return item_Map.size() > 0 ? true : false;
  }

}
