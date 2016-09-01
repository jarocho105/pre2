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

import com.bydan.erp.seguridad.util.SiNoConstantesFunciones;
import com.bydan.erp.seguridad.util.SiNoParameterReturnGeneral;
//import com.bydan.erp.seguridad.util.SiNoParameterGeneral;
//import com.bydan.erp.seguridad.presentation.report.source.SiNoBean;
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

import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.seguridad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class SiNoBeanSwingJInternalFrame extends SiNoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SiNoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<SiNo> sinoValidator = new ClassValidator<SiNo>(SiNo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public SiNo sino;	
	public SiNo sinoAux;
	public SiNo sinoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public SiNo sinoTotales;
	public Long idSiNoActual;
	public Long iIdNuevoSiNo=0L;
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
	
	public Boolean isPermisoTodoSiNo;
	public Boolean isPermisoNuevoSiNo;
	public Boolean isPermisoActualizarSiNo;
	public Boolean isPermisoActualizarOriginalSiNo;
	public Boolean isPermisoEliminarSiNo;
	public Boolean isPermisoGuardarCambiosSiNo;
	public Boolean isPermisoConsultaSiNo;
	public Boolean isPermisoBusquedaSiNo;
	public Boolean isPermisoReporteSiNo;
	public Boolean isPermisoPaginacionMedioSiNo;
	public Boolean isPermisoPaginacionAltoSiNo;
	public Boolean isPermisoPaginacionTodoSiNo;
	public Boolean isPermisoCopiarSiNo;
	public Boolean isPermisoVerFormSiNo;
	public Boolean isPermisoDuplicarSiNo;
	public Boolean isPermisoOrdenSiNo;
	
	
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
	
	public SiNoParameterReturnGeneral sinoReturnGeneral;
	public SiNoParameterReturnGeneral sinoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSiNo=false;
	public Boolean esParaAccionDesdeFormularioSiNo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public SiNoLogic sinoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public SiNo sinoBean;
	public SiNoConstantesFunciones sinoConstantesFunciones;
	//public SiNoParameterReturnGeneral sinoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<SiNo> sinos;	
	//public List<SiNo> sinosEliminados;
	//public List<SiNo> sinosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSiNo=false;
	public Boolean isVisibilidadCeldaDuplicarSiNo=true;
	public Boolean isVisibilidadCeldaCopiarSiNo=true;
	public Boolean isVisibilidadCeldaVerFormSiNo=true;
	public Boolean isVisibilidadCeldaOrdenSiNo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSiNo=false;
	public Boolean isVisibilidadCeldaModificarSiNo=false;
	public Boolean isVisibilidadCeldaActualizarSiNo=false;
	public Boolean isVisibilidadCeldaEliminarSiNo=false;
	public Boolean isVisibilidadCeldaCancelarSiNo=false;
	public Boolean isVisibilidadCeldaGuardarSiNo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSiNo=false;	
	
	
	
	public Long getiIdNuevoSiNo() {
		return this.iIdNuevoSiNo;
	}

	public void setiIdNuevoSiNo(Long iIdNuevoSiNo) {
		this.iIdNuevoSiNo = iIdNuevoSiNo;
	}
	
	public Long getidSiNoActual() {
		return this.idSiNoActual;
	}

	public void setidSiNoActual(Long idSiNoActual) {
		this.idSiNoActual = idSiNoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public SiNo getsino() {
		return this.sino;
	}

	public void setsino(SiNo sino) {
		this.sino = sino;
	}
	
	public SiNo getsinoAux() {
		return this.sinoAux;
	}

	public void setsinoAux(SiNo sinoAux) {
		this.sinoAux = sinoAux;
	}				
	
	public SiNo getsinoAnterior() {
		return this.sinoAnterior;
	}

	public void setsinoAnterior(SiNo sinoAnterior) {
		this.sinoAnterior = sinoAnterior;
	}	
	
	public SiNo getsinoTotales() {
		return this.sinoTotales;
	}

	public void setsinoTotales(SiNo sinoTotales) {
		this.sinoTotales = sinoTotales;
	}	
	
	public SiNo getsinoBean() {
		return this.sinoBean;
	}

	public void setsinoBean(SiNo sinoBean) {
		this.sinoBean = sinoBean;
	}	
	
	public SiNoParameterReturnGeneral getsinoReturnGeneral() {
		return this.sinoReturnGeneral;
	}

	public void setsinoReturnGeneral(SiNoParameterReturnGeneral sinoReturnGeneral) {
		this.sinoReturnGeneral = sinoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SiNoLogic getSiNoLogic()	{		
		return sinoLogic;
	}

	public void setSiNoLogic(SiNoLogic sinoLogic) {
		this.sinoLogic = sinoLogic;
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
	
	public Boolean getIsEsNuevoSiNo() {
		return isEsNuevoSiNo;
	}

	public void setIsEsNuevoSiNo(Boolean isEsNuevoSiNo) {
		this.isEsNuevoSiNo = isEsNuevoSiNo;
	}

	public Boolean getEsParaAccionDesdeFormularioSiNo() {
		return esParaAccionDesdeFormularioSiNo;
	}
	
	public void setEsParaAccionDesdeFormularioSiNo(Boolean esParaAccionDesdeFormularioSiNo) {
		this.esParaAccionDesdeFormularioSiNo = esParaAccionDesdeFormularioSiNo;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesSiNo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SiNoConstantesFunciones.refrescarForeignKeysDescripcionesSiNo(this.sinoLogic.getSiNos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SiNoConstantesFunciones.refrescarForeignKeysDescripcionesSiNo(this.sinos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//sinoLogic.setSiNos(this.sinos);
			sinoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SiNoParameterReturnGeneral getSiNoParameterGeneral() {
		return this.sinoParameterGeneral;
	}
	
	public void setSiNoParameterGeneral(SiNoParameterReturnGeneral sinoParameterGeneral) {
		this.sinoParameterGeneral = sinoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSiNo() {
		return isPermisoTodoSiNo;
	}

	public void setIsPermisoTodoSiNo(Boolean isPermisoTodoSiNo) {
		this.isPermisoTodoSiNo = isPermisoTodoSiNo;
	}

	public Boolean getIsPermisoNuevoSiNo() {
		return isPermisoNuevoSiNo;
	}

	public void setIsPermisoNuevoSiNo(Boolean isPermisoNuevoSiNo) {
		this.isPermisoNuevoSiNo = isPermisoNuevoSiNo;
	}

	public Boolean getIsPermisoActualizarSiNo() {
		return isPermisoActualizarSiNo;
	}

	public void setIsPermisoActualizarSiNo(Boolean isPermisoActualizarSiNo) {
		this.isPermisoActualizarSiNo = isPermisoActualizarSiNo;
	}

	public Boolean getIsPermisoEliminarSiNo() {
		return isPermisoEliminarSiNo;
	}

	public void setIsPermisoEliminarSiNo(Boolean isPermisoEliminarSiNo) {
		this.isPermisoEliminarSiNo = isPermisoEliminarSiNo;
	}

	public Boolean getIsPermisoGuardarCambiosSiNo() {
		return isPermisoGuardarCambiosSiNo;
	}

	public void setIsPermisoGuardarCambiosSiNo(Boolean isPermisoGuardarCambiosSiNo) {
		this.isPermisoGuardarCambiosSiNo = isPermisoGuardarCambiosSiNo;
	}
	
	public Boolean getIsPermisoConsultaSiNo() {
		return isPermisoConsultaSiNo;
	}

	public void setIsPermisoConsultaSiNo(Boolean isPermisoConsultaSiNo) {
		this.isPermisoConsultaSiNo = isPermisoConsultaSiNo;
	}

	public Boolean getIsPermisoBusquedaSiNo() {
		return isPermisoBusquedaSiNo;
	}

	public void setIsPermisoBusquedaSiNo(Boolean isPermisoBusquedaSiNo) {
		this.isPermisoBusquedaSiNo = isPermisoBusquedaSiNo;
	}

	public Boolean getIsPermisoReporteSiNo() {
		return isPermisoReporteSiNo;
	}

	public void setIsPermisoReporteSiNo(Boolean isPermisoReporteSiNo) {
		this.isPermisoReporteSiNo = isPermisoReporteSiNo;
	}
	
	public Boolean getIsPermisoPaginacionMedioSiNo() {
		return isPermisoPaginacionMedioSiNo;
	}

	public void setIsPermisoPaginacionMedioSiNo(Boolean isPermisoPaginacionMedioSiNo) {
		this.isPermisoPaginacionMedioSiNo = isPermisoPaginacionMedioSiNo;
	}
	
	public Boolean getIsPermisoPaginacionTodoSiNo() {
		return isPermisoPaginacionTodoSiNo;
	}

	public void setIsPermisoPaginacionTodoSiNo(Boolean isPermisoPaginacionTodoSiNo) {
		this.isPermisoPaginacionTodoSiNo = isPermisoPaginacionTodoSiNo;
	}
	
	public Boolean getIsPermisoPaginacionAltoSiNo() {
		return isPermisoPaginacionAltoSiNo;
	}

	public void setIsPermisoPaginacionAltoSiNo(Boolean isPermisoPaginacionAltoSiNo) {
		this.isPermisoPaginacionAltoSiNo = isPermisoPaginacionAltoSiNo;
	}
	
	public Boolean getIsPermisoCopiarSiNo() {
		return isPermisoCopiarSiNo;
	}

	public void setIsPermisoCopiarSiNo(Boolean isPermisoCopiarSiNo) {
		this.isPermisoCopiarSiNo = isPermisoCopiarSiNo;
	}
	
	public Boolean getIsPermisoVerFormSiNo() {
		return isPermisoVerFormSiNo;
	}

	public void setIsPermisoVerFormSiNo(Boolean isPermisoVerFormSiNo) {
		this.isPermisoVerFormSiNo = isPermisoVerFormSiNo;
	}
	
	public Boolean getIsPermisoDuplicarSiNo() {
		return isPermisoDuplicarSiNo;
	}

	public void setIsPermisoDuplicarSiNo(Boolean isPermisoDuplicarSiNo) {
		this.isPermisoDuplicarSiNo = isPermisoDuplicarSiNo;
	}
	
	public Boolean getIsPermisoOrdenSiNo() {
		return isPermisoOrdenSiNo;
	}

	public void setIsPermisoOrdenSiNo(Boolean isPermisoOrdenSiNo) {
		this.isPermisoOrdenSiNo = isPermisoOrdenSiNo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSiNo() {
		return isVisibilidadCeldaNuevoSiNo;
	}

	public void setIsVisibilidadCeldaNuevoSiNo(Boolean isVisibilidadCeldaNuevoSiNo) {
		this.isVisibilidadCeldaNuevoSiNo = isVisibilidadCeldaNuevoSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSiNo() {
		return isVisibilidadCeldaDuplicarSiNo;
	}

	public void setIsVisibilidadCeldaDuplicarSiNo(Boolean isVisibilidadCeldaDuplicarSiNo) {
		this.isVisibilidadCeldaDuplicarSiNo = isVisibilidadCeldaDuplicarSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSiNo() {
		return isVisibilidadCeldaCopiarSiNo;
	}

	public void setIsVisibilidadCeldaCopiarSiNo(Boolean isVisibilidadCeldaCopiarSiNo) {
		this.isVisibilidadCeldaCopiarSiNo = isVisibilidadCeldaCopiarSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSiNo() {
		return isVisibilidadCeldaVerFormSiNo;
	}

	public void setIsVisibilidadCeldaVerFormSiNo(Boolean isVisibilidadCeldaVerFormSiNo) {
		this.isVisibilidadCeldaVerFormSiNo = isVisibilidadCeldaVerFormSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSiNo() {
		return isVisibilidadCeldaOrdenSiNo;
	}

	public void setIsVisibilidadCeldaOrdenSiNo(Boolean isVisibilidadCeldaOrdenSiNo) {
		this.isVisibilidadCeldaOrdenSiNo = isVisibilidadCeldaOrdenSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSiNo() {
		return isVisibilidadCeldaNuevoRelacionesSiNo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSiNo(Boolean isVisibilidadCeldaNuevoRelacionesSiNo) {
		this.isVisibilidadCeldaNuevoRelacionesSiNo = isVisibilidadCeldaNuevoRelacionesSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSiNo() {
		return isVisibilidadCeldaModificarSiNo;
	}

	public void setIsVisibilidadCeldaModificarSiNo(Boolean isVisibilidadCeldaModificarSiNo) {
		this.isVisibilidadCeldaModificarSiNo = isVisibilidadCeldaModificarSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSiNo() {
		return isVisibilidadCeldaActualizarSiNo;
	}

	public void setIsVisibilidadCeldaActualizarSiNo(Boolean isVisibilidadCeldaActualizarSiNo) {
		this.isVisibilidadCeldaActualizarSiNo = isVisibilidadCeldaActualizarSiNo;
	}

	public Boolean getIsVisibilidadCeldaEliminarSiNo() {
		return isVisibilidadCeldaEliminarSiNo;
	}

	public void setIsVisibilidadCeldaEliminarSiNo(Boolean isVisibilidadCeldaEliminarSiNo) {
		this.isVisibilidadCeldaEliminarSiNo = isVisibilidadCeldaEliminarSiNo;
	}

	public Boolean getIsVisibilidadCeldaCancelarSiNo() {
		return isVisibilidadCeldaCancelarSiNo;
	}

	public void setIsVisibilidadCeldaCancelarSiNo(Boolean isVisibilidadCeldaCancelarSiNo) {
		this.isVisibilidadCeldaCancelarSiNo = isVisibilidadCeldaCancelarSiNo;
	}

	public Boolean getIsVisibilidadCeldaGuardarSiNo() {
		return isVisibilidadCeldaGuardarSiNo;
	}

	public void setIsVisibilidadCeldaGuardarSiNo(Boolean isVisibilidadCeldaGuardarSiNo) {
		this.isVisibilidadCeldaGuardarSiNo = isVisibilidadCeldaGuardarSiNo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSiNo() {
		return isVisibilidadCeldaGuardarCambiosSiNo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSiNo(Boolean isVisibilidadCeldaGuardarCambiosSiNo) {
		this.isVisibilidadCeldaGuardarCambiosSiNo = isVisibilidadCeldaGuardarCambiosSiNo;
	}
		
	public SiNoSessionBean getsinoSessionBean() {
		return this.sinoSessionBean;
	}
	
	public void setsinoSessionBean(SiNoSessionBean sinoSessionBean) {
		this.sinoSessionBean=sinoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSiNo(SiNo sino)throws Exception {
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
	
	public void bugActualizarReferenciaActual(SiNo sino,SiNo sinoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSiNo(sino);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		sinoAux.setId(sino.getId());
		sinoAux.setVersionRow(sino.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSiNo();
		
			int intSelectedRow = this.jTableDatosSiNo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSiNo(this.sino,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = sinoValidator.getInvalidValues(this.sino);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			sinoLogic.setDatosCliente(datosCliente);
			sinoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				sinoAux=new  SiNo();
				
				sinoAux.setIsNew(true);
				sinoAux.setIsChanged(true);
				
				sinoAux.setSiNoOriginal(this.sino);
				
				sinoAux.setId(this.sino.getId());	
				sinoAux.setVersionRow(this.sino.getVersionRow());	
				sinoAux.setnombre(this.sino.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sinoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sinoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(sinoAux,sinoLogic.getSiNos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sinoAux,sinos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.sinoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sinoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sinoLogic.saveSiNos();//WithConnection
						//sinoLogic.getSetVersionRowSiNos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sino,sinoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				sinoAux=new  SiNo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.sinoSessionBean.getEsGuardarRelacionado() 
					|| (this.sinoSessionBean.getEsGuardarRelacionado() && this.sino.getId()>=0)) {
						
					sinoAux.setIsNew(false);
				}
				
				sinoAux.setIsDeleted(false);
			
				sinoAux.setId(this.sino.getId());	
				sinoAux.setVersionRow(this.sino.getVersionRow());	
				sinoAux.setnombre(this.sino.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sinoAux,sinoLogic.getSiNos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sinoAux,sinos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.sinoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sinoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sinoLogic.saveSiNos();//WithConnection
						//sinoLogic.getSetVersionRowSiNos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sino,sinoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				sinoAux=new  SiNo();
				
				sinoAux.setIsNew(false);
				sinoAux.setIsChanged(false);
				
				sinoAux.setIsDeleted(true);
				
				sinoAux.setId(this.sino.getId());	
				sinoAux.setVersionRow(this.sino.getVersionRow());	
				sinoAux.setnombre(this.sino.getnombre());	
				
				if(this.sinoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.sinoAux.getId()>=0) {	
						this.sinosEliminados.add(sinoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(sinoAux,sinoLogic.getSiNos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sinoAux,sinos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.sinoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.sinoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sinoLogic.saveSiNos();//WithConnection
						//sinoLogic.getSetVersionRowSiNos();//WithConnection
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
					this.sinoLogic.getSiNos().addAll(this.sinosEliminados);
					
					sinoLogic.saveSiNos();//WithConnection
					//sinoLogic.getSetVersionRowSiNos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.sinosEliminados= new ArrayList<SiNo>();		
			}
			
			if(this.sinoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Si/no GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.sino=sinoAux;
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
      		//this.finishProcessSiNo();
      	}
		
	}	
	
	public void actualizarRelaciones(SiNo sinoLocal) throws Exception {
		
		if(this.sinoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(SiNo sinoLocal) throws Exception {	
		if(this.sinoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarSiNoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = sinoValidator.getInvalidValues(this.sino);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(SiNo sino,List<SiNo> sinos) throws Exception {
		try	{		
			SiNoConstantesFunciones.actualizarLista(sino,sinos,this.sinoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(SiNo sino,List<SiNo> sinos) throws Exception {
		try	{			
			SiNoConstantesFunciones.actualizarSelectedLista(sino,sinos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<SiNo> sinosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				sinosLocal=this.sinoLogic.getSiNos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				sinosLocal=this.sinos;
			}
			//ARCHITECTURE
		
			for(SiNo sinoLocal:sinosLocal) {
				if(this.permiteMantenimiento(sinoLocal) && sinoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SiNoConstantesFunciones.getSiNoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SiNoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSiNo.jLabelnombreSiNo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSiNo.jLabelnombreSiNo,"");
		
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
		this.iIdNuevoSiNo--;	
		
		
		this.sinoAux=new SiNo();
		
		this.sinoAux.setId(this.iIdNuevoSiNo);
		this.sinoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sinoLogic.getSiNos().add(this.sinoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sinos.add(this.sinoAux);
		}
		//ARCHITECTURE
		
		this.sino=this.sinoAux;
		
		if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSiNo(this.sino);
			this.setVariablesObjetoActualToFormularioForeignKeySiNo(this.sino);
		}
				
		//this.setDefaultControlesSiNo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySiNo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySiNo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySiNo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSiNo(this.sinoBean,this.sino,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(SiNoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.sinoSessionBean.getConGuardarRelaciones()) {
			classes=SiNoConstantesFunciones.getClassesRelationshipsOfSiNo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.sinoReturnGeneral=sinoLogic.procesarEventosSiNosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sinoLogic.getSiNos(),this.sino,this.sinoParameterGeneral,this.isEsNuevoSiNo,classes);//this.sinoLogic.getSiNo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSiNo(this.sinoReturnGeneral,this.sinoBean,false);
		
		if(this.sinoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySiNo(this.sinoReturnGeneral.getSiNo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSiNo(this.sinoReturnGeneral.getSiNo());
		}
		
		if(this.sinoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSiNo(this.sinoReturnGeneral.getSiNo(),classes);//this.sinoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSiNo(this.sino,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySiNo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySiNo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSiNo(false);
						
			if(sinoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSiNo();
			}
			
			this.actualizarVisualTableDatosSiNo();
			
			this.jTableDatosSiNo.setRowSelectionInterval(this.getIndiceNuevoSiNo(), this.getIndiceNuevoSiNo());
			
			this.seleccionarFilaTablaSiNoActual();
						
			this.actualizarEstadoCeldasBotonesSiNo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSiNo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setEnabled(isHabilitar && this.sinoConstantesFunciones.activarnombreSiNo);	
		
	};
	
	public void setDefaultControlesSiNo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSiNo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.sinoSessionBean.setConGuardarRelaciones(true);			
			this.sinoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.setVisible(true);
			
					
		} else {
			//this.sinoSessionBean.setConGuardarRelaciones(false);			
			this.sinoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSiNo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
				if(sinoAux.getId().equals(this.iIdNuevoSiNo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SiNo sinoAux:this.sinos) {
				if(sinoAux.getId().equals(this.iIdNuevoSiNo)) {
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
	
	public int getIndiceActualSiNo(SiNo sino,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
				if(sinoAux.getId().equals(sino.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SiNo sinoAux:this.sinos) {
				if(sinoAux.getId().equals(sino.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSiNo(SiNo sinoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
				if(sinoAux.getSiNoOriginal().getId().equals(sinoOriginal.getId())) {
					existe=true;
					sinoOriginal.setId(sinoAux.getId());
					sinoOriginal.setVersionRow(sinoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SiNo sinoAux:this.sinos) {
				if(sinoAux.getSiNoOriginal().getId().equals(sinoOriginal.getId())) {
					existe=true;
					sinoOriginal.setId(sinoAux.getId());
					sinoOriginal.setVersionRow(sinoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSiNo(Boolean esParaCancelar) throws Exception {
		sinosAux=new ArrayList<SiNo>();
		sinoAux=new SiNo();
		
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
					if(sinoAux.getId()<0) {
						sinosAux.add(sinoAux);
					}		
				}
				this.iIdNuevoSiNo=0L;
				this.sinoLogic.getSiNos().removeAll(sinosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SiNo sinoAux:this.sinos) {
					if(sinoAux.getId()<0) {
						sinosAux.add(sinoAux);
					}		
				}
				this.iIdNuevoSiNo=0L;
				this.sinos.removeAll(sinosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSiNo 
					&& this.sinoLogic.getSiNos().size()>0
					) {
					sinoAux=this.sinoLogic.getSiNos().get(this.sinoLogic.getSiNos().size() - 1);
				
					if(sinoAux.getId()<0) {
						this.sinoLogic.getSiNos().remove(sinoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSiNo && this.sinos.size()>0) {
					sinoAux=this.sinos.get(this.sinos.size() - 1);
				
					if(sinoAux.getId()<0) {
						this.sinos.remove(sinoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSiNo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sino.getId()<0) {
				this.sinoLogic.getSiNos().remove(this.sino);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sino.getId()<0) {
				this.sinos.remove(this.sino);
			}
		}			
	}
	
	public void setEstadosInicialesSiNo(List<SiNo> sinosAux) throws Exception {
		SiNoConstantesFunciones.setEstadosInicialesSiNo(sinosAux);
	}
	
	public void setEstadosInicialesSiNo(SiNo sinoAux) throws Exception {
		SiNoConstantesFunciones.setEstadosInicialesSiNo(sinoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSiNoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSiNo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSiNoActual()) {
				if(!this.isEsNuevoSiNo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSiNo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSiNo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSiNoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Si/no ?", "MANTENIMIENTO DE Si/no", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSiNo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(SiNo sino) throws Exception {
		SiNoConstantesFunciones.seleccionarAsignar(this.sino,sino);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSiNo=this.isPermisoActualizarOriginalSiNo;
			
			
			this.seleccionarAsignar(sino);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SiNoConstantesFunciones.quitarEspaciosSiNo(this.sino,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSiNo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.sinoSessionBean.setsFuncionBusquedaRapida(this.sinoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSiNo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSiNo(esParaCancelar);				
				this.cancelarNuevoSiNo(esParaCancelar);								
			}
			
			this.sino=new SiNo();
			
			this.inicializarSiNo();
			
			this.actualizarEstadoCeldasBotonesSiNo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSiNo() throws Exception {
		try {
			SiNoConstantesFunciones.inicializarSiNo(this.sino);
			
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
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.sinoLogic.getSiNos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSiNos(String sAccionBusqueda,List<SiNo> sinosParaReportes) throws Exception {
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
					sPathReporteFinal="SiNo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SiNoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SiNoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="SiNo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Si/no");		
		parameters.put("busquedapor", SiNoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSiNo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SiNoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SiNoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSiNo=new JRBeanArrayDataSource(SiNoJInternalFrame.TraerSiNoBeans(sinosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSiNo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SiNoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SiNoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SiNoBean.TraerSiNoBeans(sinosParaReportes).toArray()));
							
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
				this.generarExcelReporteSiNos(sAccionBusqueda,sTipoArchivoReporte,sinosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSiNos(sAccionBusqueda,sTipoArchivoReporte,sinosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSiNoActionPerformed(null);
					//this.generarExcelReporteSiNos(sAccionBusqueda,sTipoArchivoReporte,sinosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSiNos(sAccionBusqueda,sTipoArchivoReporte,sinosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSiNos(sAccionBusqueda,sTipoArchivoReporte,sinosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSiNos(sAccionBusqueda,sTipoArchivoReporte,sinosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSiNos(String sAccionBusqueda,String sTipoArchivoReporte,List<SiNo> sinosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SiNos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSiNo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(SiNo sino : sinosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SiNoConstantesFunciones.generarExcelReporteDataSiNo("NORMAL",row,workbook,sino,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSiNo(String sTipo,Row row,Workbook workbook) {
		
		SiNoConstantesFunciones.generarExcelReporteHeaderSiNo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSiNos(String sAccionBusqueda,String sTipoArchivoReporte,List<SiNo> sinosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SiNos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(SiNo sino : sinosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SiNoConstantesFunciones.getSiNoDescripcion(sino));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SiNoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SiNoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sino.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSiNos(String sAccionBusqueda,String sTipoArchivoReporte,List<SiNo> sinosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<SiNo> sinosRespaldo=null;
		
		classes=SiNoConstantesFunciones.getClassesRelationshipsOfSiNo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.sinoLogic.setDatosCliente(this.datosCliente);
		this.sinoLogic.setDatosDeep(this.datosDeep);
		this.sinoLogic.setIsConDeep(true);
		
		sinosRespaldo=this.sinoLogic.getSiNos();
		
		this.sinoLogic.setSiNos(sinosParaReportes);	
		this.sinoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		sinosParaReportes=this.sinoLogic.getSiNos();
		this.sinoLogic.setSiNos(sinosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("SiNos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSiNo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(SiNo sino : sinosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSiNo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SiNoConstantesFunciones.generarExcelReporteDataSiNo("NORMAL",row,workbook,sino,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SiNoConstantesFunciones.getSiNoDescripcion(sino));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSiNo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSiNo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSiNo() throws Exception {		
		this.startProcessSiNo(true);
	}
	
	public void startProcessSiNo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesSiNo, this.jScrollPanelDatosSiNo,this.jPanelPaginacionSiNo, this.jScrollPanelDatosEdicionSiNo, this.jPanelAccionesSiNo,this.jPanelAccionesFormularioSiNo,this.jmenuBarSiNo,this.jmenuBarDetalleSiNo,this.jTtoolBarSiNo,this.jTtoolBarDetalleSiNo);		
		
		final JTabbedPane jTabbedPaneBusquedasSiNo=null; 
		
		final JPanel jPanelParametrosReportesSiNo=this.jPanelParametrosReportesSiNo;
		//final JScrollPane jScrollPanelDatosSiNo=this.jScrollPanelDatosSiNo;
		final JTable jTableDatosSiNo=this.jTableDatosSiNo;		
		final JPanel jPanelPaginacionSiNo=this.jPanelPaginacionSiNo;
		//final JScrollPane jScrollPanelDatosEdicionSiNo=this.jScrollPanelDatosEdicionSiNo;
		final JPanel jPanelAccionesSiNo=this.jPanelAccionesSiNo;
		
		JPanel jPanelCamposAuxiliarSiNo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSiNo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
			jPanelCamposAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jPanelCamposSiNo;
			jPanelAccionesFormularioAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jPanelAccionesFormularioSiNo;
		}
		
		final JPanel jPanelCamposSiNo=jPanelCamposAuxiliarSiNo;
		final JPanel jPanelAccionesFormularioSiNo=jPanelAccionesFormularioAuxiliarSiNo;
		
		
		final JMenuBar jmenuBarSiNo=this.jmenuBarSiNo;
		final JToolBar jTtoolBarSiNo=this.jTtoolBarSiNo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSiNo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSiNo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
			jmenuBarDetalleAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jmenuBarDetalleSiNo;
			jTtoolBarDetalleAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jTtoolBarDetalleSiNo;
		}
		
		final JMenuBar jmenuBarDetalleSiNo=jmenuBarDetalleAuxiliarSiNo;
		final JToolBar jTtoolBarDetalleSiNo=jTtoolBarDetalleAuxiliarSiNo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSiNo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSiNo;
			processRunnable.jTableDatos=jTableDatosSiNo;
			processRunnable.jPanelCampos=jPanelCamposSiNo;
			processRunnable.jPanelPaginacion=jPanelPaginacionSiNo;
			processRunnable.jPanelAcciones=jPanelAccionesSiNo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSiNo;
			
			
			processRunnable.jmenuBar=jmenuBarSiNo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSiNo;
			processRunnable.jTtoolBar=jTtoolBarSiNo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSiNo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSiNo ,jPanelParametrosReportesSiNo,jTableDatosSiNo, /*jScrollPanelDatosSiNo,*/jPanelCamposSiNo,jPanelPaginacionSiNo, /*jScrollPanelDatosEdicionSiNo,*/ jPanelAccionesSiNo,jPanelAccionesFormularioSiNo,jmenuBarSiNo,jmenuBarDetalleSiNo,jTtoolBarSiNo,jTtoolBarDetalleSiNo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesSiNo, jScrollPanelDatosSiNo,jPanelPaginacionSiNo, jScrollPanelDatosEdicionSiNo, jPanelAccionesSiNo,jPanelAccionesFormularioSiNo,jmenuBarSiNo,jmenuBarDetalleSiNo,jTtoolBarSiNo,jTtoolBarDetalleSiNo);
						
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
	
	public void finishProcessSiNo() {// throws Exception 
		this.finishProcessSiNo(true);
	}
	
	public void finishProcessSiNo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesSiNo, this.jScrollPanelDatosSiNo,this.jPanelPaginacionSiNo, this.jScrollPanelDatosEdicionSiNo, this.jPanelAccionesSiNo,this.jPanelAccionesFormularioSiNo,this.jmenuBarSiNo,this.jmenuBarDetalleSiNo,this.jTtoolBarSiNo,this.jTtoolBarDetalleSiNo);		
		
		final JTabbedPane jTabbedPaneBusquedasSiNo=null; 
		
		final JPanel jPanelParametrosReportesSiNo=this.jPanelParametrosReportesSiNo;
		//final JScrollPane jScrollPanelDatosSiNo=this.jScrollPanelDatosSiNo;
		final JTable jTableDatosSiNo=this.jTableDatosSiNo;		
		final JPanel jPanelPaginacionSiNo=this.jPanelPaginacionSiNo;
		//final JScrollPane jScrollPanelDatosEdicionSiNo=this.jScrollPanelDatosEdicionSiNo;
		final JPanel jPanelAccionesSiNo=this.jPanelAccionesSiNo;
		
		JPanel jPanelCamposAuxiliarSiNo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSiNo=new JPanel();
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
			jPanelCamposAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jPanelCamposSiNo;
			jPanelAccionesFormularioAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jPanelAccionesFormularioSiNo;
		}
		
		final JPanel jPanelCamposSiNo=jPanelCamposAuxiliarSiNo;
		final JPanel jPanelAccionesFormularioSiNo=jPanelAccionesFormularioAuxiliarSiNo;
		
		
		final JMenuBar jmenuBarSiNo=this.jmenuBarSiNo;		
		final JToolBar jTtoolBarSiNo=this.jTtoolBarSiNo;
				
		JMenuBar jmenuBarDetalleAuxiliarSiNo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSiNo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
			jmenuBarDetalleAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jmenuBarDetalleSiNo;
			jTtoolBarDetalleAuxiliarSiNo=this.jInternalFrameDetalleFormSiNo.jTtoolBarDetalleSiNo;		
		}
		
		final JMenuBar jmenuBarDetalleSiNo=jmenuBarDetalleAuxiliarSiNo;
		final JToolBar jTtoolBarDetalleSiNo=jTtoolBarDetalleAuxiliarSiNo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSiNo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSiNo;
			processRunnable.jTableDatos=jTableDatosSiNo;
			processRunnable.jPanelCampos=jPanelCamposSiNo;
			processRunnable.jPanelPaginacion=jPanelPaginacionSiNo;
			processRunnable.jPanelAcciones=jPanelAccionesSiNo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSiNo;
			
			
			processRunnable.jmenuBar=jmenuBarSiNo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSiNo;
			processRunnable.jTtoolBar=jTtoolBarSiNo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSiNo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSiNo ,jPanelParametrosReportesSiNo, jTableDatosSiNo,/*jScrollPanelDatosSiNo,*/jPanelCamposSiNo,jPanelPaginacionSiNo, /*jScrollPanelDatosEdicionSiNo,*/ jPanelAccionesSiNo,jPanelAccionesFormularioSiNo,jmenuBarSiNo,jmenuBarDetalleSiNo,jTtoolBarSiNo,jTtoolBarDetalleSiNo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSiNo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSiNo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSiNo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSiNo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSiNo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSiNo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSiNo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSiNo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSiNo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.sinoConstantesFunciones.getsFinalQuerySiNo();
		String  finalQueryPaginacionTodos=this.sinoConstantesFunciones.getsFinalQuerySiNo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SiNoConstantesFunciones.getArrayColumnasGlobalesNoSiNo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SiNoConstantesFunciones.getArrayColumnasGlobalesSiNo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SiNoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.sinosEliminados= new ArrayList<SiNo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSiNo();
		
				///*SiNoSessionBean*/this.sinoSessionBean=new SiNoSessionBean();
			
			if(this.sinoSessionBean==null) {
				this.sinoSessionBean=new SiNoSessionBean();
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
					this.iNumeroPaginacion=SiNoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SiNoConstantesFunciones.getClassesForeignKeysOfSiNo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sino."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			sinosAux= new ArrayList<SiNo>();
			
				
			sinoLogic.setDatosCliente(this.datosCliente);
			sinoLogic.setDatosDeep(this.datosDeep);
			sinoLogic.setIsConDeep(true);
			
			
			sinoLogic.getSiNoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					sinoLogic.getTodosSiNos(finalQueryGlobal,pagination);
					
					//sinoLogic.getTodosSiNosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(sinoLogic.getSiNos()==null|| sinoLogic.getSiNos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sinosAux= new ArrayList<SiNo>();
							sinosAux.addAll(sinoLogic.getSiNos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sinosAux= new ArrayList<SiNo>();
							sinosAux.addAll(sinos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sinoLogic.getTodosSiNos(finalQueryGlobal+"",this.pagination);												
							
							//sinoLogic.getTodosSiNosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSiNos("Todos",sinoLogic.getSiNos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							sinoLogic.setSiNos(new ArrayList<SiNo>());					
							sinoLogic.getSiNos().addAll(sinosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sinos=new ArrayList<SiNo>();
							sinos.addAll(sinosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSiNo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSiNo=this.idActual;
				
				} else if(this.idSiNoActual!=null && this.idSiNoActual!=0L) {
					idSiNo=idSiNoActual;
				}
				
					
				this.sDetalleReporte=SiNoConstantesFunciones.getDetalleIndicePorId(idSiNo);
				
				this.sinos=new ArrayList<SiNo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					sinoLogic.getEntity(idSiNo);
					
					//sinoLogic.getEntityWithConnection(idSiNo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sinoLogic.setSiNos(new ArrayList<SiNo>());
					sinoLogic.getSiNos().add(sinoLogic.getSiNo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sinos=new ArrayList<SiNo>();
					this.sinos.add(sino);
				}
				
				if(sinoLogic.getSiNo()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSiNo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSiNo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sinoLogic.getSiNos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sinos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=sinoLogic.getSiNos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sinos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(SiNo sino) {
		Boolean permite=true;
		
		if(this.sino.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SiNoConstantesFunciones.getOrderByListaSiNo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SiNoConstantesFunciones.getOrderByListaSiNo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SiNo sino:sinoLogic.getSiNos()) {
				if(sino.getsType().equals(Constantes2.S_TOTALES)) {
					sinoTotales=sino;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SiNo sino:this.sinos) {
				if(sino.getsType().equals(Constantes2.S_TOTALES)) {
					sinoTotales=sino;
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
			this.sinoAux=new SiNo();
			this.sinoAux.setsType(Constantes2.S_TOTALES);
			this.sinoAux.setIsNew(false);
			this.sinoAux.setIsChanged(false);
			this.sinoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SiNoConstantesFunciones.TotalizarValoresFilaSiNo(this.sinoLogic.getSiNos(),this.sinoAux);
				
				this.sinoLogic.getSiNos().add(this.sinoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SiNoConstantesFunciones.TotalizarValoresFilaSiNo(this.sinos,this.sinoAux);
				
				this.sinos.add(this.sinoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		sinoTotales=new SiNo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sinoLogic.getSiNos().remove(sinoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sinos.remove(sinoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		sinoTotales=new SiNo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(SiNo sino:sinoLogic.getSiNos()) {
				if(sino.getsType().equals(Constantes2.S_TOTALES)) {
					sinoTotales=sino;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SiNoConstantesFunciones.TotalizarValoresFilaSiNo(this.sinoLogic.getSiNos(),sinoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(SiNo sino:this.sinos) {
				if(sino.getsType().equals(Constantes2.S_TOTALES)) {
					sinoTotales=sino;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SiNoConstantesFunciones.TotalizarValoresFilaSiNo(this.sinos,sinoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosSiNo() {
		this.isPermisoTodoSiNo=false;
		this.isPermisoNuevoSiNo=false;
		this.isPermisoActualizarSiNo=false;
		this.isPermisoActualizarOriginalSiNo=false;
		this.isPermisoEliminarSiNo=false;
		this.isPermisoGuardarCambiosSiNo=false;
		this.isPermisoConsultaSiNo=false;
		this.isPermisoBusquedaSiNo=false;
		this.isPermisoReporteSiNo=false;		
		this.isPermisoOrdenSiNo=false;		
		this.isPermisoPaginacionMedioSiNo=false;		
		this.isPermisoPaginacionAltoSiNo=false;
		this.isPermisoPaginacionTodoSiNo=false;
		this.isPermisoCopiarSiNo=false;		
		this.isPermisoVerFormSiNo=false;		
		this.isPermisoDuplicarSiNo=false;		
		this.isPermisoOrdenSiNo=false;		
	}
	
	public void setPermisosUsuarioSiNo(Boolean isPermiso) {
		this.isPermisoTodoSiNo=isPermiso;
		this.isPermisoNuevoSiNo=isPermiso;
		this.isPermisoActualizarSiNo=isPermiso;
		this.isPermisoActualizarOriginalSiNo=isPermiso;
		this.isPermisoEliminarSiNo=isPermiso;
		this.isPermisoGuardarCambiosSiNo=isPermiso;
		this.isPermisoConsultaSiNo=isPermiso;
		this.isPermisoBusquedaSiNo=isPermiso;
		this.isPermisoReporteSiNo=isPermiso;
		this.isPermisoOrdenSiNo=isPermiso;		
		this.isPermisoPaginacionMedioSiNo=isPermiso;		
		this.isPermisoPaginacionAltoSiNo=isPermiso;		
		this.isPermisoPaginacionTodoSiNo=isPermiso;		
		this.isPermisoCopiarSiNo=isPermiso;		
		this.isPermisoVerFormSiNo=isPermiso;		
		this.isPermisoDuplicarSiNo=isPermiso;
		this.isPermisoOrdenSiNo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSiNo(Boolean isPermiso) {
		//this.isPermisoTodoSiNo=isPermiso;
		this.isPermisoNuevoSiNo=isPermiso;
		this.isPermisoActualizarSiNo=isPermiso;
		this.isPermisoActualizarOriginalSiNo=isPermiso;
		this.isPermisoEliminarSiNo=isPermiso;
		this.isPermisoGuardarCambiosSiNo=isPermiso;
		//this.isPermisoConsultaSiNo=isPermiso;
		//this.isPermisoBusquedaSiNo=isPermiso;
		//this.isPermisoReporteSiNo=isPermiso;
		//this.isPermisoOrdenSiNo=isPermiso;		
		//this.isPermisoPaginacionMedioSiNo=isPermiso;		
		//this.isPermisoPaginacionAltoSiNo=isPermiso;		
		//this.isPermisoPaginacionTodoSiNo=isPermiso;		
		//this.isPermisoCopiarSiNo=isPermiso;		
		//this.isPermisoDuplicarSiNo=isPermiso;
		//this.isPermisoOrdenSiNo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSiNoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SiNoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSiNo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSiNoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSiNoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSiNoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSiNoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSiNo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SiNoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.sinoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SiNoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSiNo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSiNo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSiNo=this.isPermisoActualizarSiNo;
			this.isPermisoEliminarSiNo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSiNo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSiNo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSiNo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSiNo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSiNo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSiNo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSiNo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSiNo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSiNo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSiNo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSiNo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSiNo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSiNo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.sinoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSiNo.setToolTipText(this.jTableDatosSiNo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSiNo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSiNo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SiNoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SiNoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSiNo() throws Exception {
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
	
		
	public void inicializarCombosForeignKeySiNoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySiNoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SiNoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySiNoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeySiNoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySiNo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeySiNo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySiNo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySiNo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySiNo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySiNo(SiNo sino)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySiNo(SiNo sino,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySiNo()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySiNo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySiNo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySiNo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSiNo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySiNo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySiNo(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySiNo()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public SiNoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SiNoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SiNoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.sinoSessionBean=new SiNoSessionBean(); 
		this.sinoConstantesFunciones=new SiNoConstantesFunciones(); 
		this.sinoBean=new SiNo();//(this.sinoConstantesFunciones); 		
		this.sinoReturnGeneral=new SiNoParameterReturnGeneral(); 
		
		this.sinoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.sinoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SiNoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SiNoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SiNoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSiNo(true);
			
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
			
			this.sinoConstantesFunciones=new SiNoConstantesFunciones(); 
			this.sinoBean=new SiNo();//this.sinoConstantesFunciones); 			
			this.sinoReturnGeneral=new SiNoParameterReturnGeneral(); 
		
			SiNoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Si/no Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.sino=new SiNo();
			this.sinos = new ArrayList<SiNo>();
			this.sinosAux = new ArrayList<SiNo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic=new SiNoLogic();
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			//this.sinoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.sinoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSiNo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSiNo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSiNo);	
					}
					
					if(this.jInternalFrameImportacionSiNo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSiNo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySiNo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySiNo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSiNo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSiNo);
				this.jInternalFrameDetalleFormSiNo.setVisible(false);
				this.jInternalFrameDetalleFormSiNo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSiNo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSiNo);
					this.jInternalFrameReporteDinamicoSiNo.setVisible(false);
					this.jInternalFrameReporteDinamicoSiNo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSiNo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSiNo);
					this.jInternalFrameImportacionSiNo.setVisible(false);
					this.jInternalFrameImportacionSiNo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySiNo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySiNo);
					this.jInternalFrameOrderBySiNo.setVisible(false);
					this.jInternalFrameOrderBySiNo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSiNoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SiNoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.sinoReturnGeneral=new SiNoParameterReturnGeneral();
			
			this.sinoParameterGeneral=new SiNoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.sinoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SiNoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.sinoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SiNoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sinoSessionBean.getEsGuardarRelacionado(),this.sinoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SiNoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.sinoSessionBean.getEsGuardarRelacionado(),this.sinoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaDuplicarSiNo=true;
			this.isVisibilidadCeldaCopiarSiNo=true;
			this.isVisibilidadCeldaVerFormSiNo=true;
			this.isVisibilidadCeldaOrdenSiNo=true;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
			this.isVisibilidadCeldaModificarSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=false;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=false;
			this.isVisibilidadCeldaGuardarSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSiNo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSiNo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSiNo(false);
			
			this.setPermisosUsuarioSiNo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sinoSessionBean.getEsGuardarRelacionado() 
				|| (this.sinoSessionBean.getEsGuardarRelacionado() && this.sinoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSiNoClasesRelacionadas();
			}
			
			if(this.sinoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSiNoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SiNoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSiNo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSiNo();
			}
			
			if(!this.isPermisoBusquedaSiNo) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sinoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSiNo,this.isPermisoPaginacionMedioSiNo,this.isPermisoPaginacionTodoSiNo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SiNoConstantesFunciones.getTiposSeleccionarSiNo());
				
				this.tiposColumnasSelect=SiNoConstantesFunciones.getTiposSeleccionarSiNo(true);
				
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
			//if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSiNo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioSiNo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioSiNo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSiNo() ;
			
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
				sinoImplementable= (SiNoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SiNoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				sinoImplementableHome= (SiNoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SiNoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sinos= new ArrayList<SiNo>();
			this.sinosEliminados= new ArrayList<SiNo>();
						
			this.isEsNuevoSiNo=false;
			this.esParaAccionDesdeFormularioSiNo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySiNo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSiNo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SiNoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSiNo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSiNo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSiNo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSiNo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSiNo();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSiNo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga SiNo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSiNo() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSiNo")) {
				iIndex=this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSiNo.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSiNo();	
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
	
	public void cargarCombosForeignKeySiNo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySiNo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySiNo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySiNoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySiNo();
		
		this.cargarCombosFrameForeignKeySiNo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySiNo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySiNo();
		}
	}
	
	
	
	public void jButtonNuevoSiNoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.sinoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			
			if(jTableDatosSiNo.getRowCount()>=1) {
				jTableDatosSiNo.removeRowSelectionInterval(0, jTableDatosSiNo.getRowCount()-1);						
			}
			
			this.isEsNuevoSiNo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSiNo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSiNo(true);			
			//this.sino=new SiNo();
			//this.sino.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSiNo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSiNo() ;
			
			if(SiNoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSiNo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sino);	
			this.actualizarInformacion("INFO_PADRE",false,this.sino);				
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			if(this.sinoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar SiNo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSiNoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSiNo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSiNo.getSelectedRows().length;			
			}
			
			sinosSeleccionados=this.getSiNosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSiNo--;			
				//SiNo sinoAux= new SiNo();			
				//sinoAux.setId(this.iIdNuevoSiNo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//SiNo sinoOrigen=new SiNo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(SiNo sinoOrigen : sinosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							sinoOrigen =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sinoOrigen =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSiNo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sino.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSiNo(sinoOrigen,this.sino,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sinoLogic.getSiNos().add(this.sinoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sinos.add(this.sinoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSiNo(false);
				
				this.jTableDatosSiNo.setRowSelectionInterval(this.getIndiceNuevoSiNo(), this.getIndiceNuevoSiNo());
				
				int iLastRow =  this.jTableDatosSiNo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSiNo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSiNo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSiNo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();									
		
			SiNo sinoOrigen=new SiNo();
			SiNo sinoDestino=new SiNo();
				
			sinosSeleccionados=this.getSiNosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSiNo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || sinosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSiNo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sinoOrigen =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sinoOrigen =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						sinoDestino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						sinoDestino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				sinoOrigen =sinosSeleccionados.get(0);
				sinoDestino =sinosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSiNo(sinoOrigen,sinoDestino,true,false);
				
				sinoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(sinoDestino,sinoLogic.getSiNos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(sinoDestino,sinos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSiNo(false);
				
				//this.jTableDatosSiNo.setRowSelectionInterval(this.getIndiceNuevoSiNo(), this.getIndiceNuevoSiNo());
				
				int iLastRow =  this.jTableDatosSiNo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSiNo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSiNo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSiNo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSiNo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSiNo.isVisible();
			
			
			this.jPanelParametrosReportesSiNo.setVisible(!isVisible);
			this.jPanelPaginacionSiNo.setVisible(!isVisible);
			this.jPanelAccionesSiNo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSiNo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSiNo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSiNo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySiNo();
			
			this.abrirFrameOrderBySiNo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySiNo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSiNo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSiNo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSiNo.isMaximum()) {
					this.jInternalFrameDetalleFormSiNo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSiNo.setSize(this.jInternalFrameDetalleFormSiNo.iWidthFormulario,this.jInternalFrameDetalleFormSiNo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSiNo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSiNo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSiNo.isMaximum()) {
						this.jInternalFrameDetalleFormSiNo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSiNo.jContentPaneDetalleSiNo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSiNo.jContentPaneDetalleSiNo.getWidth(),SiNoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSiNo.jContentPaneDetalleSiNo.getWidth(),SiNoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSiNo.jContentPaneDetalleSiNo.getWidth(),SiNoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSiNo.setVisible(true);
	        this.jInternalFrameDetalleFormSiNo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySiNo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySiNo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySiNo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySiNo,false,this);
				} else {
					this.jInternalFrameOrderBySiNo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySiNo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySiNo);
				this.jInternalFrameOrderBySiNo.setVisible(false);
				this.jInternalFrameOrderBySiNo.setSelected(false);
				
				this.jInternalFrameOrderBySiNo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySiNo"));
				
				this.inicializarActualizarBindingTablaOrderBySiNo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSiNo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSiNo==null) {
				
				this.jInternalFrameImportacionSiNo=new ImportacionJInternalFrame(SiNoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSiNo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSiNo);
				this.jInternalFrameImportacionSiNo.setVisible(false);
				this.jInternalFrameImportacionSiNo.setSelected(false);


				this.jInternalFrameImportacionSiNo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSiNo"));
				this.jInternalFrameImportacionSiNo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSiNo"));
				this.jInternalFrameImportacionSiNo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSiNo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSiNo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSiNo==null) {
				this.jInternalFrameReporteDinamicoSiNo=new ReporteDinamicoJInternalFrame(SiNoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSiNo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSiNo);
				this.jInternalFrameReporteDinamicoSiNo.setVisible(false);
				this.jInternalFrameReporteDinamicoSiNo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSiNo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSiNo"));
				this.jInternalFrameReporteDinamicoSiNo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSiNo"));
				this.jInternalFrameReporteDinamicoSiNo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSiNo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSiNo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleSiNo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSiNo);
			
	       	this.jInternalFrameDetalleFormSiNo.setVisible(false);
	        this.jInternalFrameDetalleFormSiNo.setSelected(false);
			
			//this.jInternalFrameDetalleFormSiNo.dispose();
			//this.jInternalFrameDetalleFormSiNo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSiNo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSiNo.setVisible(true);
	        this.jInternalFrameReporteDinamicoSiNo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSiNo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSiNo.setVisible(true);
	        this.jInternalFrameImportacionSiNo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySiNo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySiNo.setVisible(true);
	        this.jInternalFrameOrderBySiNo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySiNo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySiNo.setVisible(false);
	        this.jInternalFrameOrderBySiNo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSiNo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSiNo.setVisible(false);
	        this.jInternalFrameReporteDinamicoSiNo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSiNo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSiNo.setVisible(false);
	        this.jInternalFrameImportacionSiNo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSiNo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSiNo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSiNo(true);
			//this.isEsNuevoSiNo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSiNo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSiNo(false) ;
			
			if(sinoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SiNoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSiNo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSiNo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSiNoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSiNo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSiNo(true);
			//this.isEsNuevoSiNo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sino.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSiNo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSiNo(false) ;
			
			if(SiNoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSiNo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSiNo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSiNo(false);
			
			//if(!this.isEsNuevoSiNo) {								
				int intSelectedRow = this.jTableDatosSiNo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSiNo(this.sino,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
				
			}
			
			if(this.permiteMantenimiento(this.sino)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.sinoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSiNo=true;
					this.inicializarActualizarBindingTablaSiNo(false);
					this.isEsNuevoSiNo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSiNo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSiNo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSiNo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSiNo(false);
				
				this.habilitarDeshabilitarControlesSiNo(false);
			
												
				
				if(SiNoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSiNo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSiNoActionPerformed(evt,sinoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSiNo(this.sino,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSiNo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,sinoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sino.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSiNoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSiNo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				this.sino.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				this.sino.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sino)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.sinoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SiNoModel) this.jTableDatosSiNo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSiNo=true;
				this.inicializarActualizarBindingTablaSiNo(false);
				this.isEsNuevoSiNo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSiNo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSiNo(false);
				
				this.habilitarDeshabilitarControlesSiNo(false);
				
				
				
				if(SiNoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSiNo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSiNoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSiNo.getRowCount()>=1) {
				jTableDatosSiNo.removeRowSelectionInterval(0, jTableDatosSiNo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSiNo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSiNo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSiNo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSiNo(false) ;
			
			this.isEsNuevoSiNo=false;
			
			if(SiNoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSiNo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSiNoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSiNo(false);
				
				//SI ES MANUAL
				if(SiNoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSiNo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSiNoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSiNo--;			
			//SiNo sinoAux= new SiNo();			
			//sinoAux.setId(this.iIdNuevoSiNo);
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSiNo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
			
			this.sino.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.sinoLogic.getSiNos().add(this.sinoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sinos.add(this.sinoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSiNo(false);
			
			this.jTableDatosSiNo.setRowSelectionInterval(this.getIndiceNuevoSiNo(), this.getIndiceNuevoSiNo());
			
			int iLastRow =  this.jTableDatosSiNo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSiNo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSiNo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSiNo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSiNoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSiNo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSiNo(false);
			
			//SI ES MANUAL
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSiNo();
			}
			
			//this.abrirFrameTreeSiNo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSiNoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Si/no ?", "MANTENIMIENTO DE Si/no", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSiNo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSiNo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.sinoReturnGeneral=sinoLogic.procesarImportacionSiNosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.sinoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSiNoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSiNoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSiNo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSiNo.setFileImportacion(this.jInternalFrameImportacionSiNo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSiNo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSiNo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSiNo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSiNo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSiNoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		

		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SiNoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SiNoBaseDesign.jrxml";
			
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
			
			this.generarReporteSiNos("Todos",sinosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SiNoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoSiNo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SiNoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SiNoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSiNo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSiNo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SiNoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoSiNoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("SiNos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SiNoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SiNoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(SiNo sino:sinosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sino.getnombre());
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
			//	this.getFilaCabeceraExportarExcelSiNo(row);				
			//	iRow++;
			//}				
			
			//for(SiNo sinoAux:sinosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSiNo(sinoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
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
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSiNo(false);
			
			//SI ES MANUAL
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSiNo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSiNoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSiNo(false);
			
			//SI ES MANUAL
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSiNo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSiNoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSiNo(false);
			
			//SI ES MANUAL
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSiNo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sinoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSiNo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSiNo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSiNo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSiNo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSiNo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSiNo.setMinimumSize(dimensionMinimum);
		this.jTableDatosSiNo.setMaximumSize(dimensionMaximum);
		this.jTableDatosSiNo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSiNo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSiNo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSiNo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSiNo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSiNo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSiNo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSiNo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSiNo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SiNoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SiNoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSiNo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSiNo();
		
		this.inicializarActualizarBindingBotonesManualSiNo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSiNo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSiNo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSiNo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSiNo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSiNo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSiNo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSiNo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSiNo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSiNo.jCheckBoxPostAccionNuevoSiNo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSiNo.jCheckBoxPostAccionSinCerrarSiNo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSiNo.jCheckBoxPostAccionSinMensajeSiNo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSiNo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSiNo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSiNo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSiNo!=null) {
				this.jInternalFrameDetalleFormSiNo.jCheckBoxPostAccionNuevoSiNo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSiNo.jCheckBoxPostAccionSinCerrarSiNo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSiNo.jCheckBoxPostAccionSinMensajeSiNo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSiNo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSiNo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSiNo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSiNo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSiNo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSiNo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSiNo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSiNo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSiNo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSiNo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSiNo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSiNo(Boolean esInicializar) throws Exception {
		try	{	
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSiNo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSiNo() throws Exception {
		try	{
			if(SiNoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSiNo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSiNo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSiNo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSiNo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSiNo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSiNo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSiNo.addItem(reporte);
			}
			
			
			if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSiNo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSiNo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSiNo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSiNo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSiNo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSiNo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSiNo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSiNo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSiNo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSiNo!=null) {
				this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSiNo!=null) {
				this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSiNo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSiNo!=null) {
				
				if(this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSiNo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSiNo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSiNo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSiNo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSiNo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSiNo(Boolean esInicializar) throws Exception {				
		if(SiNoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSiNo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSiNo() throws Exception {
		this.inicializarActualizarBindingTablaSiNo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySiNo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SiNoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SiNoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSiNoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSiNoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SiNoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SiNoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSiNo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=sinoLogic.getSiNos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sinos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSiNo.setModel(new SiNoModel(this.sinoLogic.getSiNos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSiNo.setModel(new SiNoModel(this.sinos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySiNo!=null && this.jInternalFrameOrderBySiNo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySiNo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSiNo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSiNo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SiNoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SiNoConstantesFunciones.SCLASSWEBTITULO,sinoConstantesFunciones.resaltarSeleccionarSiNo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SiNoConstantesFunciones.SCLASSWEBTITULO,sinoConstantesFunciones.resaltarSeleccionarSiNo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSiNo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSiNo,SiNoConstantesFunciones.LABEL_ID));

		if(this.sinoConstantesFunciones.mostraridSiNo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SiNoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.sinoConstantesFunciones.resaltaridSiNo,this.sinoConstantesFunciones.activaridSiNo,this,true,"idSiNo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sinoConstantesFunciones.resaltaridSiNo,this.sinoConstantesFunciones.activaridSiNo,this,true,"idSiNo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSiNo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSiNo,SiNoConstantesFunciones.LABEL_NOMBRE));

		if(this.sinoConstantesFunciones.mostrarnombreSiNo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SiNoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.sinoConstantesFunciones.resaltarnombreSiNo,this.sinoConstantesFunciones.activarnombreSiNo,this,true,"nombreSiNo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.sinoConstantesFunciones.resaltarnombreSiNo,this.sinoConstantesFunciones.activarnombreSiNo,this,true,"nombreSiNo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SiNoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.sinoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sinoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sinoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSiNo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.sinoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.sinoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSiNo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSiNo && this.isPermisoGuardarCambiosSiNo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.sinoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.sinoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSiNo.addColumn(tableColumn);
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
			
			this.jTableDatosSiNo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSiNo && this.isPermisoGuardarCambiosSiNo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSiNo && this.isPermisoGuardarCambiosSiNo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSiNo.moveColumn(this.jTableDatosSiNo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSiNo.moveColumn(this.jTableDatosSiNo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSiNo.moveColumn(this.jTableDatosSiNo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSiNo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSiNo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSiNo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSiNo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSiNo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSiNo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSiNo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSiNo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=sinoLogic.getSiNos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sinos.size()-1;
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
		//this.jTableDatosSiNo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSiNo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSiNo();
			
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
				
				//this.isEsNuevoSiNo=false;
					
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
				if(this.sinoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSiNo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSiNo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSiNo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sino.getsType().equals("DUPLICADO")
				   || this.sino.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSiNo=true;
				
				} else {
					this.isEsNuevoSiNo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.sinoSessionBean.getEsGuardarRelacionado()) {
					if(this.sino.getId()>=0 && !this.sino.getIsNew()) {						
						this.isEsNuevoSiNo=false;
						
					} else {
						this.isEsNuevoSiNo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSiNo(esRelaciones);						
				
				this.seleccionarSiNo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sino.getId()<0) {
					this.isEsNuevoSiNo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSiNo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSiNo(evt,rowIndex);
				}	
				
				if(this.sinoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion SiNo: " + this.dDif); 
					}
				}								
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSiNo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sino)) {
					if(this.sino.getId()>0) {
						this.sino.setIsDeleted(true);
						
						this.sinosEliminados.add(this.sino);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.sinoLogic.getSiNos().remove(this.sino);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sinos.remove(this.sino);				
					}
					
					
					((SiNoModel) this.jTableDatosSiNo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSiNo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSiNo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSiNo) {
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSiNo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSiNo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSiNo(this.sino);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSiNo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSiNo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSiNo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSiNo(SiNo sino) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSiNo(sino,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSiNo(SiNo sino,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSiNo(sino);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySiNo(sino,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySiNo(sino);
	}
	
	public void setVariablesObjetoActualToFormularioSiNo(SiNo sino) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setText(sino.getId().toString());
			this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setText(sino.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,SiNo sinoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,sinoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,SiNo sinoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				sinoLocal=this.sino;
			} else {
				sinoLocal=this.sinoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(sinoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSiNo(sinoLocal,true);
					
					if(sinoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(sinoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.sinoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(sinoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSiNo(SiNo sino,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSiNo(sino,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSiNo(sino);
	}
	
	public void setVariablesFormularioToObjetoActualSiNo(SiNo sino,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSiNo(sino,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSiNo(SiNo sino,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.getText()==null || this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.getText()=="" || this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.getText()=="Id") {
				this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setText("0");
			}

			if(conColumnasBase) {sino.setId(Long.parseLong(this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SiNoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSiNo.jLabelIdSiNo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sino.setnombre(this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SiNoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSiNo.jLabelnombreSiNo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSiNo(SiNo sinoBean,SiNo sino,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSiNo(SiNo sinoOrigen,SiNo sino,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sinoOrigen.getId()!=null && !sinoOrigen.getId().equals(0L))) {sino.setId(sinoOrigen.getId());}}
			if(conDefault || (!conDefault && sinoOrigen.getnombre()!=null && !sinoOrigen.getnombre().equals(""))) {sino.setnombre(sinoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSiNo(SiNo sino) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setText(sino.getId().toString());
			this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setText(sino.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSiNo(SiNoBean sinoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setText(sinoBean.getId().toString());
			this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setText(sinoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSiNo(SiNoParameterReturnGeneral sinoReturnGeneral,SiNoBean sinoBean,Boolean conDefault) throws Exception { 
		try {
			SiNo sinoLocal=new SiNo();
			
			sinoLocal=sinoReturnGeneral.getSiNo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && sinoLocal.getId()!=null && !sinoLocal.getId().equals(0L))) {sinoBean.setId(sinoLocal.getId());}}
			if(conDefault || (!conDefault && sinoLocal.getnombre()!=null && !sinoLocal.getnombre().equals(""))) {sinoBean.setnombre(sinoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSiNoGenerico(Long idSiNoSeleccionado,JComboBox jComboBoxSiNo,List<SiNo> sinosLocal)throws Exception {
		try {
			SiNo  sinoTemp=null;

			for(SiNo sinoAux:sinosLocal) {
				if(sinoAux.getId()!=null && sinoAux.getId().equals(idSiNoSeleccionado)) {
					sinoTemp=sinoAux;
					break;
				}
			}

			jComboBoxSiNo.setSelectedItem(sinoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSiNoGenerico(JComboBox jComboBoxSiNo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSiNo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSiNo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSiNo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSiNo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSiNo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSiNo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSiNo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSiNo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSiNo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSiNo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sino=(SiNo) sinoLogic.getSiNos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sino =(SiNo) sinos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		SiNo sinoRow=new SiNo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sinoRow=(SiNo) sinoLogic.getSiNos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sinoRow=(SiNo) sinos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSiNo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSiNo.setVisible((this.isVisibilidadCeldaNuevoSiNo && this.isPermisoNuevoSiNo));			
			this.jButtonDuplicarSiNo.setVisible((this.isVisibilidadCeldaDuplicarSiNo && this.isPermisoDuplicarSiNo));			
			this.jButtonCopiarSiNo.setVisible((this.isVisibilidadCeldaCopiarSiNo && this.isPermisoCopiarSiNo));
			this.jButtonVerFormSiNo.setVisible((this.isVisibilidadCeldaVerFormSiNo && this.isPermisoVerFormSiNo));
			
			this.jButtonAbrirOrderBySiNo.setVisible((this.isVisibilidadCeldaOrdenSiNo && this.isPermisoOrdenSiNo));			
			
			this.jButtonNuevoRelacionesSiNo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSiNo && this.isPermisoNuevoSiNo));			
			this.jButtonNuevoGuardarCambiosSiNo.setVisible((this.isVisibilidadCeldaNuevoSiNo && this.isPermisoNuevoSiNo && this.isPermisoGuardarCambiosSiNo));
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.jInternalFrameDetalleFormSiNo.jButtonModificarSiNo.setVisible((this.isVisibilidadCeldaModificarSiNo && this.isPermisoActualizarSiNo));	
			this.jInternalFrameDetalleFormSiNo.jButtonActualizarSiNo.setVisible((this.isVisibilidadCeldaActualizarSiNo && this.isPermisoActualizarSiNo));	
			this.jInternalFrameDetalleFormSiNo.jButtonEliminarSiNo.setVisible((this.isVisibilidadCeldaEliminarSiNo && this.isPermisoEliminarSiNo));
			this.jInternalFrameDetalleFormSiNo.jButtonCancelarSiNo.setVisible(this.isVisibilidadCeldaCancelarSiNo);							
			this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.setVisible((this.isVisibilidadCeldaGuardarSiNo && this.isPermisoGuardarCambiosSiNo));			
			
			}
						
			this.jButtonGuardarCambiosTablaSiNo.setVisible((this.isVisibilidadCeldaGuardarCambiosSiNo && this.isPermisoGuardarCambiosSiNo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSiNo.setVisible((this.isVisibilidadCeldaNuevoSiNo && this.isPermisoNuevoSiNo));						
			this.jButtonDuplicarToolBarSiNo.setVisible((this.isVisibilidadCeldaDuplicarSiNo && this.isPermisoDuplicarSiNo));						
			this.jButtonCopiarToolBarSiNo.setVisible((this.isVisibilidadCeldaCopiarSiNo && this.isPermisoCopiarSiNo));			
			this.jButtonVerFormToolBarSiNo.setVisible((this.isVisibilidadCeldaVerFormSiNo && this.isPermisoVerFormSiNo));			
			this.jButtonAbrirOrderByToolBarSiNo.setVisible((this.isVisibilidadCeldaOrdenSiNo && this.isPermisoOrdenSiNo));
			this.jButtonNuevoRelacionesToolBarSiNo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSiNo && this.isPermisoNuevoSiNo));			
			this.jButtonNuevoGuardarCambiosToolBarSiNo.setVisible((this.isVisibilidadCeldaNuevoSiNo && this.isPermisoNuevoSiNo && this.isPermisoGuardarCambiosSiNo));			
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.jInternalFrameDetalleFormSiNo.jButtonModificarToolBarSiNo.setVisible((this.isVisibilidadCeldaModificarSiNo && this.isPermisoActualizarSiNo));	
			this.jInternalFrameDetalleFormSiNo.jButtonActualizarToolBarSiNo.setVisible((this.isVisibilidadCeldaActualizarSiNo  && this.isPermisoActualizarSiNo));	
			this.jInternalFrameDetalleFormSiNo.jButtonEliminarToolBarSiNo.setVisible((this.isVisibilidadCeldaEliminarSiNo && this.isPermisoEliminarSiNo));
			this.jInternalFrameDetalleFormSiNo.jButtonCancelarToolBarSiNo.setVisible(this.isVisibilidadCeldaCancelarSiNo);				
			this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosToolBarSiNo.setVisible((this.isVisibilidadCeldaGuardarSiNo && this.isPermisoGuardarCambiosSiNo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSiNo.setVisible((this.isVisibilidadCeldaGuardarCambiosSiNo && this.isPermisoGuardarCambiosSiNo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSiNo.setVisible((this.isVisibilidadCeldaNuevoSiNo && this.isPermisoNuevoSiNo));			
			this.jMenuItemDuplicarSiNo.setVisible((this.isVisibilidadCeldaDuplicarSiNo && this.isPermisoDuplicarSiNo));			
			this.jMenuItemCopiarSiNo.setVisible((this.isVisibilidadCeldaCopiarSiNo && this.isPermisoCopiarSiNo));			
			this.jMenuItemVerFormSiNo.setVisible((this.isVisibilidadCeldaVerFormSiNo && this.isPermisoVerFormSiNo));			
			this.jMenuItemAbrirOrderBySiNo.setVisible((this.isVisibilidadCeldaOrdenSiNo && this.isPermisoOrdenSiNo));			
			//this.jMenuItemMostrarOcultarSiNo.setVisible((this.isVisibilidadCeldaOrdenSiNo && this.isPermisoOrdenSiNo));
			this.jMenuItemDetalleAbrirOrderBySiNo.setVisible((this.isVisibilidadCeldaOrdenSiNo && this.isPermisoOrdenSiNo));			
			//this.jMenuItemDetalleMostrarOcultarSiNo.setVisible((this.isVisibilidadCeldaOrdenSiNo && this.isPermisoOrdenSiNo));			
			this.jMenuItemNuevoRelacionesSiNo.setVisible((this.isVisibilidadCeldaNuevoRelacionesSiNo && this.isPermisoNuevoSiNo));			
			this.jMenuItemNuevoGuardarCambiosSiNo.setVisible((this.isVisibilidadCeldaNuevoSiNo && this.isPermisoNuevoSiNo && this.isPermisoGuardarCambiosSiNo));									
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.jInternalFrameDetalleFormSiNo.jMenuItemModificarSiNo.setVisible((this.isVisibilidadCeldaModificarSiNo && this.isPermisoActualizarSiNo));	
			this.jInternalFrameDetalleFormSiNo.jMenuItemActualizarSiNo.setVisible((this.isVisibilidadCeldaActualizarSiNo && this.isPermisoActualizarSiNo));	
			this.jInternalFrameDetalleFormSiNo.jMenuItemEliminarSiNo.setVisible((this.isVisibilidadCeldaEliminarSiNo && this.isPermisoEliminarSiNo));
			this.jInternalFrameDetalleFormSiNo.jMenuItemCancelarSiNo.setVisible(this.isVisibilidadCeldaCancelarSiNo);				
			}
			
			this.jMenuItemGuardarCambiosSiNo.setVisible((this.isVisibilidadCeldaGuardarSiNo && this.isPermisoGuardarCambiosSiNo));						
			this.jMenuItemGuardarCambiosTablaSiNo.setVisible((this.isVisibilidadCeldaGuardarCambiosSiNo && this.isPermisoGuardarCambiosSiNo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSiNo=this.jButtonNuevoSiNo.isVisible();
			this.isVisibilidadCeldaDuplicarSiNo=this.jButtonDuplicarSiNo.isVisible();
			this.isVisibilidadCeldaCopiarSiNo=this.jButtonCopiarSiNo.isVisible();
			this.isVisibilidadCeldaVerFormSiNo=this.jButtonVerFormSiNo.isVisible();
			
			this.isVisibilidadCeldaOrdenSiNo=this.jButtonAbrirOrderBySiNo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSiNo=this.jButtonNuevoRelacionesSiNo.isVisible();
			this.isVisibilidadCeldaModificarSiNo=this.jButtonModificarSiNo.isVisible();
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.isVisibilidadCeldaActualizarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonActualizarSiNo.isVisible();
			this.isVisibilidadCeldaEliminarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonEliminarSiNo.isVisible();
			this.isVisibilidadCeldaCancelarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonCancelarSiNo.isVisible();
			this.isVisibilidadCeldaGuardarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSiNo=this.jButtonGuardarCambiosTablaSiNo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSiNo=this.jButtonNuevoToolBarSiNo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSiNo=this.jButtonNuevoRelacionesToolBarSiNo.isVisible();
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.isVisibilidadCeldaModificarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonModificarToolBarSiNo.isVisible();
			this.isVisibilidadCeldaActualizarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonActualizarToolBarSiNo.isVisible();
			this.isVisibilidadCeldaEliminarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonEliminarToolBarSiNo.isVisible();
			this.isVisibilidadCeldaCancelarSiNo=this.jInternalFrameDetalleFormSiNo.jButtonCancelarToolBarSiNo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSiNo=this.jButtonGuardarCambiosToolBarSiNo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSiNo=this.jButtonGuardarCambiosTablaToolBarSiNo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSiNo=this.jMenuItemNuevoSiNo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSiNo=this.jMenuItemNuevoRelacionesSiNo.isVisible();
			
			if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.isVisibilidadCeldaModificarSiNo=this.jInternalFrameDetalleFormSiNo.jMenuItemModificarSiNo.isVisible();
			this.isVisibilidadCeldaActualizarSiNo=this.jInternalFrameDetalleFormSiNo.jMenuItemActualizarSiNo.isVisible();
			this.isVisibilidadCeldaEliminarSiNo=this.jInternalFrameDetalleFormSiNo.jMenuItemEliminarSiNo.isVisible();
			this.isVisibilidadCeldaCancelarSiNo=this.jInternalFrameDetalleFormSiNo.jMenuItemCancelarSiNo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSiNo=this.jMenuItemGuardarCambiosSiNo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSiNo=this.jMenuItemGuardarCambiosTablaSiNo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSiNo(Boolean esInicializar) {
		if(SiNoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.sinoSessionBean.getConGuardarRelaciones()) {
				//if(this.sinoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSiNo();
			}
			
			this.inicializarActualizarBindingBotonesManualSiNo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSiNo() {
		this.jButtonNuevoSiNo.setVisible(this.isPermisoNuevoSiNo);			
		this.jButtonDuplicarSiNo.setVisible(this.isPermisoDuplicarSiNo);			
		this.jButtonCopiarSiNo.setVisible(this.isPermisoCopiarSiNo);			
		this.jButtonVerFormSiNo.setVisible(this.isPermisoVerFormSiNo);			
		
		this.jButtonAbrirOrderBySiNo.setVisible(this.isPermisoOrdenSiNo);					
		
		this.jButtonNuevoRelacionesSiNo.setVisible(this.isPermisoNuevoSiNo);			
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonModificarSiNo.setVisible(this.isPermisoActualizarSiNo);	
			this.jInternalFrameDetalleFormSiNo.jButtonActualizarSiNo.setVisible(this.isPermisoActualizarSiNo);	
			this.jInternalFrameDetalleFormSiNo.jButtonEliminarSiNo.setVisible(this.isPermisoEliminarSiNo);
			this.jInternalFrameDetalleFormSiNo.jButtonCancelarSiNo.setVisible(this.isVisibilidadCeldaCancelarSiNo);						
			this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.setVisible(this.isPermisoGuardarCambiosSiNo);							
		}
		
		this.jButtonGuardarCambiosTablaSiNo.setVisible(this.isPermisoActualizarSiNo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSiNo() {
		this.jInternalFrameDetalleFormSiNo.jButtonModificarSiNo.setVisible(this.isPermisoActualizarSiNo);	
		this.jInternalFrameDetalleFormSiNo.jButtonActualizarSiNo.setVisible(this.isPermisoActualizarSiNo);	
		this.jInternalFrameDetalleFormSiNo.jButtonEliminarSiNo.setVisible(this.isPermisoEliminarSiNo);
		this.jInternalFrameDetalleFormSiNo.jButtonCancelarSiNo.setVisible(this.isVisibilidadCeldaCancelarSiNo);							
		this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.setVisible((this.isVisibilidadCeldaGuardarSiNo && this.isPermisoGuardarCambiosSiNo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSiNo() {
		if(SiNoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSiNo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSiNo() {
	}
	
	public void jTableDatosSiNoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSiNo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSiNoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSiNo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSiNo(this.getsino(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sino==null) {
						this.sino = new SiNo();
					}

					this.setVariablesFormularioToObjetoActualSiNo(this.sino,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
				}

				if(this.sino.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sino.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSiNo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreSiNoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSiNo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSiNo(this.getsino(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sino==null) {
						this.sino = new SiNo();
					}

					this.setVariablesFormularioToObjetoActualSiNo(this.sino,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);
				}

				if(this.sino.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.sino.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSiNo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameSiNo() {
		if(this.jInternalFrameDetalleFormSiNo!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
			this.jInternalFrameDetalleFormSiNo.setVisible(false);	    			
			this.jInternalFrameDetalleFormSiNo.dispose();
			this.jInternalFrameDetalleFormSiNo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSiNo!=null) {
			this.jInternalFrameReporteDinamicoSiNo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSiNo.dispose();
			this.jInternalFrameReporteDinamicoSiNo=null;
		}
		
		if(this.jInternalFrameImportacionSiNo!=null) {
			this.jInternalFrameImportacionSiNo.setVisible(false);	    			
			this.jInternalFrameImportacionSiNo.dispose();
			this.jInternalFrameImportacionSiNo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSiNo();
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			
			if(sTipo.equals("NuevoSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSiNo")) {
				jButtonDuplicarSiNoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSiNo")) {
				jButtonCopiarSiNoActionPerformed(evt);
			} else if(sTipo.equals("VerFormSiNo")) {
				jButtonVerFormSiNoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSiNo")) {
				jButtonDuplicarSiNoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSiNo")) {
				jButtonDuplicarSiNoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSiNo")) {
				jButtonModificarSiNoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSiNo")) {
				jButtonModificarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSiNo")) {
				jButtonModificarSiNoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSiNo")) {
				jButtonActualizarSiNoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSiNo")) {
				jButtonActualizarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSiNo")) {
				jButtonActualizarSiNoActionPerformed(evt);
			} else if(sTipo.equals("EliminarSiNo")) {
				jButtonEliminarSiNoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSiNo")) {
				jButtonEliminarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSiNo")) {
				jButtonEliminarSiNoActionPerformed(evt);
			} else if(sTipo.equals("CancelarSiNo")) {
				jButtonCancelarSiNoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSiNo")) {
				jButtonCancelarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSiNo")) {
				jButtonCancelarSiNoActionPerformed(evt);
			} else if(sTipo.equals("CerrarSiNo")) {
				jButtonCerrarSiNoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSiNo")) {
				jButtonCerrarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSiNo")) {
				jButtonCerrarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSiNo")) {
				jButtonMostrarOcultarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSiNo")) {
				jButtonCancelarSiNoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSiNo")) {
				jButtonCopiarSiNoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSiNo")) {
				jButtonVerFormSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSiNo")) {
				jButtonCopiarSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSiNo")) {
				jButtonVerFormSiNoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSiNo")) {
				jButtonRecargarInformacionSiNoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSiNo")) {
				jButtonRecargarInformacionSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSiNo")) {
				jButtonRecargarInformacionSiNoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSiNo")) {
				jButtonAnterioresSiNoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSiNo")) {
				jButtonAnterioresSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSiNo")) {
				jButtonAnterioresSiNoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSiNo")) {
				jButtonSiguientesSiNoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSiNo")) {
				jButtonSiguientesSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSiNo")) {
				jButtonSiguientesSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySiNo") || sTipo.equals("MenuItemDetalleAbrirOrderBySiNo")) {
				jButtonAbrirOrderBySiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSiNo") || sTipo.equals("MenuItemDetalleMostrarOcultarSiNo")) {
				jButtonMostrarOcultarSiNoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSiNo")) {
				jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSiNo")) {
				jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSiNo")) {
				jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSiNo")) {
				jButtonCerrarReporteDinamicoSiNoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSiNo")) {
				jButtonGenerarReporteDinamicoSiNoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSiNo")) {
				
				jButtonGenerarExcelReporteDinamicoSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSiNo")) {
				jButtonCerrarImportacionSiNoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSiNo")) {
				
				jButtonGenerarImportacionSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSiNo")) {
				
				jButtonAbrirImportacionSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSiNo")) {
				jComboBoxTiposAccionesSiNoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSiNo")) {
				jComboBoxTiposRelacionesSiNoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSiNo")) {
				jComboBoxTiposAccionesSiNoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSiNo")) {
				
				jComboBoxTiposSeleccionarSiNoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSiNo")) {
				jTextFieldValorCampoGeneralSiNoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySiNo")) {
				jButtonAbrirOrderBySiNoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSiNo")) {
				jButtonAbrirOrderBySiNoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySiNo")) {
				jButtonCerrarOrderBySiNoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSiNoBusqueda")) {
				this.jButtonidSiNoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSiNoBusqueda")) {
				this.jButtonnombreSiNoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSiNo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			SiNo sinoLocal=null;
			
			if(!this.getEsControlTabla()) {
				sinoLocal=this.sino;
			} else {
				sinoLocal=this.sinoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
							
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
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
			
			


			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
								
						
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
								
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
							
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
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
			
			


			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
								
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSiNo")) {
					jCheckBoxSeleccionarTodosSiNoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSiNo")) {
					jCheckBoxSeleccionadosSiNoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSiNo")) {
					
				}
				
				


				
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
												
				
				


				
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
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
			
			


			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSiNoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sino);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sino);
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
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
				
				


				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(SiNo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",SiNo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSiNoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sinoAnterior =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sinoAnterior =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSiNo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSiNoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSiNo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sino =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sino =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sino);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSiNo")) {
				
				}
				
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSiNo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSiNo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSiNo")) {
			
			}
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSiNo();
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			if(sTipo.equals("NuevoSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSiNo")) {
				jButtonDuplicarSiNoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSiNo")) {
				jButtonCopiarSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSiNo")) {
				jButtonVerFormSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSiNo")) {
				jButtonNuevoSiNoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSiNo")) {
				jButtonModificarSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSiNo")) {
				jButtonActualizarSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSiNo")) {
				jButtonEliminarSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSiNo")) {
				jButtonCancelarSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSiNo")) {
				jButtonCerrarSiNoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSiNo")) {
				jButtonGuardarCambiosSiNoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSiNo")) {
				jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySiNo")) {
				jButtonAbrirOrderBySiNoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSiNo")) {
				jButtonRecargarInformacionSiNoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSiNo")) {
				jButtonAnterioresSiNoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSiNo")) {
				jButtonSiguientesSiNoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSiNoBusqueda")) {
				this.jButtonidSiNoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreSiNoBusqueda")) {
				this.jButtonnombreSiNoBusquedaActionPerformed(evt);
			}
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSiNo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSiNo")) {
				closingInternalFrameSiNo();
				
			} else if(sTipo.equals("jButtonCancelarSiNo")) {
				JInternalFrameBase jInternalFrameDetalleFormSiNo = (JInternalFrameBase)evt.getSource();
	            	
	            SiNoBeanSwingJInternalFrame jInternalFrameParent=(SiNoBeanSwingJInternalFrame)jInternalFrameDetalleFormSiNo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSiNoActionPerformed(null);
			}
			
			SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sino,new Object(),this.sinoParameterGeneral,this.sinoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSiNo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSiNo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSiNo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sino)) {
			if(!esControlTabla) {
				if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSiNo(this.sino,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);			
				}
				
				if(this.sinoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSiNo(this.sino,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sinoReturnGeneral=sinoLogic.procesarEventosSiNosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sinoLogic.getSiNos(),this.sino,this.sinoParameterGeneral,this.isEsNuevoSiNo,classes);//this.sinoLogic.getSiNo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSiNo(this.sinoReturnGeneral,this.sinoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.sinoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSiNo(classes,this.sinoReturnGeneral,this.sinoBean,false);
					}
						
					if(this.sinoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySiNo(this.sinoReturnGeneral.getSiNo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSiNo(this.sinoReturnGeneral.getSiNo());	
					}
						
					if(this.sinoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSiNo(this.sinoReturnGeneral.getSiNo(),classes);//this.sinoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSiNo(this.sino,classes);//this.sinoBean);									
				}
			
				if(SiNoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSiNo(this.sino,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSiNo(this.sino);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.sinoAnterior!=null) {
						this.sino=this.sinoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.sinoReturnGeneral=sinoLogic.procesarEventosSiNosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sinoLogic.getSiNos(),this.sino,this.sinoParameterGeneral,this.isEsNuevoSiNo,classes);//this.sinoLogic.getSiNo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.sinoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.sinoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.sinoReturnGeneral.getSiNo(),sinoLogic.getSiNos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.sinoReturnGeneral.getSiNo(),this.sinos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSiNo.repaint();
				
				//((AbstractTableModel) this.jTableDatosSiNo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSiNo();
			}
		}
	}
	
	public void actualizarVisualTableDatosSiNo() throws Exception {
		
		SiNoModel sinoModel=(SiNoModel)this.jTableDatosSiNo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sinoModel.sinos=this.sinoLogic.getSiNos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			sinoModel.sinos=this.sinos;
		}
		
		
		((SiNoModel) this.jTableDatosSiNo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSiNo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsinoAnterior(),this.sinoLogic.getSiNos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsinoAnterior(),this.sinos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSiNo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSiNo(SiNo sino,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
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
										
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sino,new Object(),generalEntityParameterGeneral,this.sinoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.sinoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SiNoConstantesFunciones.getClassesRelationshipsOfSiNo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SiNoConstantesFunciones.getClassesRelationshipsFromStringsOfSiNo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSiNo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SiNoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sino,new Object(),generalEntityParameterGeneral,this.sinoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSiNo(SiNoBean sinoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSiNo(ArrayList<Classe> classes,SiNoReturnGeneral sinoReturnGeneral,SiNoBean sinoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSiNo(SiNo sino,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.sino)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSiNo = new SiNoDetalleFormJInternalFrame(jDesktopPane,this.sinoSessionBean.getConGuardarRelaciones(),this.sinoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSiNo);
		this.jInternalFrameDetalleFormSiNo.setVisible(false);
		this.jInternalFrameDetalleFormSiNo.setSelected(false);						
		
		this.jInternalFrameDetalleFormSiNo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSiNo.sinoLogic=this.sinoLogic;
		
		this.cargarCombosFrameForeignKeySiNo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSiNo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSiNo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySiNo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySiNo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSiNo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSiNo"));
		
		this.jInternalFrameDetalleFormSiNo.jButtonModificarSiNo.addActionListener(new ButtonActionListener(this,"ModificarSiNo"));

		
		this.jInternalFrameDetalleFormSiNo.jButtonModificarToolBarSiNo.addActionListener(new ButtonActionListener(this,"ModificarToolBarSiNo"));
					
		this.jInternalFrameDetalleFormSiNo.jMenuItemModificarSiNo.addActionListener(new ButtonActionListener(this,"MenuItemModificarSiNo"));		
		
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonActualizarSiNo.addActionListener (new ButtonActionListener(this,"ActualizarSiNo"));
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonActualizarToolBarSiNo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSiNo"));
						
		this.jInternalFrameDetalleFormSiNo.jMenuItemActualizarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSiNo"));		
		
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonEliminarSiNo.addActionListener (new ButtonActionListener(this,"EliminarSiNo"));
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonEliminarToolBarSiNo.addActionListener (new ButtonActionListener(this,"EliminarToolBarSiNo"));
								
		this.jInternalFrameDetalleFormSiNo.jMenuItemEliminarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSiNo"));		
		
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonCancelarSiNo.addActionListener (new ButtonActionListener(this,"CancelarSiNo"));
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonCancelarToolBarSiNo.addActionListener (new ButtonActionListener(this,"CancelarToolBarSiNo"));
					
		this.jInternalFrameDetalleFormSiNo.jMenuItemCancelarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSiNo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSiNo.jMenuItemDetalleCerrarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSiNo"));		
		
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosToolBarSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSiNo"));
		
		
		
		this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosToolBarSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSiNo"));
		
		
		
		this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSiNo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSiNo.jButtonidSiNoBusqueda.addActionListener(new ButtonActionListener(this,"idSiNoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSiNo.jButtonnombreSiNoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSiNoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSiNo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSiNo"));
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSiNo"));
		}
		
		this.jTableDatosSiNo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSiNo"));
		
		this.jTableDatosSiNo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSiNo"));
		
		this.jButtonNuevoSiNo.addActionListener(new ButtonActionListener(this,"NuevoSiNo"));
		
		this.jButtonDuplicarSiNo.addActionListener(new ButtonActionListener(this,"DuplicarSiNo"));
		
		this.jButtonCopiarSiNo.addActionListener(new ButtonActionListener(this,"CopiarSiNo"));
		
		this.jButtonVerFormSiNo.addActionListener(new ButtonActionListener(this,"VerFormSiNo"));
		
		
		this.jButtonNuevoToolBarSiNo.addActionListener(new ButtonActionListener(this,"NuevoToolBarSiNo"));
			
		this.jButtonDuplicarToolBarSiNo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSiNo"));
			
		this.jMenuItemNuevoSiNo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSiNo"));
			
		this.jMenuItemDuplicarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSiNo"));		
		
		
		this.jButtonNuevoRelacionesSiNo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSiNo"));
		
		
		this.jButtonNuevoRelacionesToolBarSiNo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSiNo"));
			
		this.jMenuItemNuevoRelacionesSiNo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSiNo"));		
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonModificarSiNo.addActionListener(new ButtonActionListener(this,"ModificarSiNo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonModificarToolBarSiNo.addActionListener(new ButtonActionListener(this,"ModificarToolBarSiNo"));
			
			this.jInternalFrameDetalleFormSiNo.jMenuItemModificarSiNo.addActionListener(new ButtonActionListener(this,"MenuItemModificarSiNo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSiNo.jButtonActualizarSiNo.addActionListener (new ButtonActionListener(this,"ActualizarSiNo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonActualizarToolBarSiNo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSiNo"));
				
			this.jInternalFrameDetalleFormSiNo.jMenuItemActualizarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSiNo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonEliminarSiNo.addActionListener (new ButtonActionListener(this,"EliminarSiNo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonEliminarToolBarSiNo.addActionListener (new ButtonActionListener(this,"EliminarToolBarSiNo"));
						
			this.jInternalFrameDetalleFormSiNo.jMenuItemEliminarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSiNo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonCancelarSiNo.addActionListener (new ButtonActionListener(this,"CancelarSiNo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonCancelarToolBarSiNo.addActionListener (new ButtonActionListener(this,"CancelarToolBarSiNo"));
			
			this.jInternalFrameDetalleFormSiNo.jMenuItemCancelarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSiNo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSiNo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSiNo"));		
		
		
		this.jButtonCerrarSiNo.addActionListener (new ButtonActionListener(this,"CerrarSiNo"));
		
		
		this.jButtonCerrarToolBarSiNo.addActionListener (new ButtonActionListener(this,"CerrarToolBarSiNo"));
			
		this.jMenuItemCerrarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSiNo"));
			
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jMenuItemDetalleCerrarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSiNo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosSiNo"));
		}
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosToolBarSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSiNo"));
		}
		
		this.jButtonCopiarToolBarSiNo.addActionListener (new ButtonActionListener(this,"CopiarToolBarSiNo"));
			
		this.jButtonVerFormToolBarSiNo.addActionListener (new ButtonActionListener(this,"VerFormToolBarSiNo"));
		
		this.jMenuItemGuardarCambiosSiNo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSiNo"));
			
		this.jMenuItemCopiarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSiNo"));		
		
		this.jMenuItemVerFormSiNo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSiNo"));		
		
		
		this.jButtonGuardarCambiosTablaSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSiNo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSiNo"));
			
		this.jMenuItemGuardarCambiosTablaSiNo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSiNo"));		
		
		
		
		this.jButtonRecargarInformacionSiNo.addActionListener (new ButtonActionListener(this,"RecargarInformacionSiNo"));
					
		this.jButtonRecargarInformacionToolBarSiNo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSiNo"));
		
		this.jMenuItemRecargarInformacionSiNo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSiNo"));		
		
		
		
		this.jButtonAnterioresSiNo.addActionListener (new ButtonActionListener(this,"AnterioresSiNo"));
		
		
		this.jButtonAnterioresToolBarSiNo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSiNo"));
		
		this.jMenuItemAnterioresSiNo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSiNo"));		
		
		
		this.jButtonSiguientesSiNo.addActionListener (new ButtonActionListener(this,"SiguientesSiNo"));
		
		
		this.jButtonSiguientesToolBarSiNo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSiNo"));
			
		this.jMenuItemSiguientesSiNo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSiNo"));
			
		this.jMenuItemAbrirOrderBySiNo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySiNo"));
			
		this.jMenuItemMostrarOcultarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSiNo"));
			
		this.jMenuItemDetalleAbrirOrderBySiNo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySiNo"));
			
		this.jMenuItemDetalleMostarOcultarSiNo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSiNo"));		
		
		
		this.jButtonNuevoGuardarCambiosSiNo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSiNo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSiNo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSiNo"));
			
		this.jMenuItemNuevoGuardarCambiosSiNo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSiNo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSiNo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSiNo"));

		this.jCheckBoxSeleccionadosSiNo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSiNo"));
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSiNo"));
		}
		
		
		this.jComboBoxTiposRelacionesSiNo.addActionListener (new ButtonActionListener(this,"TiposRelacionesSiNo"));
			
		this.jComboBoxTiposAccionesSiNo.addActionListener (new ButtonActionListener(this,"TiposAccionesSiNo"));
					
		this.jComboBoxTiposSeleccionarSiNo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSiNo"));
			
		this.jTextFieldValorCampoGeneralSiNo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSiNo"));		
		
		
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSiNo.jButtonidSiNoBusqueda.addActionListener(new ButtonActionListener(this,"idSiNoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSiNo.jButtonnombreSiNoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSiNoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSiNo!=null) {
				this.jInternalFrameReporteDinamicoSiNo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSiNo"));
				this.jInternalFrameReporteDinamicoSiNo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSiNo"));
				this.jInternalFrameReporteDinamicoSiNo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSiNo"));
			}
			
			//this.jButtonCerrarReporteDinamicoSiNo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSiNo"));				
			//this.jButtonGenerarReporteDinamicoSiNo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSiNo"));
			//this.jButtonGenerarExcelReporteDinamicoSiNo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSiNo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSiNo!=null) {
				this.jInternalFrameImportacionSiNo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSiNo"));
				this.jInternalFrameImportacionSiNo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSiNo"));
				this.jInternalFrameImportacionSiNo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSiNo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySiNo.addActionListener (new ButtonActionListener(this,"AbrirOrderBySiNo"));
			
			this.jButtonAbrirOrderByToolBarSiNo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSiNo"));			
			
			if(this.jInternalFrameOrderBySiNo!=null) {
				this.jInternalFrameOrderBySiNo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySiNo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSiNo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSiNo.jTabbedPaneRelacionesSiNo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSiNo"));
		
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
            		closingInternalFrameSiNo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSiNo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSiNo = (JInternalFrameBase)event.getSource();
	            	
	            SiNoBeanSwingJInternalFrame jInternalFrameParent=(SiNoBeanSwingJInternalFrame)jInternalFrameDetalleFormSiNo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSiNoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSiNo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSiNoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSiNo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSiNo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSiNoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSiNoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSiNoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSiNo";
		inputMap = this.jButtonNuevoSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSiNoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSiNoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSiNoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSiNoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSiNo";
		inputMap = this.jButtonNuevoRelacionesSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSiNoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSiNo";
		inputMap = this.jButtonModificarSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSiNoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSiNo";
		inputMap = this.jButtonActualizarSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSiNoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSiNo";
		inputMap = this.jButtonEliminarSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSiNoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSiNo";
		inputMap = this.jButtonCancelarSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSiNoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSiNo";
		inputMap = this.jButtonCerrarSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSiNoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSiNo";
		inputMap = this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSiNo.jButtonGuardarCambiosSiNo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSiNoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSiNo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSiNoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSiNo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSiNoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSiNo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSiNoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSiNo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSiNoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSiNo.jButtonidSiNoBusqueda.addActionListener(new ButtonActionListener(this,"idSiNoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSiNo.jButtonnombreSiNoBusqueda.addActionListener(new ButtonActionListener(this,"nombreSiNoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSiNo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSiNoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSiNoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSiNo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSiNo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
					sinoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SiNo sinoAux:sinos) {
					sinoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSiNoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSiNo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
						sinoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SiNo sinoAux:sinos) {
						sinoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SiNo sinoAux:sinos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSiNo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSiNo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSiNo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSiNo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSiNoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSiNo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSiNo.getSelectedRows();
			
			SiNo sinoLocal=new SiNo();
			
			//this.seleccionarTodosSiNo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					sinoLocal =(SiNo) this.sinoLogic.getSiNos().toArray()[this.jTableDatosSiNo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					sinoLocal =(SiNo) this.sinos.toArray()[this.jTableDatosSiNo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				sinoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
						sinoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(SiNo sinoAux:sinos) {
						sinoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSiNo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSiNo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSiNo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSiNo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSiNoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSiNoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSiNoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSiNo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSiNo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(SiNo sinoAux:this.sinoLogic.getSiNos()) {
				
						if(sTipoSeleccionar.equals(SiNoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							sinoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SiNo sinoAux:sinos) {
					
						if(sTipoSeleccionar.equals(SiNoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							sinoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSiNo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSiNoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSiNo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSiNo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSiNo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSiNo) {				
					conSplash=true;//false;										
					
					//this.startProcessSiNo(conSplash);
				
					this.generarReporteSiNosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSiNosSeleccionados();
				//this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSiNosSeleccionados(false);
				//this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSiNosSeleccionados(true);
				//this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSiNo();
				
				this.exportarSiNosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSiNos();
				//this.importarSiNos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSiNo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSiNosSeleccionados();
				//this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Si/no", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSiNo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSiNo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySiNo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSiNo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSiNo.jComboBoxTiposAccionesFormularioSiNo.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSiNo();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSiNo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSiNoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSiNo();
			
			if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
			SiNo sino=new SiNo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSiNo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSiNo.getSelectedItem();
			
			
			
			
			sinosSeleccionados=this.getSiNosSeleccionados(true);
			//this.sTipoAccion;
			
			if(sinosSeleccionados.size()==1) {
				for(SiNo sinoAux:sinosSeleccionados) {
					sino=sinoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSiNo();
			
      		//this.finishProcessSiNo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSiNoReturnGeneral() throws Exception {
		if(this.sinoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.sinoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.sinoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.sinoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.sinoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.sinoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSiNo(false);
		}
		
		if(this.sinoReturnGeneral.getConRetornoLista() || this.sinoReturnGeneral.getConRetornoObjeto()) {
			if(this.sinoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sinoLogic.setSiNos(this.sinoReturnGeneral.getSiNos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.sinoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.sinoLogic.setSiNo(this.sinoReturnGeneral.getSiNo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSiNo(false);
		}
	}
	
	public void actualizarParametrosGeneralSiNo() throws Exception {
		
		
	}
	
	public ArrayList<SiNo> getSiNosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSiNo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(SiNo sinoAux:sinoLogic.getSiNos()) {
					if(sinoAux.getIsSelected()) {
						sinosSeleccionados.add(sinoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(SiNo sinoAux:this.sinos) {
					if(sinoAux.getIsSelected()) {
						sinosSeleccionados.add(sinoAux);				
					}
				}
			}
			
			if(sinosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						sinosSeleccionados.addAll(this.sinoLogic.getSiNos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						sinosSeleccionados.addAll(this.sinos);				
					}
				}
			}
		} else {
			sinosSeleccionados.add(this.sino);
		}
		
		return sinosSeleccionados;
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
	
	public void generarReporteSiNosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSiNosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSiNosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSiNosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSiNosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Si/no",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSiNosSeleccionados() throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSiNos("Todos",sinosSeleccionados);
		
	}	
	
	public void generarReporteNormalSiNosSeleccionados() throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSiNos("Todos",sinosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSiNosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSiNos("Todos",sinosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSiNosSeleccionados() throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSiNo();
		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSiNo();
		
		
		//this.generarReporteSiNos("Todos",sinosSeleccionados ,sinoImplementable,sinoImplementableHome);
	}
	
	public void mostrarImportacionSiNos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSiNo();
		
		this.abrirFrameImportacionSiNo();		
		
			
		//this.generarReporteSiNos("Todos",sinosSeleccionados ,sinoImplementable,sinoImplementableHome);
	}
	
	public void importarSiNos() throws Exception {		
	
	}
	
	public void exportarSiNosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSiNosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSiNosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSiNosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Si/no",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSiNosSeleccionados() throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSiNo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(SiNo sinoAux:sinosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSiNo(sinoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//sinoAux.setsDetalleGeneralEntityReporte(sinoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSiNo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SiNoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SiNoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SiNoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSiNo(SiNo sino,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sino.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sino.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sino.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSiNosSeleccionados() throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("SiNos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSiNo(row);				
				iRow++;
			}				
			
			for(SiNo sinoAux:sinosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSiNo(sinoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSiNosSeleccionados() throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();		
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sino.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sinos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sino");
			//elementRoot.appendChild(element);
		
			for(SiNo sinoAux:sinosSeleccionados) {
				element = document.createElement("sino");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSiNo(sinoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.sinoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Si/no",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSiNo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SiNoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SiNoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SiNoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSiNo(SiNo sino,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sino.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sino.getnombre());				
	}
	
	public void setFilaDatosExportarXmlSiNo(SiNo sino,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SiNoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sino.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SiNoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sino.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(SiNoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(sino.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoSiNosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<SiNo> sinosSeleccionados=new ArrayList<SiNo>();
		
		sinosSeleccionados=this.getSiNosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSiNo(sinosSeleccionados);
		
		this.generarReporteSiNos("Todos",sinosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSiNo(ArrayList<SiNo> sinosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(SiNo sinoAux:sinosSeleccionados) {
				sinoAux.setsDetalleGeneralEntityReporte(sinoAux.toString());
			
				if(sTipoSeleccionar.equals(SiNoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					sinoAux.setsDescripcionGeneralEntityReporte1(sinoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SiNoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSiNo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSiNo=true;
				this.isVisibilidadCeldaNuevoRelacionesSiNo=true;
				this.isVisibilidadCeldaGuardarCambiosSiNo=true;
			}
			
			this.isVisibilidadCeldaModificarSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=false;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=true;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
			this.isVisibilidadCeldaModificarSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=true;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=true;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
			this.isVisibilidadCeldaModificarSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=true;
			this.isVisibilidadCeldaEliminarSiNo=true;
			this.isVisibilidadCeldaCancelarSiNo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=true;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
			this.isVisibilidadCeldaModificarSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=true;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=false;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSiNo=true;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=true;
			this.isVisibilidadCeldaGuardarCambiosSiNo=true;
			this.isVisibilidadCeldaModificarSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=false;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=true;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
			this.isVisibilidadCeldaActualizarSiNo=false;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=false;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
			this.isVisibilidadCeldaModificarSiNo=true;
			this.isVisibilidadCeldaActualizarSiNo=false;
			this.isVisibilidadCeldaEliminarSiNo=false;
			this.isVisibilidadCeldaCancelarSiNo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSiNo=false;
				} else {
					this.isVisibilidadCeldaGuardarSiNo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SiNoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSiNo=true;
			this.isVisibilidadCeldaNuevoRelacionesSiNo=true;
			this.isVisibilidadCeldaGuardarCambiosSiNo=true;
		} else {
			this.actualizarEstadoPanelsSiNo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSiNo=false;
			//this.isVisibilidadCeldaVerFormSiNo=false;
			this.isVisibilidadCeldaDuplicarSiNo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!sinoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
		} else {
			this.isVisibilidadCeldaNuevoSiNo=false;
			this.isVisibilidadCeldaGuardarCambiosSiNo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(sinoSessionBean.getEsGuardarRelacionado()) {
			if(!sinoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSiNo=false;												
			}
			
			this.jButtonCerrarSiNo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSiNo=false;
		}
		
		if(!this.permiteMantenimiento(this.sino)) {
			this.isVisibilidadCeldaActualizarSiNo=false;
			this.isVisibilidadCeldaEliminarSiNo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSiNo() {
	}
	
	public void actualizarEstadoPanelsSiNo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(false);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSiNo!=null) {
				this.jScrollPanelDatosEdicionSiNo.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSiNo!=null) {
				this.jScrollPanelDatosSiNo.setVisible(true);
			}
			
			if(this.jPanelPaginacionSiNo!=null) {
				this.jPanelPaginacionSiNo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSiNo!=null) {
				this.jPanelParametrosReportesSiNo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.sinoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.sinoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SiNoSessionBean sinoSessionBean=new SiNoSessionBean();
		
		if(this.sinoSessionBean==null) {
			this.sinoSessionBean=new SiNoSessionBean();
		}
		
		this.sinoSessionBean.setsUltimaBusquedaSiNo(this.getsAccionBusqueda());
		this.sinoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.sinoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SiNoSessionBean sinoSessionBean=new SiNoSessionBean();
		
		if(this.sinoSessionBean==null) {
			this.sinoSessionBean=new SiNoSessionBean();
		}
		
		if(this.sinoSessionBean.getsUltimaBusquedaSiNo()!=null&&!this.sinoSessionBean.getsUltimaBusquedaSiNo().equals("")) {
			this.setsAccionBusqueda(sinoSessionBean.getsUltimaBusquedaSiNo());
			this.setiNumeroPaginacion(sinoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(sinoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.sinoSessionBean.setsUltimaBusquedaSiNo("");
		this.sinoSessionBean.setiNumeroPaginacion(SiNoConstantesFunciones.INUMEROPAGINACION);
		this.sinoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSiNo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSiNo() {
		this.updateBorderResaltarBusquedasFormularioSiNo();
		this.updateVisibilidadBusquedasFormularioSiNo();
		this.updateHabilitarBusquedasFormularioSiNo();
	}
	
	public void updateBorderResaltarBusquedasFormularioSiNo() {					
	}
	
	public void updateVisibilidadBusquedasFormularioSiNo() {
	}
	
	public void updateHabilitarBusquedasFormularioSiNo() {
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
	
	public void updateControlesFormularioSiNo() throws Exception {

		if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSiNo();
		this.updateVisibilidadResaltarControlesFormularioSiNo();
		this.updateHabilitarResaltarControlesFormularioSiNo();
		
	}
	
	public void updateBorderResaltarControlesFormularioSiNo() throws Exception {
		if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.sinoConstantesFunciones.resaltaridSiNo!=null && this.jInternalFrameDetalleFormSiNo!=null) {this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setBorder(this.sinoConstantesFunciones.resaltaridSiNo);}
		if(this.sinoConstantesFunciones.resaltarnombreSiNo!=null && this.jInternalFrameDetalleFormSiNo!=null) {this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setBorder(this.sinoConstantesFunciones.resaltarnombreSiNo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSiNo() throws Exception {		
		if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
	
		//this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setVisible(this.sinoConstantesFunciones.mostraridSiNo);
		this.jInternalFrameDetalleFormSiNo.jPanelidSiNo.setVisible(this.sinoConstantesFunciones.mostraridSiNo);
		//this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setVisible(this.sinoConstantesFunciones.mostrarnombreSiNo);
		this.jInternalFrameDetalleFormSiNo.jPanelnombreSiNo.setVisible(this.sinoConstantesFunciones.mostrarnombreSiNo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSiNo() throws Exception {
		if(this.jInternalFrameDetalleFormSiNo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSiNo!=null) {
	
		this.jInternalFrameDetalleFormSiNo.jTextFieldidSiNo.setEnabled(this.sinoConstantesFunciones.activaridSiNo);
		this.jInternalFrameDetalleFormSiNo.jTextFieldnombreSiNo.setEnabled(this.sinoConstantesFunciones.activarnombreSiNo);
		}
	}
	
		
}