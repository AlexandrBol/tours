package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.Transfer;
import ua.org.tours.service.api.Service;

import java.util.List;

public class TransferServiceImpl implements Service<Integer, Transfer> {

    private static TransferServiceImpl service;
    private DAO<Integer, Transfer> transferDAO;
    private BeanMapper beanMapper;

    private TransferServiceImpl() {
        transferDAO = DAOFactory.getInstance().getTransferDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized TransferServiceImpl getInstance() {
        if (service == null) {
            service = new TransferServiceImpl();
        }
        return service;
    }

    @Override
    public List<Transfer> getAll() {
        List<Transfer> transfers = transferDAO.getAll();
        List<Transfer> transferDTOs = beanMapper.listMapToList(transfers, Transfer.class);
        return transferDTOs;
    }

    @Override
    public Transfer getById(Integer id) {
        Transfer transfer = transferDAO.getById(id);
        Transfer transfer1 = beanMapper.singleMapper(transfer, Transfer.class);
        return transfer1;
    }

    @Override
    public void save(Transfer transfer) {
        transfer = beanMapper.singleMapper(transfer, Transfer.class);
        transferDAO.save(transfer);
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(Transfer transfer) {
        transfer = beanMapper.singleMapper(transfer, Transfer.class);
        transferDAO.save(transfer);
    }
}
