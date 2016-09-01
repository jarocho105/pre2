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

import com.bydan.erp.seguridad.util.MesConstantesFunciones;
import com.bydan.erp.seguridad.util.MesParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.MesParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.MesBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;









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




@SuppressWarnings("unused")
public class MesBeanSwingJInternalFrame extends MesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(MesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Mes> mesValidator = new ClassValidator<Mes>(Mes.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Mes mes;	
	public Mes mesAux;
	public Mes mesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Mes mesTotales;
	public Long idMesActual;
	public Long iIdNuevoMes=0L;
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
	
	public Boolean isPermisoTodoMes;
	public Boolean isPermisoNuevoMes;
	public Boolean isPermisoActualizarMes;
	public Boolean isPermisoActualizarOriginalMes;
	public Boolean isPermisoEliminarMes;
	public Boolean isPermisoGuardarCambiosMes;
	public Boolean isPermisoConsultaMes;
	public Boolean isPermisoBusquedaMes;
	public Boolean isPermisoReporteMes;
	public Boolean isPermisoPaginacionMedioMes;
	public Boolean isPermisoPaginacionAltoMes;
	public Boolean isPermisoPaginacionTodoMes;
	public Boolean isPermisoCopiarMes;
	public Boolean isPermisoVerFormMes;
	public Boolean isPermisoDuplicarMes;
	public Boolean isPermisoOrdenMes;
	
	
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
	
	public MesParameterReturnGeneral mesReturnGeneral;
	public MesParameterReturnGeneral mesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoMes=false;
	public Boolean esParaAccionDesdeFormularioMes=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public MesLogic mesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Mes mesBean;
	public MesConstantesFunciones mesConstantesFunciones;
	//public MesParameterReturnGeneral mesReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Mes> mess;	
	//public List<Mes> messEliminados;
	//public List<Mes> messAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoMes=false;
	public Boolean isVisibilidadCeldaDuplicarMes=true;
	public Boolean isVisibilidadCeldaCopiarMes=true;
	public Boolean isVisibilidadCeldaVerFormMes=true;
	public Boolean isVisibilidadCeldaOrdenMes=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesMes=false;
	public Boolean isVisibilidadCeldaModificarMes=false;
	public Boolean isVisibilidadCeldaActualizarMes=false;
	public Boolean isVisibilidadCeldaEliminarMes=false;
	public Boolean isVisibilidadCeldaCancelarMes=false;
	public Boolean isVisibilidadCeldaGuardarMes=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosMes=false;	
	
	
	
	public Long getiIdNuevoMes() {
		return this.iIdNuevoMes;
	}

	public void setiIdNuevoMes(Long iIdNuevoMes) {
		this.iIdNuevoMes = iIdNuevoMes;
	}
	
	public Long getidMesActual() {
		return this.idMesActual;
	}

	public void setidMesActual(Long idMesActual) {
		this.idMesActual = idMesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Mes getmes() {
		return this.mes;
	}

	public void setmes(Mes mes) {
		this.mes = mes;
	}
	
	public Mes getmesAux() {
		return this.mesAux;
	}

	public void setmesAux(Mes mesAux) {
		this.mesAux = mesAux;
	}				
	
	public Mes getmesAnterior() {
		return this.mesAnterior;
	}

	public void setmesAnterior(Mes mesAnterior) {
		this.mesAnterior = mesAnterior;
	}	
	
	public Mes getmesTotales() {
		return this.mesTotales;
	}

	public void setmesTotales(Mes mesTotales) {
		this.mesTotales = mesTotales;
	}	
	
	public Mes getmesBean() {
		return this.mesBean;
	}

	public void setmesBean(Mes mesBean) {
		this.mesBean = mesBean;
	}	
	
	public MesParameterReturnGeneral getmesReturnGeneral() {
		return this.mesReturnGeneral;
	}

	public void setmesReturnGeneral(MesParameterReturnGeneral mesReturnGeneral) {
		this.mesReturnGeneral = mesReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public MesLogic getMesLogic()	{		
		return mesLogic;
	}

	public void setMesLogic(MesLogic mesLogic) {
		this.mesLogic = mesLogic;
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
	
	public Boolean getIsEsNuevoMes() {
		return isEsNuevoMes;
	}

	public void setIsEsNuevoMes(Boolean isEsNuevoMes) {
		this.isEsNuevoMes = isEsNuevoMes;
	}

	public Boolean getEsParaAccionDesdeFormularioMes() {
		return esParaAccionDesdeFormularioMes;
	}
	
	public void setEsParaAccionDesdeFormularioMes(Boolean esParaAccionDesdeFormularioMes) {
		this.esParaAccionDesdeFormularioMes = esParaAccionDesdeFormularioMes;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesMes() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			MesConstantesFunciones.refrescarForeignKeysDescripcionesMes(this.mesLogic.getMess());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			MesConstantesFunciones.refrescarForeignKeysDescripcionesMes(this.mess);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//mesLogic.setMess(this.mess);
			mesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public MesParameterReturnGeneral getMesParameterGeneral() {
		return this.mesParameterGeneral;
	}
	
	public void setMesParameterGeneral(MesParameterReturnGeneral mesParameterGeneral) {
		this.mesParameterGeneral = mesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoMes() {
		return isPermisoTodoMes;
	}

	public void setIsPermisoTodoMes(Boolean isPermisoTodoMes) {
		this.isPermisoTodoMes = isPermisoTodoMes;
	}

	public Boolean getIsPermisoNuevoMes() {
		return isPermisoNuevoMes;
	}

	public void setIsPermisoNuevoMes(Boolean isPermisoNuevoMes) {
		this.isPermisoNuevoMes = isPermisoNuevoMes;
	}

	public Boolean getIsPermisoActualizarMes() {
		return isPermisoActualizarMes;
	}

	public void setIsPermisoActualizarMes(Boolean isPermisoActualizarMes) {
		this.isPermisoActualizarMes = isPermisoActualizarMes;
	}

	public Boolean getIsPermisoEliminarMes() {
		return isPermisoEliminarMes;
	}

	public void setIsPermisoEliminarMes(Boolean isPermisoEliminarMes) {
		this.isPermisoEliminarMes = isPermisoEliminarMes;
	}

	public Boolean getIsPermisoGuardarCambiosMes() {
		return isPermisoGuardarCambiosMes;
	}

	public void setIsPermisoGuardarCambiosMes(Boolean isPermisoGuardarCambiosMes) {
		this.isPermisoGuardarCambiosMes = isPermisoGuardarCambiosMes;
	}
	
	public Boolean getIsPermisoConsultaMes() {
		return isPermisoConsultaMes;
	}

	public void setIsPermisoConsultaMes(Boolean isPermisoConsultaMes) {
		this.isPermisoConsultaMes = isPermisoConsultaMes;
	}

	public Boolean getIsPermisoBusquedaMes() {
		return isPermisoBusquedaMes;
	}

	public void setIsPermisoBusquedaMes(Boolean isPermisoBusquedaMes) {
		this.isPermisoBusquedaMes = isPermisoBusquedaMes;
	}

	public Boolean getIsPermisoReporteMes() {
		return isPermisoReporteMes;
	}

	public void setIsPermisoReporteMes(Boolean isPermisoReporteMes) {
		this.isPermisoReporteMes = isPermisoReporteMes;
	}
	
	public Boolean getIsPermisoPaginacionMedioMes() {
		return isPermisoPaginacionMedioMes;
	}

	public void setIsPermisoPaginacionMedioMes(Boolean isPermisoPaginacionMedioMes) {
		this.isPermisoPaginacionMedioMes = isPermisoPaginacionMedioMes;
	}
	
	public Boolean getIsPermisoPaginacionTodoMes() {
		return isPermisoPaginacionTodoMes;
	}

	public void setIsPermisoPaginacionTodoMes(Boolean isPermisoPaginacionTodoMes) {
		this.isPermisoPaginacionTodoMes = isPermisoPaginacionTodoMes;
	}
	
	public Boolean getIsPermisoPaginacionAltoMes() {
		return isPermisoPaginacionAltoMes;
	}

	public void setIsPermisoPaginacionAltoMes(Boolean isPermisoPaginacionAltoMes) {
		this.isPermisoPaginacionAltoMes = isPermisoPaginacionAltoMes;
	}
	
	public Boolean getIsPermisoCopiarMes() {
		return isPermisoCopiarMes;
	}

	public void setIsPermisoCopiarMes(Boolean isPermisoCopiarMes) {
		this.isPermisoCopiarMes = isPermisoCopiarMes;
	}
	
	public Boolean getIsPermisoVerFormMes() {
		return isPermisoVerFormMes;
	}

	public void setIsPermisoVerFormMes(Boolean isPermisoVerFormMes) {
		this.isPermisoVerFormMes = isPermisoVerFormMes;
	}
	
	public Boolean getIsPermisoDuplicarMes() {
		return isPermisoDuplicarMes;
	}

	public void setIsPermisoDuplicarMes(Boolean isPermisoDuplicarMes) {
		this.isPermisoDuplicarMes = isPermisoDuplicarMes;
	}
	
	public Boolean getIsPermisoOrdenMes() {
		return isPermisoOrdenMes;
	}

	public void setIsPermisoOrdenMes(Boolean isPermisoOrdenMes) {
		this.isPermisoOrdenMes = isPermisoOrdenMes;
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
	
	public Boolean getIsVisibilidadCeldaNuevoMes() {
		return isVisibilidadCeldaNuevoMes;
	}

	public void setIsVisibilidadCeldaNuevoMes(Boolean isVisibilidadCeldaNuevoMes) {
		this.isVisibilidadCeldaNuevoMes = isVisibilidadCeldaNuevoMes;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarMes() {
		return isVisibilidadCeldaDuplicarMes;
	}

	public void setIsVisibilidadCeldaDuplicarMes(Boolean isVisibilidadCeldaDuplicarMes) {
		this.isVisibilidadCeldaDuplicarMes = isVisibilidadCeldaDuplicarMes;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarMes() {
		return isVisibilidadCeldaCopiarMes;
	}

	public void setIsVisibilidadCeldaCopiarMes(Boolean isVisibilidadCeldaCopiarMes) {
		this.isVisibilidadCeldaCopiarMes = isVisibilidadCeldaCopiarMes;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormMes() {
		return isVisibilidadCeldaVerFormMes;
	}

	public void setIsVisibilidadCeldaVerFormMes(Boolean isVisibilidadCeldaVerFormMes) {
		this.isVisibilidadCeldaVerFormMes = isVisibilidadCeldaVerFormMes;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenMes() {
		return isVisibilidadCeldaOrdenMes;
	}

	public void setIsVisibilidadCeldaOrdenMes(Boolean isVisibilidadCeldaOrdenMes) {
		this.isVisibilidadCeldaOrdenMes = isVisibilidadCeldaOrdenMes;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesMes() {
		return isVisibilidadCeldaNuevoRelacionesMes;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesMes(Boolean isVisibilidadCeldaNuevoRelacionesMes) {
		this.isVisibilidadCeldaNuevoRelacionesMes = isVisibilidadCeldaNuevoRelacionesMes;
	}
	
	public Boolean getIsVisibilidadCeldaModificarMes() {
		return isVisibilidadCeldaModificarMes;
	}

	public void setIsVisibilidadCeldaModificarMes(Boolean isVisibilidadCeldaModificarMes) {
		this.isVisibilidadCeldaModificarMes = isVisibilidadCeldaModificarMes;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarMes() {
		return isVisibilidadCeldaActualizarMes;
	}

	public void setIsVisibilidadCeldaActualizarMes(Boolean isVisibilidadCeldaActualizarMes) {
		this.isVisibilidadCeldaActualizarMes = isVisibilidadCeldaActualizarMes;
	}

	public Boolean getIsVisibilidadCeldaEliminarMes() {
		return isVisibilidadCeldaEliminarMes;
	}

	public void setIsVisibilidadCeldaEliminarMes(Boolean isVisibilidadCeldaEliminarMes) {
		this.isVisibilidadCeldaEliminarMes = isVisibilidadCeldaEliminarMes;
	}

	public Boolean getIsVisibilidadCeldaCancelarMes() {
		return isVisibilidadCeldaCancelarMes;
	}

	public void setIsVisibilidadCeldaCancelarMes(Boolean isVisibilidadCeldaCancelarMes) {
		this.isVisibilidadCeldaCancelarMes = isVisibilidadCeldaCancelarMes;
	}

	public Boolean getIsVisibilidadCeldaGuardarMes() {
		return isVisibilidadCeldaGuardarMes;
	}

	public void setIsVisibilidadCeldaGuardarMes(Boolean isVisibilidadCeldaGuardarMes) {
		this.isVisibilidadCeldaGuardarMes = isVisibilidadCeldaGuardarMes;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosMes() {
		return isVisibilidadCeldaGuardarCambiosMes;
	}

	public void setIsVisibilidadCeldaGuardarCambiosMes(Boolean isVisibilidadCeldaGuardarCambiosMes) {
		this.isVisibilidadCeldaGuardarCambiosMes = isVisibilidadCeldaGuardarCambiosMes;
	}
		
	public MesSessionBean getmesSessionBean() {
		return this.mesSessionBean;
	}
	
	public void setmesSessionBean(MesSessionBean mesSessionBean) {
		this.mesSessionBean=mesSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysMes(Mes mes)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Mes mes,Mes mesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalMes(mes);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		mesAux.setId(mes.getId());
		mesAux.setVersionRow(mes.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessMes();
		
			int intSelectedRow = this.jTableDatosMes.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualMes(this.mes,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = mesValidator.getInvalidValues(this.mes);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			mesLogic.setDatosCliente(datosCliente);
			mesLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				mesAux=new  Mes();
				
				mesAux.setIsNew(true);
				mesAux.setIsChanged(true);
				
				mesAux.setMesOriginal(this.mes);
				
				mesAux.setId(this.mes.getId());	
				mesAux.setVersionRow(this.mes.getVersionRow());	
				mesAux.setnombre(this.mes.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(mesAux,mesLogic.getMess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesAux,mess);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.mesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesLogic.saveMess();//WithConnection
						//mesLogic.getSetVersionRowMess();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mes,mesAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				mesAux=new  Mes();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.mesSessionBean.getEsGuardarRelacionado() 
					|| (this.mesSessionBean.getEsGuardarRelacionado() && this.mes.getId()>=0)) {
						
					mesAux.setIsNew(false);
				}
				
				mesAux.setIsDeleted(false);
			
				mesAux.setId(this.mes.getId());	
				mesAux.setVersionRow(this.mes.getVersionRow());	
				mesAux.setnombre(this.mes.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mesAux,mesLogic.getMess());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesAux,mess);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.mesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesLogic.saveMess();//WithConnection
						//mesLogic.getSetVersionRowMess();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.mes,mesAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				mesAux=new  Mes();
				
				mesAux.setIsNew(false);
				mesAux.setIsChanged(false);
				
				mesAux.setIsDeleted(true);
				
				mesAux.setId(this.mes.getId());	
				mesAux.setVersionRow(this.mes.getVersionRow());	
				mesAux.setnombre(this.mes.getnombre());	
				
				if(this.mesSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.mesAux.getId()>=0) {	
						this.messEliminados.add(mesAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(mesAux,mesLogic.getMess());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesAux,mess);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.mesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.mesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesLogic.saveMess();//WithConnection
						//mesLogic.getSetVersionRowMess();//WithConnection
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
					this.mesLogic.getMess().addAll(this.messEliminados);
					
					mesLogic.saveMess();//WithConnection
					//mesLogic.getSetVersionRowMess();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.messEliminados= new ArrayList<Mes>();		
			}
			
			if(this.mesSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Mes GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.mes=mesAux;
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
      		//this.finishProcessMes();
      	}
		
	}	
	
	public void actualizarRelaciones(Mes mesLocal) throws Exception {
		
		if(this.mesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Mes mesLocal) throws Exception {	
		if(this.mesSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarMesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosMes.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = mesValidator.getInvalidValues(this.mes);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Mes mes,List<Mes> mess) throws Exception {
		try	{		
			MesConstantesFunciones.actualizarLista(mes,mess,this.mesSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Mes mes,List<Mes> mess) throws Exception {
		try	{			
			MesConstantesFunciones.actualizarSelectedLista(mes,mess);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Mes> messLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				messLocal=this.mesLogic.getMess();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				messLocal=this.mess;
			}
			//ARCHITECTURE
		
			for(Mes mesLocal:messLocal) {
				if(this.permiteMantenimiento(mesLocal) && mesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+MesConstantesFunciones.getMesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(MesConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMes.jLabelnombreMes,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormMes!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormMes.jLabelnombreMes,"");
		
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
		this.iIdNuevoMes--;	
		
		
		this.mesAux=new Mes();
		
		this.mesAux.setId(this.iIdNuevoMes);
		this.mesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.mesLogic.getMess().add(this.mesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.mess.add(this.mesAux);
		}
		//ARCHITECTURE
		
		this.mes=this.mesAux;
		
		if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioMes(this.mes);
			this.setVariablesObjetoActualToFormularioForeignKeyMes(this.mes);
		}
				
		//this.setDefaultControlesMes();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyMes();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyMes();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyMes();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMes(this.mesBean,this.mes,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(MesConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.mesSessionBean.getConGuardarRelaciones()) {
			classes=MesConstantesFunciones.getClassesRelationshipsOfMes(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.mesReturnGeneral=mesLogic.procesarEventosMessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mesLogic.getMess(),this.mes,this.mesParameterGeneral,this.isEsNuevoMes,classes);//this.mesLogic.getMes()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanMes(this.mesReturnGeneral,this.mesBean,false);
		
		if(this.mesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyMes(this.mesReturnGeneral.getMes());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioMes(this.mesReturnGeneral.getMes());
		}
		
		if(this.mesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioMes(this.mesReturnGeneral.getMes(),classes);//this.mesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualMes(this.mes,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyMes();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyMes();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingMes(false);
						
			if(mesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(MesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMes();
			}
			
			this.actualizarVisualTableDatosMes();
			
			this.jTableDatosMes.setRowSelectionInterval(this.getIndiceNuevoMes(), this.getIndiceNuevoMes());
			
			this.seleccionarFilaTablaMesActual();
						
			this.actualizarEstadoCeldasBotonesMes("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesMes(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setEnabled(isHabilitar && this.mesConstantesFunciones.activarnombreMes);	
		
	};
	
	public void setDefaultControlesMes() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoMes(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.mesSessionBean.setConGuardarRelaciones(true);			
			this.mesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.setVisible(true);
			
					
		} else {
			//this.mesSessionBean.setConGuardarRelaciones(false);			
			this.mesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoMes() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mes mesAux:this.mesLogic.getMess()) {
				if(mesAux.getId().equals(this.iIdNuevoMes)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mes mesAux:this.mess) {
				if(mesAux.getId().equals(this.iIdNuevoMes)) {
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
	
	public int getIndiceActualMes(Mes mes,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mes mesAux:this.mesLogic.getMess()) {
				if(mesAux.getId().equals(mes.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mes mesAux:this.mess) {
				if(mesAux.getId().equals(mes.getId())) {
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
	
	public void setCamposBaseDesdeOriginalMes(Mes mesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mes mesAux:this.mesLogic.getMess()) {
				if(mesAux.getMesOriginal().getId().equals(mesOriginal.getId())) {
					existe=true;
					mesOriginal.setId(mesAux.getId());
					mesOriginal.setVersionRow(mesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mes mesAux:this.mess) {
				if(mesAux.getMesOriginal().getId().equals(mesOriginal.getId())) {
					existe=true;
					mesOriginal.setId(mesAux.getId());
					mesOriginal.setVersionRow(mesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosMes(Boolean esParaCancelar) throws Exception {
		messAux=new ArrayList<Mes>();
		mesAux=new Mes();
		
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Mes mesAux:this.mesLogic.getMess()) {
					if(mesAux.getId()<0) {
						messAux.add(mesAux);
					}		
				}
				this.iIdNuevoMes=0L;
				this.mesLogic.getMess().removeAll(messAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mes mesAux:this.mess) {
					if(mesAux.getId()<0) {
						messAux.add(mesAux);
					}		
				}
				this.iIdNuevoMes=0L;
				this.mess.removeAll(messAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoMes 
					&& this.mesLogic.getMess().size()>0
					) {
					mesAux=this.mesLogic.getMess().get(this.mesLogic.getMess().size() - 1);
				
					if(mesAux.getId()<0) {
						this.mesLogic.getMess().remove(mesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoMes && this.mess.size()>0) {
					mesAux=this.mess.get(this.mess.size() - 1);
				
					if(mesAux.getId()<0) {
						this.mess.remove(mesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoMes(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(mes.getId()<0) {
				this.mesLogic.getMess().remove(this.mes);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(mes.getId()<0) {
				this.mess.remove(this.mes);
			}
		}			
	}
	
	public void setEstadosInicialesMes(List<Mes> messAux) throws Exception {
		MesConstantesFunciones.setEstadosInicialesMes(messAux);
	}
	
	public void setEstadosInicialesMes(Mes mesAux) throws Exception {
		MesConstantesFunciones.setEstadosInicialesMes(mesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarMesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarMesActual()) {
				if(!this.isEsNuevoMes) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoMes=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarMesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Mes ?", "MANTENIMIENTO DE Mes", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Mes mes) throws Exception {
		MesConstantesFunciones.seleccionarAsignar(this.mes,mes);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarMes=this.isPermisoActualizarOriginalMes;
			
			
			this.seleccionarAsignar(mes);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			MesConstantesFunciones.quitarEspaciosMes(this.mes,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesMes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.mesSessionBean.setsFuncionBusquedaRapida(this.mesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoMes) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosMes(esParaCancelar);				
				this.cancelarNuevoMes(esParaCancelar);								
			}
			
			this.mes=new Mes();
			
			this.inicializarMes();
			
			this.actualizarEstadoCeldasBotonesMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarMes() throws Exception {
		try {
			MesConstantesFunciones.inicializarMes(this.mes);
			
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
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.mesLogic.getMess().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteMess(String sAccionBusqueda,List<Mes> messParaReportes) throws Exception {
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
					sPathReporteFinal="Mes"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="MesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("MesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Mes"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Mess");		
		parameters.put("busquedapor", MesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceMes=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			MesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			MesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceMes=new JRBeanArrayDataSource(MesJInternalFrame.TraerMesBeans(messParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceMes);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+MesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+MesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(MesBean.TraerMesBeans(messParaReportes).toArray()));
							
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
				this.generarExcelReporteMess(sAccionBusqueda,sTipoArchivoReporte,messParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalMess(sAccionBusqueda,sTipoArchivoReporte,messParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoMesActionPerformed(null);
					//this.generarExcelReporteMess(sAccionBusqueda,sTipoArchivoReporte,messParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalMess(sAccionBusqueda,sTipoArchivoReporte,messParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesMess(sAccionBusqueda,sTipoArchivoReporte,messParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesMess(sAccionBusqueda,sTipoArchivoReporte,messParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteMess(String sAccionBusqueda,String sTipoArchivoReporte,List<Mes> messParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Mess");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMes("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Mes mes : messParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			MesConstantesFunciones.generarExcelReporteDataMes("NORMAL",row,workbook,mes,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderMes(String sTipo,Row row,Workbook workbook) {
		
		MesConstantesFunciones.generarExcelReporteHeaderMes(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalMess(String sAccionBusqueda,String sTipoArchivoReporte,List<Mes> messParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Mess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Mes mes : messParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(MesConstantesFunciones.getMesDescripcion(mes));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(MesConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(MesConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(mes.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesMess(String sAccionBusqueda,String sTipoArchivoReporte,List<Mes> messParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Mes> messRespaldo=null;
		
		classes=MesConstantesFunciones.getClassesRelationshipsOfMes(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.mesLogic.setDatosCliente(this.datosCliente);
		this.mesLogic.setDatosDeep(this.datosDeep);
		this.mesLogic.setIsConDeep(true);
		
		messRespaldo=this.mesLogic.getMess();
		
		this.mesLogic.setMess(messParaReportes);	
		this.mesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		messParaReportes=this.mesLogic.getMess();
		this.mesLogic.setMess(messRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Mess");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderMes("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Mes mes : messParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderMes("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			MesConstantesFunciones.generarExcelReporteDataMes("NORMAL",row,workbook,mes,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(MesConstantesFunciones.getMesDescripcion(mes));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoMes.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMes.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessMes() throws Exception {		
		this.startProcessMes(true);
	}
	
	public void startProcessMes(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesMes, this.jScrollPanelDatosMes,this.jPanelPaginacionMes, this.jScrollPanelDatosEdicionMes, this.jPanelAccionesMes,this.jPanelAccionesFormularioMes,this.jmenuBarMes,this.jmenuBarDetalleMes,this.jTtoolBarMes,this.jTtoolBarDetalleMes);		
		
		final JTabbedPane jTabbedPaneBusquedasMes=null; 
		
		final JPanel jPanelParametrosReportesMes=this.jPanelParametrosReportesMes;
		//final JScrollPane jScrollPanelDatosMes=this.jScrollPanelDatosMes;
		final JTable jTableDatosMes=this.jTableDatosMes;		
		final JPanel jPanelPaginacionMes=this.jPanelPaginacionMes;
		//final JScrollPane jScrollPanelDatosEdicionMes=this.jScrollPanelDatosEdicionMes;
		final JPanel jPanelAccionesMes=this.jPanelAccionesMes;
		
		JPanel jPanelCamposAuxiliarMes=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarMes=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormMes!=null) {
			jPanelCamposAuxiliarMes=this.jInternalFrameDetalleFormMes.jPanelCamposMes;
			jPanelAccionesFormularioAuxiliarMes=this.jInternalFrameDetalleFormMes.jPanelAccionesFormularioMes;
		}
		
		final JPanel jPanelCamposMes=jPanelCamposAuxiliarMes;
		final JPanel jPanelAccionesFormularioMes=jPanelAccionesFormularioAuxiliarMes;
		
		
		final JMenuBar jmenuBarMes=this.jmenuBarMes;
		final JToolBar jTtoolBarMes=this.jTtoolBarMes;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarMes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMes=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormMes!=null) {
			jmenuBarDetalleAuxiliarMes=this.jInternalFrameDetalleFormMes.jmenuBarDetalleMes;
			jTtoolBarDetalleAuxiliarMes=this.jInternalFrameDetalleFormMes.jTtoolBarDetalleMes;
		}
		
		final JMenuBar jmenuBarDetalleMes=jmenuBarDetalleAuxiliarMes;
		final JToolBar jTtoolBarDetalleMes=jTtoolBarDetalleAuxiliarMes;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMes;
			processRunnable.jTableDatos=jTableDatosMes;
			processRunnable.jPanelCampos=jPanelCamposMes;
			processRunnable.jPanelPaginacion=jPanelPaginacionMes;
			processRunnable.jPanelAcciones=jPanelAccionesMes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMes;
			
			
			processRunnable.jmenuBar=jmenuBarMes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMes;
			processRunnable.jTtoolBar=jTtoolBarMes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasMes ,jPanelParametrosReportesMes,jTableDatosMes, /*jScrollPanelDatosMes,*/jPanelCamposMes,jPanelPaginacionMes, /*jScrollPanelDatosEdicionMes,*/ jPanelAccionesMes,jPanelAccionesFormularioMes,jmenuBarMes,jmenuBarDetalleMes,jTtoolBarMes,jTtoolBarDetalleMes);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesMes, jScrollPanelDatosMes,jPanelPaginacionMes, jScrollPanelDatosEdicionMes, jPanelAccionesMes,jPanelAccionesFormularioMes,jmenuBarMes,jmenuBarDetalleMes,jTtoolBarMes,jTtoolBarDetalleMes);
						
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
	
	public void finishProcessMes() {// throws Exception 
		this.finishProcessMes(true);
	}
	
	public void finishProcessMes(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesMes, this.jScrollPanelDatosMes,this.jPanelPaginacionMes, this.jScrollPanelDatosEdicionMes, this.jPanelAccionesMes,this.jPanelAccionesFormularioMes,this.jmenuBarMes,this.jmenuBarDetalleMes,this.jTtoolBarMes,this.jTtoolBarDetalleMes);		
		
		final JTabbedPane jTabbedPaneBusquedasMes=null; 
		
		final JPanel jPanelParametrosReportesMes=this.jPanelParametrosReportesMes;
		//final JScrollPane jScrollPanelDatosMes=this.jScrollPanelDatosMes;
		final JTable jTableDatosMes=this.jTableDatosMes;		
		final JPanel jPanelPaginacionMes=this.jPanelPaginacionMes;
		//final JScrollPane jScrollPanelDatosEdicionMes=this.jScrollPanelDatosEdicionMes;
		final JPanel jPanelAccionesMes=this.jPanelAccionesMes;
		
		JPanel jPanelCamposAuxiliarMes=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarMes=new JPanel();
		
		if(this.jInternalFrameDetalleFormMes!=null) {
			jPanelCamposAuxiliarMes=this.jInternalFrameDetalleFormMes.jPanelCamposMes;
			jPanelAccionesFormularioAuxiliarMes=this.jInternalFrameDetalleFormMes.jPanelAccionesFormularioMes;
		}
		
		final JPanel jPanelCamposMes=jPanelCamposAuxiliarMes;
		final JPanel jPanelAccionesFormularioMes=jPanelAccionesFormularioAuxiliarMes;
		
		
		final JMenuBar jmenuBarMes=this.jmenuBarMes;		
		final JToolBar jTtoolBarMes=this.jTtoolBarMes;
				
		JMenuBar jmenuBarDetalleAuxiliarMes=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarMes=new JToolBar();
		
		if(this.jInternalFrameDetalleFormMes!=null) {
			jmenuBarDetalleAuxiliarMes=this.jInternalFrameDetalleFormMes.jmenuBarDetalleMes;
			jTtoolBarDetalleAuxiliarMes=this.jInternalFrameDetalleFormMes.jTtoolBarDetalleMes;		
		}
		
		final JMenuBar jmenuBarDetalleMes=jmenuBarDetalleAuxiliarMes;
		final JToolBar jTtoolBarDetalleMes=jTtoolBarDetalleAuxiliarMes;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasMes;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesMes;
			processRunnable.jTableDatos=jTableDatosMes;
			processRunnable.jPanelCampos=jPanelCamposMes;
			processRunnable.jPanelPaginacion=jPanelPaginacionMes;
			processRunnable.jPanelAcciones=jPanelAccionesMes;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioMes;
			
			
			processRunnable.jmenuBar=jmenuBarMes;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleMes;
			processRunnable.jTtoolBar=jTtoolBarMes;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleMes;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasMes ,jPanelParametrosReportesMes, jTableDatosMes,/*jScrollPanelDatosMes,*/jPanelCamposMes,jPanelPaginacionMes, /*jScrollPanelDatosEdicionMes,*/ jPanelAccionesMes,jPanelAccionesFormularioMes,jmenuBarMes,jmenuBarDetalleMes,jTtoolBarMes,jTtoolBarDetalleMes));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesMes(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarMes(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuMes(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarMes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarMes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleMes,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuMes(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarMes,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleMes,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.mesConstantesFunciones.getsFinalQueryMes();
		String  finalQueryPaginacionTodos=this.mesConstantesFunciones.getsFinalQueryMes();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=MesConstantesFunciones.getArrayColumnasGlobalesNoMes(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.messEliminados= new ArrayList<Mes>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessMes();
		
				///*MesSessionBean*/this.mesSessionBean=new MesSessionBean();
			
			if(this.mesSessionBean==null) {
				this.mesSessionBean=new MesSessionBean();
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
					this.iNumeroPaginacion=MesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=MesConstantesFunciones.getClassesForeignKeysOfMes(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/mes."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			messAux= new ArrayList<Mes>();
			
				
			mesLogic.setDatosCliente(this.datosCliente);
			mesLogic.setDatosDeep(this.datosDeep);
			mesLogic.setIsConDeep(true);
			
			
			mesLogic.getMesDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					mesLogic.getTodosMess(finalQueryGlobal,pagination);
					
					//mesLogic.getTodosMessWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(mesLogic.getMess()==null|| mesLogic.getMess().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							messAux= new ArrayList<Mes>();
							messAux.addAll(mesLogic.getMess());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							messAux= new ArrayList<Mes>();
							messAux.addAll(mess);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mesLogic.getTodosMess(finalQueryGlobal+"",this.pagination);												
							
							//mesLogic.getTodosMessWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteMess("Todos",mesLogic.getMess() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							mesLogic.setMess(new ArrayList<Mes>());					
							mesLogic.getMess().addAll(messAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mess=new ArrayList<Mes>();
							mess.addAll(messAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idMes=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idMes=this.idActual;
				
				} else if(this.idMesActual!=null && this.idMesActual!=0L) {
					idMes=idMesActual;
				}
				
					
				this.sDetalleReporte=MesConstantesFunciones.getDetalleIndicePorId(idMes);
				
				this.mess=new ArrayList<Mes>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					mesLogic.getEntity(idMes);
					
					//mesLogic.getEntityWithConnection(idMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.setMess(new ArrayList<Mes>());
					mesLogic.getMess().add(mesLogic.getMes());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mess=new ArrayList<Mes>();
					this.mess.add(mes);
				}
				
				if(mesLogic.getMes()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesMes();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessMes();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mesLogic.getMess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mess.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=mesLogic.getMess().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=mess.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Mes mes) {
		Boolean permite=true;
		
		if(this.mes.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=MesConstantesFunciones.getOrderByListaMes();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=MesConstantesFunciones.getOrderByListaMes();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mes mes:mesLogic.getMess()) {
				if(mes.getsType().equals(Constantes2.S_TOTALES)) {
					mesTotales=mes;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mes mes:this.mess) {
				if(mes.getsType().equals(Constantes2.S_TOTALES)) {
					mesTotales=mes;
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
			this.mesAux=new Mes();
			this.mesAux.setsType(Constantes2.S_TOTALES);
			this.mesAux.setIsNew(false);
			this.mesAux.setIsChanged(false);
			this.mesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				MesConstantesFunciones.TotalizarValoresFilaMes(this.mesLogic.getMess(),this.mesAux);
				
				this.mesLogic.getMess().add(this.mesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				MesConstantesFunciones.TotalizarValoresFilaMes(this.mess,this.mesAux);
				
				this.mess.add(this.mesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		mesTotales=new Mes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mesLogic.getMess().remove(mesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.mess.remove(mesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		mesTotales=new Mes();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Mes mes:mesLogic.getMess()) {
				if(mes.getsType().equals(Constantes2.S_TOTALES)) {
					mesTotales=mes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MesConstantesFunciones.TotalizarValoresFilaMes(this.mesLogic.getMess(),mesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Mes mes:this.mess) {
				if(mes.getsType().equals(Constantes2.S_TOTALES)) {
					mesTotales=mes;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				MesConstantesFunciones.TotalizarValoresFilaMes(this.mess,mesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getMesPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getMesPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getMesPorNombre(nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
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
	
	public void inicializarPermisosMes() {
		this.isPermisoTodoMes=false;
		this.isPermisoNuevoMes=false;
		this.isPermisoActualizarMes=false;
		this.isPermisoActualizarOriginalMes=false;
		this.isPermisoEliminarMes=false;
		this.isPermisoGuardarCambiosMes=false;
		this.isPermisoConsultaMes=false;
		this.isPermisoBusquedaMes=false;
		this.isPermisoReporteMes=false;		
		this.isPermisoOrdenMes=false;		
		this.isPermisoPaginacionMedioMes=false;		
		this.isPermisoPaginacionAltoMes=false;
		this.isPermisoPaginacionTodoMes=false;
		this.isPermisoCopiarMes=false;		
		this.isPermisoVerFormMes=false;		
		this.isPermisoDuplicarMes=false;		
		this.isPermisoOrdenMes=false;		
	}
	
	public void setPermisosUsuarioMes(Boolean isPermiso) {
		this.isPermisoTodoMes=isPermiso;
		this.isPermisoNuevoMes=isPermiso;
		this.isPermisoActualizarMes=isPermiso;
		this.isPermisoActualizarOriginalMes=isPermiso;
		this.isPermisoEliminarMes=isPermiso;
		this.isPermisoGuardarCambiosMes=isPermiso;
		this.isPermisoConsultaMes=isPermiso;
		this.isPermisoBusquedaMes=isPermiso;
		this.isPermisoReporteMes=isPermiso;
		this.isPermisoOrdenMes=isPermiso;		
		this.isPermisoPaginacionMedioMes=isPermiso;		
		this.isPermisoPaginacionAltoMes=isPermiso;		
		this.isPermisoPaginacionTodoMes=isPermiso;		
		this.isPermisoCopiarMes=isPermiso;		
		this.isPermisoVerFormMes=isPermiso;		
		this.isPermisoDuplicarMes=isPermiso;
		this.isPermisoOrdenMes=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioMes(Boolean isPermiso) {
		//this.isPermisoTodoMes=isPermiso;
		this.isPermisoNuevoMes=isPermiso;
		this.isPermisoActualizarMes=isPermiso;
		this.isPermisoActualizarOriginalMes=isPermiso;
		this.isPermisoEliminarMes=isPermiso;
		this.isPermisoGuardarCambiosMes=isPermiso;
		//this.isPermisoConsultaMes=isPermiso;
		//this.isPermisoBusquedaMes=isPermiso;
		//this.isPermisoReporteMes=isPermiso;
		//this.isPermisoOrdenMes=isPermiso;		
		//this.isPermisoPaginacionMedioMes=isPermiso;		
		//this.isPermisoPaginacionAltoMes=isPermiso;		
		//this.isPermisoPaginacionTodoMes=isPermiso;		
		//this.isPermisoCopiarMes=isPermiso;		
		//this.isPermisoDuplicarMes=isPermiso;
		//this.isPermisoOrdenMes=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioMesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(MesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebMes(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioMesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioMesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionMesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioMesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioMes() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(MesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.mesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, MesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoMes=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarMes=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalMes=this.isPermisoActualizarMes;
			this.isPermisoEliminarMes=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosMes=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaMes=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaMes=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoMes=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteMes=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioMes=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoMes=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoMes=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarMes=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormMes=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarMes=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenMes=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.mesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosMes.setToolTipText(this.jTableDatosMes.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioMes(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioMes(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(MesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(MesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioMes() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyMesListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyMesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(MesJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyMesListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyMesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyMes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyMes()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyMes(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyMes()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyMes();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyMes(Mes mes)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyMes(Mes mes,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyMes()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyMes()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyMes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyMes()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroMes()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyMes()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyMes(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyMes()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public MesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public MesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public MesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.mesSessionBean=new MesSessionBean(); 
		this.mesConstantesFunciones=new MesConstantesFunciones(); 
		this.mesBean=new Mes();//(this.mesConstantesFunciones); 		
		this.mesReturnGeneral=new MesParameterReturnGeneral(); 
		
		this.mesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.mesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public MesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public MesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public MesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessMes(true);
			
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
			
			this.mesConstantesFunciones=new MesConstantesFunciones(); 
			this.mesBean=new Mes();//this.mesConstantesFunciones); 			
			this.mesReturnGeneral=new MesParameterReturnGeneral(); 
		
			MesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Mes Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.mes=new Mes();
			this.mess = new ArrayList<Mes>();
			this.messAux = new ArrayList<Mes>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic=new MesLogic();
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			//this.mesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.mesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormMes);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoMes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMes);	
					}
					
					if(this.jInternalFrameImportacionMes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMes);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByMes!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByMes);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormMes!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormMes);
				this.jInternalFrameDetalleFormMes.setVisible(false);
				this.jInternalFrameDetalleFormMes.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoMes!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMes);
					this.jInternalFrameReporteDinamicoMes.setVisible(false);
					this.jInternalFrameReporteDinamicoMes.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionMes!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionMes);
					this.jInternalFrameImportacionMes.setVisible(false);
					this.jInternalFrameImportacionMes.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByMes!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByMes);
					this.jInternalFrameOrderByMes.setVisible(false);
					this.jInternalFrameOrderByMes.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idMesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=MesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.mesReturnGeneral=new MesParameterReturnGeneral();
			
			this.mesParameterGeneral=new MesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.mesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.mesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(MesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.mesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mesSessionBean.getEsGuardarRelacionado(),this.mesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,MesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.mesSessionBean.getEsGuardarRelacionado(),this.mesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaDuplicarMes=true;
			this.isVisibilidadCeldaCopiarMes=true;
			this.isVisibilidadCeldaVerFormMes=true;
			this.isVisibilidadCeldaOrdenMes=true;
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
			this.isVisibilidadCeldaModificarMes=false;
			this.isVisibilidadCeldaActualizarMes=false;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=false;
			this.isVisibilidadCeldaGuardarMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosMes();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioMes(false);
			
			this.setPermisosUsuarioMes();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mesSessionBean.getEsGuardarRelacionado() 
				|| (this.mesSessionBean.getEsGuardarRelacionado() && this.mesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioMesClasesRelacionadas();
			}
			
			if(this.mesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioMesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!MesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosMes();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualMes();
			}
			
			if(!this.isPermisoBusquedaMes) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioMes,this.isPermisoPaginacionMedioMes,this.isPermisoPaginacionTodoMes);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(MesConstantesFunciones.getTiposSeleccionarMes());
				
				this.tiposColumnasSelect=MesConstantesFunciones.getTiposSeleccionarMes(true);
				
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
			//if(!this.mesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioMes();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioMes(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioMes(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesMes() ;
			
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
				mesImplementable= (MesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				mesImplementableHome= (MesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+MesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.mess= new ArrayList<Mes>();
			this.messEliminados= new ArrayList<Mes>();
						
			this.isEsNuevoMes=false;
			this.esParaAccionDesdeFormularioMes=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyMes(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroMes();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.mesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=MesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesMes("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingMes(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormMes!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioMes();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioMes();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessMes(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Mes: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectMes() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesMes")) {
				iIndex=this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosMes.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessMes();	
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
	
	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyMes(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyMesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyMes();
		
		this.cargarCombosFrameForeignKeyMes();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyMes();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyMes();
		}
	}
	
	
	
	public void jButtonNuevoMesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.mesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			
			if(jTableDatosMes.getRowCount()>=1) {
				jTableDatosMes.removeRowSelectionInterval(0, jTableDatosMes.getRowCount()-1);						
			}
			
			this.isEsNuevoMes=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoMes(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesMes(true);			
			//this.mes=new Mes();
			//this.mes.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMes(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMes() ;
			
			if(MesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMes(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.mes);	
			this.actualizarInformacion("INFO_PADRE",false,this.mes);				
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			if(this.mesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Mes: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarMesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosMes.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosMes.getSelectedRows().length;			
			}
			
			messSeleccionados=this.getMessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoMes--;			
				//Mes mesAux= new Mes();			
				//mesAux.setId(this.iIdNuevoMes);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Mes mesOrigen=new Mes();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Mes mesOrigen : messSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosMes.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							mesOrigen =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							mesOrigen =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaMes();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.mes.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosMes(mesOrigen,this.mes,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mesLogic.getMess().add(this.mesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mess.add(this.mesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaMes(false);
				
				this.jTableDatosMes.setRowSelectionInterval(this.getIndiceNuevoMes(), this.getIndiceNuevoMes());
				
				int iLastRow =  this.jTableDatosMes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMes(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();									
		
			Mes mesOrigen=new Mes();
			Mes mesDestino=new Mes();
				
			messSeleccionados=this.getMessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosMes.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || messSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosMes.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesOrigen =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mesOrigen =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						mesDestino =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						mesDestino =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				mesOrigen =messSeleccionados.get(0);
				mesDestino =messSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosMes(mesOrigen,mesDestino,true,false);
				
				mesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(mesDestino,mesLogic.getMess());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(mesDestino,mess);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaMes(false);
				
				//this.jTableDatosMes.setRowSelectionInterval(this.getIndiceNuevoMes(), this.getIndiceNuevoMes());
				
				int iLastRow =  this.jTableDatosMes.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosMes.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosMes.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaMes(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormMes.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesMes.isVisible();
			
			
			this.jPanelParametrosReportesMes.setVisible(!isVisible);
			this.jPanelPaginacionMes.setVisible(!isVisible);
			this.jPanelAccionesMes.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameMes();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoMes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionMes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByMes();
			
			this.abrirFrameOrderByMes();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByMes();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleMes(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormMes);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormMes.isMaximum()) {
					this.jInternalFrameDetalleFormMes.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormMes.setSize(this.jInternalFrameDetalleFormMes.iWidthFormulario,this.jInternalFrameDetalleFormMes.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormMes.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormMes.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormMes.isMaximum()) {
						this.jInternalFrameDetalleFormMes.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormMes.jContentPaneDetalleMes.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormMes.jContentPaneDetalleMes.getWidth(),MesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormMes.jContentPaneDetalleMes.getWidth(),MesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormMes.jContentPaneDetalleMes.getWidth(),MesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormMes.setVisible(true);
	        this.jInternalFrameDetalleFormMes.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByMes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByMes==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMes,false,this);
				} else {
					this.jInternalFrameOrderByMes=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByMes,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByMes);
				this.jInternalFrameOrderByMes.setVisible(false);
				this.jInternalFrameOrderByMes.setSelected(false);
				
				this.jInternalFrameOrderByMes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMes"));
				
				this.inicializarActualizarBindingTablaOrderByMes();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionMes() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionMes==null) {
				
				this.jInternalFrameImportacionMes=new ImportacionJInternalFrame(MesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionMes);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionMes);
				this.jInternalFrameImportacionMes.setVisible(false);
				this.jInternalFrameImportacionMes.setSelected(false);


				this.jInternalFrameImportacionMes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMes"));
				this.jInternalFrameImportacionMes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMes"));
				this.jInternalFrameImportacionMes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMes"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoMes() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoMes==null) {
				this.jInternalFrameReporteDinamicoMes=new ReporteDinamicoJInternalFrame(MesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoMes);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoMes);
				this.jInternalFrameReporteDinamicoMes.setVisible(false);
				this.jInternalFrameReporteDinamicoMes.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoMes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMes"));
				this.jInternalFrameReporteDinamicoMes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMes"));
				this.jInternalFrameReporteDinamicoMes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMes"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMes();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleMes() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormMes);
			
	       	this.jInternalFrameDetalleFormMes.setVisible(false);
	        this.jInternalFrameDetalleFormMes.setSelected(false);
			
			//this.jInternalFrameDetalleFormMes.dispose();
			//this.jInternalFrameDetalleFormMes=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoMes() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoMes.setVisible(true);
	        this.jInternalFrameReporteDinamicoMes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionMes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionMes.setVisible(true);
	        this.jInternalFrameImportacionMes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByMes() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByMes.setVisible(true);
	        this.jInternalFrameOrderByMes.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByMes() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByMes.setVisible(false);
	        this.jInternalFrameOrderByMes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoMes() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoMes.setVisible(false);
	        this.jInternalFrameReporteDinamicoMes.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionMes() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionMes.setVisible(false);
	        this.jInternalFrameImportacionMes.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarMesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarMes(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarMes(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMes.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesMes(true);
			//this.isEsNuevoMes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesMes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMes(false) ;
			
			if(mesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(MesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMes(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaMesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarMes(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosMes.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesMes(true);
			//this.isEsNuevoMes=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.mes.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesMes("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesMes(false) ;
			
			if(MesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleMes(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMes(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarMesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesMes(false);
			
			//if(!this.isEsNuevoMes) {								
				int intSelectedRow = this.jTableDatosMes.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualMes(this.mes,true);
				this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
				
			}
			
			if(this.permiteMantenimiento(this.mes)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.mesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoMes=true;
					this.inicializarActualizarBindingTablaMes(false);
					this.isEsNuevoMes=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoMes=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoMes=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMes(false);
				
				this.habilitarDeshabilitarControlesMes(false);
			
												
				
				if(MesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleMes();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoMesActionPerformed(evt,mesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualMes(this.mes,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosMes.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,mesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.mes.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarMesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosMes.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				this.mes.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				this.mes.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.mes)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.mesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((MesModel) this.jTableDatosMes.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoMes=true;
				this.inicializarActualizarBindingTablaMes(false);
				this.isEsNuevoMes=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesMes(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMes(false);
				
				this.habilitarDeshabilitarControlesMes(false);
				
				
				
				if(MesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleMes();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarMesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosMes.getRowCount()>=1) {
				jTableDatosMes.removeRowSelectionInterval(0, jTableDatosMes.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesMes(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaMes(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesMes(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualMes(false) ;
			
			this.isEsNuevoMes=false;
			
			if(MesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleMes();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingMes(false);
				
				//SI ES MANUAL
				if(MesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualMes();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoMes--;			
			//Mes mesAux= new Mes();			
			//mesAux.setId(this.iIdNuevoMes);
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaMes();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
			
			this.mes.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.mesLogic.getMess().add(this.mesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.mess.add(this.mesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaMes(false);
			
			this.jTableDatosMes.setRowSelectionInterval(this.getIndiceNuevoMes(), this.getIndiceNuevoMes());
			
			int iLastRow =  this.jTableDatosMes.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosMes.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosMes.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaMes(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionMesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingMes(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMes(false);
			
			//SI ES MANUAL
			if(MesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMes();
			}
			
			//this.abrirFrameTreeMes();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionMesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE MesS ?", "MANTENIMIENTO DE Mes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionMes.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralMes();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.mesReturnGeneral=mesLogic.procesarImportacionMessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.mesParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarMesReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionMesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionMes.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionMes.setFileImportacion(this.jInternalFrameImportacionMes.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionMes.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionMes.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionMes.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionMes.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoMesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		

		messSeleccionados=this.getMessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("MesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"MesBaseDesign.jrxml";
			
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
			
			this.generarReporteMess("Todos",messSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MesConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoMes.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case MesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case MesConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoMes.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoMes.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case MesConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoMesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Mess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case MesConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(MesConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Mes mes:messSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(mes.getnombre());
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
			//	this.getFilaCabeceraExportarExcelMes(row);				
			//	iRow++;
			//}				
			
			//for(Mes mesAux:messSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelMes(mesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
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
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMes(false);
			
			//SI ES MANUAL
			if(MesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualMes();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMes(false);
			
			//SI ES MANUAL
			if(MesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMes();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesMesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingMes(false);
			
			//SI ES MANUAL
			if(MesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualMes();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.mesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaMes() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosMes.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosMes.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosMes.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosMes.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosMes.setMinimumSize(dimensionMinimum);
		this.jTableDatosMes.setMaximumSize(dimensionMaximum);
		this.jTableDatosMes.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingMes(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingMes(esInicializar,true);
	}
	
	public void inicializarActualizarBindingMes(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaMes(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesMes(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasMes(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMes(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesMes(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !MesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!MesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualMes() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaMes();
		
		this.inicializarActualizarBindingBotonesManualMes(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.mesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualMes();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesMes() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualMes(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualMes(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosMes.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosMes.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteMes.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormMes!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormMes.jCheckBoxPostAccionNuevoMes.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormMes.jCheckBoxPostAccionSinCerrarMes.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormMes.jCheckBoxPostAccionSinMensajeMes.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosMes.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosMes.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteMes.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormMes!=null) {
				this.jInternalFrameDetalleFormMes.jCheckBoxPostAccionNuevoMes.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormMes.jCheckBoxPostAccionSinCerrarMes.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormMes.jCheckBoxPostAccionSinMensajeMes.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionMes.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionMes.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesMes.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoMes!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesMes.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesMes.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarMes.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesMes.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoMes!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesMes.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralMes.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesMes(Boolean esInicializar) throws Exception {
		try	{	
			if(MesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualMes(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesMes() throws Exception {
		try	{
			if(MesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualMes();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMes() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualMes() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesMes.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesMes.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesMes.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesMes.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesMes.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesMes.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionMes.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionMes.addItem(reporte);
			}
			
			
			if(!this.mesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionMes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionMes.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesMes.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesMes.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesMes.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesMes.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarMes.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarMes.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarMes.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMes();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualMes() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMes!=null) {
				this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoMes!=null) {
				this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoMes.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoMes!=null) {
				
				if(this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMes.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoMes.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoMes.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoMes.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualMes()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasMes(Boolean esInicializar) throws Exception {				
		if(MesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualMes();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaMes() throws Exception {
		this.inicializarActualizarBindingTablaMes(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByMes() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByMes.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByMes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMes.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new MesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByMes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMes.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new MesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosMesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new MesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByMes.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByMes.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new MesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByMes.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaMes(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=mesLogic.getMess().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=mess.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosMes.setModel(new MesModel(this.mesLogic.getMess(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosMes.setModel(new MesModel(this.mess,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByMes!=null && this.jInternalFrameOrderByMes.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByMes();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMes,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new MesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+MesConstantesFunciones.SCLASSWEBTITULO,mesConstantesFunciones.resaltarSeleccionarMes,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+MesConstantesFunciones.SCLASSWEBTITULO,mesConstantesFunciones.resaltarSeleccionarMes,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMes,MesConstantesFunciones.LABEL_ID));

		if(this.mesConstantesFunciones.mostraridMes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.mesConstantesFunciones.resaltaridMes,this.mesConstantesFunciones.activaridMes,this,true,"idMes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mesConstantesFunciones.resaltaridMes,this.mesConstantesFunciones.activaridMes,this,true,"idMes","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosMes,MesConstantesFunciones.LABEL_NOMBRE));

		if(this.mesConstantesFunciones.mostrarnombreMes && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,MesConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.mesConstantesFunciones.resaltarnombreMes,this.mesConstantesFunciones.activarnombreMes,this,true,"nombreMes","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.mesConstantesFunciones.resaltarnombreMes,this.mesConstantesFunciones.activarnombreMes,this,true,"nombreMes","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new MesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.mesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMes.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.mesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.mesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosMes.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarMes && this.isPermisoGuardarCambiosMes) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.mesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.mesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosMes.addColumn(tableColumn);
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
			
			this.jTableDatosMes.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMes && this.isPermisoGuardarCambiosMes) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarMes && this.isPermisoGuardarCambiosMes) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosMes.moveColumn(this.jTableDatosMes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosMes.moveColumn(this.jTableDatosMes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosMes.moveColumn(this.jTableDatosMes.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosMes.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosMes.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosMes,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosMes.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosMes.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosMes.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosMes.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosMes.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=mesLogic.getMess().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=mess.size()-1;
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
		//this.jTableDatosMes.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosMes.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosMes();
			
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
				
				//this.isEsNuevoMes=false;
					
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
				if(this.mesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormMes==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMes.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.mes.getsType().equals("DUPLICADO")
				   || this.mes.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoMes=true;
				
				} else {
					this.isEsNuevoMes=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.mesSessionBean.getEsGuardarRelacionado()) {
					if(this.mes.getId()>=0 && !this.mes.getIsNew()) {						
						this.isEsNuevoMes=false;
						
					} else {
						this.isEsNuevoMes=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoMes(esRelaciones);						
				
				this.seleccionarMes(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.mes.getId()<0) {
					this.isEsNuevoMes=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarMes(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarMes(evt,rowIndex);
				}	
				
				if(this.mesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Mes: " + this.dDif); 
					}
				}								
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarMes(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.mes)) {
					if(this.mes.getId()>0) {
						this.mes.setIsDeleted(true);
						
						this.messEliminados.add(this.mes);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.mesLogic.getMess().remove(this.mes);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.mess.remove(this.mes);				
					}
					
					
					((MesModel) this.jTableDatosMes.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaMes(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarMes(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoMes) {
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosMes.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosMes.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioMes(this.mes);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesMes("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesMes(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualMes() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoMes(Mes mes) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoMes(mes,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoMes(Mes mes,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioMes(mes);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyMes(mes,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyMes(mes);
	}
	
	public void setVariablesObjetoActualToFormularioMes(Mes mes) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormMes.jTextFieldidMes.setText(mes.getId().toString());
			this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setText(mes.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Mes mesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,mesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Mes mesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				mesLocal=this.mes;
			} else {
				mesLocal=this.mesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(mesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoMes(mesLocal,true);
					
					if(mesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(mesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.mesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(mesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoMes(Mes mes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMes(mes,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysMes(mes);
	}
	
	public void setVariablesFormularioToObjetoActualMes(Mes mes,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualMes(mes,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualMes(Mes mes,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormMes.jTextFieldidMes.getText()==null || this.jInternalFrameDetalleFormMes.jTextFieldidMes.getText()=="" || this.jInternalFrameDetalleFormMes.jTextFieldidMes.getText()=="Id") {
				this.jInternalFrameDetalleFormMes.jTextFieldidMes.setText("0");
			}

			if(conColumnasBase) {mes.setId(Long.parseLong(this.jInternalFrameDetalleFormMes.jTextFieldidMes.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMes.jLabelIdMes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			mes.setnombre(this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+MesConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormMes.jLabelnombreMes,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualMes(Mes mesBean,Mes mes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosMes(Mes mesOrigen,Mes mes,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mesOrigen.getId()!=null && !mesOrigen.getId().equals(0L))) {mes.setId(mesOrigen.getId());}}
			if(conDefault || (!conDefault && mesOrigen.getnombre()!=null && !mesOrigen.getnombre().equals(""))) {mes.setnombre(mesOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMes(Mes mes) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMes.jTextFieldidMes.setText(mes.getId().toString());
			this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setText(mes.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioMes(MesBean mesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormMes.jTextFieldidMes.setText(mesBean.getId().toString());
			this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setText(mesBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanMes(MesParameterReturnGeneral mesReturnGeneral,MesBean mesBean,Boolean conDefault) throws Exception { 
		try {
			Mes mesLocal=new Mes();
			
			mesLocal=mesReturnGeneral.getMes();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && mesLocal.getId()!=null && !mesLocal.getId().equals(0L))) {mesBean.setId(mesLocal.getId());}}
			if(conDefault || (!conDefault && mesLocal.getnombre()!=null && !mesLocal.getnombre().equals(""))) {mesBean.setnombre(mesLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxMesGenerico(Long idMesSeleccionado,JComboBox jComboBoxMes,List<Mes> messLocal)throws Exception {
		try {
			Mes  mesTemp=null;

			for(Mes mesAux:messLocal) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			jComboBoxMes.setSelectedItem(mesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxMesGenerico(JComboBox jComboBoxMes,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMes.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxMes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxMes.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxMes.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxMes.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxMes.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mes=(Mes) mesLogic.getMess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mes =(Mes) mess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Mes mesRow=new Mes();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mesRow=(Mes) mesLogic.getMess().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			mesRow=(Mes) mess.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualMes(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoMes.setVisible((this.isVisibilidadCeldaNuevoMes && this.isPermisoNuevoMes));			
			this.jButtonDuplicarMes.setVisible((this.isVisibilidadCeldaDuplicarMes && this.isPermisoDuplicarMes));			
			this.jButtonCopiarMes.setVisible((this.isVisibilidadCeldaCopiarMes && this.isPermisoCopiarMes));
			this.jButtonVerFormMes.setVisible((this.isVisibilidadCeldaVerFormMes && this.isPermisoVerFormMes));
			
			this.jButtonAbrirOrderByMes.setVisible((this.isVisibilidadCeldaOrdenMes && this.isPermisoOrdenMes));			
			
			this.jButtonNuevoRelacionesMes.setVisible((this.isVisibilidadCeldaNuevoRelacionesMes && this.isPermisoNuevoMes));			
			this.jButtonNuevoGuardarCambiosMes.setVisible((this.isVisibilidadCeldaNuevoMes && this.isPermisoNuevoMes && this.isPermisoGuardarCambiosMes));
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.jInternalFrameDetalleFormMes.jButtonModificarMes.setVisible((this.isVisibilidadCeldaModificarMes && this.isPermisoActualizarMes));	
			this.jInternalFrameDetalleFormMes.jButtonActualizarMes.setVisible((this.isVisibilidadCeldaActualizarMes && this.isPermisoActualizarMes));	
			this.jInternalFrameDetalleFormMes.jButtonEliminarMes.setVisible((this.isVisibilidadCeldaEliminarMes && this.isPermisoEliminarMes));
			this.jInternalFrameDetalleFormMes.jButtonCancelarMes.setVisible(this.isVisibilidadCeldaCancelarMes);							
			this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.setVisible((this.isVisibilidadCeldaGuardarMes && this.isPermisoGuardarCambiosMes));			
			
			}
						
			this.jButtonGuardarCambiosTablaMes.setVisible((this.isVisibilidadCeldaGuardarCambiosMes && this.isPermisoGuardarCambiosMes));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarMes.setVisible((this.isVisibilidadCeldaNuevoMes && this.isPermisoNuevoMes));						
			this.jButtonDuplicarToolBarMes.setVisible((this.isVisibilidadCeldaDuplicarMes && this.isPermisoDuplicarMes));						
			this.jButtonCopiarToolBarMes.setVisible((this.isVisibilidadCeldaCopiarMes && this.isPermisoCopiarMes));			
			this.jButtonVerFormToolBarMes.setVisible((this.isVisibilidadCeldaVerFormMes && this.isPermisoVerFormMes));			
			this.jButtonAbrirOrderByToolBarMes.setVisible((this.isVisibilidadCeldaOrdenMes && this.isPermisoOrdenMes));
			this.jButtonNuevoRelacionesToolBarMes.setVisible((this.isVisibilidadCeldaNuevoRelacionesMes && this.isPermisoNuevoMes));			
			this.jButtonNuevoGuardarCambiosToolBarMes.setVisible((this.isVisibilidadCeldaNuevoMes && this.isPermisoNuevoMes && this.isPermisoGuardarCambiosMes));			
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.jInternalFrameDetalleFormMes.jButtonModificarToolBarMes.setVisible((this.isVisibilidadCeldaModificarMes && this.isPermisoActualizarMes));	
			this.jInternalFrameDetalleFormMes.jButtonActualizarToolBarMes.setVisible((this.isVisibilidadCeldaActualizarMes  && this.isPermisoActualizarMes));	
			this.jInternalFrameDetalleFormMes.jButtonEliminarToolBarMes.setVisible((this.isVisibilidadCeldaEliminarMes && this.isPermisoEliminarMes));
			this.jInternalFrameDetalleFormMes.jButtonCancelarToolBarMes.setVisible(this.isVisibilidadCeldaCancelarMes);				
			this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosToolBarMes.setVisible((this.isVisibilidadCeldaGuardarMes && this.isPermisoGuardarCambiosMes));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarMes.setVisible((this.isVisibilidadCeldaGuardarCambiosMes && this.isPermisoGuardarCambiosMes));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoMes.setVisible((this.isVisibilidadCeldaNuevoMes && this.isPermisoNuevoMes));			
			this.jMenuItemDuplicarMes.setVisible((this.isVisibilidadCeldaDuplicarMes && this.isPermisoDuplicarMes));			
			this.jMenuItemCopiarMes.setVisible((this.isVisibilidadCeldaCopiarMes && this.isPermisoCopiarMes));			
			this.jMenuItemVerFormMes.setVisible((this.isVisibilidadCeldaVerFormMes && this.isPermisoVerFormMes));			
			this.jMenuItemAbrirOrderByMes.setVisible((this.isVisibilidadCeldaOrdenMes && this.isPermisoOrdenMes));			
			//this.jMenuItemMostrarOcultarMes.setVisible((this.isVisibilidadCeldaOrdenMes && this.isPermisoOrdenMes));
			this.jMenuItemDetalleAbrirOrderByMes.setVisible((this.isVisibilidadCeldaOrdenMes && this.isPermisoOrdenMes));			
			//this.jMenuItemDetalleMostrarOcultarMes.setVisible((this.isVisibilidadCeldaOrdenMes && this.isPermisoOrdenMes));			
			this.jMenuItemNuevoRelacionesMes.setVisible((this.isVisibilidadCeldaNuevoRelacionesMes && this.isPermisoNuevoMes));			
			this.jMenuItemNuevoGuardarCambiosMes.setVisible((this.isVisibilidadCeldaNuevoMes && this.isPermisoNuevoMes && this.isPermisoGuardarCambiosMes));									
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.jInternalFrameDetalleFormMes.jMenuItemModificarMes.setVisible((this.isVisibilidadCeldaModificarMes && this.isPermisoActualizarMes));	
			this.jInternalFrameDetalleFormMes.jMenuItemActualizarMes.setVisible((this.isVisibilidadCeldaActualizarMes && this.isPermisoActualizarMes));	
			this.jInternalFrameDetalleFormMes.jMenuItemEliminarMes.setVisible((this.isVisibilidadCeldaEliminarMes && this.isPermisoEliminarMes));
			this.jInternalFrameDetalleFormMes.jMenuItemCancelarMes.setVisible(this.isVisibilidadCeldaCancelarMes);				
			}
			
			this.jMenuItemGuardarCambiosMes.setVisible((this.isVisibilidadCeldaGuardarMes && this.isPermisoGuardarCambiosMes));						
			this.jMenuItemGuardarCambiosTablaMes.setVisible((this.isVisibilidadCeldaGuardarCambiosMes && this.isPermisoGuardarCambiosMes));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoMes=this.jButtonNuevoMes.isVisible();
			this.isVisibilidadCeldaDuplicarMes=this.jButtonDuplicarMes.isVisible();
			this.isVisibilidadCeldaCopiarMes=this.jButtonCopiarMes.isVisible();
			this.isVisibilidadCeldaVerFormMes=this.jButtonVerFormMes.isVisible();
			
			this.isVisibilidadCeldaOrdenMes=this.jButtonAbrirOrderByMes.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesMes=this.jButtonNuevoRelacionesMes.isVisible();
			this.isVisibilidadCeldaModificarMes=this.jButtonModificarMes.isVisible();
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.isVisibilidadCeldaActualizarMes=this.jInternalFrameDetalleFormMes.jButtonActualizarMes.isVisible();
			this.isVisibilidadCeldaEliminarMes=this.jInternalFrameDetalleFormMes.jButtonEliminarMes.isVisible();
			this.isVisibilidadCeldaCancelarMes=this.jInternalFrameDetalleFormMes.jButtonCancelarMes.isVisible();
			this.isVisibilidadCeldaGuardarMes=this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosMes=this.jButtonGuardarCambiosTablaMes.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoMes=this.jButtonNuevoToolBarMes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMes=this.jButtonNuevoRelacionesToolBarMes.isVisible();
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.isVisibilidadCeldaModificarMes=this.jInternalFrameDetalleFormMes.jButtonModificarToolBarMes.isVisible();
			this.isVisibilidadCeldaActualizarMes=this.jInternalFrameDetalleFormMes.jButtonActualizarToolBarMes.isVisible();
			this.isVisibilidadCeldaEliminarMes=this.jInternalFrameDetalleFormMes.jButtonEliminarToolBarMes.isVisible();
			this.isVisibilidadCeldaCancelarMes=this.jInternalFrameDetalleFormMes.jButtonCancelarToolBarMes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMes=this.jButtonGuardarCambiosToolBarMes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMes=this.jButtonGuardarCambiosTablaToolBarMes.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoMes=this.jMenuItemNuevoMes.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesMes=this.jMenuItemNuevoRelacionesMes.isVisible();
			
			if(this.jInternalFrameDetalleFormMes!=null) {
			this.isVisibilidadCeldaModificarMes=this.jInternalFrameDetalleFormMes.jMenuItemModificarMes.isVisible();
			this.isVisibilidadCeldaActualizarMes=this.jInternalFrameDetalleFormMes.jMenuItemActualizarMes.isVisible();
			this.isVisibilidadCeldaEliminarMes=this.jInternalFrameDetalleFormMes.jMenuItemEliminarMes.isVisible();
			this.isVisibilidadCeldaCancelarMes=this.jInternalFrameDetalleFormMes.jMenuItemCancelarMes.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarMes=this.jMenuItemGuardarCambiosMes.isVisible();
			this.isVisibilidadCeldaGuardarCambiosMes=this.jMenuItemGuardarCambiosTablaMes.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesMes(Boolean esInicializar) {
		if(MesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.mesSessionBean.getConGuardarRelaciones()) {
				//if(this.mesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesMes();
			}
			
			this.inicializarActualizarBindingBotonesManualMes(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualMes() {
		this.jButtonNuevoMes.setVisible(this.isPermisoNuevoMes);			
		this.jButtonDuplicarMes.setVisible(this.isPermisoDuplicarMes);			
		this.jButtonCopiarMes.setVisible(this.isPermisoCopiarMes);			
		this.jButtonVerFormMes.setVisible(this.isPermisoVerFormMes);			
		
		this.jButtonAbrirOrderByMes.setVisible(this.isPermisoOrdenMes);					
		
		this.jButtonNuevoRelacionesMes.setVisible(this.isPermisoNuevoMes);			
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonModificarMes.setVisible(this.isPermisoActualizarMes);	
			this.jInternalFrameDetalleFormMes.jButtonActualizarMes.setVisible(this.isPermisoActualizarMes);	
			this.jInternalFrameDetalleFormMes.jButtonEliminarMes.setVisible(this.isPermisoEliminarMes);
			this.jInternalFrameDetalleFormMes.jButtonCancelarMes.setVisible(this.isVisibilidadCeldaCancelarMes);						
			this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.setVisible(this.isPermisoGuardarCambiosMes);							
		}
		
		this.jButtonGuardarCambiosTablaMes.setVisible(this.isPermisoActualizarMes);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleMes() {
		this.jInternalFrameDetalleFormMes.jButtonModificarMes.setVisible(this.isPermisoActualizarMes);	
		this.jInternalFrameDetalleFormMes.jButtonActualizarMes.setVisible(this.isPermisoActualizarMes);	
		this.jInternalFrameDetalleFormMes.jButtonEliminarMes.setVisible(this.isPermisoEliminarMes);
		this.jInternalFrameDetalleFormMes.jButtonCancelarMes.setVisible(this.isVisibilidadCeldaCancelarMes);							
		this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.setVisible((this.isVisibilidadCeldaGuardarMes && this.isPermisoGuardarCambiosMes));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosMes() {
		if(MesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualMes();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesMes() {
	}
	
	public void jTableDatosMesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarMes(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidMesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMes(this.getmes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mes==null) {
						this.mes = new Mes();
					}

					this.setVariablesFormularioToObjetoActualMes(this.mes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
				}

				if(this.mes.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.mes.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreMesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosMes.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualMes(this.getmes(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.mes==null) {
						this.mes = new Mes();
					}

					this.setVariablesFormularioToObjetoActualMes(this.mes,true);
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);
				}

				if(this.mes.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.mes.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingMes(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameMes() {
		if(this.jInternalFrameDetalleFormMes!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormMes!=null) {
			this.jInternalFrameDetalleFormMes.setVisible(false);	    			
			this.jInternalFrameDetalleFormMes.dispose();
			this.jInternalFrameDetalleFormMes=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoMes!=null) {
			this.jInternalFrameReporteDinamicoMes.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoMes.dispose();
			this.jInternalFrameReporteDinamicoMes=null;
		}
		
		if(this.jInternalFrameImportacionMes!=null) {
			this.jInternalFrameImportacionMes.setVisible(false);	    			
			this.jInternalFrameImportacionMes.dispose();
			this.jInternalFrameImportacionMes=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessMes();
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			
			if(sTipo.equals("NuevoMes")) {
				jButtonNuevoMesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarMes")) {
				jButtonDuplicarMesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarMes")) {
				jButtonCopiarMesActionPerformed(evt);
			} else if(sTipo.equals("VerFormMes")) {
				jButtonVerFormMesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarMes")) {
				jButtonNuevoMesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarMes")) {
				jButtonDuplicarMesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoMes")) {
				jButtonNuevoMesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarMes")) {
				jButtonDuplicarMesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesMes")) {
				jButtonNuevoMesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarMes")) {
				jButtonNuevoMesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesMes")) {
				jButtonNuevoMesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarMes")) {
				jButtonModificarMesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarMes")) {
				jButtonModificarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarMes")) {
				jButtonModificarMesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarMes")) {
				jButtonActualizarMesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarMes")) {
				jButtonActualizarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarMes")) {
				jButtonActualizarMesActionPerformed(evt);
			} else if(sTipo.equals("EliminarMes")) {
				jButtonEliminarMesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarMes")) {
				jButtonEliminarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarMes")) {
				jButtonEliminarMesActionPerformed(evt);
			} else if(sTipo.equals("CancelarMes")) {
				jButtonCancelarMesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarMes")) {
				jButtonCancelarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarMes")) {
				jButtonCancelarMesActionPerformed(evt);
			} else if(sTipo.equals("CerrarMes")) {
				jButtonCerrarMesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarMes")) {
				jButtonCerrarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarMes")) {
				jButtonCerrarMesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarMes")) {
				jButtonMostrarOcultarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarMes")) {
				jButtonCancelarMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarMes")) {
				jButtonCopiarMesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarMes")) {
				jButtonVerFormMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarMes")) {
				jButtonCopiarMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormMes")) {
				jButtonVerFormMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionMes")) {
				jButtonRecargarInformacionMesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarMes")) {
				jButtonRecargarInformacionMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionMes")) {
				jButtonRecargarInformacionMesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresMes")) {
				jButtonAnterioresMesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarMes")) {
				jButtonAnterioresMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreMes")) {
				jButtonAnterioresMesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesMes")) {
				jButtonSiguientesMesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarMes")) {
				jButtonSiguientesMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesMes")) {
				jButtonSiguientesMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByMes") || sTipo.equals("MenuItemDetalleAbrirOrderByMes")) {
				jButtonAbrirOrderByMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarMes") || sTipo.equals("MenuItemDetalleMostrarOcultarMes")) {
				jButtonMostrarOcultarMesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosMes")) {
				jButtonNuevoGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarMes")) {
				jButtonNuevoGuardarCambiosMesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosMes")) {
				jButtonNuevoGuardarCambiosMesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoMes")) {
				jButtonCerrarReporteDinamicoMesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoMes")) {
				jButtonGenerarReporteDinamicoMesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoMes")) {
				
				jButtonGenerarExcelReporteDinamicoMesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionMes")) {
				jButtonCerrarImportacionMesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionMes")) {
				
				jButtonGenerarImportacionMesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionMes")) {
				
				jButtonAbrirImportacionMesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesMes")) {
				jComboBoxTiposAccionesMesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesMes")) {
				jComboBoxTiposRelacionesMesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioMes")) {
				jComboBoxTiposAccionesMesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarMes")) {
				
				jComboBoxTiposSeleccionarMesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralMes")) {
				jTextFieldValorCampoGeneralMesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByMes")) {
				jButtonAbrirOrderByMesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarMes")) {
				jButtonAbrirOrderByMesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByMes")) {
				jButtonCerrarOrderByMesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMesBusqueda")) {
				this.jButtonidMesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMesBusqueda")) {
				this.jButtonnombreMesBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessMes();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Mes mesLocal=null;
			
			if(!this.getEsControlTabla()) {
				mesLocal=this.mes;
			} else {
				mesLocal=this.mesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
							
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
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
			
			


			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
								
						
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
								
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
							
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
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
			
			


			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
								
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
			
			this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosMes")) {
					jCheckBoxSeleccionarTodosMesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosMes")) {
					jCheckBoxSeleccionadosMesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarMes")) {
					
				}
				
				


				
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
												
				
				


				
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
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
			
			


			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaMesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.mes);
				
				this.actualizarInformacion("INFO_PADRE",false,this.mes);
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
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
				
				


				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Mes.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Mes.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaMesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.mesAnterior =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.mesAnterior =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarMes")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosMesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosMes.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.mes =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.mes =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.mes);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarMes")) {
				
				}
				
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarMes")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosMes.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarMes")) {
			
			}
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessMes();
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			if(sTipo.equals("NuevoMes")) {
				jButtonNuevoMesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarMes")) {
				jButtonDuplicarMesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarMes")) {
				jButtonCopiarMesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormMes")) {
				jButtonVerFormMesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesMes")) {
				jButtonNuevoMesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarMes")) {
				jButtonModificarMesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarMes")) {
				jButtonActualizarMesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarMes")) {
				jButtonEliminarMesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarMes")) {
				jButtonCancelarMesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarMes")) {
				jButtonCerrarMesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosMes")) {
				jButtonGuardarCambiosMesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosMes")) {
				jButtonNuevoGuardarCambiosMesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByMes")) {
				jButtonAbrirOrderByMesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionMes")) {
				jButtonRecargarInformacionMesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresMes")) {
				jButtonAnterioresMesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesMes")) {
				jButtonSiguientesMesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idMesBusqueda")) {
				this.jButtonidMesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreMesBusqueda")) {
				this.jButtonnombreMesBusquedaActionPerformed(evt);
			}
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessMes();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameMes")) {
				closingInternalFrameMes();
				
			} else if(sTipo.equals("jButtonCancelarMes")) {
				JInternalFrameBase jInternalFrameDetalleFormMes = (JInternalFrameBase)evt.getSource();
	            	
	            MesBeanSwingJInternalFrame jInternalFrameParent=(MesBeanSwingJInternalFrame)jInternalFrameDetalleFormMes.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarMesActionPerformed(null);
			}
			
			MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.mes,new Object(),this.mesParameterGeneral,this.mesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormMes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormMes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormMes(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.mes)) {
			if(!esControlTabla) {
				if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualMes(this.mes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);			
				}
				
				if(this.mesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualMes(this.mes,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mesReturnGeneral=mesLogic.procesarEventosMessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mesLogic.getMess(),this.mes,this.mesParameterGeneral,this.isEsNuevoMes,classes);//this.mesLogic.getMes()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanMes(this.mesReturnGeneral,this.mesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.mesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanMes(classes,this.mesReturnGeneral,this.mesBean,false);
					}
						
					if(this.mesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyMes(this.mesReturnGeneral.getMes());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioMes(this.mesReturnGeneral.getMes());	
					}
						
					if(this.mesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioMes(this.mesReturnGeneral.getMes(),classes);//this.mesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioMes(this.mes,classes);//this.mesBean);									
				}
			
				if(MesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualMes(this.mes,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysMes(this.mes);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.mesAnterior!=null) {
						this.mes=this.mesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.mesReturnGeneral=mesLogic.procesarEventosMessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mesLogic.getMess(),this.mes,this.mesParameterGeneral,this.isEsNuevoMes,classes);//this.mesLogic.getMes()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.mesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.mesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.mesReturnGeneral.getMes(),mesLogic.getMess());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.mesReturnGeneral.getMes(),this.mess);
				}
				//ARCHITECTURE
				
				//this.jTableDatosMes.repaint();
				
				//((AbstractTableModel) this.jTableDatosMes.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosMes();
			}
		}
	}
	
	public void actualizarVisualTableDatosMes() throws Exception {
		
		MesModel mesModel=(MesModel)this.jTableDatosMes.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			mesModel.mess=this.mesLogic.getMess();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			mesModel.mess=this.mess;
		}
		
		
		((MesModel) this.jTableDatosMes.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaMes() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getmesAnterior(),this.mesLogic.getMess());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getmesAnterior(),this.mess);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosMes();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioMes(Mes mes,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
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
										
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mes,new Object(),generalEntityParameterGeneral,this.mesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.mesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=MesConstantesFunciones.getClassesRelationshipsOfMes(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=MesConstantesFunciones.getClassesRelationshipsFromStringsOfMes(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormMes(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				MesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.mes,new Object(),generalEntityParameterGeneral,this.mesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,MesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioMes(MesBean mesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanMes(ArrayList<Classe> classes,MesReturnGeneral mesReturnGeneral,MesBean mesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualMes(Mes mes,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.mes)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormMes = new MesDetalleFormJInternalFrame(jDesktopPane,this.mesSessionBean.getConGuardarRelaciones(),this.mesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormMes);
		this.jInternalFrameDetalleFormMes.setVisible(false);
		this.jInternalFrameDetalleFormMes.setSelected(false);						
		
		this.jInternalFrameDetalleFormMes.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormMes.mesLogic=this.mesLogic;
		
		this.cargarCombosFrameForeignKeyMes("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleMes();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleMes();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyMes("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyMes();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormMes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMes"));
		
		this.jInternalFrameDetalleFormMes.jButtonModificarMes.addActionListener(new ButtonActionListener(this,"ModificarMes"));

		
		this.jInternalFrameDetalleFormMes.jButtonModificarToolBarMes.addActionListener(new ButtonActionListener(this,"ModificarToolBarMes"));
					
		this.jInternalFrameDetalleFormMes.jMenuItemModificarMes.addActionListener(new ButtonActionListener(this,"MenuItemModificarMes"));		
		
		
		
		this.jInternalFrameDetalleFormMes.jButtonActualizarMes.addActionListener (new ButtonActionListener(this,"ActualizarMes"));
		
		
		this.jInternalFrameDetalleFormMes.jButtonActualizarToolBarMes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMes"));
						
		this.jInternalFrameDetalleFormMes.jMenuItemActualizarMes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMes"));		
		
		
		
		this.jInternalFrameDetalleFormMes.jButtonEliminarMes.addActionListener (new ButtonActionListener(this,"EliminarMes"));
		
		
		this.jInternalFrameDetalleFormMes.jButtonEliminarToolBarMes.addActionListener (new ButtonActionListener(this,"EliminarToolBarMes"));
								
		this.jInternalFrameDetalleFormMes.jMenuItemEliminarMes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMes"));		
		
		
		
		this.jInternalFrameDetalleFormMes.jButtonCancelarMes.addActionListener (new ButtonActionListener(this,"CancelarMes"));
		
		
		this.jInternalFrameDetalleFormMes.jButtonCancelarToolBarMes.addActionListener (new ButtonActionListener(this,"CancelarToolBarMes"));
					
		this.jInternalFrameDetalleFormMes.jMenuItemCancelarMes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMes"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormMes.jMenuItemDetalleCerrarMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMes"));		
		
		
		
		this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosToolBarMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMes"));
		
		
		
		this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosToolBarMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMes"));
		
		
		
		this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMes"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMes.jButtonidMesBusqueda.addActionListener(new ButtonActionListener(this,"idMesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMes.jButtonnombreMesBusqueda.addActionListener(new ButtonActionListener(this,"nombreMesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMes"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameMes"));
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarMes"));
		}
		
		this.jTableDatosMes.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarMes"));
		
		this.jTableDatosMes.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarMes"));
		
		this.jButtonNuevoMes.addActionListener(new ButtonActionListener(this,"NuevoMes"));
		
		this.jButtonDuplicarMes.addActionListener(new ButtonActionListener(this,"DuplicarMes"));
		
		this.jButtonCopiarMes.addActionListener(new ButtonActionListener(this,"CopiarMes"));
		
		this.jButtonVerFormMes.addActionListener(new ButtonActionListener(this,"VerFormMes"));
		
		
		this.jButtonNuevoToolBarMes.addActionListener(new ButtonActionListener(this,"NuevoToolBarMes"));
			
		this.jButtonDuplicarToolBarMes.addActionListener(new ButtonActionListener(this,"DuplicarToolBarMes"));
			
		this.jMenuItemNuevoMes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoMes"));
			
		this.jMenuItemDuplicarMes.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarMes"));		
		
		
		this.jButtonNuevoRelacionesMes.addActionListener (new ButtonActionListener(this,"NuevoRelacionesMes"));
		
		
		this.jButtonNuevoRelacionesToolBarMes.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarMes"));
			
		this.jMenuItemNuevoRelacionesMes.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesMes"));		
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonModificarMes.addActionListener(new ButtonActionListener(this,"ModificarMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonModificarToolBarMes.addActionListener(new ButtonActionListener(this,"ModificarToolBarMes"));
			
			this.jInternalFrameDetalleFormMes.jMenuItemModificarMes.addActionListener(new ButtonActionListener(this,"MenuItemModificarMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormMes.jButtonActualizarMes.addActionListener (new ButtonActionListener(this,"ActualizarMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonActualizarToolBarMes.addActionListener(new ButtonActionListener(this,"ActualizarToolBarMes"));
				
			this.jInternalFrameDetalleFormMes.jMenuItemActualizarMes.addActionListener (new ButtonActionListener(this,"MenuItemActualizarMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonEliminarMes.addActionListener (new ButtonActionListener(this,"EliminarMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonEliminarToolBarMes.addActionListener (new ButtonActionListener(this,"EliminarToolBarMes"));
						
			this.jInternalFrameDetalleFormMes.jMenuItemEliminarMes.addActionListener (new ButtonActionListener(this,"MenuItemEliminarMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonCancelarMes.addActionListener (new ButtonActionListener(this,"CancelarMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonCancelarToolBarMes.addActionListener (new ButtonActionListener(this,"CancelarToolBarMes"));
			
			this.jInternalFrameDetalleFormMes.jMenuItemCancelarMes.addActionListener (new ButtonActionListener(this,"MenuItemCancelarMes"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarMes.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarMes"));		
		
		
		this.jButtonCerrarMes.addActionListener (new ButtonActionListener(this,"CerrarMes"));
		
		
		this.jButtonCerrarToolBarMes.addActionListener (new ButtonActionListener(this,"CerrarToolBarMes"));
			
		this.jMenuItemCerrarMes.addActionListener (new ButtonActionListener(this,"MenuItemCerrarMes"));
			
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jMenuItemDetalleCerrarMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarMes"));		
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosMes"));
		}
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosToolBarMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarMes"));
		}
		
		this.jButtonCopiarToolBarMes.addActionListener (new ButtonActionListener(this,"CopiarToolBarMes"));
			
		this.jButtonVerFormToolBarMes.addActionListener (new ButtonActionListener(this,"VerFormToolBarMes"));
		
		this.jMenuItemGuardarCambiosMes.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosMes"));
			
		this.jMenuItemCopiarMes.addActionListener (new ButtonActionListener(this,"MenuItemCopiarMes"));		
		
		this.jMenuItemVerFormMes.addActionListener (new ButtonActionListener(this,"MenuItemVerFormMes"));		
		
		
		this.jButtonGuardarCambiosTablaMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMes"));
		
		
		this.jButtonGuardarCambiosTablaToolBarMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarMes"));
			
		this.jMenuItemGuardarCambiosTablaMes.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaMes"));		
		
		
		
		this.jButtonRecargarInformacionMes.addActionListener (new ButtonActionListener(this,"RecargarInformacionMes"));
					
		this.jButtonRecargarInformacionToolBarMes.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarMes"));
		
		this.jMenuItemRecargarInformacionMes.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionMes"));		
		
		
		
		this.jButtonAnterioresMes.addActionListener (new ButtonActionListener(this,"AnterioresMes"));
		
		
		this.jButtonAnterioresToolBarMes.addActionListener (new ButtonActionListener(this,"AnterioresToolBarMes"));
		
		this.jMenuItemAnterioresMes.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresMes"));		
		
		
		this.jButtonSiguientesMes.addActionListener (new ButtonActionListener(this,"SiguientesMes"));
		
		
		this.jButtonSiguientesToolBarMes.addActionListener (new ButtonActionListener(this,"SiguientesToolBarMes"));
			
		this.jMenuItemSiguientesMes.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesMes"));
			
		this.jMenuItemAbrirOrderByMes.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByMes"));
			
		this.jMenuItemMostrarOcultarMes.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarMes"));
			
		this.jMenuItemDetalleAbrirOrderByMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByMes"));
			
		this.jMenuItemDetalleMostarOcultarMes.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarMes"));		
		
		
		this.jButtonNuevoGuardarCambiosMes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosMes"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarMes.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarMes"));
			
		this.jMenuItemNuevoGuardarCambiosMes.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosMes"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosMes.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosMes"));

		this.jCheckBoxSeleccionadosMes.addItemListener(new CheckBoxItemListener(this,"SeleccionadosMes"));
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioMes"));
		}
		
		
		this.jComboBoxTiposRelacionesMes.addActionListener (new ButtonActionListener(this,"TiposRelacionesMes"));
			
		this.jComboBoxTiposAccionesMes.addActionListener (new ButtonActionListener(this,"TiposAccionesMes"));
					
		this.jComboBoxTiposSeleccionarMes.addActionListener (new ButtonActionListener(this,"TiposSeleccionarMes"));
			
		this.jTextFieldValorCampoGeneralMes.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralMes"));		
		
		
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMes.jButtonidMesBusqueda.addActionListener(new ButtonActionListener(this,"idMesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMes.jButtonnombreMesBusqueda.addActionListener(new ButtonActionListener(this,"nombreMesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoMes!=null) {
				this.jInternalFrameReporteDinamicoMes.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMes"));
				this.jInternalFrameReporteDinamicoMes.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMes"));
				this.jInternalFrameReporteDinamicoMes.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMes"));
			}
			
			//this.jButtonCerrarReporteDinamicoMes.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoMes"));				
			//this.jButtonGenerarReporteDinamicoMes.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoMes"));
			//this.jButtonGenerarExcelReporteDinamicoMes.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoMes"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionMes!=null) {
				this.jInternalFrameImportacionMes.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionMes"));
				this.jInternalFrameImportacionMes.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionMes"));
				this.jInternalFrameImportacionMes.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionMes"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByMes.addActionListener (new ButtonActionListener(this,"AbrirOrderByMes"));
			
			this.jButtonAbrirOrderByToolBarMes.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarMes"));			
			
			if(this.jInternalFrameOrderByMes!=null) {
				this.jInternalFrameOrderByMes.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByMes"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormMes!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormMes.jTabbedPaneRelacionesMes.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesMes"));
		
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
            		closingInternalFrameMes();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormMes.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormMes = (JInternalFrameBase)event.getSource();
	            	
	            MesBeanSwingJInternalFrame jInternalFrameParent=(MesBeanSwingJInternalFrame)jInternalFrameDetalleFormMes.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarMesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosMes.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosMesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosMes.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosMes.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoMes";
		inputMap = this.jButtonNuevoMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoMesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesMes";
		inputMap = this.jButtonNuevoRelacionesMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoMesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarMes";
		inputMap = this.jButtonModificarMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarMes";
		inputMap = this.jButtonActualizarMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarMes";
		inputMap = this.jButtonEliminarMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarMes";
		inputMap = this.jButtonCancelarMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarMes";
		inputMap = this.jButtonCerrarMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosMes";
		inputMap = this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormMes.jButtonGuardarCambiosMes.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosMesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosMes.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosMesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesMes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesMesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarMes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarMesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralMes.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralMesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMes.jButtonidMesBusqueda.addActionListener(new ButtonActionListener(this,"idMesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormMes.jButtonnombreMesBusqueda.addActionListener(new ButtonActionListener(this,"nombreMesBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionMes.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionMesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarMesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarMes.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosMes(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Mes mesAux:this.mesLogic.getMess()) {
					mesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mes mesAux:mess) {
					mesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosMesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Mes mesAux:this.mesLogic.getMess()) {
						mesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Mes mesAux:mess) {
						mesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Mes mesAux:this.mesLogic.getMess()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Mes mesAux:mess) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaMes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosMesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingMes(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosMes.getSelectedRows();
			
			Mes mesLocal=new Mes();
			
			//this.seleccionarTodosMes(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLocal =(Mes) this.mesLogic.getMess().toArray()[this.jTableDatosMes.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					mesLocal =(Mes) this.mess.toArray()[this.jTableDatosMes.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				mesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Mes mesAux:this.mesLogic.getMess()) {
						mesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Mes mesAux:mess) {
						mesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaMes(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosMes.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosMes.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosMes,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualMesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarMesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralMesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingMes(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralMes.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Mes mesAux:this.mesLogic.getMess()) {
				
						if(sTipoSeleccionar.equals(MesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							mesAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mes mesAux:mess) {
					
						if(sTipoSeleccionar.equals(MesConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							mesAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaMes(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesMesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingMes(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioMes=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesMes.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteMes) {				
					conSplash=true;//false;										
					
					//this.startProcessMes(conSplash);
				
					this.generarReporteMessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoMessSeleccionados();
				//this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMessSeleccionados(false);
				//this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoMessSeleccionados(true);
				//this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMes();
				
				this.exportarMessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionMess();
				//this.importarMess();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessMes();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelMessSeleccionados();
				//this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Mes", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessMes();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoMes)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyMes(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesMes.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormMes.jComboBoxTiposAccionesFormularioMes.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralMes();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessMes(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesMesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessMes();
			
			if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
			Mes mes=new Mes();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingMes(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesMes.getSelectedItem();
			
			
			
			
			messSeleccionados=this.getMessSeleccionados(true);
			//this.sTipoAccion;
			
			if(messSeleccionados.size()==1) {
				for(Mes mesAux:messSeleccionados) {
					mes=mesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessMes();
			
      		//this.finishProcessMes(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarMesReturnGeneral() throws Exception {
		if(this.mesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.mesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.mesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.mesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.mesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.mesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingMes(false);
		}
		
		if(this.mesReturnGeneral.getConRetornoLista() || this.mesReturnGeneral.getConRetornoObjeto()) {
			if(this.mesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mesLogic.setMess(this.mesReturnGeneral.getMess());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.mesReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.mesLogic.setMes(this.mesReturnGeneral.getMes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingMes(false);
		}
	}
	
	public void actualizarParametrosGeneralMes() throws Exception {
		
		
	}
	
	public ArrayList<Mes> getMessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioMes) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Mes mesAux:mesLogic.getMess()) {
					if(mesAux.getIsSelected()) {
						messSeleccionados.add(mesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Mes mesAux:this.mess) {
					if(mesAux.getIsSelected()) {
						messSeleccionados.add(mesAux);				
					}
				}
			}
			
			if(messSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						messSeleccionados.addAll(this.mesLogic.getMess());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						messSeleccionados.addAll(this.mess);				
					}
				}
			}
		} else {
			messSeleccionados.add(this.mes);
		}
		
		return messSeleccionados;
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
	
	public void generarReporteMessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalMessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoMessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoMessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Mes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesMessSeleccionados() throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteMess("Todos",messSeleccionados);
		
	}	
	
	public void generarReporteNormalMessSeleccionados() throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteMess("Todos",messSeleccionados);
	}		
	
	public void generarReporteProcesoAccionMessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteMess("Todos",messSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoMessSeleccionados() throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		
		this.abrirInicializarFrameReporteDinamicoMes();
		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoMes();
		
		
		//this.generarReporteMess("Todos",messSeleccionados ,mesImplementable,mesImplementableHome);
	}
	
	public void mostrarImportacionMess() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionMes();
		
		this.abrirFrameImportacionMes();		
		
			
		//this.generarReporteMess("Todos",messSeleccionados ,mesImplementable,mesImplementableHome);
	}
	
	public void importarMess() throws Exception {		
	
	}
	
	public void exportarMessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelMessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoMessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlMessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Mes",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoMessSeleccionados() throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarMes(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Mes mesAux:messSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarMes(mesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//mesAux.setsDetalleGeneralEntityReporte(mesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarMes(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=MesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=MesConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarMes(Mes mes,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=mes.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=mes.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=mes.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelMessSeleccionados() throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Mess");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelMes(row);				
				iRow++;
			}				
			
			for(Mes mesAux:messSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelMes(mesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlMessSeleccionados() throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();		
		
		messSeleccionados=this.getMessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"mes.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("mess");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("mes");
			//elementRoot.appendChild(element);
		
			for(Mes mesAux:messSeleccionados) {
				element = document.createElement("mes");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlMes(mesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.mesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Mes",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelMes(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(MesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(MesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(MesConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelMes(Mes mes,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(mes.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(mes.getnombre());				
	}
	
	public void setFilaDatosExportarXmlMes(Mes mes,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(MesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(mes.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(MesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(mes.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(MesConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(mes.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoMessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Mes> messSeleccionados=new ArrayList<Mes>();
		
		messSeleccionados=this.getMessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoMes(messSeleccionados);
		
		this.generarReporteMess("Todos",messSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoMes(ArrayList<Mes> messSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Mes mesAux:messSeleccionados) {
				mesAux.setsDetalleGeneralEntityReporte(mesAux.toString());
			
				if(sTipoSeleccionar.equals(MesConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					mesAux.setsDescripcionGeneralEntityReporte1(mesAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,MesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesMes(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoMes=true;
				this.isVisibilidadCeldaNuevoRelacionesMes=true;
				this.isVisibilidadCeldaGuardarCambiosMes=true;
			}
			
			this.isVisibilidadCeldaModificarMes=false;
			this.isVisibilidadCeldaActualizarMes=false;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=true;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
			this.isVisibilidadCeldaModificarMes=false;
			this.isVisibilidadCeldaActualizarMes=true;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=true;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
			this.isVisibilidadCeldaModificarMes=false;
			this.isVisibilidadCeldaActualizarMes=true;
			this.isVisibilidadCeldaEliminarMes=true;
			this.isVisibilidadCeldaCancelarMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=true;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
			this.isVisibilidadCeldaModificarMes=false;
			this.isVisibilidadCeldaActualizarMes=true;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=false;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoMes=true;
			this.isVisibilidadCeldaNuevoRelacionesMes=true;
			this.isVisibilidadCeldaGuardarCambiosMes=true;
			this.isVisibilidadCeldaModificarMes=false;
			this.isVisibilidadCeldaActualizarMes=false;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=true;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
			this.isVisibilidadCeldaActualizarMes=false;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=false;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
			this.isVisibilidadCeldaModificarMes=true;
			this.isVisibilidadCeldaActualizarMes=false;
			this.isVisibilidadCeldaEliminarMes=false;
			this.isVisibilidadCeldaCancelarMes=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarMes=false;
				} else {
					this.isVisibilidadCeldaGuardarMes=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(MesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoMes=true;
			this.isVisibilidadCeldaNuevoRelacionesMes=true;
			this.isVisibilidadCeldaGuardarCambiosMes=true;
		} else {
			this.actualizarEstadoPanelsMes(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarMes=false;
			//this.isVisibilidadCeldaVerFormMes=false;
			this.isVisibilidadCeldaDuplicarMes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!mesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
		} else {
			this.isVisibilidadCeldaNuevoMes=false;
			this.isVisibilidadCeldaGuardarCambiosMes=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(mesSessionBean.getEsGuardarRelacionado()) {
			if(!mesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesMes=false;												
			}
			
			this.jButtonCerrarMes.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesMes=false;
		}
		
		if(!this.permiteMantenimiento(this.mes)) {
			this.isVisibilidadCeldaActualizarMes=false;
			this.isVisibilidadCeldaEliminarMes=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesMes() {
	}
	
	public void actualizarEstadoPanelsMes(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(false);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(false);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(false);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionMes!=null) {
				this.jScrollPanelDatosEdicionMes.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosMes!=null) {
				this.jScrollPanelDatosMes.setVisible(true);
			}
			
			if(this.jPanelPaginacionMes!=null) {
				this.jPanelPaginacionMes.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesMes!=null) {
				this.jPanelParametrosReportesMes.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.mesSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.mesSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//MesSessionBean mesSessionBean=new MesSessionBean();
		
		if(this.mesSessionBean==null) {
			this.mesSessionBean=new MesSessionBean();
		}
		
		this.mesSessionBean.setsUltimaBusquedaMes(this.getsAccionBusqueda());
		this.mesSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.mesSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//MesSessionBean mesSessionBean=new MesSessionBean();
		
		if(this.mesSessionBean==null) {
			this.mesSessionBean=new MesSessionBean();
		}
		
		if(this.mesSessionBean.getsUltimaBusquedaMes()!=null&&!this.mesSessionBean.getsUltimaBusquedaMes().equals("")) {
			this.setsAccionBusqueda(mesSessionBean.getsUltimaBusquedaMes());
			this.setiNumeroPaginacion(mesSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(mesSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.mesSessionBean.setsUltimaBusquedaMes("");
		this.mesSessionBean.setiNumeroPaginacion(MesConstantesFunciones.INUMEROPAGINACION);
		this.mesSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaMes(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioMes() {
		this.updateBorderResaltarBusquedasFormularioMes();
		this.updateVisibilidadBusquedasFormularioMes();
		this.updateHabilitarBusquedasFormularioMes();
	}
	
	public void updateBorderResaltarBusquedasFormularioMes() {					
	}
	
	public void updateVisibilidadBusquedasFormularioMes() {
	}
	
	public void updateHabilitarBusquedasFormularioMes() {
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
	
	public void updateControlesFormularioMes() throws Exception {

		if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioMes();
		this.updateVisibilidadResaltarControlesFormularioMes();
		this.updateHabilitarResaltarControlesFormularioMes();
		
	}
	
	public void updateBorderResaltarControlesFormularioMes() throws Exception {
		if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.mesConstantesFunciones.resaltaridMes!=null && this.jInternalFrameDetalleFormMes!=null) {this.jInternalFrameDetalleFormMes.jTextFieldidMes.setBorder(this.mesConstantesFunciones.resaltaridMes);}
		if(this.mesConstantesFunciones.resaltarnombreMes!=null && this.jInternalFrameDetalleFormMes!=null) {this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setBorder(this.mesConstantesFunciones.resaltarnombreMes);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioMes() throws Exception {		
		if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMes!=null) {
	
		//this.jInternalFrameDetalleFormMes.jTextFieldidMes.setVisible(this.mesConstantesFunciones.mostraridMes);
		this.jInternalFrameDetalleFormMes.jPanelidMes.setVisible(this.mesConstantesFunciones.mostraridMes);
		//this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setVisible(this.mesConstantesFunciones.mostrarnombreMes);
		this.jInternalFrameDetalleFormMes.jPanelnombreMes.setVisible(this.mesConstantesFunciones.mostrarnombreMes);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioMes() throws Exception {
		if(this.jInternalFrameDetalleFormMes==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormMes!=null) {
	
		this.jInternalFrameDetalleFormMes.jTextFieldidMes.setEnabled(this.mesConstantesFunciones.activaridMes);
		this.jInternalFrameDetalleFormMes.jTextFieldnombreMes.setEnabled(this.mesConstantesFunciones.activarnombreMes);
		}
	}
	
		
}