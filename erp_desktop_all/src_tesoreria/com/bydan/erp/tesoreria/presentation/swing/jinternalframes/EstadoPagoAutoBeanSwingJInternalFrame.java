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
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes;




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

import com.bydan.erp.tesoreria.util.EstadoPagoAutoConstantesFunciones;
import com.bydan.erp.tesoreria.util.EstadoPagoAutoParameterReturnGeneral;
//import com.bydan.erp.tesoreria.util.EstadoPagoAutoParameterGeneral;
//import com.bydan.erp.tesoreria.presentation.report.source.EstadoPagoAutoBean;
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

import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.tesoreria.resources.reportes.AuxiliarReportes;


import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.tesoreria.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.tesoreria.business.entity.*;
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


import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;

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
public class EstadoPagoAutoBeanSwingJInternalFrame extends EstadoPagoAutoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoPagoAutoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoPagoAuto> estadopagoautoValidator = new ClassValidator<EstadoPagoAuto>(EstadoPagoAuto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoPagoAuto estadopagoauto;	
	public EstadoPagoAuto estadopagoautoAux;
	public EstadoPagoAuto estadopagoautoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoPagoAuto estadopagoautoTotales;
	public Long idEstadoPagoAutoActual;
	public Long iIdNuevoEstadoPagoAuto=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosPagoAuto=false;

	public Boolean getIsTienePermisosPagoAuto() {
		return isTienePermisosPagoAuto;
	}

	public void setIsTienePermisosPagoAuto(Boolean isTienePermisosPagoAuto) {
		this.isTienePermisosPagoAuto= isTienePermisosPagoAuto;
	}

	
	
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
	
	public Boolean isPermisoTodoEstadoPagoAuto;
	public Boolean isPermisoNuevoEstadoPagoAuto;
	public Boolean isPermisoActualizarEstadoPagoAuto;
	public Boolean isPermisoActualizarOriginalEstadoPagoAuto;
	public Boolean isPermisoEliminarEstadoPagoAuto;
	public Boolean isPermisoGuardarCambiosEstadoPagoAuto;
	public Boolean isPermisoConsultaEstadoPagoAuto;
	public Boolean isPermisoBusquedaEstadoPagoAuto;
	public Boolean isPermisoReporteEstadoPagoAuto;
	public Boolean isPermisoPaginacionMedioEstadoPagoAuto;
	public Boolean isPermisoPaginacionAltoEstadoPagoAuto;
	public Boolean isPermisoPaginacionTodoEstadoPagoAuto;
	public Boolean isPermisoCopiarEstadoPagoAuto;
	public Boolean isPermisoVerFormEstadoPagoAuto;
	public Boolean isPermisoDuplicarEstadoPagoAuto;
	public Boolean isPermisoOrdenEstadoPagoAuto;
	
	
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
	
	public EstadoPagoAutoParameterReturnGeneral estadopagoautoReturnGeneral;
	public EstadoPagoAutoParameterReturnGeneral estadopagoautoParameterGeneral;
	
	

	public PagoAutoLogic pagoautoLogic=null;

	public PagoAutoLogic getPagoAutoLogic() {
		return pagoautoLogic;
	}

	public void setPagoAutoLogic(PagoAutoLogic pagoautoLogic) {
		this.pagoautoLogic = pagoautoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoPagoAuto=false;
	public Boolean esParaAccionDesdeFormularioEstadoPagoAuto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoPagoAutoLogic estadopagoautoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoPagoAuto estadopagoautoBean;
	public EstadoPagoAutoConstantesFunciones estadopagoautoConstantesFunciones;
	//public EstadoPagoAutoParameterReturnGeneral estadopagoautoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoPagoAuto> estadopagoautos;	
	//public List<EstadoPagoAuto> estadopagoautosEliminados;
	//public List<EstadoPagoAuto> estadopagoautosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoPagoAuto=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoPagoAuto=true;
	public Boolean isVisibilidadCeldaCopiarEstadoPagoAuto=true;
	public Boolean isVisibilidadCeldaVerFormEstadoPagoAuto=true;
	public Boolean isVisibilidadCeldaOrdenEstadoPagoAuto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
	public Boolean isVisibilidadCeldaModificarEstadoPagoAuto=false;
	public Boolean isVisibilidadCeldaActualizarEstadoPagoAuto=false;
	public Boolean isVisibilidadCeldaEliminarEstadoPagoAuto=false;
	public Boolean isVisibilidadCeldaCancelarEstadoPagoAuto=false;
	public Boolean isVisibilidadCeldaGuardarEstadoPagoAuto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;	
	
	
	
	public Long getiIdNuevoEstadoPagoAuto() {
		return this.iIdNuevoEstadoPagoAuto;
	}

	public void setiIdNuevoEstadoPagoAuto(Long iIdNuevoEstadoPagoAuto) {
		this.iIdNuevoEstadoPagoAuto = iIdNuevoEstadoPagoAuto;
	}
	
	public Long getidEstadoPagoAutoActual() {
		return this.idEstadoPagoAutoActual;
	}

	public void setidEstadoPagoAutoActual(Long idEstadoPagoAutoActual) {
		this.idEstadoPagoAutoActual = idEstadoPagoAutoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoPagoAuto getestadopagoauto() {
		return this.estadopagoauto;
	}

	public void setestadopagoauto(EstadoPagoAuto estadopagoauto) {
		this.estadopagoauto = estadopagoauto;
	}
	
	public EstadoPagoAuto getestadopagoautoAux() {
		return this.estadopagoautoAux;
	}

	public void setestadopagoautoAux(EstadoPagoAuto estadopagoautoAux) {
		this.estadopagoautoAux = estadopagoautoAux;
	}				
	
	public EstadoPagoAuto getestadopagoautoAnterior() {
		return this.estadopagoautoAnterior;
	}

	public void setestadopagoautoAnterior(EstadoPagoAuto estadopagoautoAnterior) {
		this.estadopagoautoAnterior = estadopagoautoAnterior;
	}	
	
	public EstadoPagoAuto getestadopagoautoTotales() {
		return this.estadopagoautoTotales;
	}

	public void setestadopagoautoTotales(EstadoPagoAuto estadopagoautoTotales) {
		this.estadopagoautoTotales = estadopagoautoTotales;
	}	
	
	public EstadoPagoAuto getestadopagoautoBean() {
		return this.estadopagoautoBean;
	}

	public void setestadopagoautoBean(EstadoPagoAuto estadopagoautoBean) {
		this.estadopagoautoBean = estadopagoautoBean;
	}	
	
	public EstadoPagoAutoParameterReturnGeneral getestadopagoautoReturnGeneral() {
		return this.estadopagoautoReturnGeneral;
	}

	public void setestadopagoautoReturnGeneral(EstadoPagoAutoParameterReturnGeneral estadopagoautoReturnGeneral) {
		this.estadopagoautoReturnGeneral = estadopagoautoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoPagoAutoLogic getEstadoPagoAutoLogic()	{		
		return estadopagoautoLogic;
	}

	public void setEstadoPagoAutoLogic(EstadoPagoAutoLogic estadopagoautoLogic) {
		this.estadopagoautoLogic = estadopagoautoLogic;
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
	
	public Boolean getIsEsNuevoEstadoPagoAuto() {
		return isEsNuevoEstadoPagoAuto;
	}

	public void setIsEsNuevoEstadoPagoAuto(Boolean isEsNuevoEstadoPagoAuto) {
		this.isEsNuevoEstadoPagoAuto = isEsNuevoEstadoPagoAuto;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoPagoAuto() {
		return esParaAccionDesdeFormularioEstadoPagoAuto;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoPagoAuto(Boolean esParaAccionDesdeFormularioEstadoPagoAuto) {
		this.esParaAccionDesdeFormularioEstadoPagoAuto = esParaAccionDesdeFormularioEstadoPagoAuto;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoPagoAuto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoPagoAutoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPagoAuto(this.estadopagoautoLogic.getEstadoPagoAutos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoPagoAutoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoPagoAuto(this.estadopagoautos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadopagoautoLogic.setEstadoPagoAutos(this.estadopagoautos);
			estadopagoautoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoPagoAutoParameterReturnGeneral getEstadoPagoAutoParameterGeneral() {
		return this.estadopagoautoParameterGeneral;
	}
	
	public void setEstadoPagoAutoParameterGeneral(EstadoPagoAutoParameterReturnGeneral estadopagoautoParameterGeneral) {
		this.estadopagoautoParameterGeneral = estadopagoautoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoPagoAuto() {
		return isPermisoTodoEstadoPagoAuto;
	}

	public void setIsPermisoTodoEstadoPagoAuto(Boolean isPermisoTodoEstadoPagoAuto) {
		this.isPermisoTodoEstadoPagoAuto = isPermisoTodoEstadoPagoAuto;
	}

	public Boolean getIsPermisoNuevoEstadoPagoAuto() {
		return isPermisoNuevoEstadoPagoAuto;
	}

	public void setIsPermisoNuevoEstadoPagoAuto(Boolean isPermisoNuevoEstadoPagoAuto) {
		this.isPermisoNuevoEstadoPagoAuto = isPermisoNuevoEstadoPagoAuto;
	}

	public Boolean getIsPermisoActualizarEstadoPagoAuto() {
		return isPermisoActualizarEstadoPagoAuto;
	}

	public void setIsPermisoActualizarEstadoPagoAuto(Boolean isPermisoActualizarEstadoPagoAuto) {
		this.isPermisoActualizarEstadoPagoAuto = isPermisoActualizarEstadoPagoAuto;
	}

	public Boolean getIsPermisoEliminarEstadoPagoAuto() {
		return isPermisoEliminarEstadoPagoAuto;
	}

	public void setIsPermisoEliminarEstadoPagoAuto(Boolean isPermisoEliminarEstadoPagoAuto) {
		this.isPermisoEliminarEstadoPagoAuto = isPermisoEliminarEstadoPagoAuto;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoPagoAuto() {
		return isPermisoGuardarCambiosEstadoPagoAuto;
	}

	public void setIsPermisoGuardarCambiosEstadoPagoAuto(Boolean isPermisoGuardarCambiosEstadoPagoAuto) {
		this.isPermisoGuardarCambiosEstadoPagoAuto = isPermisoGuardarCambiosEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoConsultaEstadoPagoAuto() {
		return isPermisoConsultaEstadoPagoAuto;
	}

	public void setIsPermisoConsultaEstadoPagoAuto(Boolean isPermisoConsultaEstadoPagoAuto) {
		this.isPermisoConsultaEstadoPagoAuto = isPermisoConsultaEstadoPagoAuto;
	}

	public Boolean getIsPermisoBusquedaEstadoPagoAuto() {
		return isPermisoBusquedaEstadoPagoAuto;
	}

	public void setIsPermisoBusquedaEstadoPagoAuto(Boolean isPermisoBusquedaEstadoPagoAuto) {
		this.isPermisoBusquedaEstadoPagoAuto = isPermisoBusquedaEstadoPagoAuto;
	}

	public Boolean getIsPermisoReporteEstadoPagoAuto() {
		return isPermisoReporteEstadoPagoAuto;
	}

	public void setIsPermisoReporteEstadoPagoAuto(Boolean isPermisoReporteEstadoPagoAuto) {
		this.isPermisoReporteEstadoPagoAuto = isPermisoReporteEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoPagoAuto() {
		return isPermisoPaginacionMedioEstadoPagoAuto;
	}

	public void setIsPermisoPaginacionMedioEstadoPagoAuto(Boolean isPermisoPaginacionMedioEstadoPagoAuto) {
		this.isPermisoPaginacionMedioEstadoPagoAuto = isPermisoPaginacionMedioEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoPagoAuto() {
		return isPermisoPaginacionTodoEstadoPagoAuto;
	}

	public void setIsPermisoPaginacionTodoEstadoPagoAuto(Boolean isPermisoPaginacionTodoEstadoPagoAuto) {
		this.isPermisoPaginacionTodoEstadoPagoAuto = isPermisoPaginacionTodoEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoPagoAuto() {
		return isPermisoPaginacionAltoEstadoPagoAuto;
	}

	public void setIsPermisoPaginacionAltoEstadoPagoAuto(Boolean isPermisoPaginacionAltoEstadoPagoAuto) {
		this.isPermisoPaginacionAltoEstadoPagoAuto = isPermisoPaginacionAltoEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoCopiarEstadoPagoAuto() {
		return isPermisoCopiarEstadoPagoAuto;
	}

	public void setIsPermisoCopiarEstadoPagoAuto(Boolean isPermisoCopiarEstadoPagoAuto) {
		this.isPermisoCopiarEstadoPagoAuto = isPermisoCopiarEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoVerFormEstadoPagoAuto() {
		return isPermisoVerFormEstadoPagoAuto;
	}

	public void setIsPermisoVerFormEstadoPagoAuto(Boolean isPermisoVerFormEstadoPagoAuto) {
		this.isPermisoVerFormEstadoPagoAuto = isPermisoVerFormEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoDuplicarEstadoPagoAuto() {
		return isPermisoDuplicarEstadoPagoAuto;
	}

	public void setIsPermisoDuplicarEstadoPagoAuto(Boolean isPermisoDuplicarEstadoPagoAuto) {
		this.isPermisoDuplicarEstadoPagoAuto = isPermisoDuplicarEstadoPagoAuto;
	}
	
	public Boolean getIsPermisoOrdenEstadoPagoAuto() {
		return isPermisoOrdenEstadoPagoAuto;
	}

	public void setIsPermisoOrdenEstadoPagoAuto(Boolean isPermisoOrdenEstadoPagoAuto) {
		this.isPermisoOrdenEstadoPagoAuto = isPermisoOrdenEstadoPagoAuto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoPagoAuto() {
		return isVisibilidadCeldaNuevoEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaNuevoEstadoPagoAuto(Boolean isVisibilidadCeldaNuevoEstadoPagoAuto) {
		this.isVisibilidadCeldaNuevoEstadoPagoAuto = isVisibilidadCeldaNuevoEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoPagoAuto() {
		return isVisibilidadCeldaDuplicarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoPagoAuto(Boolean isVisibilidadCeldaDuplicarEstadoPagoAuto) {
		this.isVisibilidadCeldaDuplicarEstadoPagoAuto = isVisibilidadCeldaDuplicarEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoPagoAuto() {
		return isVisibilidadCeldaCopiarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaCopiarEstadoPagoAuto(Boolean isVisibilidadCeldaCopiarEstadoPagoAuto) {
		this.isVisibilidadCeldaCopiarEstadoPagoAuto = isVisibilidadCeldaCopiarEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoPagoAuto() {
		return isVisibilidadCeldaVerFormEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaVerFormEstadoPagoAuto(Boolean isVisibilidadCeldaVerFormEstadoPagoAuto) {
		this.isVisibilidadCeldaVerFormEstadoPagoAuto = isVisibilidadCeldaVerFormEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoPagoAuto() {
		return isVisibilidadCeldaOrdenEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaOrdenEstadoPagoAuto(Boolean isVisibilidadCeldaOrdenEstadoPagoAuto) {
		this.isVisibilidadCeldaOrdenEstadoPagoAuto = isVisibilidadCeldaOrdenEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoPagoAuto() {
		return isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoPagoAuto(Boolean isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto = isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoPagoAuto() {
		return isVisibilidadCeldaModificarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaModificarEstadoPagoAuto(Boolean isVisibilidadCeldaModificarEstadoPagoAuto) {
		this.isVisibilidadCeldaModificarEstadoPagoAuto = isVisibilidadCeldaModificarEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoPagoAuto() {
		return isVisibilidadCeldaActualizarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaActualizarEstadoPagoAuto(Boolean isVisibilidadCeldaActualizarEstadoPagoAuto) {
		this.isVisibilidadCeldaActualizarEstadoPagoAuto = isVisibilidadCeldaActualizarEstadoPagoAuto;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoPagoAuto() {
		return isVisibilidadCeldaEliminarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaEliminarEstadoPagoAuto(Boolean isVisibilidadCeldaEliminarEstadoPagoAuto) {
		this.isVisibilidadCeldaEliminarEstadoPagoAuto = isVisibilidadCeldaEliminarEstadoPagoAuto;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoPagoAuto() {
		return isVisibilidadCeldaCancelarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaCancelarEstadoPagoAuto(Boolean isVisibilidadCeldaCancelarEstadoPagoAuto) {
		this.isVisibilidadCeldaCancelarEstadoPagoAuto = isVisibilidadCeldaCancelarEstadoPagoAuto;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoPagoAuto() {
		return isVisibilidadCeldaGuardarEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaGuardarEstadoPagoAuto(Boolean isVisibilidadCeldaGuardarEstadoPagoAuto) {
		this.isVisibilidadCeldaGuardarEstadoPagoAuto = isVisibilidadCeldaGuardarEstadoPagoAuto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoPagoAuto() {
		return isVisibilidadCeldaGuardarCambiosEstadoPagoAuto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoPagoAuto(Boolean isVisibilidadCeldaGuardarCambiosEstadoPagoAuto) {
		this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto = isVisibilidadCeldaGuardarCambiosEstadoPagoAuto;
	}
		
	public EstadoPagoAutoSessionBean getestadopagoautoSessionBean() {
		return this.estadopagoautoSessionBean;
	}
	
	public void setestadopagoautoSessionBean(EstadoPagoAutoSessionBean estadopagoautoSessionBean) {
		this.estadopagoautoSessionBean=estadopagoautoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(EstadoPagoAuto estadopagoauto)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoPagoAuto estadopagoauto,EstadoPagoAuto estadopagoautoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoPagoAuto(estadopagoauto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadopagoautoAux.setId(estadopagoauto.getId());
		estadopagoautoAux.setVersionRow(estadopagoauto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoPagoAuto();
		
			int intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadopagoautoValidator.getInvalidValues(this.estadopagoauto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadopagoautoLogic.setDatosCliente(datosCliente);
			estadopagoautoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadopagoautoAux=new  EstadoPagoAuto();
				
				estadopagoautoAux.setIsNew(true);
				estadopagoautoAux.setIsChanged(true);
				
				estadopagoautoAux.setEstadoPagoAutoOriginal(this.estadopagoauto);
				
				estadopagoautoAux.setId(this.estadopagoauto.getId());	
				estadopagoautoAux.setVersionRow(this.estadopagoauto.getVersionRow());	
				estadopagoautoAux.setnombre(this.estadopagoauto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopagoautoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadopagoautoAux,estadopagoautoLogic.getEstadoPagoAutos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopagoautoAux,estadopagoautos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopagoautoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopagoautoLogic.saveEstadoPagoAutos();//WithConnection
						//estadopagoautoLogic.getSetVersionRowEstadoPagoAutos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopagoauto,estadopagoautoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadopagoautoAux=new  EstadoPagoAuto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadopagoautoSessionBean.getEsGuardarRelacionado() && this.estadopagoauto.getId()>=0)) {
						
					estadopagoautoAux.setIsNew(false);
				}
				
				estadopagoautoAux.setIsDeleted(false);
			
				estadopagoautoAux.setId(this.estadopagoauto.getId());	
				estadopagoautoAux.setVersionRow(this.estadopagoauto.getVersionRow());	
				estadopagoautoAux.setnombre(this.estadopagoauto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopagoautoAux,estadopagoautoLogic.getEstadoPagoAutos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopagoautoAux,estadopagoautos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopagoautoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopagoautoLogic.saveEstadoPagoAutos();//WithConnection
						//estadopagoautoLogic.getSetVersionRowEstadoPagoAutos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadopagoauto,estadopagoautoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadopagoautoAux=new  EstadoPagoAuto();
				
				estadopagoautoAux.setIsNew(false);
				estadopagoautoAux.setIsChanged(false);
				
				estadopagoautoAux.setIsDeleted(true);
				
				estadopagoautoAux.setId(this.estadopagoauto.getId());	
				estadopagoautoAux.setVersionRow(this.estadopagoauto.getVersionRow());	
				estadopagoautoAux.setnombre(this.estadopagoauto.getnombre());	
				
				if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadopagoautoAux.getId()>=0) {	
						this.estadopagoautosEliminados.add(estadopagoautoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadopagoautoAux,estadopagoautoLogic.getEstadoPagoAutos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopagoautoAux,estadopagoautos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadopagoautoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopagoautoLogic.saveEstadoPagoAutos();//WithConnection
						//estadopagoautoLogic.getSetVersionRowEstadoPagoAutos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.quitarFilaTotales();}
							estadopagoautoAux.setPagoAutos(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadopagoautoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadopagoautoAux,estadopagoautoLogic.getEstadoPagoAutos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadopagoautoAux,estadopagoautos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.getEstadoPagoAutos().addAll(this.estadopagoautosEliminados);
					
					estadopagoautoLogic.saveEstadoPagoAutos();//WithConnection
					//estadopagoautoLogic.getSetVersionRowEstadoPagoAutos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadopagoautosEliminados= new ArrayList<EstadoPagoAuto>();		
			}
			
			if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Pago Automatico GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadopagoauto=estadopagoautoAux;
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
      		//this.finishProcessEstadoPagoAuto();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoPagoAuto estadopagoautoLocal) throws Exception {
		
		if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadopagoautoLocal.setPagoAutos(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());
			
			} else {
			
				estadopagoautoLocal.setPagoAutos(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoPagoAuto estadopagoautoLocal) throws Exception {	
		if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoPagoAutoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadopagoautoValidator.getInvalidValues(this.estadopagoauto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoPagoAuto estadopagoauto,List<EstadoPagoAuto> estadopagoautos) throws Exception {
		try	{		
			EstadoPagoAutoConstantesFunciones.actualizarLista(estadopagoauto,estadopagoautos,this.estadopagoautoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoPagoAuto estadopagoauto,List<EstadoPagoAuto> estadopagoautos) throws Exception {
		try	{			
			EstadoPagoAutoConstantesFunciones.actualizarSelectedLista(estadopagoauto,estadopagoautos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoPagoAuto> estadopagoautosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadopagoautosLocal=this.estadopagoautoLogic.getEstadoPagoAutos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadopagoautosLocal=this.estadopagoautos;
			}
			//ARCHITECTURE
		
			for(EstadoPagoAuto estadopagoautoLocal:estadopagoautosLocal) {
				if(this.permiteMantenimiento(estadopagoautoLocal) && estadopagoautoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoPagoAutoConstantesFunciones.getEstadoPagoAutoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoPagoAutoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPagoAuto.jLabelnombreEstadoPagoAuto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoPagoAuto.jLabelnombreEstadoPagoAuto,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PagoAuto")) {
			if(this.estadopagoauto==null) {
				this.estadopagoauto= new EstadoPagoAuto();
			}

			if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoPagoAuto
				this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);

				this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.getpagoauto().setEstadoPagoAuto(this.estadopagoauto);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoPagoAuto--;	
		
		
		this.estadopagoautoAux=new EstadoPagoAuto();
		
		this.estadopagoautoAux.setId(this.iIdNuevoEstadoPagoAuto);
		this.estadopagoautoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadopagoautoLogic.getEstadoPagoAutos().add(this.estadopagoautoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadopagoautos.add(this.estadopagoautoAux);
		}
		//ARCHITECTURE
		
		this.estadopagoauto=this.estadopagoautoAux;
		
		if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoauto);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPagoAuto(this.estadopagoauto);
		}
				
		//this.setDefaultControlesEstadoPagoAuto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoPagoAuto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoPagoAuto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPagoAuto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPagoAuto(this.estadopagoautoBean,this.estadopagoauto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoPagoAutoConstantesFunciones.getClassesRelationshipsOfEstadoPagoAuto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadopagoautoReturnGeneral=estadopagoautoLogic.procesarEventosEstadoPagoAutosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopagoautoLogic.getEstadoPagoAutos(),this.estadopagoauto,this.estadopagoautoParameterGeneral,this.isEsNuevoEstadoPagoAuto,classes);//this.estadopagoautoLogic.getEstadoPagoAuto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoPagoAuto(this.estadopagoautoReturnGeneral,this.estadopagoautoBean,false);
		
		if(this.estadopagoautoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto());
		}
		
		if(this.estadopagoautoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto(),classes);//this.estadopagoautoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoPagoAuto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoPagoAuto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoPagoAuto(false);
						
			if(estadopagoautoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getEsGuardarRelacionado() && PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPagoAutoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPagoAuto();
			}
			
			this.actualizarVisualTableDatosEstadoPagoAuto();
			
			this.jTableDatosEstadoPagoAuto.setRowSelectionInterval(this.getIndiceNuevoEstadoPagoAuto(), this.getIndiceNuevoEstadoPagoAuto());
			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoPagoAuto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoPagoAuto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setEnabled(isHabilitar && this.estadopagoautoConstantesFunciones.activarnombreEstadoPagoAuto);	
		
	};
	
	public void setDefaultControlesEstadoPagoAuto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoPagoAuto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadopagoautoSessionBean.setConGuardarRelaciones(true);			
			this.estadopagoautoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadopagoautoSessionBean.setConGuardarRelaciones(false);			
			this.estadopagoautoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoPagoAuto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
				if(estadopagoautoAux.getId().equals(this.iIdNuevoEstadoPagoAuto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautos) {
				if(estadopagoautoAux.getId().equals(this.iIdNuevoEstadoPagoAuto)) {
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
	
	public int getIndiceActualEstadoPagoAuto(EstadoPagoAuto estadopagoauto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
				if(estadopagoautoAux.getId().equals(estadopagoauto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautos) {
				if(estadopagoautoAux.getId().equals(estadopagoauto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoPagoAuto(EstadoPagoAuto estadopagoautoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
				if(estadopagoautoAux.getEstadoPagoAutoOriginal().getId().equals(estadopagoautoOriginal.getId())) {
					existe=true;
					estadopagoautoOriginal.setId(estadopagoautoAux.getId());
					estadopagoautoOriginal.setVersionRow(estadopagoautoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautos) {
				if(estadopagoautoAux.getEstadoPagoAutoOriginal().getId().equals(estadopagoautoOriginal.getId())) {
					existe=true;
					estadopagoautoOriginal.setId(estadopagoautoAux.getId());
					estadopagoautoOriginal.setVersionRow(estadopagoautoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoPagoAuto(Boolean esParaCancelar) throws Exception {
		estadopagoautosAux=new ArrayList<EstadoPagoAuto>();
		estadopagoautoAux=new EstadoPagoAuto();
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
					if(estadopagoautoAux.getId()<0) {
						estadopagoautosAux.add(estadopagoautoAux);
					}		
				}
				this.iIdNuevoEstadoPagoAuto=0L;
				this.estadopagoautoLogic.getEstadoPagoAutos().removeAll(estadopagoautosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautos) {
					if(estadopagoautoAux.getId()<0) {
						estadopagoautosAux.add(estadopagoautoAux);
					}		
				}
				this.iIdNuevoEstadoPagoAuto=0L;
				this.estadopagoautos.removeAll(estadopagoautosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoPagoAuto 
					&& this.estadopagoautoLogic.getEstadoPagoAutos().size()>0
					) {
					estadopagoautoAux=this.estadopagoautoLogic.getEstadoPagoAutos().get(this.estadopagoautoLogic.getEstadoPagoAutos().size() - 1);
				
					if(estadopagoautoAux.getId()<0) {
						this.estadopagoautoLogic.getEstadoPagoAutos().remove(estadopagoautoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoPagoAuto && this.estadopagoautos.size()>0) {
					estadopagoautoAux=this.estadopagoautos.get(this.estadopagoautos.size() - 1);
				
					if(estadopagoautoAux.getId()<0) {
						this.estadopagoautos.remove(estadopagoautoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoPagoAuto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadopagoauto.getId()<0) {
				this.estadopagoautoLogic.getEstadoPagoAutos().remove(this.estadopagoauto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadopagoauto.getId()<0) {
				this.estadopagoautos.remove(this.estadopagoauto);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoPagoAuto(List<EstadoPagoAuto> estadopagoautosAux) throws Exception {
		EstadoPagoAutoConstantesFunciones.setEstadosInicialesEstadoPagoAuto(estadopagoautosAux);
	}
	
	public void setEstadosInicialesEstadoPagoAuto(EstadoPagoAuto estadopagoautoAux) throws Exception {
		EstadoPagoAutoConstantesFunciones.setEstadosInicialesEstadoPagoAuto(estadopagoautoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoPagoAutoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoPagoAuto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoPagoAutoActual()) {
				if(!this.isEsNuevoEstadoPagoAuto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoPagoAuto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoPagoAuto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoPagoAutoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Pago Automatico ?", "MANTENIMIENTO DE Estado Pago Automatico", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoPagoAuto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoPagoAuto estadopagoauto) throws Exception {
		EstadoPagoAutoConstantesFunciones.seleccionarAsignar(this.estadopagoauto,estadopagoauto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoPagoAuto=this.isPermisoActualizarOriginalEstadoPagoAuto;
			
			
			this.seleccionarAsignar(estadopagoauto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoPagoAutoConstantesFunciones.quitarEspaciosEstadoPagoAuto(this.estadopagoauto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoPagoAuto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadopagoautoSessionBean.setsFuncionBusquedaRapida(this.estadopagoautoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoPagoAuto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoPagoAuto(esParaCancelar);				
				this.cancelarNuevoEstadoPagoAuto(esParaCancelar);								
			}
			
			this.estadopagoauto=new EstadoPagoAuto();
			
			this.inicializarEstadoPagoAuto();
			
			this.actualizarEstadoCeldasBotonesEstadoPagoAuto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoPagoAuto() throws Exception {
		try {
			EstadoPagoAutoConstantesFunciones.inicializarEstadoPagoAuto(this.estadopagoauto);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadopagoautoLogic.getEstadoPagoAutos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoPagoAutos(String sAccionBusqueda,List<EstadoPagoAuto> estadopagoautosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoPagoAuto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoPagoAutoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoPagoAutoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoPagoAuto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Pago Automaticos");		
		parameters.put("busquedapor", EstadoPagoAutoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PagoAuto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoPagoAutoLogic estadopagoautoLogicAuxiliar=new EstadoPagoAutoLogic();
					estadopagoautoLogicAuxiliar.setDatosCliente(estadopagoautoLogic.getDatosCliente());				
					estadopagoautoLogicAuxiliar.setEstadoPagoAutos(estadopagoautosParaReportes);
					
					estadopagoautoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoPagoAutoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadopagoautosParaReportes=estadopagoautoLogicAuxiliar.getEstadoPagoAutos();
					
					//estadopagoautoLogic.getNewConnexionToDeep();
					
					//for (EstadoPagoAuto estadopagoauto:estadopagoautosParaReportes) {
					//	estadopagoautoLogic.deepLoad(estadopagoauto, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadopagoautoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadopagoautoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePagoAuto = AuxiliarReportes.class.getResourceAsStream("PagoAutoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pagoauto", reportFilePagoAuto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoPagoAuto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoPagoAutoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoPagoAutoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoPagoAuto=new JRBeanArrayDataSource(EstadoPagoAutoJInternalFrame.TraerEstadoPagoAutoBeans(estadopagoautosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoPagoAuto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoPagoAutoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoPagoAutoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoPagoAutoBean.TraerEstadoPagoAutoBeans(estadopagoautosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoPagoAutos(sAccionBusqueda,sTipoArchivoReporte,estadopagoautosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoPagoAutos(sAccionBusqueda,sTipoArchivoReporte,estadopagoautosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoPagoAutoActionPerformed(null);
					//this.generarExcelReporteEstadoPagoAutos(sAccionBusqueda,sTipoArchivoReporte,estadopagoautosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoPagoAutos(sAccionBusqueda,sTipoArchivoReporte,estadopagoautosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoPagoAutos(sAccionBusqueda,sTipoArchivoReporte,estadopagoautosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoPagoAutos(sAccionBusqueda,sTipoArchivoReporte,estadopagoautosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoPagoAutos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPagoAuto> estadopagoautosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPagoAutos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPagoAuto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoPagoAuto estadopagoauto : estadopagoautosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoPagoAutoConstantesFunciones.generarExcelReporteDataEstadoPagoAuto("NORMAL",row,workbook,estadopagoauto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoPagoAuto(String sTipo,Row row,Workbook workbook) {
		
		EstadoPagoAutoConstantesFunciones.generarExcelReporteHeaderEstadoPagoAuto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoPagoAutos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPagoAuto> estadopagoautosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPagoAutos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoPagoAuto estadopagoauto : estadopagoautosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoPagoAutoConstantesFunciones.getEstadoPagoAutoDescripcion(estadopagoauto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadopagoauto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoPagoAutos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoPagoAuto> estadopagoautosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoPagoAuto> estadopagoautosRespaldo=null;
		
		classes=EstadoPagoAutoConstantesFunciones.getClassesRelationshipsOfEstadoPagoAuto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadopagoautoLogic.setDatosCliente(this.datosCliente);
		this.estadopagoautoLogic.setDatosDeep(this.datosDeep);
		this.estadopagoautoLogic.setIsConDeep(true);
		
		estadopagoautosRespaldo=this.estadopagoautoLogic.getEstadoPagoAutos();
		
		this.estadopagoautoLogic.setEstadoPagoAutos(estadopagoautosParaReportes);	
		this.estadopagoautoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadopagoautosParaReportes=this.estadopagoautoLogic.getEstadoPagoAutos();
		this.estadopagoautoLogic.setEstadoPagoAutos(estadopagoautosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoPagoAutos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoPagoAuto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoPagoAuto estadopagoauto : estadopagoautosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoPagoAuto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoPagoAutoConstantesFunciones.generarExcelReporteDataEstadoPagoAuto("NORMAL",row,workbook,estadopagoauto,cellStyleDataAux);
		
			
			


				//PagoAuto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PagoAutoConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadopagoauto.getPagoAutos()!=null && estadopagoauto.getPagoAutos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PagoAutoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PagoAutoConstantesFunciones.generarExcelReporteHeaderPagoAuto("RELACIONADO",row,workbook);
				}

				if(estadopagoauto.getPagoAutos()!=null) {
					i2=0;
					for(PagoAuto pagoauto : estadopagoauto.getPagoAutos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PagoAutoConstantesFunciones.generarExcelReporteDataPagoAuto("RELACIONADO",row,workbook,pagoauto,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EstadoPagoAutoConstantesFunciones.getEstadoPagoAutoDescripcion(estadopagoauto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoPagoAuto() throws Exception {		
		this.startProcessEstadoPagoAuto(true);
	}
	
	public void startProcessEstadoPagoAuto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoPagoAuto, this.jScrollPanelDatosEstadoPagoAuto,this.jPanelPaginacionEstadoPagoAuto, this.jScrollPanelDatosEdicionEstadoPagoAuto, this.jPanelAccionesEstadoPagoAuto,this.jPanelAccionesFormularioEstadoPagoAuto,this.jmenuBarEstadoPagoAuto,this.jmenuBarDetalleEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,this.jTtoolBarDetalleEstadoPagoAuto);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPagoAuto=null; 
		
		final JPanel jPanelParametrosReportesEstadoPagoAuto=this.jPanelParametrosReportesEstadoPagoAuto;
		//final JScrollPane jScrollPanelDatosEstadoPagoAuto=this.jScrollPanelDatosEstadoPagoAuto;
		final JTable jTableDatosEstadoPagoAuto=this.jTableDatosEstadoPagoAuto;		
		final JPanel jPanelPaginacionEstadoPagoAuto=this.jPanelPaginacionEstadoPagoAuto;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPagoAuto=this.jScrollPanelDatosEdicionEstadoPagoAuto;
		final JPanel jPanelAccionesEstadoPagoAuto=this.jPanelAccionesEstadoPagoAuto;
		
		JPanel jPanelCamposAuxiliarEstadoPagoAuto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPagoAuto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			jPanelCamposAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jPanelCamposEstadoPagoAuto;
			jPanelAccionesFormularioAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jPanelAccionesFormularioEstadoPagoAuto;
		}
		
		final JPanel jPanelCamposEstadoPagoAuto=jPanelCamposAuxiliarEstadoPagoAuto;
		final JPanel jPanelAccionesFormularioEstadoPagoAuto=jPanelAccionesFormularioAuxiliarEstadoPagoAuto;
		
		
		final JMenuBar jmenuBarEstadoPagoAuto=this.jmenuBarEstadoPagoAuto;
		final JToolBar jTtoolBarEstadoPagoAuto=this.jTtoolBarEstadoPagoAuto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoPagoAuto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPagoAuto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			jmenuBarDetalleAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jmenuBarDetalleEstadoPagoAuto;
			jTtoolBarDetalleAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jTtoolBarDetalleEstadoPagoAuto;
		}
		
		final JMenuBar jmenuBarDetalleEstadoPagoAuto=jmenuBarDetalleAuxiliarEstadoPagoAuto;
		final JToolBar jTtoolBarDetalleEstadoPagoAuto=jTtoolBarDetalleAuxiliarEstadoPagoAuto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPagoAuto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPagoAuto;
			processRunnable.jTableDatos=jTableDatosEstadoPagoAuto;
			processRunnable.jPanelCampos=jPanelCamposEstadoPagoAuto;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPagoAuto;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPagoAuto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPagoAuto;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPagoAuto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPagoAuto;
			processRunnable.jTtoolBar=jTtoolBarEstadoPagoAuto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPagoAuto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoPagoAuto ,jPanelParametrosReportesEstadoPagoAuto,jTableDatosEstadoPagoAuto, /*jScrollPanelDatosEstadoPagoAuto,*/jPanelCamposEstadoPagoAuto,jPanelPaginacionEstadoPagoAuto, /*jScrollPanelDatosEdicionEstadoPagoAuto,*/ jPanelAccionesEstadoPagoAuto,jPanelAccionesFormularioEstadoPagoAuto,jmenuBarEstadoPagoAuto,jmenuBarDetalleEstadoPagoAuto,jTtoolBarEstadoPagoAuto,jTtoolBarDetalleEstadoPagoAuto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoPagoAuto, jScrollPanelDatosEstadoPagoAuto,jPanelPaginacionEstadoPagoAuto, jScrollPanelDatosEdicionEstadoPagoAuto, jPanelAccionesEstadoPagoAuto,jPanelAccionesFormularioEstadoPagoAuto,jmenuBarEstadoPagoAuto,jmenuBarDetalleEstadoPagoAuto,jTtoolBarEstadoPagoAuto,jTtoolBarDetalleEstadoPagoAuto);
						
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
	
	public void finishProcessEstadoPagoAuto() {// throws Exception 
		this.finishProcessEstadoPagoAuto(true);
	}
	
	public void finishProcessEstadoPagoAuto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoPagoAuto, this.jScrollPanelDatosEstadoPagoAuto,this.jPanelPaginacionEstadoPagoAuto, this.jScrollPanelDatosEdicionEstadoPagoAuto, this.jPanelAccionesEstadoPagoAuto,this.jPanelAccionesFormularioEstadoPagoAuto,this.jmenuBarEstadoPagoAuto,this.jmenuBarDetalleEstadoPagoAuto,this.jTtoolBarEstadoPagoAuto,this.jTtoolBarDetalleEstadoPagoAuto);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoPagoAuto=null; 
		
		final JPanel jPanelParametrosReportesEstadoPagoAuto=this.jPanelParametrosReportesEstadoPagoAuto;
		//final JScrollPane jScrollPanelDatosEstadoPagoAuto=this.jScrollPanelDatosEstadoPagoAuto;
		final JTable jTableDatosEstadoPagoAuto=this.jTableDatosEstadoPagoAuto;		
		final JPanel jPanelPaginacionEstadoPagoAuto=this.jPanelPaginacionEstadoPagoAuto;
		//final JScrollPane jScrollPanelDatosEdicionEstadoPagoAuto=this.jScrollPanelDatosEdicionEstadoPagoAuto;
		final JPanel jPanelAccionesEstadoPagoAuto=this.jPanelAccionesEstadoPagoAuto;
		
		JPanel jPanelCamposAuxiliarEstadoPagoAuto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoPagoAuto=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			jPanelCamposAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jPanelCamposEstadoPagoAuto;
			jPanelAccionesFormularioAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jPanelAccionesFormularioEstadoPagoAuto;
		}
		
		final JPanel jPanelCamposEstadoPagoAuto=jPanelCamposAuxiliarEstadoPagoAuto;
		final JPanel jPanelAccionesFormularioEstadoPagoAuto=jPanelAccionesFormularioAuxiliarEstadoPagoAuto;
		
		
		final JMenuBar jmenuBarEstadoPagoAuto=this.jmenuBarEstadoPagoAuto;		
		final JToolBar jTtoolBarEstadoPagoAuto=this.jTtoolBarEstadoPagoAuto;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoPagoAuto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoPagoAuto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			jmenuBarDetalleAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jmenuBarDetalleEstadoPagoAuto;
			jTtoolBarDetalleAuxiliarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jTtoolBarDetalleEstadoPagoAuto;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoPagoAuto=jmenuBarDetalleAuxiliarEstadoPagoAuto;
		final JToolBar jTtoolBarDetalleEstadoPagoAuto=jTtoolBarDetalleAuxiliarEstadoPagoAuto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoPagoAuto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoPagoAuto;
			processRunnable.jTableDatos=jTableDatosEstadoPagoAuto;
			processRunnable.jPanelCampos=jPanelCamposEstadoPagoAuto;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoPagoAuto;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoPagoAuto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoPagoAuto;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoPagoAuto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoPagoAuto;
			processRunnable.jTtoolBar=jTtoolBarEstadoPagoAuto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoPagoAuto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoPagoAuto ,jPanelParametrosReportesEstadoPagoAuto, jTableDatosEstadoPagoAuto,/*jScrollPanelDatosEstadoPagoAuto,*/jPanelCamposEstadoPagoAuto,jPanelPaginacionEstadoPagoAuto, /*jScrollPanelDatosEdicionEstadoPagoAuto,*/ jPanelAccionesEstadoPagoAuto,jPanelAccionesFormularioEstadoPagoAuto,jmenuBarEstadoPagoAuto,jmenuBarDetalleEstadoPagoAuto,jTtoolBarEstadoPagoAuto,jTtoolBarDetalleEstadoPagoAuto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoPagoAuto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoPagoAuto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoPagoAuto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoPagoAuto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoPagoAuto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoPagoAuto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoPagoAuto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoPagoAuto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoPagoAuto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadopagoautoConstantesFunciones.getsFinalQueryEstadoPagoAuto();
		String  finalQueryPaginacionTodos=this.estadopagoautoConstantesFunciones.getsFinalQueryEstadoPagoAuto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoPagoAutoConstantesFunciones.getArrayColumnasGlobalesNoEstadoPagoAuto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoPagoAutoConstantesFunciones.getArrayColumnasGlobalesEstadoPagoAuto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoPagoAutoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadopagoautosEliminados= new ArrayList<EstadoPagoAuto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoPagoAuto();
		
				///*EstadoPagoAutoSessionBean*/this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
			
			if(this.estadopagoautoSessionBean==null) {
				this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
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
					this.iNumeroPaginacion=EstadoPagoAutoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoPagoAutoConstantesFunciones.getClassesForeignKeysOfEstadoPagoAuto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadopagoauto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadopagoautosAux= new ArrayList<EstadoPagoAuto>();
			
				
			estadopagoautoLogic.setDatosCliente(this.datosCliente);
			estadopagoautoLogic.setDatosDeep(this.datosDeep);
			estadopagoautoLogic.setIsConDeep(true);
			
			
			estadopagoautoLogic.getEstadoPagoAutoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadopagoautoLogic.getTodosEstadoPagoAutos(finalQueryGlobal,pagination);
					
					//estadopagoautoLogic.getTodosEstadoPagoAutosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadopagoautoLogic.getEstadoPagoAutos()==null|| estadopagoautoLogic.getEstadoPagoAutos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopagoautosAux= new ArrayList<EstadoPagoAuto>();
							estadopagoautosAux.addAll(estadopagoautoLogic.getEstadoPagoAutos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopagoautosAux= new ArrayList<EstadoPagoAuto>();
							estadopagoautosAux.addAll(estadopagoautos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopagoautoLogic.getTodosEstadoPagoAutos(finalQueryGlobal+"",this.pagination);												
							
							//estadopagoautoLogic.getTodosEstadoPagoAutosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoPagoAutos("Todos",estadopagoautoLogic.getEstadoPagoAutos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadopagoautoLogic.setEstadoPagoAutos(new ArrayList<EstadoPagoAuto>());					
							estadopagoautoLogic.getEstadoPagoAutos().addAll(estadopagoautosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopagoautos=new ArrayList<EstadoPagoAuto>();
							estadopagoautos.addAll(estadopagoautosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoPagoAuto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoPagoAuto=this.idActual;
				
				} else if(this.idEstadoPagoAutoActual!=null && this.idEstadoPagoAutoActual!=0L) {
					idEstadoPagoAuto=idEstadoPagoAutoActual;
				}
				
					
				this.sDetalleReporte=EstadoPagoAutoConstantesFunciones.getDetalleIndicePorId(idEstadoPagoAuto);
				
				this.estadopagoautos=new ArrayList<EstadoPagoAuto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadopagoautoLogic.getEntity(idEstadoPagoAuto);
					
					//estadopagoautoLogic.getEntityWithConnection(idEstadoPagoAuto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopagoautoLogic.setEstadoPagoAutos(new ArrayList<EstadoPagoAuto>());
					estadopagoautoLogic.getEstadoPagoAutos().add(estadopagoautoLogic.getEstadoPagoAuto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopagoautos=new ArrayList<EstadoPagoAuto>();
					this.estadopagoautos.add(estadopagoauto);
				}
				
				if(estadopagoautoLogic.getEstadoPagoAuto()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoPagoAuto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoPagoAuto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopagoautoLogic.getEstadoPagoAutos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopagoautos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadopagoautoLogic.getEstadoPagoAutos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadopagoautos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoPagoAuto estadopagoauto) {
		Boolean permite=true;
		
		if(this.estadopagoauto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoPagoAutoConstantesFunciones.getOrderByListaEstadoPagoAuto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoPagoAutoConstantesFunciones.getOrderByListaEstadoPagoAuto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPagoAuto estadopagoauto:estadopagoautoLogic.getEstadoPagoAutos()) {
				if(estadopagoauto.getsType().equals(Constantes2.S_TOTALES)) {
					estadopagoautoTotales=estadopagoauto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPagoAuto estadopagoauto:this.estadopagoautos) {
				if(estadopagoauto.getsType().equals(Constantes2.S_TOTALES)) {
					estadopagoautoTotales=estadopagoauto;
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
			this.estadopagoautoAux=new EstadoPagoAuto();
			this.estadopagoautoAux.setsType(Constantes2.S_TOTALES);
			this.estadopagoautoAux.setIsNew(false);
			this.estadopagoautoAux.setIsChanged(false);
			this.estadopagoautoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoPagoAutoConstantesFunciones.TotalizarValoresFilaEstadoPagoAuto(this.estadopagoautoLogic.getEstadoPagoAutos(),this.estadopagoautoAux);
				
				this.estadopagoautoLogic.getEstadoPagoAutos().add(this.estadopagoautoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoPagoAutoConstantesFunciones.TotalizarValoresFilaEstadoPagoAuto(this.estadopagoautos,this.estadopagoautoAux);
				
				this.estadopagoautos.add(this.estadopagoautoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadopagoautoTotales=new EstadoPagoAuto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopagoautoLogic.getEstadoPagoAutos().remove(estadopagoautoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadopagoautos.remove(estadopagoautoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadopagoautoTotales=new EstadoPagoAuto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoPagoAuto estadopagoauto:estadopagoautoLogic.getEstadoPagoAutos()) {
				if(estadopagoauto.getsType().equals(Constantes2.S_TOTALES)) {
					estadopagoautoTotales=estadopagoauto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPagoAutoConstantesFunciones.TotalizarValoresFilaEstadoPagoAuto(this.estadopagoautoLogic.getEstadoPagoAutos(),estadopagoautoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoPagoAuto estadopagoauto:this.estadopagoautos) {
				if(estadopagoauto.getsType().equals(Constantes2.S_TOTALES)) {
					estadopagoautoTotales=estadopagoauto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoPagoAutoConstantesFunciones.TotalizarValoresFilaEstadoPagoAuto(this.estadopagoautos,estadopagoautoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoPagoAuto() {
		this.isPermisoTodoEstadoPagoAuto=false;
		this.isPermisoNuevoEstadoPagoAuto=false;
		this.isPermisoActualizarEstadoPagoAuto=false;
		this.isPermisoActualizarOriginalEstadoPagoAuto=false;
		this.isPermisoEliminarEstadoPagoAuto=false;
		this.isPermisoGuardarCambiosEstadoPagoAuto=false;
		this.isPermisoConsultaEstadoPagoAuto=false;
		this.isPermisoBusquedaEstadoPagoAuto=false;
		this.isPermisoReporteEstadoPagoAuto=false;		
		this.isPermisoOrdenEstadoPagoAuto=false;		
		this.isPermisoPaginacionMedioEstadoPagoAuto=false;		
		this.isPermisoPaginacionAltoEstadoPagoAuto=false;
		this.isPermisoPaginacionTodoEstadoPagoAuto=false;
		this.isPermisoCopiarEstadoPagoAuto=false;		
		this.isPermisoVerFormEstadoPagoAuto=false;		
		this.isPermisoDuplicarEstadoPagoAuto=false;		
		this.isPermisoOrdenEstadoPagoAuto=false;		
	}
	
	public void setPermisosUsuarioEstadoPagoAuto(Boolean isPermiso) {
		this.isPermisoTodoEstadoPagoAuto=isPermiso;
		this.isPermisoNuevoEstadoPagoAuto=isPermiso;
		this.isPermisoActualizarEstadoPagoAuto=isPermiso;
		this.isPermisoActualizarOriginalEstadoPagoAuto=isPermiso;
		this.isPermisoEliminarEstadoPagoAuto=isPermiso;
		this.isPermisoGuardarCambiosEstadoPagoAuto=isPermiso;
		this.isPermisoConsultaEstadoPagoAuto=isPermiso;
		this.isPermisoBusquedaEstadoPagoAuto=isPermiso;
		this.isPermisoReporteEstadoPagoAuto=isPermiso;
		this.isPermisoOrdenEstadoPagoAuto=isPermiso;		
		this.isPermisoPaginacionMedioEstadoPagoAuto=isPermiso;		
		this.isPermisoPaginacionAltoEstadoPagoAuto=isPermiso;		
		this.isPermisoPaginacionTodoEstadoPagoAuto=isPermiso;		
		this.isPermisoCopiarEstadoPagoAuto=isPermiso;		
		this.isPermisoVerFormEstadoPagoAuto=isPermiso;		
		this.isPermisoDuplicarEstadoPagoAuto=isPermiso;
		this.isPermisoOrdenEstadoPagoAuto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoPagoAuto(Boolean isPermiso) {
		//this.isPermisoTodoEstadoPagoAuto=isPermiso;
		this.isPermisoNuevoEstadoPagoAuto=isPermiso;
		this.isPermisoActualizarEstadoPagoAuto=isPermiso;
		this.isPermisoActualizarOriginalEstadoPagoAuto=isPermiso;
		this.isPermisoEliminarEstadoPagoAuto=isPermiso;
		this.isPermisoGuardarCambiosEstadoPagoAuto=isPermiso;
		//this.isPermisoConsultaEstadoPagoAuto=isPermiso;
		//this.isPermisoBusquedaEstadoPagoAuto=isPermiso;
		//this.isPermisoReporteEstadoPagoAuto=isPermiso;
		//this.isPermisoOrdenEstadoPagoAuto=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoPagoAuto=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoPagoAuto=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoPagoAuto=isPermiso;		
		//this.isPermisoCopiarEstadoPagoAuto=isPermiso;		
		//this.isPermisoDuplicarEstadoPagoAuto=isPermiso;
		//this.isPermisoOrdenEstadoPagoAuto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPagoAutoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PagoAutoConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoPagoAutoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPagoAuto=false;
		this.isTienePermisosPagoAuto=this.verificarGetPermisosUsuarioOpcionEstadoPagoAutoClaseRelacionada(this.opcionsRelacionadas,PagoAutoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoPagoAuto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoPagoAutoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPagoAuto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoPagoAutoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoPagoAutoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoPagoAutoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPagoAuto && this.jInternalFrameDetalleFormEstadoPagoAuto!=null && this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.remove(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoPagoAuto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoPagoAutoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoPagoAutoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoPagoAuto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoPagoAuto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoPagoAuto=this.isPermisoActualizarEstadoPagoAuto;
			this.isPermisoEliminarEstadoPagoAuto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoPagoAuto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoPagoAuto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoPagoAuto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoPagoAuto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoPagoAuto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPagoAuto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoPagoAuto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoPagoAuto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoPagoAuto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoPagoAuto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoPagoAuto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoPagoAuto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoPagoAuto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoPagoAuto.setToolTipText(this.jTableDatosEstadoPagoAuto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoPagoAuto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoPagoAuto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoPagoAutoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoPagoAutoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoPagoAuto() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPagoAuto && this.estadopagoautoConstantesFunciones.mostrarPagoAutoEstadoPagoAuto && !EstadoPagoAutoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pago Auto");
			reporte.setsDescripcion("Pago Auto");
			this.tiposRelaciones.add(reporte);
		}
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	public void inicializarCombosForeignKeyEstadoPagoAutoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoPagoAutoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoPagoAutoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoPagoAutoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoPagoAutoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoPagoAuto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoPagoAuto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoPagoAuto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoPagoAuto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPagoAuto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoPagoAuto(EstadoPagoAuto estadopagoauto)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoPagoAuto(EstadoPagoAuto estadopagoauto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoPagoAuto()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoPagoAuto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoPagoAuto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoPagoAuto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoPagoAuto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoPagoAuto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoPagoAuto(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoPagoAuto()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoPagoAutoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoPagoAutoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoPagoAutoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean(); 
		this.estadopagoautoConstantesFunciones=new EstadoPagoAutoConstantesFunciones(); 
		this.estadopagoautoBean=new EstadoPagoAuto();//(this.estadopagoautoConstantesFunciones); 		
		this.estadopagoautoReturnGeneral=new EstadoPagoAutoParameterReturnGeneral(); 
		
		this.estadopagoautoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadopagoautoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoPagoAutoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoPagoAutoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoPagoAutoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoPagoAuto(true);
			
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
			
			this.estadopagoautoConstantesFunciones=new EstadoPagoAutoConstantesFunciones(); 
			this.estadopagoautoBean=new EstadoPagoAuto();//this.estadopagoautoConstantesFunciones); 			
			this.estadopagoautoReturnGeneral=new EstadoPagoAutoParameterReturnGeneral(); 
		
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Pago Automatico Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadopagoauto=new EstadoPagoAuto();
			this.estadopagoautos = new ArrayList<EstadoPagoAuto>();
			this.estadopagoautosAux = new ArrayList<EstadoPagoAuto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic=new EstadoPagoAutoLogic();
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadopagoautoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadopagoautoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoPagoAuto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPagoAuto);	
					}
					
					if(this.jInternalFrameImportacionEstadoPagoAuto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPagoAuto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoPagoAuto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoPagoAuto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPagoAuto);
				this.jInternalFrameDetalleFormEstadoPagoAuto.setVisible(false);
				this.jInternalFrameDetalleFormEstadoPagoAuto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPagoAuto);
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoPagoAuto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPagoAuto);
					this.jInternalFrameImportacionEstadoPagoAuto.setVisible(false);
					this.jInternalFrameImportacionEstadoPagoAuto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoPagoAuto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPagoAuto);
					this.jInternalFrameOrderByEstadoPagoAuto.setVisible(false);
					this.jInternalFrameOrderByEstadoPagoAuto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoPagoAutoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoPagoAutoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadopagoautoReturnGeneral=new EstadoPagoAutoParameterReturnGeneral();
			
			this.estadopagoautoParameterGeneral=new EstadoPagoAutoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadopagoautoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoPagoAutoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PagoAutoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPagoAutoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopagoautoSessionBean.getEsGuardarRelacionado(),this.estadopagoautoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoPagoAutoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadopagoautoSessionBean.getEsGuardarRelacionado(),this.estadopagoautoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaDuplicarEstadoPagoAuto=true;
			this.isVisibilidadCeldaCopiarEstadoPagoAuto=true;
			this.isVisibilidadCeldaVerFormEstadoPagoAuto=true;
			this.isVisibilidadCeldaOrdenEstadoPagoAuto=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
			this.isVisibilidadCeldaModificarEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=false;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoPagoAuto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoPagoAuto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoPagoAuto(false);
			
			this.setPermisosUsuarioEstadoPagoAuto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadopagoautoSessionBean.getEsGuardarRelacionado() && this.estadopagoautoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoPagoAutoClasesRelacionadas();
			}
			
			if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoPagoAutoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoPagoAuto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoPagoAuto();
			}
			
			if(!this.isPermisoBusquedaEstadoPagoAuto) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoPagoAuto,this.isPermisoPaginacionMedioEstadoPagoAuto,this.isPermisoPaginacionTodoEstadoPagoAuto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoPagoAutoConstantesFunciones.getTiposSeleccionarEstadoPagoAuto());
				
				this.tiposColumnasSelect=EstadoPagoAutoConstantesFunciones.getTiposSeleccionarEstadoPagoAuto(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoPagoAuto();				
				//this.tiposRelacionesSelect=EstadoPagoAutoConstantesFunciones.getTiposRelacionesEstadoPagoAuto(true);
				
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
			//if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoPagoAuto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoPagoAuto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoPagoAuto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPagoAuto() ;
			
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
			
			
			this.pagoautoLogic=new PagoAutoLogic(); 
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
				estadopagoautoImplementable= (EstadoPagoAutoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPagoAutoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadopagoautoImplementableHome= (EstadoPagoAutoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoPagoAutoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadopagoautos= new ArrayList<EstadoPagoAuto>();
			this.estadopagoautosEliminados= new ArrayList<EstadoPagoAuto>();
						
			this.isEsNuevoEstadoPagoAuto=false;
			this.esParaAccionDesdeFormularioEstadoPagoAuto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoPagoAuto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoPagoAuto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoPagoAutoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoPagoAuto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoPagoAuto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoPagoAuto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoPagoAuto();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoPagoAuto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoPagoAuto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoPagoAuto() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PagoAutoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoPagoAuto")) {
				iIndex=this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();	
				
				

				if(sTitle.equals("Pago Autos")) {
					if(!PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoPagoAuto();

						this.cargarParteTabPanelRelacionadaPagoAuto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoPagoAuto();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPagoAuto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoPagoAuto.cargarSessionConBeanSwingJInternalFramePagoAuto(false,true,iIndex);
		this.jButtonPagoAutoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPagoAuto();

		//this.jTabbedPaneRelacionesEstadoPagoAuto.updateUI();
		//this.jTabbedPaneRelacionesEstadoPagoAuto.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoPagoAuto.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PagoAuto")) {
				int row=this.jTableDatosEstadoPagoAuto.getSelectedRow();
				jButtonPagoAutoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pago Auto")) {

					if(this.isTienePermisosPagoAuto && this.estadopagoautoConstantesFunciones.mostrarPagoAutoEstadoPagoAuto && !EstadoPagoAutoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pago Autos"+"("+PagoAutoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pago Autos");

						if(estadopagoautoConstantesFunciones.resaltarPagoAutoEstadoPagoAuto!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadopagoautoConstantesFunciones.resaltarPagoAutoEstadoPagoAuto);
						}

						jmenuItem.setEnabled(this.estadopagoautoConstantesFunciones.activarPagoAutoEstadoPagoAuto);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PagoAuto"));

						

						this.jInternalFrameDetalleFormEstadoPagoAuto.jmenuDetalleEstadoPagoAuto.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoPagoAuto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoPagoAuto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoPagoAuto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoPagoAutoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoPagoAuto();
		
		this.cargarCombosFrameForeignKeyEstadoPagoAuto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoPagoAuto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoPagoAuto();
		}
	}
	
	
	
	public void jButtonNuevoEstadoPagoAutoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			
			if(jTableDatosEstadoPagoAuto.getRowCount()>=1) {
				jTableDatosEstadoPagoAuto.removeRowSelectionInterval(0, jTableDatosEstadoPagoAuto.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoPagoAuto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoPagoAuto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoPagoAuto(true);			
			//this.estadopagoauto=new EstadoPagoAuto();
			//this.estadopagoauto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPagoAuto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto() ;
			
			if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPagoAuto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadopagoauto);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);				
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoPagoAuto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoPagoAutoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoPagoAuto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoPagoAuto.getSelectedRows().length;			
			}
			
			estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoPagoAuto--;			
				//EstadoPagoAuto estadopagoautoAux= new EstadoPagoAuto();			
				//estadopagoautoAux.setId(this.iIdNuevoEstadoPagoAuto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoPagoAuto estadopagoautoOrigen=new EstadoPagoAuto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoPagoAuto estadopagoautoOrigen : estadopagoautosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadopagoautoOrigen =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadopagoautoOrigen =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoPagoAuto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadopagoauto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoPagoAuto(estadopagoautoOrigen,this.estadopagoauto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopagoautoLogic.getEstadoPagoAutos().add(this.estadopagoautoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopagoautos.add(this.estadopagoautoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
				
				this.jTableDatosEstadoPagoAuto.setRowSelectionInterval(this.getIndiceNuevoEstadoPagoAuto(), this.getIndiceNuevoEstadoPagoAuto());
				
				int iLastRow =  this.jTableDatosEstadoPagoAuto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPagoAuto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPagoAuto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();									
		
			EstadoPagoAuto estadopagoautoOrigen=new EstadoPagoAuto();
			EstadoPagoAuto estadopagoautoDestino=new EstadoPagoAuto();
				
			estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoPagoAuto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadopagoautosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoPagoAuto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopagoautoOrigen =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopagoautoOrigen =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadopagoautoDestino =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadopagoautoDestino =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadopagoautoOrigen =estadopagoautosSeleccionados.get(0);
				estadopagoautoDestino =estadopagoautosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoPagoAuto(estadopagoautoOrigen,estadopagoautoDestino,true,false);
				
				estadopagoautoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadopagoautoDestino,estadopagoautoLogic.getEstadoPagoAutos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadopagoautoDestino,estadopagoautos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
				
				//this.jTableDatosEstadoPagoAuto.setRowSelectionInterval(this.getIndiceNuevoEstadoPagoAuto(), this.getIndiceNuevoEstadoPagoAuto());
				
				int iLastRow =  this.jTableDatosEstadoPagoAuto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoPagoAuto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoPagoAuto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoPagoAuto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoPagoAuto.isVisible();
			
			
			this.jPanelParametrosReportesEstadoPagoAuto.setVisible(!isVisible);
			this.jPanelPaginacionEstadoPagoAuto.setVisible(!isVisible);
			this.jPanelAccionesEstadoPagoAuto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoPagoAuto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoPagoAuto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoPagoAuto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoPagoAuto();
			
			this.abrirFrameOrderByEstadoPagoAuto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoPagoAuto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoPagoAuto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPagoAuto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoPagoAuto.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoPagoAuto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoPagoAuto.setSize(this.jInternalFrameDetalleFormEstadoPagoAuto.iWidthFormulario,this.jInternalFrameDetalleFormEstadoPagoAuto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoPagoAuto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoPagoAuto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoPagoAuto.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoPagoAuto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoPagoAuto.jContentPaneDetalleEstadoPagoAuto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPagoAuto.jContentPaneDetalleEstadoPagoAuto.getWidth(),EstadoPagoAutoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoPagoAuto.jContentPaneDetalleEstadoPagoAuto.getWidth(),EstadoPagoAutoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoPagoAuto.jContentPaneDetalleEstadoPagoAuto.getWidth(),EstadoPagoAutoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPagoAuto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoPagoAuto.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoPagoAuto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoPagoAuto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoPagoAuto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoPagoAuto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPagoAuto,false,this);
				} else {
					this.jInternalFrameOrderByEstadoPagoAuto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoPagoAuto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoPagoAuto);
				this.jInternalFrameOrderByEstadoPagoAuto.setVisible(false);
				this.jInternalFrameOrderByEstadoPagoAuto.setSelected(false);
				
				this.jInternalFrameOrderByEstadoPagoAuto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPagoAuto"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoPagoAuto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoPagoAuto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoPagoAuto==null) {
				
				this.jInternalFrameImportacionEstadoPagoAuto=new ImportacionJInternalFrame(EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoPagoAuto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoPagoAuto);
				this.jInternalFrameImportacionEstadoPagoAuto.setVisible(false);
				this.jInternalFrameImportacionEstadoPagoAuto.setSelected(false);


				this.jInternalFrameImportacionEstadoPagoAuto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPagoAuto"));
				this.jInternalFrameImportacionEstadoPagoAuto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPagoAuto"));
				this.jInternalFrameImportacionEstadoPagoAuto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPagoAuto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoPagoAuto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoPagoAuto==null) {
				this.jInternalFrameReporteDinamicoEstadoPagoAuto=new ReporteDinamicoJInternalFrame(EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoPagoAuto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoPagoAuto);
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPagoAuto"));
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPagoAuto"));
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPagoAuto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPagoAuto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPagoAuto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoPagoAuto.jContentPaneDetalleEstadoPagoAuto.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoPagoAuto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoPagoAuto);
			
	       	this.jInternalFrameDetalleFormEstadoPagoAuto.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoPagoAuto.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoPagoAuto.dispose();
			//this.jInternalFrameDetalleFormEstadoPagoAuto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoPagoAuto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoPagoAuto.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoPagoAuto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoPagoAuto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoPagoAuto.setVisible(true);
	        this.jInternalFrameImportacionEstadoPagoAuto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoPagoAuto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoPagoAuto.setVisible(true);
	        this.jInternalFrameOrderByEstadoPagoAuto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoPagoAuto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoPagoAuto.setVisible(false);
	        this.jInternalFrameOrderByEstadoPagoAuto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoPagoAuto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoPagoAuto.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoPagoAuto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoPagoAuto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoPagoAuto.setVisible(false);
	        this.jInternalFrameImportacionEstadoPagoAuto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoPagoAuto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoPagoAuto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoPagoAuto(true);
			//this.isEsNuevoEstadoPagoAuto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoPagoAuto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPagoAuto(false) ;
			
			if(estadopagoautoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getEsGuardarRelacionado() && PagoAutoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPagoAutoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPagoAuto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoPagoAutoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoPagoAuto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoPagoAuto(true);
			//this.isEsNuevoEstadoPagoAuto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadopagoauto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoPagoAuto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoPagoAuto(false) ;
			
			if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoPagoAuto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoPagoAuto(false);
			
			//if(!this.isEsNuevoEstadoPagoAuto) {								
				int intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
				
			}
			
			if(this.permiteMantenimiento(this.estadopagoauto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoPagoAuto=true;
					this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
					this.isEsNuevoEstadoPagoAuto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoPagoAuto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoPagoAuto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPagoAuto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(false);
				
				this.habilitarDeshabilitarControlesEstadoPagoAuto(false);
			
												
				
				if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoPagoAuto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoPagoAutoActionPerformed(evt,estadopagoautoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoPagoAuto(this.estadopagoauto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoPagoAuto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadopagoautoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadopagoauto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				this.estadopagoauto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				this.estadopagoauto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadopagoauto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoPagoAutoModel) this.jTableDatosEstadoPagoAuto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoPagoAuto=true;
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
				this.isEsNuevoEstadoPagoAuto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoPagoAuto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(false);
				
				this.habilitarDeshabilitarControlesEstadoPagoAuto(false);
				
				
				
				if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoPagoAuto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoPagoAuto.getRowCount()>=1) {
				jTableDatosEstadoPagoAuto.removeRowSelectionInterval(0, jTableDatosEstadoPagoAuto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoPagoAuto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoPagoAuto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(false) ;
			
			this.isEsNuevoEstadoPagoAuto=false;
			
			if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoPagoAuto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoPagoAuto(false);
				
				//SI ES MANUAL
				if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoPagoAuto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoPagoAuto--;			
			//EstadoPagoAuto estadopagoautoAux= new EstadoPagoAuto();			
			//estadopagoautoAux.setId(this.iIdNuevoEstadoPagoAuto);
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoPagoAuto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
			
			this.estadopagoauto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadopagoautoLogic.getEstadoPagoAutos().add(this.estadopagoautoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadopagoautos.add(this.estadopagoautoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			
			this.jTableDatosEstadoPagoAuto.setRowSelectionInterval(this.getIndiceNuevoEstadoPagoAuto(), this.getIndiceNuevoEstadoPagoAuto());
			
			int iLastRow =  this.jTableDatosEstadoPagoAuto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoPagoAuto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoPagoAuto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoPagoAuto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPagoAuto(false);
			
			//SI ES MANUAL
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPagoAuto();
			}
			
			//this.abrirFrameTreeEstadoPagoAuto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Pago AutomaticoS ?", "MANTENIMIENTO DE Estado Pago Automatico", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoPagoAuto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoPagoAuto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadopagoautoReturnGeneral=estadopagoautoLogic.procesarImportacionEstadoPagoAutosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadopagoautoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoPagoAutoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoPagoAuto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoPagoAuto.setFileImportacion(this.jInternalFrameImportacionEstadoPagoAuto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoPagoAuto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoPagoAuto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoPagoAuto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoPagoAuto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		

		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoPagoAutoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoPagoAutoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoPagoAutos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoPagoAuto estadopagoauto:estadopagoautosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadopagoauto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoPagoAuto(row);				
			//	iRow++;
			//}				
			
			//for(EstadoPagoAuto estadopagoautoAux:estadopagoautosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoPagoAuto(estadopagoautoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPagoAuto(false);
			
			//SI ES MANUAL
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoPagoAuto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPagoAuto(false);
			
			//SI ES MANUAL
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPagoAuto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoPagoAutoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoPagoAuto(false);
			
			//SI ES MANUAL
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoPagoAuto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadopagoautoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoPagoAuto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoPagoAuto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoPagoAuto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoPagoAuto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoPagoAuto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoPagoAuto.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoPagoAuto.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoPagoAuto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoPagoAuto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoPagoAuto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoPagoAuto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoPagoAuto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoPagoAuto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoPagoAuto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPagoAuto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoPagoAuto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoPagoAuto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoPagoAuto();
		
		this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPagoAuto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPagoAuto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPagoAuto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPagoAuto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoPagoAuto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoPagoAuto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoPagoAuto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoPagoAuto.jCheckBoxPostAccionNuevoEstadoPagoAuto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoPagoAuto.jCheckBoxPostAccionSinCerrarEstadoPagoAuto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoPagoAuto.jCheckBoxPostAccionSinMensajeEstadoPagoAuto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoPagoAuto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoPagoAuto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoPagoAuto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
				this.jInternalFrameDetalleFormEstadoPagoAuto.jCheckBoxPostAccionNuevoEstadoPagoAuto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoPagoAuto.jCheckBoxPostAccionSinCerrarEstadoPagoAuto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoPagoAuto.jCheckBoxPostAccionSinMensajeEstadoPagoAuto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoPagoAuto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoPagoAuto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoPagoAuto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoPagoAuto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoPagoAuto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoPagoAuto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoPagoAuto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoPagoAuto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoPagoAuto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoPagoAuto(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoPagoAuto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoPagoAuto() throws Exception {
		try	{
			if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPagoAuto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPagoAuto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoPagoAuto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoPagoAuto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoPagoAuto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoPagoAuto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoPagoAuto.addItem(reporte);
			}
			
			
			if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoPagoAuto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoPagoAuto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoPagoAuto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoPagoAuto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoPagoAuto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoPagoAuto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoPagoAuto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPagoAuto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoPagoAuto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoPagoAuto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoPagoAuto(Boolean esInicializar) throws Exception {				
		if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoPagoAuto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoPagoAuto() throws Exception {
		this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoPagoAuto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoPagoAutoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoPagoAutoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoPagoAutoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPagoAutoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoPagoAutoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoPagoAutoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoPagoAuto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadopagoautoLogic.getEstadoPagoAutos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadopagoautos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoPagoAuto.setModel(new EstadoPagoAutoModel(this.estadopagoautoLogic.getEstadoPagoAutos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoPagoAuto.setModel(new EstadoPagoAutoModel(this.estadopagoautos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoPagoAuto!=null && this.jInternalFrameOrderByEstadoPagoAuto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoPagoAuto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoPagoAuto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPagoAuto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoPagoAutoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO,estadopagoautoConstantesFunciones.resaltarSeleccionarEstadoPagoAuto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoPagoAutoConstantesFunciones.SCLASSWEBTITULO,estadopagoautoConstantesFunciones.resaltarSeleccionarEstadoPagoAuto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoPagoAuto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPagoAuto,EstadoPagoAutoConstantesFunciones.LABEL_ID));

		if(this.estadopagoautoConstantesFunciones.mostraridEstadoPagoAuto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPagoAutoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadopagoautoConstantesFunciones.resaltaridEstadoPagoAuto,this.estadopagoautoConstantesFunciones.activaridEstadoPagoAuto,this,true,"idEstadoPagoAuto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopagoautoConstantesFunciones.resaltaridEstadoPagoAuto,this.estadopagoautoConstantesFunciones.activaridEstadoPagoAuto,this,true,"idEstadoPagoAuto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoPagoAuto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoPagoAuto,EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadopagoautoConstantesFunciones.mostrarnombreEstadoPagoAuto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadopagoautoConstantesFunciones.resaltarnombreEstadoPagoAuto,this.estadopagoautoConstantesFunciones.activarnombreEstadoPagoAuto,this,true,"nombreEstadoPagoAuto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadopagoautoConstantesFunciones.resaltarnombreEstadoPagoAuto,this.estadopagoautoConstantesFunciones.activarnombreEstadoPagoAuto,this,true,"nombreEstadoPagoAuto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoPagoAutoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPagoAuto && this.estadopagoautoConstantesFunciones.mostrarPagoAutoEstadoPagoAuto && !EstadoPagoAutoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pago Autos");
				tableColumn.setHeaderValue("Pago Autos");
				tableColumn.setCellRenderer(new PagoAutoTableCell(estadopagoautoConstantesFunciones.resaltarPagoAutoEstadoPagoAuto,this,this.estadopagoautoConstantesFunciones.activarPagoAutoEstadoPagoAuto));
				tableColumn.setCellEditor(new PagoAutoTableCell(estadopagoautoConstantesFunciones.resaltarPagoAutoEstadoPagoAuto,this,this.estadopagoautoConstantesFunciones.activarPagoAutoEstadoPagoAuto));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoPagoAuto.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopagoautoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopagoautoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPagoAuto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadopagoautoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadopagoautoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoPagoAuto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadopagoautoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadopagoautoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoPagoAuto.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosEstadoPagoAuto.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoPagoAuto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadopagoautoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoPagoAuto.moveColumn(this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoPagoAuto.moveColumn(this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadopagoautoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoPagoAuto.moveColumn(this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoPagoAuto.moveColumn(this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoPagoAuto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoPagoAuto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoPagoAuto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoPagoAuto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoPagoAuto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoPagoAuto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoPagoAuto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoPagoAuto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadopagoautoLogic.getEstadoPagoAutos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadopagoautos.size()-1;
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
		//this.jTableDatosEstadoPagoAuto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoPagoAuto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoPagoAuto();
			
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
				
				//this.isEsNuevoEstadoPagoAuto=false;
					
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
				if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPagoAuto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPagoAuto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadopagoauto.getsType().equals("DUPLICADO")
				   || this.estadopagoauto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoPagoAuto=true;
				
				} else {
					this.isEsNuevoEstadoPagoAuto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadopagoauto.getId()>=0 && !this.estadopagoauto.getIsNew()) {						
						this.isEsNuevoEstadoPagoAuto=false;
						
					} else {
						this.isEsNuevoEstadoPagoAuto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoPagoAuto(esRelaciones);						
				
				this.seleccionarEstadoPagoAuto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadopagoauto.getId()<0) {
					this.isEsNuevoEstadoPagoAuto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoPagoAuto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoPagoAuto(evt,rowIndex);
				}	
				
				if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoPagoAuto: " + this.dDif); 
					}
				}								
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoPagoAuto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadopagoauto)) {
					if(this.estadopagoauto.getId()>0) {
						this.estadopagoauto.setIsDeleted(true);
						
						this.estadopagoautosEliminados.add(this.estadopagoauto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadopagoautoLogic.getEstadoPagoAutos().remove(this.estadopagoauto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadopagoautos.remove(this.estadopagoauto);				
					}
					
					
					((EstadoPagoAutoModel) this.jTableDatosEstadoPagoAuto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoPagoAuto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoPagoAuto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoPagoAuto) {
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoPagoAuto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoPagoAuto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoauto);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoPagoAuto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoPagoAuto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoPagoAuto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPagoAuto(EstadoPagoAuto estadopagoauto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoPagoAuto(estadopagoauto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoPagoAuto(EstadoPagoAuto estadopagoauto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoPagoAuto(estadopagoauto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoPagoAuto(estadopagoauto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoPagoAuto(estadopagoauto);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoPagoAuto(EstadoPagoAuto estadopagoauto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setText(estadopagoauto.getId().toString());
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setText(estadopagoauto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoPagoAuto estadopagoautoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadopagoautoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoPagoAuto estadopagoautoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadopagoautoLocal=this.estadopagoauto;
			} else {
				estadopagoautoLocal=this.estadopagoautoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadopagoautoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoPagoAuto(estadopagoautoLocal,true);
					
					if(estadopagoautoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadopagoautoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadopagoautoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoPagoAuto(EstadoPagoAuto estadopagoauto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPagoAuto(estadopagoauto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(estadopagoauto);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPagoAuto(EstadoPagoAuto estadopagoauto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoPagoAuto(estadopagoauto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoPagoAuto(EstadoPagoAuto estadopagoauto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.getText()==null || this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.getText()=="" || this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setText("0");
			}

			if(conColumnasBase) {estadopagoauto.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPagoAutoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPagoAuto.jLabelIdEstadoPagoAuto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadopagoauto.setnombre(this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoPagoAuto.jLabelnombreEstadoPagoAuto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoPagoAuto(EstadoPagoAuto estadopagoautoBean,EstadoPagoAuto estadopagoauto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoPagoAuto(EstadoPagoAuto estadopagoautoOrigen,EstadoPagoAuto estadopagoauto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopagoautoOrigen.getId()!=null && !estadopagoautoOrigen.getId().equals(0L))) {estadopagoauto.setId(estadopagoautoOrigen.getId());}}
			if(conDefault || (!conDefault && estadopagoautoOrigen.getnombre()!=null && !estadopagoautoOrigen.getnombre().equals(""))) {estadopagoauto.setnombre(estadopagoautoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPagoAuto(EstadoPagoAuto estadopagoauto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setText(estadopagoauto.getId().toString());
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setText(estadopagoauto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoPagoAuto(EstadoPagoAutoBean estadopagoautoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setText(estadopagoautoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setText(estadopagoautoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoPagoAuto(EstadoPagoAutoParameterReturnGeneral estadopagoautoReturnGeneral,EstadoPagoAutoBean estadopagoautoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoPagoAuto estadopagoautoLocal=new EstadoPagoAuto();
			
			estadopagoautoLocal=estadopagoautoReturnGeneral.getEstadoPagoAuto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadopagoautoLocal.getId()!=null && !estadopagoautoLocal.getId().equals(0L))) {estadopagoautoBean.setId(estadopagoautoLocal.getId());}}
			if(conDefault || (!conDefault && estadopagoautoLocal.getnombre()!=null && !estadopagoautoLocal.getnombre().equals(""))) {estadopagoautoBean.setnombre(estadopagoautoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoPagoAutoGenerico(Long idEstadoPagoAutoSeleccionado,JComboBox jComboBoxEstadoPagoAuto,List<EstadoPagoAuto> estadopagoautosLocal)throws Exception {
		try {
			EstadoPagoAuto  estadopagoautoTemp=null;

			for(EstadoPagoAuto estadopagoautoAux:estadopagoautosLocal) {
				if(estadopagoautoAux.getId()!=null && estadopagoautoAux.getId().equals(idEstadoPagoAutoSeleccionado)) {
					estadopagoautoTemp=estadopagoautoAux;
					break;
				}
			}

			jComboBoxEstadoPagoAuto.setSelectedItem(estadopagoautoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoPagoAutoGenerico(JComboBox jComboBoxEstadoPagoAuto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPagoAuto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoPagoAuto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoPagoAuto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoPagoAuto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoPagoAuto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoPagoAuto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PagoAuto")) {
			jButtonPagoAutoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopagoauto=(EstadoPagoAuto) estadopagoautoLogic.getEstadoPagoAutos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopagoauto =(EstadoPagoAuto) estadopagoautos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoPagoAuto estadopagoautoRow=new EstadoPagoAuto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopagoautoRow=(EstadoPagoAuto) estadopagoautoLogic.getEstadoPagoAutos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadopagoautoRow=(EstadoPagoAuto) estadopagoautos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPagoAutoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoPagoAuto estadopagoauto) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopagoauto = (EstadoPagoAuto)this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadopagoauto = (EstadoPagoAuto)this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadopagoauto!=null) {
						this.estadopagoauto = estadopagoauto;
					} else {
						this.estadopagoauto = new EstadoPagoAuto();
					}
				}

				if(this.isTienePermisosPagoAuto && this.permiteMantenimiento(this.estadopagoauto)) {
					PagoAutoBeanSwingJInternalFrame pagoautoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup=new PagoAutoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pagoautoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup;
					} else {
						pagoautoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame;
					}

					List<EstadoPagoAuto> estadopagoautos=new ArrayList<EstadoPagoAuto>();
					estadopagoautos.add(this.estadopagoauto);
					if(!esRelacionado) {
						//pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setConGuardarRelaciones(false);
						//pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pagoautoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoPagoAuto.cargarPagoAutoBeanSwingJInternalFrame(estadopagoautos,this.estadopagoauto,pagoautoBeanSwingJInternalFrame,/*conInicializar,*/pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getConGuardarRelaciones(),pagoautoBeanSwingJInternalFrame.pagoautoSessionBean.getEsGuardarRelacionado());
					pagoautoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pagoautoBeanSwingJInternalFrame.actualizarEstadoPanelsPagoAuto("no_relacionado");

						pagoautoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PagoAutoConstantesFunciones.ITAMANIOFILATABLA + (PagoAutoConstantesFunciones.ITAMANIOFILATABLA/2));

						pagoautoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoPagoAuto=(TitledBorder)this.jScrollPanelDatosEstadoPagoAuto.getBorder();
						TitledBorder titledBorderPagoAuto=(TitledBorder)pagoautoBeanSwingJInternalFrame.jScrollPanelDatosPagoAuto.getBorder();

						titledBorderPagoAuto.setTitle(titledBorderEstadoPagoAuto.getTitle() + " -> Pago Auto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pagoautoBeanSwingJInternalFrame);
						}

						pagoautoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pagoautoBeanSwingJInternalFrame);

						pagoautoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pago Auto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoPagoAuto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto));			
			this.jButtonDuplicarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaDuplicarEstadoPagoAuto && this.isPermisoDuplicarEstadoPagoAuto));			
			this.jButtonCopiarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaCopiarEstadoPagoAuto && this.isPermisoCopiarEstadoPagoAuto));
			this.jButtonVerFormEstadoPagoAuto.setVisible((this.isVisibilidadCeldaVerFormEstadoPagoAuto && this.isPermisoVerFormEstadoPagoAuto));
			
			this.jButtonAbrirOrderByEstadoPagoAuto.setVisible((this.isVisibilidadCeldaOrdenEstadoPagoAuto && this.isPermisoOrdenEstadoPagoAuto));			
			
			this.jButtonNuevoRelacionesEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto));			
			this.jButtonNuevoGuardarCambiosEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaModificarEstadoPagoAuto && this.isPermisoActualizarEstadoPagoAuto));	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaActualizarEstadoPagoAuto && this.isPermisoActualizarEstadoPagoAuto));	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaEliminarEstadoPagoAuto && this.isPermisoEliminarEstadoPagoAuto));
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarEstadoPagoAuto.setVisible(this.isVisibilidadCeldaCancelarEstadoPagoAuto);							
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto));						
			this.jButtonDuplicarToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaDuplicarEstadoPagoAuto && this.isPermisoDuplicarEstadoPagoAuto));						
			this.jButtonCopiarToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaCopiarEstadoPagoAuto && this.isPermisoCopiarEstadoPagoAuto));			
			this.jButtonVerFormToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaVerFormEstadoPagoAuto && this.isPermisoVerFormEstadoPagoAuto));			
			this.jButtonAbrirOrderByToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaOrdenEstadoPagoAuto && this.isPermisoOrdenEstadoPagoAuto));
			this.jButtonNuevoRelacionesToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));			
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaModificarEstadoPagoAuto && this.isPermisoActualizarEstadoPagoAuto));	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaActualizarEstadoPagoAuto  && this.isPermisoActualizarEstadoPagoAuto));	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaEliminarEstadoPagoAuto && this.isPermisoEliminarEstadoPagoAuto));
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarToolBarEstadoPagoAuto.setVisible(this.isVisibilidadCeldaCancelarEstadoPagoAuto);				
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto));			
			this.jMenuItemDuplicarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaDuplicarEstadoPagoAuto && this.isPermisoDuplicarEstadoPagoAuto));			
			this.jMenuItemCopiarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaCopiarEstadoPagoAuto && this.isPermisoCopiarEstadoPagoAuto));			
			this.jMenuItemVerFormEstadoPagoAuto.setVisible((this.isVisibilidadCeldaVerFormEstadoPagoAuto && this.isPermisoVerFormEstadoPagoAuto));			
			this.jMenuItemAbrirOrderByEstadoPagoAuto.setVisible((this.isVisibilidadCeldaOrdenEstadoPagoAuto && this.isPermisoOrdenEstadoPagoAuto));			
			//this.jMenuItemMostrarOcultarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaOrdenEstadoPagoAuto && this.isPermisoOrdenEstadoPagoAuto));
			this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto.setVisible((this.isVisibilidadCeldaOrdenEstadoPagoAuto && this.isPermisoOrdenEstadoPagoAuto));			
			//this.jMenuItemDetalleMostrarOcultarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaOrdenEstadoPagoAuto && this.isPermisoOrdenEstadoPagoAuto));			
			this.jMenuItemNuevoRelacionesEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto));			
			this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto.setVisible((this.isVisibilidadCeldaNuevoEstadoPagoAuto && this.isPermisoNuevoEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));									
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemModificarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaModificarEstadoPagoAuto && this.isPermisoActualizarEstadoPagoAuto));	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemActualizarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaActualizarEstadoPagoAuto && this.isPermisoActualizarEstadoPagoAuto));	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemEliminarEstadoPagoAuto.setVisible((this.isVisibilidadCeldaEliminarEstadoPagoAuto && this.isPermisoEliminarEstadoPagoAuto));
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemCancelarEstadoPagoAuto.setVisible(this.isVisibilidadCeldaCancelarEstadoPagoAuto);				
			}
			
			this.jMenuItemGuardarCambiosEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));						
			this.jMenuItemGuardarCambiosTablaEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=this.jButtonNuevoEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoPagoAuto=this.jButtonDuplicarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaCopiarEstadoPagoAuto=this.jButtonCopiarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaVerFormEstadoPagoAuto=this.jButtonVerFormEstadoPagoAuto.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoPagoAuto=this.jButtonAbrirOrderByEstadoPagoAuto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=this.jButtonNuevoRelacionesEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaModificarEstadoPagoAuto=this.jButtonModificarEstadoPagoAuto.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaGuardarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=this.jButtonGuardarCambiosTablaEstadoPagoAuto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=this.jButtonNuevoToolBarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=this.jButtonNuevoRelacionesToolBarEstadoPagoAuto.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.isVisibilidadCeldaModificarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarToolBarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarToolBarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarToolBarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarToolBarEstadoPagoAuto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPagoAuto=this.jButtonGuardarCambiosToolBarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=this.jButtonGuardarCambiosTablaToolBarEstadoPagoAuto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=this.jMenuItemNuevoEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=this.jMenuItemNuevoRelacionesEstadoPagoAuto.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.isVisibilidadCeldaModificarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemModificarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemActualizarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemEliminarEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemCancelarEstadoPagoAuto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoPagoAuto=this.jMenuItemGuardarCambiosEstadoPagoAuto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=this.jMenuItemGuardarCambiosTablaEstadoPagoAuto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoPagoAuto(Boolean esInicializar) {
		if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPagoAuto();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoPagoAuto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoPagoAuto() {
		this.jButtonNuevoEstadoPagoAuto.setVisible(this.isPermisoNuevoEstadoPagoAuto);			
		this.jButtonDuplicarEstadoPagoAuto.setVisible(this.isPermisoDuplicarEstadoPagoAuto);			
		this.jButtonCopiarEstadoPagoAuto.setVisible(this.isPermisoCopiarEstadoPagoAuto);			
		this.jButtonVerFormEstadoPagoAuto.setVisible(this.isPermisoVerFormEstadoPagoAuto);			
		
		this.jButtonAbrirOrderByEstadoPagoAuto.setVisible(this.isPermisoOrdenEstadoPagoAuto);					
		
		this.jButtonNuevoRelacionesEstadoPagoAuto.setVisible(this.isPermisoNuevoEstadoPagoAuto);			
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarEstadoPagoAuto.setVisible(this.isPermisoActualizarEstadoPagoAuto);	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarEstadoPagoAuto.setVisible(this.isPermisoActualizarEstadoPagoAuto);	
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarEstadoPagoAuto.setVisible(this.isPermisoEliminarEstadoPagoAuto);
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarEstadoPagoAuto.setVisible(this.isVisibilidadCeldaCancelarEstadoPagoAuto);						
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.setVisible(this.isPermisoGuardarCambiosEstadoPagoAuto);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.setVisible(this.isPermisoActualizarEstadoPagoAuto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPagoAuto() {
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarEstadoPagoAuto.setVisible(this.isPermisoActualizarEstadoPagoAuto);	
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarEstadoPagoAuto.setVisible(this.isPermisoActualizarEstadoPagoAuto);	
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarEstadoPagoAuto.setVisible(this.isPermisoEliminarEstadoPagoAuto);
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarEstadoPagoAuto.setVisible(this.isVisibilidadCeldaCancelarEstadoPagoAuto);							
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.setVisible((this.isVisibilidadCeldaGuardarEstadoPagoAuto && this.isPermisoGuardarCambiosEstadoPagoAuto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoPagoAuto() {
		if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoPagoAuto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoPagoAuto() {
	}
	
	public void jTableDatosEstadoPagoAutoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoPagoAuto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoPagoAutoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.getestadopagoauto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopagoauto==null) {
						this.estadopagoauto = new EstadoPagoAuto();
					}

					this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
				}

				if(this.estadopagoauto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadopagoauto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPagoAuto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoPagoAutoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.getestadopagoauto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadopagoauto==null) {
						this.estadopagoauto = new EstadoPagoAuto();
					}

					this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);
				}

				if(this.estadopagoauto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadopagoauto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoPagoAuto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoPagoAuto() {
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoPagoAuto.dispose();
			this.jInternalFrameDetalleFormEstadoPagoAuto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
			this.jInternalFrameReporteDinamicoEstadoPagoAuto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoPagoAuto.dispose();
			this.jInternalFrameReporteDinamicoEstadoPagoAuto=null;
		}
		
		if(this.jInternalFrameImportacionEstadoPagoAuto!=null) {
			this.jInternalFrameImportacionEstadoPagoAuto.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoPagoAuto.dispose();
			this.jInternalFrameImportacionEstadoPagoAuto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoPagoAuto();
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoPagoAuto")) {
				jButtonDuplicarEstadoPagoAutoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoPagoAuto")) {
				jButtonCopiarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoPagoAuto")) {
				jButtonVerFormEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoPagoAuto")) {
				jButtonDuplicarEstadoPagoAutoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoPagoAuto")) {
				jButtonDuplicarEstadoPagoAutoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoPagoAuto")) {
				jButtonModificarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoPagoAuto")) {
				jButtonModificarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoPagoAuto")) {
				jButtonModificarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoPagoAuto")) {
				jButtonActualizarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoPagoAuto")) {
				jButtonActualizarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoPagoAuto")) {
				jButtonActualizarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoPagoAuto")) {
				jButtonEliminarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoPagoAuto")) {
				jButtonEliminarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoPagoAuto")) {
				jButtonEliminarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoPagoAuto")) {
				jButtonCancelarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoPagoAuto")) {
				jButtonCancelarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoPagoAuto")) {
				jButtonCancelarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoPagoAuto")) {
				jButtonCerrarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoPagoAuto")) {
				jButtonCerrarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoPagoAuto")) {
				jButtonCerrarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoPagoAuto")) {
				jButtonMostrarOcultarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoPagoAuto")) {
				jButtonCancelarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoPagoAuto")) {
				jButtonCopiarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoPagoAuto")) {
				jButtonVerFormEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoPagoAuto")) {
				jButtonCopiarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoPagoAuto")) {
				jButtonVerFormEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoPagoAuto")) {
				jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoPagoAuto")) {
				jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoPagoAuto")) {
				jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoPagoAuto")) {
				jButtonAnterioresEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoPagoAuto")) {
				jButtonAnterioresEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoPagoAuto")) {
				jButtonAnterioresEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoPagoAuto")) {
				jButtonSiguientesEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoPagoAuto")) {
				jButtonSiguientesEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoPagoAuto")) {
				jButtonSiguientesEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoPagoAuto") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoPagoAuto")) {
				jButtonAbrirOrderByEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoPagoAuto") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoPagoAuto")) {
				jButtonMostrarOcultarEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPagoAuto")) {
				jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoPagoAuto")) {
				jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoPagoAuto")) {
				jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoPagoAuto")) {
				jButtonCerrarReporteDinamicoEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoPagoAuto")) {
				jButtonGenerarReporteDinamicoEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoPagoAuto")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoPagoAuto")) {
				jButtonCerrarImportacionEstadoPagoAutoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoPagoAuto")) {
				
				jButtonGenerarImportacionEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoPagoAuto")) {
				
				jButtonAbrirImportacionEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoPagoAuto")) {
				jComboBoxTiposAccionesEstadoPagoAutoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoPagoAuto")) {
				jComboBoxTiposRelacionesEstadoPagoAutoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoPagoAuto")) {
				jComboBoxTiposAccionesEstadoPagoAutoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoPagoAuto")) {
				
				jComboBoxTiposSeleccionarEstadoPagoAutoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoPagoAuto")) {
				jTextFieldValorCampoGeneralEstadoPagoAutoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoPagoAuto")) {
				jButtonAbrirOrderByEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoPagoAuto")) {
				jButtonAbrirOrderByEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoPagoAuto")) {
				jButtonCerrarOrderByEstadoPagoAutoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPagoAutoBusqueda")) {
				this.jButtonidEstadoPagoAutoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPagoAutoBusqueda")) {
				this.jButtonnombreEstadoPagoAutoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoPagoAuto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoPagoAuto estadopagoautoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadopagoautoLocal=this.estadopagoauto;
			} else {
				estadopagoautoLocal=this.estadopagoautoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
							
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
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
			
			


			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
								
						
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
								
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
							
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
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
			
			


			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
								
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoPagoAuto")) {
					jCheckBoxSeleccionarTodosEstadoPagoAutoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoPagoAuto")) {
					jCheckBoxSeleccionadosEstadoPagoAutoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoPagoAuto")) {
					
				}
				
				


				
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
												
				
				


				
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
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
			
			


			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoPagoAutoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadopagoauto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadopagoauto);
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
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
				
				


				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoPagoAuto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoPagoAuto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoPagoAutoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadopagoautoAnterior =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoPagoAuto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoPagoAutoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoPagoAuto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadopagoauto =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadopagoauto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoPagoAuto")) {
				
				}
				
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoPagoAuto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoPagoAuto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoPagoAuto")) {
			
			}
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoPagoAuto();
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoPagoAuto")) {
				jButtonDuplicarEstadoPagoAutoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoPagoAuto")) {
				jButtonCopiarEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoPagoAuto")) {
				jButtonVerFormEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoPagoAuto")) {
				jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoPagoAuto")) {
				jButtonModificarEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoPagoAuto")) {
				jButtonActualizarEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoPagoAuto")) {
				jButtonEliminarEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoPagoAuto")) {
				jButtonCancelarEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoPagoAuto")) {
				jButtonCerrarEstadoPagoAutoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoPagoAuto")) {
				jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoPagoAuto")) {
				jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoPagoAuto")) {
				jButtonAbrirOrderByEstadoPagoAutoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoPagoAuto")) {
				jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoPagoAuto")) {
				jButtonAnterioresEstadoPagoAutoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoPagoAuto")) {
				jButtonSiguientesEstadoPagoAutoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoPagoAutoBusqueda")) {
				this.jButtonidEstadoPagoAutoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoPagoAutoBusqueda")) {
				this.jButtonnombreEstadoPagoAutoBusquedaActionPerformed(evt);
			}
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoPagoAuto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoPagoAuto")) {
				closingInternalFrameEstadoPagoAuto();
				
			} else if(sTipo.equals("jButtonCancelarEstadoPagoAuto")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoPagoAuto = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoPagoAutoBeanSwingJInternalFrame jInternalFrameParent=(EstadoPagoAutoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPagoAuto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoPagoAutoActionPerformed(null);
			}
			
			EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadopagoauto,new Object(),this.estadopagoautoParameterGeneral,this.estadopagoautoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoPagoAuto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoPagoAuto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoPagoAuto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadopagoauto)) {
			if(!esControlTabla) {
				if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);			
				}
				
				if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoPagoAuto(this.estadopagoauto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopagoautoReturnGeneral=estadopagoautoLogic.procesarEventosEstadoPagoAutosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopagoautoLogic.getEstadoPagoAutos(),this.estadopagoauto,this.estadopagoautoParameterGeneral,this.isEsNuevoEstadoPagoAuto,classes);//this.estadopagoautoLogic.getEstadoPagoAuto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoPagoAuto(this.estadopagoautoReturnGeneral,this.estadopagoautoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPagoAuto(classes,this.estadopagoautoReturnGeneral,this.estadopagoautoBean,false);
					}
						
					if(this.estadopagoautoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto());	
					}
						
					if(this.estadopagoautoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto(),classes);//this.estadopagoautoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoPagoAuto(this.estadopagoauto,classes);//this.estadopagoautoBean);									
				}
			
				if(EstadoPagoAutoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoPagoAuto(this.estadopagoauto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoPagoAuto(this.estadopagoauto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadopagoautoAnterior!=null) {
						this.estadopagoauto=this.estadopagoautoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadopagoautoReturnGeneral=estadopagoautoLogic.procesarEventosEstadoPagoAutosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopagoautoLogic.getEstadoPagoAutos(),this.estadopagoauto,this.estadopagoautoParameterGeneral,this.isEsNuevoEstadoPagoAuto,classes);//this.estadopagoautoLogic.getEstadoPagoAuto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadopagoautoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadopagoautoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadopagoautoReturnGeneral.getEstadoPagoAuto(),estadopagoautoLogic.getEstadoPagoAutos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadopagoautoReturnGeneral.getEstadoPagoAuto(),this.estadopagoautos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoPagoAuto.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoPagoAuto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoPagoAuto();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoPagoAuto() throws Exception {
		
		EstadoPagoAutoModel estadopagoautoModel=(EstadoPagoAutoModel)this.jTableDatosEstadoPagoAuto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadopagoautoModel.estadopagoautos=this.estadopagoautoLogic.getEstadoPagoAutos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadopagoautoModel.estadopagoautos=this.estadopagoautos;
		}
		
		
		((EstadoPagoAutoModel) this.jTableDatosEstadoPagoAuto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoPagoAuto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadopagoautoAnterior(),this.estadopagoautoLogic.getEstadoPagoAutos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadopagoautoAnterior(),this.estadopagoautos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoPagoAuto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoPagoAuto(EstadoPagoAuto estadopagoauto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PagoAuto.class)) {
					this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(estadopagoauto.getPagoAutos());
					this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
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
										
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopagoauto,new Object(),generalEntityParameterGeneral,this.estadopagoautoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadopagoautoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoPagoAutoConstantesFunciones.getClassesRelationshipsOfEstadoPagoAuto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoPagoAutoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoPagoAuto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoPagoAuto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoPagoAutoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadopagoauto,new Object(),generalEntityParameterGeneral,this.estadopagoautoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoPagoAuto(EstadoPagoAutoBean estadopagoautoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PagoAuto.class)) {
					this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoLogic.setPagoAutos(estadopagoauto.getPagoAutos());
					this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPagoAuto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoPagoAuto(ArrayList<Classe> classes,EstadoPagoAutoReturnGeneral estadopagoautoReturnGeneral,EstadoPagoAutoBean estadopagoautoBean,Boolean conDefault) throws Exception {
		
			this.estadopagoautoBean.setPagoAutos(estadopagoautoReturnGeneral.getEstadoPagoAuto().getPagoAutos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoPagoAuto(EstadoPagoAuto estadopagoauto,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PagoAuto.class)) {
					estadopagoauto.setPagoAutos(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoBeanSwingJInternalFrame.pagoautoLogic.getPagoAutos());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.estadopagoauto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoPagoAuto = new EstadoPagoAutoDetalleFormJInternalFrame(jDesktopPane,this.estadopagoautoSessionBean.getConGuardarRelaciones(),this.estadopagoautoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoPagoAuto);
		this.jInternalFrameDetalleFormEstadoPagoAuto.setVisible(false);
		this.jInternalFrameDetalleFormEstadoPagoAuto.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.estadopagoautoLogic=this.estadopagoautoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoPagoAuto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoPagoAuto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoPagoAuto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoPagoAuto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoPagoAuto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPagoAuto"));
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"ModificarEstadoPagoAuto"));

		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPagoAuto"));
					
		this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemModificarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPagoAuto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPagoAuto"));
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPagoAuto"));
						
		this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemActualizarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPagoAuto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"EliminarEstadoPagoAuto"));
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPagoAuto"));
								
		this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemEliminarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPagoAuto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CancelarEstadoPagoAuto"));
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPagoAuto"));
					
		this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemCancelarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPagoAuto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemDetalleCerrarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPagoAuto"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPagoAuto"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPagoAuto"));
		
		
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPagoAuto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonidEstadoPagoAutoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPagoAutoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonnombreEstadoPagoAutoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPagoAutoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPagoAuto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoPagoAuto"));
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoPagoAuto"));
		}
		
		this.jTableDatosEstadoPagoAuto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoPagoAuto"));
		
		this.jTableDatosEstadoPagoAuto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoPagoAuto"));
		
		this.jButtonNuevoEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"NuevoEstadoPagoAuto"));
		
		this.jButtonDuplicarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"DuplicarEstadoPagoAuto"));
		
		this.jButtonCopiarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"CopiarEstadoPagoAuto"));
		
		this.jButtonVerFormEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"VerFormEstadoPagoAuto"));
		
		
		this.jButtonNuevoToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoPagoAuto"));
			
		this.jButtonDuplicarToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoPagoAuto"));
			
		this.jMenuItemNuevoEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoPagoAuto"));
			
		this.jMenuItemDuplicarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoPagoAuto"));		
		
		
		this.jButtonNuevoRelacionesEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoPagoAuto"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoPagoAuto"));
			
		this.jMenuItemNuevoRelacionesEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoPagoAuto"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"ModificarEstadoPagoAuto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonModificarToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoPagoAuto"));
			
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemModificarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoPagoAuto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"ActualizarEstadoPagoAuto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonActualizarToolBarEstadoPagoAuto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoPagoAuto"));
				
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemActualizarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoPagoAuto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"EliminarEstadoPagoAuto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonEliminarToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoPagoAuto"));
						
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemEliminarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoPagoAuto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CancelarEstadoPagoAuto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonCancelarToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoPagoAuto"));
			
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemCancelarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoPagoAuto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoPagoAuto"));		
		
		
		this.jButtonCerrarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CerrarEstadoPagoAuto"));
		
		
		this.jButtonCerrarToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoPagoAuto"));
			
		this.jMenuItemCerrarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoPagoAuto"));
			
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jMenuItemDetalleCerrarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoPagoAuto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoPagoAuto"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoPagoAuto"));
		}
		
		this.jButtonCopiarToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoPagoAuto"));
			
		this.jButtonVerFormToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoPagoAuto"));
		
		this.jMenuItemGuardarCambiosEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoPagoAuto"));
			
		this.jMenuItemCopiarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoPagoAuto"));		
		
		this.jMenuItemVerFormEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoPagoAuto"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPagoAuto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoPagoAuto"));
			
		this.jMenuItemGuardarCambiosTablaEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoPagoAuto"));		
		
		
		
		this.jButtonRecargarInformacionEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoPagoAuto"));
					
		this.jButtonRecargarInformacionToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoPagoAuto"));
		
		this.jMenuItemRecargarInformacionEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoPagoAuto"));		
		
		
		
		this.jButtonAnterioresEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"AnterioresEstadoPagoAuto"));
		
		
		this.jButtonAnterioresToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoPagoAuto"));
		
		this.jMenuItemAnterioresEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoPagoAuto"));		
		
		
		this.jButtonSiguientesEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"SiguientesEstadoPagoAuto"));
		
		
		this.jButtonSiguientesToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoPagoAuto"));
			
		this.jMenuItemSiguientesEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoPagoAuto"));
			
		this.jMenuItemAbrirOrderByEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoPagoAuto"));
			
		this.jMenuItemMostrarOcultarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoPagoAuto"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoPagoAuto"));
			
		this.jMenuItemDetalleMostarOcultarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoPagoAuto"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoPagoAuto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoPagoAuto"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoPagoAuto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoPagoAuto"));

		this.jCheckBoxSeleccionadosEstadoPagoAuto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoPagoAuto"));
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoPagoAuto"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoPagoAuto"));
			
		this.jComboBoxTiposAccionesEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoPagoAuto"));
					
		this.jComboBoxTiposSeleccionarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoPagoAuto"));
			
		this.jTextFieldValorCampoGeneralEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoPagoAuto"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonidEstadoPagoAutoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPagoAutoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonnombreEstadoPagoAutoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPagoAutoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoPagoAuto!=null) {
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPagoAuto"));
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPagoAuto"));
				this.jInternalFrameReporteDinamicoEstadoPagoAuto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPagoAuto"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoPagoAuto"));				
			//this.jButtonGenerarReporteDinamicoEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoPagoAuto"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoPagoAuto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoPagoAuto!=null) {
				this.jInternalFrameImportacionEstadoPagoAuto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoPagoAuto"));
				this.jInternalFrameImportacionEstadoPagoAuto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoPagoAuto"));
				this.jInternalFrameImportacionEstadoPagoAuto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoPagoAuto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoPagoAuto"));
			
			this.jButtonAbrirOrderByToolBarEstadoPagoAuto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoPagoAuto"));			
			
			if(this.jInternalFrameOrderByEstadoPagoAuto!=null) {
				this.jInternalFrameOrderByEstadoPagoAuto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoPagoAuto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoPagoAuto.jTabbedPaneRelacionesEstadoPagoAuto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoPagoAuto"));
		
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
            		closingInternalFrameEstadoPagoAuto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoPagoAuto = (JInternalFrameBase)event.getSource();
	            	
	            EstadoPagoAutoBeanSwingJInternalFrame jInternalFrameParent=(EstadoPagoAutoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoPagoAuto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoPagoAutoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoPagoAuto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoPagoAutoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoPagoAuto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoPagoAuto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoPagoAuto";
		inputMap = this.jButtonNuevoEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoPagoAuto";
		inputMap = this.jButtonNuevoRelacionesEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoPagoAutoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoPagoAuto";
		inputMap = this.jButtonModificarEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoPagoAutoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoPagoAuto";
		inputMap = this.jButtonActualizarEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoPagoAutoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoPagoAuto";
		inputMap = this.jButtonEliminarEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoPagoAutoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoPagoAuto";
		inputMap = this.jButtonCancelarEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoPagoAutoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoPagoAuto";
		inputMap = this.jButtonCerrarEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoPagoAutoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoPagoAuto";
		inputMap = this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonGuardarCambiosEstadoPagoAuto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoPagoAutoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoPagoAuto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoPagoAutoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoPagoAuto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoPagoAutoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoPagoAuto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoPagoAutoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoPagoAuto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoPagoAutoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonidEstadoPagoAutoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoPagoAutoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoPagoAuto.jButtonnombreEstadoPagoAutoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoPagoAutoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoPagoAuto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoPagoAutoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoPagoAutoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoPagoAuto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoPagoAuto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
					estadopagoautoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPagoAuto estadopagoautoAux:estadopagoautos) {
					estadopagoautoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoPagoAutoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPagoAuto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
						estadopagoautoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPagoAuto estadopagoautoAux:estadopagoautos) {
						estadopagoautoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPagoAuto estadopagoautoAux:estadopagoautos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPagoAuto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPagoAuto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPagoAuto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoPagoAutoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoPagoAuto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoPagoAuto.getSelectedRows();
			
			EstadoPagoAuto estadopagoautoLocal=new EstadoPagoAuto();
			
			//this.seleccionarTodosEstadoPagoAuto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadopagoautoLocal =(EstadoPagoAuto) this.estadopagoautoLogic.getEstadoPagoAutos().toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadopagoautoLocal =(EstadoPagoAuto) this.estadopagoautos.toArray()[this.jTableDatosEstadoPagoAuto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadopagoautoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
						estadopagoautoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoPagoAuto estadopagoautoAux:estadopagoautos) {
						estadopagoautoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoPagoAuto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoPagoAuto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoPagoAuto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoPagoAutoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoPagoAutoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoPagoAutoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoPagoAuto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoPagoAuto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautoLogic.getEstadoPagoAutos()) {
				
						if(sTipoSeleccionar.equals(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopagoautoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPagoAuto estadopagoautoAux:estadopagoautos) {
					
						if(sTipoSeleccionar.equals(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadopagoautoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoPagoAutoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoPagoAuto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoPagoAuto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoPagoAuto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoPagoAuto) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoPagoAuto(conSplash);
				
					this.generarReporteEstadoPagoAutosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoPagoAutosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPagoAutosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoPagoAutosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPagoAuto();
				
				this.exportarEstadoPagoAutosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoPagoAutos();
				//this.importarEstadoPagoAutos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoPagoAuto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoPagoAutosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Pago Automatico", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoPagoAuto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoPagoAuto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoPagoAuto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoPagoAuto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoPagoAuto.jComboBoxTiposAccionesFormularioEstadoPagoAuto.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoPagoAuto();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoPagoAuto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoPagoAutoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoPagoAuto();
			
			if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
			EstadoPagoAuto estadopagoauto=new EstadoPagoAuto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoPagoAuto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoPagoAuto.getSelectedItem();
			
			
			
			
			estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadopagoautosSeleccionados.size()==1) {
				for(EstadoPagoAuto estadopagoautoAux:estadopagoautosSeleccionados) {
					estadopagoauto=estadopagoautoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pago Auto")) {
					jButtonPagoAutoActionPerformed(null,rowIndex,true,false,estadopagoauto);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoPagoAuto();
			
      		//this.finishProcessEstadoPagoAuto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoPagoAutoReturnGeneral() throws Exception {
		if(this.estadopagoautoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadopagoautoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadopagoautoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadopagoautoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadopagoautoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadopagoautoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoPagoAuto(false);
		}
		
		if(this.estadopagoautoReturnGeneral.getConRetornoLista() || this.estadopagoautoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadopagoautoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopagoautoLogic.setEstadoPagoAutos(this.estadopagoautoReturnGeneral.getEstadoPagoAutos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadopagoautoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadopagoautoLogic.setEstadoPagoAuto(this.estadopagoautoReturnGeneral.getEstadoPagoAuto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoPagoAuto(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoPagoAuto() throws Exception {
		
		
	}
	
	public ArrayList<EstadoPagoAuto> getEstadoPagoAutosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoPagoAuto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoPagoAuto estadopagoautoAux:estadopagoautoLogic.getEstadoPagoAutos()) {
					if(estadopagoautoAux.getIsSelected()) {
						estadopagoautosSeleccionados.add(estadopagoautoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoPagoAuto estadopagoautoAux:this.estadopagoautos) {
					if(estadopagoautoAux.getIsSelected()) {
						estadopagoautosSeleccionados.add(estadopagoautoAux);				
					}
				}
			}
			
			if(estadopagoautosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadopagoautosSeleccionados.addAll(this.estadopagoautoLogic.getEstadoPagoAutos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadopagoautosSeleccionados.addAll(this.estadopagoautos);				
					}
				}
			}
		} else {
			estadopagoautosSeleccionados.add(this.estadopagoauto);
		}
		
		return estadopagoautosSeleccionados;
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
	
	public void generarReporteEstadoPagoAutosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoPagoAutosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoPagoAutosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPagoAutosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoPagoAutosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoPagoAutosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Pago Automatico",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoPagoAutosSeleccionados() throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoPagoAutosSeleccionados() throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoPagoAutosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoPagoAutosSeleccionados() throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoPagoAuto();
		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoPagoAuto();
		
		
		//this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados ,estadopagoautoImplementable,estadopagoautoImplementableHome);
	}
	
	public void mostrarImportacionEstadoPagoAutos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoPagoAuto();
		
		this.abrirFrameImportacionEstadoPagoAuto();		
		
			
		//this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados ,estadopagoautoImplementable,estadopagoautoImplementableHome);
	}
	
	public void importarEstadoPagoAutos() throws Exception {		
	
	}
	
	public void exportarEstadoPagoAutosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoPagoAutosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoPagoAutosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoPagoAutosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Pago Automatico",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoPagoAutosSeleccionados() throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoPagoAuto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoPagoAuto estadopagoautoAux:estadopagoautosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoPagoAuto(estadopagoautoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadopagoautoAux.setsDetalleGeneralEntityReporte(estadopagoautoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoPagoAuto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoPagoAutoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPagoAutoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoPagoAuto(EstadoPagoAuto estadopagoauto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadopagoauto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopagoauto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadopagoauto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoPagoAutosSeleccionados() throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoPagoAutos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoPagoAuto(row);				
				iRow++;
			}				
			
			for(EstadoPagoAuto estadopagoautoAux:estadopagoautosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoPagoAuto(estadopagoautoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoPagoAutosSeleccionados() throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();		
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadopagoauto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadopagoautos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadopagoauto");
			//elementRoot.appendChild(element);
		
			for(EstadoPagoAuto estadopagoautoAux:estadopagoautosSeleccionados) {
				element = document.createElement("estadopagoauto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoPagoAuto(estadopagoautoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Pago Automatico",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoPagoAuto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPagoAutoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPagoAutoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoPagoAuto(EstadoPagoAuto estadopagoauto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadopagoauto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadopagoauto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoPagoAuto(EstadoPagoAuto estadopagoauto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoPagoAutoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadopagoauto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoPagoAutoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadopagoauto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(EstadoPagoAutoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadopagoauto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoPagoAutosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados=new ArrayList<EstadoPagoAuto>();
		
		estadopagoautosSeleccionados=this.getEstadoPagoAutosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoPagoAuto(estadopagoautosSeleccionados);
		
		this.generarReporteEstadoPagoAutos("Todos",estadopagoautosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoPagoAuto(ArrayList<EstadoPagoAuto> estadopagoautosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoPagoAuto estadopagoautoAux:estadopagoautosSeleccionados) {
				estadopagoautoAux.setsDetalleGeneralEntityReporte(estadopagoautoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoPagoAutoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadopagoautoAux.setsDescripcionGeneralEntityReporte1(estadopagoautoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoPagoAutoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoPagoAuto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoPagoAuto=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=false;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
			this.isVisibilidadCeldaModificarEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=true;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
			this.isVisibilidadCeldaModificarEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=true;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=true;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
			this.isVisibilidadCeldaModificarEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=true;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=true;
			this.isVisibilidadCeldaModificarEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=false;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=false;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
			this.isVisibilidadCeldaModificarEstadoPagoAuto=true;
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=false;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
			this.isVisibilidadCeldaCancelarEstadoPagoAuto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoPagoAuto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoPagoAutoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=true;
		} else {
			this.actualizarEstadoPanelsEstadoPagoAuto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoPagoAuto=false;
			//this.isVisibilidadCeldaVerFormEstadoPagoAuto=false;
			this.isVisibilidadCeldaDuplicarEstadoPagoAuto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadopagoautoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadopagoautoSessionBean.getEsGuardarRelacionado()) {
			if(!estadopagoautoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;												
			}
			
			this.jButtonCerrarEstadoPagoAuto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoPagoAuto=false;
		}
		
		if(!this.permiteMantenimiento(this.estadopagoauto)) {
			this.isVisibilidadCeldaActualizarEstadoPagoAuto=false;
			this.isVisibilidadCeldaEliminarEstadoPagoAuto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoPagoAuto() {
		this.isVisibilidadCeldaNuevoEstadoPagoAuto=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoPagoAuto=false;
	}
	
	public void actualizarEstadoPanelsEstadoPagoAuto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEdicionEstadoPagoAuto.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoPagoAuto!=null) {
				this.jScrollPanelDatosEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoPagoAuto!=null) {
				this.jPanelPaginacionEstadoPagoAuto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoPagoAuto!=null) {
				this.jPanelParametrosReportesEstadoPagoAuto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadopagoautoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoPagoAutoParaPagoAutos() throws Exception {
		Boolean isPaginaPopupPagoAuto=false;

		try {

			if(this.estadopagoautoSessionBean==null) {
				this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean=new PagoAutoSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.setsPathNavegacionActual(estadopagoautoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PagoAutoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPagoAuto=this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePagoAuto(true);
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePagoAuto(EstadoPagoAutoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.setisBusquedaDesdeForeignKeySesionEstadoPagoAuto(true);
			this.jInternalFrameDetalleFormEstadoPagoAuto.pagoautoSessionBean.setlidEstadoPagoAutoActual(this.idEstadoPagoAutoActual);

			estadopagoautoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoPagoAuto(true);
			estadopagoautoSessionBean.setlIdEstadoPagoAutoActualForeignKey(this.idEstadoPagoAutoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoPagoAutoSessionBean estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
		
		if(this.estadopagoautoSessionBean==null) {
			this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
		}
		
		this.estadopagoautoSessionBean.setsUltimaBusquedaEstadoPagoAuto(this.getsAccionBusqueda());
		this.estadopagoautoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadopagoautoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoPagoAutoSessionBean estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
		
		if(this.estadopagoautoSessionBean==null) {
			this.estadopagoautoSessionBean=new EstadoPagoAutoSessionBean();
		}
		
		if(this.estadopagoautoSessionBean.getsUltimaBusquedaEstadoPagoAuto()!=null&&!this.estadopagoautoSessionBean.getsUltimaBusquedaEstadoPagoAuto().equals("")) {
			this.setsAccionBusqueda(estadopagoautoSessionBean.getsUltimaBusquedaEstadoPagoAuto());
			this.setiNumeroPaginacion(estadopagoautoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadopagoautoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadopagoautoSessionBean.setsUltimaBusquedaEstadoPagoAuto("");
		this.estadopagoautoSessionBean.setiNumeroPaginacion(EstadoPagoAutoConstantesFunciones.INUMEROPAGINACION);
		this.estadopagoautoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoPagoAuto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoPagoAuto() {
		this.updateBorderResaltarBusquedasFormularioEstadoPagoAuto();
		this.updateVisibilidadBusquedasFormularioEstadoPagoAuto();
		this.updateHabilitarBusquedasFormularioEstadoPagoAuto();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoPagoAuto() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoPagoAuto() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoPagoAuto() {
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
	
	public void updateControlesFormularioEstadoPagoAuto() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoPagoAuto();
		this.updateVisibilidadResaltarControlesFormularioEstadoPagoAuto();
		this.updateHabilitarResaltarControlesFormularioEstadoPagoAuto();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoPagoAuto() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadopagoautoConstantesFunciones.resaltaridEstadoPagoAuto!=null && this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setBorder(this.estadopagoautoConstantesFunciones.resaltaridEstadoPagoAuto);}
		if(this.estadopagoautoConstantesFunciones.resaltarnombreEstadoPagoAuto!=null && this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setBorder(this.estadopagoautoConstantesFunciones.resaltarnombreEstadoPagoAuto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoPagoAuto() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
	
		//this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setVisible(this.estadopagoautoConstantesFunciones.mostraridEstadoPagoAuto);
		this.jInternalFrameDetalleFormEstadoPagoAuto.jPanelidEstadoPagoAuto.setVisible(this.estadopagoautoConstantesFunciones.mostraridEstadoPagoAuto);
		//this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setVisible(this.estadopagoautoConstantesFunciones.mostrarnombreEstadoPagoAuto);
		this.jInternalFrameDetalleFormEstadoPagoAuto.jPanelnombreEstadoPagoAuto.setVisible(this.estadopagoautoConstantesFunciones.mostrarnombreEstadoPagoAuto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoPagoAuto() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoPagoAuto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoPagoAuto!=null) {
	
		this.jInternalFrameDetalleFormEstadoPagoAuto.jTextFieldidEstadoPagoAuto.setEnabled(this.estadopagoautoConstantesFunciones.activaridEstadoPagoAuto);
		this.jInternalFrameDetalleFormEstadoPagoAuto.jTextAreanombreEstadoPagoAuto.setEnabled(this.estadopagoautoConstantesFunciones.activarnombreEstadoPagoAuto);
		}
	}
	
		
}