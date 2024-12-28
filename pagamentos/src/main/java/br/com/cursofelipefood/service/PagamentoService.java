package br.com.cursofelipefood.service;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.cursofelipefood.repository.PagamentosRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PagamentoService {

	private final PagamentosRepository repository;

	private final ModelMapper modelMapper;
}
