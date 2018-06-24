package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Bill;
import ua.org.tours.model.Flight;
import ua.org.tours.service.api.Service;

import java.util.List;

public class BillServiceImpl implements Service<Integer, Bill> {

    private static BillServiceImpl service;
    private DAO<Integer, Bill> billDAO;
    private BeanMapper beanMapper;

    private BillServiceImpl() {
        billDAO = DAOFactory.getInstance().getBillDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized BillServiceImpl getInstance() {
        if (service == null) {
            service = new BillServiceImpl();
        }
        return service;
    }

    @Override
    public List<Bill> getAll() {
        List<Bill> bills = billDAO.getAll();
        List<Bill> bills1 = beanMapper.listMapToList(bills, Bill.class);
        return bills1;
    }

    @Override
    public Bill getById(Integer id) {
        Bill bill = billDAO.getById(id);
        Bill bill1 = beanMapper.singleMapper(bill, Bill.class);
        return bill1;
    }

    @Override
    public void save(Bill bill) {
        bill = beanMapper.singleMapper(bill, Bill.class);
        billDAO.save(bill);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Bill bill) {
        bill = beanMapper.singleMapper(bill, Bill.class);
        billDAO.save(bill);
    }
}
