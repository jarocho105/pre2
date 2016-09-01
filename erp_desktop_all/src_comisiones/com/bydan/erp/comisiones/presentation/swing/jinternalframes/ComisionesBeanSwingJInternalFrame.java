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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.ComisionesConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionesParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionesParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionesBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
public class ComisionesBeanSwingJInternalFrame extends ComisionesJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionesBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Comisiones> comisionesValidator = new ClassValidator<Comisiones>(Comisiones.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Comisiones comisiones;	
	public Comisiones comisionesAux;
	public Comisiones comisionesAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Comisiones comisionesTotales;
	public Long idComisionesActual;
	public Long iIdNuevoComisiones=0L;
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
	
	public Boolean isPermisoTodoComisiones;
	public Boolean isPermisoNuevoComisiones;
	public Boolean isPermisoActualizarComisiones;
	public Boolean isPermisoActualizarOriginalComisiones;
	public Boolean isPermisoEliminarComisiones;
	public Boolean isPermisoGuardarCambiosComisiones;
	public Boolean isPermisoConsultaComisiones;
	public Boolean isPermisoBusquedaComisiones;
	public Boolean isPermisoReporteComisiones;
	public Boolean isPermisoPaginacionMedioComisiones;
	public Boolean isPermisoPaginacionAltoComisiones;
	public Boolean isPermisoPaginacionTodoComisiones;
	public Boolean isPermisoCopiarComisiones;
	public Boolean isPermisoVerFormComisiones;
	public Boolean isPermisoDuplicarComisiones;
	public Boolean isPermisoOrdenComisiones;
	
	
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
	
	public ComisionesParameterReturnGeneral comisionesReturnGeneral;
	public ComisionesParameterReturnGeneral comisionesParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisiones=false;
	public Boolean esParaAccionDesdeFormularioComisiones=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionesSessionBeanAdditional comisionesSessionBeanAdditional=null;
	
	public ComisionesSessionBeanAdditional getComisionesSessionBeanAdditional() {
		return this.comisionesSessionBeanAdditional;
	}
	
	public void setComisionesSessionBeanAdditional(ComisionesSessionBeanAdditional comisionesSessionBeanAdditional) {
		try {
			this.comisionesSessionBeanAdditional=comisionesSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionesBeanSwingJInternalFrameAdditional comisionesBeanSwingJInternalFrameAdditional=null;
	//public class ComisionesBeanSwingJInternalFrame
	
	public ComisionesBeanSwingJInternalFrameAdditional getComisionesBeanSwingJInternalFrameAdditional() {
		return this.comisionesBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionesBeanSwingJInternalFrameAdditional(ComisionesBeanSwingJInternalFrameAdditional comisionesBeanSwingJInternalFrameAdditional) {
		try {
			this.comisionesBeanSwingJInternalFrameAdditional=comisionesBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionesLogic comisionesLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Comisiones comisionesBean;
	public ComisionesConstantesFunciones comisionesConstantesFunciones;
	//public ComisionesParameterReturnGeneral comisionesReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<Comisiones> comisioness;	
	//public List<Comisiones> comisionessEliminados;
	//public List<Comisiones> comisionessAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisiones=false;
	public Boolean isVisibilidadCeldaDuplicarComisiones=true;
	public Boolean isVisibilidadCeldaCopiarComisiones=true;
	public Boolean isVisibilidadCeldaVerFormComisiones=true;
	public Boolean isVisibilidadCeldaOrdenComisiones=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisiones=false;
	public Boolean isVisibilidadCeldaModificarComisiones=false;
	public Boolean isVisibilidadCeldaActualizarComisiones=false;
	public Boolean isVisibilidadCeldaEliminarComisiones=false;
	public Boolean isVisibilidadCeldaCancelarComisiones=false;
	public Boolean isVisibilidadCeldaGuardarComisiones=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisiones=false;	
	
	
	
	public Long getiIdNuevoComisiones() {
		return this.iIdNuevoComisiones;
	}

	public void setiIdNuevoComisiones(Long iIdNuevoComisiones) {
		this.iIdNuevoComisiones = iIdNuevoComisiones;
	}
	
	public Long getidComisionesActual() {
		return this.idComisionesActual;
	}

	public void setidComisionesActual(Long idComisionesActual) {
		this.idComisionesActual = idComisionesActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Comisiones getcomisiones() {
		return this.comisiones;
	}

	public void setcomisiones(Comisiones comisiones) {
		this.comisiones = comisiones;
	}
	
	public Comisiones getcomisionesAux() {
		return this.comisionesAux;
	}

	public void setcomisionesAux(Comisiones comisionesAux) {
		this.comisionesAux = comisionesAux;
	}				
	
	public Comisiones getcomisionesAnterior() {
		return this.comisionesAnterior;
	}

	public void setcomisionesAnterior(Comisiones comisionesAnterior) {
		this.comisionesAnterior = comisionesAnterior;
	}	
	
	public Comisiones getcomisionesTotales() {
		return this.comisionesTotales;
	}

	public void setcomisionesTotales(Comisiones comisionesTotales) {
		this.comisionesTotales = comisionesTotales;
	}	
	
	public Comisiones getcomisionesBean() {
		return this.comisionesBean;
	}

	public void setcomisionesBean(Comisiones comisionesBean) {
		this.comisionesBean = comisionesBean;
	}	
	
	public ComisionesParameterReturnGeneral getcomisionesReturnGeneral() {
		return this.comisionesReturnGeneral;
	}

	public void setcomisionesReturnGeneral(ComisionesParameterReturnGeneral comisionesReturnGeneral) {
		this.comisionesReturnGeneral = comisionesReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ComisionesLogic getComisionesLogic()	{		
		return comisionesLogic;
	}

	public void setComisionesLogic(ComisionesLogic comisionesLogic) {
		this.comisionesLogic = comisionesLogic;
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
	
	public Boolean getIsEsNuevoComisiones() {
		return isEsNuevoComisiones;
	}

	public void setIsEsNuevoComisiones(Boolean isEsNuevoComisiones) {
		this.isEsNuevoComisiones = isEsNuevoComisiones;
	}

	public Boolean getEsParaAccionDesdeFormularioComisiones() {
		return esParaAccionDesdeFormularioComisiones;
	}
	
	public void setEsParaAccionDesdeFormularioComisiones(Boolean esParaAccionDesdeFormularioComisiones) {
		this.esParaAccionDesdeFormularioComisiones = esParaAccionDesdeFormularioComisiones;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesComisiones() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionesConstantesFunciones.refrescarForeignKeysDescripcionesComisiones(this.comisionesLogic.getComisioness());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionesConstantesFunciones.refrescarForeignKeysDescripcionesComisiones(this.comisioness);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//comisionesLogic.setComisioness(this.comisioness);
			comisionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionesParameterReturnGeneral getComisionesParameterGeneral() {
		return this.comisionesParameterGeneral;
	}
	
	public void setComisionesParameterGeneral(ComisionesParameterReturnGeneral comisionesParameterGeneral) {
		this.comisionesParameterGeneral = comisionesParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisiones() {
		return isPermisoTodoComisiones;
	}

	public void setIsPermisoTodoComisiones(Boolean isPermisoTodoComisiones) {
		this.isPermisoTodoComisiones = isPermisoTodoComisiones;
	}

	public Boolean getIsPermisoNuevoComisiones() {
		return isPermisoNuevoComisiones;
	}

	public void setIsPermisoNuevoComisiones(Boolean isPermisoNuevoComisiones) {
		this.isPermisoNuevoComisiones = isPermisoNuevoComisiones;
	}

	public Boolean getIsPermisoActualizarComisiones() {
		return isPermisoActualizarComisiones;
	}

	public void setIsPermisoActualizarComisiones(Boolean isPermisoActualizarComisiones) {
		this.isPermisoActualizarComisiones = isPermisoActualizarComisiones;
	}

	public Boolean getIsPermisoEliminarComisiones() {
		return isPermisoEliminarComisiones;
	}

	public void setIsPermisoEliminarComisiones(Boolean isPermisoEliminarComisiones) {
		this.isPermisoEliminarComisiones = isPermisoEliminarComisiones;
	}

	public Boolean getIsPermisoGuardarCambiosComisiones() {
		return isPermisoGuardarCambiosComisiones;
	}

	public void setIsPermisoGuardarCambiosComisiones(Boolean isPermisoGuardarCambiosComisiones) {
		this.isPermisoGuardarCambiosComisiones = isPermisoGuardarCambiosComisiones;
	}
	
	public Boolean getIsPermisoConsultaComisiones() {
		return isPermisoConsultaComisiones;
	}

	public void setIsPermisoConsultaComisiones(Boolean isPermisoConsultaComisiones) {
		this.isPermisoConsultaComisiones = isPermisoConsultaComisiones;
	}

	public Boolean getIsPermisoBusquedaComisiones() {
		return isPermisoBusquedaComisiones;
	}

	public void setIsPermisoBusquedaComisiones(Boolean isPermisoBusquedaComisiones) {
		this.isPermisoBusquedaComisiones = isPermisoBusquedaComisiones;
	}

	public Boolean getIsPermisoReporteComisiones() {
		return isPermisoReporteComisiones;
	}

	public void setIsPermisoReporteComisiones(Boolean isPermisoReporteComisiones) {
		this.isPermisoReporteComisiones = isPermisoReporteComisiones;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisiones() {
		return isPermisoPaginacionMedioComisiones;
	}

	public void setIsPermisoPaginacionMedioComisiones(Boolean isPermisoPaginacionMedioComisiones) {
		this.isPermisoPaginacionMedioComisiones = isPermisoPaginacionMedioComisiones;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisiones() {
		return isPermisoPaginacionTodoComisiones;
	}

	public void setIsPermisoPaginacionTodoComisiones(Boolean isPermisoPaginacionTodoComisiones) {
		this.isPermisoPaginacionTodoComisiones = isPermisoPaginacionTodoComisiones;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisiones() {
		return isPermisoPaginacionAltoComisiones;
	}

	public void setIsPermisoPaginacionAltoComisiones(Boolean isPermisoPaginacionAltoComisiones) {
		this.isPermisoPaginacionAltoComisiones = isPermisoPaginacionAltoComisiones;
	}
	
	public Boolean getIsPermisoCopiarComisiones() {
		return isPermisoCopiarComisiones;
	}

	public void setIsPermisoCopiarComisiones(Boolean isPermisoCopiarComisiones) {
		this.isPermisoCopiarComisiones = isPermisoCopiarComisiones;
	}
	
	public Boolean getIsPermisoVerFormComisiones() {
		return isPermisoVerFormComisiones;
	}

	public void setIsPermisoVerFormComisiones(Boolean isPermisoVerFormComisiones) {
		this.isPermisoVerFormComisiones = isPermisoVerFormComisiones;
	}
	
	public Boolean getIsPermisoDuplicarComisiones() {
		return isPermisoDuplicarComisiones;
	}

	public void setIsPermisoDuplicarComisiones(Boolean isPermisoDuplicarComisiones) {
		this.isPermisoDuplicarComisiones = isPermisoDuplicarComisiones;
	}
	
	public Boolean getIsPermisoOrdenComisiones() {
		return isPermisoOrdenComisiones;
	}

	public void setIsPermisoOrdenComisiones(Boolean isPermisoOrdenComisiones) {
		this.isPermisoOrdenComisiones = isPermisoOrdenComisiones;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisiones() {
		return isVisibilidadCeldaNuevoComisiones;
	}

	public void setIsVisibilidadCeldaNuevoComisiones(Boolean isVisibilidadCeldaNuevoComisiones) {
		this.isVisibilidadCeldaNuevoComisiones = isVisibilidadCeldaNuevoComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisiones() {
		return isVisibilidadCeldaDuplicarComisiones;
	}

	public void setIsVisibilidadCeldaDuplicarComisiones(Boolean isVisibilidadCeldaDuplicarComisiones) {
		this.isVisibilidadCeldaDuplicarComisiones = isVisibilidadCeldaDuplicarComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisiones() {
		return isVisibilidadCeldaCopiarComisiones;
	}

	public void setIsVisibilidadCeldaCopiarComisiones(Boolean isVisibilidadCeldaCopiarComisiones) {
		this.isVisibilidadCeldaCopiarComisiones = isVisibilidadCeldaCopiarComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisiones() {
		return isVisibilidadCeldaVerFormComisiones;
	}

	public void setIsVisibilidadCeldaVerFormComisiones(Boolean isVisibilidadCeldaVerFormComisiones) {
		this.isVisibilidadCeldaVerFormComisiones = isVisibilidadCeldaVerFormComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisiones() {
		return isVisibilidadCeldaOrdenComisiones;
	}

	public void setIsVisibilidadCeldaOrdenComisiones(Boolean isVisibilidadCeldaOrdenComisiones) {
		this.isVisibilidadCeldaOrdenComisiones = isVisibilidadCeldaOrdenComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisiones() {
		return isVisibilidadCeldaNuevoRelacionesComisiones;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisiones(Boolean isVisibilidadCeldaNuevoRelacionesComisiones) {
		this.isVisibilidadCeldaNuevoRelacionesComisiones = isVisibilidadCeldaNuevoRelacionesComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisiones() {
		return isVisibilidadCeldaModificarComisiones;
	}

	public void setIsVisibilidadCeldaModificarComisiones(Boolean isVisibilidadCeldaModificarComisiones) {
		this.isVisibilidadCeldaModificarComisiones = isVisibilidadCeldaModificarComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisiones() {
		return isVisibilidadCeldaActualizarComisiones;
	}

	public void setIsVisibilidadCeldaActualizarComisiones(Boolean isVisibilidadCeldaActualizarComisiones) {
		this.isVisibilidadCeldaActualizarComisiones = isVisibilidadCeldaActualizarComisiones;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisiones() {
		return isVisibilidadCeldaEliminarComisiones;
	}

	public void setIsVisibilidadCeldaEliminarComisiones(Boolean isVisibilidadCeldaEliminarComisiones) {
		this.isVisibilidadCeldaEliminarComisiones = isVisibilidadCeldaEliminarComisiones;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisiones() {
		return isVisibilidadCeldaCancelarComisiones;
	}

	public void setIsVisibilidadCeldaCancelarComisiones(Boolean isVisibilidadCeldaCancelarComisiones) {
		this.isVisibilidadCeldaCancelarComisiones = isVisibilidadCeldaCancelarComisiones;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisiones() {
		return isVisibilidadCeldaGuardarComisiones;
	}

	public void setIsVisibilidadCeldaGuardarComisiones(Boolean isVisibilidadCeldaGuardarComisiones) {
		this.isVisibilidadCeldaGuardarComisiones = isVisibilidadCeldaGuardarComisiones;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisiones() {
		return isVisibilidadCeldaGuardarCambiosComisiones;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisiones(Boolean isVisibilidadCeldaGuardarCambiosComisiones) {
		this.isVisibilidadCeldaGuardarCambiosComisiones = isVisibilidadCeldaGuardarCambiosComisiones;
	}
		
	public ComisionesSessionBean getcomisionesSessionBean() {
		return this.comisionesSessionBean;
	}
	
	public void setcomisionesSessionBean(ComisionesSessionBean comisionesSessionBean) {
		this.comisionesSessionBean=comisionesSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisiones(Comisiones comisiones)throws Exception {
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
	
	public void bugActualizarReferenciaActual(Comisiones comisiones,Comisiones comisionesAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisiones(comisiones);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisionesAux.setId(comisiones.getId());
		comisionesAux.setVersionRow(comisiones.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisiones();
		
			int intSelectedRow = this.jTableDatosComisiones.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisionesValidator.getInvalidValues(this.comisiones);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisionesLogic.setDatosCliente(datosCliente);
			comisionesLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisionesAux=new  Comisiones();
				
				comisionesAux.setIsNew(true);
				comisionesAux.setIsChanged(true);
				
				comisionesAux.setComisionesOriginal(this.comisiones);
				
				comisionesAux.setId(this.comisiones.getId());	
				comisionesAux.setVersionRow(this.comisiones.getVersionRow());	
				comisionesAux.setcodigo(this.comisiones.getcodigo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisionesAux,comisionesLogic.getComisioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionesAux,comisioness);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionesLogic.saveComisioness();//WithConnection
						//comisionesLogic.getSetVersionRowComisioness();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisiones,comisionesAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionesSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionesLogic.saveComisionesRelaciones(comisionesAux);//WithConnection
								//comisionesLogic.getSetVersionRowComisioness();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisiones,comisionesAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionesSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionesAux,comisionesLogic.getComisioness());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionesAux,comisioness);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisiones,comisionesAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisionesAux=new  Comisiones();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisionesSessionBean.getEsGuardarRelacionado() 
					|| (this.comisionesSessionBean.getEsGuardarRelacionado() && this.comisiones.getId()>=0)) {
						
					comisionesAux.setIsNew(false);
				}
				
				comisionesAux.setIsDeleted(false);
			
				comisionesAux.setId(this.comisiones.getId());	
				comisionesAux.setVersionRow(this.comisiones.getVersionRow());	
				comisionesAux.setcodigo(this.comisiones.getcodigo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionesAux,comisionesLogic.getComisioness());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionesAux,comisioness);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionesLogic.saveComisioness();//WithConnection
						//comisionesLogic.getSetVersionRowComisioness();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisiones,comisionesAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionesSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionesLogic.saveComisionesRelaciones(comisionesAux);//WithConnection
								//comisionesLogic.getSetVersionRowComisioness();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisiones,comisionesAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionesSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionesAux,comisionesLogic.getComisioness());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionesAux,comisioness);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisiones,comisionesAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisionesAux=new  Comisiones();
				
				comisionesAux.setIsNew(false);
				comisionesAux.setIsChanged(false);
				
				comisionesAux.setIsDeleted(true);
				
				comisionesAux.setId(this.comisiones.getId());	
				comisionesAux.setVersionRow(this.comisiones.getVersionRow());	
				comisionesAux.setcodigo(this.comisiones.getcodigo());	
				
				if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisionesAux.getId()>=0) {	
						this.comisionessEliminados.add(comisionesAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisionesAux,comisionesLogic.getComisioness());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionesAux,comisioness);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionesSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionesLogic.saveComisioness();//WithConnection
						//comisionesLogic.getSetVersionRowComisioness();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionesSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionesLogic.saveComisionesRelaciones(comisionesAux);//WithConnection
								//comisionesLogic.getSetVersionRowComisioness();//WithConnection
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
							if(this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisionesSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisionesAux,comisionesLogic.getComisioness());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisionesAux,comisioness);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.getComisioness().addAll(this.comisionessEliminados);
					
					comisionesLogic.saveComisioness();//WithConnection
					//comisionesLogic.getSetVersionRowComisioness();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.comisionessEliminados= new ArrayList<Comisiones>();		
			}
			
			if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comisiones GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisiones=comisionesAux;
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
      		//this.finishProcessComisiones();
      	}
		
	}	
	
	public void actualizarRelaciones(Comisiones comisionesLocal) throws Exception {
		
		if(this.comisionesSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Comisiones comisionesLocal) throws Exception {	
		if(this.comisionesSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarComisionesActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisionesValidator.getInvalidValues(this.comisiones);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Comisiones comisiones,List<Comisiones> comisioness) throws Exception {
		try	{		
			ComisionesConstantesFunciones.actualizarLista(comisiones,comisioness,this.comisionesSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Comisiones comisiones,List<Comisiones> comisioness) throws Exception {
		try	{			
			ComisionesConstantesFunciones.actualizarSelectedLista(comisiones,comisioness);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Comisiones> comisionessLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisionessLocal=this.comisionesLogic.getComisioness();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisionessLocal=this.comisioness;
			}
			//ARCHITECTURE
		
			for(Comisiones comisionesLocal:comisionessLocal) {
				if(this.permiteMantenimiento(comisionesLocal) && comisionesLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionesConstantesFunciones.getComisionesLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionesConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisiones.jLabelcodigoComisiones,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisiones.jLabelcodigoComisiones,"");
		
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
		this.iIdNuevoComisiones--;	
		
		
		this.comisionesAux=new Comisiones();
		
		this.comisionesAux.setId(this.iIdNuevoComisiones);
		this.comisionesAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionesLogic.getComisioness().add(this.comisionesAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisioness.add(this.comisionesAux);
		}
		//ARCHITECTURE
		
		this.comisiones=this.comisionesAux;
		
		if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisiones(this.comisiones);
			this.setVariablesObjetoActualToFormularioForeignKeyComisiones(this.comisiones);
		}
				
		//this.setDefaultControlesComisiones();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisiones();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisiones();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisiones();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisiones(this.comisionesBean,this.comisiones,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisiones(this.comisionesReturnGeneral,this.comisionesBean,false);
		
		if(this.comisionesReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisiones(this.comisionesReturnGeneral.getComisiones());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisiones(this.comisionesReturnGeneral.getComisiones());
		}
		
		if(this.comisionesReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisiones(this.comisionesReturnGeneral.getComisiones(),classes);//this.comisionesBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisiones();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisiones();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionesBeanSwingJInternalFrameAdditional.RecargarFormComisiones(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisiones(false);
						
			if(comisionesSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisiones();
			}
			
			this.actualizarVisualTableDatosComisiones();
			
			this.jTableDatosComisiones.setRowSelectionInterval(this.getIndiceNuevoComisiones(), this.getIndiceNuevoComisiones());
			
			this.seleccionarFilaTablaComisionesActual();
						
			this.actualizarEstadoCeldasBotonesComisiones("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisiones(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setEnabled(isHabilitar && this.comisionesConstantesFunciones.activarcodigoComisiones);	
		
	};
	
	public void setDefaultControlesComisiones() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisiones(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisionesSessionBean.setConGuardarRelaciones(true);			
			this.comisionesSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.setVisible(true);
			
					
		} else {
			//this.comisionesSessionBean.setConGuardarRelaciones(false);			
			this.comisionesSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisiones() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
				if(comisionesAux.getId().equals(this.iIdNuevoComisiones)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Comisiones comisionesAux:this.comisioness) {
				if(comisionesAux.getId().equals(this.iIdNuevoComisiones)) {
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
	
	public int getIndiceActualComisiones(Comisiones comisiones,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
				if(comisionesAux.getId().equals(comisiones.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Comisiones comisionesAux:this.comisioness) {
				if(comisionesAux.getId().equals(comisiones.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisiones(Comisiones comisionesOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
				if(comisionesAux.getComisionesOriginal().getId().equals(comisionesOriginal.getId())) {
					existe=true;
					comisionesOriginal.setId(comisionesAux.getId());
					comisionesOriginal.setVersionRow(comisionesAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Comisiones comisionesAux:this.comisioness) {
				if(comisionesAux.getComisionesOriginal().getId().equals(comisionesOriginal.getId())) {
					existe=true;
					comisionesOriginal.setId(comisionesAux.getId());
					comisionesOriginal.setVersionRow(comisionesAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisiones(Boolean esParaCancelar) throws Exception {
		comisionessAux=new ArrayList<Comisiones>();
		comisionesAux=new Comisiones();
		
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
					if(comisionesAux.getId()<0) {
						comisionessAux.add(comisionesAux);
					}		
				}
				this.iIdNuevoComisiones=0L;
				this.comisionesLogic.getComisioness().removeAll(comisionessAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Comisiones comisionesAux:this.comisioness) {
					if(comisionesAux.getId()<0) {
						comisionessAux.add(comisionesAux);
					}		
				}
				this.iIdNuevoComisiones=0L;
				this.comisioness.removeAll(comisionessAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisiones 
					&& this.comisionesLogic.getComisioness().size()>0
					) {
					comisionesAux=this.comisionesLogic.getComisioness().get(this.comisionesLogic.getComisioness().size() - 1);
				
					if(comisionesAux.getId()<0) {
						this.comisionesLogic.getComisioness().remove(comisionesAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisiones && this.comisioness.size()>0) {
					comisionesAux=this.comisioness.get(this.comisioness.size() - 1);
				
					if(comisionesAux.getId()<0) {
						this.comisioness.remove(comisionesAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisiones(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisiones.getId()<0) {
				this.comisionesLogic.getComisioness().remove(this.comisiones);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisiones.getId()<0) {
				this.comisioness.remove(this.comisiones);
			}
		}			
	}
	
	public void setEstadosInicialesComisiones(List<Comisiones> comisionessAux) throws Exception {
		ComisionesConstantesFunciones.setEstadosInicialesComisiones(comisionessAux);
	}
	
	public void setEstadosInicialesComisiones(Comisiones comisionesAux) throws Exception {
		ComisionesConstantesFunciones.setEstadosInicialesComisiones(comisionesAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionesActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionesActual()) {
				if(!this.isEsNuevoComisiones) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisiones=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionesActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comisiones ?", "MANTENIMIENTO DE Comisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Comisiones comisiones) throws Exception {
		ComisionesConstantesFunciones.seleccionarAsignar(this.comisiones,comisiones);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisiones=this.isPermisoActualizarOriginalComisiones;
			
			
			this.seleccionarAsignar(comisiones);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionesConstantesFunciones.quitarEspaciosComisiones(this.comisiones,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisiones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisionesSessionBean.setsFuncionBusquedaRapida(this.comisionesSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoComisiones) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisiones(esParaCancelar);				
				this.cancelarNuevoComisiones(esParaCancelar);								
			}
			
			this.comisiones=new Comisiones();
			
			this.inicializarComisiones();
			
			this.actualizarEstadoCeldasBotonesComisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisiones() throws Exception {
		try {
			ComisionesConstantesFunciones.inicializarComisiones(this.comisiones);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisionesLogic.getComisioness().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisioness(String sAccionBusqueda,List<Comisiones> comisionessParaReportes) throws Exception {
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
					sPathReporteFinal="Comisiones"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionesMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionesMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Comisiones"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comisioneses");		
		parameters.put("busquedapor", ComisionesConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisiones=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionesConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionesConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisiones=new JRBeanArrayDataSource(ComisionesJInternalFrame.TraerComisionesBeans(comisionessParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisiones);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionesConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionesConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionesBean.TraerComisionesBeans(comisionessParaReportes).toArray()));
							
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
				this.generarExcelReporteComisioness(sAccionBusqueda,sTipoArchivoReporte,comisionessParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisioness(sAccionBusqueda,sTipoArchivoReporte,comisionessParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionesActionPerformed(null);
					//this.generarExcelReporteComisioness(sAccionBusqueda,sTipoArchivoReporte,comisionessParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisioness(sAccionBusqueda,sTipoArchivoReporte,comisionessParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisioness(sAccionBusqueda,sTipoArchivoReporte,comisionessParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisioness(sAccionBusqueda,sTipoArchivoReporte,comisionessParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Comisiones> comisionessParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Comisioness");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisiones("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Comisiones comisiones : comisionessParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionesConstantesFunciones.generarExcelReporteDataComisiones("NORMAL",row,workbook,comisiones,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisiones(String sTipo,Row row,Workbook workbook) {
		
		ComisionesConstantesFunciones.generarExcelReporteHeaderComisiones(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Comisiones> comisionessParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Comisioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Comisiones comisiones : comisionessParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionesConstantesFunciones.getComisionesDescripcion(comisiones));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionesConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionesConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisiones.getcodigo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisioness(String sAccionBusqueda,String sTipoArchivoReporte,List<Comisiones> comisionessParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Comisiones> comisionessRespaldo=null;
		
		classes=ComisionesConstantesFunciones.getClassesRelationshipsOfComisiones(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisionesLogic.setDatosCliente(this.datosCliente);
		this.comisionesLogic.setDatosDeep(this.datosDeep);
		this.comisionesLogic.setIsConDeep(true);
		
		comisionessRespaldo=this.comisionesLogic.getComisioness();
		
		this.comisionesLogic.setComisioness(comisionessParaReportes);	
		this.comisionesLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisionessParaReportes=this.comisionesLogic.getComisioness();
		this.comisionesLogic.setComisioness(comisionessRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Comisioness");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisiones("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Comisiones comisiones : comisionessParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisiones("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionesConstantesFunciones.generarExcelReporteDataComisiones("NORMAL",row,workbook,comisiones,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionesConstantesFunciones.getComisionesDescripcion(comisiones));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisiones.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisiones.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisiones() throws Exception {		
		this.startProcessComisiones(true);
	}
	
	public void startProcessComisiones(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesComisiones, this.jScrollPanelDatosComisiones,this.jPanelPaginacionComisiones, this.jScrollPanelDatosEdicionComisiones, this.jPanelAccionesComisiones,this.jPanelAccionesFormularioComisiones,this.jmenuBarComisiones,this.jmenuBarDetalleComisiones,this.jTtoolBarComisiones,this.jTtoolBarDetalleComisiones);		
		
		final JTabbedPane jTabbedPaneBusquedasComisiones=null; 
		
		final JPanel jPanelParametrosReportesComisiones=this.jPanelParametrosReportesComisiones;
		//final JScrollPane jScrollPanelDatosComisiones=this.jScrollPanelDatosComisiones;
		final JTable jTableDatosComisiones=this.jTableDatosComisiones;		
		final JPanel jPanelPaginacionComisiones=this.jPanelPaginacionComisiones;
		//final JScrollPane jScrollPanelDatosEdicionComisiones=this.jScrollPanelDatosEdicionComisiones;
		final JPanel jPanelAccionesComisiones=this.jPanelAccionesComisiones;
		
		JPanel jPanelCamposAuxiliarComisiones=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisiones=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
			jPanelCamposAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jPanelCamposComisiones;
			jPanelAccionesFormularioAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jPanelAccionesFormularioComisiones;
		}
		
		final JPanel jPanelCamposComisiones=jPanelCamposAuxiliarComisiones;
		final JPanel jPanelAccionesFormularioComisiones=jPanelAccionesFormularioAuxiliarComisiones;
		
		
		final JMenuBar jmenuBarComisiones=this.jmenuBarComisiones;
		final JToolBar jTtoolBarComisiones=this.jTtoolBarComisiones;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisiones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisiones=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
			jmenuBarDetalleAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jmenuBarDetalleComisiones;
			jTtoolBarDetalleAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jTtoolBarDetalleComisiones;
		}
		
		final JMenuBar jmenuBarDetalleComisiones=jmenuBarDetalleAuxiliarComisiones;
		final JToolBar jTtoolBarDetalleComisiones=jTtoolBarDetalleAuxiliarComisiones;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisiones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisiones;
			processRunnable.jTableDatos=jTableDatosComisiones;
			processRunnable.jPanelCampos=jPanelCamposComisiones;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisiones;
			processRunnable.jPanelAcciones=jPanelAccionesComisiones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisiones;
			
			
			processRunnable.jmenuBar=jmenuBarComisiones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisiones;
			processRunnable.jTtoolBar=jTtoolBarComisiones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisiones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisiones ,jPanelParametrosReportesComisiones,jTableDatosComisiones, /*jScrollPanelDatosComisiones,*/jPanelCamposComisiones,jPanelPaginacionComisiones, /*jScrollPanelDatosEdicionComisiones,*/ jPanelAccionesComisiones,jPanelAccionesFormularioComisiones,jmenuBarComisiones,jmenuBarDetalleComisiones,jTtoolBarComisiones,jTtoolBarDetalleComisiones);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesComisiones, jScrollPanelDatosComisiones,jPanelPaginacionComisiones, jScrollPanelDatosEdicionComisiones, jPanelAccionesComisiones,jPanelAccionesFormularioComisiones,jmenuBarComisiones,jmenuBarDetalleComisiones,jTtoolBarComisiones,jTtoolBarDetalleComisiones);
						
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
	
	public void finishProcessComisiones() {// throws Exception 
		this.finishProcessComisiones(true);
	}
	
	public void finishProcessComisiones(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesComisiones, this.jScrollPanelDatosComisiones,this.jPanelPaginacionComisiones, this.jScrollPanelDatosEdicionComisiones, this.jPanelAccionesComisiones,this.jPanelAccionesFormularioComisiones,this.jmenuBarComisiones,this.jmenuBarDetalleComisiones,this.jTtoolBarComisiones,this.jTtoolBarDetalleComisiones);		
		
		final JTabbedPane jTabbedPaneBusquedasComisiones=null; 
		
		final JPanel jPanelParametrosReportesComisiones=this.jPanelParametrosReportesComisiones;
		//final JScrollPane jScrollPanelDatosComisiones=this.jScrollPanelDatosComisiones;
		final JTable jTableDatosComisiones=this.jTableDatosComisiones;		
		final JPanel jPanelPaginacionComisiones=this.jPanelPaginacionComisiones;
		//final JScrollPane jScrollPanelDatosEdicionComisiones=this.jScrollPanelDatosEdicionComisiones;
		final JPanel jPanelAccionesComisiones=this.jPanelAccionesComisiones;
		
		JPanel jPanelCamposAuxiliarComisiones=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisiones=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
			jPanelCamposAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jPanelCamposComisiones;
			jPanelAccionesFormularioAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jPanelAccionesFormularioComisiones;
		}
		
		final JPanel jPanelCamposComisiones=jPanelCamposAuxiliarComisiones;
		final JPanel jPanelAccionesFormularioComisiones=jPanelAccionesFormularioAuxiliarComisiones;
		
		
		final JMenuBar jmenuBarComisiones=this.jmenuBarComisiones;		
		final JToolBar jTtoolBarComisiones=this.jTtoolBarComisiones;
				
		JMenuBar jmenuBarDetalleAuxiliarComisiones=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisiones=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
			jmenuBarDetalleAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jmenuBarDetalleComisiones;
			jTtoolBarDetalleAuxiliarComisiones=this.jInternalFrameDetalleFormComisiones.jTtoolBarDetalleComisiones;		
		}
		
		final JMenuBar jmenuBarDetalleComisiones=jmenuBarDetalleAuxiliarComisiones;
		final JToolBar jTtoolBarDetalleComisiones=jTtoolBarDetalleAuxiliarComisiones;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisiones;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisiones;
			processRunnable.jTableDatos=jTableDatosComisiones;
			processRunnable.jPanelCampos=jPanelCamposComisiones;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisiones;
			processRunnable.jPanelAcciones=jPanelAccionesComisiones;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisiones;
			
			
			processRunnable.jmenuBar=jmenuBarComisiones;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisiones;
			processRunnable.jTtoolBar=jTtoolBarComisiones;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisiones;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisiones ,jPanelParametrosReportesComisiones, jTableDatosComisiones,/*jScrollPanelDatosComisiones,*/jPanelCamposComisiones,jPanelPaginacionComisiones, /*jScrollPanelDatosEdicionComisiones,*/ jPanelAccionesComisiones,jPanelAccionesFormularioComisiones,jmenuBarComisiones,jmenuBarDetalleComisiones,jTtoolBarComisiones,jTtoolBarDetalleComisiones));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisiones(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisiones(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisiones(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisiones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisiones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisiones,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisiones(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisiones,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisiones,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisionesConstantesFunciones.getsFinalQueryComisiones();
		String  finalQueryPaginacionTodos=this.comisionesConstantesFunciones.getsFinalQueryComisiones();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionesConstantesFunciones.getArrayColumnasGlobalesNoComisiones(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionesConstantesFunciones.getArrayColumnasGlobalesComisiones(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionesConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisionessEliminados= new ArrayList<Comisiones>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisiones();
		
				///*ComisionesSessionBean*/this.comisionesSessionBean=new ComisionesSessionBean();
			
			if(this.comisionesSessionBean==null) {
				this.comisionesSessionBean=new ComisionesSessionBean();
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
					this.iNumeroPaginacion=ComisionesConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionesConstantesFunciones.getClassesForeignKeysOfComisiones(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisiones."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisionessAux= new ArrayList<Comisiones>();
			
				
			comisionesLogic.setDatosCliente(this.datosCliente);
			comisionesLogic.setDatosDeep(this.datosDeep);
			comisionesLogic.setIsConDeep(true);
			
			
			comisionesLogic.getComisionesDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisionesLogic.getTodosComisioness(finalQueryGlobal,pagination);
					
					//comisionesLogic.getTodosComisionessWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisionesLogic.getComisioness()==null|| comisionesLogic.getComisioness().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionessAux= new ArrayList<Comisiones>();
							comisionessAux.addAll(comisionesLogic.getComisioness());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionessAux= new ArrayList<Comisiones>();
							comisionessAux.addAll(comisioness);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionesLogic.getTodosComisioness(finalQueryGlobal+"",this.pagination);												
							
							//comisionesLogic.getTodosComisionessWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisioness("Todos",comisionesLogic.getComisioness() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionesLogic.setComisioness(new ArrayList<Comisiones>());					
							comisionesLogic.getComisioness().addAll(comisionessAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisioness=new ArrayList<Comisiones>();
							comisioness.addAll(comisionessAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisiones=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisiones=this.idActual;
				
				} else if(this.idComisionesActual!=null && this.idComisionesActual!=0L) {
					idComisiones=idComisionesActual;
				}
				
					
				this.sDetalleReporte=ComisionesConstantesFunciones.getDetalleIndicePorId(idComisiones);
				
				this.comisioness=new ArrayList<Comisiones>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisionesLogic.getEntity(idComisiones);
					
					//comisionesLogic.getEntityWithConnection(idComisiones);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionesLogic.setComisioness(new ArrayList<Comisiones>());
					comisionesLogic.getComisioness().add(comisionesLogic.getComisiones());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisioness=new ArrayList<Comisiones>();
					this.comisioness.add(comisiones);
				}
				
				if(comisionesLogic.getComisiones()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisiones();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisiones();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionesLogic.getComisioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisioness.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionesLogic.getComisioness().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisioness.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Comisiones comisiones) {
		Boolean permite=true;
		
		if(this.comisiones.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionesConstantesFunciones.getOrderByListaComisiones();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionesConstantesFunciones.getOrderByListaComisiones();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Comisiones comisiones:comisionesLogic.getComisioness()) {
				if(comisiones.getsType().equals(Constantes2.S_TOTALES)) {
					comisionesTotales=comisiones;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Comisiones comisiones:this.comisioness) {
				if(comisiones.getsType().equals(Constantes2.S_TOTALES)) {
					comisionesTotales=comisiones;
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
			this.comisionesAux=new Comisiones();
			this.comisionesAux.setsType(Constantes2.S_TOTALES);
			this.comisionesAux.setIsNew(false);
			this.comisionesAux.setIsChanged(false);
			this.comisionesAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionesConstantesFunciones.TotalizarValoresFilaComisiones(this.comisionesLogic.getComisioness(),this.comisionesAux);
				
				this.comisionesLogic.getComisioness().add(this.comisionesAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionesConstantesFunciones.TotalizarValoresFilaComisiones(this.comisioness,this.comisionesAux);
				
				this.comisioness.add(this.comisionesAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisionesTotales=new Comisiones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionesLogic.getComisioness().remove(comisionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisioness.remove(comisionesTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisionesTotales=new Comisiones();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Comisiones comisiones:comisionesLogic.getComisioness()) {
				if(comisiones.getsType().equals(Constantes2.S_TOTALES)) {
					comisionesTotales=comisiones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionesConstantesFunciones.TotalizarValoresFilaComisiones(this.comisionesLogic.getComisioness(),comisionesTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Comisiones comisiones:this.comisioness) {
				if(comisiones.getsType().equals(Constantes2.S_TOTALES)) {
					comisionesTotales=comisiones;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionesConstantesFunciones.TotalizarValoresFilaComisiones(this.comisioness,comisionesTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosComisiones() {
		this.isPermisoTodoComisiones=false;
		this.isPermisoNuevoComisiones=false;
		this.isPermisoActualizarComisiones=false;
		this.isPermisoActualizarOriginalComisiones=false;
		this.isPermisoEliminarComisiones=false;
		this.isPermisoGuardarCambiosComisiones=false;
		this.isPermisoConsultaComisiones=false;
		this.isPermisoBusquedaComisiones=false;
		this.isPermisoReporteComisiones=false;		
		this.isPermisoOrdenComisiones=false;		
		this.isPermisoPaginacionMedioComisiones=false;		
		this.isPermisoPaginacionAltoComisiones=false;
		this.isPermisoPaginacionTodoComisiones=false;
		this.isPermisoCopiarComisiones=false;		
		this.isPermisoVerFormComisiones=false;		
		this.isPermisoDuplicarComisiones=false;		
		this.isPermisoOrdenComisiones=false;		
	}
	
	public void setPermisosUsuarioComisiones(Boolean isPermiso) {
		this.isPermisoTodoComisiones=isPermiso;
		this.isPermisoNuevoComisiones=isPermiso;
		this.isPermisoActualizarComisiones=isPermiso;
		this.isPermisoActualizarOriginalComisiones=isPermiso;
		this.isPermisoEliminarComisiones=isPermiso;
		this.isPermisoGuardarCambiosComisiones=isPermiso;
		this.isPermisoConsultaComisiones=isPermiso;
		this.isPermisoBusquedaComisiones=isPermiso;
		this.isPermisoReporteComisiones=isPermiso;
		this.isPermisoOrdenComisiones=isPermiso;		
		this.isPermisoPaginacionMedioComisiones=isPermiso;		
		this.isPermisoPaginacionAltoComisiones=isPermiso;		
		this.isPermisoPaginacionTodoComisiones=isPermiso;		
		this.isPermisoCopiarComisiones=isPermiso;		
		this.isPermisoVerFormComisiones=isPermiso;		
		this.isPermisoDuplicarComisiones=isPermiso;
		this.isPermisoOrdenComisiones=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisiones(Boolean isPermiso) {
		//this.isPermisoTodoComisiones=isPermiso;
		this.isPermisoNuevoComisiones=isPermiso;
		this.isPermisoActualizarComisiones=isPermiso;
		this.isPermisoActualizarOriginalComisiones=isPermiso;
		this.isPermisoEliminarComisiones=isPermiso;
		this.isPermisoGuardarCambiosComisiones=isPermiso;
		//this.isPermisoConsultaComisiones=isPermiso;
		//this.isPermisoBusquedaComisiones=isPermiso;
		//this.isPermisoReporteComisiones=isPermiso;
		//this.isPermisoOrdenComisiones=isPermiso;		
		//this.isPermisoPaginacionMedioComisiones=isPermiso;		
		//this.isPermisoPaginacionAltoComisiones=isPermiso;		
		//this.isPermisoPaginacionTodoComisiones=isPermiso;		
		//this.isPermisoCopiarComisiones=isPermiso;		
		//this.isPermisoDuplicarComisiones=isPermiso;
		//this.isPermisoOrdenComisiones=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionesClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisiones(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionesClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionesClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionesClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionesClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisiones() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionesConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisiones=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisiones=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisiones=this.isPermisoActualizarComisiones;
			this.isPermisoEliminarComisiones=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisiones=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisiones=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisiones=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisiones=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisiones=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisiones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisiones=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisiones=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisiones=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisiones=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisiones=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisiones=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisiones=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisiones.setToolTipText(this.jTableDatosComisiones.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisiones(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisiones(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisiones() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyComisionesListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionesJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionesListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyComisionesListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisiones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyComisiones()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisiones(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComisiones()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisiones();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisiones(Comisiones comisiones)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisiones(Comisiones comisiones,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisiones()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisiones()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisiones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisiones()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisiones()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisiones()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisiones(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisiones()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public ComisionesBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionesBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionesBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisionesSessionBean=new ComisionesSessionBean(); 
		this.comisionesConstantesFunciones=new ComisionesConstantesFunciones(); 
		this.comisionesBean=new Comisiones();//(this.comisionesConstantesFunciones); 		
		this.comisionesReturnGeneral=new ComisionesParameterReturnGeneral(); 
		
		this.comisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionesBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisiones(true);
			
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
			
			this.comisionesConstantesFunciones=new ComisionesConstantesFunciones(); 
			this.comisionesBean=new Comisiones();//this.comisionesConstantesFunciones); 			
			this.comisionesReturnGeneral=new ComisionesParameterReturnGeneral(); 
		
			ComisionesBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comisiones Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.comisiones=new Comisiones();
			this.comisioness = new ArrayList<Comisiones>();
			this.comisionessAux = new ArrayList<Comisiones>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic=new ComisionesLogic();
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			//this.comisionesSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisionesSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisiones);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisiones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisiones);	
					}
					
					if(this.jInternalFrameImportacionComisiones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisiones);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisiones!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisiones);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisiones!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisiones);
				this.jInternalFrameDetalleFormComisiones.setVisible(false);
				this.jInternalFrameDetalleFormComisiones.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisiones!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisiones);
					this.jInternalFrameReporteDinamicoComisiones.setVisible(false);
					this.jInternalFrameReporteDinamicoComisiones.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisiones!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisiones);
					this.jInternalFrameImportacionComisiones.setVisible(false);
					this.jInternalFrameImportacionComisiones.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisiones!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisiones);
					this.jInternalFrameOrderByComisiones.setVisible(false);
					this.jInternalFrameOrderByComisiones.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionesActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionesConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisionesReturnGeneral=new ComisionesParameterReturnGeneral();
			
			this.comisionesParameterGeneral=new ComisionesParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisionesLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionesJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionesSessionBean.getEsGuardarRelacionado(),this.comisionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionesConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionesSessionBean.getEsGuardarRelacionado(),this.comisionesSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaDuplicarComisiones=true;
			this.isVisibilidadCeldaCopiarComisiones=true;
			this.isVisibilidadCeldaVerFormComisiones=true;
			this.isVisibilidadCeldaOrdenComisiones=true;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
			this.isVisibilidadCeldaModificarComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=false;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=false;
			this.isVisibilidadCeldaGuardarComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisiones();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisiones(false);
			
			this.setPermisosUsuarioComisiones();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionesSessionBean.getEsGuardarRelacionado() 
				|| (this.comisionesSessionBean.getEsGuardarRelacionado() && this.comisionesSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionesClasesRelacionadas();
			}
			
			if(this.comisionesSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionesClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisiones();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisiones();
			}
			
			if(!this.isPermisoBusquedaComisiones) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisiones,this.isPermisoPaginacionMedioComisiones,this.isPermisoPaginacionTodoComisiones);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionesConstantesFunciones.getTiposSeleccionarComisiones());
				
				this.tiposColumnasSelect=ComisionesConstantesFunciones.getTiposSeleccionarComisiones(true);
				
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
			//if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisiones();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioComisiones(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioComisiones(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisiones() ;
			
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
				comisionesImplementable= (ComisionesImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisionesImplementableHome= (ComisionesImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionesConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisioness= new ArrayList<Comisiones>();
			this.comisionessEliminados= new ArrayList<Comisiones>();
						
			this.isEsNuevoComisiones=false;
			this.esParaAccionDesdeFormularioComisiones=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisiones(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisiones();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionesBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionesConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisiones("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisiones(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisiones!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisiones();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisiones();
			}
			
			ComisionesBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisiones(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Comisiones: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisiones() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisiones")) {
				iIndex=this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisiones.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisiones();	
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
	
	public void cargarCombosForeignKeyComisiones(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisiones(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisiones(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionesListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisiones();
		
		this.cargarCombosFrameForeignKeyComisiones();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisiones();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisiones();
		}
	}
	
	
	
	public void jButtonNuevoComisionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisionesSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			
			if(jTableDatosComisiones.getRowCount()>=1) {
				jTableDatosComisiones.removeRowSelectionInterval(0, jTableDatosComisiones.getRowCount()-1);						
			}
			
			this.isEsNuevoComisiones=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisiones(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisiones(true);			
			//this.comisiones=new Comisiones();
			//this.comisiones.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisiones(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisiones() ;
			
			if(ComisionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisiones(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisiones);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisiones);				
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			if(this.comisionesSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Comisiones: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionesActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisiones.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisiones.getSelectedRows().length;			
			}
			
			comisionessSeleccionados=this.getComisionessSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisiones--;			
				//Comisiones comisionesAux= new Comisiones();			
				//comisionesAux.setId(this.iIdNuevoComisiones);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Comisiones comisionesOrigen=new Comisiones();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Comisiones comisionesOrigen : comisionessSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisionesOrigen =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionesOrigen =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisiones();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisiones.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisiones(comisionesOrigen,this.comisiones,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionesLogic.getComisioness().add(this.comisionesAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisioness.add(this.comisionesAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisiones(false);
				
				this.jTableDatosComisiones.setRowSelectionInterval(this.getIndiceNuevoComisiones(), this.getIndiceNuevoComisiones());
				
				int iLastRow =  this.jTableDatosComisiones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisiones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisiones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisiones(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();									
		
			Comisiones comisionesOrigen=new Comisiones();
			Comisiones comisionesDestino=new Comisiones();
				
			comisionessSeleccionados=this.getComisionessSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisiones.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisionessSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisiones.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionesOrigen =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionesOrigen =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionesDestino =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionesDestino =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisionesOrigen =comisionessSeleccionados.get(0);
				comisionesDestino =comisionessSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisiones(comisionesOrigen,comisionesDestino,true,false);
				
				comisionesDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionesDestino,comisionesLogic.getComisioness());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionesDestino,comisioness);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisiones(false);
				
				//this.jTableDatosComisiones.setRowSelectionInterval(this.getIndiceNuevoComisiones(), this.getIndiceNuevoComisiones());
				
				int iLastRow =  this.jTableDatosComisiones.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisiones.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisiones.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisiones(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisiones.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisiones.isVisible();
			
			
			this.jPanelParametrosReportesComisiones.setVisible(!isVisible);
			this.jPanelPaginacionComisiones.setVisible(!isVisible);
			this.jPanelAccionesComisiones.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisiones();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisiones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisiones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisiones();
			
			this.abrirFrameOrderByComisiones();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisiones();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisiones(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisiones);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisiones.isMaximum()) {
					this.jInternalFrameDetalleFormComisiones.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisiones.setSize(this.jInternalFrameDetalleFormComisiones.iWidthFormulario,this.jInternalFrameDetalleFormComisiones.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisiones.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisiones.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisiones.isMaximum()) {
						this.jInternalFrameDetalleFormComisiones.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisiones.jContentPaneDetalleComisiones.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisiones.jContentPaneDetalleComisiones.getWidth(),ComisionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisiones.jContentPaneDetalleComisiones.getWidth(),ComisionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisiones.jContentPaneDetalleComisiones.getWidth(),ComisionesConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisiones.setVisible(true);
	        this.jInternalFrameDetalleFormComisiones.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisiones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisiones==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisiones,false,this);
				} else {
					this.jInternalFrameOrderByComisiones=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisiones,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisiones);
				this.jInternalFrameOrderByComisiones.setVisible(false);
				this.jInternalFrameOrderByComisiones.setSelected(false);
				
				this.jInternalFrameOrderByComisiones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisiones"));
				
				this.inicializarActualizarBindingTablaOrderByComisiones();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisiones() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisiones==null) {
				
				this.jInternalFrameImportacionComisiones=new ImportacionJInternalFrame(ComisionesConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisiones);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisiones);
				this.jInternalFrameImportacionComisiones.setVisible(false);
				this.jInternalFrameImportacionComisiones.setSelected(false);


				this.jInternalFrameImportacionComisiones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisiones"));
				this.jInternalFrameImportacionComisiones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisiones"));
				this.jInternalFrameImportacionComisiones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisiones"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisiones() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisiones==null) {
				this.jInternalFrameReporteDinamicoComisiones=new ReporteDinamicoJInternalFrame(ComisionesConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisiones);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisiones);
				this.jInternalFrameReporteDinamicoComisiones.setVisible(false);
				this.jInternalFrameReporteDinamicoComisiones.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisiones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisiones"));
				this.jInternalFrameReporteDinamicoComisiones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisiones"));
				this.jInternalFrameReporteDinamicoComisiones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisiones"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisiones();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisiones() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisiones);
			
	       	this.jInternalFrameDetalleFormComisiones.setVisible(false);
	        this.jInternalFrameDetalleFormComisiones.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisiones.dispose();
			//this.jInternalFrameDetalleFormComisiones=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisiones() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisiones.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisiones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisiones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisiones.setVisible(true);
	        this.jInternalFrameImportacionComisiones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisiones() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisiones.setVisible(true);
	        this.jInternalFrameOrderByComisiones.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisiones() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisiones.setVisible(false);
	        this.jInternalFrameOrderByComisiones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisiones() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisiones.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisiones.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisiones() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisiones.setVisible(false);
	        this.jInternalFrameImportacionComisiones.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisiones(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisiones(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisiones(true);
			//this.isEsNuevoComisiones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisiones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisiones(false) ;
			
			if(comisionesSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisiones(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisiones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionesActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisiones(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisiones(true);
			//this.isEsNuevoComisiones=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisiones.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisiones("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisiones(false) ;
			
			if(ComisionesJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisiones(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisiones(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisiones(false);
			
			//if(!this.isEsNuevoComisiones) {								
				int intSelectedRow = this.jTableDatosComisiones.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
				
			}
			
			if(this.permiteMantenimiento(this.comisiones)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisiones=true;
					this.inicializarActualizarBindingTablaComisiones(false);
					this.isEsNuevoComisiones=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisiones=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisiones=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisiones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisiones(false);
				
				this.habilitarDeshabilitarControlesComisiones(false);
			
												
				
				if(ComisionesJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisiones();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionesActionPerformed(evt,comisionesSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisiones(this.comisiones,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisiones.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisionesSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisiones.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionesActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisiones.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				this.comisiones.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				this.comisiones.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisiones)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionesSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionesModel) this.jTableDatosComisiones.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisiones=true;
				this.inicializarActualizarBindingTablaComisiones(false);
				this.isEsNuevoComisiones=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisiones(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisiones(false);
				
				this.habilitarDeshabilitarControlesComisiones(false);
				
				
				
				if(ComisionesJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisiones();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionesActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisiones.getRowCount()>=1) {
				jTableDatosComisiones.removeRowSelectionInterval(0, jTableDatosComisiones.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisiones(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisiones(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisiones(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisiones(false) ;
			
			this.isEsNuevoComisiones=false;
			
			if(ComisionesJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisiones();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisiones(false);
				
				//SI ES MANUAL
				if(ComisionesJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisiones();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisiones--;			
			//Comisiones comisionesAux= new Comisiones();			
			//comisionesAux.setId(this.iIdNuevoComisiones);
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisiones();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
			
			this.comisiones.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisionesLogic.getComisioness().add(this.comisionesAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisioness.add(this.comisionesAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisiones(false);
			
			this.jTableDatosComisiones.setRowSelectionInterval(this.getIndiceNuevoComisiones(), this.getIndiceNuevoComisiones());
			
			int iLastRow =  this.jTableDatosComisiones.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisiones.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisiones.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisiones(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisiones(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisiones(false);
			
			//SI ES MANUAL
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisiones();
			}
			
			//this.abrirFrameTreeComisiones();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ComisionesES ?", "MANTENIMIENTO DE Comisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisiones.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisiones();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisionesReturnGeneral=comisionesLogic.procesarImportacionComisionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisionesParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionesReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionesActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisiones.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisiones.setFileImportacion(this.jInternalFrameImportacionComisiones.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisiones.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisiones.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisiones.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisiones.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionesActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		

		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionesBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionesBaseDesign.jrxml";
			
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
			
			this.generarReporteComisioness("Todos",comisionessSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionesConstantesFunciones.LABEL_CODIGO:
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
		
		if(this.jInternalFrameReporteDinamicoComisiones.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionesConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisiones.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisiones.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionesConstantesFunciones.LABEL_CODIGO:
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionesActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Comisioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionesConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionesConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Comisiones comisiones:comisionessSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisiones.getcodigo());
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
			//	this.getFilaCabeceraExportarExcelComisiones(row);				
			//	iRow++;
			//}				
			
			//for(Comisiones comisionesAux:comisionessSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisiones(comisionesAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisiones(false);
			
			//SI ES MANUAL
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisiones();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisiones(false);
			
			//SI ES MANUAL
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisiones();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionesActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisiones(false);
			
			//SI ES MANUAL
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisiones();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionesLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisiones() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisiones.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisiones.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisiones.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisiones.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisiones.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisiones.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisiones.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisiones(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisiones(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisiones(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisiones(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisiones(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisiones(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisiones(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisiones(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionesJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisiones() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisiones();
		
		this.inicializarActualizarBindingBotonesManualComisiones(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisiones();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisiones() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisiones(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisiones(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisiones.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisiones.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisiones.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisiones!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisiones.jCheckBoxPostAccionNuevoComisiones.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisiones.jCheckBoxPostAccionSinCerrarComisiones.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisiones.jCheckBoxPostAccionSinMensajeComisiones.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisiones.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisiones.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisiones.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisiones!=null) {
				this.jInternalFrameDetalleFormComisiones.jCheckBoxPostAccionNuevoComisiones.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisiones.jCheckBoxPostAccionSinCerrarComisiones.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisiones.jCheckBoxPostAccionSinMensajeComisiones.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisiones.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisiones.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisiones.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisiones!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisiones.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisiones.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisiones.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisiones.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisiones!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisiones.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisiones.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisiones(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisiones(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisiones() throws Exception {
		try	{
			if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisiones();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisiones() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisiones() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisiones.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisiones.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisiones.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisiones.addItem(reporte);
			}
			
			
			if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisiones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisiones.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisiones.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisiones.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisiones.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisiones.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisiones.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisiones();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisiones() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisiones!=null) {
				this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisiones!=null) {
				this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisiones.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisiones!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisiones.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisiones.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisiones.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisiones.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisiones()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisiones(Boolean esInicializar) throws Exception {				
		if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisiones();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisiones() throws Exception {
		this.inicializarActualizarBindingTablaComisiones(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisiones() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionesPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionesOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionesOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionesPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionesPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisiones(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisionesLogic.getComisioness().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisioness.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisiones.setModel(new ComisionesModel(this.comisionesLogic.getComisioness(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisiones.setModel(new ComisionesModel(this.comisioness,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisiones!=null && this.jInternalFrameOrderByComisiones.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisiones();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisiones,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionesPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionesConstantesFunciones.SCLASSWEBTITULO,comisionesConstantesFunciones.resaltarSeleccionarComisiones,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionesConstantesFunciones.SCLASSWEBTITULO,comisionesConstantesFunciones.resaltarSeleccionarComisiones,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisiones,ComisionesConstantesFunciones.LABEL_ID));

		if(this.comisionesConstantesFunciones.mostraridComisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionesConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionesConstantesFunciones.resaltaridComisiones,this.comisionesConstantesFunciones.activaridComisiones,this,true,"idComisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionesConstantesFunciones.resaltaridComisiones,this.comisionesConstantesFunciones.activaridComisiones,this,true,"idComisiones","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisiones,ComisionesConstantesFunciones.LABEL_CODIGO));

		if(this.comisionesConstantesFunciones.mostrarcodigoComisiones && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionesConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionesConstantesFunciones.resaltarcodigoComisiones,this.comisionesConstantesFunciones.activarcodigoComisiones,this,true,"codigoComisiones","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionesConstantesFunciones.resaltarcodigoComisiones,this.comisionesConstantesFunciones.activarcodigoComisiones,this,true,"codigoComisiones","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionesPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisionesSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionesSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisiones.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionesSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionesSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisiones.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisiones && this.isPermisoGuardarCambiosComisiones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisionesSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisionesSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisiones.addColumn(tableColumn);
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
			
			this.jTableDatosComisiones.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisiones && this.isPermisoGuardarCambiosComisiones) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisiones && this.isPermisoGuardarCambiosComisiones) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisiones.moveColumn(this.jTableDatosComisiones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisiones.moveColumn(this.jTableDatosComisiones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisiones.moveColumn(this.jTableDatosComisiones.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisiones.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisiones.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisiones,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisiones.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisiones.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisiones.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisiones.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisiones.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisionesLogic.getComisioness().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisioness.size()-1;
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
		//this.jTableDatosComisiones.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisiones.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisiones();
			
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
				
				//this.isEsNuevoComisiones=false;
					
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
				if(this.comisionesSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisiones==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisiones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisiones.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisiones.getsType().equals("DUPLICADO")
				   || this.comisiones.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisiones=true;
				
				} else {
					this.isEsNuevoComisiones=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisionesSessionBean.getEsGuardarRelacionado()) {
					if(this.comisiones.getId()>=0 && !this.comisiones.getIsNew()) {						
						this.isEsNuevoComisiones=false;
						
					} else {
						this.isEsNuevoComisiones=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisiones(esRelaciones);						
				
				this.seleccionarComisiones(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisiones.getId()<0) {
					this.isEsNuevoComisiones=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisiones(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisiones(evt,rowIndex);
				}	
				
				if(this.comisionesSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Comisiones: " + this.dDif); 
					}
				}								
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisiones(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisiones)) {
					if(this.comisiones.getId()>0) {
						this.comisiones.setIsDeleted(true);
						
						this.comisionessEliminados.add(this.comisiones);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionesLogic.getComisioness().remove(this.comisiones);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisioness.remove(this.comisiones);				
					}
					
					
					((ComisionesModel) this.jTableDatosComisiones.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisiones(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisiones(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisiones) {
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisiones.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisiones.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisiones(this.comisiones);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisiones("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisiones(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisiones() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisiones(Comisiones comisiones) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisiones(comisiones,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisiones(Comisiones comisiones,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisiones(comisiones);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisiones(comisiones,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisiones(comisiones);
	}
	
	public void setVariablesObjetoActualToFormularioComisiones(Comisiones comisiones) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setText(comisiones.getId().toString());
			this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setText(comisiones.getcodigo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Comisiones comisionesLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisionesLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Comisiones comisionesLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisionesLocal=this.comisiones;
			} else {
				comisionesLocal=this.comisionesAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisionesLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisiones(comisionesLocal,true);
					
					if(comisionesSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisionesLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisionesLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisiones(Comisiones comisiones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisiones(comisiones,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisiones(comisiones);
	}
	
	public void setVariablesFormularioToObjetoActualComisiones(Comisiones comisiones,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisiones(comisiones,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisiones(Comisiones comisiones,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.getText()==null || this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.getText()=="" || this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.getText()=="Id") {
				this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setText("0");
			}

			if(conColumnasBase) {comisiones.setId(Long.parseLong(this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionesConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisiones.jLabelIdComisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisiones.setcodigo(this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionesConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisiones.jLabelcodigoComisiones,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisiones(Comisiones comisionesBean,Comisiones comisiones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisiones(Comisiones comisionesOrigen,Comisiones comisiones,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionesOrigen.getId()!=null && !comisionesOrigen.getId().equals(0L))) {comisiones.setId(comisionesOrigen.getId());}}
			if(conDefault || (!conDefault && comisionesOrigen.getcodigo()!=null && !comisionesOrigen.getcodigo().equals(""))) {comisiones.setcodigo(comisionesOrigen.getcodigo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisiones(Comisiones comisiones) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setText(comisiones.getId().toString());
			this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setText(comisiones.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisiones(ComisionesBean comisionesBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setText(comisionesBean.getId().toString());
			this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setText(comisionesBean.getcodigo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisiones(ComisionesParameterReturnGeneral comisionesReturnGeneral,ComisionesBean comisionesBean,Boolean conDefault) throws Exception { 
		try {
			Comisiones comisionesLocal=new Comisiones();
			
			comisionesLocal=comisionesReturnGeneral.getComisiones();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionesLocal.getId()!=null && !comisionesLocal.getId().equals(0L))) {comisionesBean.setId(comisionesLocal.getId());}}
			if(conDefault || (!conDefault && comisionesLocal.getcodigo()!=null && !comisionesLocal.getcodigo().equals(""))) {comisionesBean.setcodigo(comisionesLocal.getcodigo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionesGenerico(Long idComisionesSeleccionado,JComboBox jComboBoxComisiones,List<Comisiones> comisionessLocal)throws Exception {
		try {
			Comisiones  comisionesTemp=null;

			for(Comisiones comisionesAux:comisionessLocal) {
				if(comisionesAux.getId()!=null && comisionesAux.getId().equals(idComisionesSeleccionado)) {
					comisionesTemp=comisionesAux;
					break;
				}
			}

			jComboBoxComisiones.setSelectedItem(comisionesTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionesGenerico(JComboBox jComboBoxComisiones,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisiones.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisiones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisiones.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisiones.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisiones.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisiones.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisiones=(Comisiones) comisionesLogic.getComisioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisiones =(Comisiones) comisioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Comisiones comisionesRow=new Comisiones();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionesRow=(Comisiones) comisionesLogic.getComisioness().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionesRow=(Comisiones) comisioness.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisiones(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisiones.setVisible((this.isVisibilidadCeldaNuevoComisiones && this.isPermisoNuevoComisiones));			
			this.jButtonDuplicarComisiones.setVisible((this.isVisibilidadCeldaDuplicarComisiones && this.isPermisoDuplicarComisiones));			
			this.jButtonCopiarComisiones.setVisible((this.isVisibilidadCeldaCopiarComisiones && this.isPermisoCopiarComisiones));
			this.jButtonVerFormComisiones.setVisible((this.isVisibilidadCeldaVerFormComisiones && this.isPermisoVerFormComisiones));
			
			this.jButtonAbrirOrderByComisiones.setVisible((this.isVisibilidadCeldaOrdenComisiones && this.isPermisoOrdenComisiones));			
			
			this.jButtonNuevoRelacionesComisiones.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisiones && this.isPermisoNuevoComisiones));			
			this.jButtonNuevoGuardarCambiosComisiones.setVisible((this.isVisibilidadCeldaNuevoComisiones && this.isPermisoNuevoComisiones && this.isPermisoGuardarCambiosComisiones));
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.jInternalFrameDetalleFormComisiones.jButtonModificarComisiones.setVisible((this.isVisibilidadCeldaModificarComisiones && this.isPermisoActualizarComisiones));	
			this.jInternalFrameDetalleFormComisiones.jButtonActualizarComisiones.setVisible((this.isVisibilidadCeldaActualizarComisiones && this.isPermisoActualizarComisiones));	
			this.jInternalFrameDetalleFormComisiones.jButtonEliminarComisiones.setVisible((this.isVisibilidadCeldaEliminarComisiones && this.isPermisoEliminarComisiones));
			this.jInternalFrameDetalleFormComisiones.jButtonCancelarComisiones.setVisible(this.isVisibilidadCeldaCancelarComisiones);							
			this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.setVisible((this.isVisibilidadCeldaGuardarComisiones && this.isPermisoGuardarCambiosComisiones));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisiones.setVisible((this.isVisibilidadCeldaGuardarCambiosComisiones && this.isPermisoGuardarCambiosComisiones));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisiones.setVisible((this.isVisibilidadCeldaNuevoComisiones && this.isPermisoNuevoComisiones));						
			this.jButtonDuplicarToolBarComisiones.setVisible((this.isVisibilidadCeldaDuplicarComisiones && this.isPermisoDuplicarComisiones));						
			this.jButtonCopiarToolBarComisiones.setVisible((this.isVisibilidadCeldaCopiarComisiones && this.isPermisoCopiarComisiones));			
			this.jButtonVerFormToolBarComisiones.setVisible((this.isVisibilidadCeldaVerFormComisiones && this.isPermisoVerFormComisiones));			
			this.jButtonAbrirOrderByToolBarComisiones.setVisible((this.isVisibilidadCeldaOrdenComisiones && this.isPermisoOrdenComisiones));
			this.jButtonNuevoRelacionesToolBarComisiones.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisiones && this.isPermisoNuevoComisiones));			
			this.jButtonNuevoGuardarCambiosToolBarComisiones.setVisible((this.isVisibilidadCeldaNuevoComisiones && this.isPermisoNuevoComisiones && this.isPermisoGuardarCambiosComisiones));			
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.jInternalFrameDetalleFormComisiones.jButtonModificarToolBarComisiones.setVisible((this.isVisibilidadCeldaModificarComisiones && this.isPermisoActualizarComisiones));	
			this.jInternalFrameDetalleFormComisiones.jButtonActualizarToolBarComisiones.setVisible((this.isVisibilidadCeldaActualizarComisiones  && this.isPermisoActualizarComisiones));	
			this.jInternalFrameDetalleFormComisiones.jButtonEliminarToolBarComisiones.setVisible((this.isVisibilidadCeldaEliminarComisiones && this.isPermisoEliminarComisiones));
			this.jInternalFrameDetalleFormComisiones.jButtonCancelarToolBarComisiones.setVisible(this.isVisibilidadCeldaCancelarComisiones);				
			this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosToolBarComisiones.setVisible((this.isVisibilidadCeldaGuardarComisiones && this.isPermisoGuardarCambiosComisiones));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisiones.setVisible((this.isVisibilidadCeldaGuardarCambiosComisiones && this.isPermisoGuardarCambiosComisiones));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisiones.setVisible((this.isVisibilidadCeldaNuevoComisiones && this.isPermisoNuevoComisiones));			
			this.jMenuItemDuplicarComisiones.setVisible((this.isVisibilidadCeldaDuplicarComisiones && this.isPermisoDuplicarComisiones));			
			this.jMenuItemCopiarComisiones.setVisible((this.isVisibilidadCeldaCopiarComisiones && this.isPermisoCopiarComisiones));			
			this.jMenuItemVerFormComisiones.setVisible((this.isVisibilidadCeldaVerFormComisiones && this.isPermisoVerFormComisiones));			
			this.jMenuItemAbrirOrderByComisiones.setVisible((this.isVisibilidadCeldaOrdenComisiones && this.isPermisoOrdenComisiones));			
			//this.jMenuItemMostrarOcultarComisiones.setVisible((this.isVisibilidadCeldaOrdenComisiones && this.isPermisoOrdenComisiones));
			this.jMenuItemDetalleAbrirOrderByComisiones.setVisible((this.isVisibilidadCeldaOrdenComisiones && this.isPermisoOrdenComisiones));			
			//this.jMenuItemDetalleMostrarOcultarComisiones.setVisible((this.isVisibilidadCeldaOrdenComisiones && this.isPermisoOrdenComisiones));			
			this.jMenuItemNuevoRelacionesComisiones.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisiones && this.isPermisoNuevoComisiones));			
			this.jMenuItemNuevoGuardarCambiosComisiones.setVisible((this.isVisibilidadCeldaNuevoComisiones && this.isPermisoNuevoComisiones && this.isPermisoGuardarCambiosComisiones));									
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.jInternalFrameDetalleFormComisiones.jMenuItemModificarComisiones.setVisible((this.isVisibilidadCeldaModificarComisiones && this.isPermisoActualizarComisiones));	
			this.jInternalFrameDetalleFormComisiones.jMenuItemActualizarComisiones.setVisible((this.isVisibilidadCeldaActualizarComisiones && this.isPermisoActualizarComisiones));	
			this.jInternalFrameDetalleFormComisiones.jMenuItemEliminarComisiones.setVisible((this.isVisibilidadCeldaEliminarComisiones && this.isPermisoEliminarComisiones));
			this.jInternalFrameDetalleFormComisiones.jMenuItemCancelarComisiones.setVisible(this.isVisibilidadCeldaCancelarComisiones);				
			}
			
			this.jMenuItemGuardarCambiosComisiones.setVisible((this.isVisibilidadCeldaGuardarComisiones && this.isPermisoGuardarCambiosComisiones));						
			this.jMenuItemGuardarCambiosTablaComisiones.setVisible((this.isVisibilidadCeldaGuardarCambiosComisiones && this.isPermisoGuardarCambiosComisiones));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisiones=this.jButtonNuevoComisiones.isVisible();
			this.isVisibilidadCeldaDuplicarComisiones=this.jButtonDuplicarComisiones.isVisible();
			this.isVisibilidadCeldaCopiarComisiones=this.jButtonCopiarComisiones.isVisible();
			this.isVisibilidadCeldaVerFormComisiones=this.jButtonVerFormComisiones.isVisible();
			
			this.isVisibilidadCeldaOrdenComisiones=this.jButtonAbrirOrderByComisiones.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisiones=this.jButtonNuevoRelacionesComisiones.isVisible();
			this.isVisibilidadCeldaModificarComisiones=this.jButtonModificarComisiones.isVisible();
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.isVisibilidadCeldaActualizarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonActualizarComisiones.isVisible();
			this.isVisibilidadCeldaEliminarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonEliminarComisiones.isVisible();
			this.isVisibilidadCeldaCancelarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonCancelarComisiones.isVisible();
			this.isVisibilidadCeldaGuardarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisiones=this.jButtonGuardarCambiosTablaComisiones.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisiones=this.jButtonNuevoToolBarComisiones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisiones=this.jButtonNuevoRelacionesToolBarComisiones.isVisible();
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.isVisibilidadCeldaModificarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonModificarToolBarComisiones.isVisible();
			this.isVisibilidadCeldaActualizarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonActualizarToolBarComisiones.isVisible();
			this.isVisibilidadCeldaEliminarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonEliminarToolBarComisiones.isVisible();
			this.isVisibilidadCeldaCancelarComisiones=this.jInternalFrameDetalleFormComisiones.jButtonCancelarToolBarComisiones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisiones=this.jButtonGuardarCambiosToolBarComisiones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisiones=this.jButtonGuardarCambiosTablaToolBarComisiones.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisiones=this.jMenuItemNuevoComisiones.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisiones=this.jMenuItemNuevoRelacionesComisiones.isVisible();
			
			if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.isVisibilidadCeldaModificarComisiones=this.jInternalFrameDetalleFormComisiones.jMenuItemModificarComisiones.isVisible();
			this.isVisibilidadCeldaActualizarComisiones=this.jInternalFrameDetalleFormComisiones.jMenuItemActualizarComisiones.isVisible();
			this.isVisibilidadCeldaEliminarComisiones=this.jInternalFrameDetalleFormComisiones.jMenuItemEliminarComisiones.isVisible();
			this.isVisibilidadCeldaCancelarComisiones=this.jInternalFrameDetalleFormComisiones.jMenuItemCancelarComisiones.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisiones=this.jMenuItemGuardarCambiosComisiones.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisiones=this.jMenuItemGuardarCambiosTablaComisiones.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisiones(Boolean esInicializar) {
		if(ComisionesJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisionesSessionBean.getConGuardarRelaciones()) {
				//if(this.comisionesSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisiones();
			}
			
			this.inicializarActualizarBindingBotonesManualComisiones(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisiones() {
		this.jButtonNuevoComisiones.setVisible(this.isPermisoNuevoComisiones);			
		this.jButtonDuplicarComisiones.setVisible(this.isPermisoDuplicarComisiones);			
		this.jButtonCopiarComisiones.setVisible(this.isPermisoCopiarComisiones);			
		this.jButtonVerFormComisiones.setVisible(this.isPermisoVerFormComisiones);			
		
		this.jButtonAbrirOrderByComisiones.setVisible(this.isPermisoOrdenComisiones);					
		
		this.jButtonNuevoRelacionesComisiones.setVisible(this.isPermisoNuevoComisiones);			
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonModificarComisiones.setVisible(this.isPermisoActualizarComisiones);	
			this.jInternalFrameDetalleFormComisiones.jButtonActualizarComisiones.setVisible(this.isPermisoActualizarComisiones);	
			this.jInternalFrameDetalleFormComisiones.jButtonEliminarComisiones.setVisible(this.isPermisoEliminarComisiones);
			this.jInternalFrameDetalleFormComisiones.jButtonCancelarComisiones.setVisible(this.isVisibilidadCeldaCancelarComisiones);						
			this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.setVisible(this.isPermisoGuardarCambiosComisiones);							
		}
		
		this.jButtonGuardarCambiosTablaComisiones.setVisible(this.isPermisoActualizarComisiones);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisiones() {
		this.jInternalFrameDetalleFormComisiones.jButtonModificarComisiones.setVisible(this.isPermisoActualizarComisiones);	
		this.jInternalFrameDetalleFormComisiones.jButtonActualizarComisiones.setVisible(this.isPermisoActualizarComisiones);	
		this.jInternalFrameDetalleFormComisiones.jButtonEliminarComisiones.setVisible(this.isPermisoEliminarComisiones);
		this.jInternalFrameDetalleFormComisiones.jButtonCancelarComisiones.setVisible(this.isVisibilidadCeldaCancelarComisiones);							
		this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.setVisible((this.isVisibilidadCeldaGuardarComisiones && this.isPermisoGuardarCambiosComisiones));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisiones() {
		if(ComisionesJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisiones();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisiones() {
	}
	
	public void jTableDatosComisionesListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisiones(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisiones(this.getcomisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiones==null) {
						this.comisiones = new Comisiones();
					}

					this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
				}

				if(this.comisiones.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisiones.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoComisionesBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisiones.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisiones(this.getcomisiones(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisiones==null) {
						this.comisiones = new Comisiones();
					}

					this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);
				}

				if(this.comisiones.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.comisiones.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisiones(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameComisiones() {
		if(this.jInternalFrameDetalleFormComisiones!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
			this.jInternalFrameDetalleFormComisiones.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisiones.dispose();
			this.jInternalFrameDetalleFormComisiones=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisiones!=null) {
			this.jInternalFrameReporteDinamicoComisiones.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisiones.dispose();
			this.jInternalFrameReporteDinamicoComisiones=null;
		}
		
		if(this.jInternalFrameImportacionComisiones!=null) {
			this.jInternalFrameImportacionComisiones.setVisible(false);	    			
			this.jInternalFrameImportacionComisiones.dispose();
			this.jInternalFrameImportacionComisiones=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisiones();
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisiones")) {
				jButtonDuplicarComisionesActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisiones")) {
				jButtonCopiarComisionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisiones")) {
				jButtonVerFormComisionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisiones")) {
				jButtonDuplicarComisionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisiones")) {
				jButtonDuplicarComisionesActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisiones")) {
				jButtonModificarComisionesActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisiones")) {
				jButtonModificarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisiones")) {
				jButtonModificarComisionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisiones")) {
				jButtonActualizarComisionesActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisiones")) {
				jButtonActualizarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisiones")) {
				jButtonActualizarComisionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisiones")) {
				jButtonEliminarComisionesActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisiones")) {
				jButtonEliminarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisiones")) {
				jButtonEliminarComisionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisiones")) {
				jButtonCancelarComisionesActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisiones")) {
				jButtonCancelarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisiones")) {
				jButtonCancelarComisionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisiones")) {
				jButtonCerrarComisionesActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisiones")) {
				jButtonCerrarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisiones")) {
				jButtonCerrarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisiones")) {
				jButtonMostrarOcultarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisiones")) {
				jButtonCancelarComisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisiones")) {
				jButtonCopiarComisionesActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisiones")) {
				jButtonVerFormComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisiones")) {
				jButtonCopiarComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisiones")) {
				jButtonVerFormComisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisiones")) {
				jButtonRecargarInformacionComisionesActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisiones")) {
				jButtonRecargarInformacionComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisiones")) {
				jButtonRecargarInformacionComisionesActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisiones")) {
				jButtonAnterioresComisionesActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisiones")) {
				jButtonAnterioresComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisiones")) {
				jButtonAnterioresComisionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisiones")) {
				jButtonSiguientesComisionesActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisiones")) {
				jButtonSiguientesComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisiones")) {
				jButtonSiguientesComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisiones") || sTipo.equals("MenuItemDetalleAbrirOrderByComisiones")) {
				jButtonAbrirOrderByComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisiones") || sTipo.equals("MenuItemDetalleMostrarOcultarComisiones")) {
				jButtonMostrarOcultarComisionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisiones")) {
				jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisiones")) {
				jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisiones")) {
				jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisiones")) {
				jButtonCerrarReporteDinamicoComisionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisiones")) {
				jButtonGenerarReporteDinamicoComisionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisiones")) {
				
				jButtonGenerarExcelReporteDinamicoComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisiones")) {
				jButtonCerrarImportacionComisionesActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisiones")) {
				
				jButtonGenerarImportacionComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisiones")) {
				
				jButtonAbrirImportacionComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisiones")) {
				jComboBoxTiposAccionesComisionesActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisiones")) {
				jComboBoxTiposRelacionesComisionesActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisiones")) {
				jComboBoxTiposAccionesComisionesActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisiones")) {
				
				jComboBoxTiposSeleccionarComisionesActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisiones")) {
				jTextFieldValorCampoGeneralComisionesActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisiones")) {
				jButtonAbrirOrderByComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisiones")) {
				jButtonAbrirOrderByComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisiones")) {
				jButtonCerrarOrderByComisionesActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionesBusqueda")) {
				this.jButtonidComisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoComisionesBusqueda")) {
				this.jButtoncodigoComisionesBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisiones();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Comisiones comisionesLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisionesLocal=this.comisiones;
			} else {
				comisionesLocal=this.comisionesAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
							
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
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
			
			


			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
								
						
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
								
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
							
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
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
			
			


			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
								
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisiones")) {
					jCheckBoxSeleccionarTodosComisionesItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisiones")) {
					jCheckBoxSeleccionadosComisionesItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisiones")) {
					
				}
				
				


				
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
												
				
				


				
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
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
			
			


			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionesActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisiones);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisiones);
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
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
				
				


				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Comisiones.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Comisiones.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionesActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionesAnterior =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionesAnterior =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisiones")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisiones.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisiones =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisiones =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisiones);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisiones")) {
				
				}
				
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisiones")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisiones.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisiones")) {
			
			}
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisiones();
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			if(sTipo.equals("NuevoComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisiones")) {
				jButtonDuplicarComisionesActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisiones")) {
				jButtonCopiarComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisiones")) {
				jButtonVerFormComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisiones")) {
				jButtonNuevoComisionesActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisiones")) {
				jButtonModificarComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisiones")) {
				jButtonActualizarComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisiones")) {
				jButtonEliminarComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisiones")) {
				jButtonCancelarComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisiones")) {
				jButtonCerrarComisionesActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisiones")) {
				jButtonGuardarCambiosComisionesActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisiones")) {
				jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisiones")) {
				jButtonAbrirOrderByComisionesActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisiones")) {
				jButtonRecargarInformacionComisionesActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisiones")) {
				jButtonAnterioresComisionesActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisiones")) {
				jButtonSiguientesComisionesActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionesBusqueda")) {
				this.jButtonidComisionesBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoComisionesBusqueda")) {
				this.jButtoncodigoComisionesBusquedaActionPerformed(evt);
			}
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisiones();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisiones")) {
				closingInternalFrameComisiones();
				
			} else if(sTipo.equals("jButtonCancelarComisiones")) {
				JInternalFrameBase jInternalFrameDetalleFormComisiones = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionesBeanSwingJInternalFrame jInternalFrameParent=(ComisionesBeanSwingJInternalFrame)jInternalFrameDetalleFormComisiones.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionesActionPerformed(null);
			}
			
			ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisiones,new Object(),this.comisionesParameterGeneral,this.comisionesReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisiones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisiones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisiones(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisiones)) {
			if(!esControlTabla) {
				if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);			
				}
				
				if(this.comisionesSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisiones(this.comisiones,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisiones(this.comisionesReturnGeneral,this.comisionesBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisionesSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisiones(classes,this.comisionesReturnGeneral,this.comisionesBean,false);
					}
						
					if(this.comisionesReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisiones(this.comisionesReturnGeneral.getComisiones());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisiones(this.comisionesReturnGeneral.getComisiones());	
					}
						
					if(this.comisionesReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisiones(this.comisionesReturnGeneral.getComisiones(),classes);//this.comisionesBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisiones(this.comisiones,classes);//this.comisionesBean);									
				}
			
				if(ComisionesJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisiones(this.comisiones,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisiones(this.comisiones);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisionesAnterior!=null) {
						this.comisiones=this.comisionesAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionesSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionesSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisionesReturnGeneral.getComisiones(),comisionesLogic.getComisioness());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisionesReturnGeneral.getComisiones(),this.comisioness);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisiones.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisiones.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisiones();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisiones() throws Exception {
		
		ComisionesModel comisionesModel=(ComisionesModel)this.jTableDatosComisiones.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionesModel.comisioness=this.comisionesLogic.getComisioness();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisionesModel.comisioness=this.comisioness;
		}
		
		
		((ComisionesModel) this.jTableDatosComisiones.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisiones() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisionesAnterior(),this.comisionesLogic.getComisioness());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisionesAnterior(),this.comisioness);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisiones();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisiones(Comisiones comisiones,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
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
										
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisiones,new Object(),generalEntityParameterGeneral,this.comisionesReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisionesSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionesConstantesFunciones.getClassesRelationshipsOfComisiones(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionesConstantesFunciones.getClassesRelationshipsFromStringsOfComisiones(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisiones(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionesBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisiones,new Object(),generalEntityParameterGeneral,this.comisionesReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisiones(ComisionesBean comisionesBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisiones(ArrayList<Classe> classes,ComisionesReturnGeneral comisionesReturnGeneral,ComisionesBean comisionesBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisiones(Comisiones comisiones,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisiones)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisiones = new ComisionesDetalleFormJInternalFrame(jDesktopPane,this.comisionesSessionBean.getConGuardarRelaciones(),this.comisionesSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisiones);
		this.jInternalFrameDetalleFormComisiones.setVisible(false);
		this.jInternalFrameDetalleFormComisiones.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisiones.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisiones.comisionesLogic=this.comisionesLogic;
		
		this.cargarCombosFrameForeignKeyComisiones("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisiones();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisiones();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisiones("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisiones();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisiones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisiones"));
		
		this.jInternalFrameDetalleFormComisiones.jButtonModificarComisiones.addActionListener(new ButtonActionListener(this,"ModificarComisiones"));

		
		this.jInternalFrameDetalleFormComisiones.jButtonModificarToolBarComisiones.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisiones"));
					
		this.jInternalFrameDetalleFormComisiones.jMenuItemModificarComisiones.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisiones"));		
		
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonActualizarComisiones.addActionListener (new ButtonActionListener(this,"ActualizarComisiones"));
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonActualizarToolBarComisiones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisiones"));
						
		this.jInternalFrameDetalleFormComisiones.jMenuItemActualizarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisiones"));		
		
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonEliminarComisiones.addActionListener (new ButtonActionListener(this,"EliminarComisiones"));
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonEliminarToolBarComisiones.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisiones"));
								
		this.jInternalFrameDetalleFormComisiones.jMenuItemEliminarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisiones"));		
		
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonCancelarComisiones.addActionListener (new ButtonActionListener(this,"CancelarComisiones"));
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonCancelarToolBarComisiones.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisiones"));
					
		this.jInternalFrameDetalleFormComisiones.jMenuItemCancelarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisiones"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisiones.jMenuItemDetalleCerrarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisiones"));		
		
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosToolBarComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisiones"));
		
		
		
		this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosToolBarComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisiones"));
		
		
		
		this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisiones"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisiones.jButtonidComisionesBusqueda.addActionListener(new ButtonActionListener(this,"idComisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisiones.jButtoncodigoComisionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoComisionesBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisiones"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisiones"));
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisiones"));
		}
		
		this.jTableDatosComisiones.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisiones"));
		
		this.jTableDatosComisiones.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisiones"));
		
		this.jButtonNuevoComisiones.addActionListener(new ButtonActionListener(this,"NuevoComisiones"));
		
		this.jButtonDuplicarComisiones.addActionListener(new ButtonActionListener(this,"DuplicarComisiones"));
		
		this.jButtonCopiarComisiones.addActionListener(new ButtonActionListener(this,"CopiarComisiones"));
		
		this.jButtonVerFormComisiones.addActionListener(new ButtonActionListener(this,"VerFormComisiones"));
		
		
		this.jButtonNuevoToolBarComisiones.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisiones"));
			
		this.jButtonDuplicarToolBarComisiones.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisiones"));
			
		this.jMenuItemNuevoComisiones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisiones"));
			
		this.jMenuItemDuplicarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisiones"));		
		
		
		this.jButtonNuevoRelacionesComisiones.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisiones"));
		
		
		this.jButtonNuevoRelacionesToolBarComisiones.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisiones"));
			
		this.jMenuItemNuevoRelacionesComisiones.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisiones"));		
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonModificarComisiones.addActionListener(new ButtonActionListener(this,"ModificarComisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonModificarToolBarComisiones.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisiones"));
			
			this.jInternalFrameDetalleFormComisiones.jMenuItemModificarComisiones.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisiones.jButtonActualizarComisiones.addActionListener (new ButtonActionListener(this,"ActualizarComisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonActualizarToolBarComisiones.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisiones"));
				
			this.jInternalFrameDetalleFormComisiones.jMenuItemActualizarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonEliminarComisiones.addActionListener (new ButtonActionListener(this,"EliminarComisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonEliminarToolBarComisiones.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisiones"));
						
			this.jInternalFrameDetalleFormComisiones.jMenuItemEliminarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonCancelarComisiones.addActionListener (new ButtonActionListener(this,"CancelarComisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonCancelarToolBarComisiones.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisiones"));
			
			this.jInternalFrameDetalleFormComisiones.jMenuItemCancelarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisiones"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisiones.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisiones"));		
		
		
		this.jButtonCerrarComisiones.addActionListener (new ButtonActionListener(this,"CerrarComisiones"));
		
		
		this.jButtonCerrarToolBarComisiones.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisiones"));
			
		this.jMenuItemCerrarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisiones"));
			
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jMenuItemDetalleCerrarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisiones"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisiones"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosToolBarComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisiones"));
		}
		
		this.jButtonCopiarToolBarComisiones.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisiones"));
			
		this.jButtonVerFormToolBarComisiones.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisiones"));
		
		this.jMenuItemGuardarCambiosComisiones.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisiones"));
			
		this.jMenuItemCopiarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisiones"));		
		
		this.jMenuItemVerFormComisiones.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisiones"));		
		
		
		this.jButtonGuardarCambiosTablaComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisiones"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisiones"));
			
		this.jMenuItemGuardarCambiosTablaComisiones.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisiones"));		
		
		
		
		this.jButtonRecargarInformacionComisiones.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisiones"));
					
		this.jButtonRecargarInformacionToolBarComisiones.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisiones"));
		
		this.jMenuItemRecargarInformacionComisiones.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisiones"));		
		
		
		
		this.jButtonAnterioresComisiones.addActionListener (new ButtonActionListener(this,"AnterioresComisiones"));
		
		
		this.jButtonAnterioresToolBarComisiones.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisiones"));
		
		this.jMenuItemAnterioresComisiones.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisiones"));		
		
		
		this.jButtonSiguientesComisiones.addActionListener (new ButtonActionListener(this,"SiguientesComisiones"));
		
		
		this.jButtonSiguientesToolBarComisiones.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisiones"));
			
		this.jMenuItemSiguientesComisiones.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisiones"));
			
		this.jMenuItemAbrirOrderByComisiones.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisiones"));
			
		this.jMenuItemMostrarOcultarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisiones"));
			
		this.jMenuItemDetalleAbrirOrderByComisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisiones"));
			
		this.jMenuItemDetalleMostarOcultarComisiones.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisiones"));		
		
		
		this.jButtonNuevoGuardarCambiosComisiones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisiones"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisiones.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisiones"));
			
		this.jMenuItemNuevoGuardarCambiosComisiones.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisiones"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisiones.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisiones"));

		this.jCheckBoxSeleccionadosComisiones.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisiones"));
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisiones"));
		}
		
		
		this.jComboBoxTiposRelacionesComisiones.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisiones"));
			
		this.jComboBoxTiposAccionesComisiones.addActionListener (new ButtonActionListener(this,"TiposAccionesComisiones"));
					
		this.jComboBoxTiposSeleccionarComisiones.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisiones"));
			
		this.jTextFieldValorCampoGeneralComisiones.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisiones"));		
		
		
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisiones.jButtonidComisionesBusqueda.addActionListener(new ButtonActionListener(this,"idComisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisiones.jButtoncodigoComisionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoComisionesBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisiones!=null) {
				this.jInternalFrameReporteDinamicoComisiones.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisiones"));
				this.jInternalFrameReporteDinamicoComisiones.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisiones"));
				this.jInternalFrameReporteDinamicoComisiones.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisiones"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisiones.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisiones"));				
			//this.jButtonGenerarReporteDinamicoComisiones.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisiones"));
			//this.jButtonGenerarExcelReporteDinamicoComisiones.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisiones"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisiones!=null) {
				this.jInternalFrameImportacionComisiones.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisiones"));
				this.jInternalFrameImportacionComisiones.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisiones"));
				this.jInternalFrameImportacionComisiones.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisiones"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisiones.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisiones"));
			
			this.jButtonAbrirOrderByToolBarComisiones.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisiones"));			
			
			if(this.jInternalFrameOrderByComisiones!=null) {
				this.jInternalFrameOrderByComisiones.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisiones"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisiones!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisiones.jTabbedPaneRelacionesComisiones.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisiones"));
		
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
            		closingInternalFrameComisiones();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisiones.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisiones = (JInternalFrameBase)event.getSource();
	            	
	            ComisionesBeanSwingJInternalFrame jInternalFrameParent=(ComisionesBeanSwingJInternalFrame)jInternalFrameDetalleFormComisiones.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionesActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisiones.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionesListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisiones.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisiones.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionesActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisiones";
		inputMap = this.jButtonNuevoComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionesActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionesActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisiones";
		inputMap = this.jButtonNuevoRelacionesComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionesActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisiones";
		inputMap = this.jButtonModificarComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisiones";
		inputMap = this.jButtonActualizarComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisiones";
		inputMap = this.jButtonEliminarComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisiones";
		inputMap = this.jButtonCancelarComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisiones";
		inputMap = this.jButtonCerrarComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisiones";
		inputMap = this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisiones.jButtonGuardarCambiosComisiones.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionesActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisiones.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionesItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisiones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisiones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisiones.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionesActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisiones.jButtonidComisionesBusqueda.addActionListener(new ButtonActionListener(this,"idComisionesBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisiones.jButtoncodigoComisionesBusqueda.addActionListener(new ButtonActionListener(this,"codigoComisionesBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisiones.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionesActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionesActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisiones.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisiones(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
					comisionesAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Comisiones comisionesAux:comisioness) {
					comisionesAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisiones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
						comisionesAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Comisiones comisionesAux:comisioness) {
						comisionesAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Comisiones comisionesAux:comisioness) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisiones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisiones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisiones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisiones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionesItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisiones(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisiones.getSelectedRows();
			
			Comisiones comisionesLocal=new Comisiones();
			
			//this.seleccionarTodosComisiones(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionesLocal =(Comisiones) this.comisionesLogic.getComisioness().toArray()[this.jTableDatosComisiones.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisionesLocal =(Comisiones) this.comisioness.toArray()[this.jTableDatosComisiones.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisionesLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
						comisionesAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Comisiones comisionesAux:comisioness) {
						comisionesAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisiones(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisiones.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisiones.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisiones,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionesItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionesParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionesActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisiones(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisiones.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Comisiones comisionesAux:this.comisionesLogic.getComisioness()) {
				
						if(sTipoSeleccionar.equals(ComisionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							comisionesAux.setcodigo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Comisiones comisionesAux:comisioness) {
					
						if(sTipoSeleccionar.equals(ComisionesConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							comisionesAux.setcodigo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisiones(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionesActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisiones(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisiones=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisiones.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisiones) {				
					conSplash=true;//false;										
					
					//this.startProcessComisiones(conSplash);
				
					this.generarReporteComisionessSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionessSeleccionados();
				//this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionessSeleccionados(false);
				//this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionessSeleccionados(true);
				//this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisiones();
				
				this.exportarComisionessSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisioness();
				//this.importarComisioness();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisiones();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionessSeleccionados();
				//this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisiones();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisiones)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisiones(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionesBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisiones) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisiones(conSplash);
					
						//this.actualizarParametrosGeneralComisiones();
						
						this.generarReporteProcesoAccionComisionessSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionesBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ComisionesES SELECCIONADOS?", "MANTENIMIENTO DE Comisiones", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisiones();
				
						this.actualizarParametrosGeneralComisiones();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisionesReturnGeneral=comisionesLogic.procesarAccionComisionessWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisionesLogic.getComisioness(),this.comisionesParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisiones();
					
					ComisionesBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionesReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisiones.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisiones.jComboBoxTiposAccionesFormularioComisiones.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisiones(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionesActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisiones();
			
			if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
			Comisiones comisiones=new Comisiones();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisiones(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisiones.getSelectedItem();
			
			
			
			
			comisionessSeleccionados=this.getComisionessSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisionessSeleccionados.size()==1) {
				for(Comisiones comisionesAux:comisionessSeleccionados) {
					comisiones=comisionesAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisiones();
			
      		//this.finishProcessComisiones(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionesReturnGeneral() throws Exception {
		if(this.comisionesReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisionesReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisionesReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisionesReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisionesReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisionesReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisiones(false);
		}
		
		if(this.comisionesReturnGeneral.getConRetornoLista() || this.comisionesReturnGeneral.getConRetornoObjeto()) {
			if(this.comisionesReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionesLogic.setComisioness(this.comisionesReturnGeneral.getComisioness());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisionesReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionesLogic.setComisiones(this.comisionesReturnGeneral.getComisiones());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisiones(false);
		}
	}
	
	public void actualizarParametrosGeneralComisiones() throws Exception {
		
		
	}
	
	public ArrayList<Comisiones> getComisionessSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisiones) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Comisiones comisionesAux:comisionesLogic.getComisioness()) {
					if(comisionesAux.getIsSelected()) {
						comisionessSeleccionados.add(comisionesAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Comisiones comisionesAux:this.comisioness) {
					if(comisionesAux.getIsSelected()) {
						comisionessSeleccionados.add(comisionesAux);				
					}
				}
			}
			
			if(comisionessSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisionessSeleccionados.addAll(this.comisionesLogic.getComisioness());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisionessSeleccionados.addAll(this.comisioness);				
					}
				}
			}
		} else {
			comisionessSeleccionados.add(this.comisiones);
		}
		
		return comisionessSeleccionados;
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
	
	public void generarReporteComisionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionessSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionessSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionessSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comisiones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionessSeleccionados() throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisioness("Todos",comisionessSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionessSeleccionados() throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisioness("Todos",comisionessSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionessSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisioness("Todos",comisionessSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionessSeleccionados() throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisiones();
		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisiones();
		
		
		//this.generarReporteComisioness("Todos",comisionessSeleccionados ,comisionesImplementable,comisionesImplementableHome);
	}
	
	public void mostrarImportacionComisioness() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisiones();
		
		this.abrirFrameImportacionComisiones();		
		
			
		//this.generarReporteComisioness("Todos",comisionessSeleccionados ,comisionesImplementable,comisionesImplementableHome);
	}
	
	public void importarComisioness() throws Exception {		
	
	}
	
	public void exportarComisionessSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionessSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionessSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionessSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comisiones",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionessSeleccionados() throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisiones(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Comisiones comisionesAux:comisionessSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisiones(comisionesAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisionesAux.setsDetalleGeneralEntityReporte(comisionesAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisiones(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionesConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionesConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionesConstantesFunciones.LABEL_CODIGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisiones(Comisiones comisiones,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisiones.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiones.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisiones.getcodigo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionessSeleccionados() throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Comisioness");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisiones(row);				
				iRow++;
			}				
			
			for(Comisiones comisionesAux:comisionessSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisiones(comisionesAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionessSeleccionados() throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();		
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisiones.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisioness");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisiones");
			//elementRoot.appendChild(element);
		
			for(Comisiones comisionesAux:comisionessSeleccionados) {
				element = document.createElement("comisiones");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisiones(comisionesAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionesSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comisiones",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisiones(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionesConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionesConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionesConstantesFunciones.LABEL_CODIGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisiones(Comisiones comisiones,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisiones.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisiones.getcodigo());				
	}
	
	public void setFilaDatosExportarXmlComisiones(Comisiones comisiones,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionesConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisiones.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionesConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisiones.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(ComisionesConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(comisiones.getcodigo().trim()));
		element.appendChild(elementcodigo);
	}
	
	public void generarReporteGroupGenericoComisionessSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Comisiones> comisionessSeleccionados=new ArrayList<Comisiones>();
		
		comisionessSeleccionados=this.getComisionessSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisiones(comisionessSeleccionados);
		
		this.generarReporteComisioness("Todos",comisionessSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisiones(ArrayList<Comisiones> comisionessSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Comisiones comisionesAux:comisionessSeleccionados) {
				comisionesAux.setsDetalleGeneralEntityReporte(comisionesAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionesConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					comisionesAux.setsDescripcionGeneralEntityReporte1(comisionesAux.getcodigo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionesConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisiones(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisiones=true;
				this.isVisibilidadCeldaNuevoRelacionesComisiones=true;
				this.isVisibilidadCeldaGuardarCambiosComisiones=true;
			}
			
			this.isVisibilidadCeldaModificarComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=false;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
			this.isVisibilidadCeldaModificarComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=true;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
			this.isVisibilidadCeldaModificarComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=true;
			this.isVisibilidadCeldaEliminarComisiones=true;
			this.isVisibilidadCeldaCancelarComisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
			this.isVisibilidadCeldaModificarComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=true;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=false;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisiones=true;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=true;
			this.isVisibilidadCeldaGuardarCambiosComisiones=true;
			this.isVisibilidadCeldaModificarComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=false;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=true;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
			this.isVisibilidadCeldaActualizarComisiones=false;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=false;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
			this.isVisibilidadCeldaModificarComisiones=true;
			this.isVisibilidadCeldaActualizarComisiones=false;
			this.isVisibilidadCeldaEliminarComisiones=false;
			this.isVisibilidadCeldaCancelarComisiones=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisiones=false;
				} else {
					this.isVisibilidadCeldaGuardarComisiones=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionesJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisiones=true;
			this.isVisibilidadCeldaNuevoRelacionesComisiones=true;
			this.isVisibilidadCeldaGuardarCambiosComisiones=true;
		} else {
			this.actualizarEstadoPanelsComisiones(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisiones=false;
			//this.isVisibilidadCeldaVerFormComisiones=false;
			this.isVisibilidadCeldaDuplicarComisiones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisionesSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
		} else {
			this.isVisibilidadCeldaNuevoComisiones=false;
			this.isVisibilidadCeldaGuardarCambiosComisiones=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisionesSessionBean.getEsGuardarRelacionado()) {
			if(!comisionesSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisiones=false;												
			}
			
			this.jButtonCerrarComisiones.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisiones=false;
		}
		
		if(!this.permiteMantenimiento(this.comisiones)) {
			this.isVisibilidadCeldaActualizarComisiones=false;
			this.isVisibilidadCeldaEliminarComisiones=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisiones() {
	}
	
	public void actualizarEstadoPanelsComisiones(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisiones!=null) {
				this.jScrollPanelDatosEdicionComisiones.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosComisiones!=null) {
				this.jScrollPanelDatosComisiones.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisiones!=null) {
				this.jPanelPaginacionComisiones.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisiones!=null) {
				this.jPanelParametrosReportesComisiones.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisionesSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.comisionesSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionesSessionBean comisionesSessionBean=new ComisionesSessionBean();
		
		if(this.comisionesSessionBean==null) {
			this.comisionesSessionBean=new ComisionesSessionBean();
		}
		
		this.comisionesSessionBean.setsUltimaBusquedaComisiones(this.getsAccionBusqueda());
		this.comisionesSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisionesSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionesSessionBean comisionesSessionBean=new ComisionesSessionBean();
		
		if(this.comisionesSessionBean==null) {
			this.comisionesSessionBean=new ComisionesSessionBean();
		}
		
		if(this.comisionesSessionBean.getsUltimaBusquedaComisiones()!=null&&!this.comisionesSessionBean.getsUltimaBusquedaComisiones().equals("")) {
			this.setsAccionBusqueda(comisionesSessionBean.getsUltimaBusquedaComisiones());
			this.setiNumeroPaginacion(comisionesSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisionesSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.comisionesSessionBean.setsUltimaBusquedaComisiones("");
		this.comisionesSessionBean.setiNumeroPaginacion(ComisionesConstantesFunciones.INUMEROPAGINACION);
		this.comisionesSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisiones(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisiones() {
		this.updateBorderResaltarBusquedasFormularioComisiones();
		this.updateVisibilidadBusquedasFormularioComisiones();
		this.updateHabilitarBusquedasFormularioComisiones();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisiones() {					
	}
	
	public void updateVisibilidadBusquedasFormularioComisiones() {
	}
	
	public void updateHabilitarBusquedasFormularioComisiones() {
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
	
	public void updateControlesFormularioComisiones() throws Exception {

		if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisiones();
		this.updateVisibilidadResaltarControlesFormularioComisiones();
		this.updateHabilitarResaltarControlesFormularioComisiones();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisiones() throws Exception {
		if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisionesConstantesFunciones.resaltaridComisiones!=null && this.jInternalFrameDetalleFormComisiones!=null) {this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setBorder(this.comisionesConstantesFunciones.resaltaridComisiones);}
		if(this.comisionesConstantesFunciones.resaltarcodigoComisiones!=null && this.jInternalFrameDetalleFormComisiones!=null) {this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setBorder(this.comisionesConstantesFunciones.resaltarcodigoComisiones);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisiones() throws Exception {		
		if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
	
		//this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setVisible(this.comisionesConstantesFunciones.mostraridComisiones);
		this.jInternalFrameDetalleFormComisiones.jPanelidComisiones.setVisible(this.comisionesConstantesFunciones.mostraridComisiones);
		//this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setVisible(this.comisionesConstantesFunciones.mostrarcodigoComisiones);
		this.jInternalFrameDetalleFormComisiones.jPanelcodigoComisiones.setVisible(this.comisionesConstantesFunciones.mostrarcodigoComisiones);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisiones() throws Exception {
		if(this.jInternalFrameDetalleFormComisiones==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisiones!=null) {
	
		this.jInternalFrameDetalleFormComisiones.jLabelidComisiones.setEnabled(this.comisionesConstantesFunciones.activaridComisiones);
		this.jInternalFrameDetalleFormComisiones.jTextFieldcodigoComisiones.setEnabled(this.comisionesConstantesFunciones.activarcodigoComisiones);
		}
	}
	
		
}