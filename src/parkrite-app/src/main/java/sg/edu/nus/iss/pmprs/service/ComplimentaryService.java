package sg.edu.nus.iss.pmprs.service;

import java.util.List;

import sg.edu.nus.iss.pmprs.vo.ticket.ComplimentaryVo;;

public interface ComplimentaryService {

		public ComplimentaryVo createComplimentary(ComplimentaryVo vo);

		public List<ComplimentaryVo> getAllComplimentaries();

}
