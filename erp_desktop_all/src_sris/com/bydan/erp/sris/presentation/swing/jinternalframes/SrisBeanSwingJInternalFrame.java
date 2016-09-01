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
package com.bydan.erp.sris.presentation.swing.jinternalframes;




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

import com.bydan.erp.sris.util.SrisConstantesFunciones;
import com.bydan.erp.sris.util.SrisParameterReturnGeneral;
//import com.bydan.erp.sris.util.SrisParameterGeneral;
//import com.bydan.erp.sris.presentation.report.source.SrisBean;
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

import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.sris.resources.reportes.AuxiliarReportes;


import com.bydan.erp.sris.util.*;
import com.bydan.erp.sris.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.sris.business.entity.*;
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


import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;

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
public class SrisBeanSwingJInternalFrame extends SrisJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(SrisBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Sris> srisValidator = new ClassValidator<Sris>(Sris.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Sris sris;	
	public Sris srisAux;
	public Sris srisAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Sris srisTotales;
	public Long idSrisActual;
	public Long iIdNuevoSris=0L;
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
	
	public Boolean isPermisoTodoSris;
	public Boolean isPermisoNuevoSris;
	public Boolean isPermisoActualizarSris;
	public Boolean isPermisoActualizarOriginalSris;
	public Boolean isPermisoEliminarSris;
	public Boolean isPermisoGuardarCambiosSris;
	public Boolean isPermisoConsultaSris;
	public Boolean isPermisoBusquedaSris;
	public Boolean isPermisoReporteSris;
	public Boolean isPermisoPaginacionMedioSris;
	public Boolean isPermisoPaginacionAltoSris;
	public Boolean isPermisoPaginacionTodoSris;
	public Boolean isPermisoCopiarSris;
	public Boolean isPermisoVerFormSris;
	public Boolean isPermisoDuplicarSris;
	public Boolean isPermisoOrdenSris;
	
	
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
	
	public SrisParameterReturnGeneral srisReturnGeneral;
	public SrisParameterReturnGeneral srisParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoSris=false;
	public Boolean esParaAccionDesdeFormularioSris=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected SrisSessionBeanAdditional srisSessionBeanAdditional=null;
	
	public SrisSessionBeanAdditional getSrisSessionBeanAdditional() {
		return this.srisSessionBeanAdditional;
	}
	
	public void setSrisSessionBeanAdditional(SrisSessionBeanAdditional srisSessionBeanAdditional) {
		try {
			this.srisSessionBeanAdditional=srisSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected SrisBeanSwingJInternalFrameAdditional srisBeanSwingJInternalFrameAdditional=null;
	//public class SrisBeanSwingJInternalFrame
	
	public SrisBeanSwingJInternalFrameAdditional getSrisBeanSwingJInternalFrameAdditional() {
		return this.srisBeanSwingJInternalFrameAdditional;
	}
	
	public void setSrisBeanSwingJInternalFrameAdditional(SrisBeanSwingJInternalFrameAdditional srisBeanSwingJInternalFrameAdditional) {
		try {
			this.srisBeanSwingJInternalFrameAdditional=srisBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public SrisLogic srisLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Sris srisBean;
	public SrisConstantesFunciones srisConstantesFunciones;
	//public SrisParameterReturnGeneral srisReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Sris> sriss;	
	//public List<Sris> srissEliminados;
	//public List<Sris> srissAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoSris=false;
	public Boolean isVisibilidadCeldaDuplicarSris=true;
	public Boolean isVisibilidadCeldaCopiarSris=true;
	public Boolean isVisibilidadCeldaVerFormSris=true;
	public Boolean isVisibilidadCeldaOrdenSris=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesSris=false;
	public Boolean isVisibilidadCeldaModificarSris=false;
	public Boolean isVisibilidadCeldaActualizarSris=false;
	public Boolean isVisibilidadCeldaEliminarSris=false;
	public Boolean isVisibilidadCeldaCancelarSris=false;
	public Boolean isVisibilidadCeldaGuardarSris=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosSris=false;	
	
	
	
	public Long getiIdNuevoSris() {
		return this.iIdNuevoSris;
	}

	public void setiIdNuevoSris(Long iIdNuevoSris) {
		this.iIdNuevoSris = iIdNuevoSris;
	}
	
	public Long getidSrisActual() {
		return this.idSrisActual;
	}

	public void setidSrisActual(Long idSrisActual) {
		this.idSrisActual = idSrisActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Sris getsris() {
		return this.sris;
	}

	public void setsris(Sris sris) {
		this.sris = sris;
	}
	
	public Sris getsrisAux() {
		return this.srisAux;
	}

	public void setsrisAux(Sris srisAux) {
		this.srisAux = srisAux;
	}				
	
	public Sris getsrisAnterior() {
		return this.srisAnterior;
	}

	public void setsrisAnterior(Sris srisAnterior) {
		this.srisAnterior = srisAnterior;
	}	
	
	public Sris getsrisTotales() {
		return this.srisTotales;
	}

	public void setsrisTotales(Sris srisTotales) {
		this.srisTotales = srisTotales;
	}	
	
	public Sris getsrisBean() {
		return this.srisBean;
	}

	public void setsrisBean(Sris srisBean) {
		this.srisBean = srisBean;
	}	
	
	public SrisParameterReturnGeneral getsrisReturnGeneral() {
		return this.srisReturnGeneral;
	}

	public void setsrisReturnGeneral(SrisParameterReturnGeneral srisReturnGeneral) {
		this.srisReturnGeneral = srisReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public SrisLogic getSrisLogic()	{		
		return srisLogic;
	}

	public void setSrisLogic(SrisLogic srisLogic) {
		this.srisLogic = srisLogic;
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
	
	public Boolean getIsEsNuevoSris() {
		return isEsNuevoSris;
	}

	public void setIsEsNuevoSris(Boolean isEsNuevoSris) {
		this.isEsNuevoSris = isEsNuevoSris;
	}

	public Boolean getEsParaAccionDesdeFormularioSris() {
		return esParaAccionDesdeFormularioSris;
	}
	
	public void setEsParaAccionDesdeFormularioSris(Boolean esParaAccionDesdeFormularioSris) {
		this.esParaAccionDesdeFormularioSris = esParaAccionDesdeFormularioSris;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesSris() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			SrisConstantesFunciones.refrescarForeignKeysDescripcionesSris(this.srisLogic.getSriss());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			SrisConstantesFunciones.refrescarForeignKeysDescripcionesSris(this.sriss);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//srisLogic.setSriss(this.sriss);
			srisLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public SrisParameterReturnGeneral getSrisParameterGeneral() {
		return this.srisParameterGeneral;
	}
	
	public void setSrisParameterGeneral(SrisParameterReturnGeneral srisParameterGeneral) {
		this.srisParameterGeneral = srisParameterGeneral;
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
	
	public Boolean getIsPermisoTodoSris() {
		return isPermisoTodoSris;
	}

	public void setIsPermisoTodoSris(Boolean isPermisoTodoSris) {
		this.isPermisoTodoSris = isPermisoTodoSris;
	}

	public Boolean getIsPermisoNuevoSris() {
		return isPermisoNuevoSris;
	}

	public void setIsPermisoNuevoSris(Boolean isPermisoNuevoSris) {
		this.isPermisoNuevoSris = isPermisoNuevoSris;
	}

	public Boolean getIsPermisoActualizarSris() {
		return isPermisoActualizarSris;
	}

	public void setIsPermisoActualizarSris(Boolean isPermisoActualizarSris) {
		this.isPermisoActualizarSris = isPermisoActualizarSris;
	}

	public Boolean getIsPermisoEliminarSris() {
		return isPermisoEliminarSris;
	}

	public void setIsPermisoEliminarSris(Boolean isPermisoEliminarSris) {
		this.isPermisoEliminarSris = isPermisoEliminarSris;
	}

	public Boolean getIsPermisoGuardarCambiosSris() {
		return isPermisoGuardarCambiosSris;
	}

	public void setIsPermisoGuardarCambiosSris(Boolean isPermisoGuardarCambiosSris) {
		this.isPermisoGuardarCambiosSris = isPermisoGuardarCambiosSris;
	}
	
	public Boolean getIsPermisoConsultaSris() {
		return isPermisoConsultaSris;
	}

	public void setIsPermisoConsultaSris(Boolean isPermisoConsultaSris) {
		this.isPermisoConsultaSris = isPermisoConsultaSris;
	}

	public Boolean getIsPermisoBusquedaSris() {
		return isPermisoBusquedaSris;
	}

	public void setIsPermisoBusquedaSris(Boolean isPermisoBusquedaSris) {
		this.isPermisoBusquedaSris = isPermisoBusquedaSris;
	}

	public Boolean getIsPermisoReporteSris() {
		return isPermisoReporteSris;
	}

	public void setIsPermisoReporteSris(Boolean isPermisoReporteSris) {
		this.isPermisoReporteSris = isPermisoReporteSris;
	}
	
	public Boolean getIsPermisoPaginacionMedioSris() {
		return isPermisoPaginacionMedioSris;
	}

	public void setIsPermisoPaginacionMedioSris(Boolean isPermisoPaginacionMedioSris) {
		this.isPermisoPaginacionMedioSris = isPermisoPaginacionMedioSris;
	}
	
	public Boolean getIsPermisoPaginacionTodoSris() {
		return isPermisoPaginacionTodoSris;
	}

	public void setIsPermisoPaginacionTodoSris(Boolean isPermisoPaginacionTodoSris) {
		this.isPermisoPaginacionTodoSris = isPermisoPaginacionTodoSris;
	}
	
	public Boolean getIsPermisoPaginacionAltoSris() {
		return isPermisoPaginacionAltoSris;
	}

	public void setIsPermisoPaginacionAltoSris(Boolean isPermisoPaginacionAltoSris) {
		this.isPermisoPaginacionAltoSris = isPermisoPaginacionAltoSris;
	}
	
	public Boolean getIsPermisoCopiarSris() {
		return isPermisoCopiarSris;
	}

	public void setIsPermisoCopiarSris(Boolean isPermisoCopiarSris) {
		this.isPermisoCopiarSris = isPermisoCopiarSris;
	}
	
	public Boolean getIsPermisoVerFormSris() {
		return isPermisoVerFormSris;
	}

	public void setIsPermisoVerFormSris(Boolean isPermisoVerFormSris) {
		this.isPermisoVerFormSris = isPermisoVerFormSris;
	}
	
	public Boolean getIsPermisoDuplicarSris() {
		return isPermisoDuplicarSris;
	}

	public void setIsPermisoDuplicarSris(Boolean isPermisoDuplicarSris) {
		this.isPermisoDuplicarSris = isPermisoDuplicarSris;
	}
	
	public Boolean getIsPermisoOrdenSris() {
		return isPermisoOrdenSris;
	}

	public void setIsPermisoOrdenSris(Boolean isPermisoOrdenSris) {
		this.isPermisoOrdenSris = isPermisoOrdenSris;
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
	
	public Boolean getIsVisibilidadCeldaNuevoSris() {
		return isVisibilidadCeldaNuevoSris;
	}

	public void setIsVisibilidadCeldaNuevoSris(Boolean isVisibilidadCeldaNuevoSris) {
		this.isVisibilidadCeldaNuevoSris = isVisibilidadCeldaNuevoSris;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarSris() {
		return isVisibilidadCeldaDuplicarSris;
	}

	public void setIsVisibilidadCeldaDuplicarSris(Boolean isVisibilidadCeldaDuplicarSris) {
		this.isVisibilidadCeldaDuplicarSris = isVisibilidadCeldaDuplicarSris;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarSris() {
		return isVisibilidadCeldaCopiarSris;
	}

	public void setIsVisibilidadCeldaCopiarSris(Boolean isVisibilidadCeldaCopiarSris) {
		this.isVisibilidadCeldaCopiarSris = isVisibilidadCeldaCopiarSris;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormSris() {
		return isVisibilidadCeldaVerFormSris;
	}

	public void setIsVisibilidadCeldaVerFormSris(Boolean isVisibilidadCeldaVerFormSris) {
		this.isVisibilidadCeldaVerFormSris = isVisibilidadCeldaVerFormSris;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenSris() {
		return isVisibilidadCeldaOrdenSris;
	}

	public void setIsVisibilidadCeldaOrdenSris(Boolean isVisibilidadCeldaOrdenSris) {
		this.isVisibilidadCeldaOrdenSris = isVisibilidadCeldaOrdenSris;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesSris() {
		return isVisibilidadCeldaNuevoRelacionesSris;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesSris(Boolean isVisibilidadCeldaNuevoRelacionesSris) {
		this.isVisibilidadCeldaNuevoRelacionesSris = isVisibilidadCeldaNuevoRelacionesSris;
	}
	
	public Boolean getIsVisibilidadCeldaModificarSris() {
		return isVisibilidadCeldaModificarSris;
	}

	public void setIsVisibilidadCeldaModificarSris(Boolean isVisibilidadCeldaModificarSris) {
		this.isVisibilidadCeldaModificarSris = isVisibilidadCeldaModificarSris;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarSris() {
		return isVisibilidadCeldaActualizarSris;
	}

	public void setIsVisibilidadCeldaActualizarSris(Boolean isVisibilidadCeldaActualizarSris) {
		this.isVisibilidadCeldaActualizarSris = isVisibilidadCeldaActualizarSris;
	}

	public Boolean getIsVisibilidadCeldaEliminarSris() {
		return isVisibilidadCeldaEliminarSris;
	}

	public void setIsVisibilidadCeldaEliminarSris(Boolean isVisibilidadCeldaEliminarSris) {
		this.isVisibilidadCeldaEliminarSris = isVisibilidadCeldaEliminarSris;
	}

	public Boolean getIsVisibilidadCeldaCancelarSris() {
		return isVisibilidadCeldaCancelarSris;
	}

	public void setIsVisibilidadCeldaCancelarSris(Boolean isVisibilidadCeldaCancelarSris) {
		this.isVisibilidadCeldaCancelarSris = isVisibilidadCeldaCancelarSris;
	}

	public Boolean getIsVisibilidadCeldaGuardarSris() {
		return isVisibilidadCeldaGuardarSris;
	}

	public void setIsVisibilidadCeldaGuardarSris(Boolean isVisibilidadCeldaGuardarSris) {
		this.isVisibilidadCeldaGuardarSris = isVisibilidadCeldaGuardarSris;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosSris() {
		return isVisibilidadCeldaGuardarCambiosSris;
	}

	public void setIsVisibilidadCeldaGuardarCambiosSris(Boolean isVisibilidadCeldaGuardarCambiosSris) {
		this.isVisibilidadCeldaGuardarCambiosSris = isVisibilidadCeldaGuardarCambiosSris;
	}
		
	public SrisSessionBean getsrisSessionBean() {
		return this.srisSessionBean;
	}
	
	public void setsrisSessionBean(SrisSessionBean srisSessionBean) {
		this.srisSessionBean=srisSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysSris(Sris sris)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Sris sris,Sris srisAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalSris(sris);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		srisAux.setId(sris.getId());
		srisAux.setVersionRow(sris.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessSris();
		
			int intSelectedRow = this.jTableDatosSris.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualSris(this.sris,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = srisValidator.getInvalidValues(this.sris);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			srisLogic.setDatosCliente(datosCliente);
			srisLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				srisAux=new  Sris();
				
				srisAux.setIsNew(true);
				srisAux.setIsChanged(true);
				
				srisAux.setSrisOriginal(this.sris);
				
				srisAux.setId(this.sris.getId());	
				srisAux.setVersionRow(this.sris.getVersionRow());	
				srisAux.setcodigo(this.sris.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.srisSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.srisSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(srisAux,srisLogic.getSriss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(srisAux,sriss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.srisSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.srisSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srisLogic.saveSriss();//WithConnection
						//srisLogic.getSetVersionRowSriss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sris,srisAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.srisSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.srisSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								srisLogic.saveSrisRelaciones(srisAux);//WithConnection
								//srisLogic.getSetVersionRowSriss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sris,srisAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.srisSessionBean.getEstaModoGuardarRelaciones() 
									|| this.srisSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(srisAux,srisLogic.getSriss());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(srisAux,sriss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sris,srisAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				srisAux=new  Sris();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.srisSessionBean.getEsGuardarRelacionado() 
					|| (this.srisSessionBean.getEsGuardarRelacionado() && this.sris.getId()>=0)) {
						
					srisAux.setIsNew(false);
				}
				
				srisAux.setIsDeleted(false);
			
				srisAux.setId(this.sris.getId());	
				srisAux.setVersionRow(this.sris.getVersionRow());	
				srisAux.setcodigo(this.sris.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(srisAux,srisLogic.getSriss());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(srisAux,sriss);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.srisSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.srisSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srisLogic.saveSriss();//WithConnection
						//srisLogic.getSetVersionRowSriss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.sris,srisAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.srisSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.srisSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								srisLogic.saveSrisRelaciones(srisAux);//WithConnection
								//srisLogic.getSetVersionRowSriss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.sris,srisAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.srisSessionBean.getEstaModoGuardarRelaciones() 
									|| this.srisSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(srisAux,srisLogic.getSriss());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(srisAux,sriss);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.sris,srisAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				srisAux=new  Sris();
				
				srisAux.setIsNew(false);
				srisAux.setIsChanged(false);
				
				srisAux.setIsDeleted(true);
				
				srisAux.setId(this.sris.getId());	
				srisAux.setVersionRow(this.sris.getVersionRow());	
				srisAux.setcodigo(this.sris.getcodigo());	
				
				if(this.srisSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.srisAux.getId()>=0) {	
						this.srissEliminados.add(srisAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(srisAux,srisLogic.getSriss());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(srisAux,sriss);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.srisSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.srisSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srisLogic.saveSriss();//WithConnection
						//srisLogic.getSetVersionRowSriss();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.srisSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.srisSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								srisLogic.saveSrisRelaciones(srisAux);//WithConnection
								//srisLogic.getSetVersionRowSriss();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.srisSessionBean.getEstaModoGuardarRelaciones() 
								|| this.srisSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(srisAux,srisLogic.getSriss());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(srisAux,sriss);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.getSriss().addAll(this.srissEliminados);
					
					srisLogic.saveSriss();//WithConnection
					//srisLogic.getSetVersionRowSriss();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.srissEliminados= new ArrayList<Sris>();		
			}
			
			if(this.srisSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Sris GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.sris=srisAux;
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
      		//this.finishProcessSris();
      	}
		
	}	
	
	public void actualizarRelaciones(Sris srisLocal) throws Exception {
		
		if(this.srisSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Sris srisLocal) throws Exception {	
		if(this.srisSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarSrisActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosSris.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = srisValidator.getInvalidValues(this.sris);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Sris sris,List<Sris> sriss) throws Exception {
		try	{		
			SrisConstantesFunciones.actualizarLista(sris,sriss,this.srisSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Sris sris,List<Sris> sriss) throws Exception {
		try	{			
			SrisConstantesFunciones.actualizarSelectedLista(sris,sriss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Sris> srissLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				srissLocal=this.srisLogic.getSriss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				srissLocal=this.sriss;
			}
			//ARCHITECTURE
		
			for(Sris srisLocal:srissLocal) {
				if(this.permiteMantenimiento(srisLocal) && srisLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+SrisConstantesFunciones.getSrisLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(SrisConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSris.jLabelcodigoSris,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormSris!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormSris.jLabelcodigoSris,"");
		
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
		this.iIdNuevoSris--;	
		
		
		this.srisAux=new Sris();
		
		this.srisAux.setId(this.iIdNuevoSris);
		this.srisAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.srisLogic.getSriss().add(this.srisAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.sriss.add(this.srisAux);
		}
		//ARCHITECTURE
		
		this.sris=this.srisAux;
		
		if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioSris(this.sris);
			this.setVariablesObjetoActualToFormularioForeignKeySris(this.sris);
		}
				
		//this.setDefaultControlesSris();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeySris();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeySris();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeySris();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSris(this.srisBean,this.sris,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanSris(this.srisReturnGeneral,this.srisBean,false);
		
		if(this.srisReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeySris(this.srisReturnGeneral.getSris());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioSris(this.srisReturnGeneral.getSris());
		}
		
		if(this.srisReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioSris(this.srisReturnGeneral.getSris(),classes);//this.srisBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualSris(this.sris,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeySris();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeySris();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SrisBeanSwingJInternalFrameAdditional.RecargarFormSris(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingSris(false);
						
			if(srisSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSris();
			}
			
			this.actualizarVisualTableDatosSris();
			
			this.jTableDatosSris.setRowSelectionInterval(this.getIndiceNuevoSris(), this.getIndiceNuevoSris());
			
			this.seleccionarFilaTablaSrisActual();
						
			this.actualizarEstadoCeldasBotonesSris("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesSris(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setEnabled(isHabilitar && this.srisConstantesFunciones.activarcodigoSris);	
		
	};
	
	public void setDefaultControlesSris() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoSris(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.srisSessionBean.setConGuardarRelaciones(true);			
			this.srisSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.setVisible(true);
			
					
		} else {
			//this.srisSessionBean.setConGuardarRelaciones(false);			
			this.srisSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoSris() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sris srisAux:this.srisLogic.getSriss()) {
				if(srisAux.getId().equals(this.iIdNuevoSris)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sris srisAux:this.sriss) {
				if(srisAux.getId().equals(this.iIdNuevoSris)) {
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
	
	public int getIndiceActualSris(Sris sris,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sris srisAux:this.srisLogic.getSriss()) {
				if(srisAux.getId().equals(sris.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sris srisAux:this.sriss) {
				if(srisAux.getId().equals(sris.getId())) {
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
	
	public void setCamposBaseDesdeOriginalSris(Sris srisOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sris srisAux:this.srisLogic.getSriss()) {
				if(srisAux.getSrisOriginal().getId().equals(srisOriginal.getId())) {
					existe=true;
					srisOriginal.setId(srisAux.getId());
					srisOriginal.setVersionRow(srisAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sris srisAux:this.sriss) {
				if(srisAux.getSrisOriginal().getId().equals(srisOriginal.getId())) {
					existe=true;
					srisOriginal.setId(srisAux.getId());
					srisOriginal.setVersionRow(srisAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosSris(Boolean esParaCancelar) throws Exception {
		srissAux=new ArrayList<Sris>();
		srisAux=new Sris();
		
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sris srisAux:this.srisLogic.getSriss()) {
					if(srisAux.getId()<0) {
						srissAux.add(srisAux);
					}		
				}
				this.iIdNuevoSris=0L;
				this.srisLogic.getSriss().removeAll(srissAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sris srisAux:this.sriss) {
					if(srisAux.getId()<0) {
						srissAux.add(srisAux);
					}		
				}
				this.iIdNuevoSris=0L;
				this.sriss.removeAll(srissAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoSris 
					&& this.srisLogic.getSriss().size()>0
					) {
					srisAux=this.srisLogic.getSriss().get(this.srisLogic.getSriss().size() - 1);
				
					if(srisAux.getId()<0) {
						this.srisLogic.getSriss().remove(srisAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoSris && this.sriss.size()>0) {
					srisAux=this.sriss.get(this.sriss.size() - 1);
				
					if(srisAux.getId()<0) {
						this.sriss.remove(srisAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoSris(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(sris.getId()<0) {
				this.srisLogic.getSriss().remove(this.sris);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(sris.getId()<0) {
				this.sriss.remove(this.sris);
			}
		}			
	}
	
	public void setEstadosInicialesSris(List<Sris> srissAux) throws Exception {
		SrisConstantesFunciones.setEstadosInicialesSris(srissAux);
	}
	
	public void setEstadosInicialesSris(Sris srisAux) throws Exception {
		SrisConstantesFunciones.setEstadosInicialesSris(srisAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarSrisActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesSris("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarSrisActual()) {
				if(!this.isEsNuevoSris) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesSris("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoSris=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarSrisActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Sris ?", "MANTENIMIENTO DE Sris", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesSris("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Sris sris) throws Exception {
		SrisConstantesFunciones.seleccionarAsignar(this.sris,sris);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarSris=this.isPermisoActualizarOriginalSris;
			
			
			this.seleccionarAsignar(sris);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			SrisConstantesFunciones.quitarEspaciosSris(this.sris,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesSris("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.srisSessionBean.setsFuncionBusquedaRapida(this.srisSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoSris) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosSris(esParaCancelar);				
				this.cancelarNuevoSris(esParaCancelar);								
			}
			
			this.sris=new Sris();
			
			this.inicializarSris();
			
			this.actualizarEstadoCeldasBotonesSris("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarSris() throws Exception {
		try {
			SrisConstantesFunciones.inicializarSris(this.sris);
			
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
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.srisLogic.getSriss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteSriss(String sAccionBusqueda,List<Sris> srissParaReportes) throws Exception {
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
					sPathReporteFinal="Sris"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="SrisMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("SrisMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Sris"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Sriss");		
		parameters.put("busquedapor", SrisConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceSris=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			SrisConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			SrisConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceSris=new JRBeanArrayDataSource(SrisJInternalFrame.TraerSrisBeans(srissParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceSris);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+SrisConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+SrisConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(SrisBean.TraerSrisBeans(srissParaReportes).toArray()));
							
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
				this.generarExcelReporteSriss(sAccionBusqueda,sTipoArchivoReporte,srissParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalSriss(sAccionBusqueda,sTipoArchivoReporte,srissParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoSrisActionPerformed(null);
					//this.generarExcelReporteSriss(sAccionBusqueda,sTipoArchivoReporte,srissParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalSriss(sAccionBusqueda,sTipoArchivoReporte,srissParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesSriss(sAccionBusqueda,sTipoArchivoReporte,srissParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesSriss(sAccionBusqueda,sTipoArchivoReporte,srissParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteSriss(String sAccionBusqueda,String sTipoArchivoReporte,List<Sris> srissParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sriss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSris("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Sris sris : srissParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			SrisConstantesFunciones.generarExcelReporteDataSris("NORMAL",row,workbook,sris,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderSris(String sTipo,Row row,Workbook workbook) {
		
		SrisConstantesFunciones.generarExcelReporteHeaderSris(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalSriss(String sAccionBusqueda,String sTipoArchivoReporte,List<Sris> srissParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sriss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Sris sris : srissParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(SrisConstantesFunciones.getSrisDescripcion(sris));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(SrisConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(SrisConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(sris.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesSriss(String sAccionBusqueda,String sTipoArchivoReporte,List<Sris> srissParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Sris> srissRespaldo=null;
		
		classes=SrisConstantesFunciones.getClassesRelationshipsOfSris(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.srisLogic.setDatosCliente(this.datosCliente);
		this.srisLogic.setDatosDeep(this.datosDeep);
		this.srisLogic.setIsConDeep(true);
		
		srissRespaldo=this.srisLogic.getSriss();
		
		this.srisLogic.setSriss(srissParaReportes);	
		this.srisLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		srissParaReportes=this.srisLogic.getSriss();
		this.srisLogic.setSriss(srissRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Sriss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderSris("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Sris sris : srissParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderSris("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			SrisConstantesFunciones.generarExcelReporteDataSris("NORMAL",row,workbook,sris,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(SrisConstantesFunciones.getSrisDescripcion(sris));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoSris.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSris.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessSris() throws Exception {		
		this.startProcessSris(true);
	}
	
	public void startProcessSris(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesSris, this.jScrollPanelDatosSris,this.jPanelPaginacionSris, this.jScrollPanelDatosEdicionSris, this.jPanelAccionesSris,this.jPanelAccionesFormularioSris,this.jmenuBarSris,this.jmenuBarDetalleSris,this.jTtoolBarSris,this.jTtoolBarDetalleSris);		
		
		final JTabbedPane jTabbedPaneBusquedasSris=null; 
		
		final JPanel jPanelParametrosReportesSris=this.jPanelParametrosReportesSris;
		//final JScrollPane jScrollPanelDatosSris=this.jScrollPanelDatosSris;
		final JTable jTableDatosSris=this.jTableDatosSris;		
		final JPanel jPanelPaginacionSris=this.jPanelPaginacionSris;
		//final JScrollPane jScrollPanelDatosEdicionSris=this.jScrollPanelDatosEdicionSris;
		final JPanel jPanelAccionesSris=this.jPanelAccionesSris;
		
		JPanel jPanelCamposAuxiliarSris=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarSris=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormSris!=null) {
			jPanelCamposAuxiliarSris=this.jInternalFrameDetalleFormSris.jPanelCamposSris;
			jPanelAccionesFormularioAuxiliarSris=this.jInternalFrameDetalleFormSris.jPanelAccionesFormularioSris;
		}
		
		final JPanel jPanelCamposSris=jPanelCamposAuxiliarSris;
		final JPanel jPanelAccionesFormularioSris=jPanelAccionesFormularioAuxiliarSris;
		
		
		final JMenuBar jmenuBarSris=this.jmenuBarSris;
		final JToolBar jTtoolBarSris=this.jTtoolBarSris;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarSris=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSris=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormSris!=null) {
			jmenuBarDetalleAuxiliarSris=this.jInternalFrameDetalleFormSris.jmenuBarDetalleSris;
			jTtoolBarDetalleAuxiliarSris=this.jInternalFrameDetalleFormSris.jTtoolBarDetalleSris;
		}
		
		final JMenuBar jmenuBarDetalleSris=jmenuBarDetalleAuxiliarSris;
		final JToolBar jTtoolBarDetalleSris=jTtoolBarDetalleAuxiliarSris;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSris;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSris;
			processRunnable.jTableDatos=jTableDatosSris;
			processRunnable.jPanelCampos=jPanelCamposSris;
			processRunnable.jPanelPaginacion=jPanelPaginacionSris;
			processRunnable.jPanelAcciones=jPanelAccionesSris;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSris;
			
			
			processRunnable.jmenuBar=jmenuBarSris;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSris;
			processRunnable.jTtoolBar=jTtoolBarSris;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSris;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasSris ,jPanelParametrosReportesSris,jTableDatosSris, /*jScrollPanelDatosSris,*/jPanelCamposSris,jPanelPaginacionSris, /*jScrollPanelDatosEdicionSris,*/ jPanelAccionesSris,jPanelAccionesFormularioSris,jmenuBarSris,jmenuBarDetalleSris,jTtoolBarSris,jTtoolBarDetalleSris);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesSris, jScrollPanelDatosSris,jPanelPaginacionSris, jScrollPanelDatosEdicionSris, jPanelAccionesSris,jPanelAccionesFormularioSris,jmenuBarSris,jmenuBarDetalleSris,jTtoolBarSris,jTtoolBarDetalleSris);
						
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
	
	public void finishProcessSris() {// throws Exception 
		this.finishProcessSris(true);
	}
	
	public void finishProcessSris(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesSris, this.jScrollPanelDatosSris,this.jPanelPaginacionSris, this.jScrollPanelDatosEdicionSris, this.jPanelAccionesSris,this.jPanelAccionesFormularioSris,this.jmenuBarSris,this.jmenuBarDetalleSris,this.jTtoolBarSris,this.jTtoolBarDetalleSris);		
		
		final JTabbedPane jTabbedPaneBusquedasSris=null; 
		
		final JPanel jPanelParametrosReportesSris=this.jPanelParametrosReportesSris;
		//final JScrollPane jScrollPanelDatosSris=this.jScrollPanelDatosSris;
		final JTable jTableDatosSris=this.jTableDatosSris;		
		final JPanel jPanelPaginacionSris=this.jPanelPaginacionSris;
		//final JScrollPane jScrollPanelDatosEdicionSris=this.jScrollPanelDatosEdicionSris;
		final JPanel jPanelAccionesSris=this.jPanelAccionesSris;
		
		JPanel jPanelCamposAuxiliarSris=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarSris=new JPanel();
		
		if(this.jInternalFrameDetalleFormSris!=null) {
			jPanelCamposAuxiliarSris=this.jInternalFrameDetalleFormSris.jPanelCamposSris;
			jPanelAccionesFormularioAuxiliarSris=this.jInternalFrameDetalleFormSris.jPanelAccionesFormularioSris;
		}
		
		final JPanel jPanelCamposSris=jPanelCamposAuxiliarSris;
		final JPanel jPanelAccionesFormularioSris=jPanelAccionesFormularioAuxiliarSris;
		
		
		final JMenuBar jmenuBarSris=this.jmenuBarSris;		
		final JToolBar jTtoolBarSris=this.jTtoolBarSris;
				
		JMenuBar jmenuBarDetalleAuxiliarSris=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarSris=new JToolBar();
		
		if(this.jInternalFrameDetalleFormSris!=null) {
			jmenuBarDetalleAuxiliarSris=this.jInternalFrameDetalleFormSris.jmenuBarDetalleSris;
			jTtoolBarDetalleAuxiliarSris=this.jInternalFrameDetalleFormSris.jTtoolBarDetalleSris;		
		}
		
		final JMenuBar jmenuBarDetalleSris=jmenuBarDetalleAuxiliarSris;
		final JToolBar jTtoolBarDetalleSris=jTtoolBarDetalleAuxiliarSris;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasSris;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesSris;
			processRunnable.jTableDatos=jTableDatosSris;
			processRunnable.jPanelCampos=jPanelCamposSris;
			processRunnable.jPanelPaginacion=jPanelPaginacionSris;
			processRunnable.jPanelAcciones=jPanelAccionesSris;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioSris;
			
			
			processRunnable.jmenuBar=jmenuBarSris;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleSris;
			processRunnable.jTtoolBar=jTtoolBarSris;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleSris;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasSris ,jPanelParametrosReportesSris, jTableDatosSris,/*jScrollPanelDatosSris,*/jPanelCamposSris,jPanelPaginacionSris, /*jScrollPanelDatosEdicionSris,*/ jPanelAccionesSris,jPanelAccionesFormularioSris,jmenuBarSris,jmenuBarDetalleSris,jTtoolBarSris,jTtoolBarDetalleSris));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesSris(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarSris(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuSris(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarSris(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarSris,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleSris,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuSris(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarSris,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleSris,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.srisConstantesFunciones.getsFinalQuerySris();
		String  finalQueryPaginacionTodos=this.srisConstantesFunciones.getsFinalQuerySris();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=SrisConstantesFunciones.getArrayColumnasGlobalesNoSris(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=SrisConstantesFunciones.getArrayColumnasGlobalesSris(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,SrisConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.srissEliminados= new ArrayList<Sris>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessSris();
		
				///*SrisSessionBean*/this.srisSessionBean=new SrisSessionBean();
			
			if(this.srisSessionBean==null) {
				this.srisSessionBean=new SrisSessionBean();
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
					this.iNumeroPaginacion=SrisConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=SrisConstantesFunciones.getClassesForeignKeysOfSris(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/sris."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			srissAux= new ArrayList<Sris>();
			
				
			srisLogic.setDatosCliente(this.datosCliente);
			srisLogic.setDatosDeep(this.datosDeep);
			srisLogic.setIsConDeep(true);
			
			
			srisLogic.getSrisDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					srisLogic.getTodosSriss(finalQueryGlobal,pagination);
					
					//srisLogic.getTodosSrissWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(srisLogic.getSriss()==null|| srisLogic.getSriss().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							srissAux= new ArrayList<Sris>();
							srissAux.addAll(srisLogic.getSriss());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							srissAux= new ArrayList<Sris>();
							srissAux.addAll(sriss);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							srisLogic.getTodosSriss(finalQueryGlobal+"",this.pagination);												
							
							//srisLogic.getTodosSrissWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteSriss("Todos",srisLogic.getSriss() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							srisLogic.setSriss(new ArrayList<Sris>());					
							srisLogic.getSriss().addAll(srissAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							sriss=new ArrayList<Sris>();
							sriss.addAll(srissAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idSris=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idSris=this.idActual;
				
				} else if(this.idSrisActual!=null && this.idSrisActual!=0L) {
					idSris=idSrisActual;
				}
				
					
				this.sDetalleReporte=SrisConstantesFunciones.getDetalleIndicePorId(idSris);
				
				this.sriss=new ArrayList<Sris>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					srisLogic.getEntity(idSris);
					
					//srisLogic.getEntityWithConnection(idSris);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					srisLogic.setSriss(new ArrayList<Sris>());
					srisLogic.getSriss().add(srisLogic.getSris());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sriss=new ArrayList<Sris>();
					this.sriss.add(sris);
				}
				
				if(srisLogic.getSris()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesSris();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessSris();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=srisLogic.getSriss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sriss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=srisLogic.getSriss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=sriss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Sris sris) {
		Boolean permite=true;
		
		if(this.sris.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=SrisConstantesFunciones.getOrderByListaSris();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=SrisConstantesFunciones.getOrderByListaSris();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sris sris:srisLogic.getSriss()) {
				if(sris.getsType().equals(Constantes2.S_TOTALES)) {
					srisTotales=sris;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sris sris:this.sriss) {
				if(sris.getsType().equals(Constantes2.S_TOTALES)) {
					srisTotales=sris;
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
			this.srisAux=new Sris();
			this.srisAux.setsType(Constantes2.S_TOTALES);
			this.srisAux.setIsNew(false);
			this.srisAux.setIsChanged(false);
			this.srisAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				SrisConstantesFunciones.TotalizarValoresFilaSris(this.srisLogic.getSriss(),this.srisAux);
				
				this.srisLogic.getSriss().add(this.srisAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				SrisConstantesFunciones.TotalizarValoresFilaSris(this.sriss,this.srisAux);
				
				this.sriss.add(this.srisAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		srisTotales=new Sris();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.srisLogic.getSriss().remove(srisTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.sriss.remove(srisTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		srisTotales=new Sris();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Sris sris:srisLogic.getSriss()) {
				if(sris.getsType().equals(Constantes2.S_TOTALES)) {
					srisTotales=sris;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SrisConstantesFunciones.TotalizarValoresFilaSris(this.srisLogic.getSriss(),srisTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Sris sris:this.sriss) {
				if(sris.getsType().equals(Constantes2.S_TOTALES)) {
					srisTotales=sris;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				SrisConstantesFunciones.TotalizarValoresFilaSris(this.sriss,srisTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosSris() {
		this.isPermisoTodoSris=false;
		this.isPermisoNuevoSris=false;
		this.isPermisoActualizarSris=false;
		this.isPermisoActualizarOriginalSris=false;
		this.isPermisoEliminarSris=false;
		this.isPermisoGuardarCambiosSris=false;
		this.isPermisoConsultaSris=false;
		this.isPermisoBusquedaSris=false;
		this.isPermisoReporteSris=false;		
		this.isPermisoOrdenSris=false;		
		this.isPermisoPaginacionMedioSris=false;		
		this.isPermisoPaginacionAltoSris=false;
		this.isPermisoPaginacionTodoSris=false;
		this.isPermisoCopiarSris=false;		
		this.isPermisoVerFormSris=false;		
		this.isPermisoDuplicarSris=false;		
		this.isPermisoOrdenSris=false;		
	}
	
	public void setPermisosUsuarioSris(Boolean isPermiso) {
		this.isPermisoTodoSris=isPermiso;
		this.isPermisoNuevoSris=isPermiso;
		this.isPermisoActualizarSris=isPermiso;
		this.isPermisoActualizarOriginalSris=isPermiso;
		this.isPermisoEliminarSris=isPermiso;
		this.isPermisoGuardarCambiosSris=isPermiso;
		this.isPermisoConsultaSris=isPermiso;
		this.isPermisoBusquedaSris=isPermiso;
		this.isPermisoReporteSris=isPermiso;
		this.isPermisoOrdenSris=isPermiso;		
		this.isPermisoPaginacionMedioSris=isPermiso;		
		this.isPermisoPaginacionAltoSris=isPermiso;		
		this.isPermisoPaginacionTodoSris=isPermiso;		
		this.isPermisoCopiarSris=isPermiso;		
		this.isPermisoVerFormSris=isPermiso;		
		this.isPermisoDuplicarSris=isPermiso;
		this.isPermisoOrdenSris=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioSris(Boolean isPermiso) {
		//this.isPermisoTodoSris=isPermiso;
		this.isPermisoNuevoSris=isPermiso;
		this.isPermisoActualizarSris=isPermiso;
		this.isPermisoActualizarOriginalSris=isPermiso;
		this.isPermisoEliminarSris=isPermiso;
		this.isPermisoGuardarCambiosSris=isPermiso;
		//this.isPermisoConsultaSris=isPermiso;
		//this.isPermisoBusquedaSris=isPermiso;
		//this.isPermisoReporteSris=isPermiso;
		//this.isPermisoOrdenSris=isPermiso;		
		//this.isPermisoPaginacionMedioSris=isPermiso;		
		//this.isPermisoPaginacionAltoSris=isPermiso;		
		//this.isPermisoPaginacionTodoSris=isPermiso;		
		//this.isPermisoCopiarSris=isPermiso;		
		//this.isPermisoDuplicarSris=isPermiso;
		//this.isPermisoOrdenSris=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioSrisClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(SrisJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebSris(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioSrisClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioSrisClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionSrisClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioSrisClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioSris() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(SrisJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.srisSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, SrisConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoSris=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarSris=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalSris=this.isPermisoActualizarSris;
			this.isPermisoEliminarSris=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosSris=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaSris=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaSris=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoSris=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteSris=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSris=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioSris=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoSris=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoSris=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarSris=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormSris=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarSris=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenSris=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.srisSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosSris.setToolTipText(this.jTableDatosSris.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioSris(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioSris(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(SrisJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(SrisJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioSris() throws Exception {
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
	
		
	public void inicializarCombosForeignKeySrisListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeySrisListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(SrisJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeySrisListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeySrisListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeySris()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeySris()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeySris(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeySris()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeySris();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeySris(Sris sris)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeySris(Sris sris,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeySris()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeySris()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeySris()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeySris()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroSris()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeySris()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeySris(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeySris()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public SrisBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public SrisBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public SrisBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.srisSessionBean=new SrisSessionBean(); 
		this.srisConstantesFunciones=new SrisConstantesFunciones(); 
		this.srisBean=new Sris();//(this.srisConstantesFunciones); 		
		this.srisReturnGeneral=new SrisParameterReturnGeneral(); 
		
		this.srisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.srisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public SrisBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public SrisBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public SrisBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessSris(true);
			
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
			
			this.srisConstantesFunciones=new SrisConstantesFunciones(); 
			this.srisBean=new Sris();//this.srisConstantesFunciones); 			
			this.srisReturnGeneral=new SrisParameterReturnGeneral(); 
		
			SrisBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Sris Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.sris=new Sris();
			this.sriss = new ArrayList<Sris>();
			this.srissAux = new ArrayList<Sris>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic=new SrisLogic();
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			//this.srisSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.srisSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormSris);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoSris!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSris);	
					}
					
					if(this.jInternalFrameImportacionSris!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSris);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderBySris!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderBySris);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormSris!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormSris);
				this.jInternalFrameDetalleFormSris.setVisible(false);
				this.jInternalFrameDetalleFormSris.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoSris!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSris);
					this.jInternalFrameReporteDinamicoSris.setVisible(false);
					this.jInternalFrameReporteDinamicoSris.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionSris!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionSris);
					this.jInternalFrameImportacionSris.setVisible(false);
					this.jInternalFrameImportacionSris.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderBySris!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderBySris);
					this.jInternalFrameOrderBySris.setVisible(false);
					this.jInternalFrameOrderBySris.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idSrisActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=SrisConstantesFunciones.INUMEROPAGINACION;
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
			
			this.srisReturnGeneral=new SrisParameterReturnGeneral();
			
			this.srisParameterGeneral=new SrisParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.srisLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.srisSessionBean.getEsGuardarRelacionado()) {
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
			
			if(SrisJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.srisSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SrisConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.srisSessionBean.getEsGuardarRelacionado(),this.srisSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,SrisConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.srisSessionBean.getEsGuardarRelacionado(),this.srisSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaDuplicarSris=true;
			this.isVisibilidadCeldaCopiarSris=true;
			this.isVisibilidadCeldaVerFormSris=true;
			this.isVisibilidadCeldaOrdenSris=true;
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
			this.isVisibilidadCeldaModificarSris=false;
			this.isVisibilidadCeldaActualizarSris=false;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=false;
			this.isVisibilidadCeldaGuardarSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesSris("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosSris();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioSris(false);
			
			this.setPermisosUsuarioSris();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.srisSessionBean.getEsGuardarRelacionado() 
				|| (this.srisSessionBean.getEsGuardarRelacionado() && this.srisSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioSrisClasesRelacionadas();
			}
			
			if(this.srisSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioSrisClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!SrisJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosSris();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualSris();
			}
			
			if(!this.isPermisoBusquedaSris) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.srisSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioSris,this.isPermisoPaginacionMedioSris,this.isPermisoPaginacionTodoSris);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(SrisConstantesFunciones.getTiposSeleccionarSris());
				
				this.tiposColumnasSelect=SrisConstantesFunciones.getTiposSeleccionarSris(true);
				
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
			//if(!this.srisSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioSris();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioSris(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioSris(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesSris() ;
			
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
				srisImplementable= (SrisImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SrisConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				srisImplementableHome= (SrisImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+SrisConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.sriss= new ArrayList<Sris>();
			this.srissEliminados= new ArrayList<Sris>();
						
			this.isEsNuevoSris=false;
			this.esParaAccionDesdeFormularioSris=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeySris(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroSris();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.srisSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			SrisBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=SrisConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesSris("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingSris(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormSris!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioSris();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioSris();
			}
			
			SrisBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessSris(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Sris: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectSris() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesSris")) {
				iIndex=this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosSris.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessSris();	
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
	
	public void cargarCombosForeignKeySris(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeySris(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeySris(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeySrisListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeySris();
		
		this.cargarCombosFrameForeignKeySris();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeySris();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeySris();
		}
	}
	
	
	
	public void jButtonNuevoSrisActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.srisSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			
			if(jTableDatosSris.getRowCount()>=1) {
				jTableDatosSris.removeRowSelectionInterval(0, jTableDatosSris.getRowCount()-1);						
			}
			
			this.isEsNuevoSris=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoSris(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesSris(true);			
			//this.sris=new Sris();
			//this.sris.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSris(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSris() ;
			
			if(SrisJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSris(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.sris);	
			this.actualizarInformacion("INFO_PADRE",false,this.sris);				
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			if(this.srisSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Sris: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarSrisActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosSris.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosSris.getSelectedRows().length;			
			}
			
			srissSeleccionados=this.getSrissSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoSris--;			
				//Sris srisAux= new Sris();			
				//srisAux.setId(this.iIdNuevoSris);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Sris srisOrigen=new Sris();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Sris srisOrigen : srissSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosSris.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							srisOrigen =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							srisOrigen =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaSris();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.sris.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosSris(srisOrigen,this.sris,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.srisLogic.getSriss().add(this.srisAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sriss.add(this.srisAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaSris(false);
				
				this.jTableDatosSris.setRowSelectionInterval(this.getIndiceNuevoSris(), this.getIndiceNuevoSris());
				
				int iLastRow =  this.jTableDatosSris.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSris.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSris.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSris(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();									
		
			Sris srisOrigen=new Sris();
			Sris srisDestino=new Sris();
				
			srissSeleccionados=this.getSrissSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosSris.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || srissSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosSris.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srisOrigen =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						srisOrigen =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						srisDestino =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						srisDestino =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				srisOrigen =srissSeleccionados.get(0);
				srisDestino =srissSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosSris(srisOrigen,srisDestino,true,false);
				
				srisDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(srisDestino,srisLogic.getSriss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(srisDestino,sriss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaSris(false);
				
				//this.jTableDatosSris.setRowSelectionInterval(this.getIndiceNuevoSris(), this.getIndiceNuevoSris());
				
				int iLastRow =  this.jTableDatosSris.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosSris.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosSris.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaSris(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormSris.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesSris.isVisible();
			
			
			this.jPanelParametrosReportesSris.setVisible(!isVisible);
			this.jPanelPaginacionSris.setVisible(!isVisible);
			this.jPanelAccionesSris.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameSris();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoSris();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionSris();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderBySrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderBySris();
			
			this.abrirFrameOrderBySris();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderBySrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderBySris();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleSris(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormSris);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormSris.isMaximum()) {
					this.jInternalFrameDetalleFormSris.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormSris.setSize(this.jInternalFrameDetalleFormSris.iWidthFormulario,this.jInternalFrameDetalleFormSris.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormSris.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormSris.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormSris.isMaximum()) {
						this.jInternalFrameDetalleFormSris.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormSris.jContentPaneDetalleSris.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormSris.jContentPaneDetalleSris.getWidth(),SrisConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormSris.jContentPaneDetalleSris.getWidth(),SrisConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormSris.jContentPaneDetalleSris.getWidth(),SrisConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormSris.setVisible(true);
	        this.jInternalFrameDetalleFormSris.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderBySris() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderBySris==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderBySris=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySris,false,this);
				} else {
					this.jInternalFrameOrderBySris=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderBySris,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderBySris);
				this.jInternalFrameOrderBySris.setVisible(false);
				this.jInternalFrameOrderBySris.setSelected(false);
				
				this.jInternalFrameOrderBySris.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySris"));
				
				this.inicializarActualizarBindingTablaOrderBySris();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionSris() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionSris==null) {
				
				this.jInternalFrameImportacionSris=new ImportacionJInternalFrame(SrisConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionSris);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionSris);
				this.jInternalFrameImportacionSris.setVisible(false);
				this.jInternalFrameImportacionSris.setSelected(false);


				this.jInternalFrameImportacionSris.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSris"));
				this.jInternalFrameImportacionSris.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSris"));
				this.jInternalFrameImportacionSris.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSris"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoSris() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoSris==null) {
				this.jInternalFrameReporteDinamicoSris=new ReporteDinamicoJInternalFrame(SrisConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoSris);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoSris);
				this.jInternalFrameReporteDinamicoSris.setVisible(false);
				this.jInternalFrameReporteDinamicoSris.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoSris.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSris"));
				this.jInternalFrameReporteDinamicoSris.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSris"));
				this.jInternalFrameReporteDinamicoSris.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSris"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSris();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleSris() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormSris);
			
	       	this.jInternalFrameDetalleFormSris.setVisible(false);
	        this.jInternalFrameDetalleFormSris.setSelected(false);
			
			//this.jInternalFrameDetalleFormSris.dispose();
			//this.jInternalFrameDetalleFormSris=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoSris() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoSris.setVisible(true);
	        this.jInternalFrameReporteDinamicoSris.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionSris() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionSris.setVisible(true);
	        this.jInternalFrameImportacionSris.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderBySris() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderBySris.setVisible(true);
	        this.jInternalFrameOrderBySris.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderBySris() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderBySris.setVisible(false);
	        this.jInternalFrameOrderBySris.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoSris() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoSris.setVisible(false);
	        this.jInternalFrameReporteDinamicoSris.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionSris() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionSris.setVisible(false);
	        this.jInternalFrameImportacionSris.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarSrisActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarSris(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarSris(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSris.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesSris(true);
			//this.isEsNuevoSris=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesSris("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSris(false) ;
			
			if(srisSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(SrisJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSris(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSris(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaSrisActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarSris(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosSris.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesSris(true);
			//this.isEsNuevoSris=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.sris.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesSris("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesSris(false) ;
			
			if(SrisJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleSris(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSris(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarSrisActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesSris(false);
			
			//if(!this.isEsNuevoSris) {								
				int intSelectedRow = this.jTableDatosSris.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualSris(this.sris,true);
				this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
				
			}
			
			if(this.permiteMantenimiento(this.sris)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.srisSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoSris=true;
					this.inicializarActualizarBindingTablaSris(false);
					this.isEsNuevoSris=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoSris=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoSris=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSris(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSris(false);
				
				this.habilitarDeshabilitarControlesSris(false);
			
												
				
				if(SrisJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleSris();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoSrisActionPerformed(evt,srisSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualSris(this.sris,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosSris.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,srisSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.sris.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarSrisActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosSris.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				this.sris.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				this.sris.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.sris)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.srisSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((SrisModel) this.jTableDatosSris.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoSris=true;
				this.inicializarActualizarBindingTablaSris(false);
				this.isEsNuevoSris=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesSris(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSris(false);
				
				this.habilitarDeshabilitarControlesSris(false);
				
				
				
				if(SrisJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleSris();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarSrisActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosSris.getRowCount()>=1) {
				jTableDatosSris.removeRowSelectionInterval(0, jTableDatosSris.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesSris(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaSris(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesSris(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualSris(false) ;
			
			this.isEsNuevoSris=false;
			
			if(SrisJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleSris();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosSrisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingSris(false);
				
				//SI ES MANUAL
				if(SrisJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualSris();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosSrisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoSris--;			
			//Sris srisAux= new Sris();			
			//srisAux.setId(this.iIdNuevoSris);
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaSris();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
			
			this.sris.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.srisLogic.getSriss().add(this.srisAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.sriss.add(this.srisAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaSris(false);
			
			this.jTableDatosSris.setRowSelectionInterval(this.getIndiceNuevoSris(), this.getIndiceNuevoSris());
			
			int iLastRow =  this.jTableDatosSris.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosSris.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosSris.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaSris(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionSrisActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingSris(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSris(false);
			
			//SI ES MANUAL
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSris();
			}
			
			//this.abrirFrameTreeSris();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionSrisActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE SrisS ?", "MANTENIMIENTO DE Sris", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionSris.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralSris();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.srisReturnGeneral=srisLogic.procesarImportacionSrissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.srisParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarSrisReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionSrisActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionSris.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionSris.setFileImportacion(this.jInternalFrameImportacionSris.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionSris.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionSris.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionSris.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionSris.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoSrisActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		

		srissSeleccionados=this.getSrissSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("SrisBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"SrisBaseDesign.jrxml";
			
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
			
			this.generarReporteSriss("Todos",srissSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SrisConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoSris.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case SrisConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case SrisConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoSris.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoSris.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case SrisConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
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
	
	public void jButtonGenerarExcelReporteDinamicoSrisActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Sriss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case SrisConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(SrisConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Sris sris:srissSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(sris.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelSris(row);				
			//	iRow++;
			//}				
			
			//for(Sris srisAux:srissSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelSris(srisAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
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
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSris(false);
			
			//SI ES MANUAL
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualSris();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresSrisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSris(false);
			
			//SI ES MANUAL
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSris();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesSrisActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingSris(false);
			
			//SI ES MANUAL
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualSris();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.srisLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaSris() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosSris.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosSris.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosSris.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosSris.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosSris.setMinimumSize(dimensionMinimum);
		this.jTableDatosSris.setMaximumSize(dimensionMaximum);
		this.jTableDatosSris.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingSris(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingSris(esInicializar,true);
	}
	
	public void inicializarActualizarBindingSris(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaSris(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesSris(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasSris(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSris(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesSris(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !SrisJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!SrisJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualSris() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaSris();
		
		this.inicializarActualizarBindingBotonesManualSris(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.srisSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualSris();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesSris() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualSris(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualSris(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosSris.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosSris.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteSris.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormSris!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormSris.jCheckBoxPostAccionNuevoSris.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormSris.jCheckBoxPostAccionSinCerrarSris.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormSris.jCheckBoxPostAccionSinMensajeSris.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosSris.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosSris.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteSris.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormSris!=null) {
				this.jInternalFrameDetalleFormSris.jCheckBoxPostAccionNuevoSris.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormSris.jCheckBoxPostAccionSinCerrarSris.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormSris.jCheckBoxPostAccionSinMensajeSris.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionSris.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionSris.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesSris.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoSris!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesSris.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesSris.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarSris.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesSris.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoSris!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesSris.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralSris.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesSris(Boolean esInicializar) throws Exception {
		try	{	
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualSris(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesSris() throws Exception {
		try	{
			if(SrisJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualSris();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSris() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualSris() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesSris.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesSris.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesSris.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesSris.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesSris.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesSris.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionSris.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionSris.addItem(reporte);
			}
			
			
			if(!this.srisSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionSris.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionSris.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesSris.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesSris.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesSris.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesSris.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarSris.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarSris.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarSris.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSris();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualSris() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSris!=null) {
				this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoSris!=null) {
				this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoSris.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoSris!=null) {
				
				if(this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSris.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoSris.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoSris.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoSris.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualSris()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasSris(Boolean esInicializar) throws Exception {				
		if(SrisJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualSris();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaSris() throws Exception {
		this.inicializarActualizarBindingTablaSris(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderBySris() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderBySris.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderBySris.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySris.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new SrisPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderBySris.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySris.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new SrisPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosSrisOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSrisOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new SrisPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderBySris.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderBySris.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new SrisPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderBySris.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaSris(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=srisLogic.getSriss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=sriss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosSris.setModel(new SrisModel(this.srisLogic.getSriss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosSris.setModel(new SrisModel(this.sriss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderBySris!=null && this.jInternalFrameOrderBySris.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderBySris();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosSris.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSris,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new SrisPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+SrisConstantesFunciones.SCLASSWEBTITULO,srisConstantesFunciones.resaltarSeleccionarSris,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+SrisConstantesFunciones.SCLASSWEBTITULO,srisConstantesFunciones.resaltarSeleccionarSris,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosSris.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSris,SrisConstantesFunciones.LABEL_ID));

		if(this.srisConstantesFunciones.mostraridSris && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SrisConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.srisConstantesFunciones.resaltaridSris,this.srisConstantesFunciones.activaridSris,this,true,"idSris","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srisConstantesFunciones.resaltaridSris,this.srisConstantesFunciones.activaridSris,this,true,"idSris","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosSris.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSris,SrisConstantesFunciones.LABEL_CODIGO));

		if(this.srisConstantesFunciones.mostrarcodigoSris && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,SrisConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.srisConstantesFunciones.resaltarcodigoSris,this.srisConstantesFunciones.activarcodigoSris,this,true,"codigoSris","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.srisConstantesFunciones.resaltarcodigoSris,this.srisConstantesFunciones.activarcodigoSris,this,true,"codigoSris","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new SrisPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.srisSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.srisSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.srisSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSris.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.srisSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.srisSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosSris.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarSris && this.isPermisoGuardarCambiosSris) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.srisSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.srisSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosSris.addColumn(tableColumn);
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
			
			this.jTableDatosSris.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSris && this.isPermisoGuardarCambiosSris) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarSris && this.isPermisoGuardarCambiosSris) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosSris.moveColumn(this.jTableDatosSris.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosSris.moveColumn(this.jTableDatosSris.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosSris.moveColumn(this.jTableDatosSris.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosSris.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosSris.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosSris,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosSris.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosSris.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosSris.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosSris.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosSris.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=srisLogic.getSriss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=sriss.size()-1;
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
		//this.jTableDatosSris.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosSris.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosSris();
			
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
				
				//this.isEsNuevoSris=false;
					
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
				if(this.srisSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormSris==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSris.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSris.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.sris.getsType().equals("DUPLICADO")
				   || this.sris.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoSris=true;
				
				} else {
					this.isEsNuevoSris=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.srisSessionBean.getEsGuardarRelacionado()) {
					if(this.sris.getId()>=0 && !this.sris.getIsNew()) {						
						this.isEsNuevoSris=false;
						
					} else {
						this.isEsNuevoSris=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoSris(esRelaciones);						
				
				this.seleccionarSris(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.sris.getId()<0) {
					this.isEsNuevoSris=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarSris(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarSris(evt,rowIndex);
				}	
				
				if(this.srisSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Sris: " + this.dDif); 
					}
				}								
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarSris(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.sris)) {
					if(this.sris.getId()>0) {
						this.sris.setIsDeleted(true);
						
						this.srissEliminados.add(this.sris);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.srisLogic.getSriss().remove(this.sris);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.sriss.remove(this.sris);				
					}
					
					
					((SrisModel) this.jTableDatosSris.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaSris(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarSris(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoSris) {
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosSris.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosSris.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioSris(this.sris);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesSris("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesSris(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualSris() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoSris(Sris sris) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoSris(sris,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoSris(Sris sris,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioSris(sris);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeySris(sris,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeySris(sris);
	}
	
	public void setVariablesObjetoActualToFormularioSris(Sris sris) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormSris.jLabelidSris.setText(sris.getId().toString());
			this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setText(sris.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Sris srisLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,srisLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Sris srisLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				srisLocal=this.sris;
			} else {
				srisLocal=this.srisAnterior;
			}
		}
		
		if(this.permiteMantenimiento(srisLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoSris(srisLocal,true);
					
					if(srisSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(srisLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.srisSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(srisLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoSris(Sris sris,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSris(sris,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysSris(sris);
	}
	
	public void setVariablesFormularioToObjetoActualSris(Sris sris,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualSris(sris,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualSris(Sris sris,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormSris.jLabelidSris.getText()==null || this.jInternalFrameDetalleFormSris.jLabelidSris.getText()=="" || this.jInternalFrameDetalleFormSris.jLabelidSris.getText()=="Id") {
				this.jInternalFrameDetalleFormSris.jLabelidSris.setText("0");
			}

			if(conColumnasBase) {sris.setId(Long.parseLong(this.jInternalFrameDetalleFormSris.jLabelidSris.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SrisConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSris.jLabelIdSris,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			sris.setcodigo(this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+SrisConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormSris.jLabelcodigoSris,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualSris(Sris srisBean,Sris sris,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosSris(Sris srisOrigen,Sris sris,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && srisOrigen.getId()!=null && !srisOrigen.getId().equals(0L))) {sris.setId(srisOrigen.getId());}}
			if(conDefault || (!conDefault && srisOrigen.getcodigo()!=null && !srisOrigen.getcodigo().equals(""))) {sris.setcodigo(srisOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSris(Sris sris) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSris.jLabelidSris.setText(sris.getId().toString());
			this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setText(sris.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioSris(SrisBean srisBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormSris.jLabelidSris.setText(srisBean.getId().toString());
			this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setText(srisBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanSris(SrisParameterReturnGeneral srisReturnGeneral,SrisBean srisBean,Boolean conDefault) throws Exception { 
		try {
			Sris srisLocal=new Sris();
			
			srisLocal=srisReturnGeneral.getSris();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && srisLocal.getId()!=null && !srisLocal.getId().equals(0L))) {srisBean.setId(srisLocal.getId());}}
			if(conDefault || (!conDefault && srisLocal.getcodigo()!=null && !srisLocal.getcodigo().equals(""))) {srisBean.setcodigo(srisLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxSrisGenerico(Long idSrisSeleccionado,JComboBox jComboBoxSris,List<Sris> srissLocal)throws Exception {
		try {
			Sris  srisTemp=null;

			for(Sris srisAux:srissLocal) {
				if(srisAux.getId()!=null && srisAux.getId().equals(idSrisSeleccionado)) {
					srisTemp=srisAux;
					break;
				}
			}

			jComboBoxSris.setSelectedItem(srisTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxSrisGenerico(JComboBox jComboBoxSris,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxSris.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSris.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxSris.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxSris.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSris.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxSris.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxSris.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxSris.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxSris.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxSris.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			sris=(Sris) srisLogic.getSriss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			sris =(Sris) sriss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Sris srisRow=new Sris();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			srisRow=(Sris) srisLogic.getSriss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			srisRow=(Sris) sriss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualSris(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoSris.setVisible((this.isVisibilidadCeldaNuevoSris && this.isPermisoNuevoSris));			
			this.jButtonDuplicarSris.setVisible((this.isVisibilidadCeldaDuplicarSris && this.isPermisoDuplicarSris));			
			this.jButtonCopiarSris.setVisible((this.isVisibilidadCeldaCopiarSris && this.isPermisoCopiarSris));
			this.jButtonVerFormSris.setVisible((this.isVisibilidadCeldaVerFormSris && this.isPermisoVerFormSris));
			
			this.jButtonAbrirOrderBySris.setVisible((this.isVisibilidadCeldaOrdenSris && this.isPermisoOrdenSris));			
			
			this.jButtonNuevoRelacionesSris.setVisible((this.isVisibilidadCeldaNuevoRelacionesSris && this.isPermisoNuevoSris));			
			this.jButtonNuevoGuardarCambiosSris.setVisible((this.isVisibilidadCeldaNuevoSris && this.isPermisoNuevoSris && this.isPermisoGuardarCambiosSris));
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.jInternalFrameDetalleFormSris.jButtonModificarSris.setVisible((this.isVisibilidadCeldaModificarSris && this.isPermisoActualizarSris));	
			this.jInternalFrameDetalleFormSris.jButtonActualizarSris.setVisible((this.isVisibilidadCeldaActualizarSris && this.isPermisoActualizarSris));	
			this.jInternalFrameDetalleFormSris.jButtonEliminarSris.setVisible((this.isVisibilidadCeldaEliminarSris && this.isPermisoEliminarSris));
			this.jInternalFrameDetalleFormSris.jButtonCancelarSris.setVisible(this.isVisibilidadCeldaCancelarSris);							
			this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.setVisible((this.isVisibilidadCeldaGuardarSris && this.isPermisoGuardarCambiosSris));			
			
			}
						
			this.jButtonGuardarCambiosTablaSris.setVisible((this.isVisibilidadCeldaGuardarCambiosSris && this.isPermisoGuardarCambiosSris));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarSris.setVisible((this.isVisibilidadCeldaNuevoSris && this.isPermisoNuevoSris));						
			this.jButtonDuplicarToolBarSris.setVisible((this.isVisibilidadCeldaDuplicarSris && this.isPermisoDuplicarSris));						
			this.jButtonCopiarToolBarSris.setVisible((this.isVisibilidadCeldaCopiarSris && this.isPermisoCopiarSris));			
			this.jButtonVerFormToolBarSris.setVisible((this.isVisibilidadCeldaVerFormSris && this.isPermisoVerFormSris));			
			this.jButtonAbrirOrderByToolBarSris.setVisible((this.isVisibilidadCeldaOrdenSris && this.isPermisoOrdenSris));
			this.jButtonNuevoRelacionesToolBarSris.setVisible((this.isVisibilidadCeldaNuevoRelacionesSris && this.isPermisoNuevoSris));			
			this.jButtonNuevoGuardarCambiosToolBarSris.setVisible((this.isVisibilidadCeldaNuevoSris && this.isPermisoNuevoSris && this.isPermisoGuardarCambiosSris));			
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.jInternalFrameDetalleFormSris.jButtonModificarToolBarSris.setVisible((this.isVisibilidadCeldaModificarSris && this.isPermisoActualizarSris));	
			this.jInternalFrameDetalleFormSris.jButtonActualizarToolBarSris.setVisible((this.isVisibilidadCeldaActualizarSris  && this.isPermisoActualizarSris));	
			this.jInternalFrameDetalleFormSris.jButtonEliminarToolBarSris.setVisible((this.isVisibilidadCeldaEliminarSris && this.isPermisoEliminarSris));
			this.jInternalFrameDetalleFormSris.jButtonCancelarToolBarSris.setVisible(this.isVisibilidadCeldaCancelarSris);				
			this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosToolBarSris.setVisible((this.isVisibilidadCeldaGuardarSris && this.isPermisoGuardarCambiosSris));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarSris.setVisible((this.isVisibilidadCeldaGuardarCambiosSris && this.isPermisoGuardarCambiosSris));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoSris.setVisible((this.isVisibilidadCeldaNuevoSris && this.isPermisoNuevoSris));			
			this.jMenuItemDuplicarSris.setVisible((this.isVisibilidadCeldaDuplicarSris && this.isPermisoDuplicarSris));			
			this.jMenuItemCopiarSris.setVisible((this.isVisibilidadCeldaCopiarSris && this.isPermisoCopiarSris));			
			this.jMenuItemVerFormSris.setVisible((this.isVisibilidadCeldaVerFormSris && this.isPermisoVerFormSris));			
			this.jMenuItemAbrirOrderBySris.setVisible((this.isVisibilidadCeldaOrdenSris && this.isPermisoOrdenSris));			
			//this.jMenuItemMostrarOcultarSris.setVisible((this.isVisibilidadCeldaOrdenSris && this.isPermisoOrdenSris));
			this.jMenuItemDetalleAbrirOrderBySris.setVisible((this.isVisibilidadCeldaOrdenSris && this.isPermisoOrdenSris));			
			//this.jMenuItemDetalleMostrarOcultarSris.setVisible((this.isVisibilidadCeldaOrdenSris && this.isPermisoOrdenSris));			
			this.jMenuItemNuevoRelacionesSris.setVisible((this.isVisibilidadCeldaNuevoRelacionesSris && this.isPermisoNuevoSris));			
			this.jMenuItemNuevoGuardarCambiosSris.setVisible((this.isVisibilidadCeldaNuevoSris && this.isPermisoNuevoSris && this.isPermisoGuardarCambiosSris));									
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.jInternalFrameDetalleFormSris.jMenuItemModificarSris.setVisible((this.isVisibilidadCeldaModificarSris && this.isPermisoActualizarSris));	
			this.jInternalFrameDetalleFormSris.jMenuItemActualizarSris.setVisible((this.isVisibilidadCeldaActualizarSris && this.isPermisoActualizarSris));	
			this.jInternalFrameDetalleFormSris.jMenuItemEliminarSris.setVisible((this.isVisibilidadCeldaEliminarSris && this.isPermisoEliminarSris));
			this.jInternalFrameDetalleFormSris.jMenuItemCancelarSris.setVisible(this.isVisibilidadCeldaCancelarSris);				
			}
			
			this.jMenuItemGuardarCambiosSris.setVisible((this.isVisibilidadCeldaGuardarSris && this.isPermisoGuardarCambiosSris));						
			this.jMenuItemGuardarCambiosTablaSris.setVisible((this.isVisibilidadCeldaGuardarCambiosSris && this.isPermisoGuardarCambiosSris));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoSris=this.jButtonNuevoSris.isVisible();
			this.isVisibilidadCeldaDuplicarSris=this.jButtonDuplicarSris.isVisible();
			this.isVisibilidadCeldaCopiarSris=this.jButtonCopiarSris.isVisible();
			this.isVisibilidadCeldaVerFormSris=this.jButtonVerFormSris.isVisible();
			
			this.isVisibilidadCeldaOrdenSris=this.jButtonAbrirOrderBySris.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesSris=this.jButtonNuevoRelacionesSris.isVisible();
			this.isVisibilidadCeldaModificarSris=this.jButtonModificarSris.isVisible();
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.isVisibilidadCeldaActualizarSris=this.jInternalFrameDetalleFormSris.jButtonActualizarSris.isVisible();
			this.isVisibilidadCeldaEliminarSris=this.jInternalFrameDetalleFormSris.jButtonEliminarSris.isVisible();
			this.isVisibilidadCeldaCancelarSris=this.jInternalFrameDetalleFormSris.jButtonCancelarSris.isVisible();
			this.isVisibilidadCeldaGuardarSris=this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosSris=this.jButtonGuardarCambiosTablaSris.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoSris=this.jButtonNuevoToolBarSris.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSris=this.jButtonNuevoRelacionesToolBarSris.isVisible();
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.isVisibilidadCeldaModificarSris=this.jInternalFrameDetalleFormSris.jButtonModificarToolBarSris.isVisible();
			this.isVisibilidadCeldaActualizarSris=this.jInternalFrameDetalleFormSris.jButtonActualizarToolBarSris.isVisible();
			this.isVisibilidadCeldaEliminarSris=this.jInternalFrameDetalleFormSris.jButtonEliminarToolBarSris.isVisible();
			this.isVisibilidadCeldaCancelarSris=this.jInternalFrameDetalleFormSris.jButtonCancelarToolBarSris.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSris=this.jButtonGuardarCambiosToolBarSris.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSris=this.jButtonGuardarCambiosTablaToolBarSris.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoSris=this.jMenuItemNuevoSris.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesSris=this.jMenuItemNuevoRelacionesSris.isVisible();
			
			if(this.jInternalFrameDetalleFormSris!=null) {
			this.isVisibilidadCeldaModificarSris=this.jInternalFrameDetalleFormSris.jMenuItemModificarSris.isVisible();
			this.isVisibilidadCeldaActualizarSris=this.jInternalFrameDetalleFormSris.jMenuItemActualizarSris.isVisible();
			this.isVisibilidadCeldaEliminarSris=this.jInternalFrameDetalleFormSris.jMenuItemEliminarSris.isVisible();
			this.isVisibilidadCeldaCancelarSris=this.jInternalFrameDetalleFormSris.jMenuItemCancelarSris.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarSris=this.jMenuItemGuardarCambiosSris.isVisible();
			this.isVisibilidadCeldaGuardarCambiosSris=this.jMenuItemGuardarCambiosTablaSris.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesSris(Boolean esInicializar) {
		if(SrisJInternalFrame.ISBINDING_MANUAL) {			
			if(this.srisSessionBean.getConGuardarRelaciones()) {
				//if(this.srisSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesSris();
			}
			
			this.inicializarActualizarBindingBotonesManualSris(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualSris() {
		this.jButtonNuevoSris.setVisible(this.isPermisoNuevoSris);			
		this.jButtonDuplicarSris.setVisible(this.isPermisoDuplicarSris);			
		this.jButtonCopiarSris.setVisible(this.isPermisoCopiarSris);			
		this.jButtonVerFormSris.setVisible(this.isPermisoVerFormSris);			
		
		this.jButtonAbrirOrderBySris.setVisible(this.isPermisoOrdenSris);					
		
		this.jButtonNuevoRelacionesSris.setVisible(this.isPermisoNuevoSris);			
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonModificarSris.setVisible(this.isPermisoActualizarSris);	
			this.jInternalFrameDetalleFormSris.jButtonActualizarSris.setVisible(this.isPermisoActualizarSris);	
			this.jInternalFrameDetalleFormSris.jButtonEliminarSris.setVisible(this.isPermisoEliminarSris);
			this.jInternalFrameDetalleFormSris.jButtonCancelarSris.setVisible(this.isVisibilidadCeldaCancelarSris);						
			this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.setVisible(this.isPermisoGuardarCambiosSris);							
		}
		
		this.jButtonGuardarCambiosTablaSris.setVisible(this.isPermisoActualizarSris);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleSris() {
		this.jInternalFrameDetalleFormSris.jButtonModificarSris.setVisible(this.isPermisoActualizarSris);	
		this.jInternalFrameDetalleFormSris.jButtonActualizarSris.setVisible(this.isPermisoActualizarSris);	
		this.jInternalFrameDetalleFormSris.jButtonEliminarSris.setVisible(this.isPermisoEliminarSris);
		this.jInternalFrameDetalleFormSris.jButtonCancelarSris.setVisible(this.isVisibilidadCeldaCancelarSris);							
		this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.setVisible((this.isVisibilidadCeldaGuardarSris && this.isPermisoGuardarCambiosSris));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosSris() {
		if(SrisJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualSris();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesSris() {
	}
	
	public void jTableDatosSrisListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarSris(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidSrisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSris.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSris(this.getsris(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sris==null) {
						this.sris = new Sris();
					}

					this.setVariablesFormularioToObjetoActualSris(this.sris,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
				}

				if(this.sris.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.sris.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSris(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoSrisBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosSris.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualSris(this.getsris(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.sris==null) {
						this.sris = new Sris();
					}

					this.setVariablesFormularioToObjetoActualSris(this.sris,true);
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);
				}

				if(this.sris.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.sris.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingSris(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameSris() {
		if(this.jInternalFrameDetalleFormSris!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormSris!=null) {
			this.jInternalFrameDetalleFormSris.setVisible(false);	    			
			this.jInternalFrameDetalleFormSris.dispose();
			this.jInternalFrameDetalleFormSris=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoSris!=null) {
			this.jInternalFrameReporteDinamicoSris.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoSris.dispose();
			this.jInternalFrameReporteDinamicoSris=null;
		}
		
		if(this.jInternalFrameImportacionSris!=null) {
			this.jInternalFrameImportacionSris.setVisible(false);	    			
			this.jInternalFrameImportacionSris.dispose();
			this.jInternalFrameImportacionSris=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessSris();
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			
			if(sTipo.equals("NuevoSris")) {
				jButtonNuevoSrisActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarSris")) {
				jButtonDuplicarSrisActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarSris")) {
				jButtonCopiarSrisActionPerformed(evt);
			} else if(sTipo.equals("VerFormSris")) {
				jButtonVerFormSrisActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarSris")) {
				jButtonNuevoSrisActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarSris")) {
				jButtonDuplicarSrisActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoSris")) {
				jButtonNuevoSrisActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarSris")) {
				jButtonDuplicarSrisActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesSris")) {
				jButtonNuevoSrisActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarSris")) {
				jButtonNuevoSrisActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesSris")) {
				jButtonNuevoSrisActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarSris")) {
				jButtonModificarSrisActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarSris")) {
				jButtonModificarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarSris")) {
				jButtonModificarSrisActionPerformed(evt);
			} else if(sTipo.equals("ActualizarSris")) {
				jButtonActualizarSrisActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarSris")) {
				jButtonActualizarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarSris")) {
				jButtonActualizarSrisActionPerformed(evt);
			} else if(sTipo.equals("EliminarSris")) {
				jButtonEliminarSrisActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarSris")) {
				jButtonEliminarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarSris")) {
				jButtonEliminarSrisActionPerformed(evt);
			} else if(sTipo.equals("CancelarSris")) {
				jButtonCancelarSrisActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarSris")) {
				jButtonCancelarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarSris")) {
				jButtonCancelarSrisActionPerformed(evt);
			} else if(sTipo.equals("CerrarSris")) {
				jButtonCerrarSrisActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarSris")) {
				jButtonCerrarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarSris")) {
				jButtonCerrarSrisActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarSris")) {
				jButtonMostrarOcultarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarSris")) {
				jButtonCancelarSrisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarSris")) {
				jButtonCopiarSrisActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarSris")) {
				jButtonVerFormSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarSris")) {
				jButtonCopiarSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormSris")) {
				jButtonVerFormSrisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionSris")) {
				jButtonRecargarInformacionSrisActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarSris")) {
				jButtonRecargarInformacionSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionSris")) {
				jButtonRecargarInformacionSrisActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresSris")) {
				jButtonAnterioresSrisActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarSris")) {
				jButtonAnterioresSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreSris")) {
				jButtonAnterioresSrisActionPerformed(evt);
			} else if(sTipo.equals("SiguientesSris")) {
				jButtonSiguientesSrisActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarSris")) {
				jButtonSiguientesSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesSris")) {
				jButtonSiguientesSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderBySris") || sTipo.equals("MenuItemDetalleAbrirOrderBySris")) {
				jButtonAbrirOrderBySrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarSris") || sTipo.equals("MenuItemDetalleMostrarOcultarSris")) {
				jButtonMostrarOcultarSrisActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosSris")) {
				jButtonNuevoGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarSris")) {
				jButtonNuevoGuardarCambiosSrisActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosSris")) {
				jButtonNuevoGuardarCambiosSrisActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoSris")) {
				jButtonCerrarReporteDinamicoSrisActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoSris")) {
				jButtonGenerarReporteDinamicoSrisActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoSris")) {
				
				jButtonGenerarExcelReporteDinamicoSrisActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionSris")) {
				jButtonCerrarImportacionSrisActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionSris")) {
				
				jButtonGenerarImportacionSrisActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionSris")) {
				
				jButtonAbrirImportacionSrisActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesSris")) {
				jComboBoxTiposAccionesSrisActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesSris")) {
				jComboBoxTiposRelacionesSrisActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioSris")) {
				jComboBoxTiposAccionesSrisActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarSris")) {
				
				jComboBoxTiposSeleccionarSrisActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralSris")) {
				jTextFieldValorCampoGeneralSrisActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderBySris")) {
				jButtonAbrirOrderBySrisActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarSris")) {
				jButtonAbrirOrderBySrisActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderBySris")) {
				jButtonCerrarOrderBySrisActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSrisBusqueda")) {
				this.jButtonidSrisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSrisBusqueda")) {
				this.jButtoncodigoSrisBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessSris();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Sris srisLocal=null;
			
			if(!this.getEsControlTabla()) {
				srisLocal=this.sris;
			} else {
				srisLocal=this.srisAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
							
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
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
			
			


			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
								
						
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
								
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
							
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
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
			
			


			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
								
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
			
			this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosSris")) {
					jCheckBoxSeleccionarTodosSrisItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosSris")) {
					jCheckBoxSeleccionadosSrisItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarSris")) {
					
				}
				
				


				
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
												
				
				


				
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
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
			
			


			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaSrisActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.sris);
				
				this.actualizarInformacion("INFO_PADRE",false,this.sris);
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
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
				
				


				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Sris.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Sris.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaSrisActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.srisAnterior =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.srisAnterior =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarSris")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosSrisListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosSris.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.sris =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.sris =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.sris);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarSris")) {
				
				}
				
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarSris")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosSris.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarSris")) {
			
			}
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessSris();
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			if(sTipo.equals("NuevoSris")) {
				jButtonNuevoSrisActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarSris")) {
				jButtonDuplicarSrisActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarSris")) {
				jButtonCopiarSrisActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormSris")) {
				jButtonVerFormSrisActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesSris")) {
				jButtonNuevoSrisActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarSris")) {
				jButtonModificarSrisActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarSris")) {
				jButtonActualizarSrisActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarSris")) {
				jButtonEliminarSrisActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarSris")) {
				jButtonCancelarSrisActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarSris")) {
				jButtonCerrarSrisActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosSris")) {
				jButtonGuardarCambiosSrisActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosSris")) {
				jButtonNuevoGuardarCambiosSrisActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderBySris")) {
				jButtonAbrirOrderBySrisActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionSris")) {
				jButtonRecargarInformacionSrisActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresSris")) {
				jButtonAnterioresSrisActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesSris")) {
				jButtonSiguientesSrisActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idSrisBusqueda")) {
				this.jButtonidSrisBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoSrisBusqueda")) {
				this.jButtoncodigoSrisBusquedaActionPerformed(evt);
			}
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessSris();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameSris")) {
				closingInternalFrameSris();
				
			} else if(sTipo.equals("jButtonCancelarSris")) {
				JInternalFrameBase jInternalFrameDetalleFormSris = (JInternalFrameBase)evt.getSource();
	            	
	            SrisBeanSwingJInternalFrame jInternalFrameParent=(SrisBeanSwingJInternalFrame)jInternalFrameDetalleFormSris.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarSrisActionPerformed(null);
			}
			
			SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.sris,new Object(),this.srisParameterGeneral,this.srisReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormSris(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormSris(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormSris(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.sris)) {
			if(!esControlTabla) {
				if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualSris(this.sris,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);			
				}
				
				if(this.srisSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualSris(this.sris,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanSris(this.srisReturnGeneral,this.srisBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.srisSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanSris(classes,this.srisReturnGeneral,this.srisBean,false);
					}
						
					if(this.srisReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeySris(this.srisReturnGeneral.getSris());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioSris(this.srisReturnGeneral.getSris());	
					}
						
					if(this.srisReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioSris(this.srisReturnGeneral.getSris(),classes);//this.srisBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioSris(this.sris,classes);//this.srisBean);									
				}
			
				if(SrisJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualSris(this.sris,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysSris(this.sris);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.srisAnterior!=null) {
						this.sris=this.srisAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.srisSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.srisSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.srisReturnGeneral.getSris(),srisLogic.getSriss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.srisReturnGeneral.getSris(),this.sriss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosSris.repaint();
				
				//((AbstractTableModel) this.jTableDatosSris.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosSris();
			}
		}
	}
	
	public void actualizarVisualTableDatosSris() throws Exception {
		
		SrisModel srisModel=(SrisModel)this.jTableDatosSris.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			srisModel.sriss=this.srisLogic.getSriss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			srisModel.sriss=this.sriss;
		}
		
		
		((SrisModel) this.jTableDatosSris.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaSris() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getsrisAnterior(),this.srisLogic.getSriss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getsrisAnterior(),this.sriss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosSris();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioSris(Sris sris,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
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
										
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sris,new Object(),generalEntityParameterGeneral,this.srisReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.srisSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=SrisConstantesFunciones.getClassesRelationshipsOfSris(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=SrisConstantesFunciones.getClassesRelationshipsFromStringsOfSris(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormSris(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				SrisBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.sris,new Object(),generalEntityParameterGeneral,this.srisReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,SrisConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioSris(SrisBean srisBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanSris(ArrayList<Classe> classes,SrisReturnGeneral srisReturnGeneral,SrisBean srisBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualSris(Sris sris,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.sris)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormSris = new SrisDetalleFormJInternalFrame(jDesktopPane,this.srisSessionBean.getConGuardarRelaciones(),this.srisSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormSris);
		this.jInternalFrameDetalleFormSris.setVisible(false);
		this.jInternalFrameDetalleFormSris.setSelected(false);						
		
		this.jInternalFrameDetalleFormSris.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormSris.srisLogic=this.srisLogic;
		
		this.cargarCombosFrameForeignKeySris("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleSris();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleSris();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeySris("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeySris();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormSris.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSris"));
		
		this.jInternalFrameDetalleFormSris.jButtonModificarSris.addActionListener(new ButtonActionListener(this,"ModificarSris"));

		
		this.jInternalFrameDetalleFormSris.jButtonModificarToolBarSris.addActionListener(new ButtonActionListener(this,"ModificarToolBarSris"));
					
		this.jInternalFrameDetalleFormSris.jMenuItemModificarSris.addActionListener(new ButtonActionListener(this,"MenuItemModificarSris"));		
		
		
		
		this.jInternalFrameDetalleFormSris.jButtonActualizarSris.addActionListener (new ButtonActionListener(this,"ActualizarSris"));
		
		
		this.jInternalFrameDetalleFormSris.jButtonActualizarToolBarSris.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSris"));
						
		this.jInternalFrameDetalleFormSris.jMenuItemActualizarSris.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSris"));		
		
		
		
		this.jInternalFrameDetalleFormSris.jButtonEliminarSris.addActionListener (new ButtonActionListener(this,"EliminarSris"));
		
		
		this.jInternalFrameDetalleFormSris.jButtonEliminarToolBarSris.addActionListener (new ButtonActionListener(this,"EliminarToolBarSris"));
								
		this.jInternalFrameDetalleFormSris.jMenuItemEliminarSris.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSris"));		
		
		
		
		this.jInternalFrameDetalleFormSris.jButtonCancelarSris.addActionListener (new ButtonActionListener(this,"CancelarSris"));
		
		
		this.jInternalFrameDetalleFormSris.jButtonCancelarToolBarSris.addActionListener (new ButtonActionListener(this,"CancelarToolBarSris"));
					
		this.jInternalFrameDetalleFormSris.jMenuItemCancelarSris.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSris"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormSris.jMenuItemDetalleCerrarSris.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSris"));		
		
		
		
		this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosToolBarSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSris"));
		
		
		
		this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosToolBarSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSris"));
		
		
		
		this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSris"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSris.jButtonidSrisBusqueda.addActionListener(new ButtonActionListener(this,"idSrisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSris.jButtoncodigoSrisBusqueda.addActionListener(new ButtonActionListener(this,"codigoSrisBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSris"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameSris"));
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarSris"));
		}
		
		this.jTableDatosSris.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarSris"));
		
		this.jTableDatosSris.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarSris"));
		
		this.jButtonNuevoSris.addActionListener(new ButtonActionListener(this,"NuevoSris"));
		
		this.jButtonDuplicarSris.addActionListener(new ButtonActionListener(this,"DuplicarSris"));
		
		this.jButtonCopiarSris.addActionListener(new ButtonActionListener(this,"CopiarSris"));
		
		this.jButtonVerFormSris.addActionListener(new ButtonActionListener(this,"VerFormSris"));
		
		
		this.jButtonNuevoToolBarSris.addActionListener(new ButtonActionListener(this,"NuevoToolBarSris"));
			
		this.jButtonDuplicarToolBarSris.addActionListener(new ButtonActionListener(this,"DuplicarToolBarSris"));
			
		this.jMenuItemNuevoSris.addActionListener (new ButtonActionListener(this,"MenuItemNuevoSris"));
			
		this.jMenuItemDuplicarSris.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarSris"));		
		
		
		this.jButtonNuevoRelacionesSris.addActionListener (new ButtonActionListener(this,"NuevoRelacionesSris"));
		
		
		this.jButtonNuevoRelacionesToolBarSris.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarSris"));
			
		this.jMenuItemNuevoRelacionesSris.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesSris"));		
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonModificarSris.addActionListener(new ButtonActionListener(this,"ModificarSris"));
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonModificarToolBarSris.addActionListener(new ButtonActionListener(this,"ModificarToolBarSris"));
			
			this.jInternalFrameDetalleFormSris.jMenuItemModificarSris.addActionListener(new ButtonActionListener(this,"MenuItemModificarSris"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormSris.jButtonActualizarSris.addActionListener (new ButtonActionListener(this,"ActualizarSris"));
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonActualizarToolBarSris.addActionListener(new ButtonActionListener(this,"ActualizarToolBarSris"));
				
			this.jInternalFrameDetalleFormSris.jMenuItemActualizarSris.addActionListener (new ButtonActionListener(this,"MenuItemActualizarSris"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonEliminarSris.addActionListener (new ButtonActionListener(this,"EliminarSris"));
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonEliminarToolBarSris.addActionListener (new ButtonActionListener(this,"EliminarToolBarSris"));
						
			this.jInternalFrameDetalleFormSris.jMenuItemEliminarSris.addActionListener (new ButtonActionListener(this,"MenuItemEliminarSris"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonCancelarSris.addActionListener (new ButtonActionListener(this,"CancelarSris"));
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonCancelarToolBarSris.addActionListener (new ButtonActionListener(this,"CancelarToolBarSris"));
			
			this.jInternalFrameDetalleFormSris.jMenuItemCancelarSris.addActionListener (new ButtonActionListener(this,"MenuItemCancelarSris"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarSris.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarSris"));		
		
		
		this.jButtonCerrarSris.addActionListener (new ButtonActionListener(this,"CerrarSris"));
		
		
		this.jButtonCerrarToolBarSris.addActionListener (new ButtonActionListener(this,"CerrarToolBarSris"));
			
		this.jMenuItemCerrarSris.addActionListener (new ButtonActionListener(this,"MenuItemCerrarSris"));
			
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jMenuItemDetalleCerrarSris.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarSris"));		
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosSris"));
		}
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosToolBarSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarSris"));
		}
		
		this.jButtonCopiarToolBarSris.addActionListener (new ButtonActionListener(this,"CopiarToolBarSris"));
			
		this.jButtonVerFormToolBarSris.addActionListener (new ButtonActionListener(this,"VerFormToolBarSris"));
		
		this.jMenuItemGuardarCambiosSris.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosSris"));
			
		this.jMenuItemCopiarSris.addActionListener (new ButtonActionListener(this,"MenuItemCopiarSris"));		
		
		this.jMenuItemVerFormSris.addActionListener (new ButtonActionListener(this,"MenuItemVerFormSris"));		
		
		
		this.jButtonGuardarCambiosTablaSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSris"));
		
		
		this.jButtonGuardarCambiosTablaToolBarSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarSris"));
			
		this.jMenuItemGuardarCambiosTablaSris.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaSris"));		
		
		
		
		this.jButtonRecargarInformacionSris.addActionListener (new ButtonActionListener(this,"RecargarInformacionSris"));
					
		this.jButtonRecargarInformacionToolBarSris.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarSris"));
		
		this.jMenuItemRecargarInformacionSris.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionSris"));		
		
		
		
		this.jButtonAnterioresSris.addActionListener (new ButtonActionListener(this,"AnterioresSris"));
		
		
		this.jButtonAnterioresToolBarSris.addActionListener (new ButtonActionListener(this,"AnterioresToolBarSris"));
		
		this.jMenuItemAnterioresSris.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresSris"));		
		
		
		this.jButtonSiguientesSris.addActionListener (new ButtonActionListener(this,"SiguientesSris"));
		
		
		this.jButtonSiguientesToolBarSris.addActionListener (new ButtonActionListener(this,"SiguientesToolBarSris"));
			
		this.jMenuItemSiguientesSris.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesSris"));
			
		this.jMenuItemAbrirOrderBySris.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderBySris"));
			
		this.jMenuItemMostrarOcultarSris.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarSris"));
			
		this.jMenuItemDetalleAbrirOrderBySris.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderBySris"));
			
		this.jMenuItemDetalleMostarOcultarSris.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarSris"));		
		
		
		this.jButtonNuevoGuardarCambiosSris.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosSris"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarSris.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarSris"));
			
		this.jMenuItemNuevoGuardarCambiosSris.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosSris"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosSris.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosSris"));

		this.jCheckBoxSeleccionadosSris.addItemListener(new CheckBoxItemListener(this,"SeleccionadosSris"));
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioSris"));
		}
		
		
		this.jComboBoxTiposRelacionesSris.addActionListener (new ButtonActionListener(this,"TiposRelacionesSris"));
			
		this.jComboBoxTiposAccionesSris.addActionListener (new ButtonActionListener(this,"TiposAccionesSris"));
					
		this.jComboBoxTiposSeleccionarSris.addActionListener (new ButtonActionListener(this,"TiposSeleccionarSris"));
			
		this.jTextFieldValorCampoGeneralSris.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralSris"));		
		
		
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSris.jButtonidSrisBusqueda.addActionListener(new ButtonActionListener(this,"idSrisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSris.jButtoncodigoSrisBusqueda.addActionListener(new ButtonActionListener(this,"codigoSrisBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoSris!=null) {
				this.jInternalFrameReporteDinamicoSris.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSris"));
				this.jInternalFrameReporteDinamicoSris.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSris"));
				this.jInternalFrameReporteDinamicoSris.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSris"));
			}
			
			//this.jButtonCerrarReporteDinamicoSris.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoSris"));				
			//this.jButtonGenerarReporteDinamicoSris.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoSris"));
			//this.jButtonGenerarExcelReporteDinamicoSris.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoSris"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionSris!=null) {
				this.jInternalFrameImportacionSris.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionSris"));
				this.jInternalFrameImportacionSris.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionSris"));
				this.jInternalFrameImportacionSris.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionSris"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderBySris.addActionListener (new ButtonActionListener(this,"AbrirOrderBySris"));
			
			this.jButtonAbrirOrderByToolBarSris.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarSris"));			
			
			if(this.jInternalFrameOrderBySris!=null) {
				this.jInternalFrameOrderBySris.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderBySris"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormSris!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormSris.jTabbedPaneRelacionesSris.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesSris"));
		
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
            		closingInternalFrameSris();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormSris.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormSris = (JInternalFrameBase)event.getSource();
	            	
	            SrisBeanSwingJInternalFrame jInternalFrameParent=(SrisBeanSwingJInternalFrame)jInternalFrameDetalleFormSris.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarSrisActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosSris.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosSrisListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosSris.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosSris.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSrisActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSrisActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSrisActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoSris";
		inputMap = this.jButtonNuevoSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSrisActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSrisActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSrisActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoSrisActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesSris";
		inputMap = this.jButtonNuevoRelacionesSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoSrisActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarSris";
		inputMap = this.jButtonModificarSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarSrisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarSris";
		inputMap = this.jButtonActualizarSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarSrisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarSris";
		inputMap = this.jButtonEliminarSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarSrisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarSris";
		inputMap = this.jButtonCancelarSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarSrisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarSris";
		inputMap = this.jButtonCerrarSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarSrisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosSris";
		inputMap = this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormSris.jButtonGuardarCambiosSris.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosSrisActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosSris.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosSrisItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesSris.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesSrisActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarSris.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarSrisActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralSris.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralSrisActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSris.jButtonidSrisBusqueda.addActionListener(new ButtonActionListener(this,"idSrisBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormSris.jButtoncodigoSrisBusqueda.addActionListener(new ButtonActionListener(this,"codigoSrisBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionSris.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionSrisActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarSrisActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarSris.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosSris(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Sris srisAux:this.srisLogic.getSriss()) {
					srisAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sris srisAux:sriss) {
					srisAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosSrisItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSris(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sris srisAux:this.srisLogic.getSriss()) {
						srisAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sris srisAux:sriss) {
						srisAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Sris srisAux:this.srisLogic.getSriss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sris srisAux:sriss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaSris(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSris.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSris.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSris,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosSrisItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingSris(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosSris.getSelectedRows();
			
			Sris srisLocal=new Sris();
			
			//this.seleccionarTodosSris(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					srisLocal =(Sris) this.srisLogic.getSriss().toArray()[this.jTableDatosSris.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					srisLocal =(Sris) this.sriss.toArray()[this.jTableDatosSris.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				srisLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Sris srisAux:this.srisLogic.getSriss()) {
						srisAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Sris srisAux:sriss) {
						srisAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaSris(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosSris.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosSris.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosSris,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualSrisItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarSrisParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralSrisActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingSris(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralSris.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Sris srisAux:this.srisLogic.getSriss()) {
				
						if(sTipoSeleccionar.equals(SrisConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							srisAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sris srisAux:sriss) {
					
						if(sTipoSeleccionar.equals(SrisConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							srisAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaSris(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesSrisActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingSris(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioSris=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesSris.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteSris) {				
					conSplash=true;//false;										
					
					//this.startProcessSris(conSplash);
				
					this.generarReporteSrissSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoSrissSeleccionados();
				//this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSrissSeleccionados(false);
				//this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoSrissSeleccionados(true);
				//this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSris();
				
				this.exportarSrissSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionSriss();
				//this.importarSriss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessSris();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelSrissSeleccionados();
				//this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Sris", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessSris();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoSris)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeySris(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
				}	
			} 			
			else if(SrisBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteSris) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessSris(conSplash);
					
						//this.actualizarParametrosGeneralSris();
						
						this.generarReporteProcesoAccionSrissSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(SrisBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO SrisS SELECCIONADOS?", "MANTENIMIENTO DE Sris", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessSris();
				
						this.actualizarParametrosGeneralSris();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.srisReturnGeneral=srisLogic.procesarAccionSrissWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.srisLogic.getSriss(),this.srisParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarSrisReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralSris();
					
					SrisBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarSrisReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesSris.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormSris.jComboBoxTiposAccionesFormularioSris.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessSris(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesSrisActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessSris();
			
			if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
			Sris sris=new Sris();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingSris(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesSris.getSelectedItem();
			
			
			
			
			srissSeleccionados=this.getSrissSeleccionados(true);
			//this.sTipoAccion;
			
			if(srissSeleccionados.size()==1) {
				for(Sris srisAux:srissSeleccionados) {
					sris=srisAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessSris();
			
      		//this.finishProcessSris(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarSrisReturnGeneral() throws Exception {
		if(this.srisReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.srisReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.srisReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.srisReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.srisReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.srisReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingSris(false);
		}
		
		if(this.srisReturnGeneral.getConRetornoLista() || this.srisReturnGeneral.getConRetornoObjeto()) {
			if(this.srisReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.srisLogic.setSriss(this.srisReturnGeneral.getSriss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.srisReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.srisLogic.setSris(this.srisReturnGeneral.getSris());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingSris(false);
		}
	}
	
	public void actualizarParametrosGeneralSris() throws Exception {
		
		
	}
	
	public ArrayList<Sris> getSrissSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioSris) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Sris srisAux:srisLogic.getSriss()) {
					if(srisAux.getIsSelected()) {
						srissSeleccionados.add(srisAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Sris srisAux:this.sriss) {
					if(srisAux.getIsSelected()) {
						srissSeleccionados.add(srisAux);				
					}
				}
			}
			
			if(srissSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						srissSeleccionados.addAll(this.srisLogic.getSriss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						srissSeleccionados.addAll(this.sriss);				
					}
				}
			}
		} else {
			srissSeleccionados.add(this.sris);
		}
		
		return srissSeleccionados;
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
	
	public void generarReporteSrissSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalSrissSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoSrissSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSrissSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoSrissSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Sris",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesSrissSeleccionados() throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteSriss("Todos",srissSeleccionados);
		
	}	
	
	public void generarReporteNormalSrissSeleccionados() throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteSriss("Todos",srissSeleccionados);
	}		
	
	public void generarReporteProcesoAccionSrissSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteSriss("Todos",srissSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoSrissSeleccionados() throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		
		this.abrirInicializarFrameReporteDinamicoSris();
		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoSris();
		
		
		//this.generarReporteSriss("Todos",srissSeleccionados ,srisImplementable,srisImplementableHome);
	}
	
	public void mostrarImportacionSriss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionSris();
		
		this.abrirFrameImportacionSris();		
		
			
		//this.generarReporteSriss("Todos",srissSeleccionados ,srisImplementable,srisImplementableHome);
	}
	
	public void importarSriss() throws Exception {		
	
	}
	
	public void exportarSrissSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelSrissSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoSrissSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlSrissSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Sris",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoSrissSeleccionados() throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarSris(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Sris srisAux:srissSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarSris(srisAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//srisAux.setsDetalleGeneralEntityReporte(srisAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarSris(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=SrisConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SrisConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=SrisConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarSris(Sris sris,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=sris.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=sris.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=sris.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelSrissSeleccionados() throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Sriss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelSris(row);				
				iRow++;
			}				
			
			for(Sris srisAux:srissSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelSris(srisAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlSrissSeleccionados() throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();		
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"sris.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("sriss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("sris");
			//elementRoot.appendChild(element);
		
			for(Sris srisAux:srissSeleccionados) {
				element = document.createElement("sris");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlSris(srisAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.srisSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Sris",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelSris(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(SrisConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(SrisConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(SrisConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelSris(Sris sris,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(sris.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(sris.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlSris(Sris sris,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(SrisConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(sris.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(SrisConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(sris.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(SrisConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(sris.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoSrissSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Sris> srissSeleccionados=new ArrayList<Sris>();
		
		srissSeleccionados=this.getSrissSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoSris(srissSeleccionados);
		
		this.generarReporteSriss("Todos",srissSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoSris(ArrayList<Sris> srissSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Sris srisAux:srissSeleccionados) {
				srisAux.setsDetalleGeneralEntityReporte(srisAux.toString());
			
				if(sTipoSeleccionar.equals(SrisConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					srisAux.setsDescripcionGeneralEntityReporte1(srisAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,SrisConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesSris(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoSris=true;
				this.isVisibilidadCeldaNuevoRelacionesSris=true;
				this.isVisibilidadCeldaGuardarCambiosSris=true;
			}
			
			this.isVisibilidadCeldaModificarSris=false;
			this.isVisibilidadCeldaActualizarSris=false;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=true;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
			this.isVisibilidadCeldaModificarSris=false;
			this.isVisibilidadCeldaActualizarSris=true;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=true;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
			this.isVisibilidadCeldaModificarSris=false;
			this.isVisibilidadCeldaActualizarSris=true;
			this.isVisibilidadCeldaEliminarSris=true;
			this.isVisibilidadCeldaCancelarSris=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=true;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
			this.isVisibilidadCeldaModificarSris=false;
			this.isVisibilidadCeldaActualizarSris=true;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=false;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoSris=true;
			this.isVisibilidadCeldaNuevoRelacionesSris=true;
			this.isVisibilidadCeldaGuardarCambiosSris=true;
			this.isVisibilidadCeldaModificarSris=false;
			this.isVisibilidadCeldaActualizarSris=false;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=true;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
			this.isVisibilidadCeldaActualizarSris=false;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=false;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
			this.isVisibilidadCeldaModificarSris=true;
			this.isVisibilidadCeldaActualizarSris=false;
			this.isVisibilidadCeldaEliminarSris=false;
			this.isVisibilidadCeldaCancelarSris=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarSris=false;
				} else {
					this.isVisibilidadCeldaGuardarSris=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(SrisJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoSris=true;
			this.isVisibilidadCeldaNuevoRelacionesSris=true;
			this.isVisibilidadCeldaGuardarCambiosSris=true;
		} else {
			this.actualizarEstadoPanelsSris(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarSris=false;
			//this.isVisibilidadCeldaVerFormSris=false;
			this.isVisibilidadCeldaDuplicarSris=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!srisSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
		} else {
			this.isVisibilidadCeldaNuevoSris=false;
			this.isVisibilidadCeldaGuardarCambiosSris=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(srisSessionBean.getEsGuardarRelacionado()) {
			if(!srisSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesSris=false;												
			}
			
			this.jButtonCerrarSris.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesSris=false;
		}
		
		if(!this.permiteMantenimiento(this.sris)) {
			this.isVisibilidadCeldaActualizarSris=false;
			this.isVisibilidadCeldaEliminarSris=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesSris() {
	}
	
	public void actualizarEstadoPanelsSris(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(true);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(false);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(false);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(false);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(true);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(true);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionSris!=null) {
				this.jScrollPanelDatosEdicionSris.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosSris!=null) {
				this.jScrollPanelDatosSris.setVisible(true);
			}
			
			if(this.jPanelPaginacionSris!=null) {
				this.jPanelPaginacionSris.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesSris!=null) {
				this.jPanelParametrosReportesSris.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.srisSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.srisSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//SrisSessionBean srisSessionBean=new SrisSessionBean();
		
		if(this.srisSessionBean==null) {
			this.srisSessionBean=new SrisSessionBean();
		}
		
		this.srisSessionBean.setsUltimaBusquedaSris(this.getsAccionBusqueda());
		this.srisSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.srisSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//SrisSessionBean srisSessionBean=new SrisSessionBean();
		
		if(this.srisSessionBean==null) {
			this.srisSessionBean=new SrisSessionBean();
		}
		
		if(this.srisSessionBean.getsUltimaBusquedaSris()!=null&&!this.srisSessionBean.getsUltimaBusquedaSris().equals("")) {
			this.setsAccionBusqueda(srisSessionBean.getsUltimaBusquedaSris());
			this.setiNumeroPaginacion(srisSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(srisSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.srisSessionBean.setsUltimaBusquedaSris("");
		this.srisSessionBean.setiNumeroPaginacion(SrisConstantesFunciones.INUMEROPAGINACION);
		this.srisSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaSris(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioSris() {
		this.updateBorderResaltarBusquedasFormularioSris();
		this.updateVisibilidadBusquedasFormularioSris();
		this.updateHabilitarBusquedasFormularioSris();
	}
	
	public void updateBorderResaltarBusquedasFormularioSris() {					
	}
	
	public void updateVisibilidadBusquedasFormularioSris() {
	}
	
	public void updateHabilitarBusquedasFormularioSris() {
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
	
	public void updateControlesFormularioSris() throws Exception {

		if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioSris();
		this.updateVisibilidadResaltarControlesFormularioSris();
		this.updateHabilitarResaltarControlesFormularioSris();
		
	}
	
	public void updateBorderResaltarControlesFormularioSris() throws Exception {
		if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.srisConstantesFunciones.resaltaridSris!=null && this.jInternalFrameDetalleFormSris!=null) {this.jInternalFrameDetalleFormSris.jLabelidSris.setBorder(this.srisConstantesFunciones.resaltaridSris);}
		if(this.srisConstantesFunciones.resaltarcodigoSris!=null && this.jInternalFrameDetalleFormSris!=null) {this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setBorder(this.srisConstantesFunciones.resaltarcodigoSris);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioSris() throws Exception {		
		if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSris!=null) {
	
		//this.jInternalFrameDetalleFormSris.jLabelidSris.setVisible(this.srisConstantesFunciones.mostraridSris);
		this.jInternalFrameDetalleFormSris.jPanelidSris.setVisible(this.srisConstantesFunciones.mostraridSris);
		//this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setVisible(this.srisConstantesFunciones.mostrarcodigoSris);
		this.jInternalFrameDetalleFormSris.jPanelcodigoSris.setVisible(this.srisConstantesFunciones.mostrarcodigoSris);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioSris() throws Exception {
		if(this.jInternalFrameDetalleFormSris==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormSris!=null) {
	
		this.jInternalFrameDetalleFormSris.jLabelidSris.setEnabled(this.srisConstantesFunciones.activaridSris);
		this.jInternalFrameDetalleFormSris.jTextFieldcodigoSris.setEnabled(this.srisConstantesFunciones.activarcodigoSris);
		}
	}
	
		
}