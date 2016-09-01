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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.TipoGastoConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoGastoParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoGastoParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoGastoBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGastoBeanSwingJInternalFrame extends TipoGastoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGastoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGasto> tipogastoValidator = new ClassValidator<TipoGasto>(TipoGasto.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGasto tipogasto;	
	public TipoGasto tipogastoAux;
	public TipoGasto tipogastoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGasto tipogastoTotales;
	public Long idTipoGastoActual;
	public Long iIdNuevoTipoGasto=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboPais="";

	public List<Pais> paissForeignKey;

	public List<Pais> getpaissForeignKey() {
		return paissForeignKey;
	}

	public void setpaissForeignKey(List<Pais> paissForeignKey) {
		this.paissForeignKey = paissForeignKey;
	}

	//OBJETO FK ACTUAL
	public Pais paisForeignKey;

	public Pais getpaisForeignKey() {
		return paisForeignKey;
	}

	public void setpaisForeignKey(Pais paisForeignKey) {
		this.paisForeignKey = paisForeignKey;
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
	
	public Boolean isPermisoTodoTipoGasto;
	public Boolean isPermisoNuevoTipoGasto;
	public Boolean isPermisoActualizarTipoGasto;
	public Boolean isPermisoActualizarOriginalTipoGasto;
	public Boolean isPermisoEliminarTipoGasto;
	public Boolean isPermisoGuardarCambiosTipoGasto;
	public Boolean isPermisoConsultaTipoGasto;
	public Boolean isPermisoBusquedaTipoGasto;
	public Boolean isPermisoReporteTipoGasto;
	public Boolean isPermisoPaginacionMedioTipoGasto;
	public Boolean isPermisoPaginacionAltoTipoGasto;
	public Boolean isPermisoPaginacionTodoTipoGasto;
	public Boolean isPermisoCopiarTipoGasto;
	public Boolean isPermisoVerFormTipoGasto;
	public Boolean isPermisoDuplicarTipoGasto;
	public Boolean isPermisoOrdenTipoGasto;
	
	
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
	
	public TipoGastoParameterReturnGeneral tipogastoReturnGeneral;
	public TipoGastoParameterReturnGeneral tipogastoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGasto=false;
	public Boolean esParaAccionDesdeFormularioTipoGasto=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoGastoSessionBeanAdditional tipogastoSessionBeanAdditional=null;
	
	public TipoGastoSessionBeanAdditional getTipoGastoSessionBeanAdditional() {
		return this.tipogastoSessionBeanAdditional;
	}
	
	public void setTipoGastoSessionBeanAdditional(TipoGastoSessionBeanAdditional tipogastoSessionBeanAdditional) {
		try {
			this.tipogastoSessionBeanAdditional=tipogastoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoGastoBeanSwingJInternalFrameAdditional tipogastoBeanSwingJInternalFrameAdditional=null;
	//public class TipoGastoBeanSwingJInternalFrame
	
	public TipoGastoBeanSwingJInternalFrameAdditional getTipoGastoBeanSwingJInternalFrameAdditional() {
		return this.tipogastoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoGastoBeanSwingJInternalFrameAdditional(TipoGastoBeanSwingJInternalFrameAdditional tipogastoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipogastoBeanSwingJInternalFrameAdditional=tipogastoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGastoLogic tipogastoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGasto tipogastoBean;
	public TipoGastoConstantesFunciones tipogastoConstantesFunciones;
	//public TipoGastoParameterReturnGeneral tipogastoReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoGasto> tipogastos;	
	//public List<TipoGasto> tipogastosEliminados;
	//public List<TipoGasto> tipogastosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGasto=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGasto=true;
	public Boolean isVisibilidadCeldaCopiarTipoGasto=true;
	public Boolean isVisibilidadCeldaVerFormTipoGasto=true;
	public Boolean isVisibilidadCeldaOrdenTipoGasto=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
	public Boolean isVisibilidadCeldaModificarTipoGasto=false;
	public Boolean isVisibilidadCeldaActualizarTipoGasto=false;
	public Boolean isVisibilidadCeldaEliminarTipoGasto=false;
	public Boolean isVisibilidadCeldaCancelarTipoGasto=false;
	public Boolean isVisibilidadCeldaGuardarTipoGasto=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGasto=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoGasto() {
		return this.iIdNuevoTipoGasto;
	}

	public void setiIdNuevoTipoGasto(Long iIdNuevoTipoGasto) {
		this.iIdNuevoTipoGasto = iIdNuevoTipoGasto;
	}
	
	public Long getidTipoGastoActual() {
		return this.idTipoGastoActual;
	}

	public void setidTipoGastoActual(Long idTipoGastoActual) {
		this.idTipoGastoActual = idTipoGastoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGasto gettipogasto() {
		return this.tipogasto;
	}

	public void settipogasto(TipoGasto tipogasto) {
		this.tipogasto = tipogasto;
	}
	
	public TipoGasto gettipogastoAux() {
		return this.tipogastoAux;
	}

	public void settipogastoAux(TipoGasto tipogastoAux) {
		this.tipogastoAux = tipogastoAux;
	}				
	
	public TipoGasto gettipogastoAnterior() {
		return this.tipogastoAnterior;
	}

	public void settipogastoAnterior(TipoGasto tipogastoAnterior) {
		this.tipogastoAnterior = tipogastoAnterior;
	}	
	
	public TipoGasto gettipogastoTotales() {
		return this.tipogastoTotales;
	}

	public void settipogastoTotales(TipoGasto tipogastoTotales) {
		this.tipogastoTotales = tipogastoTotales;
	}	
	
	public TipoGasto gettipogastoBean() {
		return this.tipogastoBean;
	}

	public void settipogastoBean(TipoGasto tipogastoBean) {
		this.tipogastoBean = tipogastoBean;
	}	
	
	public TipoGastoParameterReturnGeneral gettipogastoReturnGeneral() {
		return this.tipogastoReturnGeneral;
	}

	public void settipogastoReturnGeneral(TipoGastoParameterReturnGeneral tipogastoReturnGeneral) {
		this.tipogastoReturnGeneral = tipogastoReturnGeneral;
	}	
	
	
	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public Long id_paisFK_IdPais=-1L;

	public Long getid_paisFK_IdPais() {
		return this.id_paisFK_IdPais;
	}

	public void setid_paisFK_IdPais(Long id_paisFK_IdPais) {
		this.id_paisFK_IdPais = id_paisFK_IdPais;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGastoLogic getTipoGastoLogic()	{		
		return tipogastoLogic;
	}

	public void setTipoGastoLogic(TipoGastoLogic tipogastoLogic) {
		this.tipogastoLogic = tipogastoLogic;
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
	
	public Boolean getIsEsNuevoTipoGasto() {
		return isEsNuevoTipoGasto;
	}

	public void setIsEsNuevoTipoGasto(Boolean isEsNuevoTipoGasto) {
		this.isEsNuevoTipoGasto = isEsNuevoTipoGasto;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGasto() {
		return esParaAccionDesdeFormularioTipoGasto;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGasto(Boolean esParaAccionDesdeFormularioTipoGasto) {
		this.esParaAccionDesdeFormularioTipoGasto = esParaAccionDesdeFormularioTipoGasto;
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
	
	
	public void cargarCombosPaissForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.paissForeignKey=new ArrayList<Pais>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PaisLogic paisLogic=new PaisLogic();

			paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

			if(this.tipogastoSessionBean==null) {
				this.tipogastoSessionBean=new TipoGastoSessionBean();
			}

			if(!this.tipogastoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getPaisDataAccess().setIsForForeingKeyData(true);

					paisLogic.getTodosPaissWithConnection(sFinalQuery,new Pagination());

					this.paissForeignKey=paisLogic.getPaiss();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPais(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					paisLogic.getEntityWithConnection(tipogastoSessionBean.getlidPaisActual());
					this.paissForeignKey.add(paisLogic.getPais());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualPaisForeignKey(Long idPaisSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(paisTemp!=null) {

					if(this.tipogasto!=null) {
						this.tipogasto.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoGasto!=null) {
						this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoGasto.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoGasto!=null) {
						if(this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoGasto!=null) {
						jComboBoxid_paisFK_IdPaisTipoGasto.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoGasto!=null) {
							//jComboBoxid_paisFK_IdPaisTipoGasto.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoGasto.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoGasto.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualPaisForeignKeyDescripcion(Long idPaisSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}


			sDescripcion=PaisConstantesFunciones.getPaisDescripcion(paisTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoGastoGenerico)throws Exception
	{
		try
		{
			Pais  paisTemp=null;

			for(Pais paisAux:paissForeignKey) {
				if(paisAux.getId()!=null && paisAux.getId().equals(idPaisSeleccionado)) {
					paisTemp=paisAux;
					break;
				}
			}

			if(paisTemp!=null) {
				jComboBoxid_paisTipoGastoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoGastoGenerico!=null && jComboBoxid_paisTipoGastoGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoGastoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoGasto tipogasto,JComboBox jComboBoxid_paisTipoGastoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoGastoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoGastoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipogasto.setid_pais(paisAux.getId());
				tipogasto.setpais_descripcion(TipoGastoConstantesFunciones.getPaisDescripcion(paisAux));
				tipogasto.setPais(paisAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePaissForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPais=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoGastoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoGasto!=null) { 
							this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoGasto!=null) { 
					}

					if(!TipoGastoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoGastoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGasto.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoGasto.addItem(pais);
							}
						}

						if(!TipoGastoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFramePaisForeignKey(Pais pais,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoGasto!=null) {
							this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoGasto!=null) {
							this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoGasto.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoGasto.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoGasto() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGastoConstantesFunciones.refrescarForeignKeysDescripcionesTipoGasto(this.tipogastoLogic.getTipoGastos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGastoConstantesFunciones.refrescarForeignKeysDescripcionesTipoGasto(this.tipogastos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogastoLogic.setTipoGastos(this.tipogastos);
			tipogastoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGastoParameterReturnGeneral getTipoGastoParameterGeneral() {
		return this.tipogastoParameterGeneral;
	}
	
	public void setTipoGastoParameterGeneral(TipoGastoParameterReturnGeneral tipogastoParameterGeneral) {
		this.tipogastoParameterGeneral = tipogastoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGasto() {
		return isPermisoTodoTipoGasto;
	}

	public void setIsPermisoTodoTipoGasto(Boolean isPermisoTodoTipoGasto) {
		this.isPermisoTodoTipoGasto = isPermisoTodoTipoGasto;
	}

	public Boolean getIsPermisoNuevoTipoGasto() {
		return isPermisoNuevoTipoGasto;
	}

	public void setIsPermisoNuevoTipoGasto(Boolean isPermisoNuevoTipoGasto) {
		this.isPermisoNuevoTipoGasto = isPermisoNuevoTipoGasto;
	}

	public Boolean getIsPermisoActualizarTipoGasto() {
		return isPermisoActualizarTipoGasto;
	}

	public void setIsPermisoActualizarTipoGasto(Boolean isPermisoActualizarTipoGasto) {
		this.isPermisoActualizarTipoGasto = isPermisoActualizarTipoGasto;
	}

	public Boolean getIsPermisoEliminarTipoGasto() {
		return isPermisoEliminarTipoGasto;
	}

	public void setIsPermisoEliminarTipoGasto(Boolean isPermisoEliminarTipoGasto) {
		this.isPermisoEliminarTipoGasto = isPermisoEliminarTipoGasto;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGasto() {
		return isPermisoGuardarCambiosTipoGasto;
	}

	public void setIsPermisoGuardarCambiosTipoGasto(Boolean isPermisoGuardarCambiosTipoGasto) {
		this.isPermisoGuardarCambiosTipoGasto = isPermisoGuardarCambiosTipoGasto;
	}
	
	public Boolean getIsPermisoConsultaTipoGasto() {
		return isPermisoConsultaTipoGasto;
	}

	public void setIsPermisoConsultaTipoGasto(Boolean isPermisoConsultaTipoGasto) {
		this.isPermisoConsultaTipoGasto = isPermisoConsultaTipoGasto;
	}

	public Boolean getIsPermisoBusquedaTipoGasto() {
		return isPermisoBusquedaTipoGasto;
	}

	public void setIsPermisoBusquedaTipoGasto(Boolean isPermisoBusquedaTipoGasto) {
		this.isPermisoBusquedaTipoGasto = isPermisoBusquedaTipoGasto;
	}

	public Boolean getIsPermisoReporteTipoGasto() {
		return isPermisoReporteTipoGasto;
	}

	public void setIsPermisoReporteTipoGasto(Boolean isPermisoReporteTipoGasto) {
		this.isPermisoReporteTipoGasto = isPermisoReporteTipoGasto;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGasto() {
		return isPermisoPaginacionMedioTipoGasto;
	}

	public void setIsPermisoPaginacionMedioTipoGasto(Boolean isPermisoPaginacionMedioTipoGasto) {
		this.isPermisoPaginacionMedioTipoGasto = isPermisoPaginacionMedioTipoGasto;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGasto() {
		return isPermisoPaginacionTodoTipoGasto;
	}

	public void setIsPermisoPaginacionTodoTipoGasto(Boolean isPermisoPaginacionTodoTipoGasto) {
		this.isPermisoPaginacionTodoTipoGasto = isPermisoPaginacionTodoTipoGasto;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGasto() {
		return isPermisoPaginacionAltoTipoGasto;
	}

	public void setIsPermisoPaginacionAltoTipoGasto(Boolean isPermisoPaginacionAltoTipoGasto) {
		this.isPermisoPaginacionAltoTipoGasto = isPermisoPaginacionAltoTipoGasto;
	}
	
	public Boolean getIsPermisoCopiarTipoGasto() {
		return isPermisoCopiarTipoGasto;
	}

	public void setIsPermisoCopiarTipoGasto(Boolean isPermisoCopiarTipoGasto) {
		this.isPermisoCopiarTipoGasto = isPermisoCopiarTipoGasto;
	}
	
	public Boolean getIsPermisoVerFormTipoGasto() {
		return isPermisoVerFormTipoGasto;
	}

	public void setIsPermisoVerFormTipoGasto(Boolean isPermisoVerFormTipoGasto) {
		this.isPermisoVerFormTipoGasto = isPermisoVerFormTipoGasto;
	}
	
	public Boolean getIsPermisoDuplicarTipoGasto() {
		return isPermisoDuplicarTipoGasto;
	}

	public void setIsPermisoDuplicarTipoGasto(Boolean isPermisoDuplicarTipoGasto) {
		this.isPermisoDuplicarTipoGasto = isPermisoDuplicarTipoGasto;
	}
	
	public Boolean getIsPermisoOrdenTipoGasto() {
		return isPermisoOrdenTipoGasto;
	}

	public void setIsPermisoOrdenTipoGasto(Boolean isPermisoOrdenTipoGasto) {
		this.isPermisoOrdenTipoGasto = isPermisoOrdenTipoGasto;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGasto() {
		return isVisibilidadCeldaNuevoTipoGasto;
	}

	public void setIsVisibilidadCeldaNuevoTipoGasto(Boolean isVisibilidadCeldaNuevoTipoGasto) {
		this.isVisibilidadCeldaNuevoTipoGasto = isVisibilidadCeldaNuevoTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGasto() {
		return isVisibilidadCeldaDuplicarTipoGasto;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGasto(Boolean isVisibilidadCeldaDuplicarTipoGasto) {
		this.isVisibilidadCeldaDuplicarTipoGasto = isVisibilidadCeldaDuplicarTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGasto() {
		return isVisibilidadCeldaCopiarTipoGasto;
	}

	public void setIsVisibilidadCeldaCopiarTipoGasto(Boolean isVisibilidadCeldaCopiarTipoGasto) {
		this.isVisibilidadCeldaCopiarTipoGasto = isVisibilidadCeldaCopiarTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGasto() {
		return isVisibilidadCeldaVerFormTipoGasto;
	}

	public void setIsVisibilidadCeldaVerFormTipoGasto(Boolean isVisibilidadCeldaVerFormTipoGasto) {
		this.isVisibilidadCeldaVerFormTipoGasto = isVisibilidadCeldaVerFormTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGasto() {
		return isVisibilidadCeldaOrdenTipoGasto;
	}

	public void setIsVisibilidadCeldaOrdenTipoGasto(Boolean isVisibilidadCeldaOrdenTipoGasto) {
		this.isVisibilidadCeldaOrdenTipoGasto = isVisibilidadCeldaOrdenTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGasto() {
		return isVisibilidadCeldaNuevoRelacionesTipoGasto;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGasto(Boolean isVisibilidadCeldaNuevoRelacionesTipoGasto) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGasto = isVisibilidadCeldaNuevoRelacionesTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGasto() {
		return isVisibilidadCeldaModificarTipoGasto;
	}

	public void setIsVisibilidadCeldaModificarTipoGasto(Boolean isVisibilidadCeldaModificarTipoGasto) {
		this.isVisibilidadCeldaModificarTipoGasto = isVisibilidadCeldaModificarTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGasto() {
		return isVisibilidadCeldaActualizarTipoGasto;
	}

	public void setIsVisibilidadCeldaActualizarTipoGasto(Boolean isVisibilidadCeldaActualizarTipoGasto) {
		this.isVisibilidadCeldaActualizarTipoGasto = isVisibilidadCeldaActualizarTipoGasto;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGasto() {
		return isVisibilidadCeldaEliminarTipoGasto;
	}

	public void setIsVisibilidadCeldaEliminarTipoGasto(Boolean isVisibilidadCeldaEliminarTipoGasto) {
		this.isVisibilidadCeldaEliminarTipoGasto = isVisibilidadCeldaEliminarTipoGasto;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGasto() {
		return isVisibilidadCeldaCancelarTipoGasto;
	}

	public void setIsVisibilidadCeldaCancelarTipoGasto(Boolean isVisibilidadCeldaCancelarTipoGasto) {
		this.isVisibilidadCeldaCancelarTipoGasto = isVisibilidadCeldaCancelarTipoGasto;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGasto() {
		return isVisibilidadCeldaGuardarTipoGasto;
	}

	public void setIsVisibilidadCeldaGuardarTipoGasto(Boolean isVisibilidadCeldaGuardarTipoGasto) {
		this.isVisibilidadCeldaGuardarTipoGasto = isVisibilidadCeldaGuardarTipoGasto;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGasto() {
		return isVisibilidadCeldaGuardarCambiosTipoGasto;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGasto(Boolean isVisibilidadCeldaGuardarCambiosTipoGasto) {
		this.isVisibilidadCeldaGuardarCambiosTipoGasto = isVisibilidadCeldaGuardarCambiosTipoGasto;
	}
		
	public TipoGastoSessionBean gettipogastoSessionBean() {
		return this.tipogastoSessionBean;
	}
	
	public void settipogastoSessionBean(TipoGastoSessionBean tipogastoSessionBean) {
		this.tipogastoSessionBean=tipogastoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGasto(TipoGasto tipogasto)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipogasto,null);
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
	
	public void bugActualizarReferenciaActual(TipoGasto tipogasto,TipoGasto tipogastoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGasto(tipogasto);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogastoAux.setId(tipogasto.getId());
		tipogastoAux.setVersionRow(tipogasto.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGasto();
		
			int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogastoValidator.getInvalidValues(this.tipogasto);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogastoLogic.setDatosCliente(datosCliente);
			tipogastoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogastoAux=new  TipoGasto();
				
				tipogastoAux.setIsNew(true);
				tipogastoAux.setIsChanged(true);
				
				tipogastoAux.setTipoGastoOriginal(this.tipogasto);
				
				tipogastoAux.setId(this.tipogasto.getId());	
				tipogastoAux.setVersionRow(this.tipogasto.getVersionRow());	
				tipogastoAux.setid_pais(this.tipogasto.getid_pais());	
				tipogastoAux.setnombre(this.tipogasto.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogastoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogastoAux,tipogastoLogic.getTipoGastos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoAux,tipogastos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoLogic.saveTipoGastos();//WithConnection
						//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogasto,tipogastoAux);
					
					this.refrescarForeignKeysDescripcionesTipoGasto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogastoLogic.saveTipoGastoRelaciones(tipogastoAux);//WithConnection
								//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogasto,tipogastoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogastoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogastoAux,tipogastoLogic.getTipoGastos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogastoAux,tipogastos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogasto,tipogastoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogastoAux=new  TipoGasto();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogastoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogastoSessionBean.getEsGuardarRelacionado() && this.tipogasto.getId()>=0)) {
						
					tipogastoAux.setIsNew(false);
				}
				
				tipogastoAux.setIsDeleted(false);
			
				tipogastoAux.setId(this.tipogasto.getId());	
				tipogastoAux.setVersionRow(this.tipogasto.getVersionRow());	
				tipogastoAux.setid_pais(this.tipogasto.getid_pais());	
				tipogastoAux.setnombre(this.tipogasto.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogastoAux,tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoAux,tipogastos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoLogic.saveTipoGastos();//WithConnection
						//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogasto,tipogastoAux);
					
					this.refrescarForeignKeysDescripcionesTipoGasto();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogastoLogic.saveTipoGastoRelaciones(tipogastoAux);//WithConnection
								//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogasto,tipogastoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogastoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogastoAux,tipogastoLogic.getTipoGastos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogastoAux,tipogastos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogasto,tipogastoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogastoAux=new  TipoGasto();
				
				tipogastoAux.setIsNew(false);
				tipogastoAux.setIsChanged(false);
				
				tipogastoAux.setIsDeleted(true);
				
				tipogastoAux.setId(this.tipogasto.getId());	
				tipogastoAux.setVersionRow(this.tipogasto.getVersionRow());	
				tipogastoAux.setid_pais(this.tipogasto.getid_pais());	
				tipogastoAux.setnombre(this.tipogasto.getnombre());	
				
				if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogastoAux.getId()>=0) {	
						this.tipogastosEliminados.add(tipogastoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogastoAux,tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoAux,tipogastos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogastoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoLogic.saveTipoGastos();//WithConnection
						//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogastoLogic.saveTipoGastoRelaciones(tipogastoAux);//WithConnection
								//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
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
							if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogastoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogastoAux,tipogastoLogic.getTipoGastos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogastoAux,tipogastos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.getTipoGastos().addAll(this.tipogastosEliminados);
					
					tipogastoLogic.saveTipoGastos();//WithConnection
					//tipogastoLogic.getSetVersionRowTipoGastos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoGasto();
				
				this.tipogastosEliminados= new ArrayList<TipoGasto>();		
			}
			
			if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Gasto  GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogasto=tipogastoAux;
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
      		//this.finishProcessTipoGasto();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGasto tipogastoLocal) throws Exception {
		
		if(this.tipogastoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGasto tipogastoLocal) throws Exception {	
		if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipogastoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoGastoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogastoValidator.getInvalidValues(this.tipogasto);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGasto tipogasto,List<TipoGasto> tipogastos) throws Exception {
		try	{		
			TipoGastoConstantesFunciones.actualizarLista(tipogasto,tipogastos,this.tipogastoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGasto tipogasto,List<TipoGasto> tipogastos) throws Exception {
		try	{			
			TipoGastoConstantesFunciones.actualizarSelectedLista(tipogasto,tipogastos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGasto> tipogastosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogastosLocal=this.tipogastoLogic.getTipoGastos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogastosLocal=this.tipogastos;
			}
			//ARCHITECTURE
		
			for(TipoGasto tipogastoLocal:tipogastosLocal) {
				if(this.permiteMantenimiento(tipogastoLocal) && tipogastoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGastoConstantesFunciones.getTipoGastoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGastoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGasto.jLabelid_paisTipoGasto,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGastoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGasto.jLabelnombreTipoGasto,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGasto.jLabelid_paisTipoGasto,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGasto.jLabelnombreTipoGasto,"");
		
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
		this.iIdNuevoTipoGasto--;	
		
		
		this.tipogastoAux=new TipoGasto();
		
		this.tipogastoAux.setId(this.iIdNuevoTipoGasto);
		this.tipogastoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogastoLogic.getTipoGastos().add(this.tipogastoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogastos.add(this.tipogastoAux);
		}
		//ARCHITECTURE
		
		this.tipogasto=this.tipogastoAux;
		
		if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGasto(this.tipogasto);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGasto(this.tipogasto);
		}
				
		//this.setDefaultControlesTipoGasto();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGasto();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGasto();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGasto();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGasto(this.tipogastoBean,this.tipogasto,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGastoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
			classes=TipoGastoConstantesFunciones.getClassesRelationshipsOfTipoGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogastoReturnGeneral=tipogastoLogic.procesarEventosTipoGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogastoLogic.getTipoGastos(),this.tipogasto,this.tipogastoParameterGeneral,this.isEsNuevoTipoGasto,classes);//this.tipogastoLogic.getTipoGasto()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGasto(this.tipogastoReturnGeneral,this.tipogastoBean,false);
		
		if(this.tipogastoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGasto(this.tipogastoReturnGeneral.getTipoGasto());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGasto(this.tipogastoReturnGeneral.getTipoGasto());
		}
		
		if(this.tipogastoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGasto(this.tipogastoReturnGeneral.getTipoGasto(),classes);//this.tipogastoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGasto();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGasto();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGastoBeanSwingJInternalFrameAdditional.RecargarFormTipoGasto(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGasto(false);
						
			if(tipogastoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGasto();
			}
			
			this.actualizarVisualTableDatosTipoGasto();
			
			this.jTableDatosTipoGasto.setRowSelectionInterval(this.getIndiceNuevoTipoGasto(), this.getIndiceNuevoTipoGasto());
			
			this.seleccionarFilaTablaTipoGastoActual();
						
			this.actualizarEstadoCeldasBotonesTipoGasto("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGasto(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setEnabled(isHabilitar && this.tipogastoConstantesFunciones.activarnombreTipoGasto);	
		
		this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setEnabled(isHabilitar && this.tipogastoConstantesFunciones.activarid_paisTipoGasto);
	};
	
	public void setDefaultControlesTipoGasto() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGasto(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogastoSessionBean.setConGuardarRelaciones(true);			
			this.tipogastoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.setVisible(true);
			
					
		} else {
			//this.tipogastoSessionBean.setConGuardarRelaciones(false);			
			this.tipogastoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoGasto() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
				if(tipogastoAux.getId().equals(this.iIdNuevoTipoGasto)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGasto tipogastoAux:this.tipogastos) {
				if(tipogastoAux.getId().equals(this.iIdNuevoTipoGasto)) {
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
	
	public int getIndiceActualTipoGasto(TipoGasto tipogasto,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
				if(tipogastoAux.getId().equals(tipogasto.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGasto tipogastoAux:this.tipogastos) {
				if(tipogastoAux.getId().equals(tipogasto.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGasto(TipoGasto tipogastoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
				if(tipogastoAux.getTipoGastoOriginal().getId().equals(tipogastoOriginal.getId())) {
					existe=true;
					tipogastoOriginal.setId(tipogastoAux.getId());
					tipogastoOriginal.setVersionRow(tipogastoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGasto tipogastoAux:this.tipogastos) {
				if(tipogastoAux.getTipoGastoOriginal().getId().equals(tipogastoOriginal.getId())) {
					existe=true;
					tipogastoOriginal.setId(tipogastoAux.getId());
					tipogastoOriginal.setVersionRow(tipogastoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGasto(Boolean esParaCancelar) throws Exception {
		tipogastosAux=new ArrayList<TipoGasto>();
		tipogastoAux=new TipoGasto();
		
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
					if(tipogastoAux.getId()<0) {
						tipogastosAux.add(tipogastoAux);
					}		
				}
				this.iIdNuevoTipoGasto=0L;
				this.tipogastoLogic.getTipoGastos().removeAll(tipogastosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGasto tipogastoAux:this.tipogastos) {
					if(tipogastoAux.getId()<0) {
						tipogastosAux.add(tipogastoAux);
					}		
				}
				this.iIdNuevoTipoGasto=0L;
				this.tipogastos.removeAll(tipogastosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGasto 
					&& this.tipogastoLogic.getTipoGastos().size()>0
					) {
					tipogastoAux=this.tipogastoLogic.getTipoGastos().get(this.tipogastoLogic.getTipoGastos().size() - 1);
				
					if(tipogastoAux.getId()<0) {
						this.tipogastoLogic.getTipoGastos().remove(tipogastoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGasto && this.tipogastos.size()>0) {
					tipogastoAux=this.tipogastos.get(this.tipogastos.size() - 1);
				
					if(tipogastoAux.getId()<0) {
						this.tipogastos.remove(tipogastoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGasto(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogasto.getId()<0) {
				this.tipogastoLogic.getTipoGastos().remove(this.tipogasto);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogasto.getId()<0) {
				this.tipogastos.remove(this.tipogasto);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGasto(List<TipoGasto> tipogastosAux) throws Exception {
		TipoGastoConstantesFunciones.setEstadosInicialesTipoGasto(tipogastosAux);
	}
	
	public void setEstadosInicialesTipoGasto(TipoGasto tipogastoAux) throws Exception {
		TipoGastoConstantesFunciones.setEstadosInicialesTipoGasto(tipogastoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGastoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGastoActual()) {
				if(!this.isEsNuevoTipoGasto) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGasto=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGastoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Gasto  ?", "MANTENIMIENTO DE Tipo Gasto ", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGasto tipogasto) throws Exception {
		TipoGastoConstantesFunciones.seleccionarAsignar(this.tipogasto,tipogasto);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGasto=this.isPermisoActualizarOriginalTipoGasto;
			
			
			this.seleccionarAsignar(tipogasto);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGastoConstantesFunciones.quitarEspaciosTipoGasto(this.tipogasto,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogastoSessionBean.setsFuncionBusquedaRapida(this.tipogastoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGasto) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGasto(esParaCancelar);				
				this.cancelarNuevoTipoGasto(esParaCancelar);								
			}
			
			this.tipogasto=new TipoGasto();
			
			this.inicializarTipoGasto();
			
			this.actualizarEstadoCeldasBotonesTipoGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGasto() throws Exception {
		try {
			TipoGastoConstantesFunciones.inicializarTipoGasto(this.tipogasto);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogastoLogic.getTipoGastos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGastos(String sAccionBusqueda,List<TipoGasto> tipogastosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGasto"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGastoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGastoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGasto"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Gasto s");		
		parameters.put("busquedapor", TipoGastoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGasto=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGastoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGastoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGasto=new JRBeanArrayDataSource(TipoGastoJInternalFrame.TraerTipoGastoBeans(tipogastosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGasto);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGastoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGastoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGastoBean.TraerTipoGastoBeans(tipogastosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGastos(sAccionBusqueda,sTipoArchivoReporte,tipogastosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGastos(sAccionBusqueda,sTipoArchivoReporte,tipogastosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGastoActionPerformed(null);
					//this.generarExcelReporteTipoGastos(sAccionBusqueda,sTipoArchivoReporte,tipogastosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGastos(sAccionBusqueda,sTipoArchivoReporte,tipogastosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGastos(sAccionBusqueda,sTipoArchivoReporte,tipogastosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGastos(sAccionBusqueda,sTipoArchivoReporte,tipogastosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGasto> tipogastosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGasto("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGasto tipogasto : tipogastosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGastoConstantesFunciones.generarExcelReporteDataTipoGasto("NORMAL",row,workbook,tipogasto,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGasto(String sTipo,Row row,Workbook workbook) {
		
		TipoGastoConstantesFunciones.generarExcelReporteHeaderTipoGasto(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGasto> tipogastosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGasto tipogasto : tipogastosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGastoConstantesFunciones.getTipoGastoDescripcion(tipogasto));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogasto.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGastoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGastoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogasto.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGastos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGasto> tipogastosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGasto> tipogastosRespaldo=null;
		
		classes=TipoGastoConstantesFunciones.getClassesRelationshipsOfTipoGasto(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogastoLogic.setDatosCliente(this.datosCliente);
		this.tipogastoLogic.setDatosDeep(this.datosDeep);
		this.tipogastoLogic.setIsConDeep(true);
		
		tipogastosRespaldo=this.tipogastoLogic.getTipoGastos();
		
		this.tipogastoLogic.setTipoGastos(tipogastosParaReportes);	
		this.tipogastoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogastosParaReportes=this.tipogastoLogic.getTipoGastos();
		this.tipogastoLogic.setTipoGastos(tipogastosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGastos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGasto("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGasto tipogasto : tipogastosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGasto("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGastoConstantesFunciones.generarExcelReporteDataTipoGasto("NORMAL",row,workbook,tipogasto,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoGastoConstantesFunciones.getTipoGastoDescripcion(tipogasto));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGasto.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGasto() throws Exception {		
		this.startProcessTipoGasto(true);
	}
	
	public void startProcessTipoGasto(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGasto ,this.jPanelParametrosReportesTipoGasto, this.jScrollPanelDatosTipoGasto,this.jPanelPaginacionTipoGasto, this.jScrollPanelDatosEdicionTipoGasto, this.jPanelAccionesTipoGasto,this.jPanelAccionesFormularioTipoGasto,this.jmenuBarTipoGasto,this.jmenuBarDetalleTipoGasto,this.jTtoolBarTipoGasto,this.jTtoolBarDetalleTipoGasto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGasto=this.jTabbedPaneBusquedasTipoGasto; 
		
		final JPanel jPanelParametrosReportesTipoGasto=this.jPanelParametrosReportesTipoGasto;
		//final JScrollPane jScrollPanelDatosTipoGasto=this.jScrollPanelDatosTipoGasto;
		final JTable jTableDatosTipoGasto=this.jTableDatosTipoGasto;		
		final JPanel jPanelPaginacionTipoGasto=this.jPanelPaginacionTipoGasto;
		//final JScrollPane jScrollPanelDatosEdicionTipoGasto=this.jScrollPanelDatosEdicionTipoGasto;
		final JPanel jPanelAccionesTipoGasto=this.jPanelAccionesTipoGasto;
		
		JPanel jPanelCamposAuxiliarTipoGasto=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGasto=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			jPanelCamposAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jPanelCamposTipoGasto;
			jPanelAccionesFormularioAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jPanelAccionesFormularioTipoGasto;
		}
		
		final JPanel jPanelCamposTipoGasto=jPanelCamposAuxiliarTipoGasto;
		final JPanel jPanelAccionesFormularioTipoGasto=jPanelAccionesFormularioAuxiliarTipoGasto;
		
		
		final JMenuBar jmenuBarTipoGasto=this.jmenuBarTipoGasto;
		final JToolBar jTtoolBarTipoGasto=this.jTtoolBarTipoGasto;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGasto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGasto=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			jmenuBarDetalleAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jmenuBarDetalleTipoGasto;
			jTtoolBarDetalleAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jTtoolBarDetalleTipoGasto;
		}
		
		final JMenuBar jmenuBarDetalleTipoGasto=jmenuBarDetalleAuxiliarTipoGasto;
		final JToolBar jTtoolBarDetalleTipoGasto=jTtoolBarDetalleAuxiliarTipoGasto;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGasto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGasto;
			processRunnable.jTableDatos=jTableDatosTipoGasto;
			processRunnable.jPanelCampos=jPanelCamposTipoGasto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGasto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGasto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGasto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGasto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGasto;
			processRunnable.jTtoolBar=jTtoolBarTipoGasto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGasto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGasto ,jPanelParametrosReportesTipoGasto,jTableDatosTipoGasto, /*jScrollPanelDatosTipoGasto,*/jPanelCamposTipoGasto,jPanelPaginacionTipoGasto, /*jScrollPanelDatosEdicionTipoGasto,*/ jPanelAccionesTipoGasto,jPanelAccionesFormularioTipoGasto,jmenuBarTipoGasto,jmenuBarDetalleTipoGasto,jTtoolBarTipoGasto,jTtoolBarDetalleTipoGasto);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGasto ,jPanelParametrosReportesTipoGasto, jScrollPanelDatosTipoGasto,jPanelPaginacionTipoGasto, jScrollPanelDatosEdicionTipoGasto, jPanelAccionesTipoGasto,jPanelAccionesFormularioTipoGasto,jmenuBarTipoGasto,jmenuBarDetalleTipoGasto,jTtoolBarTipoGasto,jTtoolBarDetalleTipoGasto);
						
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
	
	public void finishProcessTipoGasto() {// throws Exception 
		this.finishProcessTipoGasto(true);
	}
	
	public void finishProcessTipoGasto(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGasto ,this.jPanelParametrosReportesTipoGasto, this.jScrollPanelDatosTipoGasto,this.jPanelPaginacionTipoGasto, this.jScrollPanelDatosEdicionTipoGasto, this.jPanelAccionesTipoGasto,this.jPanelAccionesFormularioTipoGasto,this.jmenuBarTipoGasto,this.jmenuBarDetalleTipoGasto,this.jTtoolBarTipoGasto,this.jTtoolBarDetalleTipoGasto);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGasto=this.jTabbedPaneBusquedasTipoGasto; 
		
		final JPanel jPanelParametrosReportesTipoGasto=this.jPanelParametrosReportesTipoGasto;
		//final JScrollPane jScrollPanelDatosTipoGasto=this.jScrollPanelDatosTipoGasto;
		final JTable jTableDatosTipoGasto=this.jTableDatosTipoGasto;		
		final JPanel jPanelPaginacionTipoGasto=this.jPanelPaginacionTipoGasto;
		//final JScrollPane jScrollPanelDatosEdicionTipoGasto=this.jScrollPanelDatosEdicionTipoGasto;
		final JPanel jPanelAccionesTipoGasto=this.jPanelAccionesTipoGasto;
		
		JPanel jPanelCamposAuxiliarTipoGasto=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGasto=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			jPanelCamposAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jPanelCamposTipoGasto;
			jPanelAccionesFormularioAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jPanelAccionesFormularioTipoGasto;
		}
		
		final JPanel jPanelCamposTipoGasto=jPanelCamposAuxiliarTipoGasto;
		final JPanel jPanelAccionesFormularioTipoGasto=jPanelAccionesFormularioAuxiliarTipoGasto;
		
		
		final JMenuBar jmenuBarTipoGasto=this.jmenuBarTipoGasto;		
		final JToolBar jTtoolBarTipoGasto=this.jTtoolBarTipoGasto;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGasto=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGasto=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			jmenuBarDetalleAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jmenuBarDetalleTipoGasto;
			jTtoolBarDetalleAuxiliarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jTtoolBarDetalleTipoGasto;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGasto=jmenuBarDetalleAuxiliarTipoGasto;
		final JToolBar jTtoolBarDetalleTipoGasto=jTtoolBarDetalleAuxiliarTipoGasto;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGasto;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGasto;
			processRunnable.jTableDatos=jTableDatosTipoGasto;
			processRunnable.jPanelCampos=jPanelCamposTipoGasto;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGasto;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGasto;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGasto;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGasto;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGasto;
			processRunnable.jTtoolBar=jTtoolBarTipoGasto;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGasto;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGasto ,jPanelParametrosReportesTipoGasto, jTableDatosTipoGasto,/*jScrollPanelDatosTipoGasto,*/jPanelCamposTipoGasto,jPanelPaginacionTipoGasto, /*jScrollPanelDatosEdicionTipoGasto,*/ jPanelAccionesTipoGasto,jPanelAccionesFormularioTipoGasto,jmenuBarTipoGasto,jmenuBarDetalleTipoGasto,jTtoolBarTipoGasto,jTtoolBarDetalleTipoGasto));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGasto(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGasto(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGasto(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGasto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGasto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGasto,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGasto(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGasto,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGasto,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogastoConstantesFunciones.getsFinalQueryTipoGasto();
		String  finalQueryPaginacionTodos=this.tipogastoConstantesFunciones.getsFinalQueryTipoGasto();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGastoConstantesFunciones.getArrayColumnasGlobalesNoTipoGasto(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGastoConstantesFunciones.getArrayColumnasGlobalesTipoGasto(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGastoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogastosEliminados= new ArrayList<TipoGasto>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGasto();
		
				///*TipoGastoSessionBean*/this.tipogastoSessionBean=new TipoGastoSessionBean();
			
			if(this.tipogastoSessionBean==null) {
				this.tipogastoSessionBean=new TipoGastoSessionBean();
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
					this.iNumeroPaginacion=TipoGastoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGastoConstantesFunciones.getClassesForeignKeysOfTipoGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogasto."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogastosAux= new ArrayList<TipoGasto>();
			
				
			tipogastoLogic.setDatosCliente(this.datosCliente);
			tipogastoLogic.setDatosDeep(this.datosDeep);
			tipogastoLogic.setIsConDeep(true);
			
			
			tipogastoLogic.getTipoGastoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogastoLogic.getTodosTipoGastos(finalQueryGlobal,pagination);
					
					//tipogastoLogic.getTodosTipoGastosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogastoLogic.getTipoGastos()==null|| tipogastoLogic.getTipoGastos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastosAux= new ArrayList<TipoGasto>();
							tipogastosAux.addAll(tipogastoLogic.getTipoGastos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastosAux= new ArrayList<TipoGasto>();
							tipogastosAux.addAll(tipogastos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoLogic.getTodosTipoGastos(finalQueryGlobal+"",this.pagination);												
							
							//tipogastoLogic.getTodosTipoGastosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGastos("Todos",tipogastoLogic.getTipoGastos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogastoLogic.setTipoGastos(new ArrayList<TipoGasto>());					
							tipogastoLogic.getTipoGastos().addAll(tipogastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastos=new ArrayList<TipoGasto>();
							tipogastos.addAll(tipogastosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGasto=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGasto=this.idActual;
				
				} else if(this.idTipoGastoActual!=null && this.idTipoGastoActual!=0L) {
					idTipoGasto=idTipoGastoActual;
				}
				
					
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndicePorId(idTipoGasto);
				
				this.tipogastos=new ArrayList<TipoGasto>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogastoLogic.getEntity(idTipoGasto);
					
					//tipogastoLogic.getEntityWithConnection(idTipoGasto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoLogic.setTipoGastos(new ArrayList<TipoGasto>());
					tipogastoLogic.getTipoGastos().add(tipogastoLogic.getTipoGasto());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogastos=new ArrayList<TipoGasto>();
					this.tipogastos.add(tipogasto);
				}
				
				if(tipogastoLogic.getTipoGasto()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogastoLogic.getTipoGastosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogastoLogic.getTipoGastos()==null||tipogastoLogic.getTipoGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogastos==null|| tipogastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastosAux=new ArrayList<TipoGasto>();
						tipogastosAux.addAll(tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastosAux=new ArrayList<TipoGasto>();
							tipogastosAux.addAll(tipogastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogastoLogic.getTipoGastosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGastos("BusquedaPorId",tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGastos("BusquedaPorId",tipogastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoLogic.setTipoGastos(new ArrayList<TipoGasto>());
						tipogastoLogic.getTipoGastos().addAll(tipogastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastos=new ArrayList<TipoGasto>();
							tipogastos.addAll(tipogastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogastoLogic.getTipoGastosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogastoLogic.getTipoGastos()==null||tipogastoLogic.getTipoGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogastos==null|| tipogastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastosAux=new ArrayList<TipoGasto>();
						tipogastosAux.addAll(tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastosAux=new ArrayList<TipoGasto>();
							tipogastosAux.addAll(tipogastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogastoLogic.getTipoGastosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGastos("BusquedaPorNombre",tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGastos("BusquedaPorNombre",tipogastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoLogic.setTipoGastos(new ArrayList<TipoGasto>());
						tipogastoLogic.getTipoGastos().addAll(tipogastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastos=new ArrayList<TipoGasto>();
							tipogastos.addAll(tipogastosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogastoLogic.getTipoGastosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogastoLogic.getTipoGastos()==null||tipogastoLogic.getTipoGastos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogastos==null|| tipogastos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastosAux=new ArrayList<TipoGasto>();
						tipogastosAux.addAll(tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastosAux=new ArrayList<TipoGasto>();
							tipogastosAux.addAll(tipogastos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogastoLogic.getTipoGastosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGastoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGastos("FK_IdPais",tipogastoLogic.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGastos("FK_IdPais",tipogastos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoLogic.setTipoGastos(new ArrayList<TipoGasto>());
						tipogastoLogic.getTipoGastos().addAll(tipogastosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastos=new ArrayList<TipoGasto>();
							tipogastos.addAll(tipogastosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGasto();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGasto();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogastoLogic.getTipoGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogastoLogic.getTipoGastos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogastos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGasto tipogasto) {
		Boolean permite=true;
		
		if(this.tipogasto.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGastoConstantesFunciones.getOrderByListaTipoGasto();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGastoConstantesFunciones.getOrderByListaTipoGasto();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGasto tipogasto:tipogastoLogic.getTipoGastos()) {
				if(tipogasto.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoTotales=tipogasto;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGasto tipogasto:this.tipogastos) {
				if(tipogasto.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoTotales=tipogasto;
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
			this.tipogastoAux=new TipoGasto();
			this.tipogastoAux.setsType(Constantes2.S_TOTALES);
			this.tipogastoAux.setIsNew(false);
			this.tipogastoAux.setIsChanged(false);
			this.tipogastoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGastoConstantesFunciones.TotalizarValoresFilaTipoGasto(this.tipogastoLogic.getTipoGastos(),this.tipogastoAux);
				
				this.tipogastoLogic.getTipoGastos().add(this.tipogastoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGastoConstantesFunciones.TotalizarValoresFilaTipoGasto(this.tipogastos,this.tipogastoAux);
				
				this.tipogastos.add(this.tipogastoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogastoTotales=new TipoGasto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogastoLogic.getTipoGastos().remove(tipogastoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogastos.remove(tipogastoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogastoTotales=new TipoGasto();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGasto tipogasto:tipogastoLogic.getTipoGastos()) {
				if(tipogasto.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoTotales=tipogasto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGastoConstantesFunciones.TotalizarValoresFilaTipoGasto(this.tipogastoLogic.getTipoGastos(),tipogastoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGasto tipogasto:this.tipogastos) {
				if(tipogasto.getsType().equals(Constantes2.S_TOTALES)) {
					tipogastoTotales=tipogasto;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGastoConstantesFunciones.TotalizarValoresFilaTipoGasto(this.tipogastos,tipogastoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGastosBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGastosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGastosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGastoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoGastosBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoLogic.getTipoGastosBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGastosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoLogic.getTipoGastosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGastosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoLogic.getTipoGastosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGastoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoLogic.getTipoGastoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoGasto() {
		this.isPermisoTodoTipoGasto=false;
		this.isPermisoNuevoTipoGasto=false;
		this.isPermisoActualizarTipoGasto=false;
		this.isPermisoActualizarOriginalTipoGasto=false;
		this.isPermisoEliminarTipoGasto=false;
		this.isPermisoGuardarCambiosTipoGasto=false;
		this.isPermisoConsultaTipoGasto=false;
		this.isPermisoBusquedaTipoGasto=false;
		this.isPermisoReporteTipoGasto=false;		
		this.isPermisoOrdenTipoGasto=false;		
		this.isPermisoPaginacionMedioTipoGasto=false;		
		this.isPermisoPaginacionAltoTipoGasto=false;
		this.isPermisoPaginacionTodoTipoGasto=false;
		this.isPermisoCopiarTipoGasto=false;		
		this.isPermisoVerFormTipoGasto=false;		
		this.isPermisoDuplicarTipoGasto=false;		
		this.isPermisoOrdenTipoGasto=false;		
	}
	
	public void setPermisosUsuarioTipoGasto(Boolean isPermiso) {
		this.isPermisoTodoTipoGasto=isPermiso;
		this.isPermisoNuevoTipoGasto=isPermiso;
		this.isPermisoActualizarTipoGasto=isPermiso;
		this.isPermisoActualizarOriginalTipoGasto=isPermiso;
		this.isPermisoEliminarTipoGasto=isPermiso;
		this.isPermisoGuardarCambiosTipoGasto=isPermiso;
		this.isPermisoConsultaTipoGasto=isPermiso;
		this.isPermisoBusquedaTipoGasto=isPermiso;
		this.isPermisoReporteTipoGasto=isPermiso;
		this.isPermisoOrdenTipoGasto=isPermiso;		
		this.isPermisoPaginacionMedioTipoGasto=isPermiso;		
		this.isPermisoPaginacionAltoTipoGasto=isPermiso;		
		this.isPermisoPaginacionTodoTipoGasto=isPermiso;		
		this.isPermisoCopiarTipoGasto=isPermiso;		
		this.isPermisoVerFormTipoGasto=isPermiso;		
		this.isPermisoDuplicarTipoGasto=isPermiso;
		this.isPermisoOrdenTipoGasto=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGasto(Boolean isPermiso) {
		//this.isPermisoTodoTipoGasto=isPermiso;
		this.isPermisoNuevoTipoGasto=isPermiso;
		this.isPermisoActualizarTipoGasto=isPermiso;
		this.isPermisoActualizarOriginalTipoGasto=isPermiso;
		this.isPermisoEliminarTipoGasto=isPermiso;
		this.isPermisoGuardarCambiosTipoGasto=isPermiso;
		//this.isPermisoConsultaTipoGasto=isPermiso;
		//this.isPermisoBusquedaTipoGasto=isPermiso;
		//this.isPermisoReporteTipoGasto=isPermiso;
		//this.isPermisoOrdenTipoGasto=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGasto=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGasto=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGasto=isPermiso;		
		//this.isPermisoCopiarTipoGasto=isPermiso;		
		//this.isPermisoDuplicarTipoGasto=isPermiso;
		//this.isPermisoOrdenTipoGasto=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGastoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGasto(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGastoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGastoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGastoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGastoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoGasto() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGastoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGasto=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGasto=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGasto=this.isPermisoActualizarTipoGasto;
			this.isPermisoEliminarTipoGasto=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGasto=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGasto=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGasto=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGasto=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGasto=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGasto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGasto=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGasto=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGasto=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGasto=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGasto=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGasto=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGasto=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGasto.setToolTipText(this.jTableDatosTipoGasto.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGasto(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGasto(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGasto() throws Exception {
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoGastoListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGastoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGastoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGastoListas(false);
			} else {
			
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyPaisListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.paissForeignKey==null||this.paissForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PaisConstantesFunciones.SFINALQUERY;

				this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoGastoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoGastoParameterReturnGeneral tipogastoReturnGeneral=new TipoGastoParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipogastoConstantesFunciones.cargarid_paisTipoGasto)
					 || (this.esRecargarFks && this.tipogastoConstantesFunciones.cargarid_paisTipoGasto)) {

					if(!this.tipogastoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipogastoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipogastoReturnGeneral=tipogastoLogic.cargarCombosLoteForeignKeyTipoGasto(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipogastoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGasto()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipogastoSessionBean==null) {
				this.tipogastoSessionBean=new TipoGastoSessionBean();
			}

			if(!this.tipogastoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
				Pais pais=new Pais();
				PaisConstantesFunciones.setPaisDescripcion(pais,Constantes.SMENSAJE_ESCOJA_OPCION);
				pais.setId(null);

				if(!PaisConstantesFunciones.ExisteEnLista(this.paissForeignKey,pais,true)) {

					this.paissForeignKey.add(0,pais);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoGasto()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGasto(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGasto()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGasto();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGasto(TipoGasto tipogasto)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipogasto.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGasto(TipoGasto tipogasto,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGasto()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipogastoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGasto()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGasto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGasto()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGasto()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGasto()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGasto(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGasto()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto!=null && this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoGastoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGastoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGastoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogastoSessionBean=new TipoGastoSessionBean(); 
		this.tipogastoConstantesFunciones=new TipoGastoConstantesFunciones(); 
		this.tipogastoBean=new TipoGasto();//(this.tipogastoConstantesFunciones); 		
		this.tipogastoReturnGeneral=new TipoGastoParameterReturnGeneral(); 
		
		this.tipogastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGastoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGasto(true);
			
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
			
			this.tipogastoConstantesFunciones=new TipoGastoConstantesFunciones(); 
			this.tipogastoBean=new TipoGasto();//this.tipogastoConstantesFunciones); 			
			this.tipogastoReturnGeneral=new TipoGastoParameterReturnGeneral(); 
		
			TipoGastoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Gasto  Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogasto=new TipoGasto();
			this.tipogastos = new ArrayList<TipoGasto>();
			this.tipogastosAux = new ArrayList<TipoGasto>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic=new TipoGastoLogic();
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogastoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogastoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGasto);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGasto);	
					}
					
					if(this.jInternalFrameImportacionTipoGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGasto);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGasto!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGasto);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGasto!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGasto);
				this.jInternalFrameDetalleFormTipoGasto.setVisible(false);
				this.jInternalFrameDetalleFormTipoGasto.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGasto);
					this.jInternalFrameReporteDinamicoTipoGasto.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGasto.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGasto);
					this.jInternalFrameImportacionTipoGasto.setVisible(false);
					this.jInternalFrameImportacionTipoGasto.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGasto!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGasto);
					this.jInternalFrameOrderByTipoGasto.setVisible(false);
					this.jInternalFrameOrderByTipoGasto.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGastoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGastoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogastoReturnGeneral=new TipoGastoParameterReturnGeneral();
			
			this.tipogastoParameterGeneral=new TipoGastoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogastoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGastoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGastoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogastoSessionBean.getEsGuardarRelacionado(),this.tipogastoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGastoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogastoSessionBean.getEsGuardarRelacionado(),this.tipogastoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaDuplicarTipoGasto=true;
			this.isVisibilidadCeldaCopiarTipoGasto=true;
			this.isVisibilidadCeldaVerFormTipoGasto=true;
			this.isVisibilidadCeldaOrdenTipoGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
			this.isVisibilidadCeldaModificarTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=false;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=false;
			this.isVisibilidadCeldaGuardarTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGasto();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGasto(false);
			
			this.setPermisosUsuarioTipoGasto();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogastoSessionBean.getEsGuardarRelacionado() && this.tipogastoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGastoClasesRelacionadas();
			}
			
			if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGastoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGastoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGasto();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGasto();
			}
			
			if(!this.isPermisoBusquedaTipoGasto) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGasto.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGasto,this.isPermisoPaginacionMedioTipoGasto,this.isPermisoPaginacionTodoTipoGasto);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGastoConstantesFunciones.getTiposSeleccionarTipoGasto());
				
				this.tiposColumnasSelect=TipoGastoConstantesFunciones.getTiposSeleccionarTipoGasto(true);
				
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
			//if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGasto();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoGasto(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoGasto(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGasto() ;
			
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
			
			this.paisLogic=new PaisLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipogastoImplementable= (TipoGastoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGastoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogastoImplementableHome= (TipoGastoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGastoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogastos= new ArrayList<TipoGasto>();
			this.tipogastosEliminados= new ArrayList<TipoGasto>();
						
			this.isEsNuevoTipoGasto=false;
			this.esParaAccionDesdeFormularioTipoGasto=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGasto(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGasto();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoGastoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGastoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGasto("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGasto(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGasto();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGasto();
			}
			
			TipoGastoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGasto.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGasto.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGasto.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGasto(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGasto: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGasto() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGasto")) {
				iIndex=this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGasto();	
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
	
	public void cargarCombosForeignKeyTipoGasto(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGasto(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGasto(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGastoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGasto();
		
		this.cargarCombosFrameForeignKeyTipoGasto();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGasto();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGasto();
		}
	}
	
	

	public void cargarCombosForeignKeyPais(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPaisListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPais(this.paissForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoGastoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			
			if(jTableDatosTipoGasto.getRowCount()>=1) {
				jTableDatosTipoGasto.removeRowSelectionInterval(0, jTableDatosTipoGasto.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGasto=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGasto(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGasto(true);			
			//this.tipogasto=new TipoGasto();
			//this.tipogasto.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGasto(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGasto() ;
			
			if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGasto(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogasto);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);				
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGasto: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGastoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGasto.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGasto.getSelectedRows().length;			
			}
			
			tipogastosSeleccionados=this.getTipoGastosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGasto--;			
				//TipoGasto tipogastoAux= new TipoGasto();			
				//tipogastoAux.setId(this.iIdNuevoTipoGasto);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGasto tipogastoOrigen=new TipoGasto();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGasto tipogastoOrigen : tipogastosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogastoOrigen =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogastoOrigen =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGasto();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogasto.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGasto(tipogastoOrigen,this.tipogasto,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogastoLogic.getTipoGastos().add(this.tipogastoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogastos.add(this.tipogastoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGasto(false);
				
				this.jTableDatosTipoGasto.setRowSelectionInterval(this.getIndiceNuevoTipoGasto(), this.getIndiceNuevoTipoGasto());
				
				int iLastRow =  this.jTableDatosTipoGasto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGasto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGasto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGasto(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();									
		
			TipoGasto tipogastoOrigen=new TipoGasto();
			TipoGasto tipogastoDestino=new TipoGasto();
				
			tipogastosSeleccionados=this.getTipoGastosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGasto.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogastosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGasto.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoOrigen =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogastoOrigen =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogastoDestino =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogastoDestino =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogastoOrigen =tipogastosSeleccionados.get(0);
				tipogastoDestino =tipogastosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGasto(tipogastoOrigen,tipogastoDestino,true,false);
				
				tipogastoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogastoDestino,tipogastoLogic.getTipoGastos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogastoDestino,tipogastos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGasto(false);
				
				//this.jTableDatosTipoGasto.setRowSelectionInterval(this.getIndiceNuevoTipoGasto(), this.getIndiceNuevoTipoGasto());
				
				int iLastRow =  this.jTableDatosTipoGasto.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGasto.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGasto.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGasto(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGasto.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGasto.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGasto.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGasto.setVisible(!isVisible);
			this.jPanelPaginacionTipoGasto.setVisible(!isVisible);
			this.jPanelAccionesTipoGasto.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGasto();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGasto();
			
			this.abrirFrameOrderByTipoGasto();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGasto();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGasto(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGasto);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGasto.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGasto.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGasto.setSize(this.jInternalFrameDetalleFormTipoGasto.iWidthFormulario,this.jInternalFrameDetalleFormTipoGasto.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGasto.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGasto.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGasto.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGasto.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGasto.jContentPaneDetalleTipoGasto.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGasto.jContentPaneDetalleTipoGasto.getWidth(),TipoGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGasto.jContentPaneDetalleTipoGasto.getWidth(),TipoGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGasto.jContentPaneDetalleTipoGasto.getWidth(),TipoGastoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGasto.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGasto.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGasto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGasto==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGasto,false,this);
				} else {
					this.jInternalFrameOrderByTipoGasto=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGasto,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGasto);
				this.jInternalFrameOrderByTipoGasto.setVisible(false);
				this.jInternalFrameOrderByTipoGasto.setSelected(false);
				
				this.jInternalFrameOrderByTipoGasto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGasto"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGasto();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGasto() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGasto==null) {
				
				this.jInternalFrameImportacionTipoGasto=new ImportacionJInternalFrame(TipoGastoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGasto);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGasto);
				this.jInternalFrameImportacionTipoGasto.setVisible(false);
				this.jInternalFrameImportacionTipoGasto.setSelected(false);


				this.jInternalFrameImportacionTipoGasto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGasto"));
				this.jInternalFrameImportacionTipoGasto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGasto"));
				this.jInternalFrameImportacionTipoGasto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGasto"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGasto() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGasto==null) {
				this.jInternalFrameReporteDinamicoTipoGasto=new ReporteDinamicoJInternalFrame(TipoGastoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGasto);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGasto);
				this.jInternalFrameReporteDinamicoTipoGasto.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGasto.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGasto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGasto"));
				this.jInternalFrameReporteDinamicoTipoGasto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGasto"));
				this.jInternalFrameReporteDinamicoTipoGasto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGasto"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGasto();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoGasto() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGasto);
			
	       	this.jInternalFrameDetalleFormTipoGasto.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGasto.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGasto.dispose();
			//this.jInternalFrameDetalleFormTipoGasto=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGasto() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGasto.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGasto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGasto.setVisible(true);
	        this.jInternalFrameImportacionTipoGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGasto() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGasto.setVisible(true);
	        this.jInternalFrameOrderByTipoGasto.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGasto() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGasto.setVisible(false);
	        this.jInternalFrameOrderByTipoGasto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGasto() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGasto.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGasto.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGasto() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGasto.setVisible(false);
	        this.jInternalFrameImportacionTipoGasto.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGasto(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGasto(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGasto(true);
			//this.isEsNuevoTipoGasto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGasto(false) ;
			
			if(tipogastoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGasto(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGasto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGastoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGasto(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGasto(true);
			//this.isEsNuevoTipoGasto=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogasto.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGasto("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGasto(false) ;
			
			if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGasto(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGasto(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,TipoGastoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoGasto.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGasto(false);
			
			//if(!this.isEsNuevoTipoGasto) {								
				int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
				
			}
			
			if(this.permiteMantenimiento(this.tipogasto)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGasto=true;
					this.inicializarActualizarBindingTablaTipoGasto(false);
					this.isEsNuevoTipoGasto=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGasto=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGasto=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGasto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGasto(false);
				
				this.habilitarDeshabilitarControlesTipoGasto(false);
			
												
				
				if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGasto();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGastoActionPerformed(evt,tipogastoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGasto(this.tipogasto,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGasto.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogastoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogasto.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGastoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				this.tipogasto.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				this.tipogasto.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogasto)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGastoModel) this.jTableDatosTipoGasto.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGasto=true;
				this.inicializarActualizarBindingTablaTipoGasto(false);
				this.isEsNuevoTipoGasto=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGasto(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGasto(false);
				
				this.habilitarDeshabilitarControlesTipoGasto(false);
				
				
				
				if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGasto();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGastoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGasto.getRowCount()>=1) {
				jTableDatosTipoGasto.removeRowSelectionInterval(0, jTableDatosTipoGasto.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGasto(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGasto(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGasto(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGasto(false) ;
			
			this.isEsNuevoTipoGasto=false;
			
			if(TipoGastoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGasto();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGasto(false);
				
				//SI ES MANUAL
				if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGasto();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGasto--;			
			//TipoGasto tipogastoAux= new TipoGasto();			
			//tipogastoAux.setId(this.iIdNuevoTipoGasto);
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGasto();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
			
			this.tipogasto.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogastoLogic.getTipoGastos().add(this.tipogastoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogastos.add(this.tipogastoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGasto(false);
			
			this.jTableDatosTipoGasto.setRowSelectionInterval(this.getIndiceNuevoTipoGasto(), this.getIndiceNuevoTipoGasto());
			
			int iLastRow =  this.jTableDatosTipoGasto.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGasto.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGasto.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGasto(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGasto(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGasto(false);
			
			//SI ES MANUAL
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGasto();
			}
			
			//this.abrirFrameTreeTipoGasto();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGastoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Gasto S ?", "MANTENIMIENTO DE Tipo Gasto ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGasto.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGasto();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogastoReturnGeneral=tipogastoLogic.procesarImportacionTipoGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogastoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGastoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGastoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGasto.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGasto.setFileImportacion(this.jInternalFrameImportacionTipoGasto.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGasto.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGasto.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGasto.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGasto.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGastoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		

		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGastoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGastoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGastos("Todos",tipogastosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGastoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGastoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoGasto.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGastoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoGastoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGastoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoGastoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGastoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoGastoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGastoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGastos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGastoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoGasto tipogasto:tipogastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogasto.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGastoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGastoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGasto tipogasto:tipogastosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogasto.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGasto(row);				
			//	iRow++;
			//}				
			
			//for(TipoGasto tipogastoAux:tipogastosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGasto(tipogastoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGasto(false);
			
			//SI ES MANUAL
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGasto();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGasto(false);
			
			//SI ES MANUAL
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGasto();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGastoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGasto(false);
			
			//SI ES MANUAL
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGasto();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGasto() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGasto.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGasto.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGasto.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGasto.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGasto.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGasto.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGasto.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGasto(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGasto(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGasto(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGasto(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGasto(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGasto(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGasto(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGasto(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGastoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGasto() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGasto();
		
		this.inicializarActualizarBindingBotonesManualTipoGasto(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGasto();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGasto() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGasto(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGasto(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGasto.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGasto.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGasto.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGasto!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGasto.jCheckBoxPostAccionNuevoTipoGasto.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGasto.jCheckBoxPostAccionSinCerrarTipoGasto.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGasto.jCheckBoxPostAccionSinMensajeTipoGasto.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGasto.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGasto.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGasto.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGasto!=null) {
				this.jInternalFrameDetalleFormTipoGasto.jCheckBoxPostAccionNuevoTipoGasto.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGasto.jCheckBoxPostAccionSinCerrarTipoGasto.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGasto.jCheckBoxPostAccionSinMensajeTipoGasto.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGasto.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGasto.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGasto.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGasto.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGasto.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGasto.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGasto.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGasto.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGasto.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGasto(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGasto(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGasto() throws Exception {
		try	{
			if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGasto();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGasto() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGasto() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGasto.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGasto.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGasto.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGasto.addItem(reporte);
			}
			
			
			if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGasto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGasto.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGasto.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGasto.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGasto.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGasto.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGasto.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGasto();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGasto() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
				this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
				this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGasto.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGasto.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGasto.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGasto.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGasto.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGasto()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jLabelidTipoGastoBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoGasto.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoGasto.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoGasto.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGasto(Boolean esInicializar) throws Exception {				
		if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGasto();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGasto() throws Exception {
		this.inicializarActualizarBindingTablaTipoGasto(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGasto() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGastoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGastoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGasto(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogastoLogic.getTipoGastos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogastos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGasto.setModel(new TipoGastoModel(this.tipogastoLogic.getTipoGastos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGasto.setModel(new TipoGastoModel(this.tipogastos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGasto!=null && this.jInternalFrameOrderByTipoGasto.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGasto();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGastoConstantesFunciones.SCLASSWEBTITULO,tipogastoConstantesFunciones.resaltarSeleccionarTipoGasto,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGastoConstantesFunciones.SCLASSWEBTITULO,tipogastoConstantesFunciones.resaltarSeleccionarTipoGasto,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,TipoGastoConstantesFunciones.LABEL_ID));

		if(this.tipogastoConstantesFunciones.mostraridTipoGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogastoConstantesFunciones.resaltaridTipoGasto,this.tipogastoConstantesFunciones.activaridTipoGasto,this,true,"idTipoGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoConstantesFunciones.resaltaridTipoGasto,this.tipogastoConstantesFunciones.activaridTipoGasto,this,true,"idTipoGasto","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,TipoGastoConstantesFunciones.LABEL_IDPAIS));

		if(this.tipogastoConstantesFunciones.mostrarid_paisTipoGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipogastoConstantesFunciones.resaltarid_paisTipoGasto,this,this.tipogastoConstantesFunciones.activarid_paisTipoGasto));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipogastoConstantesFunciones.resaltarid_paisTipoGasto,this,this.tipogastoConstantesFunciones.activarid_paisTipoGasto,true,"id_paisTipoGasto","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,TipoGastoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogastoConstantesFunciones.mostrarnombreTipoGasto && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGastoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogastoConstantesFunciones.resaltarnombreTipoGasto,this.tipogastoConstantesFunciones.activarnombreTipoGasto,this,true,"nombreTipoGasto","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogastoConstantesFunciones.resaltarnombreTipoGasto,this.tipogastoConstantesFunciones.activarnombreTipoGasto,this,true,"nombreTipoGasto","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoGastoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogastoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogastoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogastoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGasto.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogastoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogastoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGasto.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGasto && this.isPermisoGuardarCambiosTipoGasto) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogastoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogastoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGasto.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGasto.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGasto && this.isPermisoGuardarCambiosTipoGasto) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGasto && this.isPermisoGuardarCambiosTipoGasto) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGasto.moveColumn(this.jTableDatosTipoGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGasto.moveColumn(this.jTableDatosTipoGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGasto.moveColumn(this.jTableDatosTipoGasto.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGasto.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGasto.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGasto,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGasto.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGasto.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGasto.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGasto.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGasto.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogastoLogic.getTipoGastos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogastos.size()-1;
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
		//this.jTableDatosTipoGasto.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGasto.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGasto();
			
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
				
				//this.isEsNuevoTipoGasto=false;
					
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
				if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGasto==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGasto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGasto.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogasto.getsType().equals("DUPLICADO")
				   || this.tipogasto.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGasto=true;
				
				} else {
					this.isEsNuevoTipoGasto=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogastoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogasto.getId()>=0 && !this.tipogasto.getIsNew()) {						
						this.isEsNuevoTipoGasto=false;
						
					} else {
						this.isEsNuevoTipoGasto=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGasto(esRelaciones);						
				
				this.seleccionarTipoGasto(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogasto.getId()<0) {
					this.isEsNuevoTipoGasto=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGasto(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGasto(evt,rowIndex);
				}	
				
				if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGasto: " + this.dDif); 
					}
				}								
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGasto(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogasto)) {
					if(this.tipogasto.getId()>0) {
						this.tipogasto.setIsDeleted(true);
						
						this.tipogastosEliminados.add(this.tipogasto);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogastoLogic.getTipoGastos().remove(this.tipogasto);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogastos.remove(this.tipogasto);				
					}
					
					
					((TipoGastoModel) this.jTableDatosTipoGasto.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGasto(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGasto(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGasto) {
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGasto.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGasto.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGasto(this.tipogasto);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipogastoConstantesFunciones.cargarid_paisTipoGasto || this.tipogastoConstantesFunciones.event_dependid_paisTipoGasto) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipogasto.getid_pais());
									//this.inicializarActualizarBindingTipoGasto(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipogasto.getPais()!=null) {
							this.paissForeignKey.add(tipogasto.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipogasto.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGasto("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGasto(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGasto() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGasto(TipoGasto tipogasto) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGasto(tipogasto,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGasto(TipoGasto tipogasto,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGasto(tipogasto);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGasto(tipogasto,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGasto(tipogasto);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGasto(TipoGasto tipogasto) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setText(tipogasto.getId().toString());
			this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setText(tipogasto.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGasto tipogastoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogastoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGasto tipogastoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogastoLocal=this.tipogasto;
			} else {
				tipogastoLocal=this.tipogastoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogastoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGasto(tipogastoLocal,true);
					
					if(tipogastoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogastoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogastoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGasto(TipoGasto tipogasto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGasto(tipogasto,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(tipogasto);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGasto(TipoGasto tipogasto,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGasto(tipogasto,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGasto(TipoGasto tipogasto,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.getText()==null || this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.getText()=="" || this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setText("0");
			}

			if(conColumnasBase) {tipogasto.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGasto.jLabelIdTipoGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogasto.setnombre(this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGastoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGasto.jLabelnombreTipoGasto,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGasto(TipoGasto tipogastoBean,TipoGasto tipogasto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipogastoBean.getid_pais()!=null && !tipogastoBean.getid_pais().equals(-1L))) {tipogasto.setid_pais(tipogastoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGasto(TipoGasto tipogastoOrigen,TipoGasto tipogasto,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogastoOrigen.getId()!=null && !tipogastoOrigen.getId().equals(0L))) {tipogasto.setId(tipogastoOrigen.getId());}}
			if(conDefault || (!conDefault && tipogastoOrigen.getid_pais()!=null && !tipogastoOrigen.getid_pais().equals(-1L))) {tipogasto.setid_pais(tipogastoOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipogastoOrigen.getnombre()!=null && !tipogastoOrigen.getnombre().equals(""))) {tipogasto.setnombre(tipogastoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGasto(TipoGasto tipogasto) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setText(tipogasto.getId().toString());
			this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setText(tipogasto.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGasto(TipoGastoBean tipogastoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setText(tipogastoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setText(tipogastoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGasto(TipoGastoParameterReturnGeneral tipogastoReturnGeneral,TipoGastoBean tipogastoBean,Boolean conDefault) throws Exception { 
		try {
			TipoGasto tipogastoLocal=new TipoGasto();
			
			tipogastoLocal=tipogastoReturnGeneral.getTipoGasto();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogastoLocal.getId()!=null && !tipogastoLocal.getId().equals(0L))) {tipogastoBean.setId(tipogastoLocal.getId());}}
			if(conDefault || (!conDefault && tipogastoLocal.getid_pais()!=null && !tipogastoLocal.getid_pais().equals(-1L))) {tipogastoBean.setid_pais(tipogastoLocal.getid_pais());}
			if(conDefault || (!conDefault && tipogastoLocal.getnombre()!=null && !tipogastoLocal.getnombre().equals(""))) {tipogastoBean.setnombre(tipogastoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGastoGenerico(Long idTipoGastoSeleccionado,JComboBox jComboBoxTipoGasto,List<TipoGasto> tipogastosLocal)throws Exception {
		try {
			TipoGasto  tipogastoTemp=null;

			for(TipoGasto tipogastoAux:tipogastosLocal) {
				if(tipogastoAux.getId()!=null && tipogastoAux.getId().equals(idTipoGastoSeleccionado)) {
					tipogastoTemp=tipogastoAux;
					break;
				}
			}

			jComboBoxTipoGasto.setSelectedItem(tipogastoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGastoGenerico(JComboBox jComboBoxTipoGasto,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGasto.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGasto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGasto.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGasto.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGasto.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGasto.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogasto=(TipoGasto) tipogastoLogic.getTipoGastos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogasto =(TipoGasto) tipogastos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipogasto.getIsNew() && !tipogasto.getIsChanged() && !tipogasto.getIsDeleted()) {
				sDescripcion=tipogasto.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipogasto.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGasto tipogastoRow=new TipoGasto();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoRow=(TipoGasto) tipogastoLogic.getTipoGastos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogastoRow=(TipoGasto) tipogastos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGasto(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGasto.setVisible((this.isVisibilidadCeldaNuevoTipoGasto && this.isPermisoNuevoTipoGasto));			
			this.jButtonDuplicarTipoGasto.setVisible((this.isVisibilidadCeldaDuplicarTipoGasto && this.isPermisoDuplicarTipoGasto));			
			this.jButtonCopiarTipoGasto.setVisible((this.isVisibilidadCeldaCopiarTipoGasto && this.isPermisoCopiarTipoGasto));
			this.jButtonVerFormTipoGasto.setVisible((this.isVisibilidadCeldaVerFormTipoGasto && this.isPermisoVerFormTipoGasto));
			
			this.jButtonAbrirOrderByTipoGasto.setVisible((this.isVisibilidadCeldaOrdenTipoGasto && this.isPermisoOrdenTipoGasto));			
			
			this.jButtonNuevoRelacionesTipoGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGasto && this.isPermisoNuevoTipoGasto));			
			this.jButtonNuevoGuardarCambiosTipoGasto.setVisible((this.isVisibilidadCeldaNuevoTipoGasto && this.isPermisoNuevoTipoGasto && this.isPermisoGuardarCambiosTipoGasto));
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonModificarTipoGasto.setVisible((this.isVisibilidadCeldaModificarTipoGasto && this.isPermisoActualizarTipoGasto));	
			this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarTipoGasto.setVisible((this.isVisibilidadCeldaActualizarTipoGasto && this.isPermisoActualizarTipoGasto));	
			this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarTipoGasto.setVisible((this.isVisibilidadCeldaEliminarTipoGasto && this.isPermisoEliminarTipoGasto));
			this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarTipoGasto.setVisible(this.isVisibilidadCeldaCancelarTipoGasto);							
			this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.setVisible((this.isVisibilidadCeldaGuardarTipoGasto && this.isPermisoGuardarCambiosTipoGasto));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGasto && this.isPermisoGuardarCambiosTipoGasto));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGasto.setVisible((this.isVisibilidadCeldaNuevoTipoGasto && this.isPermisoNuevoTipoGasto));						
			this.jButtonDuplicarToolBarTipoGasto.setVisible((this.isVisibilidadCeldaDuplicarTipoGasto && this.isPermisoDuplicarTipoGasto));						
			this.jButtonCopiarToolBarTipoGasto.setVisible((this.isVisibilidadCeldaCopiarTipoGasto && this.isPermisoCopiarTipoGasto));			
			this.jButtonVerFormToolBarTipoGasto.setVisible((this.isVisibilidadCeldaVerFormTipoGasto && this.isPermisoVerFormTipoGasto));			
			this.jButtonAbrirOrderByToolBarTipoGasto.setVisible((this.isVisibilidadCeldaOrdenTipoGasto && this.isPermisoOrdenTipoGasto));
			this.jButtonNuevoRelacionesToolBarTipoGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGasto && this.isPermisoNuevoTipoGasto));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGasto.setVisible((this.isVisibilidadCeldaNuevoTipoGasto && this.isPermisoNuevoTipoGasto && this.isPermisoGuardarCambiosTipoGasto));			
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonModificarToolBarTipoGasto.setVisible((this.isVisibilidadCeldaModificarTipoGasto && this.isPermisoActualizarTipoGasto));	
			this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarToolBarTipoGasto.setVisible((this.isVisibilidadCeldaActualizarTipoGasto  && this.isPermisoActualizarTipoGasto));	
			this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarToolBarTipoGasto.setVisible((this.isVisibilidadCeldaEliminarTipoGasto && this.isPermisoEliminarTipoGasto));
			this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarToolBarTipoGasto.setVisible(this.isVisibilidadCeldaCancelarTipoGasto);				
			this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosToolBarTipoGasto.setVisible((this.isVisibilidadCeldaGuardarTipoGasto && this.isPermisoGuardarCambiosTipoGasto));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGasto && this.isPermisoGuardarCambiosTipoGasto));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGasto.setVisible((this.isVisibilidadCeldaNuevoTipoGasto && this.isPermisoNuevoTipoGasto));			
			this.jMenuItemDuplicarTipoGasto.setVisible((this.isVisibilidadCeldaDuplicarTipoGasto && this.isPermisoDuplicarTipoGasto));			
			this.jMenuItemCopiarTipoGasto.setVisible((this.isVisibilidadCeldaCopiarTipoGasto && this.isPermisoCopiarTipoGasto));			
			this.jMenuItemVerFormTipoGasto.setVisible((this.isVisibilidadCeldaVerFormTipoGasto && this.isPermisoVerFormTipoGasto));			
			this.jMenuItemAbrirOrderByTipoGasto.setVisible((this.isVisibilidadCeldaOrdenTipoGasto && this.isPermisoOrdenTipoGasto));			
			//this.jMenuItemMostrarOcultarTipoGasto.setVisible((this.isVisibilidadCeldaOrdenTipoGasto && this.isPermisoOrdenTipoGasto));
			this.jMenuItemDetalleAbrirOrderByTipoGasto.setVisible((this.isVisibilidadCeldaOrdenTipoGasto && this.isPermisoOrdenTipoGasto));			
			//this.jMenuItemDetalleMostrarOcultarTipoGasto.setVisible((this.isVisibilidadCeldaOrdenTipoGasto && this.isPermisoOrdenTipoGasto));			
			this.jMenuItemNuevoRelacionesTipoGasto.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGasto && this.isPermisoNuevoTipoGasto));			
			this.jMenuItemNuevoGuardarCambiosTipoGasto.setVisible((this.isVisibilidadCeldaNuevoTipoGasto && this.isPermisoNuevoTipoGasto && this.isPermisoGuardarCambiosTipoGasto));									
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemModificarTipoGasto.setVisible((this.isVisibilidadCeldaModificarTipoGasto && this.isPermisoActualizarTipoGasto));	
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemActualizarTipoGasto.setVisible((this.isVisibilidadCeldaActualizarTipoGasto && this.isPermisoActualizarTipoGasto));	
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemEliminarTipoGasto.setVisible((this.isVisibilidadCeldaEliminarTipoGasto && this.isPermisoEliminarTipoGasto));
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemCancelarTipoGasto.setVisible(this.isVisibilidadCeldaCancelarTipoGasto);				
			}
			
			this.jMenuItemGuardarCambiosTipoGasto.setVisible((this.isVisibilidadCeldaGuardarTipoGasto && this.isPermisoGuardarCambiosTipoGasto));						
			this.jMenuItemGuardarCambiosTablaTipoGasto.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGasto && this.isPermisoGuardarCambiosTipoGasto));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGasto=this.jButtonNuevoTipoGasto.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGasto=this.jButtonDuplicarTipoGasto.isVisible();
			this.isVisibilidadCeldaCopiarTipoGasto=this.jButtonCopiarTipoGasto.isVisible();
			this.isVisibilidadCeldaVerFormTipoGasto=this.jButtonVerFormTipoGasto.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGasto=this.jButtonAbrirOrderByTipoGasto.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=this.jButtonNuevoRelacionesTipoGasto.isVisible();
			this.isVisibilidadCeldaModificarTipoGasto=this.jButtonModificarTipoGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.isVisibilidadCeldaActualizarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarTipoGasto.isVisible();
			this.isVisibilidadCeldaEliminarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarTipoGasto.isVisible();
			this.isVisibilidadCeldaCancelarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarTipoGasto.isVisible();
			this.isVisibilidadCeldaGuardarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=this.jButtonGuardarCambiosTablaTipoGasto.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGasto=this.jButtonNuevoToolBarTipoGasto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=this.jButtonNuevoRelacionesToolBarTipoGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.isVisibilidadCeldaModificarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonModificarToolBarTipoGasto.isVisible();
			this.isVisibilidadCeldaActualizarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarToolBarTipoGasto.isVisible();
			this.isVisibilidadCeldaEliminarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarToolBarTipoGasto.isVisible();
			this.isVisibilidadCeldaCancelarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarToolBarTipoGasto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGasto=this.jButtonGuardarCambiosToolBarTipoGasto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=this.jButtonGuardarCambiosTablaToolBarTipoGasto.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGasto=this.jMenuItemNuevoTipoGasto.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=this.jMenuItemNuevoRelacionesTipoGasto.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.isVisibilidadCeldaModificarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jMenuItemModificarTipoGasto.isVisible();
			this.isVisibilidadCeldaActualizarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jMenuItemActualizarTipoGasto.isVisible();
			this.isVisibilidadCeldaEliminarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jMenuItemEliminarTipoGasto.isVisible();
			this.isVisibilidadCeldaCancelarTipoGasto=this.jInternalFrameDetalleFormTipoGasto.jMenuItemCancelarTipoGasto.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGasto=this.jMenuItemGuardarCambiosTipoGasto.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=this.jMenuItemGuardarCambiosTablaTipoGasto.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGasto(Boolean esInicializar) {
		if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogastoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGasto();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGasto(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGasto() {
		this.jButtonNuevoTipoGasto.setVisible(this.isPermisoNuevoTipoGasto);			
		this.jButtonDuplicarTipoGasto.setVisible(this.isPermisoDuplicarTipoGasto);			
		this.jButtonCopiarTipoGasto.setVisible(this.isPermisoCopiarTipoGasto);			
		this.jButtonVerFormTipoGasto.setVisible(this.isPermisoVerFormTipoGasto);			
		
		this.jButtonAbrirOrderByTipoGasto.setVisible(this.isPermisoOrdenTipoGasto);					
		
		this.jButtonNuevoRelacionesTipoGasto.setVisible(this.isPermisoNuevoTipoGasto);			
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonModificarTipoGasto.setVisible(this.isPermisoActualizarTipoGasto);	
			this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarTipoGasto.setVisible(this.isPermisoActualizarTipoGasto);	
			this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarTipoGasto.setVisible(this.isPermisoEliminarTipoGasto);
			this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarTipoGasto.setVisible(this.isVisibilidadCeldaCancelarTipoGasto);						
			this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.setVisible(this.isPermisoGuardarCambiosTipoGasto);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGasto.setVisible(this.isPermisoActualizarTipoGasto);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGasto() {
		this.jInternalFrameDetalleFormTipoGasto.jButtonModificarTipoGasto.setVisible(this.isPermisoActualizarTipoGasto);	
		this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarTipoGasto.setVisible(this.isPermisoActualizarTipoGasto);	
		this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarTipoGasto.setVisible(this.isPermisoEliminarTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarTipoGasto.setVisible(this.isVisibilidadCeldaCancelarTipoGasto);							
		this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.setVisible((this.isVisibilidadCeldaGuardarTipoGasto && this.isPermisoGuardarCambiosTipoGasto));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGasto() {
		if(TipoGastoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGasto();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGasto() {
	}
	
	public void jTableDatosTipoGastoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGasto(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGasto(this.gettipogasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogasto==null) {
						this.tipogasto = new TipoGasto();
					}

					this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
				}

				if(this.tipogasto.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogasto.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoGastoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoGasto(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoGasto.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoGasto.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoGasto(this.gettipogasto(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipogastoLogic.getConnexion());

				if(this.tipogasto.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipogasto.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoGasto=(TitledBorder)this.jScrollPanelDatosTipoGasto.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoGasto.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGasto(this.gettipogasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogasto==null) {
						this.tipogasto = new TipoGasto();
					}

					this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
				}

				if(this.tipogasto.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipogasto.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGastoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGasto(this.gettipogasto(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogasto==null) {
						this.tipogasto = new TipoGasto();
					}

					this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);
				}

				if(this.tipogasto.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogasto.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGasto(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdTipoGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGasto(false,false);

			this.getTipoGastosBusquedaPorId();

			this.inicializarActualizarBindingTipoGasto(false);

			//if(TipoGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGasto(false,false);

			this.getTipoGastosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoGasto(false);

			//if(TipoGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoGastoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGasto(false,false);

			this.getTipoGastosFK_IdPais();

			this.inicializarActualizarBindingTipoGasto(false);

			//if(TipoGastoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGasto(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogastoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGasto() {
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
			this.jInternalFrameDetalleFormTipoGasto.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGasto.dispose();
			this.jInternalFrameDetalleFormTipoGasto=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
			this.jInternalFrameReporteDinamicoTipoGasto.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGasto.dispose();
			this.jInternalFrameReporteDinamicoTipoGasto=null;
		}
		
		if(this.jInternalFrameImportacionTipoGasto!=null) {
			this.jInternalFrameImportacionTipoGasto.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGasto.dispose();
			this.jInternalFrameImportacionTipoGasto=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGasto();
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGasto")) {
				jButtonDuplicarTipoGastoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGasto")) {
				jButtonCopiarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGasto")) {
				jButtonVerFormTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGasto")) {
				jButtonDuplicarTipoGastoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGasto")) {
				jButtonDuplicarTipoGastoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGasto")) {
				jButtonModificarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGasto")) {
				jButtonModificarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGasto")) {
				jButtonModificarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGasto")) {
				jButtonActualizarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGasto")) {
				jButtonActualizarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGasto")) {
				jButtonActualizarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGasto")) {
				jButtonEliminarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGasto")) {
				jButtonEliminarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGasto")) {
				jButtonEliminarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGasto")) {
				jButtonCancelarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGasto")) {
				jButtonCancelarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGasto")) {
				jButtonCancelarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGasto")) {
				jButtonCerrarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGasto")) {
				jButtonCerrarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGasto")) {
				jButtonCerrarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGasto")) {
				jButtonMostrarOcultarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGasto")) {
				jButtonCancelarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGasto")) {
				jButtonCopiarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGasto")) {
				jButtonVerFormTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGasto")) {
				jButtonCopiarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGasto")) {
				jButtonVerFormTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGasto")) {
				jButtonRecargarInformacionTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGasto")) {
				jButtonRecargarInformacionTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGasto")) {
				jButtonRecargarInformacionTipoGastoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGasto")) {
				jButtonAnterioresTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGasto")) {
				jButtonAnterioresTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGasto")) {
				jButtonAnterioresTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGasto")) {
				jButtonSiguientesTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGasto")) {
				jButtonSiguientesTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGasto")) {
				jButtonSiguientesTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGasto") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGasto")) {
				jButtonAbrirOrderByTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGasto") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGasto")) {
				jButtonMostrarOcultarTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGasto")) {
				jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGasto")) {
				jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGasto")) {
				jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGasto")) {
				jButtonCerrarReporteDinamicoTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGasto")) {
				jButtonGenerarReporteDinamicoTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGasto")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGasto")) {
				jButtonCerrarImportacionTipoGastoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGasto")) {
				
				jButtonGenerarImportacionTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGasto")) {
				
				jButtonAbrirImportacionTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGasto")) {
				jComboBoxTiposAccionesTipoGastoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGasto")) {
				jComboBoxTiposRelacionesTipoGastoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGasto")) {
				jComboBoxTiposAccionesTipoGastoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGasto")) {
				
				jComboBoxTiposSeleccionarTipoGastoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGasto")) {
				jTextFieldValorCampoGeneralTipoGastoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGasto")) {
				jButtonAbrirOrderByTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGasto")) {
				jButtonAbrirOrderByTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGasto")) {
				jButtonCerrarOrderByTipoGastoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGastoBusqueda")) {
				this.jButtonidTipoGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGastoUpdate")) {
				this.jButtonid_paisTipoGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGastoBusqueda")) {
				this.jButtonid_paisTipoGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGastoBusqueda")) {
				this.jButtonnombreTipoGastoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdTipoGasto")) {
				this.jButtonBusquedaPorIdTipoGastoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoGasto")) {
				this.jButtonBusquedaPorNombreTipoGastoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoGasto")) {
				this.jButtonFK_IdPaisTipoGastoActionPerformed(evt);
			}
			
			;
			
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGasto();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGasto tipogastoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogastoLocal=this.tipogasto;
			} else {
				tipogastoLocal=this.tipogastoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
							
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
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
			
			


			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
								
						
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
								
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
							
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
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
			
			


			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
								
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGasto")) {
					jCheckBoxSeleccionarTodosTipoGastoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGasto")) {
					jCheckBoxSeleccionadosTipoGastoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGasto")) {
					
				}
				
				


				
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
												
				
				


				
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
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
			
			


			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGastoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogasto);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogasto);
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
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
				
				


				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGasto.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGasto.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGastoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogastoAnterior =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGasto")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGastoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGasto.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogasto =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogasto =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogasto);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGasto")) {
				
				}
				
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGasto")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGasto.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGasto")) {
			
			}
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGasto();
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGasto")) {
				jButtonDuplicarTipoGastoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGasto")) {
				jButtonCopiarTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGasto")) {
				jButtonVerFormTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGasto")) {
				jButtonNuevoTipoGastoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGasto")) {
				jButtonModificarTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGasto")) {
				jButtonActualizarTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGasto")) {
				jButtonEliminarTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGasto")) {
				jButtonCancelarTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGasto")) {
				jButtonCerrarTipoGastoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGasto")) {
				jButtonGuardarCambiosTipoGastoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGasto")) {
				jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGasto")) {
				jButtonAbrirOrderByTipoGastoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGasto")) {
				jButtonRecargarInformacionTipoGastoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGasto")) {
				jButtonAnterioresTipoGastoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGasto")) {
				jButtonSiguientesTipoGastoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGastoBusqueda")) {
				this.jButtonidTipoGastoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoGastoUpdate")) {
				this.jButtonid_paisTipoGastoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoGastoBusqueda")) {
				this.jButtonid_paisTipoGastoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGastoBusqueda")) {
				this.jButtonnombreTipoGastoBusquedaActionPerformed(evt);
			}
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGasto();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGasto")) {
				closingInternalFrameTipoGasto();
				
			} else if(sTipo.equals("jButtonCancelarTipoGasto")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGasto = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGastoBeanSwingJInternalFrame jInternalFrameParent=(TipoGastoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGasto.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGastoActionPerformed(null);
			}
			
			TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogasto,new Object(),this.tipogastoParameterGeneral,this.tipogastoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGasto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGasto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGasto(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogasto)) {
			if(!esControlTabla) {
				if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);			
				}
				
				if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGasto(this.tipogasto,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogastoReturnGeneral=tipogastoLogic.procesarEventosTipoGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoLogic.getTipoGastos(),this.tipogasto,this.tipogastoParameterGeneral,this.isEsNuevoTipoGasto,classes);//this.tipogastoLogic.getTipoGasto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGasto(this.tipogastoReturnGeneral,this.tipogastoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGasto(classes,this.tipogastoReturnGeneral,this.tipogastoBean,false);
					}
						
					if(this.tipogastoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGasto(this.tipogastoReturnGeneral.getTipoGasto());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGasto(this.tipogastoReturnGeneral.getTipoGasto());	
					}
						
					if(this.tipogastoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGasto(this.tipogastoReturnGeneral.getTipoGasto(),classes);//this.tipogastoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGasto(this.tipogasto,classes);//this.tipogastoBean);									
				}
			
				if(TipoGastoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGasto(this.tipogasto,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGasto(this.tipogasto);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogastoAnterior!=null) {
						this.tipogasto=this.tipogastoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogastoReturnGeneral=tipogastoLogic.procesarEventosTipoGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogastoLogic.getTipoGastos(),this.tipogasto,this.tipogastoParameterGeneral,this.isEsNuevoTipoGasto,classes);//this.tipogastoLogic.getTipoGasto()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogastoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogastoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogastoReturnGeneral.getTipoGasto(),tipogastoLogic.getTipoGastos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogastoReturnGeneral.getTipoGasto(),this.tipogastos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGasto.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGasto.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGasto();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGasto() throws Exception {
		
		TipoGastoModel tipogastoModel=(TipoGastoModel)this.jTableDatosTipoGasto.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogastoModel.tipogastos=this.tipogastoLogic.getTipoGastos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogastoModel.tipogastos=this.tipogastos;
		}
		
		
		((TipoGastoModel) this.jTableDatosTipoGasto.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGasto() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogastoAnterior(),this.tipogastoLogic.getTipoGastos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogastoAnterior(),this.tipogastos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGasto();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGasto(TipoGasto tipogasto,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
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
										
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogasto,new Object(),generalEntityParameterGeneral,this.tipogastoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogastoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGastoConstantesFunciones.getClassesRelationshipsOfTipoGasto(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGastoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGasto(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGasto(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGastoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogasto,new Object(),generalEntityParameterGeneral,this.tipogastoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGasto(TipoGastoBean tipogastoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGasto(ArrayList<Classe> classes,TipoGastoReturnGeneral tipogastoReturnGeneral,TipoGastoBean tipogastoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGasto(TipoGasto tipogasto,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipogasto)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGasto = new TipoGastoDetalleFormJInternalFrame(jDesktopPane,this.tipogastoSessionBean.getConGuardarRelaciones(),this.tipogastoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.setVisible(false);
		this.jInternalFrameDetalleFormTipoGasto.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGasto.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGasto.tipogastoLogic=this.tipogastoLogic;
		
		this.cargarCombosFrameForeignKeyTipoGasto("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGasto();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGasto();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGasto("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGasto();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGasto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGasto"));
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonModificarTipoGasto.addActionListener(new ButtonActionListener(this,"ModificarTipoGasto"));

		
		this.jInternalFrameDetalleFormTipoGasto.jButtonModificarToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGasto"));
					
		this.jInternalFrameDetalleFormTipoGasto.jMenuItemModificarTipoGasto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGasto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarTipoGasto.addActionListener (new ButtonActionListener(this,"ActualizarTipoGasto"));
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGasto"));
						
		this.jInternalFrameDetalleFormTipoGasto.jMenuItemActualizarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGasto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarTipoGasto.addActionListener (new ButtonActionListener(this,"EliminarTipoGasto"));
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGasto"));
								
		this.jInternalFrameDetalleFormTipoGasto.jMenuItemEliminarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGasto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarTipoGasto.addActionListener (new ButtonActionListener(this,"CancelarTipoGasto"));
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGasto"));
					
		this.jInternalFrameDetalleFormTipoGasto.jMenuItemCancelarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGasto"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jMenuItemDetalleCerrarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGasto"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGasto"));
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGasto"));
		
		
		
		this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGasto"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonidTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGasto.jButtonid_paisTipoGastoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonid_paisTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonnombreTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGasto"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGasto"));
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGasto"));
		}
		
		this.jTableDatosTipoGasto.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGasto"));
		
		this.jTableDatosTipoGasto.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGasto"));
		
		this.jButtonNuevoTipoGasto.addActionListener(new ButtonActionListener(this,"NuevoTipoGasto"));
		
		this.jButtonDuplicarTipoGasto.addActionListener(new ButtonActionListener(this,"DuplicarTipoGasto"));
		
		this.jButtonCopiarTipoGasto.addActionListener(new ButtonActionListener(this,"CopiarTipoGasto"));
		
		this.jButtonVerFormTipoGasto.addActionListener(new ButtonActionListener(this,"VerFormTipoGasto"));
		
		
		this.jButtonNuevoToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGasto"));
			
		this.jButtonDuplicarToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGasto"));
			
		this.jMenuItemNuevoTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGasto"));
			
		this.jMenuItemDuplicarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGasto"));		
		
		
		this.jButtonNuevoRelacionesTipoGasto.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGasto"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGasto"));
			
		this.jMenuItemNuevoRelacionesTipoGasto.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGasto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonModificarTipoGasto.addActionListener(new ButtonActionListener(this,"ModificarTipoGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonModificarToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGasto"));
			
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemModificarTipoGasto.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarTipoGasto.addActionListener (new ButtonActionListener(this,"ActualizarTipoGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonActualizarToolBarTipoGasto.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGasto"));
				
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemActualizarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarTipoGasto.addActionListener (new ButtonActionListener(this,"EliminarTipoGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonEliminarToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGasto"));
						
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemEliminarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarTipoGasto.addActionListener (new ButtonActionListener(this,"CancelarTipoGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonCancelarToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGasto"));
			
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemCancelarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGasto"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGasto"));		
		
		
		this.jButtonCerrarTipoGasto.addActionListener (new ButtonActionListener(this,"CerrarTipoGasto"));
		
		
		this.jButtonCerrarToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGasto"));
			
		this.jMenuItemCerrarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGasto"));
			
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jMenuItemDetalleCerrarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGasto"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGasto"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGasto"));
		}
		
		this.jButtonCopiarToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGasto"));
			
		this.jButtonVerFormToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGasto"));
		
		this.jMenuItemGuardarCambiosTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGasto"));
			
		this.jMenuItemCopiarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGasto"));		
		
		this.jMenuItemVerFormTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGasto"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGasto"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGasto"));
			
		this.jMenuItemGuardarCambiosTablaTipoGasto.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGasto"));		
		
		
		
		this.jButtonRecargarInformacionTipoGasto.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGasto"));
					
		this.jButtonRecargarInformacionToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGasto"));
		
		this.jMenuItemRecargarInformacionTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGasto"));		
		
		
		
		this.jButtonAnterioresTipoGasto.addActionListener (new ButtonActionListener(this,"AnterioresTipoGasto"));
		
		
		this.jButtonAnterioresToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGasto"));
		
		this.jMenuItemAnterioresTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGasto"));		
		
		
		this.jButtonSiguientesTipoGasto.addActionListener (new ButtonActionListener(this,"SiguientesTipoGasto"));
		
		
		this.jButtonSiguientesToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGasto"));
			
		this.jMenuItemSiguientesTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGasto"));
			
		this.jMenuItemAbrirOrderByTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGasto"));
			
		this.jMenuItemMostrarOcultarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGasto"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGasto"));
			
		this.jMenuItemDetalleMostarOcultarTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGasto"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGasto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGasto"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGasto"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGasto.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGasto"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGasto.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGasto"));

		this.jCheckBoxSeleccionadosTipoGasto.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGasto"));
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGasto"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGasto.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGasto"));
			
		this.jComboBoxTiposAccionesTipoGasto.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGasto"));
					
		this.jComboBoxTiposSeleccionarTipoGasto.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGasto"));
			
		this.jTextFieldValorCampoGeneralTipoGasto.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGasto"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonidTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGasto.jButtonid_paisTipoGastoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonid_paisTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonnombreTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdTipoGasto.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoGasto"));

			this.jButtonBusquedaPorNombreTipoGasto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGasto"));

			this.jButtonFK_IdPaisTipoGasto.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGasto"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGasto!=null) {
				this.jInternalFrameReporteDinamicoTipoGasto.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGasto"));
				this.jInternalFrameReporteDinamicoTipoGasto.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGasto"));
				this.jInternalFrameReporteDinamicoTipoGasto.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGasto"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGasto.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGasto"));				
			//this.jButtonGenerarReporteDinamicoTipoGasto.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGasto"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGasto.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGasto"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGasto!=null) {
				this.jInternalFrameImportacionTipoGasto.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGasto"));
				this.jInternalFrameImportacionTipoGasto.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGasto"));
				this.jInternalFrameImportacionTipoGasto.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGasto"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGasto.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGasto"));
			
			this.jButtonAbrirOrderByToolBarTipoGasto.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGasto"));			
			
			if(this.jInternalFrameOrderByTipoGasto!=null) {
				this.jInternalFrameOrderByTipoGasto.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGasto"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGasto!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGasto.jTabbedPaneRelacionesTipoGasto.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGasto"));
		
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
            		closingInternalFrameTipoGasto();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGasto.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGasto = (JInternalFrameBase)event.getSource();
	            	
	            TipoGastoBeanSwingJInternalFrame jInternalFrameParent=(TipoGastoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGasto.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGastoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGasto.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGastoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGasto.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGasto.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGasto";
		inputMap = this.jButtonNuevoTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGastoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGastoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGasto";
		inputMap = this.jButtonNuevoRelacionesTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGastoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGasto";
		inputMap = this.jButtonModificarTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGasto";
		inputMap = this.jButtonActualizarTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGasto";
		inputMap = this.jButtonEliminarTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGasto";
		inputMap = this.jButtonCancelarTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGasto";
		inputMap = this.jButtonCerrarTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGasto";
		inputMap = this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGasto.jButtonGuardarCambiosTipoGasto.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGastoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGasto.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGastoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGasto.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGastoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonidTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGastoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoGasto.jButtonid_paisTipoGastoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonid_paisTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoGastoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGasto.jButtonnombreTipoGastoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGastoBusqueda"));
		
		
		this.jButtonBusquedaPorIdTipoGasto.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoGasto"));

		this.jButtonBusquedaPorNombreTipoGasto.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGasto"));

		this.jButtonFK_IdPaisTipoGasto.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoGasto"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGasto.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGastoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGastoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGasto.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGasto(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
					tipogastoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGasto tipogastoAux:tipogastos) {
					tipogastoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGastoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGasto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
						tipogastoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGasto tipogastoAux:tipogastos) {
						tipogastoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGasto tipogastoAux:tipogastos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGasto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGasto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGasto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGastoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGasto(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGasto.getSelectedRows();
			
			TipoGasto tipogastoLocal=new TipoGasto();
			
			//this.seleccionarTodosTipoGasto(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogastoLocal =(TipoGasto) this.tipogastoLogic.getTipoGastos().toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogastoLocal =(TipoGasto) this.tipogastos.toArray()[this.jTableDatosTipoGasto.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogastoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
						tipogastoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGasto tipogastoAux:tipogastos) {
						tipogastoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGasto(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGasto.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGasto.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGasto,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGastoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGastoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGastoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGasto(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGasto.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGasto tipogastoAux:this.tipogastoLogic.getTipoGastos()) {
				
						if(sTipoSeleccionar.equals(TipoGastoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogastoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGasto tipogastoAux:tipogastos) {
					
						if(sTipoSeleccionar.equals(TipoGastoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogastoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGasto(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGastoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGasto(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGasto=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGasto.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGasto) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGasto(conSplash);
				
					this.generarReporteTipoGastosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGastosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGastosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGastosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGasto();
				
				this.exportarTipoGastosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGastos();
				//this.importarTipoGastos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGasto();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGastosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Gasto ", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGasto();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGasto)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGasto(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoGastoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoGasto) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoGasto(conSplash);
					
						//this.actualizarParametrosGeneralTipoGasto();
						
						this.generarReporteProcesoAccionTipoGastosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoGastoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Gasto S SELECCIONADOS?", "MANTENIMIENTO DE Tipo Gasto ", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoGasto();
				
						this.actualizarParametrosGeneralTipoGasto();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipogastoReturnGeneral=tipogastoLogic.procesarAccionTipoGastosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipogastoLogic.getTipoGastos(),this.tipogastoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoGastoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGasto();
					
					TipoGastoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoGastoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGasto.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGasto.jComboBoxTiposAccionesFormularioTipoGasto.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGasto(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGastoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGasto();
			
			if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
			TipoGasto tipogasto=new TipoGasto();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGasto(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGasto.getSelectedItem();
			
			
			
			
			tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogastosSeleccionados.size()==1) {
				for(TipoGasto tipogastoAux:tipogastosSeleccionados) {
					tipogasto=tipogastoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGasto();
			
      		//this.finishProcessTipoGasto(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGastoReturnGeneral() throws Exception {
		if(this.tipogastoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogastoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogastoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogastoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogastoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogastoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGasto(false);
		}
		
		if(this.tipogastoReturnGeneral.getConRetornoLista() || this.tipogastoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogastoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogastoLogic.setTipoGastos(this.tipogastoReturnGeneral.getTipoGastos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogastoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogastoLogic.setTipoGasto(this.tipogastoReturnGeneral.getTipoGasto());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGasto(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGasto() throws Exception {
		
		
	}
	
	public ArrayList<TipoGasto> getTipoGastosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGasto) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGasto tipogastoAux:tipogastoLogic.getTipoGastos()) {
					if(tipogastoAux.getIsSelected()) {
						tipogastosSeleccionados.add(tipogastoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGasto tipogastoAux:this.tipogastos) {
					if(tipogastoAux.getIsSelected()) {
						tipogastosSeleccionados.add(tipogastoAux);				
					}
				}
			}
			
			if(tipogastosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogastosSeleccionados.addAll(this.tipogastoLogic.getTipoGastos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogastosSeleccionados.addAll(this.tipogastos);				
					}
				}
			}
		} else {
			tipogastosSeleccionados.add(this.tipogasto);
		}
		
		return tipogastosSeleccionados;
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
	
	public void generarReporteTipoGastosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGastosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGastosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGastosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGastosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Gasto ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGastosSeleccionados() throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGastos("Todos",tipogastosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGastosSeleccionados() throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGastos("Todos",tipogastosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGastosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGastos("Todos",tipogastosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGastosSeleccionados() throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGasto();
		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGasto();
		
		
		//this.generarReporteTipoGastos("Todos",tipogastosSeleccionados ,tipogastoImplementable,tipogastoImplementableHome);
	}
	
	public void mostrarImportacionTipoGastos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGasto();
		
		this.abrirFrameImportacionTipoGasto();		
		
			
		//this.generarReporteTipoGastos("Todos",tipogastosSeleccionados ,tipogastoImplementable,tipogastoImplementableHome);
	}
	
	public void importarTipoGastos() throws Exception {		
	
	}
	
	public void exportarTipoGastosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGastosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGastosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGastosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Gasto ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGastosSeleccionados() throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGasto(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGasto tipogastoAux:tipogastosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGasto(tipogastoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogastoAux.setsDetalleGeneralEntityReporte(tipogastoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGasto(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGastoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGastoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGasto(TipoGasto tipogasto,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogasto.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogasto.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogasto.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogasto.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGastosSeleccionados() throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGastos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGasto(row);				
				iRow++;
			}				
			
			for(TipoGasto tipogastoAux:tipogastosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGasto(tipogastoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGastosSeleccionados() throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();		
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogasto.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogastos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogasto");
			//elementRoot.appendChild(element);
		
			for(TipoGasto tipogastoAux:tipogastosSeleccionados) {
				element = document.createElement("tipogasto");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGasto(tipogastoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Gasto ",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGasto(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGastoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGasto(TipoGasto tipogasto,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogasto.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogasto.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogasto.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGasto(TipoGasto tipogasto,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGastoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogasto.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGastoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogasto.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoGastoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipogasto.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoGastoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogasto.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGastosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGasto> tipogastosSeleccionados=new ArrayList<TipoGasto>();
		
		tipogastosSeleccionados=this.getTipoGastosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGasto(tipogastosSeleccionados);
		
		this.generarReporteTipoGastos("Todos",tipogastosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGasto(ArrayList<TipoGasto> tipogastosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGasto tipogastoAux:tipogastosSeleccionados) {
				tipogastoAux.setsDetalleGeneralEntityReporte(tipogastoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGastoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipogastoAux.setsDescripcionGeneralEntityReporte1(tipogastoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoGastoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogastoAux.setsDescripcionGeneralEntityReporte1(tipogastoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGastoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGasto(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGasto=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGasto=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGasto=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=false;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
			this.isVisibilidadCeldaModificarTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=true;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
			this.isVisibilidadCeldaModificarTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=true;
			this.isVisibilidadCeldaEliminarTipoGasto=true;
			this.isVisibilidadCeldaCancelarTipoGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
			this.isVisibilidadCeldaModificarTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=true;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=true;
			this.isVisibilidadCeldaModificarTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=false;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
			this.isVisibilidadCeldaActualizarTipoGasto=false;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
			this.isVisibilidadCeldaModificarTipoGasto=true;
			this.isVisibilidadCeldaActualizarTipoGasto=false;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
			this.isVisibilidadCeldaCancelarTipoGasto=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGasto=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGastoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGasto=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=true;
		} else {
			this.actualizarEstadoPanelsTipoGasto(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGasto=false;
			//this.isVisibilidadCeldaVerFormTipoGasto=false;
			this.isVisibilidadCeldaDuplicarTipoGasto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogastoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGasto=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGasto=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogastoSessionBean.getEsGuardarRelacionado()) {
			if(!tipogastoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;												
			}
			
			this.jButtonCerrarTipoGasto.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGasto=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogasto)) {
			this.isVisibilidadCeldaActualizarTipoGasto=false;
			this.isVisibilidadCeldaEliminarTipoGasto=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGasto() {
	}
	
	public void actualizarEstadoPanelsTipoGasto(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGasto!=null) {
				this.jScrollPanelDatosEdicionTipoGasto.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGasto!=null) {
				this.jScrollPanelDatosTipoGasto.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGasto!=null) {
				this.jPanelPaginacionTipoGasto.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGasto!=null) {
					this.jTabbedPaneBusquedasTipoGasto.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogastoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGasto!=null) {
				this.jTabbedPaneBusquedasTipoGasto.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGasto!=null) {
				this.jPanelParametrosReportesTipoGasto.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorId=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoGasto.remove(jPanelBusquedaPorIdTipoGasto);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoGasto.remove(jPanelBusquedaPorNombreTipoGasto);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoGasto.remove(jPanelFK_IdPaisTipoGasto);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGastoSessionBean tipogastoSessionBean=new TipoGastoSessionBean();
		
		if(this.tipogastoSessionBean==null) {
			this.tipogastoSessionBean=new TipoGastoSessionBean();
		}
		
		this.tipogastoSessionBean.setsUltimaBusquedaTipoGasto(this.getsAccionBusqueda());
		this.tipogastoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogastoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipogastoSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipogastoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipogastoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGastoSessionBean tipogastoSessionBean=new TipoGastoSessionBean();
		
		if(this.tipogastoSessionBean==null) {
			this.tipogastoSessionBean=new TipoGastoSessionBean();
		}
		
		if(this.tipogastoSessionBean.getsUltimaBusquedaTipoGasto()!=null&&!this.tipogastoSessionBean.getsUltimaBusquedaTipoGasto().equals("")) {
			this.setsAccionBusqueda(tipogastoSessionBean.getsUltimaBusquedaTipoGasto());
			this.setiNumeroPaginacion(tipogastoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogastoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipogastoSessionBean.getid());
				tipogastoSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipogastoSessionBean.getnombre());
				tipogastoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipogastoSessionBean.getid_pais());
				tipogastoSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipogastoSessionBean.setsUltimaBusquedaTipoGasto("");
		this.tipogastoSessionBean.setiNumeroPaginacion(TipoGastoConstantesFunciones.INUMEROPAGINACION);
		this.tipogastoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGasto(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGasto() {
		this.updateBorderResaltarBusquedasFormularioTipoGasto();
		this.updateVisibilidadBusquedasFormularioTipoGasto();
		this.updateHabilitarBusquedasFormularioTipoGasto();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGasto() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGasto.getComponents().length>0) {
	

		if(this.tipogastoConstantesFunciones.resaltarBusquedaPorIdTipoGasto!=null) {
			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorIdTipoGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
				jPanel.setBorder(this.tipogastoConstantesFunciones.resaltarBusquedaPorIdTipoGasto);
			}
		}

		if(this.tipogastoConstantesFunciones.resaltarBusquedaPorNombreTipoGasto!=null) {
			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorNombreTipoGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
				jPanel.setBorder(this.tipogastoConstantesFunciones.resaltarBusquedaPorNombreTipoGasto);
			}
		}

		if(this.tipogastoConstantesFunciones.resaltarFK_IdPaisTipoGasto!=null) {
			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelFK_IdPaisTipoGasto);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
				jPanel.setBorder(this.tipogastoConstantesFunciones.resaltarFK_IdPaisTipoGasto);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGasto() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGasto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorIdTipoGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogastoConstantesFunciones.mostrarBusquedaPorIdTipoGasto);
			if(!this.tipogastoConstantesFunciones.mostrarBusquedaPorIdTipoGasto && index>-1) {
				this.jTabbedPaneBusquedasTipoGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorNombreTipoGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogastoConstantesFunciones.mostrarBusquedaPorNombreTipoGasto);
			if(!this.tipogastoConstantesFunciones.mostrarBusquedaPorNombreTipoGasto && index>-1) {
				this.jTabbedPaneBusquedasTipoGasto.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelFK_IdPaisTipoGasto);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogastoConstantesFunciones.mostrarFK_IdPaisTipoGasto);
			if(!this.tipogastoConstantesFunciones.mostrarFK_IdPaisTipoGasto && index>-1) {
				this.jTabbedPaneBusquedasTipoGasto.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGasto() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGasto.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorIdTipoGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogastoConstantesFunciones.activarBusquedaPorIdTipoGasto);
				this.jTabbedPaneBusquedasTipoGasto.setEnabledAt(index,this.tipogastoConstantesFunciones.activarBusquedaPorIdTipoGasto);
			}

			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorNombreTipoGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogastoConstantesFunciones.activarBusquedaPorNombreTipoGasto);
				this.jTabbedPaneBusquedasTipoGasto.setEnabledAt(index,this.tipogastoConstantesFunciones.activarBusquedaPorNombreTipoGasto);
			}

			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelFK_IdPaisTipoGasto);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogastoConstantesFunciones.activarFK_IdPaisTipoGasto);
				this.jTabbedPaneBusquedasTipoGasto.setEnabledAt(index,this.tipogastoConstantesFunciones.activarFK_IdPaisTipoGasto);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGasto(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorIdTipoGasto);

			this.jTabbedPaneBusquedasTipoGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);

			this.tipogastoConstantesFunciones.setResaltarBusquedaPorIdTipoGasto(resaltar);

			jPanel.setBorder(this.tipogastoConstantesFunciones.resaltarBusquedaPorIdTipoGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelBusquedaPorNombreTipoGasto);

			this.jTabbedPaneBusquedasTipoGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);

			this.tipogastoConstantesFunciones.setResaltarBusquedaPorNombreTipoGasto(resaltar);

			jPanel.setBorder(this.tipogastoConstantesFunciones.resaltarBusquedaPorNombreTipoGasto);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoGasto.indexOfComponent(this.jPanelFK_IdPaisTipoGasto);

			this.jTabbedPaneBusquedasTipoGasto.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGasto.getComponent(index);

			this.tipogastoConstantesFunciones.setResaltarFK_IdPaisTipoGasto(resaltar);

			jPanel.setBorder(this.tipogastoConstantesFunciones.resaltarFK_IdPaisTipoGasto);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGasto.setBorder(resaltar);
			
		}
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
	
	public void updateControlesFormularioTipoGasto() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGasto();
		this.updateVisibilidadResaltarControlesFormularioTipoGasto();
		this.updateHabilitarResaltarControlesFormularioTipoGasto();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGasto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogastoConstantesFunciones.resaltaridTipoGasto!=null && this.jInternalFrameDetalleFormTipoGasto!=null) {this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setBorder(this.tipogastoConstantesFunciones.resaltaridTipoGasto);}
		if(this.tipogastoConstantesFunciones.resaltarid_paisTipoGasto!=null && this.jInternalFrameDetalleFormTipoGasto!=null) {this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setBorder(this.tipogastoConstantesFunciones.resaltarid_paisTipoGasto);}
		if(this.tipogastoConstantesFunciones.resaltarnombreTipoGasto!=null && this.jInternalFrameDetalleFormTipoGasto!=null) {this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setBorder(this.tipogastoConstantesFunciones.resaltarnombreTipoGasto);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGasto() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
	
		//this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setVisible(this.tipogastoConstantesFunciones.mostraridTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.jPanelidTipoGasto.setVisible(this.tipogastoConstantesFunciones.mostraridTipoGasto);
		//this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setVisible(this.tipogastoConstantesFunciones.mostrarid_paisTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.jPanelid_paisTipoGasto.setVisible(this.tipogastoConstantesFunciones.mostrarid_paisTipoGasto);
		//this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setVisible(this.tipogastoConstantesFunciones.mostrarnombreTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.jPanelnombreTipoGasto.setVisible(this.tipogastoConstantesFunciones.mostrarnombreTipoGasto);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGasto() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGasto==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGasto!=null) {
	
		this.jInternalFrameDetalleFormTipoGasto.jLabelidTipoGasto.setEnabled(this.tipogastoConstantesFunciones.activaridTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.jComboBoxid_paisTipoGasto.setEnabled(this.tipogastoConstantesFunciones.activarid_paisTipoGasto);
		this.jInternalFrameDetalleFormTipoGasto.jTextAreanombreTipoGasto.setEnabled(this.tipogastoConstantesFunciones.activarnombreTipoGasto);
		}
	}
	
		
}