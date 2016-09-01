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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.TipoTituloClienteConstantesFunciones;
import com.bydan.erp.cartera.util.TipoTituloClienteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.TipoTituloClienteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.TipoTituloClienteBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class TipoTituloClienteBeanSwingJInternalFrame extends TipoTituloClienteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoTituloClienteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoTituloCliente> tipotituloclienteValidator = new ClassValidator<TipoTituloCliente>(TipoTituloCliente.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoTituloCliente tipotitulocliente;	
	public TipoTituloCliente tipotituloclienteAux;
	public TipoTituloCliente tipotituloclienteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoTituloCliente tipotituloclienteTotales;
	public Long idTipoTituloClienteActual;
	public Long iIdNuevoTipoTituloCliente=0L;
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
	
	public Boolean isPermisoTodoTipoTituloCliente;
	public Boolean isPermisoNuevoTipoTituloCliente;
	public Boolean isPermisoActualizarTipoTituloCliente;
	public Boolean isPermisoActualizarOriginalTipoTituloCliente;
	public Boolean isPermisoEliminarTipoTituloCliente;
	public Boolean isPermisoGuardarCambiosTipoTituloCliente;
	public Boolean isPermisoConsultaTipoTituloCliente;
	public Boolean isPermisoBusquedaTipoTituloCliente;
	public Boolean isPermisoReporteTipoTituloCliente;
	public Boolean isPermisoPaginacionMedioTipoTituloCliente;
	public Boolean isPermisoPaginacionAltoTipoTituloCliente;
	public Boolean isPermisoPaginacionTodoTipoTituloCliente;
	public Boolean isPermisoCopiarTipoTituloCliente;
	public Boolean isPermisoVerFormTipoTituloCliente;
	public Boolean isPermisoDuplicarTipoTituloCliente;
	public Boolean isPermisoOrdenTipoTituloCliente;
	
	
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
	
	public TipoTituloClienteParameterReturnGeneral tipotituloclienteReturnGeneral;
	public TipoTituloClienteParameterReturnGeneral tipotituloclienteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoTituloCliente=false;
	public Boolean esParaAccionDesdeFormularioTipoTituloCliente=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoTituloClienteLogic tipotituloclienteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoTituloCliente tipotituloclienteBean;
	public TipoTituloClienteConstantesFunciones tipotituloclienteConstantesFunciones;
	//public TipoTituloClienteParameterReturnGeneral tipotituloclienteReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoTituloCliente> tipotituloclientes;	
	//public List<TipoTituloCliente> tipotituloclientesEliminados;
	//public List<TipoTituloCliente> tipotituloclientesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoTituloCliente=false;
	public Boolean isVisibilidadCeldaDuplicarTipoTituloCliente=true;
	public Boolean isVisibilidadCeldaCopiarTipoTituloCliente=true;
	public Boolean isVisibilidadCeldaVerFormTipoTituloCliente=true;
	public Boolean isVisibilidadCeldaOrdenTipoTituloCliente=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
	public Boolean isVisibilidadCeldaModificarTipoTituloCliente=false;
	public Boolean isVisibilidadCeldaActualizarTipoTituloCliente=false;
	public Boolean isVisibilidadCeldaEliminarTipoTituloCliente=false;
	public Boolean isVisibilidadCeldaCancelarTipoTituloCliente=false;
	public Boolean isVisibilidadCeldaGuardarTipoTituloCliente=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorSiglas=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoTituloCliente() {
		return this.iIdNuevoTipoTituloCliente;
	}

	public void setiIdNuevoTipoTituloCliente(Long iIdNuevoTipoTituloCliente) {
		this.iIdNuevoTipoTituloCliente = iIdNuevoTipoTituloCliente;
	}
	
	public Long getidTipoTituloClienteActual() {
		return this.idTipoTituloClienteActual;
	}

	public void setidTipoTituloClienteActual(Long idTipoTituloClienteActual) {
		this.idTipoTituloClienteActual = idTipoTituloClienteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoTituloCliente gettipotitulocliente() {
		return this.tipotitulocliente;
	}

	public void settipotitulocliente(TipoTituloCliente tipotitulocliente) {
		this.tipotitulocliente = tipotitulocliente;
	}
	
	public TipoTituloCliente gettipotituloclienteAux() {
		return this.tipotituloclienteAux;
	}

	public void settipotituloclienteAux(TipoTituloCliente tipotituloclienteAux) {
		this.tipotituloclienteAux = tipotituloclienteAux;
	}				
	
	public TipoTituloCliente gettipotituloclienteAnterior() {
		return this.tipotituloclienteAnterior;
	}

	public void settipotituloclienteAnterior(TipoTituloCliente tipotituloclienteAnterior) {
		this.tipotituloclienteAnterior = tipotituloclienteAnterior;
	}	
	
	public TipoTituloCliente gettipotituloclienteTotales() {
		return this.tipotituloclienteTotales;
	}

	public void settipotituloclienteTotales(TipoTituloCliente tipotituloclienteTotales) {
		this.tipotituloclienteTotales = tipotituloclienteTotales;
	}	
	
	public TipoTituloCliente gettipotituloclienteBean() {
		return this.tipotituloclienteBean;
	}

	public void settipotituloclienteBean(TipoTituloCliente tipotituloclienteBean) {
		this.tipotituloclienteBean = tipotituloclienteBean;
	}	
	
	public TipoTituloClienteParameterReturnGeneral gettipotituloclienteReturnGeneral() {
		return this.tipotituloclienteReturnGeneral;
	}

	public void settipotituloclienteReturnGeneral(TipoTituloClienteParameterReturnGeneral tipotituloclienteReturnGeneral) {
		this.tipotituloclienteReturnGeneral = tipotituloclienteReturnGeneral;
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

	public String siglasBusquedaPorSiglas="";

	public String getsiglasBusquedaPorSiglas() {
		return this.siglasBusquedaPorSiglas;
	}

	public void setsiglasBusquedaPorSiglas(String siglasBusquedaPorSiglas) {
		this.siglasBusquedaPorSiglas = siglasBusquedaPorSiglas;
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
	
	
	public TipoTituloClienteLogic getTipoTituloClienteLogic()	{		
		return tipotituloclienteLogic;
	}

	public void setTipoTituloClienteLogic(TipoTituloClienteLogic tipotituloclienteLogic) {
		this.tipotituloclienteLogic = tipotituloclienteLogic;
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
	
	public Boolean getIsEsNuevoTipoTituloCliente() {
		return isEsNuevoTipoTituloCliente;
	}

	public void setIsEsNuevoTipoTituloCliente(Boolean isEsNuevoTipoTituloCliente) {
		this.isEsNuevoTipoTituloCliente = isEsNuevoTipoTituloCliente;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoTituloCliente() {
		return esParaAccionDesdeFormularioTipoTituloCliente;
	}
	
	public void setEsParaAccionDesdeFormularioTipoTituloCliente(Boolean esParaAccionDesdeFormularioTipoTituloCliente) {
		this.esParaAccionDesdeFormularioTipoTituloCliente = esParaAccionDesdeFormularioTipoTituloCliente;
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

			if(this.tipotituloclienteSessionBean==null) {
				this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
			}

			if(!this.tipotituloclienteSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipotituloclienteSessionBean.getlidPaisActual());
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

					if(this.tipotitulocliente!=null) {
						this.tipotitulocliente.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
						this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoTituloCliente.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
						if(this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoTituloCliente!=null) {
						jComboBoxid_paisFK_IdPaisTipoTituloCliente.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoTituloCliente!=null) {
							//jComboBoxid_paisFK_IdPaisTipoTituloCliente.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoTituloCliente.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoTituloCliente.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoTituloClienteGenerico)throws Exception
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
				jComboBoxid_paisTipoTituloClienteGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoTituloClienteGenerico!=null && jComboBoxid_paisTipoTituloClienteGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoTituloClienteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoTituloCliente tipotitulocliente,JComboBox jComboBoxid_paisTipoTituloClienteGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoTituloClienteGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoTituloClienteGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipotitulocliente.setid_pais(paisAux.getId());
				tipotitulocliente.setpais_descripcion(TipoTituloClienteConstantesFunciones.getPaisDescripcion(paisAux));
				tipotitulocliente.setPais(paisAux);			}
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

					if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { 
							this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { 
					}

					if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoTituloCliente.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoTituloCliente.addItem(pais);
							}
						}

						if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
							this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
							this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoTituloCliente.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoTituloCliente.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoTituloCliente() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoTituloClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoTituloCliente(this.tipotituloclienteLogic.getTipoTituloClientes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoTituloClienteConstantesFunciones.refrescarForeignKeysDescripcionesTipoTituloCliente(this.tipotituloclientes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipotituloclienteLogic.setTipoTituloClientes(this.tipotituloclientes);
			tipotituloclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoTituloClienteParameterReturnGeneral getTipoTituloClienteParameterGeneral() {
		return this.tipotituloclienteParameterGeneral;
	}
	
	public void setTipoTituloClienteParameterGeneral(TipoTituloClienteParameterReturnGeneral tipotituloclienteParameterGeneral) {
		this.tipotituloclienteParameterGeneral = tipotituloclienteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoTituloCliente() {
		return isPermisoTodoTipoTituloCliente;
	}

	public void setIsPermisoTodoTipoTituloCliente(Boolean isPermisoTodoTipoTituloCliente) {
		this.isPermisoTodoTipoTituloCliente = isPermisoTodoTipoTituloCliente;
	}

	public Boolean getIsPermisoNuevoTipoTituloCliente() {
		return isPermisoNuevoTipoTituloCliente;
	}

	public void setIsPermisoNuevoTipoTituloCliente(Boolean isPermisoNuevoTipoTituloCliente) {
		this.isPermisoNuevoTipoTituloCliente = isPermisoNuevoTipoTituloCliente;
	}

	public Boolean getIsPermisoActualizarTipoTituloCliente() {
		return isPermisoActualizarTipoTituloCliente;
	}

	public void setIsPermisoActualizarTipoTituloCliente(Boolean isPermisoActualizarTipoTituloCliente) {
		this.isPermisoActualizarTipoTituloCliente = isPermisoActualizarTipoTituloCliente;
	}

	public Boolean getIsPermisoEliminarTipoTituloCliente() {
		return isPermisoEliminarTipoTituloCliente;
	}

	public void setIsPermisoEliminarTipoTituloCliente(Boolean isPermisoEliminarTipoTituloCliente) {
		this.isPermisoEliminarTipoTituloCliente = isPermisoEliminarTipoTituloCliente;
	}

	public Boolean getIsPermisoGuardarCambiosTipoTituloCliente() {
		return isPermisoGuardarCambiosTipoTituloCliente;
	}

	public void setIsPermisoGuardarCambiosTipoTituloCliente(Boolean isPermisoGuardarCambiosTipoTituloCliente) {
		this.isPermisoGuardarCambiosTipoTituloCliente = isPermisoGuardarCambiosTipoTituloCliente;
	}
	
	public Boolean getIsPermisoConsultaTipoTituloCliente() {
		return isPermisoConsultaTipoTituloCliente;
	}

	public void setIsPermisoConsultaTipoTituloCliente(Boolean isPermisoConsultaTipoTituloCliente) {
		this.isPermisoConsultaTipoTituloCliente = isPermisoConsultaTipoTituloCliente;
	}

	public Boolean getIsPermisoBusquedaTipoTituloCliente() {
		return isPermisoBusquedaTipoTituloCliente;
	}

	public void setIsPermisoBusquedaTipoTituloCliente(Boolean isPermisoBusquedaTipoTituloCliente) {
		this.isPermisoBusquedaTipoTituloCliente = isPermisoBusquedaTipoTituloCliente;
	}

	public Boolean getIsPermisoReporteTipoTituloCliente() {
		return isPermisoReporteTipoTituloCliente;
	}

	public void setIsPermisoReporteTipoTituloCliente(Boolean isPermisoReporteTipoTituloCliente) {
		this.isPermisoReporteTipoTituloCliente = isPermisoReporteTipoTituloCliente;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoTituloCliente() {
		return isPermisoPaginacionMedioTipoTituloCliente;
	}

	public void setIsPermisoPaginacionMedioTipoTituloCliente(Boolean isPermisoPaginacionMedioTipoTituloCliente) {
		this.isPermisoPaginacionMedioTipoTituloCliente = isPermisoPaginacionMedioTipoTituloCliente;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoTituloCliente() {
		return isPermisoPaginacionTodoTipoTituloCliente;
	}

	public void setIsPermisoPaginacionTodoTipoTituloCliente(Boolean isPermisoPaginacionTodoTipoTituloCliente) {
		this.isPermisoPaginacionTodoTipoTituloCliente = isPermisoPaginacionTodoTipoTituloCliente;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoTituloCliente() {
		return isPermisoPaginacionAltoTipoTituloCliente;
	}

	public void setIsPermisoPaginacionAltoTipoTituloCliente(Boolean isPermisoPaginacionAltoTipoTituloCliente) {
		this.isPermisoPaginacionAltoTipoTituloCliente = isPermisoPaginacionAltoTipoTituloCliente;
	}
	
	public Boolean getIsPermisoCopiarTipoTituloCliente() {
		return isPermisoCopiarTipoTituloCliente;
	}

	public void setIsPermisoCopiarTipoTituloCliente(Boolean isPermisoCopiarTipoTituloCliente) {
		this.isPermisoCopiarTipoTituloCliente = isPermisoCopiarTipoTituloCliente;
	}
	
	public Boolean getIsPermisoVerFormTipoTituloCliente() {
		return isPermisoVerFormTipoTituloCliente;
	}

	public void setIsPermisoVerFormTipoTituloCliente(Boolean isPermisoVerFormTipoTituloCliente) {
		this.isPermisoVerFormTipoTituloCliente = isPermisoVerFormTipoTituloCliente;
	}
	
	public Boolean getIsPermisoDuplicarTipoTituloCliente() {
		return isPermisoDuplicarTipoTituloCliente;
	}

	public void setIsPermisoDuplicarTipoTituloCliente(Boolean isPermisoDuplicarTipoTituloCliente) {
		this.isPermisoDuplicarTipoTituloCliente = isPermisoDuplicarTipoTituloCliente;
	}
	
	public Boolean getIsPermisoOrdenTipoTituloCliente() {
		return isPermisoOrdenTipoTituloCliente;
	}

	public void setIsPermisoOrdenTipoTituloCliente(Boolean isPermisoOrdenTipoTituloCliente) {
		this.isPermisoOrdenTipoTituloCliente = isPermisoOrdenTipoTituloCliente;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoTituloCliente() {
		return isVisibilidadCeldaNuevoTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaNuevoTipoTituloCliente(Boolean isVisibilidadCeldaNuevoTipoTituloCliente) {
		this.isVisibilidadCeldaNuevoTipoTituloCliente = isVisibilidadCeldaNuevoTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoTituloCliente() {
		return isVisibilidadCeldaDuplicarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaDuplicarTipoTituloCliente(Boolean isVisibilidadCeldaDuplicarTipoTituloCliente) {
		this.isVisibilidadCeldaDuplicarTipoTituloCliente = isVisibilidadCeldaDuplicarTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoTituloCliente() {
		return isVisibilidadCeldaCopiarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaCopiarTipoTituloCliente(Boolean isVisibilidadCeldaCopiarTipoTituloCliente) {
		this.isVisibilidadCeldaCopiarTipoTituloCliente = isVisibilidadCeldaCopiarTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoTituloCliente() {
		return isVisibilidadCeldaVerFormTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaVerFormTipoTituloCliente(Boolean isVisibilidadCeldaVerFormTipoTituloCliente) {
		this.isVisibilidadCeldaVerFormTipoTituloCliente = isVisibilidadCeldaVerFormTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoTituloCliente() {
		return isVisibilidadCeldaOrdenTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaOrdenTipoTituloCliente(Boolean isVisibilidadCeldaOrdenTipoTituloCliente) {
		this.isVisibilidadCeldaOrdenTipoTituloCliente = isVisibilidadCeldaOrdenTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoTituloCliente() {
		return isVisibilidadCeldaNuevoRelacionesTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoTituloCliente(Boolean isVisibilidadCeldaNuevoRelacionesTipoTituloCliente) {
		this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente = isVisibilidadCeldaNuevoRelacionesTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoTituloCliente() {
		return isVisibilidadCeldaModificarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaModificarTipoTituloCliente(Boolean isVisibilidadCeldaModificarTipoTituloCliente) {
		this.isVisibilidadCeldaModificarTipoTituloCliente = isVisibilidadCeldaModificarTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoTituloCliente() {
		return isVisibilidadCeldaActualizarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaActualizarTipoTituloCliente(Boolean isVisibilidadCeldaActualizarTipoTituloCliente) {
		this.isVisibilidadCeldaActualizarTipoTituloCliente = isVisibilidadCeldaActualizarTipoTituloCliente;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoTituloCliente() {
		return isVisibilidadCeldaEliminarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaEliminarTipoTituloCliente(Boolean isVisibilidadCeldaEliminarTipoTituloCliente) {
		this.isVisibilidadCeldaEliminarTipoTituloCliente = isVisibilidadCeldaEliminarTipoTituloCliente;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoTituloCliente() {
		return isVisibilidadCeldaCancelarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaCancelarTipoTituloCliente(Boolean isVisibilidadCeldaCancelarTipoTituloCliente) {
		this.isVisibilidadCeldaCancelarTipoTituloCliente = isVisibilidadCeldaCancelarTipoTituloCliente;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoTituloCliente() {
		return isVisibilidadCeldaGuardarTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaGuardarTipoTituloCliente(Boolean isVisibilidadCeldaGuardarTipoTituloCliente) {
		this.isVisibilidadCeldaGuardarTipoTituloCliente = isVisibilidadCeldaGuardarTipoTituloCliente;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoTituloCliente() {
		return isVisibilidadCeldaGuardarCambiosTipoTituloCliente;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoTituloCliente(Boolean isVisibilidadCeldaGuardarCambiosTipoTituloCliente) {
		this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente = isVisibilidadCeldaGuardarCambiosTipoTituloCliente;
	}
		
	public TipoTituloClienteSessionBean gettipotituloclienteSessionBean() {
		return this.tipotituloclienteSessionBean;
	}
	
	public void settipotituloclienteSessionBean(TipoTituloClienteSessionBean tipotituloclienteSessionBean) {
		this.tipotituloclienteSessionBean=tipotituloclienteSessionBean;
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

	public Boolean getisVisibilidadBusquedaPorSiglas() {
		return this.isVisibilidadBusquedaPorSiglas;
	}

	public void setisVisibilidadBusquedaPorSiglas(Boolean isVisibilidadBusquedaPorSiglas) {
		this.isVisibilidadBusquedaPorSiglas=isVisibilidadBusquedaPorSiglas;
	}

	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(TipoTituloCliente tipotitulocliente)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipotitulocliente,null);
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
	
	public void bugActualizarReferenciaActual(TipoTituloCliente tipotitulocliente,TipoTituloCliente tipotituloclienteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoTituloCliente(tipotitulocliente);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipotituloclienteAux.setId(tipotitulocliente.getId());
		tipotituloclienteAux.setVersionRow(tipotitulocliente.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoTituloCliente();
		
			int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipotituloclienteValidator.getInvalidValues(this.tipotitulocliente);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipotituloclienteLogic.setDatosCliente(datosCliente);
			tipotituloclienteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipotituloclienteAux=new  TipoTituloCliente();
				
				tipotituloclienteAux.setIsNew(true);
				tipotituloclienteAux.setIsChanged(true);
				
				tipotituloclienteAux.setTipoTituloClienteOriginal(this.tipotitulocliente);
				
				tipotituloclienteAux.setId(this.tipotitulocliente.getId());	
				tipotituloclienteAux.setVersionRow(this.tipotitulocliente.getVersionRow());	
				tipotituloclienteAux.setid_pais(this.tipotitulocliente.getid_pais());	
				tipotituloclienteAux.setnombre(this.tipotitulocliente.getnombre());	
				tipotituloclienteAux.setsiglas(this.tipotitulocliente.getsiglas());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotituloclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipotituloclienteAux,tipotituloclienteLogic.getTipoTituloClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotituloclienteAux,tipotituloclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotituloclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.saveTipoTituloClientes();//WithConnection
						//tipotituloclienteLogic.getSetVersionRowTipoTituloClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotitulocliente,tipotituloclienteAux);
					
					this.refrescarForeignKeysDescripcionesTipoTituloCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipotituloclienteAux=new  TipoTituloCliente();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado() 
					|| (this.tipotituloclienteSessionBean.getEsGuardarRelacionado() && this.tipotitulocliente.getId()>=0)) {
						
					tipotituloclienteAux.setIsNew(false);
				}
				
				tipotituloclienteAux.setIsDeleted(false);
			
				tipotituloclienteAux.setId(this.tipotitulocliente.getId());	
				tipotituloclienteAux.setVersionRow(this.tipotitulocliente.getVersionRow());	
				tipotituloclienteAux.setid_pais(this.tipotitulocliente.getid_pais());	
				tipotituloclienteAux.setnombre(this.tipotitulocliente.getnombre());	
				tipotituloclienteAux.setsiglas(this.tipotitulocliente.getsiglas());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotituloclienteAux,tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotituloclienteAux,tipotituloclientes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotituloclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.saveTipoTituloClientes();//WithConnection
						//tipotituloclienteLogic.getSetVersionRowTipoTituloClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipotitulocliente,tipotituloclienteAux);
					
					this.refrescarForeignKeysDescripcionesTipoTituloCliente();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipotituloclienteAux=new  TipoTituloCliente();
				
				tipotituloclienteAux.setIsNew(false);
				tipotituloclienteAux.setIsChanged(false);
				
				tipotituloclienteAux.setIsDeleted(true);
				
				tipotituloclienteAux.setId(this.tipotitulocliente.getId());	
				tipotituloclienteAux.setVersionRow(this.tipotitulocliente.getVersionRow());	
				tipotituloclienteAux.setid_pais(this.tipotitulocliente.getid_pais());	
				tipotituloclienteAux.setnombre(this.tipotitulocliente.getnombre());	
				tipotituloclienteAux.setsiglas(this.tipotitulocliente.getsiglas());	
				
				if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipotituloclienteAux.getId()>=0) {	
						this.tipotituloclientesEliminados.add(tipotituloclienteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipotituloclienteAux,tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotituloclienteAux,tipotituloclientes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipotituloclienteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.saveTipoTituloClientes();//WithConnection
						//tipotituloclienteLogic.getSetVersionRowTipoTituloClientes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipotituloclienteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipotituloclienteAux,tipotituloclienteLogic.getTipoTituloClientes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipotituloclienteAux,tipotituloclientes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.getTipoTituloClientes().addAll(this.tipotituloclientesEliminados);
					
					tipotituloclienteLogic.saveTipoTituloClientes();//WithConnection
					//tipotituloclienteLogic.getSetVersionRowTipoTituloClientes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoTituloCliente();
				
				this.tipotituloclientesEliminados= new ArrayList<TipoTituloCliente>();		
			}
			
			if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Titulo Cliente GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipotitulocliente=tipotituloclienteAux;
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
      		//this.finishProcessTipoTituloCliente();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoTituloCliente tipotituloclienteLocal) throws Exception {
		
		if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoTituloCliente tipotituloclienteLocal) throws Exception {	
		if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipotituloclienteLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoTituloClienteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipotituloclienteValidator.getInvalidValues(this.tipotitulocliente);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoTituloCliente tipotitulocliente,List<TipoTituloCliente> tipotituloclientes) throws Exception {
		try	{		
			TipoTituloClienteConstantesFunciones.actualizarLista(tipotitulocliente,tipotituloclientes,this.tipotituloclienteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoTituloCliente tipotitulocliente,List<TipoTituloCliente> tipotituloclientes) throws Exception {
		try	{			
			TipoTituloClienteConstantesFunciones.actualizarSelectedLista(tipotitulocliente,tipotituloclientes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoTituloCliente> tipotituloclientesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipotituloclientesLocal=this.tipotituloclienteLogic.getTipoTituloClientes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipotituloclientesLocal=this.tipotituloclientes;
			}
			//ARCHITECTURE
		
			for(TipoTituloCliente tipotituloclienteLocal:tipotituloclientesLocal) {
				if(this.permiteMantenimiento(tipotituloclienteLocal) && tipotituloclienteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoTituloClienteConstantesFunciones.getTipoTituloClienteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoTituloClienteConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelid_paisTipoTituloCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTituloClienteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelnombreTipoTituloCliente,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoTituloClienteConstantesFunciones.SIGLAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelsiglasTipoTituloCliente,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelid_paisTipoTituloCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelnombreTipoTituloCliente,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelsiglasTipoTituloCliente,"");
		
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
		this.iIdNuevoTipoTituloCliente--;	
		
		
		this.tipotituloclienteAux=new TipoTituloCliente();
		
		this.tipotituloclienteAux.setId(this.iIdNuevoTipoTituloCliente);
		this.tipotituloclienteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipotituloclienteLogic.getTipoTituloClientes().add(this.tipotituloclienteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipotituloclientes.add(this.tipotituloclienteAux);
		}
		//ARCHITECTURE
		
		this.tipotitulocliente=this.tipotituloclienteAux;
		
		if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoTituloCliente(this.tipotitulocliente);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTituloCliente(this.tipotitulocliente);
		}
				
		//this.setDefaultControlesTipoTituloCliente();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoTituloCliente();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoTituloCliente();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTituloCliente();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTituloCliente(this.tipotituloclienteBean,this.tipotitulocliente,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoTituloClienteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
			classes=TipoTituloClienteConstantesFunciones.getClassesRelationshipsOfTipoTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipotituloclienteReturnGeneral=tipotituloclienteLogic.procesarEventosTipoTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotituloclienteLogic.getTipoTituloClientes(),this.tipotitulocliente,this.tipotituloclienteParameterGeneral,this.isEsNuevoTipoTituloCliente,classes);//this.tipotituloclienteLogic.getTipoTituloCliente()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoTituloCliente(this.tipotituloclienteReturnGeneral,this.tipotituloclienteBean,false);
		
		if(this.tipotituloclienteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente());
		}
		
		if(this.tipotituloclienteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente(),classes);//this.tipotituloclienteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoTituloCliente();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoTituloCliente();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoTituloCliente(false);
						
			if(tipotituloclienteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTituloCliente();
			}
			
			this.actualizarVisualTableDatosTipoTituloCliente();
			
			this.jTableDatosTipoTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTipoTituloCliente(), this.getIndiceNuevoTipoTituloCliente());
			
			this.seleccionarFilaTablaTipoTituloClienteActual();
						
			this.actualizarEstadoCeldasBotonesTipoTituloCliente("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoTituloCliente(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setEnabled(isHabilitar && this.tipotituloclienteConstantesFunciones.activarnombreTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setEnabled(isHabilitar && this.tipotituloclienteConstantesFunciones.activarsiglasTipoTituloCliente);	
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setEnabled(isHabilitar && this.tipotituloclienteConstantesFunciones.activarid_paisTipoTituloCliente);
	};
	
	public void setDefaultControlesTipoTituloCliente() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoTituloCliente(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipotituloclienteSessionBean.setConGuardarRelaciones(true);			
			this.tipotituloclienteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.setVisible(true);
			
					
		} else {
			//this.tipotituloclienteSessionBean.setConGuardarRelaciones(false);			
			this.tipotituloclienteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoTituloCliente() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
				if(tipotituloclienteAux.getId().equals(this.iIdNuevoTipoTituloCliente)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclientes) {
				if(tipotituloclienteAux.getId().equals(this.iIdNuevoTipoTituloCliente)) {
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
	
	public int getIndiceActualTipoTituloCliente(TipoTituloCliente tipotitulocliente,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
				if(tipotituloclienteAux.getId().equals(tipotitulocliente.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclientes) {
				if(tipotituloclienteAux.getId().equals(tipotitulocliente.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoTituloCliente(TipoTituloCliente tipotituloclienteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
				if(tipotituloclienteAux.getTipoTituloClienteOriginal().getId().equals(tipotituloclienteOriginal.getId())) {
					existe=true;
					tipotituloclienteOriginal.setId(tipotituloclienteAux.getId());
					tipotituloclienteOriginal.setVersionRow(tipotituloclienteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclientes) {
				if(tipotituloclienteAux.getTipoTituloClienteOriginal().getId().equals(tipotituloclienteOriginal.getId())) {
					existe=true;
					tipotituloclienteOriginal.setId(tipotituloclienteAux.getId());
					tipotituloclienteOriginal.setVersionRow(tipotituloclienteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoTituloCliente(Boolean esParaCancelar) throws Exception {
		tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
		tipotituloclienteAux=new TipoTituloCliente();
		
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
					if(tipotituloclienteAux.getId()<0) {
						tipotituloclientesAux.add(tipotituloclienteAux);
					}		
				}
				this.iIdNuevoTipoTituloCliente=0L;
				this.tipotituloclienteLogic.getTipoTituloClientes().removeAll(tipotituloclientesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclientes) {
					if(tipotituloclienteAux.getId()<0) {
						tipotituloclientesAux.add(tipotituloclienteAux);
					}		
				}
				this.iIdNuevoTipoTituloCliente=0L;
				this.tipotituloclientes.removeAll(tipotituloclientesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoTituloCliente 
					&& this.tipotituloclienteLogic.getTipoTituloClientes().size()>0
					) {
					tipotituloclienteAux=this.tipotituloclienteLogic.getTipoTituloClientes().get(this.tipotituloclienteLogic.getTipoTituloClientes().size() - 1);
				
					if(tipotituloclienteAux.getId()<0) {
						this.tipotituloclienteLogic.getTipoTituloClientes().remove(tipotituloclienteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoTituloCliente && this.tipotituloclientes.size()>0) {
					tipotituloclienteAux=this.tipotituloclientes.get(this.tipotituloclientes.size() - 1);
				
					if(tipotituloclienteAux.getId()<0) {
						this.tipotituloclientes.remove(tipotituloclienteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoTituloCliente(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipotitulocliente.getId()<0) {
				this.tipotituloclienteLogic.getTipoTituloClientes().remove(this.tipotitulocliente);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipotitulocliente.getId()<0) {
				this.tipotituloclientes.remove(this.tipotitulocliente);
			}
		}			
	}
	
	public void setEstadosInicialesTipoTituloCliente(List<TipoTituloCliente> tipotituloclientesAux) throws Exception {
		TipoTituloClienteConstantesFunciones.setEstadosInicialesTipoTituloCliente(tipotituloclientesAux);
	}
	
	public void setEstadosInicialesTipoTituloCliente(TipoTituloCliente tipotituloclienteAux) throws Exception {
		TipoTituloClienteConstantesFunciones.setEstadosInicialesTipoTituloCliente(tipotituloclienteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoTituloClienteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoTituloClienteActual()) {
				if(!this.isEsNuevoTipoTituloCliente) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoTituloCliente=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoTituloClienteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Titulo Cliente ?", "MANTENIMIENTO DE Tipo Titulo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoTituloCliente tipotitulocliente) throws Exception {
		TipoTituloClienteConstantesFunciones.seleccionarAsignar(this.tipotitulocliente,tipotitulocliente);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoTituloCliente=this.isPermisoActualizarOriginalTipoTituloCliente;
			
			
			this.seleccionarAsignar(tipotitulocliente);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoTituloClienteConstantesFunciones.quitarEspaciosTipoTituloCliente(this.tipotitulocliente,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoTituloCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipotituloclienteSessionBean.setsFuncionBusquedaRapida(this.tipotituloclienteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoTituloCliente) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoTituloCliente(esParaCancelar);				
				this.cancelarNuevoTipoTituloCliente(esParaCancelar);								
			}
			
			this.tipotitulocliente=new TipoTituloCliente();
			
			this.inicializarTipoTituloCliente();
			
			this.actualizarEstadoCeldasBotonesTipoTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoTituloCliente() throws Exception {
		try {
			TipoTituloClienteConstantesFunciones.inicializarTipoTituloCliente(this.tipotitulocliente);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipotituloclienteLogic.getTipoTituloClientes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoTituloClientes(String sAccionBusqueda,List<TipoTituloCliente> tipotituloclientesParaReportes) throws Exception {
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
					sPathReporteFinal="TipoTituloCliente"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoTituloClienteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoTituloClienteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoTituloCliente"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Titulo Clientes");		
		parameters.put("busquedapor", TipoTituloClienteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoTituloCliente=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoTituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoTituloClienteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoTituloCliente=new JRBeanArrayDataSource(TipoTituloClienteJInternalFrame.TraerTipoTituloClienteBeans(tipotituloclientesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoTituloCliente);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoTituloClienteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoTituloClienteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoTituloClienteBean.TraerTipoTituloClienteBeans(tipotituloclientesParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tipotituloclientesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tipotituloclientesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoTituloClienteActionPerformed(null);
					//this.generarExcelReporteTipoTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tipotituloclientesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tipotituloclientesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tipotituloclientesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoTituloClientes(sAccionBusqueda,sTipoArchivoReporte,tipotituloclientesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoTituloClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTituloCliente> tipotituloclientesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTituloClientes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTituloCliente("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoTituloCliente tipotitulocliente : tipotituloclientesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoTituloClienteConstantesFunciones.generarExcelReporteDataTipoTituloCliente("NORMAL",row,workbook,tipotitulocliente,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoTituloCliente(String sTipo,Row row,Workbook workbook) {
		
		TipoTituloClienteConstantesFunciones.generarExcelReporteHeaderTipoTituloCliente(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoTituloClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTituloCliente> tipotituloclientesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTituloClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoTituloCliente tipotitulocliente : tipotituloclientesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoTituloClienteConstantesFunciones.getTipoTituloClienteDescripcion(tipotitulocliente));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTituloClienteConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotitulocliente.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotitulocliente.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipotitulocliente.getsiglas());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoTituloClientes(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoTituloCliente> tipotituloclientesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoTituloCliente> tipotituloclientesRespaldo=null;
		
		classes=TipoTituloClienteConstantesFunciones.getClassesRelationshipsOfTipoTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipotituloclienteLogic.setDatosCliente(this.datosCliente);
		this.tipotituloclienteLogic.setDatosDeep(this.datosDeep);
		this.tipotituloclienteLogic.setIsConDeep(true);
		
		tipotituloclientesRespaldo=this.tipotituloclienteLogic.getTipoTituloClientes();
		
		this.tipotituloclienteLogic.setTipoTituloClientes(tipotituloclientesParaReportes);	
		this.tipotituloclienteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipotituloclientesParaReportes=this.tipotituloclienteLogic.getTipoTituloClientes();
		this.tipotituloclienteLogic.setTipoTituloClientes(tipotituloclientesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoTituloClientes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoTituloCliente("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoTituloCliente tipotitulocliente : tipotituloclientesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoTituloCliente("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoTituloClienteConstantesFunciones.generarExcelReporteDataTipoTituloCliente("NORMAL",row,workbook,tipotitulocliente,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoTituloClienteConstantesFunciones.getTipoTituloClienteDescripcion(tipotitulocliente));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoTituloCliente() throws Exception {		
		this.startProcessTipoTituloCliente(true);
	}
	
	public void startProcessTipoTituloCliente(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoTituloCliente ,this.jPanelParametrosReportesTipoTituloCliente, this.jScrollPanelDatosTipoTituloCliente,this.jPanelPaginacionTipoTituloCliente, this.jScrollPanelDatosEdicionTipoTituloCliente, this.jPanelAccionesTipoTituloCliente,this.jPanelAccionesFormularioTipoTituloCliente,this.jmenuBarTipoTituloCliente,this.jmenuBarDetalleTipoTituloCliente,this.jTtoolBarTipoTituloCliente,this.jTtoolBarDetalleTipoTituloCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTituloCliente=this.jTabbedPaneBusquedasTipoTituloCliente; 
		
		final JPanel jPanelParametrosReportesTipoTituloCliente=this.jPanelParametrosReportesTipoTituloCliente;
		//final JScrollPane jScrollPanelDatosTipoTituloCliente=this.jScrollPanelDatosTipoTituloCliente;
		final JTable jTableDatosTipoTituloCliente=this.jTableDatosTipoTituloCliente;		
		final JPanel jPanelPaginacionTipoTituloCliente=this.jPanelPaginacionTipoTituloCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoTituloCliente=this.jScrollPanelDatosEdicionTipoTituloCliente;
		final JPanel jPanelAccionesTipoTituloCliente=this.jPanelAccionesTipoTituloCliente;
		
		JPanel jPanelCamposAuxiliarTipoTituloCliente=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoTituloCliente=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			jPanelCamposAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jPanelCamposTipoTituloCliente;
			jPanelAccionesFormularioAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jPanelAccionesFormularioTipoTituloCliente;
		}
		
		final JPanel jPanelCamposTipoTituloCliente=jPanelCamposAuxiliarTipoTituloCliente;
		final JPanel jPanelAccionesFormularioTipoTituloCliente=jPanelAccionesFormularioAuxiliarTipoTituloCliente;
		
		
		final JMenuBar jmenuBarTipoTituloCliente=this.jmenuBarTipoTituloCliente;
		final JToolBar jTtoolBarTipoTituloCliente=this.jTtoolBarTipoTituloCliente;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoTituloCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTituloCliente=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			jmenuBarDetalleAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jmenuBarDetalleTipoTituloCliente;
			jTtoolBarDetalleAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jTtoolBarDetalleTipoTituloCliente;
		}
		
		final JMenuBar jmenuBarDetalleTipoTituloCliente=jmenuBarDetalleAuxiliarTipoTituloCliente;
		final JToolBar jTtoolBarDetalleTipoTituloCliente=jTtoolBarDetalleAuxiliarTipoTituloCliente;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTituloCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTituloCliente;
			processRunnable.jTableDatos=jTableDatosTipoTituloCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoTituloCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTituloCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTituloCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTituloCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTituloCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTituloCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoTituloCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTituloCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTituloCliente ,jPanelParametrosReportesTipoTituloCliente,jTableDatosTipoTituloCliente, /*jScrollPanelDatosTipoTituloCliente,*/jPanelCamposTipoTituloCliente,jPanelPaginacionTipoTituloCliente, /*jScrollPanelDatosEdicionTipoTituloCliente,*/ jPanelAccionesTipoTituloCliente,jPanelAccionesFormularioTipoTituloCliente,jmenuBarTipoTituloCliente,jmenuBarDetalleTipoTituloCliente,jTtoolBarTipoTituloCliente,jTtoolBarDetalleTipoTituloCliente);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoTituloCliente ,jPanelParametrosReportesTipoTituloCliente, jScrollPanelDatosTipoTituloCliente,jPanelPaginacionTipoTituloCliente, jScrollPanelDatosEdicionTipoTituloCliente, jPanelAccionesTipoTituloCliente,jPanelAccionesFormularioTipoTituloCliente,jmenuBarTipoTituloCliente,jmenuBarDetalleTipoTituloCliente,jTtoolBarTipoTituloCliente,jTtoolBarDetalleTipoTituloCliente);
						
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
	
	public void finishProcessTipoTituloCliente() {// throws Exception 
		this.finishProcessTipoTituloCliente(true);
	}
	
	public void finishProcessTipoTituloCliente(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoTituloCliente ,this.jPanelParametrosReportesTipoTituloCliente, this.jScrollPanelDatosTipoTituloCliente,this.jPanelPaginacionTipoTituloCliente, this.jScrollPanelDatosEdicionTipoTituloCliente, this.jPanelAccionesTipoTituloCliente,this.jPanelAccionesFormularioTipoTituloCliente,this.jmenuBarTipoTituloCliente,this.jmenuBarDetalleTipoTituloCliente,this.jTtoolBarTipoTituloCliente,this.jTtoolBarDetalleTipoTituloCliente);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoTituloCliente=this.jTabbedPaneBusquedasTipoTituloCliente; 
		
		final JPanel jPanelParametrosReportesTipoTituloCliente=this.jPanelParametrosReportesTipoTituloCliente;
		//final JScrollPane jScrollPanelDatosTipoTituloCliente=this.jScrollPanelDatosTipoTituloCliente;
		final JTable jTableDatosTipoTituloCliente=this.jTableDatosTipoTituloCliente;		
		final JPanel jPanelPaginacionTipoTituloCliente=this.jPanelPaginacionTipoTituloCliente;
		//final JScrollPane jScrollPanelDatosEdicionTipoTituloCliente=this.jScrollPanelDatosEdicionTipoTituloCliente;
		final JPanel jPanelAccionesTipoTituloCliente=this.jPanelAccionesTipoTituloCliente;
		
		JPanel jPanelCamposAuxiliarTipoTituloCliente=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoTituloCliente=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			jPanelCamposAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jPanelCamposTipoTituloCliente;
			jPanelAccionesFormularioAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jPanelAccionesFormularioTipoTituloCliente;
		}
		
		final JPanel jPanelCamposTipoTituloCliente=jPanelCamposAuxiliarTipoTituloCliente;
		final JPanel jPanelAccionesFormularioTipoTituloCliente=jPanelAccionesFormularioAuxiliarTipoTituloCliente;
		
		
		final JMenuBar jmenuBarTipoTituloCliente=this.jmenuBarTipoTituloCliente;		
		final JToolBar jTtoolBarTipoTituloCliente=this.jTtoolBarTipoTituloCliente;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoTituloCliente=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoTituloCliente=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			jmenuBarDetalleAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jmenuBarDetalleTipoTituloCliente;
			jTtoolBarDetalleAuxiliarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jTtoolBarDetalleTipoTituloCliente;		
		}
		
		final JMenuBar jmenuBarDetalleTipoTituloCliente=jmenuBarDetalleAuxiliarTipoTituloCliente;
		final JToolBar jTtoolBarDetalleTipoTituloCliente=jTtoolBarDetalleAuxiliarTipoTituloCliente;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoTituloCliente;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoTituloCliente;
			processRunnable.jTableDatos=jTableDatosTipoTituloCliente;
			processRunnable.jPanelCampos=jPanelCamposTipoTituloCliente;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoTituloCliente;
			processRunnable.jPanelAcciones=jPanelAccionesTipoTituloCliente;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoTituloCliente;
			
			
			processRunnable.jmenuBar=jmenuBarTipoTituloCliente;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoTituloCliente;
			processRunnable.jTtoolBar=jTtoolBarTipoTituloCliente;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoTituloCliente;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoTituloCliente ,jPanelParametrosReportesTipoTituloCliente, jTableDatosTipoTituloCliente,/*jScrollPanelDatosTipoTituloCliente,*/jPanelCamposTipoTituloCliente,jPanelPaginacionTipoTituloCliente, /*jScrollPanelDatosEdicionTipoTituloCliente,*/ jPanelAccionesTipoTituloCliente,jPanelAccionesFormularioTipoTituloCliente,jmenuBarTipoTituloCliente,jmenuBarDetalleTipoTituloCliente,jTtoolBarTipoTituloCliente,jTtoolBarDetalleTipoTituloCliente));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoTituloCliente(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoTituloCliente(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoTituloCliente(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoTituloCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoTituloCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoTituloCliente,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoTituloCliente(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoTituloCliente,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoTituloCliente,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipotituloclienteConstantesFunciones.getsFinalQueryTipoTituloCliente();
		String  finalQueryPaginacionTodos=this.tipotituloclienteConstantesFunciones.getsFinalQueryTipoTituloCliente();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoTituloClienteConstantesFunciones.getArrayColumnasGlobalesNoTipoTituloCliente(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoTituloClienteConstantesFunciones.getArrayColumnasGlobalesTipoTituloCliente(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoTituloClienteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipotituloclientesEliminados= new ArrayList<TipoTituloCliente>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoTituloCliente();
		
				///*TipoTituloClienteSessionBean*/this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
			
			if(this.tipotituloclienteSessionBean==null) {
				this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
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
					this.iNumeroPaginacion=TipoTituloClienteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoTituloClienteConstantesFunciones.getClassesForeignKeysOfTipoTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipotitulocliente."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipotituloclientesAux= new ArrayList<TipoTituloCliente>();
			
				
			tipotituloclienteLogic.setDatosCliente(this.datosCliente);
			tipotituloclienteLogic.setDatosDeep(this.datosDeep);
			tipotituloclienteLogic.setIsConDeep(true);
			
			
			tipotituloclienteLogic.getTipoTituloClienteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipotituloclienteLogic.getTodosTipoTituloClientes(finalQueryGlobal,pagination);
					
					//tipotituloclienteLogic.getTodosTipoTituloClientesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipotituloclienteLogic.getTipoTituloClientes()==null|| tipotituloclienteLogic.getTipoTituloClientes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotituloclientesAux= new ArrayList<TipoTituloCliente>();
							tipotituloclientesAux.addAll(tipotituloclienteLogic.getTipoTituloClientes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientesAux= new ArrayList<TipoTituloCliente>();
							tipotituloclientesAux.addAll(tipotituloclientes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotituloclienteLogic.getTodosTipoTituloClientes(finalQueryGlobal+"",this.pagination);												
							
							//tipotituloclienteLogic.getTodosTipoTituloClientesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoTituloClientes("Todos",tipotituloclienteLogic.getTipoTituloClientes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipotituloclienteLogic.setTipoTituloClientes(new ArrayList<TipoTituloCliente>());					
							tipotituloclienteLogic.getTipoTituloClientes().addAll(tipotituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientes=new ArrayList<TipoTituloCliente>();
							tipotituloclientes.addAll(tipotituloclientesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoTituloCliente=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoTituloCliente=this.idActual;
				
				} else if(this.idTipoTituloClienteActual!=null && this.idTipoTituloClienteActual!=0L) {
					idTipoTituloCliente=idTipoTituloClienteActual;
				}
				
					
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndicePorId(idTipoTituloCliente);
				
				this.tipotituloclientes=new ArrayList<TipoTituloCliente>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipotituloclienteLogic.getEntity(idTipoTituloCliente);
					
					//tipotituloclienteLogic.getEntityWithConnection(idTipoTituloCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLogic.setTipoTituloClientes(new ArrayList<TipoTituloCliente>());
					tipotituloclienteLogic.getTipoTituloClientes().add(tipotituloclienteLogic.getTipoTituloCliente());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotituloclientes=new ArrayList<TipoTituloCliente>();
					this.tipotituloclientes.add(tipotitulocliente);
				}
				
				if(tipotituloclienteLogic.getTipoTituloCliente()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotituloclienteLogic.getTipoTituloClientesBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotituloclienteLogic.getTipoTituloClientes()==null||tipotituloclienteLogic.getTipoTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotituloclientes==null|| tipotituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
						tipotituloclientesAux.addAll(tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
							tipotituloclientesAux.addAll(tipotituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotituloclienteLogic.getTipoTituloClientesBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTituloClientes("BusquedaPorId",tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTituloClientes("BusquedaPorId",tipotituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.setTipoTituloClientes(new ArrayList<TipoTituloCliente>());
						tipotituloclienteLogic.getTipoTituloClientes().addAll(tipotituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientes=new ArrayList<TipoTituloCliente>();
							tipotituloclientes.addAll(tipotituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotituloclienteLogic.getTipoTituloClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotituloclienteLogic.getTipoTituloClientes()==null||tipotituloclienteLogic.getTipoTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotituloclientes==null|| tipotituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
						tipotituloclientesAux.addAll(tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
							tipotituloclientesAux.addAll(tipotituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotituloclienteLogic.getTipoTituloClientesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTituloClientes("BusquedaPorNombre",tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTituloClientes("BusquedaPorNombre",tipotituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.setTipoTituloClientes(new ArrayList<TipoTituloCliente>());
						tipotituloclienteLogic.getTipoTituloClientes().addAll(tipotituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientes=new ArrayList<TipoTituloCliente>();
							tipotituloclientes.addAll(tipotituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorSiglas")) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotituloclienteLogic.getTipoTituloClientesBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotituloclienteLogic.getTipoTituloClientes()==null||tipotituloclienteLogic.getTipoTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotituloclientes==null|| tipotituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
						tipotituloclientesAux.addAll(tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
							tipotituloclientesAux.addAll(tipotituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotituloclienteLogic.getTipoTituloClientesBusquedaPorSiglas(finalQueryGlobal,pagination,siglasBusquedaPorSiglas);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceBusquedaPorSiglas(siglasBusquedaPorSiglas);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTituloClientes("BusquedaPorSiglas",tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTituloClientes("BusquedaPorSiglas",tipotituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.setTipoTituloClientes(new ArrayList<TipoTituloCliente>());
						tipotituloclienteLogic.getTipoTituloClientes().addAll(tipotituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientes=new ArrayList<TipoTituloCliente>();
							tipotituloclientes.addAll(tipotituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipotituloclienteLogic.getTipoTituloClientesFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipotituloclienteLogic.getTipoTituloClientes()==null||tipotituloclienteLogic.getTipoTituloClientes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipotituloclientes==null|| tipotituloclientes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
						tipotituloclientesAux.addAll(tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientesAux=new ArrayList<TipoTituloCliente>();
							tipotituloclientesAux.addAll(tipotituloclientes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipotituloclienteLogic.getTipoTituloClientesFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoTituloClienteConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoTituloClientes("FK_IdPais",tipotituloclienteLogic.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoTituloClientes("FK_IdPais",tipotituloclientes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteLogic.setTipoTituloClientes(new ArrayList<TipoTituloCliente>());
						tipotituloclienteLogic.getTipoTituloClientes().addAll(tipotituloclientesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclientes=new ArrayList<TipoTituloCliente>();
							tipotituloclientes.addAll(tipotituloclientesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoTituloCliente();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoTituloCliente();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotituloclienteLogic.getTipoTituloClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotituloclientes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipotituloclienteLogic.getTipoTituloClientes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipotituloclientes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoTituloCliente tipotitulocliente) {
		Boolean permite=true;
		
		if(this.tipotitulocliente.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoTituloClienteConstantesFunciones.getOrderByListaTipoTituloCliente();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoTituloClienteConstantesFunciones.getOrderByListaTipoTituloCliente();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTituloCliente tipotitulocliente:tipotituloclienteLogic.getTipoTituloClientes()) {
				if(tipotitulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipotituloclienteTotales=tipotitulocliente;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTituloCliente tipotitulocliente:this.tipotituloclientes) {
				if(tipotitulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipotituloclienteTotales=tipotitulocliente;
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
			this.tipotituloclienteAux=new TipoTituloCliente();
			this.tipotituloclienteAux.setsType(Constantes2.S_TOTALES);
			this.tipotituloclienteAux.setIsNew(false);
			this.tipotituloclienteAux.setIsChanged(false);
			this.tipotituloclienteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoTituloClienteConstantesFunciones.TotalizarValoresFilaTipoTituloCliente(this.tipotituloclienteLogic.getTipoTituloClientes(),this.tipotituloclienteAux);
				
				this.tipotituloclienteLogic.getTipoTituloClientes().add(this.tipotituloclienteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoTituloClienteConstantesFunciones.TotalizarValoresFilaTipoTituloCliente(this.tipotituloclientes,this.tipotituloclienteAux);
				
				this.tipotituloclientes.add(this.tipotituloclienteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipotituloclienteTotales=new TipoTituloCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotituloclienteLogic.getTipoTituloClientes().remove(tipotituloclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipotituloclientes.remove(tipotituloclienteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipotituloclienteTotales=new TipoTituloCliente();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoTituloCliente tipotitulocliente:tipotituloclienteLogic.getTipoTituloClientes()) {
				if(tipotitulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipotituloclienteTotales=tipotitulocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTituloClienteConstantesFunciones.TotalizarValoresFilaTipoTituloCliente(this.tipotituloclienteLogic.getTipoTituloClientes(),tipotituloclienteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoTituloCliente tipotitulocliente:this.tipotituloclientes) {
				if(tipotitulocliente.getsType().equals(Constantes2.S_TOTALES)) {
					tipotituloclienteTotales=tipotitulocliente;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoTituloClienteConstantesFunciones.TotalizarValoresFilaTipoTituloCliente(this.tipotituloclientes,tipotituloclienteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoTituloClientesBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTituloClientesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTituloClientesBusquedaPorSiglas()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorSiglas";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTituloClientesFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoTituloClientePorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoTituloClientesBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLogic.getTipoTituloClientesBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTituloClientesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLogic.getTipoTituloClientesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTituloClientesBusquedaPorSiglas(String sFinalQuery,String siglas)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLogic.getTipoTituloClientesBusquedaPorSiglas(sFinalQuery,this.pagination,siglas);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTituloClientesFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLogic.getTipoTituloClientesFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoTituloClientePorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLogic.getTipoTituloClientePorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoTituloCliente() {
		this.isPermisoTodoTipoTituloCliente=false;
		this.isPermisoNuevoTipoTituloCliente=false;
		this.isPermisoActualizarTipoTituloCliente=false;
		this.isPermisoActualizarOriginalTipoTituloCliente=false;
		this.isPermisoEliminarTipoTituloCliente=false;
		this.isPermisoGuardarCambiosTipoTituloCliente=false;
		this.isPermisoConsultaTipoTituloCliente=false;
		this.isPermisoBusquedaTipoTituloCliente=false;
		this.isPermisoReporteTipoTituloCliente=false;		
		this.isPermisoOrdenTipoTituloCliente=false;		
		this.isPermisoPaginacionMedioTipoTituloCliente=false;		
		this.isPermisoPaginacionAltoTipoTituloCliente=false;
		this.isPermisoPaginacionTodoTipoTituloCliente=false;
		this.isPermisoCopiarTipoTituloCliente=false;		
		this.isPermisoVerFormTipoTituloCliente=false;		
		this.isPermisoDuplicarTipoTituloCliente=false;		
		this.isPermisoOrdenTipoTituloCliente=false;		
	}
	
	public void setPermisosUsuarioTipoTituloCliente(Boolean isPermiso) {
		this.isPermisoTodoTipoTituloCliente=isPermiso;
		this.isPermisoNuevoTipoTituloCliente=isPermiso;
		this.isPermisoActualizarTipoTituloCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoTituloCliente=isPermiso;
		this.isPermisoEliminarTipoTituloCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoTituloCliente=isPermiso;
		this.isPermisoConsultaTipoTituloCliente=isPermiso;
		this.isPermisoBusquedaTipoTituloCliente=isPermiso;
		this.isPermisoReporteTipoTituloCliente=isPermiso;
		this.isPermisoOrdenTipoTituloCliente=isPermiso;		
		this.isPermisoPaginacionMedioTipoTituloCliente=isPermiso;		
		this.isPermisoPaginacionAltoTipoTituloCliente=isPermiso;		
		this.isPermisoPaginacionTodoTipoTituloCliente=isPermiso;		
		this.isPermisoCopiarTipoTituloCliente=isPermiso;		
		this.isPermisoVerFormTipoTituloCliente=isPermiso;		
		this.isPermisoDuplicarTipoTituloCliente=isPermiso;
		this.isPermisoOrdenTipoTituloCliente=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoTituloCliente(Boolean isPermiso) {
		//this.isPermisoTodoTipoTituloCliente=isPermiso;
		this.isPermisoNuevoTipoTituloCliente=isPermiso;
		this.isPermisoActualizarTipoTituloCliente=isPermiso;
		this.isPermisoActualizarOriginalTipoTituloCliente=isPermiso;
		this.isPermisoEliminarTipoTituloCliente=isPermiso;
		this.isPermisoGuardarCambiosTipoTituloCliente=isPermiso;
		//this.isPermisoConsultaTipoTituloCliente=isPermiso;
		//this.isPermisoBusquedaTipoTituloCliente=isPermiso;
		//this.isPermisoReporteTipoTituloCliente=isPermiso;
		//this.isPermisoOrdenTipoTituloCliente=isPermiso;		
		//this.isPermisoPaginacionMedioTipoTituloCliente=isPermiso;		
		//this.isPermisoPaginacionAltoTipoTituloCliente=isPermiso;		
		//this.isPermisoPaginacionTodoTipoTituloCliente=isPermiso;		
		//this.isPermisoCopiarTipoTituloCliente=isPermiso;		
		//this.isPermisoDuplicarTipoTituloCliente=isPermiso;
		//this.isPermisoOrdenTipoTituloCliente=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoTituloClienteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoTituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoTituloCliente(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoTituloClienteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoTituloClienteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoTituloClienteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoTituloClienteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoTituloCliente() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoTituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoTituloClienteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoTituloCliente=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoTituloCliente=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoTituloCliente=this.isPermisoActualizarTipoTituloCliente;
			this.isPermisoEliminarTipoTituloCliente=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoTituloCliente=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoTituloCliente=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoTituloCliente=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoTituloCliente=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoTituloCliente=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTituloCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoTituloCliente=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoTituloCliente=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoTituloCliente=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoTituloCliente=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoTituloCliente=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoTituloCliente=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoTituloCliente=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoTituloCliente.setToolTipText(this.jTableDatosTipoTituloCliente.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoTituloCliente(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoTituloCliente(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoTituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoTituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoTituloCliente() throws Exception {
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
	public void inicializarCombosForeignKeyTipoTituloClienteListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoTituloClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoTituloClienteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoTituloClienteListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoTituloClienteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoTituloClienteParameterReturnGeneral tipotituloclienteReturnGeneral=new TipoTituloClienteParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipotituloclienteConstantesFunciones.cargarid_paisTipoTituloCliente)
					 || (this.esRecargarFks && this.tipotituloclienteConstantesFunciones.cargarid_paisTipoTituloCliente)) {

					if(!this.tipotituloclienteSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipotituloclienteSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipotituloclienteReturnGeneral=tipotituloclienteLogic.cargarCombosLoteForeignKeyTipoTituloCliente(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipotituloclienteReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoTituloCliente()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipotituloclienteSessionBean==null) {
				this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
			}

			if(!this.tipotituloclienteSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoTituloCliente()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoTituloCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoTituloCliente()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTituloCliente();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoTituloCliente(TipoTituloCliente tipotitulocliente)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipotitulocliente.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoTituloCliente(TipoTituloCliente tipotitulocliente,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoTituloCliente()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipotituloclienteConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoTituloCliente()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoTituloCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoTituloCliente()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoTituloCliente()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoTituloCliente()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoTituloCliente(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoTituloCliente()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente!=null && this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoTituloClienteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoTituloClienteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoTituloClienteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean(); 
		this.tipotituloclienteConstantesFunciones=new TipoTituloClienteConstantesFunciones(); 
		this.tipotituloclienteBean=new TipoTituloCliente();//(this.tipotituloclienteConstantesFunciones); 		
		this.tipotituloclienteReturnGeneral=new TipoTituloClienteParameterReturnGeneral(); 
		
		this.tipotituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipotituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoTituloClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoTituloClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoTituloClienteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoTituloCliente(true);
			
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
			
			this.tipotituloclienteConstantesFunciones=new TipoTituloClienteConstantesFunciones(); 
			this.tipotituloclienteBean=new TipoTituloCliente();//this.tipotituloclienteConstantesFunciones); 			
			this.tipotituloclienteReturnGeneral=new TipoTituloClienteParameterReturnGeneral(); 
		
			TipoTituloClienteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Titulo Cliente Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipotitulocliente=new TipoTituloCliente();
			this.tipotituloclientes = new ArrayList<TipoTituloCliente>();
			this.tipotituloclientesAux = new ArrayList<TipoTituloCliente>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic=new TipoTituloClienteLogic();
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.tipotituloclienteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipotituloclienteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoTituloCliente);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTituloCliente);	
					}
					
					if(this.jInternalFrameImportacionTipoTituloCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTituloCliente);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoTituloCliente!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoTituloCliente);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTituloCliente);
				this.jInternalFrameDetalleFormTipoTituloCliente.setVisible(false);
				this.jInternalFrameDetalleFormTipoTituloCliente.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTituloCliente);
					this.jInternalFrameReporteDinamicoTipoTituloCliente.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoTituloCliente.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoTituloCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoTituloCliente);
					this.jInternalFrameImportacionTipoTituloCliente.setVisible(false);
					this.jInternalFrameImportacionTipoTituloCliente.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoTituloCliente!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoTituloCliente);
					this.jInternalFrameOrderByTipoTituloCliente.setVisible(false);
					this.jInternalFrameOrderByTipoTituloCliente.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoTituloClienteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoTituloClienteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipotituloclienteReturnGeneral=new TipoTituloClienteParameterReturnGeneral();
			
			this.tipotituloclienteParameterGeneral=new TipoTituloClienteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipotituloclienteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoTituloClienteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTituloClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotituloclienteSessionBean.getEsGuardarRelacionado(),this.tipotituloclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoTituloClienteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipotituloclienteSessionBean.getEsGuardarRelacionado(),this.tipotituloclienteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaDuplicarTipoTituloCliente=true;
			this.isVisibilidadCeldaCopiarTipoTituloCliente=true;
			this.isVisibilidadCeldaVerFormTipoTituloCliente=true;
			this.isVisibilidadCeldaOrdenTipoTituloCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
			this.isVisibilidadCeldaModificarTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=false;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorSiglas=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoTituloCliente();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoTituloCliente(false);
			
			this.setPermisosUsuarioTipoTituloCliente();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado() 
				|| (this.tipotituloclienteSessionBean.getEsGuardarRelacionado() && this.tipotituloclienteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoTituloClienteClasesRelacionadas();
			}
			
			if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoTituloClienteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoTituloCliente();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoTituloCliente();
			}
			
			if(!this.isPermisoBusquedaTipoTituloCliente) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoTituloCliente,this.isPermisoPaginacionMedioTipoTituloCliente,this.isPermisoPaginacionTodoTipoTituloCliente);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoTituloClienteConstantesFunciones.getTiposSeleccionarTipoTituloCliente());
				
				this.tiposColumnasSelect=TipoTituloClienteConstantesFunciones.getTiposSeleccionarTipoTituloCliente(true);
				
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
			//if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoTituloCliente();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoTituloCliente(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoTituloCliente(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTituloCliente() ;
			
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
				tipotituloclienteImplementable= (TipoTituloClienteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTituloClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipotituloclienteImplementableHome= (TipoTituloClienteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoTituloClienteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipotituloclientes= new ArrayList<TipoTituloCliente>();
			this.tipotituloclientesEliminados= new ArrayList<TipoTituloCliente>();
						
			this.isEsNuevoTipoTituloCliente=false;
			this.esParaAccionDesdeFormularioTipoTituloCliente=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoTituloCliente(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoTituloCliente();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoTituloClienteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoTituloCliente("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoTituloCliente(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoTituloCliente();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoTituloCliente();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoTituloCliente.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoTituloCliente.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoTituloCliente.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoTituloCliente(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoTituloCliente: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoTituloCliente() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoTituloCliente")) {
				iIndex=this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoTituloCliente();	
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
	
	public void cargarCombosForeignKeyTipoTituloCliente(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoTituloCliente(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoTituloCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoTituloClienteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoTituloCliente();
		
		this.cargarCombosFrameForeignKeyTipoTituloCliente();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoTituloCliente();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoTituloCliente();
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
	
	public void jButtonNuevoTipoTituloClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			
			if(jTableDatosTipoTituloCliente.getRowCount()>=1) {
				jTableDatosTipoTituloCliente.removeRowSelectionInterval(0, jTableDatosTipoTituloCliente.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoTituloCliente=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoTituloCliente(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoTituloCliente(true);			
			//this.tipotitulocliente=new TipoTituloCliente();
			//this.tipotitulocliente.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTituloCliente(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTituloCliente() ;
			
			if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTituloCliente(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipotitulocliente);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);				
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoTituloCliente: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoTituloClienteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoTituloCliente.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoTituloCliente.getSelectedRows().length;			
			}
			
			tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoTituloCliente--;			
				//TipoTituloCliente tipotituloclienteAux= new TipoTituloCliente();			
				//tipotituloclienteAux.setId(this.iIdNuevoTipoTituloCliente);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoTituloCliente tipotituloclienteOrigen=new TipoTituloCliente();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoTituloCliente tipotituloclienteOrigen : tipotituloclientesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipotituloclienteOrigen =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipotituloclienteOrigen =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoTituloCliente();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipotitulocliente.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoTituloCliente(tipotituloclienteOrigen,this.tipotitulocliente,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotituloclienteLogic.getTipoTituloClientes().add(this.tipotituloclienteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotituloclientes.add(this.tipotituloclienteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
				
				this.jTableDatosTipoTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTipoTituloCliente(), this.getIndiceNuevoTipoTituloCliente());
				
				int iLastRow =  this.jTableDatosTipoTituloCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTituloCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTituloCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTituloCliente(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();									
		
			TipoTituloCliente tipotituloclienteOrigen=new TipoTituloCliente();
			TipoTituloCliente tipotituloclienteDestino=new TipoTituloCliente();
				
			tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoTituloCliente.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipotituloclientesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoTituloCliente.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteOrigen =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotituloclienteOrigen =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipotituloclienteDestino =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipotituloclienteDestino =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipotituloclienteOrigen =tipotituloclientesSeleccionados.get(0);
				tipotituloclienteDestino =tipotituloclientesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoTituloCliente(tipotituloclienteOrigen,tipotituloclienteDestino,true,false);
				
				tipotituloclienteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipotituloclienteDestino,tipotituloclienteLogic.getTipoTituloClientes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipotituloclienteDestino,tipotituloclientes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
				
				//this.jTableDatosTipoTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTipoTituloCliente(), this.getIndiceNuevoTipoTituloCliente());
				
				int iLastRow =  this.jTableDatosTipoTituloCliente.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoTituloCliente.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoTituloCliente.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTituloCliente(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoTituloCliente.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoTituloCliente.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoTituloCliente.setVisible(!isVisible);
			this.jPanelPaginacionTipoTituloCliente.setVisible(!isVisible);
			this.jPanelAccionesTipoTituloCliente.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoTituloCliente();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoTituloCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoTituloCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoTituloCliente();
			
			this.abrirFrameOrderByTipoTituloCliente();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoTituloCliente();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoTituloCliente(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTituloCliente);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoTituloCliente.isMaximum()) {
					this.jInternalFrameDetalleFormTipoTituloCliente.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoTituloCliente.setSize(this.jInternalFrameDetalleFormTipoTituloCliente.iWidthFormulario,this.jInternalFrameDetalleFormTipoTituloCliente.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoTituloCliente.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoTituloCliente.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoTituloCliente.isMaximum()) {
						this.jInternalFrameDetalleFormTipoTituloCliente.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoTituloCliente.jContentPaneDetalleTipoTituloCliente.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoTituloCliente.jContentPaneDetalleTipoTituloCliente.getWidth(),TipoTituloClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoTituloCliente.jContentPaneDetalleTipoTituloCliente.getWidth(),TipoTituloClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoTituloCliente.jContentPaneDetalleTipoTituloCliente.getWidth(),TipoTituloClienteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoTituloCliente.setVisible(true);
	        this.jInternalFrameDetalleFormTipoTituloCliente.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoTituloCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoTituloCliente==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTituloCliente,false,this);
				} else {
					this.jInternalFrameOrderByTipoTituloCliente=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoTituloCliente,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoTituloCliente);
				this.jInternalFrameOrderByTipoTituloCliente.setVisible(false);
				this.jInternalFrameOrderByTipoTituloCliente.setSelected(false);
				
				this.jInternalFrameOrderByTipoTituloCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTituloCliente"));
				
				this.inicializarActualizarBindingTablaOrderByTipoTituloCliente();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoTituloCliente() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoTituloCliente==null) {
				
				this.jInternalFrameImportacionTipoTituloCliente=new ImportacionJInternalFrame(TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoTituloCliente);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoTituloCliente);
				this.jInternalFrameImportacionTipoTituloCliente.setVisible(false);
				this.jInternalFrameImportacionTipoTituloCliente.setSelected(false);


				this.jInternalFrameImportacionTipoTituloCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTituloCliente"));
				this.jInternalFrameImportacionTipoTituloCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTituloCliente"));
				this.jInternalFrameImportacionTipoTituloCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTituloCliente"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoTituloCliente() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoTituloCliente==null) {
				this.jInternalFrameReporteDinamicoTipoTituloCliente=new ReporteDinamicoJInternalFrame(TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoTituloCliente);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoTituloCliente);
				this.jInternalFrameReporteDinamicoTipoTituloCliente.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoTituloCliente.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTituloCliente"));
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTituloCliente"));
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTituloCliente"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTituloCliente();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoTituloCliente() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoTituloCliente);
			
	       	this.jInternalFrameDetalleFormTipoTituloCliente.setVisible(false);
	        this.jInternalFrameDetalleFormTipoTituloCliente.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoTituloCliente.dispose();
			//this.jInternalFrameDetalleFormTipoTituloCliente=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoTituloCliente() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoTituloCliente.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoTituloCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoTituloCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoTituloCliente.setVisible(true);
	        this.jInternalFrameImportacionTipoTituloCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoTituloCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoTituloCliente.setVisible(true);
	        this.jInternalFrameOrderByTipoTituloCliente.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoTituloCliente() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoTituloCliente.setVisible(false);
	        this.jInternalFrameOrderByTipoTituloCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoTituloCliente() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoTituloCliente.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoTituloCliente.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoTituloCliente() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoTituloCliente.setVisible(false);
	        this.jInternalFrameImportacionTipoTituloCliente.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoTituloCliente(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoTituloCliente(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoTituloCliente(true);
			//this.isEsNuevoTipoTituloCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoTituloCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTituloCliente(false) ;
			
			if(tipotituloclienteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTituloCliente(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTituloCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoTituloClienteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoTituloCliente(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoTituloCliente(true);
			//this.isEsNuevoTipoTituloCliente=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipotitulocliente.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoTituloCliente("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoTituloCliente(false) ;
			
			if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoTituloCliente(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTituloCliente(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,TipoTituloClienteConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoTituloCliente.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoTituloCliente(false);
			
			//if(!this.isEsNuevoTipoTituloCliente) {								
				int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
				
			}
			
			if(this.permiteMantenimiento(this.tipotitulocliente)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoTituloCliente=true;
					this.inicializarActualizarBindingTablaTipoTituloCliente(false);
					this.isEsNuevoTipoTituloCliente=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoTituloCliente=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoTituloCliente=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTituloCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTituloCliente(false);
				
				this.habilitarDeshabilitarControlesTipoTituloCliente(false);
			
												
				
				if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoTituloCliente();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoTituloClienteActionPerformed(evt,tipotituloclienteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoTituloCliente(this.tipotitulocliente,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoTituloCliente.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipotituloclienteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipotitulocliente.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				this.tipotitulocliente.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				this.tipotitulocliente.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipotitulocliente)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoTituloClienteModel) this.jTableDatosTipoTituloCliente.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoTituloCliente=true;
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
				this.isEsNuevoTipoTituloCliente=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoTituloCliente(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTituloCliente(false);
				
				this.habilitarDeshabilitarControlesTipoTituloCliente(false);
				
				
				
				if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoTituloCliente();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoTituloCliente.getRowCount()>=1) {
				jTableDatosTipoTituloCliente.removeRowSelectionInterval(0, jTableDatosTipoTituloCliente.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoTituloCliente(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoTituloCliente(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoTituloCliente(false) ;
			
			this.isEsNuevoTipoTituloCliente=false;
			
			if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoTituloCliente();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoTituloCliente(false);
				
				//SI ES MANUAL
				if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoTituloCliente();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoTituloCliente--;			
			//TipoTituloCliente tipotituloclienteAux= new TipoTituloCliente();			
			//tipotituloclienteAux.setId(this.iIdNuevoTipoTituloCliente);
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoTituloCliente();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
			
			this.tipotitulocliente.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipotituloclienteLogic.getTipoTituloClientes().add(this.tipotituloclienteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipotituloclientes.add(this.tipotituloclienteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			
			this.jTableDatosTipoTituloCliente.setRowSelectionInterval(this.getIndiceNuevoTipoTituloCliente(), this.getIndiceNuevoTipoTituloCliente());
			
			int iLastRow =  this.jTableDatosTipoTituloCliente.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoTituloCliente.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoTituloCliente.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoTituloCliente(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTituloCliente(false);
			
			//SI ES MANUAL
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTituloCliente();
			}
			
			//this.abrirFrameTreeTipoTituloCliente();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Titulo ClienteS ?", "MANTENIMIENTO DE Tipo Titulo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoTituloCliente.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoTituloCliente();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipotituloclienteReturnGeneral=tipotituloclienteLogic.procesarImportacionTipoTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipotituloclienteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoTituloClienteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoTituloCliente.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoTituloCliente.setFileImportacion(this.jInternalFrameImportacionTipoTituloCliente.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoTituloCliente.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoTituloCliente.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoTituloCliente.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoTituloCliente.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		

		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoTituloClienteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoTituloClienteBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTituloClienteConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTituloClienteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoTituloClienteConstantesFunciones.LABEL_SIGLAS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_glas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_glas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_glas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_glas_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoTituloCliente.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoTituloClienteConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoria="siglas";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoTituloClienteConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_SIGLAS:
					sNombreCampoCategoriaValor="siglas";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoTituloClienteConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_SIGLAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Siglas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"siglas");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoTituloClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoTituloClienteConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoTituloCliente tipotitulocliente:tipotituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotitulocliente.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoTituloCliente tipotitulocliente:tipotituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotitulocliente.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoTituloClienteConstantesFunciones.LABEL_SIGLAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS);
					iRow++;

					for(TipoTituloCliente tipotitulocliente:tipotituloclientesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipotitulocliente.getsiglas());
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
			//	this.getFilaCabeceraExportarExcelTipoTituloCliente(row);				
			//	iRow++;
			//}				
			
			//for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoTituloCliente(tipotituloclienteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTituloCliente(false);
			
			//SI ES MANUAL
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoTituloCliente();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTituloCliente(false);
			
			//SI ES MANUAL
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTituloCliente();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoTituloCliente(false);
			
			//SI ES MANUAL
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoTituloCliente();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoTituloCliente() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoTituloCliente.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoTituloCliente.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoTituloCliente.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoTituloCliente.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoTituloCliente.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoTituloCliente.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoTituloCliente.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoTituloCliente(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoTituloCliente(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoTituloCliente(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoTituloCliente(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoTituloCliente(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoTituloCliente(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTituloCliente(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoTituloCliente(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoTituloCliente() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoTituloCliente();
		
		this.inicializarActualizarBindingBotonesManualTipoTituloCliente(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTituloCliente();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoTituloCliente() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTituloCliente(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTituloCliente(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoTituloCliente.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoTituloCliente.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoTituloCliente.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoTituloCliente.jCheckBoxPostAccionNuevoTipoTituloCliente.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoTituloCliente.jCheckBoxPostAccionSinCerrarTipoTituloCliente.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoTituloCliente.jCheckBoxPostAccionSinMensajeTipoTituloCliente.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoTituloCliente.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoTituloCliente.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoTituloCliente.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
				this.jInternalFrameDetalleFormTipoTituloCliente.jCheckBoxPostAccionNuevoTipoTituloCliente.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoTituloCliente.jCheckBoxPostAccionSinCerrarTipoTituloCliente.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoTituloCliente.jCheckBoxPostAccionSinMensajeTipoTituloCliente.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoTituloCliente.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoTituloCliente.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoTituloCliente.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoTituloCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoTituloCliente.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoTituloCliente.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoTituloCliente.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoTituloCliente.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoTituloCliente.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoTituloCliente(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoTituloCliente(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoTituloCliente() throws Exception {
		try	{
			if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTituloCliente();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTituloCliente() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoTituloCliente() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoTituloCliente.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoTituloCliente.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoTituloCliente.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoTituloCliente.addItem(reporte);
			}
			
			
			if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoTituloCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoTituloCliente.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoTituloCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoTituloCliente.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoTituloCliente.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoTituloCliente.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoTituloCliente.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTituloCliente();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoTituloCliente() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoTituloCliente.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoTituloCliente.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoTituloCliente()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jTextFieldidTipoTituloClienteBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoTituloCliente.getText();
		this.siglasBusquedaPorSiglas=this.jTextFieldsiglasBusquedaPorSiglasTipoTituloCliente.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoTituloCliente.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoTituloCliente.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoTituloCliente(Boolean esInicializar) throws Exception {				
		if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoTituloCliente();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoTituloCliente() throws Exception {
		this.inicializarActualizarBindingTablaTipoTituloCliente(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoTituloCliente() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoTituloClienteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloClienteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoTituloCliente(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipotituloclienteLogic.getTipoTituloClientes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipotituloclientes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoTituloCliente.setModel(new TipoTituloClienteModel(this.tipotituloclienteLogic.getTipoTituloClientes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoTituloCliente.setModel(new TipoTituloClienteModel(this.tipotituloclientes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoTituloCliente!=null && this.jInternalFrameOrderByTipoTituloCliente.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoTituloCliente();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO,tipotituloclienteConstantesFunciones.resaltarSeleccionarTipoTituloCliente,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoTituloClienteConstantesFunciones.SCLASSWEBTITULO,tipotituloclienteConstantesFunciones.resaltarSeleccionarTipoTituloCliente,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,TipoTituloClienteConstantesFunciones.LABEL_ID));

		if(this.tipotituloclienteConstantesFunciones.mostraridTipoTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTituloClienteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipotituloclienteConstantesFunciones.resaltaridTipoTituloCliente,this.tipotituloclienteConstantesFunciones.activaridTipoTituloCliente,this,true,"idTipoTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotituloclienteConstantesFunciones.resaltaridTipoTituloCliente,this.tipotituloclienteConstantesFunciones.activaridTipoTituloCliente,this,true,"idTipoTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,TipoTituloClienteConstantesFunciones.LABEL_IDPAIS));

		if(this.tipotituloclienteConstantesFunciones.mostrarid_paisTipoTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTituloClienteConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipotituloclienteConstantesFunciones.resaltarid_paisTipoTituloCliente,this,this.tipotituloclienteConstantesFunciones.activarid_paisTipoTituloCliente));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipotituloclienteConstantesFunciones.resaltarid_paisTipoTituloCliente,this,this.tipotituloclienteConstantesFunciones.activarid_paisTipoTituloCliente,true,"id_paisTipoTituloCliente","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,TipoTituloClienteConstantesFunciones.LABEL_NOMBRE));

		if(this.tipotituloclienteConstantesFunciones.mostrarnombreTipoTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTituloClienteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotituloclienteConstantesFunciones.resaltarnombreTipoTituloCliente,this.tipotituloclienteConstantesFunciones.activarnombreTipoTituloCliente,this,true,"nombreTipoTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotituloclienteConstantesFunciones.resaltarnombreTipoTituloCliente,this.tipotituloclienteConstantesFunciones.activarnombreTipoTituloCliente,this,true,"nombreTipoTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,TipoTituloClienteConstantesFunciones.LABEL_SIGLAS));

		if(this.tipotituloclienteConstantesFunciones.mostrarsiglasTipoTituloCliente && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoTituloClienteConstantesFunciones.LABEL_SIGLAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipotituloclienteConstantesFunciones.resaltarsiglasTipoTituloCliente,this.tipotituloclienteConstantesFunciones.activarsiglasTipoTituloCliente,this,true,"siglasTipoTituloCliente","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipotituloclienteConstantesFunciones.resaltarsiglasTipoTituloCliente,this.tipotituloclienteConstantesFunciones.activarsiglasTipoTituloCliente,this,true,"siglasTipoTituloCliente","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoTituloClientePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotituloclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotituloclienteSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTituloCliente.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipotituloclienteSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipotituloclienteSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoTituloCliente.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipotituloclienteSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipotituloclienteSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoTituloCliente.addColumn(tableColumn);
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
			
			this.jTableDatosTipoTituloCliente.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoTituloCliente.moveColumn(this.jTableDatosTipoTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoTituloCliente.moveColumn(this.jTableDatosTipoTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoTituloCliente.moveColumn(this.jTableDatosTipoTituloCliente.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoTituloCliente.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoTituloCliente.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoTituloCliente,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoTituloCliente.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoTituloCliente.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoTituloCliente.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoTituloCliente.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipotituloclienteLogic.getTipoTituloClientes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipotituloclientes.size()-1;
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
		//this.jTableDatosTipoTituloCliente.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoTituloCliente.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoTituloCliente();
			
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
				
				//this.isEsNuevoTipoTituloCliente=false;
					
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
				if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoTituloCliente==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTituloCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTituloCliente.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipotitulocliente.getsType().equals("DUPLICADO")
				   || this.tipotitulocliente.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoTituloCliente=true;
				
				} else {
					this.isEsNuevoTipoTituloCliente=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
					if(this.tipotitulocliente.getId()>=0 && !this.tipotitulocliente.getIsNew()) {						
						this.isEsNuevoTipoTituloCliente=false;
						
					} else {
						this.isEsNuevoTipoTituloCliente=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoTituloCliente(esRelaciones);						
				
				this.seleccionarTipoTituloCliente(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipotitulocliente.getId()<0) {
					this.isEsNuevoTipoTituloCliente=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoTituloCliente(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoTituloCliente(evt,rowIndex);
				}	
				
				if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoTituloCliente: " + this.dDif); 
					}
				}								
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoTituloCliente(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipotitulocliente)) {
					if(this.tipotitulocliente.getId()>0) {
						this.tipotitulocliente.setIsDeleted(true);
						
						this.tipotituloclientesEliminados.add(this.tipotitulocliente);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipotituloclienteLogic.getTipoTituloClientes().remove(this.tipotitulocliente);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipotituloclientes.remove(this.tipotitulocliente);				
					}
					
					
					((TipoTituloClienteModel) this.jTableDatosTipoTituloCliente.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoTituloCliente(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoTituloCliente(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoTituloCliente) {
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoTituloCliente.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoTituloCliente.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoTituloCliente(this.tipotitulocliente);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipotituloclienteConstantesFunciones.cargarid_paisTipoTituloCliente || this.tipotituloclienteConstantesFunciones.event_dependid_paisTipoTituloCliente) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipotitulocliente.getid_pais());
									//this.inicializarActualizarBindingTipoTituloCliente(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipotitulocliente.getPais()!=null) {
							this.paissForeignKey.add(tipotitulocliente.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipotitulocliente.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoTituloCliente("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoTituloCliente(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoTituloCliente() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTituloCliente(TipoTituloCliente tipotitulocliente) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoTituloCliente(tipotitulocliente,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoTituloCliente(TipoTituloCliente tipotitulocliente,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoTituloCliente(tipotitulocliente);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoTituloCliente(tipotitulocliente,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoTituloCliente(tipotitulocliente);
	}
	
	public void setVariablesObjetoActualToFormularioTipoTituloCliente(TipoTituloCliente tipotitulocliente) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setText(tipotitulocliente.getId().toString());
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setText(tipotitulocliente.getnombre());
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setText(tipotitulocliente.getsiglas());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoTituloCliente tipotituloclienteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipotituloclienteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoTituloCliente tipotituloclienteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipotituloclienteLocal=this.tipotitulocliente;
			} else {
				tipotituloclienteLocal=this.tipotituloclienteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipotituloclienteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoTituloCliente(tipotituloclienteLocal,true);
					
					if(tipotituloclienteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipotituloclienteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipotituloclienteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoTituloCliente(TipoTituloCliente tipotitulocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTituloCliente(tipotitulocliente,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(tipotitulocliente);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTituloCliente(TipoTituloCliente tipotitulocliente,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoTituloCliente(tipotitulocliente,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoTituloCliente(TipoTituloCliente tipotitulocliente,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.getText()==null || this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.getText()=="" || this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setText("0");
			}

			if(conColumnasBase) {tipotitulocliente.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTituloClienteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelIdTipoTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotitulocliente.setnombre(this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTituloClienteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelnombreTipoTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipotitulocliente.setsiglas(this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoTituloClienteConstantesFunciones.LABEL_SIGLAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoTituloCliente.jLabelsiglasTipoTituloCliente,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoTituloCliente(TipoTituloCliente tipotituloclienteBean,TipoTituloCliente tipotitulocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipotituloclienteBean.getid_pais()!=null && !tipotituloclienteBean.getid_pais().equals(-1L))) {tipotitulocliente.setid_pais(tipotituloclienteBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoTituloCliente(TipoTituloCliente tipotituloclienteOrigen,TipoTituloCliente tipotitulocliente,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotituloclienteOrigen.getId()!=null && !tipotituloclienteOrigen.getId().equals(0L))) {tipotitulocliente.setId(tipotituloclienteOrigen.getId());}}
			if(conDefault || (!conDefault && tipotituloclienteOrigen.getid_pais()!=null && !tipotituloclienteOrigen.getid_pais().equals(-1L))) {tipotitulocliente.setid_pais(tipotituloclienteOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipotituloclienteOrigen.getnombre()!=null && !tipotituloclienteOrigen.getnombre().equals(""))) {tipotitulocliente.setnombre(tipotituloclienteOrigen.getnombre());}
			if(conDefault || (!conDefault && tipotituloclienteOrigen.getsiglas()!=null && !tipotituloclienteOrigen.getsiglas().equals(""))) {tipotitulocliente.setsiglas(tipotituloclienteOrigen.getsiglas());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTituloCliente(TipoTituloCliente tipotitulocliente) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setText(tipotitulocliente.getId().toString());
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setText(tipotitulocliente.getnombre());
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setText(tipotitulocliente.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoTituloCliente(TipoTituloClienteBean tipotituloclienteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setText(tipotituloclienteBean.getId().toString());
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setText(tipotituloclienteBean.getnombre());
			this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setText(tipotituloclienteBean.getsiglas());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoTituloCliente(TipoTituloClienteParameterReturnGeneral tipotituloclienteReturnGeneral,TipoTituloClienteBean tipotituloclienteBean,Boolean conDefault) throws Exception { 
		try {
			TipoTituloCliente tipotituloclienteLocal=new TipoTituloCliente();
			
			tipotituloclienteLocal=tipotituloclienteReturnGeneral.getTipoTituloCliente();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipotituloclienteLocal.getId()!=null && !tipotituloclienteLocal.getId().equals(0L))) {tipotituloclienteBean.setId(tipotituloclienteLocal.getId());}}
			if(conDefault || (!conDefault && tipotituloclienteLocal.getid_pais()!=null && !tipotituloclienteLocal.getid_pais().equals(-1L))) {tipotituloclienteBean.setid_pais(tipotituloclienteLocal.getid_pais());}
			if(conDefault || (!conDefault && tipotituloclienteLocal.getnombre()!=null && !tipotituloclienteLocal.getnombre().equals(""))) {tipotituloclienteBean.setnombre(tipotituloclienteLocal.getnombre());}
			if(conDefault || (!conDefault && tipotituloclienteLocal.getsiglas()!=null && !tipotituloclienteLocal.getsiglas().equals(""))) {tipotituloclienteBean.setsiglas(tipotituloclienteLocal.getsiglas());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoTituloClienteGenerico(Long idTipoTituloClienteSeleccionado,JComboBox jComboBoxTipoTituloCliente,List<TipoTituloCliente> tipotituloclientesLocal)throws Exception {
		try {
			TipoTituloCliente  tipotituloclienteTemp=null;

			for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesLocal) {
				if(tipotituloclienteAux.getId()!=null && tipotituloclienteAux.getId().equals(idTipoTituloClienteSeleccionado)) {
					tipotituloclienteTemp=tipotituloclienteAux;
					break;
				}
			}

			jComboBoxTipoTituloCliente.setSelectedItem(tipotituloclienteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoTituloClienteGenerico(JComboBox jComboBoxTipoTituloCliente,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTituloCliente.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoTituloCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoTituloCliente.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoTituloCliente.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoTituloCliente.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoTituloCliente.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotitulocliente=(TipoTituloCliente) tipotituloclienteLogic.getTipoTituloClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotitulocliente =(TipoTituloCliente) tipotituloclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipotitulocliente.getIsNew() && !tipotitulocliente.getIsChanged() && !tipotitulocliente.getIsDeleted()) {
				sDescripcion=tipotitulocliente.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipotitulocliente.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoTituloCliente tipotituloclienteRow=new TipoTituloCliente();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotituloclienteRow=(TipoTituloCliente) tipotituloclienteLogic.getTipoTituloClientes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipotituloclienteRow=(TipoTituloCliente) tipotituloclientes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoTituloCliente(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente));			
			this.jButtonDuplicarTipoTituloCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoTituloCliente && this.isPermisoDuplicarTipoTituloCliente));			
			this.jButtonCopiarTipoTituloCliente.setVisible((this.isVisibilidadCeldaCopiarTipoTituloCliente && this.isPermisoCopiarTipoTituloCliente));
			this.jButtonVerFormTipoTituloCliente.setVisible((this.isVisibilidadCeldaVerFormTipoTituloCliente && this.isPermisoVerFormTipoTituloCliente));
			
			this.jButtonAbrirOrderByTipoTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTipoTituloCliente && this.isPermisoOrdenTipoTituloCliente));			
			
			this.jButtonNuevoRelacionesTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente));			
			this.jButtonNuevoGuardarCambiosTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarTipoTituloCliente.setVisible((this.isVisibilidadCeldaModificarTipoTituloCliente && this.isPermisoActualizarTipoTituloCliente));	
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarTipoTituloCliente.setVisible((this.isVisibilidadCeldaActualizarTipoTituloCliente && this.isPermisoActualizarTipoTituloCliente));	
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarTipoTituloCliente.setVisible((this.isVisibilidadCeldaEliminarTipoTituloCliente && this.isPermisoEliminarTipoTituloCliente));
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarTipoTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTipoTituloCliente);							
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente));						
			this.jButtonDuplicarToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoTituloCliente && this.isPermisoDuplicarTipoTituloCliente));						
			this.jButtonCopiarToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaCopiarTipoTituloCliente && this.isPermisoCopiarTipoTituloCliente));			
			this.jButtonVerFormToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaVerFormTipoTituloCliente && this.isPermisoVerFormTipoTituloCliente));			
			this.jButtonAbrirOrderByToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTipoTituloCliente && this.isPermisoOrdenTipoTituloCliente));
			this.jButtonNuevoRelacionesToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente));			
			this.jButtonNuevoGuardarCambiosToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));			
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaModificarTipoTituloCliente && this.isPermisoActualizarTipoTituloCliente));	
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaActualizarTipoTituloCliente  && this.isPermisoActualizarTipoTituloCliente));	
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaEliminarTipoTituloCliente && this.isPermisoEliminarTipoTituloCliente));
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarToolBarTipoTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTipoTituloCliente);				
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente));			
			this.jMenuItemDuplicarTipoTituloCliente.setVisible((this.isVisibilidadCeldaDuplicarTipoTituloCliente && this.isPermisoDuplicarTipoTituloCliente));			
			this.jMenuItemCopiarTipoTituloCliente.setVisible((this.isVisibilidadCeldaCopiarTipoTituloCliente && this.isPermisoCopiarTipoTituloCliente));			
			this.jMenuItemVerFormTipoTituloCliente.setVisible((this.isVisibilidadCeldaVerFormTipoTituloCliente && this.isPermisoVerFormTipoTituloCliente));			
			this.jMenuItemAbrirOrderByTipoTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTipoTituloCliente && this.isPermisoOrdenTipoTituloCliente));			
			//this.jMenuItemMostrarOcultarTipoTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTipoTituloCliente && this.isPermisoOrdenTipoTituloCliente));
			this.jMenuItemDetalleAbrirOrderByTipoTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTipoTituloCliente && this.isPermisoOrdenTipoTituloCliente));			
			//this.jMenuItemDetalleMostrarOcultarTipoTituloCliente.setVisible((this.isVisibilidadCeldaOrdenTipoTituloCliente && this.isPermisoOrdenTipoTituloCliente));			
			this.jMenuItemNuevoRelacionesTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente));			
			this.jMenuItemNuevoGuardarCambiosTipoTituloCliente.setVisible((this.isVisibilidadCeldaNuevoTipoTituloCliente && this.isPermisoNuevoTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));									
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemModificarTipoTituloCliente.setVisible((this.isVisibilidadCeldaModificarTipoTituloCliente && this.isPermisoActualizarTipoTituloCliente));	
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemActualizarTipoTituloCliente.setVisible((this.isVisibilidadCeldaActualizarTipoTituloCliente && this.isPermisoActualizarTipoTituloCliente));	
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemEliminarTipoTituloCliente.setVisible((this.isVisibilidadCeldaEliminarTipoTituloCliente && this.isPermisoEliminarTipoTituloCliente));
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemCancelarTipoTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTipoTituloCliente);				
			}
			
			this.jMenuItemGuardarCambiosTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));						
			this.jMenuItemGuardarCambiosTablaTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=this.jButtonNuevoTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaDuplicarTipoTituloCliente=this.jButtonDuplicarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaCopiarTipoTituloCliente=this.jButtonCopiarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaVerFormTipoTituloCliente=this.jButtonVerFormTipoTituloCliente.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoTituloCliente=this.jButtonAbrirOrderByTipoTituloCliente.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=this.jButtonNuevoRelacionesTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaModificarTipoTituloCliente=this.jButtonModificarTipoTituloCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.isVisibilidadCeldaActualizarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaGuardarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=this.jButtonGuardarCambiosTablaTipoTituloCliente.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoTituloCliente=this.jButtonNuevoToolBarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=this.jButtonNuevoRelacionesToolBarTipoTituloCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.isVisibilidadCeldaModificarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarToolBarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarToolBarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarToolBarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarToolBarTipoTituloCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTituloCliente=this.jButtonGuardarCambiosToolBarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=this.jButtonGuardarCambiosTablaToolBarTipoTituloCliente.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoTituloCliente=this.jMenuItemNuevoTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=this.jMenuItemNuevoRelacionesTipoTituloCliente.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.isVisibilidadCeldaModificarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemModificarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaActualizarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemActualizarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaEliminarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemEliminarTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaCancelarTipoTituloCliente=this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemCancelarTipoTituloCliente.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoTituloCliente=this.jMenuItemGuardarCambiosTipoTituloCliente.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=this.jMenuItemGuardarCambiosTablaTipoTituloCliente.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoTituloCliente(Boolean esInicializar) {
		if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
				//if(this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTituloCliente();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoTituloCliente(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoTituloCliente() {
		this.jButtonNuevoTipoTituloCliente.setVisible(this.isPermisoNuevoTipoTituloCliente);			
		this.jButtonDuplicarTipoTituloCliente.setVisible(this.isPermisoDuplicarTipoTituloCliente);			
		this.jButtonCopiarTipoTituloCliente.setVisible(this.isPermisoCopiarTipoTituloCliente);			
		this.jButtonVerFormTipoTituloCliente.setVisible(this.isPermisoVerFormTipoTituloCliente);			
		
		this.jButtonAbrirOrderByTipoTituloCliente.setVisible(this.isPermisoOrdenTipoTituloCliente);					
		
		this.jButtonNuevoRelacionesTipoTituloCliente.setVisible(this.isPermisoNuevoTipoTituloCliente);			
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarTipoTituloCliente.setVisible(this.isPermisoActualizarTipoTituloCliente);	
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarTipoTituloCliente.setVisible(this.isPermisoActualizarTipoTituloCliente);	
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarTipoTituloCliente.setVisible(this.isPermisoEliminarTipoTituloCliente);
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarTipoTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTipoTituloCliente);						
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.setVisible(this.isPermisoGuardarCambiosTipoTituloCliente);							
		}
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.setVisible(this.isPermisoActualizarTipoTituloCliente);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTituloCliente() {
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarTipoTituloCliente.setVisible(this.isPermisoActualizarTipoTituloCliente);	
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarTipoTituloCliente.setVisible(this.isPermisoActualizarTipoTituloCliente);	
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarTipoTituloCliente.setVisible(this.isPermisoEliminarTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarTipoTituloCliente.setVisible(this.isVisibilidadCeldaCancelarTipoTituloCliente);							
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.setVisible((this.isVisibilidadCeldaGuardarTipoTituloCliente && this.isPermisoGuardarCambiosTipoTituloCliente));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoTituloCliente() {
		if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoTituloCliente();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoTituloCliente() {
	}
	
	public void jTableDatosTipoTituloClienteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoTituloCliente(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.gettipotitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotitulocliente==null) {
						this.tipotitulocliente = new TipoTituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
				}

				if(this.tipotitulocliente.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipotitulocliente.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoTituloClienteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoTituloCliente(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoTituloCliente.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoTituloCliente.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.gettipotitulocliente(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipotituloclienteLogic.getConnexion());

				if(this.tipotitulocliente.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipotitulocliente.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoTituloCliente=(TitledBorder)this.jScrollPanelDatosTipoTituloCliente.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoTituloCliente.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.gettipotitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotitulocliente==null) {
						this.tipotitulocliente = new TipoTituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
				}

				if(this.tipotitulocliente.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipotitulocliente.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.gettipotitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotitulocliente==null) {
						this.tipotitulocliente = new TipoTituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
				}

				if(this.tipotitulocliente.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipotitulocliente.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsiglasTipoTituloClienteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.gettipotitulocliente(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipotitulocliente==null) {
						this.tipotitulocliente = new TipoTituloCliente();
					}

					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);
				}

				if(this.tipotitulocliente.getsiglas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where siglas like '%"+this.tipotitulocliente.getsiglas()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoTituloCliente(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTituloCliente(false,false);

			this.getTipoTituloClientesBusquedaPorId();

			this.inicializarActualizarBindingTipoTituloCliente(false);

			//if(TipoTituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTituloCliente(false,false);

			this.getTipoTituloClientesBusquedaPorNombre();

			this.inicializarActualizarBindingTipoTituloCliente(false);

			//if(TipoTituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorSiglasTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTituloCliente(false,false);

			this.getTipoTituloClientesBusquedaPorSiglas();

			this.inicializarActualizarBindingTipoTituloCliente(false);

			//if(TipoTituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoTituloClienteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoTituloCliente(false,false);

			this.getTipoTituloClientesFK_IdPais();

			this.inicializarActualizarBindingTipoTituloCliente(false);

			//if(TipoTituloClienteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoTituloCliente(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipotituloclienteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoTituloCliente() {
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
			this.jInternalFrameDetalleFormTipoTituloCliente.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoTituloCliente.dispose();
			this.jInternalFrameDetalleFormTipoTituloCliente=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
			this.jInternalFrameReporteDinamicoTipoTituloCliente.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoTituloCliente.dispose();
			this.jInternalFrameReporteDinamicoTipoTituloCliente=null;
		}
		
		if(this.jInternalFrameImportacionTipoTituloCliente!=null) {
			this.jInternalFrameImportacionTipoTituloCliente.setVisible(false);	    			
			this.jInternalFrameImportacionTipoTituloCliente.dispose();
			this.jInternalFrameImportacionTipoTituloCliente=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoTituloCliente();
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoTituloCliente")) {
				jButtonDuplicarTipoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoTituloCliente")) {
				jButtonCopiarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoTituloCliente")) {
				jButtonVerFormTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoTituloCliente")) {
				jButtonDuplicarTipoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoTituloCliente")) {
				jButtonDuplicarTipoTituloClienteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoTituloCliente")) {
				jButtonModificarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoTituloCliente")) {
				jButtonModificarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoTituloCliente")) {
				jButtonModificarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoTituloCliente")) {
				jButtonActualizarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoTituloCliente")) {
				jButtonActualizarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoTituloCliente")) {
				jButtonActualizarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoTituloCliente")) {
				jButtonEliminarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoTituloCliente")) {
				jButtonEliminarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoTituloCliente")) {
				jButtonEliminarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoTituloCliente")) {
				jButtonCancelarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoTituloCliente")) {
				jButtonCancelarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoTituloCliente")) {
				jButtonCancelarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoTituloCliente")) {
				jButtonCerrarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoTituloCliente")) {
				jButtonCerrarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoTituloCliente")) {
				jButtonCerrarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoTituloCliente")) {
				jButtonMostrarOcultarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoTituloCliente")) {
				jButtonCancelarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoTituloCliente")) {
				jButtonCopiarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoTituloCliente")) {
				jButtonVerFormTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoTituloCliente")) {
				jButtonCopiarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoTituloCliente")) {
				jButtonVerFormTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoTituloCliente")) {
				jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoTituloCliente")) {
				jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoTituloCliente")) {
				jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoTituloCliente")) {
				jButtonAnterioresTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoTituloCliente")) {
				jButtonAnterioresTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoTituloCliente")) {
				jButtonAnterioresTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoTituloCliente")) {
				jButtonSiguientesTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoTituloCliente")) {
				jButtonSiguientesTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoTituloCliente")) {
				jButtonSiguientesTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoTituloCliente") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoTituloCliente")) {
				jButtonAbrirOrderByTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoTituloCliente") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoTituloCliente")) {
				jButtonMostrarOcultarTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTituloCliente")) {
				jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoTituloCliente")) {
				jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoTituloCliente")) {
				jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoTituloCliente")) {
				jButtonCerrarReporteDinamicoTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoTituloCliente")) {
				jButtonGenerarReporteDinamicoTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoTituloCliente")) {
				
				jButtonGenerarExcelReporteDinamicoTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoTituloCliente")) {
				jButtonCerrarImportacionTipoTituloClienteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoTituloCliente")) {
				
				jButtonGenerarImportacionTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoTituloCliente")) {
				
				jButtonAbrirImportacionTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoTituloCliente")) {
				jComboBoxTiposAccionesTipoTituloClienteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoTituloCliente")) {
				jComboBoxTiposRelacionesTipoTituloClienteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoTituloCliente")) {
				jComboBoxTiposAccionesTipoTituloClienteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoTituloCliente")) {
				
				jComboBoxTiposSeleccionarTipoTituloClienteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoTituloCliente")) {
				jTextFieldValorCampoGeneralTipoTituloClienteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoTituloCliente")) {
				jButtonAbrirOrderByTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoTituloCliente")) {
				jButtonAbrirOrderByTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoTituloCliente")) {
				jButtonCerrarOrderByTipoTituloClienteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTituloClienteBusqueda")) {
				this.jButtonidTipoTituloClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoTituloClienteUpdate")) {
				this.jButtonid_paisTipoTituloClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoTituloClienteBusqueda")) {
				this.jButtonid_paisTipoTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTituloClienteBusqueda")) {
				this.jButtonnombreTipoTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTipoTituloClienteBusqueda")) {
				this.jButtonsiglasTipoTituloClienteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdTipoTituloCliente")) {
				this.jButtonBusquedaPorIdTipoTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoTituloCliente")) {
				this.jButtonBusquedaPorNombreTipoTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorSiglasTipoTituloCliente")) {
				this.jButtonBusquedaPorSiglasTipoTituloClienteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoTituloCliente")) {
				this.jButtonFK_IdPaisTipoTituloClienteActionPerformed(evt);
			}
			
			;
			
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoTituloCliente();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoTituloCliente tipotituloclienteLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipotituloclienteLocal=this.tipotitulocliente;
			} else {
				tipotituloclienteLocal=this.tipotituloclienteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
							
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
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
			
			


			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
								
						
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
								
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
							
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
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
			
			


			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
								
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoTituloCliente")) {
					jCheckBoxSeleccionarTodosTipoTituloClienteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoTituloCliente")) {
					jCheckBoxSeleccionadosTipoTituloClienteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoTituloCliente")) {
					
				}
				
				


				
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
												
				
				


				
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
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
			
			


			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoTituloClienteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipotitulocliente);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipotitulocliente);
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
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
				
				


				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoTituloCliente.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoTituloCliente.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoTituloClienteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipotituloclienteAnterior =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoTituloCliente")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoTituloClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoTituloCliente.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipotitulocliente =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipotitulocliente);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoTituloCliente")) {
				
				}
				
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoTituloCliente")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoTituloCliente.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoTituloCliente")) {
			
			}
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoTituloCliente();
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			if(sTipo.equals("NuevoTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoTituloCliente")) {
				jButtonDuplicarTipoTituloClienteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoTituloCliente")) {
				jButtonCopiarTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoTituloCliente")) {
				jButtonVerFormTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoTituloCliente")) {
				jButtonNuevoTipoTituloClienteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoTituloCliente")) {
				jButtonModificarTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoTituloCliente")) {
				jButtonActualizarTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoTituloCliente")) {
				jButtonEliminarTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoTituloCliente")) {
				jButtonCancelarTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoTituloCliente")) {
				jButtonCerrarTipoTituloClienteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoTituloCliente")) {
				jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoTituloCliente")) {
				jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoTituloCliente")) {
				jButtonAbrirOrderByTipoTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoTituloCliente")) {
				jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoTituloCliente")) {
				jButtonAnterioresTipoTituloClienteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoTituloCliente")) {
				jButtonSiguientesTipoTituloClienteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoTituloClienteBusqueda")) {
				this.jButtonidTipoTituloClienteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoTituloClienteUpdate")) {
				this.jButtonid_paisTipoTituloClienteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoTituloClienteBusqueda")) {
				this.jButtonid_paisTipoTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoTituloClienteBusqueda")) {
				this.jButtonnombreTipoTituloClienteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("siglasTipoTituloClienteBusqueda")) {
				this.jButtonsiglasTipoTituloClienteBusquedaActionPerformed(evt);
			}
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoTituloCliente();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoTituloCliente")) {
				closingInternalFrameTipoTituloCliente();
				
			} else if(sTipo.equals("jButtonCancelarTipoTituloCliente")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoTituloCliente = (JInternalFrameBase)evt.getSource();
	            	
	            TipoTituloClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoTituloClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTituloCliente.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoTituloClienteActionPerformed(null);
			}
			
			TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipotitulocliente,new Object(),this.tipotituloclienteParameterGeneral,this.tipotituloclienteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoTituloCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoTituloCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoTituloCliente(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipotitulocliente)) {
			if(!esControlTabla) {
				if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);			
				}
				
				if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoTituloCliente(this.tipotitulocliente,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotituloclienteReturnGeneral=tipotituloclienteLogic.procesarEventosTipoTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotituloclienteLogic.getTipoTituloClientes(),this.tipotitulocliente,this.tipotituloclienteParameterGeneral,this.isEsNuevoTipoTituloCliente,classes);//this.tipotituloclienteLogic.getTipoTituloCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoTituloCliente(this.tipotituloclienteReturnGeneral,this.tipotituloclienteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoTituloCliente(classes,this.tipotituloclienteReturnGeneral,this.tipotituloclienteBean,false);
					}
						
					if(this.tipotituloclienteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente());	
					}
						
					if(this.tipotituloclienteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente(),classes);//this.tipotituloclienteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoTituloCliente(this.tipotitulocliente,classes);//this.tipotituloclienteBean);									
				}
			
				if(TipoTituloClienteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoTituloCliente(this.tipotitulocliente,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoTituloCliente(this.tipotitulocliente);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipotituloclienteAnterior!=null) {
						this.tipotitulocliente=this.tipotituloclienteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipotituloclienteReturnGeneral=tipotituloclienteLogic.procesarEventosTipoTituloClientesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotituloclienteLogic.getTipoTituloClientes(),this.tipotitulocliente,this.tipotituloclienteParameterGeneral,this.isEsNuevoTipoTituloCliente,classes);//this.tipotituloclienteLogic.getTipoTituloCliente()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipotituloclienteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipotituloclienteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipotituloclienteReturnGeneral.getTipoTituloCliente(),tipotituloclienteLogic.getTipoTituloClientes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipotituloclienteReturnGeneral.getTipoTituloCliente(),this.tipotituloclientes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoTituloCliente.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoTituloCliente.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoTituloCliente();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoTituloCliente() throws Exception {
		
		TipoTituloClienteModel tipotituloclienteModel=(TipoTituloClienteModel)this.jTableDatosTipoTituloCliente.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipotituloclienteModel.tipotituloclientes=this.tipotituloclienteLogic.getTipoTituloClientes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipotituloclienteModel.tipotituloclientes=this.tipotituloclientes;
		}
		
		
		((TipoTituloClienteModel) this.jTableDatosTipoTituloCliente.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoTituloCliente() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipotituloclienteAnterior(),this.tipotituloclienteLogic.getTipoTituloClientes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipotituloclienteAnterior(),this.tipotituloclientes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoTituloCliente();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoTituloCliente(TipoTituloCliente tipotitulocliente,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
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
										
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotitulocliente,new Object(),generalEntityParameterGeneral,this.tipotituloclienteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipotituloclienteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoTituloClienteConstantesFunciones.getClassesRelationshipsOfTipoTituloCliente(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoTituloClienteConstantesFunciones.getClassesRelationshipsFromStringsOfTipoTituloCliente(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoTituloCliente(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoTituloClienteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipotitulocliente,new Object(),generalEntityParameterGeneral,this.tipotituloclienteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoTituloCliente(TipoTituloClienteBean tipotituloclienteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoTituloCliente(ArrayList<Classe> classes,TipoTituloClienteReturnGeneral tipotituloclienteReturnGeneral,TipoTituloClienteBean tipotituloclienteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoTituloCliente(TipoTituloCliente tipotitulocliente,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipotitulocliente)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoTituloCliente = new TipoTituloClienteDetalleFormJInternalFrame(jDesktopPane,this.tipotituloclienteSessionBean.getConGuardarRelaciones(),this.tipotituloclienteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.setVisible(false);
		this.jInternalFrameDetalleFormTipoTituloCliente.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoTituloCliente.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoTituloCliente.tipotituloclienteLogic=this.tipotituloclienteLogic;
		
		this.cargarCombosFrameForeignKeyTipoTituloCliente("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoTituloCliente();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoTituloCliente();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoTituloCliente("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoTituloCliente();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoTituloCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTituloCliente"));
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoTituloCliente"));

		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTituloCliente"));
					
		this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemModificarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoTituloCliente"));
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTituloCliente"));
						
		this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemActualizarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoTituloCliente"));
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTituloCliente"));
								
		this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemEliminarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoTituloCliente"));
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTituloCliente"));
					
		this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemCancelarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTituloCliente"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemDetalleCerrarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTituloCliente"));		
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTituloCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTituloCliente"));
		
		
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTituloCliente"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonidTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTituloClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonid_paisTipoTituloClienteUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoTituloClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonid_paisTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonnombreTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonsiglasTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoTituloClienteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTituloCliente"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoTituloCliente"));
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoTituloCliente"));
		}
		
		this.jTableDatosTipoTituloCliente.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoTituloCliente"));
		
		this.jTableDatosTipoTituloCliente.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoTituloCliente"));
		
		this.jButtonNuevoTipoTituloCliente.addActionListener(new ButtonActionListener(this,"NuevoTipoTituloCliente"));
		
		this.jButtonDuplicarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"DuplicarTipoTituloCliente"));
		
		this.jButtonCopiarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"CopiarTipoTituloCliente"));
		
		this.jButtonVerFormTipoTituloCliente.addActionListener(new ButtonActionListener(this,"VerFormTipoTituloCliente"));
		
		
		this.jButtonNuevoToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoTituloCliente"));
			
		this.jButtonDuplicarToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoTituloCliente"));
			
		this.jMenuItemNuevoTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoTituloCliente"));
			
		this.jMenuItemDuplicarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoTituloCliente"));		
		
		
		this.jButtonNuevoRelacionesTipoTituloCliente.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoTituloCliente"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoTituloCliente"));
			
		this.jMenuItemNuevoRelacionesTipoTituloCliente.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoTituloCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarTipoTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonModificarToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoTituloCliente"));
			
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemModificarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"ActualizarTipoTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonActualizarToolBarTipoTituloCliente.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoTituloCliente"));
				
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemActualizarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarTipoTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonEliminarToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoTituloCliente"));
						
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemEliminarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarTipoTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonCancelarToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoTituloCliente"));
			
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemCancelarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoTituloCliente"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoTituloCliente"));		
		
		
		this.jButtonCerrarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CerrarTipoTituloCliente"));
		
		
		this.jButtonCerrarToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoTituloCliente"));
			
		this.jMenuItemCerrarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoTituloCliente"));
			
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jMenuItemDetalleCerrarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoTituloCliente"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoTituloCliente"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoTituloCliente"));
		}
		
		this.jButtonCopiarToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoTituloCliente"));
			
		this.jButtonVerFormToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoTituloCliente"));
		
		this.jMenuItemGuardarCambiosTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoTituloCliente"));
			
		this.jMenuItemCopiarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoTituloCliente"));		
		
		this.jMenuItemVerFormTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoTituloCliente"));		
		
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTituloCliente"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoTituloCliente"));
			
		this.jMenuItemGuardarCambiosTablaTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoTituloCliente"));		
		
		
		
		this.jButtonRecargarInformacionTipoTituloCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoTituloCliente"));
					
		this.jButtonRecargarInformacionToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoTituloCliente"));
		
		this.jMenuItemRecargarInformacionTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoTituloCliente"));		
		
		
		
		this.jButtonAnterioresTipoTituloCliente.addActionListener (new ButtonActionListener(this,"AnterioresTipoTituloCliente"));
		
		
		this.jButtonAnterioresToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoTituloCliente"));
		
		this.jMenuItemAnterioresTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoTituloCliente"));		
		
		
		this.jButtonSiguientesTipoTituloCliente.addActionListener (new ButtonActionListener(this,"SiguientesTipoTituloCliente"));
		
		
		this.jButtonSiguientesToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoTituloCliente"));
			
		this.jMenuItemSiguientesTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoTituloCliente"));
			
		this.jMenuItemAbrirOrderByTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoTituloCliente"));
			
		this.jMenuItemMostrarOcultarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoTituloCliente"));
			
		this.jMenuItemDetalleAbrirOrderByTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoTituloCliente"));
			
		this.jMenuItemDetalleMostarOcultarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoTituloCliente"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoTituloCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoTituloCliente"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoTituloCliente"));
			
		this.jMenuItemNuevoGuardarCambiosTipoTituloCliente.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoTituloCliente"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoTituloCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoTituloCliente"));

		this.jCheckBoxSeleccionadosTipoTituloCliente.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoTituloCliente"));
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoTituloCliente"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoTituloCliente.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoTituloCliente"));
			
		this.jComboBoxTiposAccionesTipoTituloCliente.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoTituloCliente"));
					
		this.jComboBoxTiposSeleccionarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoTituloCliente"));
			
		this.jTextFieldValorCampoGeneralTipoTituloCliente.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoTituloCliente"));		
		
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonidTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTituloClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonid_paisTipoTituloClienteUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoTituloClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonid_paisTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonnombreTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonsiglasTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoTituloClienteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdTipoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoTituloCliente"));

			this.jButtonBusquedaPorNombreTipoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoTituloCliente"));

			this.jButtonBusquedaPorSiglasTipoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasTipoTituloCliente"));

			this.jButtonFK_IdPaisTipoTituloCliente.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoTituloCliente"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoTituloCliente!=null) {
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTituloCliente"));
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTituloCliente"));
				this.jInternalFrameReporteDinamicoTipoTituloCliente.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTituloCliente"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoTituloCliente.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoTituloCliente"));				
			//this.jButtonGenerarReporteDinamicoTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoTituloCliente"));
			//this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoTituloCliente"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoTituloCliente!=null) {
				this.jInternalFrameImportacionTipoTituloCliente.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoTituloCliente"));
				this.jInternalFrameImportacionTipoTituloCliente.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoTituloCliente"));
				this.jInternalFrameImportacionTipoTituloCliente.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoTituloCliente"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoTituloCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoTituloCliente"));
			
			this.jButtonAbrirOrderByToolBarTipoTituloCliente.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoTituloCliente"));			
			
			if(this.jInternalFrameOrderByTipoTituloCliente!=null) {
				this.jInternalFrameOrderByTipoTituloCliente.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoTituloCliente"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoTituloCliente.jTabbedPaneRelacionesTipoTituloCliente.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoTituloCliente"));
		
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
            		closingInternalFrameTipoTituloCliente();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoTituloCliente.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoTituloCliente = (JInternalFrameBase)event.getSource();
	            	
	            TipoTituloClienteBeanSwingJInternalFrame jInternalFrameParent=(TipoTituloClienteBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoTituloCliente.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoTituloClienteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoTituloCliente.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoTituloClienteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoTituloCliente.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoTituloCliente.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTituloClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTituloClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTituloClienteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoTituloCliente";
		inputMap = this.jButtonNuevoTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTituloClienteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTituloClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTituloClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoTituloClienteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoTituloCliente";
		inputMap = this.jButtonNuevoRelacionesTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoTituloClienteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoTituloCliente";
		inputMap = this.jButtonModificarTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoTituloCliente";
		inputMap = this.jButtonActualizarTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoTituloCliente";
		inputMap = this.jButtonEliminarTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoTituloCliente";
		inputMap = this.jButtonCancelarTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoTituloCliente";
		inputMap = this.jButtonCerrarTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoTituloCliente";
		inputMap = this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonGuardarCambiosTipoTituloCliente.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoTituloClienteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoTituloCliente.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoTituloClienteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoTituloCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoTituloClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoTituloCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoTituloClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoTituloCliente.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoTituloClienteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonidTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"idTipoTituloClienteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonid_paisTipoTituloClienteUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoTituloClienteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonid_paisTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonnombreTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoTituloClienteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoTituloCliente.jButtonsiglasTipoTituloClienteBusqueda.addActionListener(new ButtonActionListener(this,"siglasTipoTituloClienteBusqueda"));
		
		
		this.jButtonBusquedaPorIdTipoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoTituloCliente"));

		this.jButtonBusquedaPorNombreTipoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoTituloCliente"));

		this.jButtonBusquedaPorSiglasTipoTituloCliente.addActionListener(new ButtonActionListener(this,"BusquedaPorSiglasTipoTituloCliente"));

		this.jButtonFK_IdPaisTipoTituloCliente.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoTituloCliente"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoTituloCliente.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoTituloClienteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoTituloClienteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoTituloCliente.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoTituloCliente(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
					tipotituloclienteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTituloCliente tipotituloclienteAux:tipotituloclientes) {
					tipotituloclienteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoTituloClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTituloCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
						tipotituloclienteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTituloCliente tipotituloclienteAux:tipotituloclientes) {
						tipotituloclienteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTituloCliente tipotituloclienteAux:tipotituloclientes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTituloCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTituloCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoTituloClienteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoTituloCliente(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoTituloCliente.getSelectedRows();
			
			TipoTituloCliente tipotituloclienteLocal=new TipoTituloCliente();
			
			//this.seleccionarTodosTipoTituloCliente(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipotituloclienteLocal =(TipoTituloCliente) this.tipotituloclienteLogic.getTipoTituloClientes().toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipotituloclienteLocal =(TipoTituloCliente) this.tipotituloclientes.toArray()[this.jTableDatosTipoTituloCliente.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipotituloclienteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
						tipotituloclienteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoTituloCliente tipotituloclienteAux:tipotituloclientes) {
						tipotituloclienteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoTituloCliente.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoTituloCliente.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoTituloCliente,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoTituloClienteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoTituloClienteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoTituloClienteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoTituloCliente(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoTituloCliente.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclienteLogic.getTipoTituloClientes()) {
				
						if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotituloclienteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tipotituloclienteAux.setsiglas(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTituloCliente tipotituloclienteAux:tipotituloclientes) {
					
						if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipotituloclienteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS)) {
							existe=true;
							tipotituloclienteAux.setsiglas(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoTituloClienteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoTituloCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoTituloCliente=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoTituloCliente.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoTituloCliente) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoTituloCliente(conSplash);
				
					this.generarReporteTipoTituloClientesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoTituloClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTituloClientesSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoTituloClientesSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTituloCliente();
				
				this.exportarTipoTituloClientesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoTituloClientes();
				//this.importarTipoTituloClientes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoTituloCliente();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoTituloClientesSeleccionados();
				//this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Titulo Cliente", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoTituloCliente();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoTituloCliente)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoTituloCliente(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoTituloCliente.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxTiposAccionesFormularioTipoTituloCliente.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoTituloCliente();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoTituloCliente(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoTituloClienteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoTituloCliente();
			
			if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
			TipoTituloCliente tipotitulocliente=new TipoTituloCliente();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoTituloCliente(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoTituloCliente.getSelectedItem();
			
			
			
			
			tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipotituloclientesSeleccionados.size()==1) {
				for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesSeleccionados) {
					tipotitulocliente=tipotituloclienteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoTituloCliente();
			
      		//this.finishProcessTipoTituloCliente(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoTituloClienteReturnGeneral() throws Exception {
		if(this.tipotituloclienteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipotituloclienteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipotituloclienteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipotituloclienteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipotituloclienteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipotituloclienteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoTituloCliente(false);
		}
		
		if(this.tipotituloclienteReturnGeneral.getConRetornoLista() || this.tipotituloclienteReturnGeneral.getConRetornoObjeto()) {
			if(this.tipotituloclienteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotituloclienteLogic.setTipoTituloClientes(this.tipotituloclienteReturnGeneral.getTipoTituloClientes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipotituloclienteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipotituloclienteLogic.setTipoTituloCliente(this.tipotituloclienteReturnGeneral.getTipoTituloCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoTituloCliente(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoTituloCliente() throws Exception {
		
		
	}
	
	public ArrayList<TipoTituloCliente> getTipoTituloClientesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoTituloCliente) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoTituloCliente tipotituloclienteAux:tipotituloclienteLogic.getTipoTituloClientes()) {
					if(tipotituloclienteAux.getIsSelected()) {
						tipotituloclientesSeleccionados.add(tipotituloclienteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoTituloCliente tipotituloclienteAux:this.tipotituloclientes) {
					if(tipotituloclienteAux.getIsSelected()) {
						tipotituloclientesSeleccionados.add(tipotituloclienteAux);				
					}
				}
			}
			
			if(tipotituloclientesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipotituloclientesSeleccionados.addAll(this.tipotituloclienteLogic.getTipoTituloClientes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipotituloclientesSeleccionados.addAll(this.tipotituloclientes);				
					}
				}
			}
		} else {
			tipotituloclientesSeleccionados.add(this.tipotitulocliente);
		}
		
		return tipotituloclientesSeleccionados;
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
	
	public void generarReporteTipoTituloClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoTituloClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoTituloClientesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTituloClientesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoTituloClientesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Titulo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoTituloClientesSeleccionados() throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoTituloClientesSeleccionados() throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoTituloClientesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoTituloClientesSeleccionados() throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoTituloCliente();
		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoTituloCliente();
		
		
		//this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados ,tipotituloclienteImplementable,tipotituloclienteImplementableHome);
	}
	
	public void mostrarImportacionTipoTituloClientes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoTituloCliente();
		
		this.abrirFrameImportacionTipoTituloCliente();		
		
			
		//this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados ,tipotituloclienteImplementable,tipotituloclienteImplementableHome);
	}
	
	public void importarTipoTituloClientes() throws Exception {		
	
	}
	
	public void exportarTipoTituloClientesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoTituloClientesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoTituloClientesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoTituloClientesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Titulo Cliente",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoTituloClientesSeleccionados() throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoTituloCliente(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoTituloCliente(tipotituloclienteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipotituloclienteAux.setsDetalleGeneralEntityReporte(tipotituloclienteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoTituloCliente(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoTituloClienteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTituloClienteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTituloClienteConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTituloClienteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoTituloClienteConstantesFunciones.LABEL_SIGLAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoTituloCliente(TipoTituloCliente tipotitulocliente,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipotitulocliente.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotitulocliente.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotitulocliente.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotitulocliente.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipotitulocliente.getsiglas();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoTituloClientesSeleccionados() throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoTituloClientes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoTituloCliente(row);				
				iRow++;
			}				
			
			for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoTituloCliente(tipotituloclienteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoTituloClientesSeleccionados() throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();		
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipotitulocliente.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipotituloclientes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipotitulocliente");
			//elementRoot.appendChild(element);
		
			for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesSeleccionados) {
				element = document.createElement("tipotitulocliente");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoTituloCliente(tipotituloclienteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Titulo Cliente",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoTituloCliente(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoTituloCliente(TipoTituloCliente tipotitulocliente,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipotitulocliente.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotitulocliente.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotitulocliente.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipotitulocliente.getsiglas());				
	}
	
	public void setFilaDatosExportarXmlTipoTituloCliente(TipoTituloCliente tipotitulocliente,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoTituloClienteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipotitulocliente.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoTituloClienteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipotitulocliente.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoTituloClienteConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipotitulocliente.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoTituloClienteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipotitulocliente.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementsiglas = document.createElement(TipoTituloClienteConstantesFunciones.SIGLAS);
		elementsiglas.appendChild(document.createTextNode(tipotitulocliente.getsiglas().trim()));
		element.appendChild(elementsiglas);
	}
	
	public void generarReporteGroupGenericoTipoTituloClientesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados=new ArrayList<TipoTituloCliente>();
		
		tipotituloclientesSeleccionados=this.getTipoTituloClientesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoTituloCliente(tipotituloclientesSeleccionados);
		
		this.generarReporteTipoTituloClientes("Todos",tipotituloclientesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoTituloCliente(ArrayList<TipoTituloCliente> tipotituloclientesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoTituloCliente tipotituloclienteAux:tipotituloclientesSeleccionados) {
				tipotituloclienteAux.setsDetalleGeneralEntityReporte(tipotituloclienteAux.toString());
			
				if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipotituloclienteAux.setsDescripcionGeneralEntityReporte1(tipotituloclienteAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipotituloclienteAux.setsDescripcionGeneralEntityReporte1(tipotituloclienteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoTituloClienteConstantesFunciones.LABEL_SIGLAS)) {
					existe=true;
					tipotituloclienteAux.setsDescripcionGeneralEntityReporte1(tipotituloclienteAux.getsiglas());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoTituloClienteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoTituloCliente(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoTituloCliente=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=true;
				this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=true;
			}
			
			this.isVisibilidadCeldaModificarTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=false;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
			this.isVisibilidadCeldaModificarTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=true;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
			this.isVisibilidadCeldaModificarTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=true;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=true;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
			this.isVisibilidadCeldaModificarTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=true;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=true;
			this.isVisibilidadCeldaModificarTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=false;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=false;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
			this.isVisibilidadCeldaModificarTipoTituloCliente=true;
			this.isVisibilidadCeldaActualizarTipoTituloCliente=false;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
			this.isVisibilidadCeldaCancelarTipoTituloCliente=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoTituloCliente=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoTituloClienteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoTituloCliente=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=true;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=true;
		} else {
			this.actualizarEstadoPanelsTipoTituloCliente(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoTituloCliente=false;
			//this.isVisibilidadCeldaVerFormTipoTituloCliente=false;
			this.isVisibilidadCeldaDuplicarTipoTituloCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipotituloclienteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoTituloCliente=false;
			this.isVisibilidadCeldaGuardarCambiosTipoTituloCliente=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			if(!tipotituloclienteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;												
			}
			
			this.jButtonCerrarTipoTituloCliente.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoTituloCliente=false;
		}
		
		if(!this.permiteMantenimiento(this.tipotitulocliente)) {
			this.isVisibilidadCeldaActualizarTipoTituloCliente=false;
			this.isVisibilidadCeldaEliminarTipoTituloCliente=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoTituloCliente() {
	}
	
	public void actualizarEstadoPanelsTipoTituloCliente(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoTituloCliente!=null) {
				this.jScrollPanelDatosEdicionTipoTituloCliente.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoTituloCliente!=null) {
				this.jScrollPanelDatosTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoTituloCliente!=null) {
				this.jPanelPaginacionTipoTituloCliente.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
					this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipotituloclienteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoTituloCliente!=null) {
				this.jTabbedPaneBusquedasTipoTituloCliente.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoTituloCliente!=null) {
				this.jPanelParametrosReportesTipoTituloCliente.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorId=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorId) {this.jTabbedPaneBusquedasTipoTituloCliente.remove(jPanelBusquedaPorIdTipoTituloCliente);}

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoTituloCliente.remove(jPanelBusquedaPorNombreTipoTituloCliente);}

			this.isVisibilidadBusquedaPorSiglas=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorSiglas) {this.jTabbedPaneBusquedasTipoTituloCliente.remove(jPanelBusquedaPorSiglasTipoTituloCliente);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoTituloCliente.remove(jPanelFK_IdPaisTipoTituloCliente);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoTituloClienteSessionBean tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
		
		if(this.tipotituloclienteSessionBean==null) {
			this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
		}
		
		this.tipotituloclienteSessionBean.setsUltimaBusquedaTipoTituloCliente(this.getsAccionBusqueda());
		this.tipotituloclienteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipotituloclienteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipotituloclienteSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipotituloclienteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
			tipotituloclienteSessionBean.setsiglas(this.getsiglasBusquedaPorSiglas());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipotituloclienteSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoTituloClienteSessionBean tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
		
		if(this.tipotituloclienteSessionBean==null) {
			this.tipotituloclienteSessionBean=new TipoTituloClienteSessionBean();
		}
		
		if(this.tipotituloclienteSessionBean.getsUltimaBusquedaTipoTituloCliente()!=null&&!this.tipotituloclienteSessionBean.getsUltimaBusquedaTipoTituloCliente().equals("")) {
			this.setsAccionBusqueda(tipotituloclienteSessionBean.getsUltimaBusquedaTipoTituloCliente());
			this.setiNumeroPaginacion(tipotituloclienteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipotituloclienteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipotituloclienteSessionBean.getid());
				tipotituloclienteSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipotituloclienteSessionBean.getnombre());
				tipotituloclienteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorSiglas")) {
				this.setsiglasBusquedaPorSiglas(tipotituloclienteSessionBean.getsiglas());
				tipotituloclienteSessionBean.setsiglas("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipotituloclienteSessionBean.getid_pais());
				tipotituloclienteSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipotituloclienteSessionBean.setsUltimaBusquedaTipoTituloCliente("");
		this.tipotituloclienteSessionBean.setiNumeroPaginacion(TipoTituloClienteConstantesFunciones.INUMEROPAGINACION);
		this.tipotituloclienteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoTituloCliente(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoTituloCliente() {
		this.updateBorderResaltarBusquedasFormularioTipoTituloCliente();
		this.updateVisibilidadBusquedasFormularioTipoTituloCliente();
		this.updateHabilitarBusquedasFormularioTipoTituloCliente();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoTituloCliente() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoTituloCliente.getComponents().length>0) {
	

		if(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorIdTipoTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorIdTipoTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorIdTipoTituloCliente);
			}
		}

		if(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorNombreTipoTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorNombreTipoTituloCliente);
			}
		}

		if(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorSiglasTipoTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTipoTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorSiglasTipoTituloCliente);
			}
		}

		if(this.tipotituloclienteConstantesFunciones.resaltarFK_IdPaisTipoTituloCliente!=null) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelFK_IdPaisTipoTituloCliente);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarFK_IdPaisTipoTituloCliente);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoTituloCliente() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoTituloCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorIdTipoTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotituloclienteConstantesFunciones.mostrarBusquedaPorIdTipoTituloCliente);
			if(!this.tipotituloclienteConstantesFunciones.mostrarBusquedaPorIdTipoTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTipoTituloCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotituloclienteConstantesFunciones.mostrarBusquedaPorNombreTipoTituloCliente);
			if(!this.tipotituloclienteConstantesFunciones.mostrarBusquedaPorNombreTipoTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTipoTituloCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTipoTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotituloclienteConstantesFunciones.mostrarBusquedaPorSiglasTipoTituloCliente);
			if(!this.tipotituloclienteConstantesFunciones.mostrarBusquedaPorSiglasTipoTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTipoTituloCliente.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelFK_IdPaisTipoTituloCliente);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipotituloclienteConstantesFunciones.mostrarFK_IdPaisTipoTituloCliente);
			if(!this.tipotituloclienteConstantesFunciones.mostrarFK_IdPaisTipoTituloCliente && index>-1) {
				this.jTabbedPaneBusquedasTipoTituloCliente.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoTituloCliente() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoTituloCliente.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorIdTipoTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotituloclienteConstantesFunciones.activarBusquedaPorIdTipoTituloCliente);
				this.jTabbedPaneBusquedasTipoTituloCliente.setEnabledAt(index,this.tipotituloclienteConstantesFunciones.activarBusquedaPorIdTipoTituloCliente);
			}

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotituloclienteConstantesFunciones.activarBusquedaPorNombreTipoTituloCliente);
				this.jTabbedPaneBusquedasTipoTituloCliente.setEnabledAt(index,this.tipotituloclienteConstantesFunciones.activarBusquedaPorNombreTipoTituloCliente);
			}

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTipoTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotituloclienteConstantesFunciones.activarBusquedaPorSiglasTipoTituloCliente);
				this.jTabbedPaneBusquedasTipoTituloCliente.setEnabledAt(index,this.tipotituloclienteConstantesFunciones.activarBusquedaPorSiglasTipoTituloCliente);
			}

			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelFK_IdPaisTipoTituloCliente);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipotituloclienteConstantesFunciones.activarFK_IdPaisTipoTituloCliente);
				this.jTabbedPaneBusquedasTipoTituloCliente.setEnabledAt(index,this.tipotituloclienteConstantesFunciones.activarFK_IdPaisTipoTituloCliente);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoTituloCliente(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorIdTipoTituloCliente);

			this.jTabbedPaneBusquedasTipoTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);

			this.tipotituloclienteConstantesFunciones.setResaltarBusquedaPorIdTipoTituloCliente(resaltar);

			jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorIdTipoTituloCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorNombreTipoTituloCliente);

			this.jTabbedPaneBusquedasTipoTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);

			this.tipotituloclienteConstantesFunciones.setResaltarBusquedaPorNombreTipoTituloCliente(resaltar);

			jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorNombreTipoTituloCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorSiglas")) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelBusquedaPorSiglasTipoTituloCliente);

			this.jTabbedPaneBusquedasTipoTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);

			this.tipotituloclienteConstantesFunciones.setResaltarBusquedaPorSiglasTipoTituloCliente(resaltar);

			jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarBusquedaPorSiglasTipoTituloCliente);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoTituloCliente.indexOfComponent(this.jPanelFK_IdPaisTipoTituloCliente);

			this.jTabbedPaneBusquedasTipoTituloCliente.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoTituloCliente.getComponent(index);

			this.tipotituloclienteConstantesFunciones.setResaltarFK_IdPaisTipoTituloCliente(resaltar);

			jPanel.setBorder(this.tipotituloclienteConstantesFunciones.resaltarFK_IdPaisTipoTituloCliente);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoTituloCliente.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoTituloCliente() throws Exception {

		if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoTituloCliente();
		this.updateVisibilidadResaltarControlesFormularioTipoTituloCliente();
		this.updateHabilitarResaltarControlesFormularioTipoTituloCliente();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoTituloCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipotituloclienteConstantesFunciones.resaltaridTipoTituloCliente!=null && this.jInternalFrameDetalleFormTipoTituloCliente!=null) {this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setBorder(this.tipotituloclienteConstantesFunciones.resaltaridTipoTituloCliente);}
		if(this.tipotituloclienteConstantesFunciones.resaltarid_paisTipoTituloCliente!=null && this.jInternalFrameDetalleFormTipoTituloCliente!=null) {this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setBorder(this.tipotituloclienteConstantesFunciones.resaltarid_paisTipoTituloCliente);}
		if(this.tipotituloclienteConstantesFunciones.resaltarnombreTipoTituloCliente!=null && this.jInternalFrameDetalleFormTipoTituloCliente!=null) {this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setBorder(this.tipotituloclienteConstantesFunciones.resaltarnombreTipoTituloCliente);}
		if(this.tipotituloclienteConstantesFunciones.resaltarsiglasTipoTituloCliente!=null && this.jInternalFrameDetalleFormTipoTituloCliente!=null) {this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setBorder(this.tipotituloclienteConstantesFunciones.resaltarsiglasTipoTituloCliente);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoTituloCliente() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
	
		//this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostraridTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jPanelidTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostraridTipoTituloCliente);
		//this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostrarid_paisTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jPanelid_paisTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostrarid_paisTipoTituloCliente);
		//this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostrarnombreTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jPanelnombreTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostrarnombreTipoTituloCliente);
		//this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostrarsiglasTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jPanelsiglasTipoTituloCliente.setVisible(this.tipotituloclienteConstantesFunciones.mostrarsiglasTipoTituloCliente);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoTituloCliente() throws Exception {
		if(this.jInternalFrameDetalleFormTipoTituloCliente==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoTituloCliente!=null) {
	
		this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldidTipoTituloCliente.setEnabled(this.tipotituloclienteConstantesFunciones.activaridTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jComboBoxid_paisTipoTituloCliente.setEnabled(this.tipotituloclienteConstantesFunciones.activarid_paisTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jTextAreanombreTipoTituloCliente.setEnabled(this.tipotituloclienteConstantesFunciones.activarnombreTipoTituloCliente);
		this.jInternalFrameDetalleFormTipoTituloCliente.jTextFieldsiglasTipoTituloCliente.setEnabled(this.tipotituloclienteConstantesFunciones.activarsiglasTipoTituloCliente);
		}
	}
	
		
}