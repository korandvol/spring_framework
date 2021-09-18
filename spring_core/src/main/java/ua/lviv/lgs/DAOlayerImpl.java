package ua.lviv.lgs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class DAOlayerImpl implements DAOlayer {
	
	@Autowired
	private DAOlayer daoLayer;

	@Override
	public List<Student> getAll() {

		return daoLayer.getAll();
	}

}
