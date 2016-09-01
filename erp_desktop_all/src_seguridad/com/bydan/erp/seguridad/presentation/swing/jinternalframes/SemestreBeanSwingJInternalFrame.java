/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.seguridad.util.SemestreConstantesFunciones;
import com.bydan.erp.seguridad.util.SemestreParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SemestreParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SemestreBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.seguridad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.business.logic.*;

import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SemestreBeanSwingJInternalFrame extends SemestreJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SemestreBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Semestre> semestreValidator = new ClassValidator<Semestre>(Semestre.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Semestre semestre;	
	public Semestre semestreAux;
	public Semestre semestreAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Semestre semestreTotales;
	public Long idSemestreActual;
	public Long iIdNuevoSemestre=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoSemestre;
	public Boolean isPermisoNuevoSemestre;
	public Boolean isPermisoActualizarSemestre;
	public Boolean isPermisoActualizarOriginalSemestre;
	public Boolean isPermisoEliminarSemestre;
	public Boolean isPermisoGuardarCambiosSemestre;
	public Boolean isPermisoConsultaSemestre;
	public Boolean isPermisoBusquedaSemestre;
	public Boolean isPermisoReporteSemestre;
	public Boolean isPermisoPaginacionMedioSemestre;
	public Boolean isPermisoPaginacionAltoSemestre;
	public Boolean isPermisoPaginacionTodoSemestre;
	public Boolean isPermisoCopiarSemestre;
	public Boolean isPermisoVerFormSemestre;
	public Boolean isPermisoDuplicarSemestre;
	public Boolean isPermisoOrdenSemestre;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public SemestreParameterReturnGeneral semestreReturnGeneral;
	public SemestreParameterReturnGeneral semestreParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSemestre=false;
	public Boolean esParaAccionDesdeFormularioSemestre=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public SemestreLogic semestreLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Semestre semestreBean;
	public SemestreConstantesFunciones semestreConstantesFunciones;
	//public SemestreParameterReturnGeneral semestreReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Semestre> semestres;	
	//public List<Semestre> semestresEliminados;
	//public List<Semestre> semestresAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSemestre=false;
	public Boolean isVisibilidadCeldaDuplicarSemestre=true;
	public Boolean isVisibilidadCeldaCopiarSemestre=true;
	public Boolean isVisibilidadCeldaVerFormSemestre=true;
	public Boolean isVisibilidadCeldaOrdenSemestre=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSemestre=false;
	public Boolean isVisibilidadCeldaModificarSemestre=false;
	public Boolean isVisibilidadCeldaActualizarSemestre=false;
	public Boolean isVisibilidadCeldaEliminarSemestre=false;
	public Boolean isVisibilidadCeldaCancelarSemestre=false;
	public Boolean isVisibilidadCeldaGuardarSemestre=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSemestre=false;	
	
	
	
	public Long getiIdNuevoSemestre() {
		return this.iIdNuevoSemestre;
	}

	public void setiIdNuevoSemestre(Long iIdNuevoSemestre) {
		this.iIdNuevoSemestre = iIdNuevoSemestre;
	}
	
	public Long getidSemestreActual() {
		return this.idSemestreActual;
	}

	public void setidSemestreActual(Long idSemestreActual) {
		this.idSemestreActual = idSemestreActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Semestre getsemestre() {
		return this.semestre;
	}

	public void setsemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	
	public Semestre getsemestreAux() {
		return this.semestreAux;
	}

	public void setsemestreAux(Semestre semestreAux) {
		this.semestreAux = semestreAux;
	}				
	
	public Semestre getsemestreAnterior() {
		return this.semestreAnterior;
	}

	public void setsemestreAnterior(Semestre semestreAnterior) {
		this.semestreAnterior = semestreAnterior;
	}	
	
	public Semestre getsemestreTotales() {
		return this.semestreTotales;
	}

	public void setsemestreTotales(Semestre semestreTotales) {
		this.semestreTotales = semestreTotales;
	}	
	
	public Semestre getsemestreBean() {
		return this.semestreBean;
	}

	public void setsemestreBean(Semestre semestreBean) {
		this.semestreBean = semestreBean;
	}	
	
	public SemestreParameterReturnGeneral getsemestreReturnGeneral() {
		return this.semestreReturnGeneral;
	}

	public void setsemestreReturnGeneral(SemestreParameterReturnGeneral semestreReturnGeneral) {
		this.semestreReturnGeneral = semestreReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SemestreLogic getSemestreLogic()	{		
		return semestreLogic;
	}

	public void setSemestreLogic(SemestreLogic semestreLogic) {
		this.semestreLogic = semestreLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoSemestre() {
		return isEsNuevoSemestre;
	}

	public void setIsEsNuevoSemestre(Boolean isEsNuevoSemestre) {
		this.isEsNuevoSemestre = isEsNuevoSemestre;
	}

	public Boolean getEsParaAccionDesdeFormularioSemestre() {
		return esParaAccionDesdeFormularioSemestre;
	}
	
	public void setEsParaAccionDesdeFormularioSemestre(Boolean esParaAccionDesdeFormularioSemestre) {
		this.esParaAccionDesdeFormularioSemestre = esParaAccionDesdeFormularioSemestre;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesSemestre() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SemestreConstantesFunciones.refrescarForeignKeysDescripcionesSemestre(this.semestreLogic.getSemestres());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SemestreConstantesFunciones.refrescarForeignKeysDescripcionesSemestre(this.semestres);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//semestreLogic.setSemestres(this.semestres);
			semestreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public SemestreParameterReturnGeneral getSemestreParameterGeneral() {
		return this.semestreParameterGeneral;
	}
	
	public void setSemestreParameterGeneral(SemestreParameterReturnGeneral semestreParameterGeneral) {
		this.semestreParameterGeneral = semestreParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoSemestre() {
		return isPermisoTodoSemestre;
	}

	public void setIsPermisoTodoSemestre(Boolean isPermisoTodoSemestre) {
		this.isPermisoTodoSemestre = isPermisoTodoSemestre;
	}

	public Boolean getIsPermisoNuevoSemestre() {
		return isPermisoNuevoSemestre;
	}

	public void setIsPermisoNuevoSemestre(Boolean isPermisoNuevoSemestre) {
		this.isPermisoNuevoSemestre = isPermisoNuevoSemestre;
	}

	public Boolean getIsPermisoActualizarSemestre() {
		return isPermisoActualizarSemestre;
	}

	public void setIsPermisoActualizarSemestre(Boolean isPermisoActualizarSemestre) {
		this.isPermisoActualizarSemestre = isPermisoActualizarSemestre;
	}

	public Boolean getIsPermisoEliminarSemestre() {
		return isPermisoEliminarSemestre;
	}

	public void setIsPermisoEliminarSemestre(Boolean isPermisoEliminarSemestre) {
		this.isPermisoEliminarSemestre = isPermisoEliminarSemestre;
	}

	public Boolean getIsPermisoGuardarCambiosSemestre() {
		return isPermisoGuardarCambiosSemestre;
	}

	public void setIsPermisoGuardarCambiosSemestre(Boolean isPermisoGuardarCambiosSemestre) {
		this.isPermisoGuardarCambiosSemestre = isPermisoGuardarCambiosSemestre;
	}
	
	public Boolean getIsPermisoConsultaSemestre() {
		return isPermisoConsultaSemestre;
	}

	public void setIsPermisoConsultaSemestre(Boolean isPermisoConsultaSemestre) {
		this.isPermisoConsultaSemestre = isPermisoConsultaSemestre;
	}

	public Boolean getIsPermisoBusquedaSemestre() {
		return isPermisoBusquedaSemestre;
	}

	public void setIsPermisoBusquedaSemestre(Boolean isPermisoBusquedaSemestre) {
		this.isPermisoBusquedaSemestre = isPermisoBusquedaSemestre;
	}

	public Boolean getIsPermisoReporteSemestre() {
		return isPermisoReporteSemestre;
	}

	public void setIsPermisoReporteSemestre(Boolean isPermisoReporteSemestre) {
		this.isPermisoReporteSemestre = isPermisoReporteSemestre;
	}
	
	public Boolean getIsPermisoPaginacionMedioSemestre() {
		return isPermisoPaginacionMedioSemestre;
	}

	public void setIsPermisoPaginacionMedioSemestre(Boolean isPermisoPaginacionMedioSemestre) {
		this.isPermisoPaginacionMedioSemestre = isPermisoPaginacionMedioSemestre;
	}
	
	public Boolean getIsPermisoPaginacionTodoSemestre() {
		return isPermisoPaginacionTodoSemestre;
	}

	public void setIsPermisoPaginacionTodoSemestre(Boolean isPermisoPaginacionTodoSemestre) {
		this.isPermisoPaginacionTodoSemestre = isPermisoPaginacionTodoSemestre;
	}
	
	public Boolean getIsPermisoPaginacionAltoSemestre() {
		return isPermisoPaginacionAltoSemestre;
	}

	public void setIsPermisoPaginacionAltoSemestre(Boolean isPermisoPaginacionAltoSemestre) {
		this.isPermisoPaginacionAltoSemestre = isPermisoPaginacionAltoSemestre;
	}
	
	public Boolean getIsPermisoCopiarSemestre() {
		return isPermisoCopiarSemestre;
	}

	public void setIsPermisoCopiarSemestre(Boolean isPermisoCopiarSemestre) {
		this.isPermisoCopiarSemestre = isPermisoCopiarSemestre;
	}
	
	public Boolean getIsPermisoVerFormSemestre() {
		return isPermisoVerFormSemestre;
	}

	public void setIsPermisoVerFormSemestre(Boolean isPermisoVerFormSemestre) {
		this.isPermisoVerFormSemestre = isPermisoVerFormSemestre;
	}
	
	public Boolean getIsPermisoDuplicarSemestre() {
		return isPermisoDuplicarSemestre;
	}

	public void setIsPermisoDuplicarSemestre(Boolean isPermisoDuplicarSemestre) {
		this.isPermisoDuplicarSemestre = isPermisoDuplicarSemestre;
	}
	
	public Boolean getIsPermisoOrdenSemestre() {
		return isPermisoOrdenSemestre;
	}

	public void setIsPermisoOrdenSemestre(Boolean isPermisoOrdenSemestre) {
		this.isPermisoOrdenSemestre = isPermisoOrdenSemestre;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoSemestre() {
		return isVisibilidadCeldaNuevoSemestre;
	}

	public void setIsVisibilidadCeldaNuevoSemestre(Boolean isVisibilidadCeldaNuevoSemestre) {
		this.isVisibilidadCeldaNuevoSemestre = isVisibilidadCeldaNuevoSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSemestre() {
		return isVisibilidadCeldaDuplicarSemestre;
	}

	public void setIsVisibilidadCeldaDuplicarSemestre(Boolean isVisibilidadCeldaDuplicarSemestre) {
		this.isVisibilidadCeldaDuplicarSemestre = isVisibilidadCeldaDuplicarSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSemestre() {
		return isVisibilidadCeldaCopiarSemestre;
	}

	public void setIsVisibilidadCeldaCopiarSemestre(Boolean isVisibilidadCeldaCopiarSemestre) {
		this.isVisibilidadCeldaCopiarSemestre = isVisibilidadCeldaCopiarSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSemestre() {
		return isVisibilidadCeldaVerFormSemestre;
	}

	public void setIsVisibilidadCeldaVerFormSemestre(Boolean isVisibilidadCeldaVerFormSemestre) {
		this.isVisibilidadCeldaVerFormSemestre = isVisibilidadCeldaVerFormSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSemestre() {
		return isVisibilidadCeldaOrdenSemestre;
	}

	public void setIsVisibilidadCeldaOrdenSemestre(Boolean isVisibilidadCeldaOrdenSemestre) {
		this.isVisibilidadCeldaOrdenSemestre = isVisibilidadCeldaOrdenSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSemestre() {
		return isVisibilidadCeldaNuevoRelacionesSemestre;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSemestre(Boolean isVisibilidadCeldaNuevoRelacionesSemestre) {
		this.isVisibilidadCeldaNuevoRelacionesSemestre = isVisibilidadCeldaNuevoRelacionesSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSemestre() {
		return isVisibilidadCeldaModificarSemestre;
	}

	public void setIsVisibilidadCeldaModificarSemestre(Boolean isVisibilidadCeldaModificarSemestre) {
		this.isVisibilidadCeldaModificarSemestre = isVisibilidadCeldaModificarSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSemestre() {
		return isVisibilidadCeldaActualizarSemestre;
	}

	public void setIsVisibilidadCeldaActualizarSemestre(Boolean isVisibilidadCeldaActualizarSemestre) {
		this.isVisibilidadCeldaActualizarSemestre = isVisibilidadCeldaActualizarSemestre;
	}

	public Boolean getIsVisibilidadCeldaEliminarSemestre() {
		return isVisibilidadCeldaEliminarSemestre;
	}

	public void setIsVisibilidadCeldaEliminarSemestre(Boolean isVisibilidadCeldaEliminarSemestre) {
		this.isVisibilidadCeldaEliminarSemestre = isVisibilidadCeldaEliminarSemestre;
	}

	public Boolean getIsVisibilidadCeldaCancelarSemestre() {
		return isVisibilidadCeldaCancelarSemestre;
	}

	public void setIsVisibilidadCeldaCancelarSemestre(Boolean isVisibilidadCeldaCancelarSemestre) {
		this.isVisibilidadCeldaCancelarSemestre = isVisibilidadCeldaCancelarSemestre;
	}

	public Boolean getIsVisibilidadCeldaGuardarSemestre() {
		return isVisibilidadCeldaGuardarSemestre;
	}

	public void setIsVisibilidadCeldaGuardarSemestre(Boolean isVisibilidadCeldaGuardarSemestre) {
		this.isVisibilidadCeldaGuardarSemestre = isVisibilidadCeldaGuardarSemestre;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSemestre() {
		return isVisibilidadCeldaGuardarCambiosSemestre;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSemestre(Boolean isVisibilidadCeldaGuardarCambiosSemestre) {
		this.isVisibilidadCeldaGuardarCambiosSemestre = isVisibilidadCeldaGuardarCambiosSemestre;
	}
		
	public SemestreSessionBean getsemestreSessionBean() {
		return this.semestreSessionBean;
	}
	
	public void setsemestreSessionBean(SemestreSessionBean semestreSessionBean) {
		this.semestreSessionBean=semestreSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSemestre(Semestre semestre)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Semestre semestre,Semestre semestreAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSemestre(semestre);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		semestreAux.setId(semestre.getId());
		semestreAux.setVersionRow(semestre.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSemestre();
		
			int intSelectedRow = this.jTableDatosSemestre.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSemestre(this.semestre,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = semestreValidator.getInvalidValues(this.semestre);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			semestreLogic.setDatosCliente(datosCliente);
			semestreLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				semestreAux=new  Semestre();
				
				semestreAux.setIsNew(true);
				semestreAux.setIsChanged(true);
				
				semestreAux.setSemestreOriginal(this.semestre);
				
				semestreAux.setId(this.semestre.getId());	
				semestreAux.setVersionRow(this.semestre.getVersionRow());	
				semestreAux.setnombre(this.semestre.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.semestreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.semestreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(semestreAux,semestreLogic.getSemestres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(semestreAux,semestres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.semestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.semestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						semestreLogic.saveSemestres();//WithConnection
						//semestreLogic.getSetVersionRowSemestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.semestre,semestreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				semestreAux=new  Semestre();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.semestreSessionBean.getEsGuardarRelacionado() 
					|| (this.semestreSessionBean.getEsGuardarRelacionado() && this.semestre.getId()>=0)) {
						
					semestreAux.setIsNew(false);
				}
				
				semestreAux.setIsDeleted(false);
			
				semestreAux.setId(this.semestre.getId());	
				semestreAux.setVersionRow(this.semestre.getVersionRow());	
				semestreAux.setnombre(this.semestre.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(semestreAux,semestreLogic.getSemestres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(semestreAux,semestres);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.semestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.semestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						semestreLogic.saveSemestres();//WithConnection
						//semestreLogic.getSetVersionRowSemestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.semestre,semestreAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				semestreAux=new  Semestre();
				
				semestreAux.setIsNew(false);
				semestreAux.setIsChanged(false);
				
				semestreAux.setIsDeleted(true);
				
				semestreAux.setId(this.semestre.getId());	
				semestreAux.setVersionRow(this.semestre.getVersionRow());	
				semestreAux.setnombre(this.semestre.getnombre());	
				
				if(this.semestreSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.semestreAux.getId()>=0) {	
						this.semestresEliminados.add(semestreAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(semestreAux,semestreLogic.getSemestres());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(semestreAux,semestres);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.semestreSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.semestreSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						semestreLogic.saveSemestres();//WithConnection
						//semestreLogic.getSetVersionRowSemestres();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.getSemestres().addAll(this.semestresEliminados);
					
					semestreLogic.saveSemestres();//WithConnection
					//semestreLogic.getSetVersionRowSemestres();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.semestresEliminados= new ArrayList<Semestre>();		
			}
			
			if(this.semestreSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Semestre GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.semestre=semestreAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessSemestre();
      	}
		
	}	
	
	public void actualizarRelaciones(Semestre semestreLocal) throws Exception {
		
		if(this.semestreSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Semestre semestreLocal) throws Exception {	
		if(this.semestreSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarSemestreActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = semestreValidator.getInvalidValues(this.semestre);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Semestre semestre,List<Semestre> semestres) throws Exception {
		try	{		
			SemestreConstantesFunciones.actualizarLista(semestre,semestres,this.semestreSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Semestre semestre,List<Semestre> semestres) throws Exception {
		try	{			
			SemestreConstantesFunciones.actualizarSelectedLista(semestre,semestres);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Semestre> semestresLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				semestresLocal=this.semestreLogic.getSemestres();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				semestresLocal=this.semestres;
			}
			//ARCHITECTURE
		
			for(Semestre semestreLocal:semestresLocal) {
				if(this.permiteMantenimiento(semestreLocal) && semestreLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+SemestreConstantesFunciones.getSemestreLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SemestreConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSemestre.jLabelnombreSemestre,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSemestre.jLabelnombreSemestre,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoSemestre--;	
		
		
		this.semestreAux=new Semestre();
		
		this.semestreAux.setId(this.iIdNuevoSemestre);
		this.semestreAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.semestreLogic.getSemestres().add(this.semestreAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.semestres.add(this.semestreAux);
		}
		//ARCHITECTURE
		
		this.semestre=this.semestreAux;
		
		if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSemestre(this.semestre);
			this.setVariablesObjetoActualToFormularioForeignKeySemestre(this.semestre);
		}
				
		//this.setDefaultControlesSemestre();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySemestre();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySemestre();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySemestre();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSemestre(this.semestreBean,this.semestre,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SemestreConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.semestreSessionBean.getConGuardarRelaciones()) {
			classes=SemestreConstantesFunciones.getClassesRelationshipsOfSemestre(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.semestreReturnGeneral=semestreLogic.procesarEventosSemestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.semestreLogic.getSemestres(),this.semestre,this.semestreParameterGeneral,this.isEsNuevoSemestre,classes);//this.semestreLogic.getSemestre()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSemestre(this.semestreReturnGeneral,this.semestreBean,false);
		
		if(this.semestreReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySemestre(this.semestreReturnGeneral.getSemestre());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSemestre(this.semestreReturnGeneral.getSemestre());
		}
		
		if(this.semestreReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSemestre(this.semestreReturnGeneral.getSemestre(),classes);//this.semestreBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSemestre(this.semestre,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySemestre();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySemestre();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSemestre(false);
						
			if(semestreSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSemestre();
			}
			
			this.actualizarVisualTableDatosSemestre();
			
			this.jTableDatosSemestre.setRowSelectionInterval(this.getIndiceNuevoSemestre(), this.getIndiceNuevoSemestre());
			
			this.seleccionarFilaTablaSemestreActual();
						
			this.actualizarEstadoCeldasBotonesSemestre("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSemestre(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setEnabled(isHabilitar && this.semestreConstantesFunciones.activarnombreSemestre);	
		
	};
	
	public void setDefaultControlesSemestre() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSemestre(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.semestreSessionBean.setConGuardarRelaciones(true);			
			this.semestreSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.setVisible(true);
			
					
		} else {
			//this.semestreSessionBean.setConGuardarRelaciones(false);			
			this.semestreSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSemestre() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
				if(semestreAux.getId().equals(this.iIdNuevoSemestre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Semestre semestreAux:this.semestres) {
				if(semestreAux.getId().equals(this.iIdNuevoSemestre)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualSemestre(Semestre semestre,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
				if(semestreAux.getId().equals(semestre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Semestre semestreAux:this.semestres) {
				if(semestreAux.getId().equals(semestre.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalSemestre(Semestre semestreOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
				if(semestreAux.getSemestreOriginal().getId().equals(semestreOriginal.getId())) {
					existe=true;
					semestreOriginal.setId(semestreAux.getId());
					semestreOriginal.setVersionRow(semestreAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Semestre semestreAux:this.semestres) {
				if(semestreAux.getSemestreOriginal().getId().equals(semestreOriginal.getId())) {
					existe=true;
					semestreOriginal.setId(semestreAux.getId());
					semestreOriginal.setVersionRow(semestreAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSemestre(Boolean esParaCancelar) throws Exception {
		semestresAux=new ArrayList<Semestre>();
		semestreAux=new Semestre();
		
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
					if(semestreAux.getId()<0) {
						semestresAux.add(semestreAux);
					}		
				}
				this.iIdNuevoSemestre=0L;
				this.semestreLogic.getSemestres().removeAll(semestresAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Semestre semestreAux:this.semestres) {
					if(semestreAux.getId()<0) {
						semestresAux.add(semestreAux);
					}		
				}
				this.iIdNuevoSemestre=0L;
				this.semestres.removeAll(semestresAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSemestre 
					&& this.semestreLogic.getSemestres().size()>0
					) {
					semestreAux=this.semestreLogic.getSemestres().get(this.semestreLogic.getSemestres().size() - 1);
				
					if(semestreAux.getId()<0) {
						this.semestreLogic.getSemestres().remove(semestreAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSemestre && this.semestres.size()>0) {
					semestreAux=this.semestres.get(this.semestres.size() - 1);
				
					if(semestreAux.getId()<0) {
						this.semestres.remove(semestreAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSemestre(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(semestre.getId()<0) {
				this.semestreLogic.getSemestres().remove(this.semestre);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(semestre.getId()<0) {
				this.semestres.remove(this.semestre);
			}
		}			
	}
	
	public void setEstadosInicialesSemestre(List<Semestre> semestresAux) throws Exception {
		SemestreConstantesFunciones.setEstadosInicialesSemestre(semestresAux);
	}
	
	public void setEstadosInicialesSemestre(Semestre semestreAux) throws Exception {
		SemestreConstantesFunciones.setEstadosInicialesSemestre(semestreAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSemestreActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSemestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSemestreActual()) {
				if(!this.isEsNuevoSemestre) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSemestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSemestre=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSemestreActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Semestre ?", "MANTENIMIENTO DE Semestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSemestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Semestre semestre) throws Exception {
		SemestreConstantesFunciones.seleccionarAsignar(this.semestre,semestre);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSemestre=this.isPermisoActualizarOriginalSemestre;
			
			
			this.seleccionarAsignar(semestre);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SemestreConstantesFunciones.quitarEspaciosSemestre(this.semestre,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSemestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.semestreSessionBean.setsFuncionBusquedaRapida(this.semestreSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSemestre) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSemestre(esParaCancelar);				
				this.cancelarNuevoSemestre(esParaCancelar);								
			}
			
			this.semestre=new Semestre();
			
			this.inicializarSemestre();
			
			this.actualizarEstadoCeldasBotonesSemestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSemestre() throws Exception {
		try {
			SemestreConstantesFunciones.inicializarSemestre(this.semestre);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.semestreLogic.getSemestres().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSemestres(String sAccionBusqueda,List<Semestre> semestresParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Semestre"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SemestreMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SemestreMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Semestre"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Semestres");		
		parameters.put("busquedapor", SemestreConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSemestre=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SemestreConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SemestreConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSemestre=new JRBeanArrayDataSource(SemestreJInternalFrame.TraerSemestreBeans(semestresParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSemestre);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SemestreConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SemestreConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SemestreBean.TraerSemestreBeans(semestresParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteSemestres(sAccionBusqueda,sTipoArchivoReporte,semestresParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSemestres(sAccionBusqueda,sTipoArchivoReporte,semestresParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSemestreActionPerformed(null);
					//this.generarExcelReporteSemestres(sAccionBusqueda,sTipoArchivoReporte,semestresParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSemestres(sAccionBusqueda,sTipoArchivoReporte,semestresParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSemestres(sAccionBusqueda,sTipoArchivoReporte,semestresParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSemestres(sAccionBusqueda,sTipoArchivoReporte,semestresParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSemestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Semestre> semestresParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Semestres");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSemestre("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Semestre semestre : semestresParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SemestreConstantesFunciones.generarExcelReporteDataSemestre("NORMAL",row,workbook,semestre,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSemestre(String sTipo,Row row,Workbook workbook) {
		
		SemestreConstantesFunciones.generarExcelReporteHeaderSemestre(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSemestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Semestre> semestresParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Semestres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Semestre semestre : semestresParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SemestreConstantesFunciones.getSemestreDescripcion(semestre));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SemestreConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SemestreConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(semestre.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSemestres(String sAccionBusqueda,String sTipoArchivoReporte,List<Semestre> semestresParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Semestre> semestresRespaldo=null;
		
		classes=SemestreConstantesFunciones.getClassesRelationshipsOfSemestre(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.semestreLogic.setDatosCliente(this.datosCliente);
		this.semestreLogic.setDatosDeep(this.datosDeep);
		this.semestreLogic.setIsConDeep(true);
		
		semestresRespaldo=this.semestreLogic.getSemestres();
		
		this.semestreLogic.setSemestres(semestresParaReportes);	
		this.semestreLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		semestresParaReportes=this.semestreLogic.getSemestres();
		this.semestreLogic.setSemestres(semestresRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Semestres");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSemestre("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Semestre semestre : semestresParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSemestre("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SemestreConstantesFunciones.generarExcelReporteDataSemestre("NORMAL",row,workbook,semestre,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SemestreConstantesFunciones.getSemestreDescripcion(semestre));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSemestre.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSemestre.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSemestre() throws Exception {		
		this.startProcessSemestre(true);
	}
	
	public void startProcessSemestre(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesSemestre, this.jScrollPanelDatosSemestre,this.jPanelPaginacionSemestre, this.jScrollPanelDatosEdicionSemestre, this.jPanelAccionesSemestre,this.jPanelAccionesFormularioSemestre,this.jmenuBarSemestre,this.jmenuBarDetalleSemestre,this.jTtoolBarSemestre,this.jTtoolBarDetalleSemestre);		
		
		final JTabbedPane jTabbedPaneBusquedasSemestre=null; 
		
		final JPanel jPanelParametrosReportesSemestre=this.jPanelParametrosReportesSemestre;
		//final JScrollPane jScrollPanelDatosSemestre=this.jScrollPanelDatosSemestre;
		final JTable jTableDatosSemestre=this.jTableDatosSemestre;		
		final JPanel jPanelPaginacionSemestre=this.jPanelPaginacionSemestre;
		//final JScrollPane jScrollPanelDatosEdicionSemestre=this.jScrollPanelDatosEdicionSemestre;
		final JPanel jPanelAccionesSemestre=this.jPanelAccionesSemestre;
		
		JPanel jPanelCamposAuxiliarSemestre=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSemestre=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
			jPanelCamposAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jPanelCamposSemestre;
			jPanelAccionesFormularioAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jPanelAccionesFormularioSemestre;
		}
		
		final JPanel jPanelCamposSemestre=jPanelCamposAuxiliarSemestre;
		final JPanel jPanelAccionesFormularioSemestre=jPanelAccionesFormularioAuxiliarSemestre;
		
		
		final JMenuBar jmenuBarSemestre=this.jmenuBarSemestre;
		final JToolBar jTtoolBarSemestre=this.jTtoolBarSemestre;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSemestre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSemestre=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
			jmenuBarDetalleAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jmenuBarDetalleSemestre;
			jTtoolBarDetalleAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jTtoolBarDetalleSemestre;
		}
		
		final JMenuBar jmenuBarDetalleSemestre=jmenuBarDetalleAuxiliarSemestre;
		final JToolBar jTtoolBarDetalleSemestre=jTtoolBarDetalleAuxiliarSemestre;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSemestre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSemestre;
			processRunnable.jTableDatos=jTableDatosSemestre;
			processRunnable.jPanelCampos=jPanelCamposSemestre;
			processRunnable.jPanelPaginacion=jPanelPaginacionSemestre;
			processRunnable.jPanelAcciones=jPanelAccionesSemestre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSemestre;
			
			
			processRunnable.jmenuBar=jmenuBarSemestre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSemestre;
			processRunnable.jTtoolBar=jTtoolBarSemestre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSemestre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSemestre ,jPanelParametrosReportesSemestre,jTableDatosSemestre, /*jScrollPanelDatosSemestre,*/jPanelCamposSemestre,jPanelPaginacionSemestre, /*jScrollPanelDatosEdicionSemestre,*/ jPanelAccionesSemestre,jPanelAccionesFormularioSemestre,jmenuBarSemestre,jmenuBarDetalleSemestre,jTtoolBarSemestre,jTtoolBarDetalleSemestre);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesSemestre, jScrollPanelDatosSemestre,jPanelPaginacionSemestre, jScrollPanelDatosEdicionSemestre, jPanelAccionesSemestre,jPanelAccionesFormularioSemestre,jmenuBarSemestre,jmenuBarDetalleSemestre,jTtoolBarSemestre,jTtoolBarDetalleSemestre);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessSemestre() {// throws Exception 
		this.finishProcessSemestre(true);
	}
	
	public void finishProcessSemestre(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesSemestre, this.jScrollPanelDatosSemestre,this.jPanelPaginacionSemestre, this.jScrollPanelDatosEdicionSemestre, this.jPanelAccionesSemestre,this.jPanelAccionesFormularioSemestre,this.jmenuBarSemestre,this.jmenuBarDetalleSemestre,this.jTtoolBarSemestre,this.jTtoolBarDetalleSemestre);		
		
		final JTabbedPane jTabbedPaneBusquedasSemestre=null; 
		
		final JPanel jPanelParametrosReportesSemestre=this.jPanelParametrosReportesSemestre;
		//final JScrollPane jScrollPanelDatosSemestre=this.jScrollPanelDatosSemestre;
		final JTable jTableDatosSemestre=this.jTableDatosSemestre;		
		final JPanel jPanelPaginacionSemestre=this.jPanelPaginacionSemestre;
		//final JScrollPane jScrollPanelDatosEdicionSemestre=this.jScrollPanelDatosEdicionSemestre;
		final JPanel jPanelAccionesSemestre=this.jPanelAccionesSemestre;
		
		JPanel jPanelCamposAuxiliarSemestre=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSemestre=new JPanel();
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
			jPanelCamposAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jPanelCamposSemestre;
			jPanelAccionesFormularioAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jPanelAccionesFormularioSemestre;
		}
		
		final JPanel jPanelCamposSemestre=jPanelCamposAuxiliarSemestre;
		final JPanel jPanelAccionesFormularioSemestre=jPanelAccionesFormularioAuxiliarSemestre;
		
		
		final JMenuBar jmenuBarSemestre=this.jmenuBarSemestre;		
		final JToolBar jTtoolBarSemestre=this.jTtoolBarSemestre;
				
		JMenuBar jmenuBarDetalleAuxiliarSemestre=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSemestre=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
			jmenuBarDetalleAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jmenuBarDetalleSemestre;
			jTtoolBarDetalleAuxiliarSemestre=this.jInternalFrameDetalleFormSemestre.jTtoolBarDetalleSemestre;		
		}
		
		final JMenuBar jmenuBarDetalleSemestre=jmenuBarDetalleAuxiliarSemestre;
		final JToolBar jTtoolBarDetalleSemestre=jTtoolBarDetalleAuxiliarSemestre;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSemestre;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSemestre;
			processRunnable.jTableDatos=jTableDatosSemestre;
			processRunnable.jPanelCampos=jPanelCamposSemestre;
			processRunnable.jPanelPaginacion=jPanelPaginacionSemestre;
			processRunnable.jPanelAcciones=jPanelAccionesSemestre;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSemestre;
			
			
			processRunnable.jmenuBar=jmenuBarSemestre;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSemestre;
			processRunnable.jTtoolBar=jTtoolBarSemestre;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSemestre;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSemestre ,jPanelParametrosReportesSemestre, jTableDatosSemestre,/*jScrollPanelDatosSemestre,*/jPanelCamposSemestre,jPanelPaginacionSemestre, /*jScrollPanelDatosEdicionSemestre,*/ jPanelAccionesSemestre,jPanelAccionesFormularioSemestre,jmenuBarSemestre,jmenuBarDetalleSemestre,jTtoolBarSemestre,jTtoolBarDetalleSemestre));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSemestre(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSemestre(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSemestre(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSemestre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSemestre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSemestre,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSemestre(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSemestre,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSemestre,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.semestreConstantesFunciones.getsFinalQuerySemestre();
		String  finalQueryPaginacionTodos=this.semestreConstantesFunciones.getsFinalQuerySemestre();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=SemestreConstantesFunciones.getArrayColumnasGlobalesNoSemestre(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SemestreConstantesFunciones.getArrayColumnasGlobalesSemestre(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SemestreConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.semestresEliminados= new ArrayList<Semestre>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSemestre();
		
				///*SemestreSessionBean*/this.semestreSessionBean=new SemestreSessionBean();
			
			if(this.semestreSessionBean==null) {
				this.semestreSessionBean=new SemestreSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=SemestreConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SemestreConstantesFunciones.getClassesForeignKeysOfSemestre(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/semestre."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			semestresAux= new ArrayList<Semestre>();
			
				
			semestreLogic.setDatosCliente(this.datosCliente);
			semestreLogic.setDatosDeep(this.datosDeep);
			semestreLogic.setIsConDeep(true);
			
			
			semestreLogic.getSemestreDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					semestreLogic.getTodosSemestres(finalQueryGlobal,pagination);
					
					//semestreLogic.getTodosSemestresWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(semestreLogic.getSemestres()==null|| semestreLogic.getSemestres().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							semestresAux= new ArrayList<Semestre>();
							semestresAux.addAll(semestreLogic.getSemestres());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							semestresAux= new ArrayList<Semestre>();
							semestresAux.addAll(semestres);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							semestreLogic.getTodosSemestres(finalQueryGlobal+"",this.pagination);												
							
							//semestreLogic.getTodosSemestresWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSemestres("Todos",semestreLogic.getSemestres() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							semestreLogic.setSemestres(new ArrayList<Semestre>());					
							semestreLogic.getSemestres().addAll(semestresAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							semestres=new ArrayList<Semestre>();
							semestres.addAll(semestresAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSemestre=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSemestre=this.idActual;
				
				} else if(this.idSemestreActual!=null && this.idSemestreActual!=0L) {
					idSemestre=idSemestreActual;
				}
				
					
				this.sDetalleReporte=SemestreConstantesFunciones.getDetalleIndicePorId(idSemestre);
				
				this.semestres=new ArrayList<Semestre>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					semestreLogic.getEntity(idSemestre);
					
					//semestreLogic.getEntityWithConnection(idSemestre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					semestreLogic.setSemestres(new ArrayList<Semestre>());
					semestreLogic.getSemestres().add(semestreLogic.getSemestre());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.semestres=new ArrayList<Semestre>();
					this.semestres.add(semestre);
				}
				
				if(semestreLogic.getSemestre()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSemestre();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSemestre();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=semestreLogic.getSemestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=semestres.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=semestreLogic.getSemestres().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=semestres.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Semestre semestre) {
		Boolean permite=true;
		
		if(this.semestre.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SemestreConstantesFunciones.getOrderByListaSemestre();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SemestreConstantesFunciones.getOrderByListaSemestre();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Semestre semestre:semestreLogic.getSemestres()) {
				if(semestre.getsType().equals(Constantes2.S_TOTALES)) {
					semestreTotales=semestre;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Semestre semestre:this.semestres) {
				if(semestre.getsType().equals(Constantes2.S_TOTALES)) {
					semestreTotales=semestre;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.semestreAux=new Semestre();
			this.semestreAux.setsType(Constantes2.S_TOTALES);
			this.semestreAux.setIsNew(false);
			this.semestreAux.setIsChanged(false);
			this.semestreAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SemestreConstantesFunciones.TotalizarValoresFilaSemestre(this.semestreLogic.getSemestres(),this.semestreAux);
				
				this.semestreLogic.getSemestres().add(this.semestreAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SemestreConstantesFunciones.TotalizarValoresFilaSemestre(this.semestres,this.semestreAux);
				
				this.semestres.add(this.semestreAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		semestreTotales=new Semestre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.semestreLogic.getSemestres().remove(semestreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.semestres.remove(semestreTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		semestreTotales=new Semestre();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Semestre semestre:semestreLogic.getSemestres()) {
				if(semestre.getsType().equals(Constantes2.S_TOTALES)) {
					semestreTotales=semestre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SemestreConstantesFunciones.TotalizarValoresFilaSemestre(this.semestreLogic.getSemestres(),semestreTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Semestre semestre:this.semestres) {
				if(semestre.getsType().equals(Constantes2.S_TOTALES)) {
					semestreTotales=semestre;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SemestreConstantesFunciones.TotalizarValoresFilaSemestre(this.semestres,semestreTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	
	
	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosSemestre() {
		this.isPermisoTodoSemestre=false;
		this.isPermisoNuevoSemestre=false;
		this.isPermisoActualizarSemestre=false;
		this.isPermisoActualizarOriginalSemestre=false;
		this.isPermisoEliminarSemestre=false;
		this.isPermisoGuardarCambiosSemestre=false;
		this.isPermisoConsultaSemestre=false;
		this.isPermisoBusquedaSemestre=false;
		this.isPermisoReporteSemestre=false;		
		this.isPermisoOrdenSemestre=false;		
		this.isPermisoPaginacionMedioSemestre=false;		
		this.isPermisoPaginacionAltoSemestre=false;
		this.isPermisoPaginacionTodoSemestre=false;
		this.isPermisoCopiarSemestre=false;		
		this.isPermisoVerFormSemestre=false;		
		this.isPermisoDuplicarSemestre=false;		
		this.isPermisoOrdenSemestre=false;		
	}
	
	public void setPermisosUsuarioSemestre(Boolean isPermiso) {
		this.isPermisoTodoSemestre=isPermiso;
		this.isPermisoNuevoSemestre=isPermiso;
		this.isPermisoActualizarSemestre=isPermiso;
		this.isPermisoActualizarOriginalSemestre=isPermiso;
		this.isPermisoEliminarSemestre=isPermiso;
		this.isPermisoGuardarCambiosSemestre=isPermiso;
		this.isPermisoConsultaSemestre=isPermiso;
		this.isPermisoBusquedaSemestre=isPermiso;
		this.isPermisoReporteSemestre=isPermiso;
		this.isPermisoOrdenSemestre=isPermiso;		
		this.isPermisoPaginacionMedioSemestre=isPermiso;		
		this.isPermisoPaginacionAltoSemestre=isPermiso;		
		this.isPermisoPaginacionTodoSemestre=isPermiso;		
		this.isPermisoCopiarSemestre=isPermiso;		
		this.isPermisoVerFormSemestre=isPermiso;		
		this.isPermisoDuplicarSemestre=isPermiso;
		this.isPermisoOrdenSemestre=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSemestre(Boolean isPermiso) {
		//this.isPermisoTodoSemestre=isPermiso;
		this.isPermisoNuevoSemestre=isPermiso;
		this.isPermisoActualizarSemestre=isPermiso;
		this.isPermisoActualizarOriginalSemestre=isPermiso;
		this.isPermisoEliminarSemestre=isPermiso;
		this.isPermisoGuardarCambiosSemestre=isPermiso;
		//this.isPermisoConsultaSemestre=isPermiso;
		//this.isPermisoBusquedaSemestre=isPermiso;
		//this.isPermisoReporteSemestre=isPermiso;
		//this.isPermisoOrdenSemestre=isPermiso;		
		//this.isPermisoPaginacionMedioSemestre=isPermiso;		
		//this.isPermisoPaginacionAltoSemestre=isPermiso;		
		//this.isPermisoPaginacionTodoSemestre=isPermiso;		
		//this.isPermisoCopiarSemestre=isPermiso;		
		//this.isPermisoDuplicarSemestre=isPermiso;
		//this.isPermisoOrdenSemestre=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSemestreClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SemestreJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebSemestre(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSemestreClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSemestreClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSemestreClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSemestreClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSemestre() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SemestreJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.semestreSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SemestreConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSemestre=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSemestre=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSemestre=this.isPermisoActualizarSemestre;
			this.isPermisoEliminarSemestre=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSemestre=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSemestre=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSemestre=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSemestre=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSemestre=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSemestre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSemestre=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSemestre=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSemestre=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSemestre=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSemestre=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSemestre=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSemestre=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.semestreSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSemestre.setToolTipText(this.jTableDatosSemestre.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSemestre(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSemestre(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SemestreJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(SemestreJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioSemestre() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeySemestreListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySemestreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SemestreJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySemestreListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeySemestreListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySemestre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeySemestre()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySemestre(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySemestre()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySemestre();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySemestre(Semestre semestre)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySemestre(Semestre semestre,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySemestre()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySemestre()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySemestre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySemestre()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSemestre()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySemestre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySemestre(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySemestre()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public SemestreBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SemestreBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SemestreBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.semestreSessionBean=new SemestreSessionBean(); 
		this.semestreConstantesFunciones=new SemestreConstantesFunciones(); 
		this.semestreBean=new Semestre();//(this.semestreConstantesFunciones); 		
		this.semestreReturnGeneral=new SemestreParameterReturnGeneral(); 
		
		this.semestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.semestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SemestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SemestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SemestreBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSemestre(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.semestreConstantesFunciones=new SemestreConstantesFunciones(); 
			this.semestreBean=new Semestre();//this.semestreConstantesFunciones); 			
			this.semestreReturnGeneral=new SemestreParameterReturnGeneral(); 
		
			SemestreBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Semestre Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.semestre=new Semestre();
			this.semestres = new ArrayList<Semestre>();
			this.semestresAux = new ArrayList<Semestre>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic=new SemestreLogic();
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			//this.semestreSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.semestreSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSemestre);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSemestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSemestre);	
					}
					
					if(this.jInternalFrameImportacionSemestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSemestre);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySemestre!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySemestre);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSemestre!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSemestre);
				this.jInternalFrameDetalleFormSemestre.setVisible(false);
				this.jInternalFrameDetalleFormSemestre.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSemestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSemestre);
					this.jInternalFrameReporteDinamicoSemestre.setVisible(false);
					this.jInternalFrameReporteDinamicoSemestre.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSemestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSemestre);
					this.jInternalFrameImportacionSemestre.setVisible(false);
					this.jInternalFrameImportacionSemestre.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySemestre!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySemestre);
					this.jInternalFrameOrderBySemestre.setVisible(false);
					this.jInternalFrameOrderBySemestre.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSemestreActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SemestreConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.semestreReturnGeneral=new SemestreParameterReturnGeneral();
			
			this.semestreParameterGeneral=new SemestreParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.semestreLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(SemestreJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.semestreSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SemestreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.semestreSessionBean.getEsGuardarRelacionado(),this.semestreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SemestreConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.semestreSessionBean.getEsGuardarRelacionado(),this.semestreSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaDuplicarSemestre=true;
			this.isVisibilidadCeldaCopiarSemestre=true;
			this.isVisibilidadCeldaVerFormSemestre=true;
			this.isVisibilidadCeldaOrdenSemestre=true;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
			this.isVisibilidadCeldaModificarSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=false;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=false;
			this.isVisibilidadCeldaGuardarSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSemestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSemestre();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSemestre(false);
			
			this.setPermisosUsuarioSemestre();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.semestreSessionBean.getEsGuardarRelacionado() 
				|| (this.semestreSessionBean.getEsGuardarRelacionado() && this.semestreSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSemestreClasesRelacionadas();
			}
			
			if(this.semestreSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSemestreClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SemestreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSemestre();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSemestre();
			}
			
			if(!this.isPermisoBusquedaSemestre) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.semestreSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSemestre,this.isPermisoPaginacionMedioSemestre,this.isPermisoPaginacionTodoSemestre);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SemestreConstantesFunciones.getTiposSeleccionarSemestre());
				
				this.tiposColumnasSelect=SemestreConstantesFunciones.getTiposSeleccionarSemestre(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSemestre();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioSemestre(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioSemestre(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSemestre() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				semestreImplementable= (SemestreImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SemestreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				semestreImplementableHome= (SemestreImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SemestreConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.semestres= new ArrayList<Semestre>();
			this.semestresEliminados= new ArrayList<Semestre>();
						
			this.isEsNuevoSemestre=false;
			this.esParaAccionDesdeFormularioSemestre=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySemestre(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSemestre();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SemestreConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSemestre("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSemestre(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSemestre!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSemestre();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSemestre();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSemestre(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Semestre: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSemestre() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSemestre")) {
				iIndex=this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSemestre.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSemestre();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeySemestre(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySemestre(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySemestre(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySemestreListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySemestre();
		
		this.cargarCombosFrameForeignKeySemestre();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySemestre();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySemestre();
		}
	}
	
	
	
	public void jButtonNuevoSemestreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.semestreSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			
			if(jTableDatosSemestre.getRowCount()>=1) {
				jTableDatosSemestre.removeRowSelectionInterval(0, jTableDatosSemestre.getRowCount()-1);						
			}
			
			this.isEsNuevoSemestre=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSemestre(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSemestre(true);			
			//this.semestre=new Semestre();
			//this.semestre.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSemestre(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSemestre() ;
			
			if(SemestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSemestre(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.semestre);	
			this.actualizarInformacion("INFO_PADRE",false,this.semestre);				
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			if(this.semestreSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Semestre: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSemestreActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSemestre.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSemestre.getSelectedRows().length;			
			}
			
			semestresSeleccionados=this.getSemestresSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSemestre--;			
				//Semestre semestreAux= new Semestre();			
				//semestreAux.setId(this.iIdNuevoSemestre);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Semestre semestreOrigen=new Semestre();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Semestre semestreOrigen : semestresSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							semestreOrigen =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							semestreOrigen =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSemestre();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.semestre.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSemestre(semestreOrigen,this.semestre,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.semestreLogic.getSemestres().add(this.semestreAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.semestres.add(this.semestreAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSemestre(false);
				
				this.jTableDatosSemestre.setRowSelectionInterval(this.getIndiceNuevoSemestre(), this.getIndiceNuevoSemestre());
				
				int iLastRow =  this.jTableDatosSemestre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSemestre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSemestre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSemestre(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();									
		
			Semestre semestreOrigen=new Semestre();
			Semestre semestreDestino=new Semestre();
				
			semestresSeleccionados=this.getSemestresSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSemestre.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || semestresSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSemestre.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						semestreOrigen =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						semestreOrigen =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						semestreDestino =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						semestreDestino =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				semestreOrigen =semestresSeleccionados.get(0);
				semestreDestino =semestresSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSemestre(semestreOrigen,semestreDestino,true,false);
				
				semestreDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(semestreDestino,semestreLogic.getSemestres());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(semestreDestino,semestres);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSemestre(false);
				
				//this.jTableDatosSemestre.setRowSelectionInterval(this.getIndiceNuevoSemestre(), this.getIndiceNuevoSemestre());
				
				int iLastRow =  this.jTableDatosSemestre.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSemestre.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSemestre.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSemestre(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSemestre.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSemestre.isVisible();
			
			
			this.jPanelParametrosReportesSemestre.setVisible(!isVisible);
			this.jPanelPaginacionSemestre.setVisible(!isVisible);
			this.jPanelAccionesSemestre.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSemestre();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSemestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSemestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySemestre();
			
			this.abrirFrameOrderBySemestre();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySemestre();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSemestre(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSemestre);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSemestre.isMaximum()) {
					this.jInternalFrameDetalleFormSemestre.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSemestre.setSize(this.jInternalFrameDetalleFormSemestre.iWidthFormulario,this.jInternalFrameDetalleFormSemestre.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSemestre.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSemestre.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSemestre.isMaximum()) {
						this.jInternalFrameDetalleFormSemestre.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSemestre.jContentPaneDetalleSemestre.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSemestre.jContentPaneDetalleSemestre.getWidth(),SemestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSemestre.jContentPaneDetalleSemestre.getWidth(),SemestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSemestre.jContentPaneDetalleSemestre.getWidth(),SemestreConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSemestre.setVisible(true);
	        this.jInternalFrameDetalleFormSemestre.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySemestre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySemestre==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySemestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySemestre,false,this);
				} else {
					this.jInternalFrameOrderBySemestre=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySemestre,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySemestre);
				this.jInternalFrameOrderBySemestre.setVisible(false);
				this.jInternalFrameOrderBySemestre.setSelected(false);
				
				this.jInternalFrameOrderBySemestre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySemestre"));
				
				this.inicializarActualizarBindingTablaOrderBySemestre();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSemestre() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSemestre==null) {
				
				this.jInternalFrameImportacionSemestre=new ImportacionJInternalFrame(SemestreConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSemestre);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSemestre);
				this.jInternalFrameImportacionSemestre.setVisible(false);
				this.jInternalFrameImportacionSemestre.setSelected(false);


				this.jInternalFrameImportacionSemestre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSemestre"));
				this.jInternalFrameImportacionSemestre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSemestre"));
				this.jInternalFrameImportacionSemestre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSemestre"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSemestre() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSemestre==null) {
				this.jInternalFrameReporteDinamicoSemestre=new ReporteDinamicoJInternalFrame(SemestreConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSemestre);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSemestre);
				this.jInternalFrameReporteDinamicoSemestre.setVisible(false);
				this.jInternalFrameReporteDinamicoSemestre.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSemestre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSemestre"));
				this.jInternalFrameReporteDinamicoSemestre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSemestre"));
				this.jInternalFrameReporteDinamicoSemestre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSemestre"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSemestre();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleSemestre() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSemestre);
			
	       	this.jInternalFrameDetalleFormSemestre.setVisible(false);
	        this.jInternalFrameDetalleFormSemestre.setSelected(false);
			
			//this.jInternalFrameDetalleFormSemestre.dispose();
			//this.jInternalFrameDetalleFormSemestre=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSemestre() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSemestre.setVisible(true);
	        this.jInternalFrameReporteDinamicoSemestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSemestre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSemestre.setVisible(true);
	        this.jInternalFrameImportacionSemestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySemestre() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySemestre.setVisible(true);
	        this.jInternalFrameOrderBySemestre.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySemestre() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySemestre.setVisible(false);
	        this.jInternalFrameOrderBySemestre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSemestre() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSemestre.setVisible(false);
	        this.jInternalFrameReporteDinamicoSemestre.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSemestre() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSemestre.setVisible(false);
	        this.jInternalFrameImportacionSemestre.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSemestre(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSemestre(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSemestre(true);
			//this.isEsNuevoSemestre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSemestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSemestre(false) ;
			
			if(semestreSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SemestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSemestre(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSemestre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSemestreActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSemestre(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSemestre(true);
			//this.isEsNuevoSemestre=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.semestre.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSemestre("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSemestre(false) ;
			
			if(SemestreJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSemestre(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSemestre(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSemestre(false);
			
			//if(!this.isEsNuevoSemestre) {								
				int intSelectedRow = this.jTableDatosSemestre.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSemestre(this.semestre,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
				
			}
			
			if(this.permiteMantenimiento(this.semestre)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.semestreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSemestre=true;
					this.inicializarActualizarBindingTablaSemestre(false);
					this.isEsNuevoSemestre=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSemestre=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSemestre=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSemestre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSemestre(false);
				
				this.habilitarDeshabilitarControlesSemestre(false);
			
												
				
				if(SemestreJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSemestre();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSemestreActionPerformed(evt,semestreSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSemestre(this.semestre,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSemestre.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,semestreSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.semestre.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSemestreActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSemestre.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				this.semestre.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				this.semestre.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.semestre)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.semestreSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SemestreModel) this.jTableDatosSemestre.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSemestre=true;
				this.inicializarActualizarBindingTablaSemestre(false);
				this.isEsNuevoSemestre=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSemestre(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSemestre(false);
				
				this.habilitarDeshabilitarControlesSemestre(false);
				
				
				
				if(SemestreJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSemestre();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSemestreActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSemestre.getRowCount()>=1) {
				jTableDatosSemestre.removeRowSelectionInterval(0, jTableDatosSemestre.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSemestre(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSemestre(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSemestre(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSemestre(false) ;
			
			this.isEsNuevoSemestre=false;
			
			if(SemestreJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSemestre();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSemestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSemestre(false);
				
				//SI ES MANUAL
				if(SemestreJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSemestre();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSemestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSemestre--;			
			//Semestre semestreAux= new Semestre();			
			//semestreAux.setId(this.iIdNuevoSemestre);
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSemestre();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
			
			this.semestre.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.semestreLogic.getSemestres().add(this.semestreAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.semestres.add(this.semestreAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSemestre(false);
			
			this.jTableDatosSemestre.setRowSelectionInterval(this.getIndiceNuevoSemestre(), this.getIndiceNuevoSemestre());
			
			int iLastRow =  this.jTableDatosSemestre.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSemestre.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSemestre.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSemestre(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSemestreActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSemestre(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSemestre(false);
			
			//SI ES MANUAL
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSemestre();
			}
			
			//this.abrirFrameTreeSemestre();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSemestreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SemestreS ?", "MANTENIMIENTO DE Semestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSemestre.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSemestre();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.semestreReturnGeneral=semestreLogic.procesarImportacionSemestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.semestreParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSemestreReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSemestreActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSemestre.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSemestre.setFileImportacion(this.jInternalFrameImportacionSemestre.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSemestre.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSemestre.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSemestre.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSemestre.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSemestreActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		

		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SemestreBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SemestreBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteSemestres("Todos",semestresSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SemestreConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoSemestre.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SemestreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SemestreConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSemestre.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSemestre.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SemestreConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoSemestreActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Semestres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SemestreConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SemestreConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Semestre semestre:semestresSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(semestre.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelSemestre(row);				
			//	iRow++;
			//}				
			
			//for(Semestre semestreAux:semestresSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSemestre(semestreAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSemestre(false);
			
			//SI ES MANUAL
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSemestre();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSemestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSemestre(false);
			
			//SI ES MANUAL
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSemestre();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSemestreActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSemestre(false);
			
			//SI ES MANUAL
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSemestre();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.semestreLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSemestre() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSemestre.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSemestre.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSemestre.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSemestre.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSemestre.setMinimumSize(dimensionMinimum);
		this.jTableDatosSemestre.setMaximumSize(dimensionMaximum);
		this.jTableDatosSemestre.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSemestre(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSemestre(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSemestre(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSemestre(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSemestre(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSemestre(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSemestre(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSemestre(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SemestreJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SemestreJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSemestre() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSemestre();
		
		this.inicializarActualizarBindingBotonesManualSemestre(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSemestre();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSemestre() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSemestre(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSemestre(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSemestre.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSemestre.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSemestre.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSemestre!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSemestre.jCheckBoxPostAccionNuevoSemestre.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSemestre.jCheckBoxPostAccionSinCerrarSemestre.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSemestre.jCheckBoxPostAccionSinMensajeSemestre.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSemestre.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSemestre.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSemestre.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSemestre!=null) {
				this.jInternalFrameDetalleFormSemestre.jCheckBoxPostAccionNuevoSemestre.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSemestre.jCheckBoxPostAccionSinCerrarSemestre.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSemestre.jCheckBoxPostAccionSinMensajeSemestre.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSemestre.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSemestre.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSemestre.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSemestre!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSemestre.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSemestre.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSemestre.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSemestre.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSemestre!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSemestre.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSemestre.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSemestre(Boolean esInicializar) throws Exception {
		try	{	
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSemestre(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSemestre() throws Exception {
		try	{
			if(SemestreJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSemestre();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSemestre() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSemestre() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSemestre.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSemestre.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSemestre.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSemestre.addItem(reporte);
			}
			
			
			if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSemestre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSemestre.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSemestre.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSemestre.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSemestre.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSemestre.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSemestre.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSemestre();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSemestre() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSemestre!=null) {
				this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSemestre!=null) {
				this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSemestre.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSemestre!=null) {
				
				if(this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSemestre.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSemestre.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSemestre.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSemestre.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSemestre()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSemestre(Boolean esInicializar) throws Exception {				
		if(SemestreJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSemestre();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSemestre() throws Exception {
		this.inicializarActualizarBindingTablaSemestre(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySemestre() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SemestrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SemestrePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSemestreOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSemestreOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SemestrePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SemestrePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSemestre(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=semestreLogic.getSemestres().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=semestres.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSemestre.setModel(new SemestreModel(this.semestreLogic.getSemestres(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSemestre.setModel(new SemestreModel(this.semestres,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySemestre!=null && this.jInternalFrameOrderBySemestre.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySemestre();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSemestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSemestre,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SemestrePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SemestreConstantesFunciones.SCLASSWEBTITULO,semestreConstantesFunciones.resaltarSeleccionarSemestre,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SemestreConstantesFunciones.SCLASSWEBTITULO,semestreConstantesFunciones.resaltarSeleccionarSemestre,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSemestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSemestre,SemestreConstantesFunciones.LABEL_ID));

		if(this.semestreConstantesFunciones.mostraridSemestre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SemestreConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.semestreConstantesFunciones.resaltaridSemestre,this.semestreConstantesFunciones.activaridSemestre,this,true,"idSemestre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.semestreConstantesFunciones.resaltaridSemestre,this.semestreConstantesFunciones.activaridSemestre,this,true,"idSemestre","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSemestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSemestre,SemestreConstantesFunciones.LABEL_NOMBRE));

		if(this.semestreConstantesFunciones.mostrarnombreSemestre && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SemestreConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.semestreConstantesFunciones.resaltarnombreSemestre,this.semestreConstantesFunciones.activarnombreSemestre,this,true,"nombreSemestre","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.semestreConstantesFunciones.resaltarnombreSemestre,this.semestreConstantesFunciones.activarnombreSemestre,this,true,"nombreSemestre","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SemestrePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.semestreSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.semestreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.semestreSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSemestre.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.semestreSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.semestreSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSemestre.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSemestre && this.isPermisoGuardarCambiosSemestre) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.semestreSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.semestreSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSemestre.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosSemestre.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSemestre && this.isPermisoGuardarCambiosSemestre) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSemestre && this.isPermisoGuardarCambiosSemestre) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSemestre.moveColumn(this.jTableDatosSemestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSemestre.moveColumn(this.jTableDatosSemestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSemestre.moveColumn(this.jTableDatosSemestre.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSemestre.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSemestre.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSemestre,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSemestre.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSemestre.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSemestre.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSemestre.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSemestre.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=semestreLogic.getSemestres().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=semestres.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosSemestre.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSemestre.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSemestre();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoSemestre=false;
					
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
				if(this.semestreSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSemestre==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSemestre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSemestre.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.semestre.getsType().equals("DUPLICADO")
				   || this.semestre.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSemestre=true;
				
				} else {
					this.isEsNuevoSemestre=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.semestreSessionBean.getEsGuardarRelacionado()) {
					if(this.semestre.getId()>=0 && !this.semestre.getIsNew()) {						
						this.isEsNuevoSemestre=false;
						
					} else {
						this.isEsNuevoSemestre=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSemestre(esRelaciones);						
				
				this.seleccionarSemestre(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.semestre.getId()<0) {
					this.isEsNuevoSemestre=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSemestre(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSemestre(evt,rowIndex);
				}	
				
				if(this.semestreSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Semestre: " + this.dDif); 
					}
				}								
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSemestre(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.semestre)) {
					if(this.semestre.getId()>0) {
						this.semestre.setIsDeleted(true);
						
						this.semestresEliminados.add(this.semestre);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.semestreLogic.getSemestres().remove(this.semestre);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.semestres.remove(this.semestre);				
					}
					
					
					((SemestreModel) this.jTableDatosSemestre.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSemestre(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSemestre(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSemestre) {
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSemestre.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSemestre.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSemestre(this.semestre);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSemestre("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSemestre(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSemestre() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSemestre(Semestre semestre) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSemestre(semestre,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSemestre(Semestre semestre,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSemestre(semestre);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySemestre(semestre,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySemestre(semestre);
	}
	
	public void setVariablesObjetoActualToFormularioSemestre(Semestre semestre) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setText(semestre.getId().toString());
			this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setText(semestre.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Semestre semestreLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,semestreLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Semestre semestreLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				semestreLocal=this.semestre;
			} else {
				semestreLocal=this.semestreAnterior;
			}
		}
		
		if(this.permiteMantenimiento(semestreLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSemestre(semestreLocal,true);
					
					if(semestreSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(semestreLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.semestreSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(semestreLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSemestre(Semestre semestre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSemestre(semestre,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSemestre(semestre);
	}
	
	public void setVariablesFormularioToObjetoActualSemestre(Semestre semestre,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSemestre(semestre,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSemestre(Semestre semestre,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.getText()==null || this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.getText()=="" || this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.getText()=="Id") {
				this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setText("0");
			}

			if(conColumnasBase) {semestre.setId(Long.parseLong(this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SemestreConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSemestre.jLabelIdSemestre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			semestre.setnombre(this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SemestreConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSemestre.jLabelnombreSemestre,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSemestre(Semestre semestreBean,Semestre semestre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSemestre(Semestre semestreOrigen,Semestre semestre,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && semestreOrigen.getId()!=null && !semestreOrigen.getId().equals(0L))) {semestre.setId(semestreOrigen.getId());}}
			if(conDefault || (!conDefault && semestreOrigen.getnombre()!=null && !semestreOrigen.getnombre().equals(""))) {semestre.setnombre(semestreOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSemestre(Semestre semestre) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setText(semestre.getId().toString());
			this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setText(semestre.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSemestre(SemestreBean semestreBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setText(semestreBean.getId().toString());
			this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setText(semestreBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSemestre(SemestreParameterReturnGeneral semestreReturnGeneral,SemestreBean semestreBean,Boolean conDefault) throws Exception { 
		try {
			Semestre semestreLocal=new Semestre();
			
			semestreLocal=semestreReturnGeneral.getSemestre();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && semestreLocal.getId()!=null && !semestreLocal.getId().equals(0L))) {semestreBean.setId(semestreLocal.getId());}}
			if(conDefault || (!conDefault && semestreLocal.getnombre()!=null && !semestreLocal.getnombre().equals(""))) {semestreBean.setnombre(semestreLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSemestreGenerico(Long idSemestreSeleccionado,JComboBox jComboBoxSemestre,List<Semestre> semestresLocal)throws Exception {
		try {
			Semestre  semestreTemp=null;

			for(Semestre semestreAux:semestresLocal) {
				if(semestreAux.getId()!=null && semestreAux.getId().equals(idSemestreSeleccionado)) {
					semestreTemp=semestreAux;
					break;
				}
			}

			jComboBoxSemestre.setSelectedItem(semestreTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSemestreGenerico(JComboBox jComboBoxSemestre,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxSemestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSemestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSemestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSemestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSemestre.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSemestre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSemestre.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSemestre.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSemestre.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSemestre.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			semestre=(Semestre) semestreLogic.getSemestres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			semestre =(Semestre) semestres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Semestre semestreRow=new Semestre();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			semestreRow=(Semestre) semestreLogic.getSemestres().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			semestreRow=(Semestre) semestres.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSemestre(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSemestre.setVisible((this.isVisibilidadCeldaNuevoSemestre && this.isPermisoNuevoSemestre));			
			this.jButtonDuplicarSemestre.setVisible((this.isVisibilidadCeldaDuplicarSemestre && this.isPermisoDuplicarSemestre));			
			this.jButtonCopiarSemestre.setVisible((this.isVisibilidadCeldaCopiarSemestre && this.isPermisoCopiarSemestre));
			this.jButtonVerFormSemestre.setVisible((this.isVisibilidadCeldaVerFormSemestre && this.isPermisoVerFormSemestre));
			
			this.jButtonAbrirOrderBySemestre.setVisible((this.isVisibilidadCeldaOrdenSemestre && this.isPermisoOrdenSemestre));			
			
			this.jButtonNuevoRelacionesSemestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesSemestre && this.isPermisoNuevoSemestre));			
			this.jButtonNuevoGuardarCambiosSemestre.setVisible((this.isVisibilidadCeldaNuevoSemestre && this.isPermisoNuevoSemestre && this.isPermisoGuardarCambiosSemestre));
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.jInternalFrameDetalleFormSemestre.jButtonModificarSemestre.setVisible((this.isVisibilidadCeldaModificarSemestre && this.isPermisoActualizarSemestre));	
			this.jInternalFrameDetalleFormSemestre.jButtonActualizarSemestre.setVisible((this.isVisibilidadCeldaActualizarSemestre && this.isPermisoActualizarSemestre));	
			this.jInternalFrameDetalleFormSemestre.jButtonEliminarSemestre.setVisible((this.isVisibilidadCeldaEliminarSemestre && this.isPermisoEliminarSemestre));
			this.jInternalFrameDetalleFormSemestre.jButtonCancelarSemestre.setVisible(this.isVisibilidadCeldaCancelarSemestre);							
			this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.setVisible((this.isVisibilidadCeldaGuardarSemestre && this.isPermisoGuardarCambiosSemestre));			
			
			}
						
			this.jButtonGuardarCambiosTablaSemestre.setVisible((this.isVisibilidadCeldaGuardarCambiosSemestre && this.isPermisoGuardarCambiosSemestre));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSemestre.setVisible((this.isVisibilidadCeldaNuevoSemestre && this.isPermisoNuevoSemestre));						
			this.jButtonDuplicarToolBarSemestre.setVisible((this.isVisibilidadCeldaDuplicarSemestre && this.isPermisoDuplicarSemestre));						
			this.jButtonCopiarToolBarSemestre.setVisible((this.isVisibilidadCeldaCopiarSemestre && this.isPermisoCopiarSemestre));			
			this.jButtonVerFormToolBarSemestre.setVisible((this.isVisibilidadCeldaVerFormSemestre && this.isPermisoVerFormSemestre));			
			this.jButtonAbrirOrderByToolBarSemestre.setVisible((this.isVisibilidadCeldaOrdenSemestre && this.isPermisoOrdenSemestre));
			this.jButtonNuevoRelacionesToolBarSemestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesSemestre && this.isPermisoNuevoSemestre));			
			this.jButtonNuevoGuardarCambiosToolBarSemestre.setVisible((this.isVisibilidadCeldaNuevoSemestre && this.isPermisoNuevoSemestre && this.isPermisoGuardarCambiosSemestre));			
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.jInternalFrameDetalleFormSemestre.jButtonModificarToolBarSemestre.setVisible((this.isVisibilidadCeldaModificarSemestre && this.isPermisoActualizarSemestre));	
			this.jInternalFrameDetalleFormSemestre.jButtonActualizarToolBarSemestre.setVisible((this.isVisibilidadCeldaActualizarSemestre  && this.isPermisoActualizarSemestre));	
			this.jInternalFrameDetalleFormSemestre.jButtonEliminarToolBarSemestre.setVisible((this.isVisibilidadCeldaEliminarSemestre && this.isPermisoEliminarSemestre));
			this.jInternalFrameDetalleFormSemestre.jButtonCancelarToolBarSemestre.setVisible(this.isVisibilidadCeldaCancelarSemestre);				
			this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosToolBarSemestre.setVisible((this.isVisibilidadCeldaGuardarSemestre && this.isPermisoGuardarCambiosSemestre));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSemestre.setVisible((this.isVisibilidadCeldaGuardarCambiosSemestre && this.isPermisoGuardarCambiosSemestre));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSemestre.setVisible((this.isVisibilidadCeldaNuevoSemestre && this.isPermisoNuevoSemestre));			
			this.jMenuItemDuplicarSemestre.setVisible((this.isVisibilidadCeldaDuplicarSemestre && this.isPermisoDuplicarSemestre));			
			this.jMenuItemCopiarSemestre.setVisible((this.isVisibilidadCeldaCopiarSemestre && this.isPermisoCopiarSemestre));			
			this.jMenuItemVerFormSemestre.setVisible((this.isVisibilidadCeldaVerFormSemestre && this.isPermisoVerFormSemestre));			
			this.jMenuItemAbrirOrderBySemestre.setVisible((this.isVisibilidadCeldaOrdenSemestre && this.isPermisoOrdenSemestre));			
			//this.jMenuItemMostrarOcultarSemestre.setVisible((this.isVisibilidadCeldaOrdenSemestre && this.isPermisoOrdenSemestre));
			this.jMenuItemDetalleAbrirOrderBySemestre.setVisible((this.isVisibilidadCeldaOrdenSemestre && this.isPermisoOrdenSemestre));			
			//this.jMenuItemDetalleMostrarOcultarSemestre.setVisible((this.isVisibilidadCeldaOrdenSemestre && this.isPermisoOrdenSemestre));			
			this.jMenuItemNuevoRelacionesSemestre.setVisible((this.isVisibilidadCeldaNuevoRelacionesSemestre && this.isPermisoNuevoSemestre));			
			this.jMenuItemNuevoGuardarCambiosSemestre.setVisible((this.isVisibilidadCeldaNuevoSemestre && this.isPermisoNuevoSemestre && this.isPermisoGuardarCambiosSemestre));									
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.jInternalFrameDetalleFormSemestre.jMenuItemModificarSemestre.setVisible((this.isVisibilidadCeldaModificarSemestre && this.isPermisoActualizarSemestre));	
			this.jInternalFrameDetalleFormSemestre.jMenuItemActualizarSemestre.setVisible((this.isVisibilidadCeldaActualizarSemestre && this.isPermisoActualizarSemestre));	
			this.jInternalFrameDetalleFormSemestre.jMenuItemEliminarSemestre.setVisible((this.isVisibilidadCeldaEliminarSemestre && this.isPermisoEliminarSemestre));
			this.jInternalFrameDetalleFormSemestre.jMenuItemCancelarSemestre.setVisible(this.isVisibilidadCeldaCancelarSemestre);				
			}
			
			this.jMenuItemGuardarCambiosSemestre.setVisible((this.isVisibilidadCeldaGuardarSemestre && this.isPermisoGuardarCambiosSemestre));						
			this.jMenuItemGuardarCambiosTablaSemestre.setVisible((this.isVisibilidadCeldaGuardarCambiosSemestre && this.isPermisoGuardarCambiosSemestre));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSemestre=this.jButtonNuevoSemestre.isVisible();
			this.isVisibilidadCeldaDuplicarSemestre=this.jButtonDuplicarSemestre.isVisible();
			this.isVisibilidadCeldaCopiarSemestre=this.jButtonCopiarSemestre.isVisible();
			this.isVisibilidadCeldaVerFormSemestre=this.jButtonVerFormSemestre.isVisible();
			
			this.isVisibilidadCeldaOrdenSemestre=this.jButtonAbrirOrderBySemestre.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSemestre=this.jButtonNuevoRelacionesSemestre.isVisible();
			this.isVisibilidadCeldaModificarSemestre=this.jButtonModificarSemestre.isVisible();
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.isVisibilidadCeldaActualizarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonActualizarSemestre.isVisible();
			this.isVisibilidadCeldaEliminarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonEliminarSemestre.isVisible();
			this.isVisibilidadCeldaCancelarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonCancelarSemestre.isVisible();
			this.isVisibilidadCeldaGuardarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSemestre=this.jButtonGuardarCambiosTablaSemestre.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSemestre=this.jButtonNuevoToolBarSemestre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSemestre=this.jButtonNuevoRelacionesToolBarSemestre.isVisible();
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.isVisibilidadCeldaModificarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonModificarToolBarSemestre.isVisible();
			this.isVisibilidadCeldaActualizarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonActualizarToolBarSemestre.isVisible();
			this.isVisibilidadCeldaEliminarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonEliminarToolBarSemestre.isVisible();
			this.isVisibilidadCeldaCancelarSemestre=this.jInternalFrameDetalleFormSemestre.jButtonCancelarToolBarSemestre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSemestre=this.jButtonGuardarCambiosToolBarSemestre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSemestre=this.jButtonGuardarCambiosTablaToolBarSemestre.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSemestre=this.jMenuItemNuevoSemestre.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSemestre=this.jMenuItemNuevoRelacionesSemestre.isVisible();
			
			if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.isVisibilidadCeldaModificarSemestre=this.jInternalFrameDetalleFormSemestre.jMenuItemModificarSemestre.isVisible();
			this.isVisibilidadCeldaActualizarSemestre=this.jInternalFrameDetalleFormSemestre.jMenuItemActualizarSemestre.isVisible();
			this.isVisibilidadCeldaEliminarSemestre=this.jInternalFrameDetalleFormSemestre.jMenuItemEliminarSemestre.isVisible();
			this.isVisibilidadCeldaCancelarSemestre=this.jInternalFrameDetalleFormSemestre.jMenuItemCancelarSemestre.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSemestre=this.jMenuItemGuardarCambiosSemestre.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSemestre=this.jMenuItemGuardarCambiosTablaSemestre.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSemestre(Boolean esInicializar) {
		if(SemestreJInternalFrame.ISBINDING_MANUAL) {			
			if(this.semestreSessionBean.getConGuardarRelaciones()) {
				//if(this.semestreSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSemestre();
			}
			
			this.inicializarActualizarBindingBotonesManualSemestre(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSemestre() {
		this.jButtonNuevoSemestre.setVisible(this.isPermisoNuevoSemestre);			
		this.jButtonDuplicarSemestre.setVisible(this.isPermisoDuplicarSemestre);			
		this.jButtonCopiarSemestre.setVisible(this.isPermisoCopiarSemestre);			
		this.jButtonVerFormSemestre.setVisible(this.isPermisoVerFormSemestre);			
		
		this.jButtonAbrirOrderBySemestre.setVisible(this.isPermisoOrdenSemestre);					
		
		this.jButtonNuevoRelacionesSemestre.setVisible(this.isPermisoNuevoSemestre);			
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonModificarSemestre.setVisible(this.isPermisoActualizarSemestre);	
			this.jInternalFrameDetalleFormSemestre.jButtonActualizarSemestre.setVisible(this.isPermisoActualizarSemestre);	
			this.jInternalFrameDetalleFormSemestre.jButtonEliminarSemestre.setVisible(this.isPermisoEliminarSemestre);
			this.jInternalFrameDetalleFormSemestre.jButtonCancelarSemestre.setVisible(this.isVisibilidadCeldaCancelarSemestre);						
			this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.setVisible(this.isPermisoGuardarCambiosSemestre);							
		}
		
		this.jButtonGuardarCambiosTablaSemestre.setVisible(this.isPermisoActualizarSemestre);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSemestre() {
		this.jInternalFrameDetalleFormSemestre.jButtonModificarSemestre.setVisible(this.isPermisoActualizarSemestre);	
		this.jInternalFrameDetalleFormSemestre.jButtonActualizarSemestre.setVisible(this.isPermisoActualizarSemestre);	
		this.jInternalFrameDetalleFormSemestre.jButtonEliminarSemestre.setVisible(this.isPermisoEliminarSemestre);
		this.jInternalFrameDetalleFormSemestre.jButtonCancelarSemestre.setVisible(this.isVisibilidadCeldaCancelarSemestre);							
		this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.setVisible((this.isVisibilidadCeldaGuardarSemestre && this.isPermisoGuardarCambiosSemestre));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSemestre() {
		if(SemestreJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSemestre();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSemestre() {
	}
	
	public void jTableDatosSemestreListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSemestre(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSemestreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSemestre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSemestre(this.getsemestre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.semestre==null) {
						this.semestre = new Semestre();
					}

					this.setVariablesFormularioToObjetoActualSemestre(this.semestre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
				}

				if(this.semestre.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.semestre.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSemestre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSemestreBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSemestre.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSemestre(this.getsemestre(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.semestre==null) {
						this.semestre = new Semestre();
					}

					this.setVariablesFormularioToObjetoActualSemestre(this.semestre,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);
				}

				if(this.semestre.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.semestre.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSemestre(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameSemestre() {
		if(this.jInternalFrameDetalleFormSemestre!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
			this.jInternalFrameDetalleFormSemestre.setVisible(false);	    			
			this.jInternalFrameDetalleFormSemestre.dispose();
			this.jInternalFrameDetalleFormSemestre=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSemestre!=null) {
			this.jInternalFrameReporteDinamicoSemestre.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSemestre.dispose();
			this.jInternalFrameReporteDinamicoSemestre=null;
		}
		
		if(this.jInternalFrameImportacionSemestre!=null) {
			this.jInternalFrameImportacionSemestre.setVisible(false);	    			
			this.jInternalFrameImportacionSemestre.dispose();
			this.jInternalFrameImportacionSemestre=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSemestre();
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			
			if(sTipo.equals("NuevoSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSemestre")) {
				jButtonDuplicarSemestreActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSemestre")) {
				jButtonCopiarSemestreActionPerformed(evt);
			} else if(sTipo.equals("VerFormSemestre")) {
				jButtonVerFormSemestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSemestre")) {
				jButtonDuplicarSemestreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSemestre")) {
				jButtonDuplicarSemestreActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSemestre")) {
				jButtonModificarSemestreActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSemestre")) {
				jButtonModificarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSemestre")) {
				jButtonModificarSemestreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSemestre")) {
				jButtonActualizarSemestreActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSemestre")) {
				jButtonActualizarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSemestre")) {
				jButtonActualizarSemestreActionPerformed(evt);
			} else if(sTipo.equals("EliminarSemestre")) {
				jButtonEliminarSemestreActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSemestre")) {
				jButtonEliminarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSemestre")) {
				jButtonEliminarSemestreActionPerformed(evt);
			} else if(sTipo.equals("CancelarSemestre")) {
				jButtonCancelarSemestreActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSemestre")) {
				jButtonCancelarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSemestre")) {
				jButtonCancelarSemestreActionPerformed(evt);
			} else if(sTipo.equals("CerrarSemestre")) {
				jButtonCerrarSemestreActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSemestre")) {
				jButtonCerrarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSemestre")) {
				jButtonCerrarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSemestre")) {
				jButtonMostrarOcultarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSemestre")) {
				jButtonCancelarSemestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSemestre")) {
				jButtonCopiarSemestreActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSemestre")) {
				jButtonVerFormSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSemestre")) {
				jButtonCopiarSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSemestre")) {
				jButtonVerFormSemestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSemestre")) {
				jButtonRecargarInformacionSemestreActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSemestre")) {
				jButtonRecargarInformacionSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSemestre")) {
				jButtonRecargarInformacionSemestreActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSemestre")) {
				jButtonAnterioresSemestreActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSemestre")) {
				jButtonAnterioresSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSemestre")) {
				jButtonAnterioresSemestreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSemestre")) {
				jButtonSiguientesSemestreActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSemestre")) {
				jButtonSiguientesSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSemestre")) {
				jButtonSiguientesSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySemestre") || sTipo.equals("MenuItemDetalleAbrirOrderBySemestre")) {
				jButtonAbrirOrderBySemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSemestre") || sTipo.equals("MenuItemDetalleMostrarOcultarSemestre")) {
				jButtonMostrarOcultarSemestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSemestre")) {
				jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSemestre")) {
				jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSemestre")) {
				jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSemestre")) {
				jButtonCerrarReporteDinamicoSemestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSemestre")) {
				jButtonGenerarReporteDinamicoSemestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSemestre")) {
				
				jButtonGenerarExcelReporteDinamicoSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSemestre")) {
				jButtonCerrarImportacionSemestreActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSemestre")) {
				
				jButtonGenerarImportacionSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSemestre")) {
				
				jButtonAbrirImportacionSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSemestre")) {
				jComboBoxTiposAccionesSemestreActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSemestre")) {
				jComboBoxTiposRelacionesSemestreActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSemestre")) {
				jComboBoxTiposAccionesSemestreActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSemestre")) {
				
				jComboBoxTiposSeleccionarSemestreActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSemestre")) {
				jTextFieldValorCampoGeneralSemestreActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySemestre")) {
				jButtonAbrirOrderBySemestreActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSemestre")) {
				jButtonAbrirOrderBySemestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySemestre")) {
				jButtonCerrarOrderBySemestreActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSemestreBusqueda")) {
				this.jButtonidSemestreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSemestreBusqueda")) {
				this.jButtonnombreSemestreBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSemestre();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Semestre semestreLocal=null;
			
			if(!this.getEsControlTabla()) {
				semestreLocal=this.semestre;
			} else {
				semestreLocal=this.semestreAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
							
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
								
						
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
								
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
							
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
								
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
			
			this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSemestre")) {
					jCheckBoxSeleccionarTodosSemestreItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSemestre")) {
					jCheckBoxSeleccionadosSemestreItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSemestre")) {
					
				}
				
				


				
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
												
				
				


				
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSemestreActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.semestre);
				
				this.actualizarInformacion("INFO_PADRE",false,this.semestre);
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Semestre.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Semestre.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSemestreActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.semestreAnterior =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.semestreAnterior =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSemestre")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSemestreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSemestre.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.semestre =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.semestre =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.semestre);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSemestre")) {
				
				}
				
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSemestre")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSemestre.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSemestre")) {
			
			}
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSemestre();
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			if(sTipo.equals("NuevoSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSemestre")) {
				jButtonDuplicarSemestreActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSemestre")) {
				jButtonCopiarSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSemestre")) {
				jButtonVerFormSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSemestre")) {
				jButtonNuevoSemestreActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSemestre")) {
				jButtonModificarSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSemestre")) {
				jButtonActualizarSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSemestre")) {
				jButtonEliminarSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSemestre")) {
				jButtonCancelarSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSemestre")) {
				jButtonCerrarSemestreActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSemestre")) {
				jButtonGuardarCambiosSemestreActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSemestre")) {
				jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySemestre")) {
				jButtonAbrirOrderBySemestreActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSemestre")) {
				jButtonRecargarInformacionSemestreActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSemestre")) {
				jButtonAnterioresSemestreActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSemestre")) {
				jButtonSiguientesSemestreActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSemestreBusqueda")) {
				this.jButtonidSemestreBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSemestreBusqueda")) {
				this.jButtonnombreSemestreBusquedaActionPerformed(evt);
			}
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSemestre();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSemestre")) {
				closingInternalFrameSemestre();
				
			} else if(sTipo.equals("jButtonCancelarSemestre")) {
				JInternalFrameBase jInternalFrameDetalleFormSemestre = (JInternalFrameBase)evt.getSource();
	            	
	            SemestreBeanSwingJInternalFrame jInternalFrameParent=(SemestreBeanSwingJInternalFrame)jInternalFrameDetalleFormSemestre.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSemestreActionPerformed(null);
			}
			
			SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.semestre,new Object(),this.semestreParameterGeneral,this.semestreReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSemestre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSemestre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSemestre(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.semestre)) {
			if(!esControlTabla) {
				if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSemestre(this.semestre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);			
				}
				
				if(this.semestreSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSemestre(this.semestre,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.semestreReturnGeneral=semestreLogic.procesarEventosSemestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.semestreLogic.getSemestres(),this.semestre,this.semestreParameterGeneral,this.isEsNuevoSemestre,classes);//this.semestreLogic.getSemestre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSemestre(this.semestreReturnGeneral,this.semestreBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.semestreSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSemestre(classes,this.semestreReturnGeneral,this.semestreBean,false);
					}
						
					if(this.semestreReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySemestre(this.semestreReturnGeneral.getSemestre());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSemestre(this.semestreReturnGeneral.getSemestre());	
					}
						
					if(this.semestreReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSemestre(this.semestreReturnGeneral.getSemestre(),classes);//this.semestreBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSemestre(this.semestre,classes);//this.semestreBean);									
				}
			
				if(SemestreJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSemestre(this.semestre,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSemestre(this.semestre);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.semestreAnterior!=null) {
						this.semestre=this.semestreAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.semestreReturnGeneral=semestreLogic.procesarEventosSemestresWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.semestreLogic.getSemestres(),this.semestre,this.semestreParameterGeneral,this.isEsNuevoSemestre,classes);//this.semestreLogic.getSemestre()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.semestreSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.semestreSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.semestreReturnGeneral.getSemestre(),semestreLogic.getSemestres());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.semestreReturnGeneral.getSemestre(),this.semestres);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSemestre.repaint();
				
				//((AbstractTableModel) this.jTableDatosSemestre.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSemestre();
			}
		}
	}
	
	public void actualizarVisualTableDatosSemestre() throws Exception {
		
		SemestreModel semestreModel=(SemestreModel)this.jTableDatosSemestre.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			semestreModel.semestres=this.semestreLogic.getSemestres();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			semestreModel.semestres=this.semestres;
		}
		
		
		((SemestreModel) this.jTableDatosSemestre.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSemestre() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsemestreAnterior(),this.semestreLogic.getSemestres());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsemestreAnterior(),this.semestres);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSemestre();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSemestre(Semestre semestre,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.semestre,new Object(),generalEntityParameterGeneral,this.semestreReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.semestreSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SemestreConstantesFunciones.getClassesRelationshipsOfSemestre(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SemestreConstantesFunciones.getClassesRelationshipsFromStringsOfSemestre(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSemestre(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SemestreBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.semestre,new Object(),generalEntityParameterGeneral,this.semestreReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSemestre(SemestreBean semestreBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSemestre(ArrayList<Classe> classes,SemestreReturnGeneral semestreReturnGeneral,SemestreBean semestreBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSemestre(Semestre semestre,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.semestre)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSemestre = new SemestreDetalleFormJInternalFrame(jDesktopPane,this.semestreSessionBean.getConGuardarRelaciones(),this.semestreSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSemestre);
		this.jInternalFrameDetalleFormSemestre.setVisible(false);
		this.jInternalFrameDetalleFormSemestre.setSelected(false);						
		
		this.jInternalFrameDetalleFormSemestre.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSemestre.semestreLogic=this.semestreLogic;
		
		this.cargarCombosFrameForeignKeySemestre("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSemestre();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSemestre();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySemestre("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySemestre();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSemestre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSemestre"));
		
		this.jInternalFrameDetalleFormSemestre.jButtonModificarSemestre.addActionListener(new ButtonActionListener(this,"ModificarSemestre"));

		
		this.jInternalFrameDetalleFormSemestre.jButtonModificarToolBarSemestre.addActionListener(new ButtonActionListener(this,"ModificarToolBarSemestre"));
					
		this.jInternalFrameDetalleFormSemestre.jMenuItemModificarSemestre.addActionListener(new ButtonActionListener(this,"MenuItemModificarSemestre"));		
		
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonActualizarSemestre.addActionListener (new ButtonActionListener(this,"ActualizarSemestre"));
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonActualizarToolBarSemestre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSemestre"));
						
		this.jInternalFrameDetalleFormSemestre.jMenuItemActualizarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSemestre"));		
		
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonEliminarSemestre.addActionListener (new ButtonActionListener(this,"EliminarSemestre"));
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonEliminarToolBarSemestre.addActionListener (new ButtonActionListener(this,"EliminarToolBarSemestre"));
								
		this.jInternalFrameDetalleFormSemestre.jMenuItemEliminarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSemestre"));		
		
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonCancelarSemestre.addActionListener (new ButtonActionListener(this,"CancelarSemestre"));
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonCancelarToolBarSemestre.addActionListener (new ButtonActionListener(this,"CancelarToolBarSemestre"));
					
		this.jInternalFrameDetalleFormSemestre.jMenuItemCancelarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSemestre"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSemestre.jMenuItemDetalleCerrarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSemestre"));		
		
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosToolBarSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSemestre"));
		
		
		
		this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosToolBarSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSemestre"));
		
		
		
		this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSemestre"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSemestre.jButtonidSemestreBusqueda.addActionListener(new ButtonActionListener(this,"idSemestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSemestre.jButtonnombreSemestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreSemestreBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSemestre"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSemestre"));
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSemestre"));
		}
		
		this.jTableDatosSemestre.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSemestre"));
		
		this.jTableDatosSemestre.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSemestre"));
		
		this.jButtonNuevoSemestre.addActionListener(new ButtonActionListener(this,"NuevoSemestre"));
		
		this.jButtonDuplicarSemestre.addActionListener(new ButtonActionListener(this,"DuplicarSemestre"));
		
		this.jButtonCopiarSemestre.addActionListener(new ButtonActionListener(this,"CopiarSemestre"));
		
		this.jButtonVerFormSemestre.addActionListener(new ButtonActionListener(this,"VerFormSemestre"));
		
		
		this.jButtonNuevoToolBarSemestre.addActionListener(new ButtonActionListener(this,"NuevoToolBarSemestre"));
			
		this.jButtonDuplicarToolBarSemestre.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSemestre"));
			
		this.jMenuItemNuevoSemestre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSemestre"));
			
		this.jMenuItemDuplicarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSemestre"));		
		
		
		this.jButtonNuevoRelacionesSemestre.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSemestre"));
		
		
		this.jButtonNuevoRelacionesToolBarSemestre.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSemestre"));
			
		this.jMenuItemNuevoRelacionesSemestre.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSemestre"));		
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonModificarSemestre.addActionListener(new ButtonActionListener(this,"ModificarSemestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonModificarToolBarSemestre.addActionListener(new ButtonActionListener(this,"ModificarToolBarSemestre"));
			
			this.jInternalFrameDetalleFormSemestre.jMenuItemModificarSemestre.addActionListener(new ButtonActionListener(this,"MenuItemModificarSemestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSemestre.jButtonActualizarSemestre.addActionListener (new ButtonActionListener(this,"ActualizarSemestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonActualizarToolBarSemestre.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSemestre"));
				
			this.jInternalFrameDetalleFormSemestre.jMenuItemActualizarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSemestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonEliminarSemestre.addActionListener (new ButtonActionListener(this,"EliminarSemestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonEliminarToolBarSemestre.addActionListener (new ButtonActionListener(this,"EliminarToolBarSemestre"));
						
			this.jInternalFrameDetalleFormSemestre.jMenuItemEliminarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSemestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonCancelarSemestre.addActionListener (new ButtonActionListener(this,"CancelarSemestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonCancelarToolBarSemestre.addActionListener (new ButtonActionListener(this,"CancelarToolBarSemestre"));
			
			this.jInternalFrameDetalleFormSemestre.jMenuItemCancelarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSemestre"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSemestre.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSemestre"));		
		
		
		this.jButtonCerrarSemestre.addActionListener (new ButtonActionListener(this,"CerrarSemestre"));
		
		
		this.jButtonCerrarToolBarSemestre.addActionListener (new ButtonActionListener(this,"CerrarToolBarSemestre"));
			
		this.jMenuItemCerrarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSemestre"));
			
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jMenuItemDetalleCerrarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSemestre"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosSemestre"));
		}
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosToolBarSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSemestre"));
		}
		
		this.jButtonCopiarToolBarSemestre.addActionListener (new ButtonActionListener(this,"CopiarToolBarSemestre"));
			
		this.jButtonVerFormToolBarSemestre.addActionListener (new ButtonActionListener(this,"VerFormToolBarSemestre"));
		
		this.jMenuItemGuardarCambiosSemestre.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSemestre"));
			
		this.jMenuItemCopiarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSemestre"));		
		
		this.jMenuItemVerFormSemestre.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSemestre"));		
		
		
		this.jButtonGuardarCambiosTablaSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSemestre"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSemestre"));
			
		this.jMenuItemGuardarCambiosTablaSemestre.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSemestre"));		
		
		
		
		this.jButtonRecargarInformacionSemestre.addActionListener (new ButtonActionListener(this,"RecargarInformacionSemestre"));
					
		this.jButtonRecargarInformacionToolBarSemestre.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSemestre"));
		
		this.jMenuItemRecargarInformacionSemestre.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSemestre"));		
		
		
		
		this.jButtonAnterioresSemestre.addActionListener (new ButtonActionListener(this,"AnterioresSemestre"));
		
		
		this.jButtonAnterioresToolBarSemestre.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSemestre"));
		
		this.jMenuItemAnterioresSemestre.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSemestre"));		
		
		
		this.jButtonSiguientesSemestre.addActionListener (new ButtonActionListener(this,"SiguientesSemestre"));
		
		
		this.jButtonSiguientesToolBarSemestre.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSemestre"));
			
		this.jMenuItemSiguientesSemestre.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSemestre"));
			
		this.jMenuItemAbrirOrderBySemestre.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySemestre"));
			
		this.jMenuItemMostrarOcultarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSemestre"));
			
		this.jMenuItemDetalleAbrirOrderBySemestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySemestre"));
			
		this.jMenuItemDetalleMostarOcultarSemestre.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSemestre"));		
		
		
		this.jButtonNuevoGuardarCambiosSemestre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSemestre"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSemestre.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSemestre"));
			
		this.jMenuItemNuevoGuardarCambiosSemestre.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSemestre"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSemestre.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSemestre"));

		this.jCheckBoxSeleccionadosSemestre.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSemestre"));
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSemestre"));
		}
		
		
		this.jComboBoxTiposRelacionesSemestre.addActionListener (new ButtonActionListener(this,"TiposRelacionesSemestre"));
			
		this.jComboBoxTiposAccionesSemestre.addActionListener (new ButtonActionListener(this,"TiposAccionesSemestre"));
					
		this.jComboBoxTiposSeleccionarSemestre.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSemestre"));
			
		this.jTextFieldValorCampoGeneralSemestre.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSemestre"));		
		
		
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSemestre.jButtonidSemestreBusqueda.addActionListener(new ButtonActionListener(this,"idSemestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSemestre.jButtonnombreSemestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreSemestreBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSemestre!=null) {
				this.jInternalFrameReporteDinamicoSemestre.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSemestre"));
				this.jInternalFrameReporteDinamicoSemestre.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSemestre"));
				this.jInternalFrameReporteDinamicoSemestre.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSemestre"));
			}
			
			//this.jButtonCerrarReporteDinamicoSemestre.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSemestre"));				
			//this.jButtonGenerarReporteDinamicoSemestre.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSemestre"));
			//this.jButtonGenerarExcelReporteDinamicoSemestre.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSemestre"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSemestre!=null) {
				this.jInternalFrameImportacionSemestre.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSemestre"));
				this.jInternalFrameImportacionSemestre.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSemestre"));
				this.jInternalFrameImportacionSemestre.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSemestre"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySemestre.addActionListener (new ButtonActionListener(this,"AbrirOrderBySemestre"));
			
			this.jButtonAbrirOrderByToolBarSemestre.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSemestre"));			
			
			if(this.jInternalFrameOrderBySemestre!=null) {
				this.jInternalFrameOrderBySemestre.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySemestre"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSemestre!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSemestre.jTabbedPaneRelacionesSemestre.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSemestre"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameSemestre();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSemestre.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSemestre = (JInternalFrameBase)event.getSource();
	            	
	            SemestreBeanSwingJInternalFrame jInternalFrameParent=(SemestreBeanSwingJInternalFrame)jInternalFrameDetalleFormSemestre.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSemestreActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSemestre.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSemestreListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSemestre.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSemestre.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSemestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSemestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSemestreActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSemestre";
		inputMap = this.jButtonNuevoSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSemestreActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSemestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSemestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSemestreActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSemestre";
		inputMap = this.jButtonNuevoRelacionesSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSemestreActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSemestre";
		inputMap = this.jButtonModificarSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSemestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSemestre";
		inputMap = this.jButtonActualizarSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSemestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSemestre";
		inputMap = this.jButtonEliminarSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSemestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSemestre";
		inputMap = this.jButtonCancelarSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSemestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSemestre";
		inputMap = this.jButtonCerrarSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSemestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSemestre";
		inputMap = this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSemestre.jButtonGuardarCambiosSemestre.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSemestreActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSemestre.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSemestreItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSemestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSemestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSemestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSemestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSemestre.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSemestreActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSemestre.jButtonidSemestreBusqueda.addActionListener(new ButtonActionListener(this,"idSemestreBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSemestre.jButtonnombreSemestreBusqueda.addActionListener(new ButtonActionListener(this,"nombreSemestreBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSemestre.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSemestreActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSemestreActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSemestre.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSemestre(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
					semestreAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Semestre semestreAux:semestres) {
					semestreAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSemestreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSemestre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
						semestreAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Semestre semestreAux:semestres) {
						semestreAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Semestre semestreAux:semestres) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSemestre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSemestre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSemestre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSemestre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSemestreItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSemestre(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSemestre.getSelectedRows();
			
			Semestre semestreLocal=new Semestre();
			
			//this.seleccionarTodosSemestre(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					semestreLocal =(Semestre) this.semestreLogic.getSemestres().toArray()[this.jTableDatosSemestre.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					semestreLocal =(Semestre) this.semestres.toArray()[this.jTableDatosSemestre.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				semestreLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
						semestreAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Semestre semestreAux:semestres) {
						semestreAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSemestre(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSemestre.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSemestre.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSemestre,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSemestreItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSemestreParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSemestreActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSemestre(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSemestre.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Semestre semestreAux:this.semestreLogic.getSemestres()) {
				
						if(sTipoSeleccionar.equals(SemestreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							semestreAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Semestre semestreAux:semestres) {
					
						if(sTipoSeleccionar.equals(SemestreConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							semestreAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSemestre(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSemestreActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSemestre(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSemestre=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSemestre.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSemestre) {				
					conSplash=true;//false;										
					
					//this.startProcessSemestre(conSplash);
				
					this.generarReporteSemestresSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSemestresSeleccionados();
				//this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSemestresSeleccionados(false);
				//this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSemestresSeleccionados(true);
				//this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSemestre();
				
				this.exportarSemestresSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSemestres();
				//this.importarSemestres();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSemestre();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSemestresSeleccionados();
				//this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Semestre", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSemestre();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSemestre)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySemestre(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSemestre.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSemestre.jComboBoxTiposAccionesFormularioSemestre.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSemestre();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSemestre(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSemestreActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSemestre();
			
			if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
			Semestre semestre=new Semestre();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSemestre(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSemestre.getSelectedItem();
			
			
			
			
			semestresSeleccionados=this.getSemestresSeleccionados(true);
			//this.sTipoAccion;
			
			if(semestresSeleccionados.size()==1) {
				for(Semestre semestreAux:semestresSeleccionados) {
					semestre=semestreAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSemestre();
			
      		//this.finishProcessSemestre(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSemestreReturnGeneral() throws Exception {
		if(this.semestreReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.semestreReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.semestreReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.semestreReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.semestreReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.semestreReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSemestre(false);
		}
		
		if(this.semestreReturnGeneral.getConRetornoLista() || this.semestreReturnGeneral.getConRetornoObjeto()) {
			if(this.semestreReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.semestreLogic.setSemestres(this.semestreReturnGeneral.getSemestres());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.semestreReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.semestreLogic.setSemestre(this.semestreReturnGeneral.getSemestre());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSemestre(false);
		}
	}
	
	public void actualizarParametrosGeneralSemestre() throws Exception {
		
		
	}
	
	public ArrayList<Semestre> getSemestresSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSemestre) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Semestre semestreAux:semestreLogic.getSemestres()) {
					if(semestreAux.getIsSelected()) {
						semestresSeleccionados.add(semestreAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Semestre semestreAux:this.semestres) {
					if(semestreAux.getIsSelected()) {
						semestresSeleccionados.add(semestreAux);				
					}
				}
			}
			
			if(semestresSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						semestresSeleccionados.addAll(this.semestreLogic.getSemestres());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						semestresSeleccionados.addAll(this.semestres);				
					}
				}
			}
		} else {
			semestresSeleccionados.add(this.semestre);
		}
		
		return semestresSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteSemestresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSemestresSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSemestresSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSemestresSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSemestresSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Semestre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSemestresSeleccionados() throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSemestres("Todos",semestresSeleccionados);
		
	}	
	
	public void generarReporteNormalSemestresSeleccionados() throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSemestres("Todos",semestresSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSemestresSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSemestres("Todos",semestresSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSemestresSeleccionados() throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSemestre();
		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSemestre();
		
		
		//this.generarReporteSemestres("Todos",semestresSeleccionados ,semestreImplementable,semestreImplementableHome);
	}
	
	public void mostrarImportacionSemestres() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSemestre();
		
		this.abrirFrameImportacionSemestre();		
		
			
		//this.generarReporteSemestres("Todos",semestresSeleccionados ,semestreImplementable,semestreImplementableHome);
	}
	
	public void importarSemestres() throws Exception {		
	
	}
	
	public void exportarSemestresSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSemestresSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSemestresSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSemestresSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Semestre",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSemestresSeleccionados() throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSemestre(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Semestre semestreAux:semestresSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSemestre(semestreAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//semestreAux.setsDetalleGeneralEntityReporte(semestreAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSemestre(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SemestreConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SemestreConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SemestreConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSemestre(Semestre semestre,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=semestre.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=semestre.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=semestre.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSemestresSeleccionados() throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Semestres");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSemestre(row);				
				iRow++;
			}				
			
			for(Semestre semestreAux:semestresSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSemestre(semestreAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSemestresSeleccionados() throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();		
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"semestre.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("semestres");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("semestre");
			//elementRoot.appendChild(element);
		
			for(Semestre semestreAux:semestresSeleccionados) {
				element = document.createElement("semestre");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSemestre(semestreAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.semestreSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Semestre",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSemestre(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SemestreConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SemestreConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SemestreConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSemestre(Semestre semestre,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(semestre.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(semestre.getnombre());				
	}
	
	public void setFilaDatosExportarXmlSemestre(Semestre semestre,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SemestreConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(semestre.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SemestreConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(semestre.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(SemestreConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(semestre.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoSemestresSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Semestre> semestresSeleccionados=new ArrayList<Semestre>();
		
		semestresSeleccionados=this.getSemestresSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoSemestre(semestresSeleccionados);
		
		this.generarReporteSemestres("Todos",semestresSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSemestre(ArrayList<Semestre> semestresSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Semestre semestreAux:semestresSeleccionados) {
				semestreAux.setsDetalleGeneralEntityReporte(semestreAux.toString());
			
				if(sTipoSeleccionar.equals(SemestreConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					semestreAux.setsDescripcionGeneralEntityReporte1(semestreAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SemestreConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSemestre(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSemestre=true;
				this.isVisibilidadCeldaNuevoRelacionesSemestre=true;
				this.isVisibilidadCeldaGuardarCambiosSemestre=true;
			}
			
			this.isVisibilidadCeldaModificarSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=false;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=true;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
			this.isVisibilidadCeldaModificarSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=true;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=true;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
			this.isVisibilidadCeldaModificarSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=true;
			this.isVisibilidadCeldaEliminarSemestre=true;
			this.isVisibilidadCeldaCancelarSemestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=true;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
			this.isVisibilidadCeldaModificarSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=true;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=false;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSemestre=true;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=true;
			this.isVisibilidadCeldaGuardarCambiosSemestre=true;
			this.isVisibilidadCeldaModificarSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=false;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=true;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
			this.isVisibilidadCeldaActualizarSemestre=false;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=false;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
			this.isVisibilidadCeldaModificarSemestre=true;
			this.isVisibilidadCeldaActualizarSemestre=false;
			this.isVisibilidadCeldaEliminarSemestre=false;
			this.isVisibilidadCeldaCancelarSemestre=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSemestre=false;
				} else {
					this.isVisibilidadCeldaGuardarSemestre=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SemestreJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSemestre=true;
			this.isVisibilidadCeldaNuevoRelacionesSemestre=true;
			this.isVisibilidadCeldaGuardarCambiosSemestre=true;
		} else {
			this.actualizarEstadoPanelsSemestre(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSemestre=false;
			//this.isVisibilidadCeldaVerFormSemestre=false;
			this.isVisibilidadCeldaDuplicarSemestre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!semestreSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
		} else {
			this.isVisibilidadCeldaNuevoSemestre=false;
			this.isVisibilidadCeldaGuardarCambiosSemestre=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(semestreSessionBean.getEsGuardarRelacionado()) {
			if(!semestreSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSemestre=false;												
			}
			
			this.jButtonCerrarSemestre.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSemestre=false;
		}
		
		if(!this.permiteMantenimiento(this.semestre)) {
			this.isVisibilidadCeldaActualizarSemestre=false;
			this.isVisibilidadCeldaEliminarSemestre=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSemestre() {
	}
	
	public void actualizarEstadoPanelsSemestre(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(false);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSemestre!=null) {
				this.jScrollPanelDatosEdicionSemestre.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSemestre!=null) {
				this.jScrollPanelDatosSemestre.setVisible(true);
			}
			
			if(this.jPanelPaginacionSemestre!=null) {
				this.jPanelPaginacionSemestre.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSemestre!=null) {
				this.jPanelParametrosReportesSemestre.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.semestreSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.semestreSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SemestreSessionBean semestreSessionBean=new SemestreSessionBean();
		
		if(this.semestreSessionBean==null) {
			this.semestreSessionBean=new SemestreSessionBean();
		}
		
		this.semestreSessionBean.setsUltimaBusquedaSemestre(this.getsAccionBusqueda());
		this.semestreSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.semestreSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SemestreSessionBean semestreSessionBean=new SemestreSessionBean();
		
		if(this.semestreSessionBean==null) {
			this.semestreSessionBean=new SemestreSessionBean();
		}
		
		if(this.semestreSessionBean.getsUltimaBusquedaSemestre()!=null&&!this.semestreSessionBean.getsUltimaBusquedaSemestre().equals("")) {
			this.setsAccionBusqueda(semestreSessionBean.getsUltimaBusquedaSemestre());
			this.setiNumeroPaginacion(semestreSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(semestreSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.semestreSessionBean.setsUltimaBusquedaSemestre("");
		this.semestreSessionBean.setiNumeroPaginacion(SemestreConstantesFunciones.INUMEROPAGINACION);
		this.semestreSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSemestre(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSemestre() {
		this.updateBorderResaltarBusquedasFormularioSemestre();
		this.updateVisibilidadBusquedasFormularioSemestre();
		this.updateHabilitarBusquedasFormularioSemestre();
	}
	
	public void updateBorderResaltarBusquedasFormularioSemestre() {					
	}
	
	public void updateVisibilidadBusquedasFormularioSemestre() {
	}
	
	public void updateHabilitarBusquedasFormularioSemestre() {
	}
	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioSemestre() throws Exception {

		if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSemestre();
		this.updateVisibilidadResaltarControlesFormularioSemestre();
		this.updateHabilitarResaltarControlesFormularioSemestre();
		
	}
	
	public void updateBorderResaltarControlesFormularioSemestre() throws Exception {
		if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.semestreConstantesFunciones.resaltaridSemestre!=null && this.jInternalFrameDetalleFormSemestre!=null) {this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setBorder(this.semestreConstantesFunciones.resaltaridSemestre);}
		if(this.semestreConstantesFunciones.resaltarnombreSemestre!=null && this.jInternalFrameDetalleFormSemestre!=null) {this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setBorder(this.semestreConstantesFunciones.resaltarnombreSemestre);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSemestre() throws Exception {		
		if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
	
		//this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setVisible(this.semestreConstantesFunciones.mostraridSemestre);
		this.jInternalFrameDetalleFormSemestre.jPanelidSemestre.setVisible(this.semestreConstantesFunciones.mostraridSemestre);
		//this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setVisible(this.semestreConstantesFunciones.mostrarnombreSemestre);
		this.jInternalFrameDetalleFormSemestre.jPanelnombreSemestre.setVisible(this.semestreConstantesFunciones.mostrarnombreSemestre);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSemestre() throws Exception {
		if(this.jInternalFrameDetalleFormSemestre==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSemestre!=null) {
	
		this.jInternalFrameDetalleFormSemestre.jTextFieldidSemestre.setEnabled(this.semestreConstantesFunciones.activaridSemestre);
		this.jInternalFrameDetalleFormSemestre.jTextFieldnombreSemestre.setEnabled(this.semestreConstantesFunciones.activarnombreSemestre);
		}
	}
	
		
}