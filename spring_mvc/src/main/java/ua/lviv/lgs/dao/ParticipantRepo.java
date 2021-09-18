package ua.lviv.lgs.dao;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import ua.lviv.lgs.domain.Participant;

@Repository
public class ParticipantRepo {

	private List<Participant> participants = new ArrayList<>();
	
	@PostConstruct
	public void init() {
		Participant participant1 = new Participant();
		participant1.setId(1);
		participant1.setName("Petro");;
		participant1.setEmail("petro@gmail.com");
		participant1.setLevel("l1");
		participant1.setPrimarySkill("smart");

		Participant participant2 = new Participant();
		participant2.setId(2);
		participant2.setName("Andrii");;
		participant2.setEmail("andrii@gmail.com");
		participant2.setLevel("l2");
		participant2.setPrimarySkill("tall");
		
		Participant participant3 = new Participant();
		participant3.setId(3);
		participant3.setName("Sergii");;
		participant3.setEmail("sergii@gmail.com");
		participant3.setLevel("l3");
		participant3.setPrimarySkill("handsome");
		
		Participant participant4 = new Participant();
		participant4.setId(4);
		participant4.setName("Ivan");;
		participant4.setEmail("ivan@gmail.com");
		participant4.setLevel("l4");
		participant4.setPrimarySkill("smartest");
		
		Participant participant5 = new Participant();
		participant5.setId(5);
		participant5.setName("Vitalii");;
		participant5.setEmail("vitalii@gmail.com");
		participant5.setLevel("l5");
		participant5.setPrimarySkill("cute");

		participants.add(participant1);
		participants.add(participant2);
		participants.add(participant3);
		participants.add(participant4);
		participants.add(participant5);
	}
		
		public List<Participant> findAllParticipants() {
			return participants;
		}
		
		public Participant findOne(int id) {
			return participants.stream().filter(participant -> participant.getId() == id).findFirst().orElse(null);
		}

		public void save(Participant participant) {
			Participant participantToUpdate = null;

			if (participant.getId() != null) {
				participantToUpdate = findOne(participant.getId());
				int participantIndex = participants.indexOf(participantToUpdate);
				participantToUpdate.setId(participant.getId());
				participantToUpdate.setName(participant.getName());
				participantToUpdate.setEmail(participant.getEmail());
				participantToUpdate.setLevel(participant.getLevel());
				participantToUpdate.setPrimarySkill(participant.getPrimarySkill());
				participants.set(participantIndex, participantToUpdate);
			} else {
				// save
				participant.setId(participants.size()+1);
				participants.add(participant);
			}
		}

		public void delete(int id) {
			Iterator<Participant> iter = participants.iterator();
			while (iter.hasNext()) {
				if (iter.next().getId() == id) {
					iter.remove();
				
			}
		}
	}
}
