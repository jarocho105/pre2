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
package com.bydan.erp.inventario.presentation.swing.jinternalframes;




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

import com.bydan.erp.inventario.util.TipoPrioridadPedidoConstantesFunciones;
import com.bydan.erp.inventario.util.TipoPrioridadPedidoParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoPrioridadPedidoParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoPrioridadPedidoBean;
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

import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.inventario.resources.reportes.AuxiliarReportes;


import com.bydan.erp.inventario.util.*;
import com.bydan.erp.inventario.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.inventario.business.entity.*;
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


import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;

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
public class TipoPrioridadPedidoBeanSwingJInternalFrame extends TipoPrioridadPedidoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoPrioridadPedidoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoPrioridadPedido> tipoprioridadpedidoValidator = new ClassValidator<TipoPrioridadPedido>(TipoPrioridadPedido.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoPrioridadPedido tipoprioridadpedido;	
	public TipoPrioridadPedido tipoprioridadpedidoAux;
	public TipoPrioridadPedido tipoprioridadpedidoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoPrioridadPedido tipoprioridadpedidoTotales;
	public Long idTipoPrioridadPedidoActual;
	public Long iIdNuevoTipoPrioridadPedido=0L;
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
	
	public Boolean isPermisoTodoTipoPrioridadPedido;
	public Boolean isPermisoNuevoTipoPrioridadPedido;
	public Boolean isPermisoActualizarTipoPrioridadPedido;
	public Boolean isPermisoActualizarOriginalTipoPrioridadPedido;
	public Boolean isPermisoEliminarTipoPrioridadPedido;
	public Boolean isPermisoGuardarCambiosTipoPrioridadPedido;
	public Boolean isPermisoConsultaTipoPrioridadPedido;
	public Boolean isPermisoBusquedaTipoPrioridadPedido;
	public Boolean isPermisoReporteTipoPrioridadPedido;
	public Boolean isPermisoPaginacionMedioTipoPrioridadPedido;
	public Boolean isPermisoPaginacionAltoTipoPrioridadPedido;
	public Boolean isPermisoPaginacionTodoTipoPrioridadPedido;
	public Boolean isPermisoCopiarTipoPrioridadPedido;
	public Boolean isPermisoVerFormTipoPrioridadPedido;
	public Boolean isPermisoDuplicarTipoPrioridadPedido;
	public Boolean isPermisoOrdenTipoPrioridadPedido;
	
	
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
	
	public TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoReturnGeneral;
	public TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoPrioridadPedido=false;
	public Boolean esParaAccionDesdeFormularioTipoPrioridadPedido=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoPrioridadPedidoLogic tipoprioridadpedidoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoPrioridadPedido tipoprioridadpedidoBean;
	public TipoPrioridadPedidoConstantesFunciones tipoprioridadpedidoConstantesFunciones;
	//public TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoPrioridadPedido> tipoprioridadpedidos;	
	//public List<TipoPrioridadPedido> tipoprioridadpedidosEliminados;
	//public List<TipoPrioridadPedido> tipoprioridadpedidosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaDuplicarTipoPrioridadPedido=true;
	public Boolean isVisibilidadCeldaCopiarTipoPrioridadPedido=true;
	public Boolean isVisibilidadCeldaVerFormTipoPrioridadPedido=true;
	public Boolean isVisibilidadCeldaOrdenTipoPrioridadPedido=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaModificarTipoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaCancelarTipoPrioridadPedido=false;
	public Boolean isVisibilidadCeldaGuardarTipoPrioridadPedido=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoPrioridadPedido() {
		return this.iIdNuevoTipoPrioridadPedido;
	}

	public void setiIdNuevoTipoPrioridadPedido(Long iIdNuevoTipoPrioridadPedido) {
		this.iIdNuevoTipoPrioridadPedido = iIdNuevoTipoPrioridadPedido;
	}
	
	public Long getidTipoPrioridadPedidoActual() {
		return this.idTipoPrioridadPedidoActual;
	}

	public void setidTipoPrioridadPedidoActual(Long idTipoPrioridadPedidoActual) {
		this.idTipoPrioridadPedidoActual = idTipoPrioridadPedidoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoPrioridadPedido gettipoprioridadpedido() {
		return this.tipoprioridadpedido;
	}

	public void settipoprioridadpedido(TipoPrioridadPedido tipoprioridadpedido) {
		this.tipoprioridadpedido = tipoprioridadpedido;
	}
	
	public TipoPrioridadPedido gettipoprioridadpedidoAux() {
		return this.tipoprioridadpedidoAux;
	}

	public void settipoprioridadpedidoAux(TipoPrioridadPedido tipoprioridadpedidoAux) {
		this.tipoprioridadpedidoAux = tipoprioridadpedidoAux;
	}				
	
	public TipoPrioridadPedido gettipoprioridadpedidoAnterior() {
		return this.tipoprioridadpedidoAnterior;
	}

	public void settipoprioridadpedidoAnterior(TipoPrioridadPedido tipoprioridadpedidoAnterior) {
		this.tipoprioridadpedidoAnterior = tipoprioridadpedidoAnterior;
	}	
	
	public TipoPrioridadPedido gettipoprioridadpedidoTotales() {
		return this.tipoprioridadpedidoTotales;
	}

	public void settipoprioridadpedidoTotales(TipoPrioridadPedido tipoprioridadpedidoTotales) {
		this.tipoprioridadpedidoTotales = tipoprioridadpedidoTotales;
	}	
	
	public TipoPrioridadPedido gettipoprioridadpedidoBean() {
		return this.tipoprioridadpedidoBean;
	}

	public void settipoprioridadpedidoBean(TipoPrioridadPedido tipoprioridadpedidoBean) {
		this.tipoprioridadpedidoBean = tipoprioridadpedidoBean;
	}	
	
	public TipoPrioridadPedidoParameterReturnGeneral gettipoprioridadpedidoReturnGeneral() {
		return this.tipoprioridadpedidoReturnGeneral;
	}

	public void settipoprioridadpedidoReturnGeneral(TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoReturnGeneral) {
		this.tipoprioridadpedidoReturnGeneral = tipoprioridadpedidoReturnGeneral;
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
	
	
	public TipoPrioridadPedidoLogic getTipoPrioridadPedidoLogic()	{		
		return tipoprioridadpedidoLogic;
	}

	public void setTipoPrioridadPedidoLogic(TipoPrioridadPedidoLogic tipoprioridadpedidoLogic) {
		this.tipoprioridadpedidoLogic = tipoprioridadpedidoLogic;
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
	
	public Boolean getIsEsNuevoTipoPrioridadPedido() {
		return isEsNuevoTipoPrioridadPedido;
	}

	public void setIsEsNuevoTipoPrioridadPedido(Boolean isEsNuevoTipoPrioridadPedido) {
		this.isEsNuevoTipoPrioridadPedido = isEsNuevoTipoPrioridadPedido;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoPrioridadPedido() {
		return esParaAccionDesdeFormularioTipoPrioridadPedido;
	}
	
	public void setEsParaAccionDesdeFormularioTipoPrioridadPedido(Boolean esParaAccionDesdeFormularioTipoPrioridadPedido) {
		this.esParaAccionDesdeFormularioTipoPrioridadPedido = esParaAccionDesdeFormularioTipoPrioridadPedido;
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

			if(this.tipoprioridadpedidoSessionBean==null) {
				this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
			}

			if(!this.tipoprioridadpedidoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipoprioridadpedidoSessionBean.getlidPaisActual());
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

					if(this.tipoprioridadpedido!=null) {
						this.tipoprioridadpedido.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
						this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoPrioridadPedido.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
						if(this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoPrioridadPedido!=null) {
						jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoPrioridadPedido!=null) {
							//jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoPrioridadPedidoGenerico)throws Exception
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
				jComboBoxid_paisTipoPrioridadPedidoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoPrioridadPedidoGenerico!=null && jComboBoxid_paisTipoPrioridadPedidoGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoPrioridadPedidoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoPrioridadPedido tipoprioridadpedido,JComboBox jComboBoxid_paisTipoPrioridadPedidoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoPrioridadPedidoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoPrioridadPedidoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipoprioridadpedido.setid_pais(paisAux.getId());
				tipoprioridadpedido.setpais_descripcion(TipoPrioridadPedidoConstantesFunciones.getPaisDescripcion(paisAux));
				tipoprioridadpedido.setPais(paisAux);			}
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

					if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { 
							this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { 
					}

					if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.addItem(pais);
							}
						}

						if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
							this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
							this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoPrioridadPedido() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoPrioridadPedidoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrioridadPedido(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoPrioridadPedidoConstantesFunciones.refrescarForeignKeysDescripcionesTipoPrioridadPedido(this.tipoprioridadpedidos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoprioridadpedidoLogic.setTipoPrioridadPedidos(this.tipoprioridadpedidos);
			tipoprioridadpedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoPrioridadPedidoParameterReturnGeneral getTipoPrioridadPedidoParameterGeneral() {
		return this.tipoprioridadpedidoParameterGeneral;
	}
	
	public void setTipoPrioridadPedidoParameterGeneral(TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoParameterGeneral) {
		this.tipoprioridadpedidoParameterGeneral = tipoprioridadpedidoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoPrioridadPedido() {
		return isPermisoTodoTipoPrioridadPedido;
	}

	public void setIsPermisoTodoTipoPrioridadPedido(Boolean isPermisoTodoTipoPrioridadPedido) {
		this.isPermisoTodoTipoPrioridadPedido = isPermisoTodoTipoPrioridadPedido;
	}

	public Boolean getIsPermisoNuevoTipoPrioridadPedido() {
		return isPermisoNuevoTipoPrioridadPedido;
	}

	public void setIsPermisoNuevoTipoPrioridadPedido(Boolean isPermisoNuevoTipoPrioridadPedido) {
		this.isPermisoNuevoTipoPrioridadPedido = isPermisoNuevoTipoPrioridadPedido;
	}

	public Boolean getIsPermisoActualizarTipoPrioridadPedido() {
		return isPermisoActualizarTipoPrioridadPedido;
	}

	public void setIsPermisoActualizarTipoPrioridadPedido(Boolean isPermisoActualizarTipoPrioridadPedido) {
		this.isPermisoActualizarTipoPrioridadPedido = isPermisoActualizarTipoPrioridadPedido;
	}

	public Boolean getIsPermisoEliminarTipoPrioridadPedido() {
		return isPermisoEliminarTipoPrioridadPedido;
	}

	public void setIsPermisoEliminarTipoPrioridadPedido(Boolean isPermisoEliminarTipoPrioridadPedido) {
		this.isPermisoEliminarTipoPrioridadPedido = isPermisoEliminarTipoPrioridadPedido;
	}

	public Boolean getIsPermisoGuardarCambiosTipoPrioridadPedido() {
		return isPermisoGuardarCambiosTipoPrioridadPedido;
	}

	public void setIsPermisoGuardarCambiosTipoPrioridadPedido(Boolean isPermisoGuardarCambiosTipoPrioridadPedido) {
		this.isPermisoGuardarCambiosTipoPrioridadPedido = isPermisoGuardarCambiosTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoConsultaTipoPrioridadPedido() {
		return isPermisoConsultaTipoPrioridadPedido;
	}

	public void setIsPermisoConsultaTipoPrioridadPedido(Boolean isPermisoConsultaTipoPrioridadPedido) {
		this.isPermisoConsultaTipoPrioridadPedido = isPermisoConsultaTipoPrioridadPedido;
	}

	public Boolean getIsPermisoBusquedaTipoPrioridadPedido() {
		return isPermisoBusquedaTipoPrioridadPedido;
	}

	public void setIsPermisoBusquedaTipoPrioridadPedido(Boolean isPermisoBusquedaTipoPrioridadPedido) {
		this.isPermisoBusquedaTipoPrioridadPedido = isPermisoBusquedaTipoPrioridadPedido;
	}

	public Boolean getIsPermisoReporteTipoPrioridadPedido() {
		return isPermisoReporteTipoPrioridadPedido;
	}

	public void setIsPermisoReporteTipoPrioridadPedido(Boolean isPermisoReporteTipoPrioridadPedido) {
		this.isPermisoReporteTipoPrioridadPedido = isPermisoReporteTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoPrioridadPedido() {
		return isPermisoPaginacionMedioTipoPrioridadPedido;
	}

	public void setIsPermisoPaginacionMedioTipoPrioridadPedido(Boolean isPermisoPaginacionMedioTipoPrioridadPedido) {
		this.isPermisoPaginacionMedioTipoPrioridadPedido = isPermisoPaginacionMedioTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoPrioridadPedido() {
		return isPermisoPaginacionTodoTipoPrioridadPedido;
	}

	public void setIsPermisoPaginacionTodoTipoPrioridadPedido(Boolean isPermisoPaginacionTodoTipoPrioridadPedido) {
		this.isPermisoPaginacionTodoTipoPrioridadPedido = isPermisoPaginacionTodoTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoPrioridadPedido() {
		return isPermisoPaginacionAltoTipoPrioridadPedido;
	}

	public void setIsPermisoPaginacionAltoTipoPrioridadPedido(Boolean isPermisoPaginacionAltoTipoPrioridadPedido) {
		this.isPermisoPaginacionAltoTipoPrioridadPedido = isPermisoPaginacionAltoTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoCopiarTipoPrioridadPedido() {
		return isPermisoCopiarTipoPrioridadPedido;
	}

	public void setIsPermisoCopiarTipoPrioridadPedido(Boolean isPermisoCopiarTipoPrioridadPedido) {
		this.isPermisoCopiarTipoPrioridadPedido = isPermisoCopiarTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoVerFormTipoPrioridadPedido() {
		return isPermisoVerFormTipoPrioridadPedido;
	}

	public void setIsPermisoVerFormTipoPrioridadPedido(Boolean isPermisoVerFormTipoPrioridadPedido) {
		this.isPermisoVerFormTipoPrioridadPedido = isPermisoVerFormTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoDuplicarTipoPrioridadPedido() {
		return isPermisoDuplicarTipoPrioridadPedido;
	}

	public void setIsPermisoDuplicarTipoPrioridadPedido(Boolean isPermisoDuplicarTipoPrioridadPedido) {
		this.isPermisoDuplicarTipoPrioridadPedido = isPermisoDuplicarTipoPrioridadPedido;
	}
	
	public Boolean getIsPermisoOrdenTipoPrioridadPedido() {
		return isPermisoOrdenTipoPrioridadPedido;
	}

	public void setIsPermisoOrdenTipoPrioridadPedido(Boolean isPermisoOrdenTipoPrioridadPedido) {
		this.isPermisoOrdenTipoPrioridadPedido = isPermisoOrdenTipoPrioridadPedido;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoPrioridadPedido() {
		return isVisibilidadCeldaNuevoTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaNuevoTipoPrioridadPedido(Boolean isVisibilidadCeldaNuevoTipoPrioridadPedido) {
		this.isVisibilidadCeldaNuevoTipoPrioridadPedido = isVisibilidadCeldaNuevoTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoPrioridadPedido() {
		return isVisibilidadCeldaDuplicarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaDuplicarTipoPrioridadPedido(Boolean isVisibilidadCeldaDuplicarTipoPrioridadPedido) {
		this.isVisibilidadCeldaDuplicarTipoPrioridadPedido = isVisibilidadCeldaDuplicarTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoPrioridadPedido() {
		return isVisibilidadCeldaCopiarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaCopiarTipoPrioridadPedido(Boolean isVisibilidadCeldaCopiarTipoPrioridadPedido) {
		this.isVisibilidadCeldaCopiarTipoPrioridadPedido = isVisibilidadCeldaCopiarTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoPrioridadPedido() {
		return isVisibilidadCeldaVerFormTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaVerFormTipoPrioridadPedido(Boolean isVisibilidadCeldaVerFormTipoPrioridadPedido) {
		this.isVisibilidadCeldaVerFormTipoPrioridadPedido = isVisibilidadCeldaVerFormTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoPrioridadPedido() {
		return isVisibilidadCeldaOrdenTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaOrdenTipoPrioridadPedido(Boolean isVisibilidadCeldaOrdenTipoPrioridadPedido) {
		this.isVisibilidadCeldaOrdenTipoPrioridadPedido = isVisibilidadCeldaOrdenTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido() {
		return isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido(Boolean isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido) {
		this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido = isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoPrioridadPedido() {
		return isVisibilidadCeldaModificarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaModificarTipoPrioridadPedido(Boolean isVisibilidadCeldaModificarTipoPrioridadPedido) {
		this.isVisibilidadCeldaModificarTipoPrioridadPedido = isVisibilidadCeldaModificarTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoPrioridadPedido() {
		return isVisibilidadCeldaActualizarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaActualizarTipoPrioridadPedido(Boolean isVisibilidadCeldaActualizarTipoPrioridadPedido) {
		this.isVisibilidadCeldaActualizarTipoPrioridadPedido = isVisibilidadCeldaActualizarTipoPrioridadPedido;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoPrioridadPedido() {
		return isVisibilidadCeldaEliminarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaEliminarTipoPrioridadPedido(Boolean isVisibilidadCeldaEliminarTipoPrioridadPedido) {
		this.isVisibilidadCeldaEliminarTipoPrioridadPedido = isVisibilidadCeldaEliminarTipoPrioridadPedido;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoPrioridadPedido() {
		return isVisibilidadCeldaCancelarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaCancelarTipoPrioridadPedido(Boolean isVisibilidadCeldaCancelarTipoPrioridadPedido) {
		this.isVisibilidadCeldaCancelarTipoPrioridadPedido = isVisibilidadCeldaCancelarTipoPrioridadPedido;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoPrioridadPedido() {
		return isVisibilidadCeldaGuardarTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaGuardarTipoPrioridadPedido(Boolean isVisibilidadCeldaGuardarTipoPrioridadPedido) {
		this.isVisibilidadCeldaGuardarTipoPrioridadPedido = isVisibilidadCeldaGuardarTipoPrioridadPedido;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoPrioridadPedido() {
		return isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoPrioridadPedido(Boolean isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido) {
		this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido = isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido;
	}
		
	public TipoPrioridadPedidoSessionBean gettipoprioridadpedidoSessionBean() {
		return this.tipoprioridadpedidoSessionBean;
	}
	
	public void settipoprioridadpedidoSessionBean(TipoPrioridadPedidoSessionBean tipoprioridadpedidoSessionBean) {
		this.tipoprioridadpedidoSessionBean=tipoprioridadpedidoSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipoprioridadpedido,null);
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
	
	public void bugActualizarReferenciaActual(TipoPrioridadPedido tipoprioridadpedido,TipoPrioridadPedido tipoprioridadpedidoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoPrioridadPedido(tipoprioridadpedido);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoprioridadpedidoAux.setId(tipoprioridadpedido.getId());
		tipoprioridadpedidoAux.setVersionRow(tipoprioridadpedido.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoPrioridadPedido();
		
			int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoprioridadpedidoValidator.getInvalidValues(this.tipoprioridadpedido);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoprioridadpedidoLogic.setDatosCliente(datosCliente);
			tipoprioridadpedidoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoprioridadpedidoAux=new  TipoPrioridadPedido();
				
				tipoprioridadpedidoAux.setIsNew(true);
				tipoprioridadpedidoAux.setIsChanged(true);
				
				tipoprioridadpedidoAux.setTipoPrioridadPedidoOriginal(this.tipoprioridadpedido);
				
				tipoprioridadpedidoAux.setId(this.tipoprioridadpedido.getId());	
				tipoprioridadpedidoAux.setVersionRow(this.tipoprioridadpedido.getVersionRow());	
				tipoprioridadpedidoAux.setid_pais(this.tipoprioridadpedido.getid_pais());	
				tipoprioridadpedidoAux.setnombre(this.tipoprioridadpedido.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoLogic.saveTipoPrioridadPedidos();//WithConnection
						//tipoprioridadpedidoLogic.getSetVersionRowTipoPrioridadPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprioridadpedido,tipoprioridadpedidoAux);
					
					this.refrescarForeignKeysDescripcionesTipoPrioridadPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoprioridadpedidoAux=new  TipoPrioridadPedido();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado() && this.tipoprioridadpedido.getId()>=0)) {
						
					tipoprioridadpedidoAux.setIsNew(false);
				}
				
				tipoprioridadpedidoAux.setIsDeleted(false);
			
				tipoprioridadpedidoAux.setId(this.tipoprioridadpedido.getId());	
				tipoprioridadpedidoAux.setVersionRow(this.tipoprioridadpedido.getVersionRow());	
				tipoprioridadpedidoAux.setid_pais(this.tipoprioridadpedido.getid_pais());	
				tipoprioridadpedidoAux.setnombre(this.tipoprioridadpedido.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoLogic.saveTipoPrioridadPedidos();//WithConnection
						//tipoprioridadpedidoLogic.getSetVersionRowTipoPrioridadPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoprioridadpedido,tipoprioridadpedidoAux);
					
					this.refrescarForeignKeysDescripcionesTipoPrioridadPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoprioridadpedidoAux=new  TipoPrioridadPedido();
				
				tipoprioridadpedidoAux.setIsNew(false);
				tipoprioridadpedidoAux.setIsChanged(false);
				
				tipoprioridadpedidoAux.setIsDeleted(true);
				
				tipoprioridadpedidoAux.setId(this.tipoprioridadpedido.getId());	
				tipoprioridadpedidoAux.setVersionRow(this.tipoprioridadpedido.getVersionRow());	
				tipoprioridadpedidoAux.setid_pais(this.tipoprioridadpedido.getid_pais());	
				tipoprioridadpedidoAux.setnombre(this.tipoprioridadpedido.getnombre());	
				
				if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoprioridadpedidoAux.getId()>=0) {	
						this.tipoprioridadpedidosEliminados.add(tipoprioridadpedidoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoLogic.saveTipoPrioridadPedidos();//WithConnection
						//tipoprioridadpedidoLogic.getSetVersionRowTipoPrioridadPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoprioridadpedidoAux,tipoprioridadpedidos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().addAll(this.tipoprioridadpedidosEliminados);
					
					tipoprioridadpedidoLogic.saveTipoPrioridadPedidos();//WithConnection
					//tipoprioridadpedidoLogic.getSetVersionRowTipoPrioridadPedidos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoPrioridadPedido();
				
				this.tipoprioridadpedidosEliminados= new ArrayList<TipoPrioridadPedido>();		
			}
			
			if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Prioridad Pedido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoprioridadpedido=tipoprioridadpedidoAux;
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
      		//this.finishProcessTipoPrioridadPedido();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoPrioridadPedido tipoprioridadpedidoLocal) throws Exception {
		
		if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoPrioridadPedido tipoprioridadpedidoLocal) throws Exception {	
		if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipoprioridadpedidoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoPrioridadPedidoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoprioridadpedidoValidator.getInvalidValues(this.tipoprioridadpedido);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoPrioridadPedido tipoprioridadpedido,List<TipoPrioridadPedido> tipoprioridadpedidos) throws Exception {
		try	{		
			TipoPrioridadPedidoConstantesFunciones.actualizarLista(tipoprioridadpedido,tipoprioridadpedidos,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoPrioridadPedido tipoprioridadpedido,List<TipoPrioridadPedido> tipoprioridadpedidos) throws Exception {
		try	{			
			TipoPrioridadPedidoConstantesFunciones.actualizarSelectedLista(tipoprioridadpedido,tipoprioridadpedidos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoPrioridadPedido> tipoprioridadpedidosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoprioridadpedidosLocal=this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoprioridadpedidosLocal=this.tipoprioridadpedidos;
			}
			//ARCHITECTURE
		
			for(TipoPrioridadPedido tipoprioridadpedidoLocal:tipoprioridadpedidosLocal) {
				if(this.permiteMantenimiento(tipoprioridadpedidoLocal) && tipoprioridadpedidoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoPrioridadPedidoConstantesFunciones.getTipoPrioridadPedidoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoPrioridadPedidoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelid_paisTipoPrioridadPedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoPrioridadPedidoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelnombreTipoPrioridadPedido,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelid_paisTipoPrioridadPedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelnombreTipoPrioridadPedido,"");
		
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
		this.iIdNuevoTipoPrioridadPedido--;	
		
		
		this.tipoprioridadpedidoAux=new TipoPrioridadPedido();
		
		this.tipoprioridadpedidoAux.setId(this.iIdNuevoTipoPrioridadPedido);
		this.tipoprioridadpedidoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().add(this.tipoprioridadpedidoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoprioridadpedidos.add(this.tipoprioridadpedidoAux);
		}
		//ARCHITECTURE
		
		this.tipoprioridadpedido=this.tipoprioridadpedidoAux;
		
		if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedido);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadPedido(this.tipoprioridadpedido);
		}
				
		//this.setDefaultControlesTipoPrioridadPedido();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoPrioridadPedido();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoPrioridadPedido();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrioridadPedido();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedidoBean,this.tipoprioridadpedido,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
			classes=TipoPrioridadPedidoConstantesFunciones.getClassesRelationshipsOfTipoPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoprioridadpedidoReturnGeneral=tipoprioridadpedidoLogic.procesarEventosTipoPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos(),this.tipoprioridadpedido,this.tipoprioridadpedidoParameterGeneral,this.isEsNuevoTipoPrioridadPedido,classes);//this.tipoprioridadpedidoLogic.getTipoPrioridadPedido()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral,this.tipoprioridadpedidoBean,false);
		
		if(this.tipoprioridadpedidoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido());
		}
		
		if(this.tipoprioridadpedidoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido(),classes);//this.tipoprioridadpedidoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoPrioridadPedido();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoPrioridadPedido();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
						
			if(tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrioridadPedido();
			}
			
			this.actualizarVisualTableDatosTipoPrioridadPedido();
			
			this.jTableDatosTipoPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadPedido(), this.getIndiceNuevoTipoPrioridadPedido());
			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
						
			this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoPrioridadPedido(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setEnabled(isHabilitar && this.tipoprioridadpedidoConstantesFunciones.activarnombreTipoPrioridadPedido);	
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setEnabled(isHabilitar && this.tipoprioridadpedidoConstantesFunciones.activarid_paisTipoPrioridadPedido);
	};
	
	public void setDefaultControlesTipoPrioridadPedido() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoPrioridadPedido(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoprioridadpedidoSessionBean.setConGuardarRelaciones(true);			
			this.tipoprioridadpedidoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.setVisible(true);
			
					
		} else {
			//this.tipoprioridadpedidoSessionBean.setConGuardarRelaciones(false);			
			this.tipoprioridadpedidoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoPrioridadPedido() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
				if(tipoprioridadpedidoAux.getId().equals(this.iIdNuevoTipoPrioridadPedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidos) {
				if(tipoprioridadpedidoAux.getId().equals(this.iIdNuevoTipoPrioridadPedido)) {
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
	
	public int getIndiceActualTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
				if(tipoprioridadpedidoAux.getId().equals(tipoprioridadpedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidos) {
				if(tipoprioridadpedidoAux.getId().equals(tipoprioridadpedido.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedidoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
				if(tipoprioridadpedidoAux.getTipoPrioridadPedidoOriginal().getId().equals(tipoprioridadpedidoOriginal.getId())) {
					existe=true;
					tipoprioridadpedidoOriginal.setId(tipoprioridadpedidoAux.getId());
					tipoprioridadpedidoOriginal.setVersionRow(tipoprioridadpedidoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidos) {
				if(tipoprioridadpedidoAux.getTipoPrioridadPedidoOriginal().getId().equals(tipoprioridadpedidoOriginal.getId())) {
					existe=true;
					tipoprioridadpedidoOriginal.setId(tipoprioridadpedidoAux.getId());
					tipoprioridadpedidoOriginal.setVersionRow(tipoprioridadpedidoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoPrioridadPedido(Boolean esParaCancelar) throws Exception {
		tipoprioridadpedidosAux=new ArrayList<TipoPrioridadPedido>();
		tipoprioridadpedidoAux=new TipoPrioridadPedido();
		
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
					if(tipoprioridadpedidoAux.getId()<0) {
						tipoprioridadpedidosAux.add(tipoprioridadpedidoAux);
					}		
				}
				this.iIdNuevoTipoPrioridadPedido=0L;
				this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().removeAll(tipoprioridadpedidosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidos) {
					if(tipoprioridadpedidoAux.getId()<0) {
						tipoprioridadpedidosAux.add(tipoprioridadpedidoAux);
					}		
				}
				this.iIdNuevoTipoPrioridadPedido=0L;
				this.tipoprioridadpedidos.removeAll(tipoprioridadpedidosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoPrioridadPedido 
					&& this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()>0
					) {
					tipoprioridadpedidoAux=this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().get(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size() - 1);
				
					if(tipoprioridadpedidoAux.getId()<0) {
						this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().remove(tipoprioridadpedidoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoPrioridadPedido && this.tipoprioridadpedidos.size()>0) {
					tipoprioridadpedidoAux=this.tipoprioridadpedidos.get(this.tipoprioridadpedidos.size() - 1);
				
					if(tipoprioridadpedidoAux.getId()<0) {
						this.tipoprioridadpedidos.remove(tipoprioridadpedidoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoPrioridadPedido(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoprioridadpedido.getId()<0) {
				this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().remove(this.tipoprioridadpedido);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoprioridadpedido.getId()<0) {
				this.tipoprioridadpedidos.remove(this.tipoprioridadpedido);
			}
		}			
	}
	
	public void setEstadosInicialesTipoPrioridadPedido(List<TipoPrioridadPedido> tipoprioridadpedidosAux) throws Exception {
		TipoPrioridadPedidoConstantesFunciones.setEstadosInicialesTipoPrioridadPedido(tipoprioridadpedidosAux);
	}
	
	public void setEstadosInicialesTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedidoAux) throws Exception {
		TipoPrioridadPedidoConstantesFunciones.setEstadosInicialesTipoPrioridadPedido(tipoprioridadpedidoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoPrioridadPedidoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoPrioridadPedidoActual()) {
				if(!this.isEsNuevoTipoPrioridadPedido) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoPrioridadPedido=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoPrioridadPedidoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Prioridad Pedido ?", "MANTENIMIENTO DE Tipo Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoPrioridadPedido tipoprioridadpedido) throws Exception {
		TipoPrioridadPedidoConstantesFunciones.seleccionarAsignar(this.tipoprioridadpedido,tipoprioridadpedido);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoPrioridadPedido=this.isPermisoActualizarOriginalTipoPrioridadPedido;
			
			
			this.seleccionarAsignar(tipoprioridadpedido);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoPrioridadPedidoConstantesFunciones.quitarEspaciosTipoPrioridadPedido(this.tipoprioridadpedido,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoprioridadpedidoSessionBean.setsFuncionBusquedaRapida(this.tipoprioridadpedidoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoPrioridadPedido) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoPrioridadPedido(esParaCancelar);				
				this.cancelarNuevoTipoPrioridadPedido(esParaCancelar);								
			}
			
			this.tipoprioridadpedido=new TipoPrioridadPedido();
			
			this.inicializarTipoPrioridadPedido();
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoPrioridadPedido() throws Exception {
		try {
			TipoPrioridadPedidoConstantesFunciones.inicializarTipoPrioridadPedido(this.tipoprioridadpedido);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoPrioridadPedidos(String sAccionBusqueda,List<TipoPrioridadPedido> tipoprioridadpedidosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoPrioridadPedido"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoPrioridadPedidoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoPrioridadPedidoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoPrioridadPedido"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Prioridad Pedidos");		
		parameters.put("busquedapor", TipoPrioridadPedidoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoPrioridadPedido=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoPrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoPrioridadPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoPrioridadPedido=new JRBeanArrayDataSource(TipoPrioridadPedidoJInternalFrame.TraerTipoPrioridadPedidoBeans(tipoprioridadpedidosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoPrioridadPedido);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoPrioridadPedidoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoPrioridadPedidoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoPrioridadPedidoBean.TraerTipoPrioridadPedidoBeans(tipoprioridadpedidosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadpedidosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadpedidosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedidoActionPerformed(null);
					//this.generarExcelReporteTipoPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadpedidosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadpedidosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadpedidosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoPrioridadPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoprioridadpedidosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoPrioridadPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrioridadPedido> tipoprioridadpedidosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrioridadPedidos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrioridadPedido("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoPrioridadPedido tipoprioridadpedido : tipoprioridadpedidosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoPrioridadPedidoConstantesFunciones.generarExcelReporteDataTipoPrioridadPedido("NORMAL",row,workbook,tipoprioridadpedido,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoPrioridadPedido(String sTipo,Row row,Workbook workbook) {
		
		TipoPrioridadPedidoConstantesFunciones.generarExcelReporteHeaderTipoPrioridadPedido(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoPrioridadPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrioridadPedido> tipoprioridadpedidosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrioridadPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoPrioridadPedido tipoprioridadpedido : tipoprioridadpedidosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.getTipoPrioridadPedidoDescripcion(tipoprioridadpedido));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprioridadpedido.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoprioridadpedido.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoPrioridadPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoPrioridadPedido> tipoprioridadpedidosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoPrioridadPedido> tipoprioridadpedidosRespaldo=null;
		
		classes=TipoPrioridadPedidoConstantesFunciones.getClassesRelationshipsOfTipoPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoprioridadpedidoLogic.setDatosCliente(this.datosCliente);
		this.tipoprioridadpedidoLogic.setDatosDeep(this.datosDeep);
		this.tipoprioridadpedidoLogic.setIsConDeep(true);
		
		tipoprioridadpedidosRespaldo=this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos();
		
		this.tipoprioridadpedidoLogic.setTipoPrioridadPedidos(tipoprioridadpedidosParaReportes);	
		this.tipoprioridadpedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoprioridadpedidosParaReportes=this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos();
		this.tipoprioridadpedidoLogic.setTipoPrioridadPedidos(tipoprioridadpedidosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoPrioridadPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoPrioridadPedido("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoPrioridadPedido tipoprioridadpedido : tipoprioridadpedidosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoPrioridadPedido("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoPrioridadPedidoConstantesFunciones.generarExcelReporteDataTipoPrioridadPedido("NORMAL",row,workbook,tipoprioridadpedido,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.getTipoPrioridadPedidoDescripcion(tipoprioridadpedido));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoPrioridadPedido() throws Exception {		
		this.startProcessTipoPrioridadPedido(true);
	}
	
	public void startProcessTipoPrioridadPedido(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoPrioridadPedido ,this.jPanelParametrosReportesTipoPrioridadPedido, this.jScrollPanelDatosTipoPrioridadPedido,this.jPanelPaginacionTipoPrioridadPedido, this.jScrollPanelDatosEdicionTipoPrioridadPedido, this.jPanelAccionesTipoPrioridadPedido,this.jPanelAccionesFormularioTipoPrioridadPedido,this.jmenuBarTipoPrioridadPedido,this.jmenuBarDetalleTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,this.jTtoolBarDetalleTipoPrioridadPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrioridadPedido=this.jTabbedPaneBusquedasTipoPrioridadPedido; 
		
		final JPanel jPanelParametrosReportesTipoPrioridadPedido=this.jPanelParametrosReportesTipoPrioridadPedido;
		//final JScrollPane jScrollPanelDatosTipoPrioridadPedido=this.jScrollPanelDatosTipoPrioridadPedido;
		final JTable jTableDatosTipoPrioridadPedido=this.jTableDatosTipoPrioridadPedido;		
		final JPanel jPanelPaginacionTipoPrioridadPedido=this.jPanelPaginacionTipoPrioridadPedido;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrioridadPedido=this.jScrollPanelDatosEdicionTipoPrioridadPedido;
		final JPanel jPanelAccionesTipoPrioridadPedido=this.jPanelAccionesTipoPrioridadPedido;
		
		JPanel jPanelCamposAuxiliarTipoPrioridadPedido=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrioridadPedido=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			jPanelCamposAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelCamposTipoPrioridadPedido;
			jPanelAccionesFormularioAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelAccionesFormularioTipoPrioridadPedido;
		}
		
		final JPanel jPanelCamposTipoPrioridadPedido=jPanelCamposAuxiliarTipoPrioridadPedido;
		final JPanel jPanelAccionesFormularioTipoPrioridadPedido=jPanelAccionesFormularioAuxiliarTipoPrioridadPedido;
		
		
		final JMenuBar jmenuBarTipoPrioridadPedido=this.jmenuBarTipoPrioridadPedido;
		final JToolBar jTtoolBarTipoPrioridadPedido=this.jTtoolBarTipoPrioridadPedido;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoPrioridadPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrioridadPedido=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			jmenuBarDetalleAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jmenuBarDetalleTipoPrioridadPedido;
			jTtoolBarDetalleAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jTtoolBarDetalleTipoPrioridadPedido;
		}
		
		final JMenuBar jmenuBarDetalleTipoPrioridadPedido=jmenuBarDetalleAuxiliarTipoPrioridadPedido;
		final JToolBar jTtoolBarDetalleTipoPrioridadPedido=jTtoolBarDetalleAuxiliarTipoPrioridadPedido;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrioridadPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrioridadPedido;
			processRunnable.jTableDatos=jTableDatosTipoPrioridadPedido;
			processRunnable.jPanelCampos=jPanelCamposTipoPrioridadPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrioridadPedido;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrioridadPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrioridadPedido;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrioridadPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrioridadPedido;
			processRunnable.jTtoolBar=jTtoolBarTipoPrioridadPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrioridadPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrioridadPedido ,jPanelParametrosReportesTipoPrioridadPedido,jTableDatosTipoPrioridadPedido, /*jScrollPanelDatosTipoPrioridadPedido,*/jPanelCamposTipoPrioridadPedido,jPanelPaginacionTipoPrioridadPedido, /*jScrollPanelDatosEdicionTipoPrioridadPedido,*/ jPanelAccionesTipoPrioridadPedido,jPanelAccionesFormularioTipoPrioridadPedido,jmenuBarTipoPrioridadPedido,jmenuBarDetalleTipoPrioridadPedido,jTtoolBarTipoPrioridadPedido,jTtoolBarDetalleTipoPrioridadPedido);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoPrioridadPedido ,jPanelParametrosReportesTipoPrioridadPedido, jScrollPanelDatosTipoPrioridadPedido,jPanelPaginacionTipoPrioridadPedido, jScrollPanelDatosEdicionTipoPrioridadPedido, jPanelAccionesTipoPrioridadPedido,jPanelAccionesFormularioTipoPrioridadPedido,jmenuBarTipoPrioridadPedido,jmenuBarDetalleTipoPrioridadPedido,jTtoolBarTipoPrioridadPedido,jTtoolBarDetalleTipoPrioridadPedido);
						
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
	
	public void finishProcessTipoPrioridadPedido() {// throws Exception 
		this.finishProcessTipoPrioridadPedido(true);
	}
	
	public void finishProcessTipoPrioridadPedido(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoPrioridadPedido ,this.jPanelParametrosReportesTipoPrioridadPedido, this.jScrollPanelDatosTipoPrioridadPedido,this.jPanelPaginacionTipoPrioridadPedido, this.jScrollPanelDatosEdicionTipoPrioridadPedido, this.jPanelAccionesTipoPrioridadPedido,this.jPanelAccionesFormularioTipoPrioridadPedido,this.jmenuBarTipoPrioridadPedido,this.jmenuBarDetalleTipoPrioridadPedido,this.jTtoolBarTipoPrioridadPedido,this.jTtoolBarDetalleTipoPrioridadPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoPrioridadPedido=this.jTabbedPaneBusquedasTipoPrioridadPedido; 
		
		final JPanel jPanelParametrosReportesTipoPrioridadPedido=this.jPanelParametrosReportesTipoPrioridadPedido;
		//final JScrollPane jScrollPanelDatosTipoPrioridadPedido=this.jScrollPanelDatosTipoPrioridadPedido;
		final JTable jTableDatosTipoPrioridadPedido=this.jTableDatosTipoPrioridadPedido;		
		final JPanel jPanelPaginacionTipoPrioridadPedido=this.jPanelPaginacionTipoPrioridadPedido;
		//final JScrollPane jScrollPanelDatosEdicionTipoPrioridadPedido=this.jScrollPanelDatosEdicionTipoPrioridadPedido;
		final JPanel jPanelAccionesTipoPrioridadPedido=this.jPanelAccionesTipoPrioridadPedido;
		
		JPanel jPanelCamposAuxiliarTipoPrioridadPedido=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoPrioridadPedido=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			jPanelCamposAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelCamposTipoPrioridadPedido;
			jPanelAccionesFormularioAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelAccionesFormularioTipoPrioridadPedido;
		}
		
		final JPanel jPanelCamposTipoPrioridadPedido=jPanelCamposAuxiliarTipoPrioridadPedido;
		final JPanel jPanelAccionesFormularioTipoPrioridadPedido=jPanelAccionesFormularioAuxiliarTipoPrioridadPedido;
		
		
		final JMenuBar jmenuBarTipoPrioridadPedido=this.jmenuBarTipoPrioridadPedido;		
		final JToolBar jTtoolBarTipoPrioridadPedido=this.jTtoolBarTipoPrioridadPedido;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoPrioridadPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoPrioridadPedido=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			jmenuBarDetalleAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jmenuBarDetalleTipoPrioridadPedido;
			jTtoolBarDetalleAuxiliarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jTtoolBarDetalleTipoPrioridadPedido;		
		}
		
		final JMenuBar jmenuBarDetalleTipoPrioridadPedido=jmenuBarDetalleAuxiliarTipoPrioridadPedido;
		final JToolBar jTtoolBarDetalleTipoPrioridadPedido=jTtoolBarDetalleAuxiliarTipoPrioridadPedido;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoPrioridadPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoPrioridadPedido;
			processRunnable.jTableDatos=jTableDatosTipoPrioridadPedido;
			processRunnable.jPanelCampos=jPanelCamposTipoPrioridadPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoPrioridadPedido;
			processRunnable.jPanelAcciones=jPanelAccionesTipoPrioridadPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoPrioridadPedido;
			
			
			processRunnable.jmenuBar=jmenuBarTipoPrioridadPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoPrioridadPedido;
			processRunnable.jTtoolBar=jTtoolBarTipoPrioridadPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoPrioridadPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoPrioridadPedido ,jPanelParametrosReportesTipoPrioridadPedido, jTableDatosTipoPrioridadPedido,/*jScrollPanelDatosTipoPrioridadPedido,*/jPanelCamposTipoPrioridadPedido,jPanelPaginacionTipoPrioridadPedido, /*jScrollPanelDatosEdicionTipoPrioridadPedido,*/ jPanelAccionesTipoPrioridadPedido,jPanelAccionesFormularioTipoPrioridadPedido,jmenuBarTipoPrioridadPedido,jmenuBarDetalleTipoPrioridadPedido,jTtoolBarTipoPrioridadPedido,jTtoolBarDetalleTipoPrioridadPedido));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoPrioridadPedido(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoPrioridadPedido(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoPrioridadPedido(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoPrioridadPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoPrioridadPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoPrioridadPedido,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoPrioridadPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoPrioridadPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoPrioridadPedido,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoprioridadpedidoConstantesFunciones.getsFinalQueryTipoPrioridadPedido();
		String  finalQueryPaginacionTodos=this.tipoprioridadpedidoConstantesFunciones.getsFinalQueryTipoPrioridadPedido();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoPrioridadPedidoConstantesFunciones.getArrayColumnasGlobalesNoTipoPrioridadPedido(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoPrioridadPedidoConstantesFunciones.getArrayColumnasGlobalesTipoPrioridadPedido(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoPrioridadPedidoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoprioridadpedidosEliminados= new ArrayList<TipoPrioridadPedido>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoPrioridadPedido();
		
				///*TipoPrioridadPedidoSessionBean*/this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
			
			if(this.tipoprioridadpedidoSessionBean==null) {
				this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
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
					this.iNumeroPaginacion=TipoPrioridadPedidoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoPrioridadPedidoConstantesFunciones.getClassesForeignKeysOfTipoPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoprioridadpedido."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoprioridadpedidosAux= new ArrayList<TipoPrioridadPedido>();
			
				
			tipoprioridadpedidoLogic.setDatosCliente(this.datosCliente);
			tipoprioridadpedidoLogic.setDatosDeep(this.datosDeep);
			tipoprioridadpedidoLogic.setIsConDeep(true);
			
			
			tipoprioridadpedidoLogic.getTipoPrioridadPedidoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoprioridadpedidoLogic.getTodosTipoPrioridadPedidos(finalQueryGlobal,pagination);
					
					//tipoprioridadpedidoLogic.getTodosTipoPrioridadPedidosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoprioridadpedidoLogic.getTipoPrioridadPedidos()==null|| tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprioridadpedidosAux= new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidosAux.addAll(tipoprioridadpedidoLogic.getTipoPrioridadPedidos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidosAux= new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidosAux.addAll(tipoprioridadpedidos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprioridadpedidoLogic.getTodosTipoPrioridadPedidos(finalQueryGlobal+"",this.pagination);												
							
							//tipoprioridadpedidoLogic.getTodosTipoPrioridadPedidosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidoLogic.getTipoPrioridadPedidos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoprioridadpedidoLogic.setTipoPrioridadPedidos(new ArrayList<TipoPrioridadPedido>());					
							tipoprioridadpedidoLogic.getTipoPrioridadPedidos().addAll(tipoprioridadpedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidos=new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidos.addAll(tipoprioridadpedidosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoPrioridadPedido=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoPrioridadPedido=this.idActual;
				
				} else if(this.idTipoPrioridadPedidoActual!=null && this.idTipoPrioridadPedidoActual!=0L) {
					idTipoPrioridadPedido=idTipoPrioridadPedidoActual;
				}
				
					
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndicePorId(idTipoPrioridadPedido);
				
				this.tipoprioridadpedidos=new ArrayList<TipoPrioridadPedido>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoprioridadpedidoLogic.getEntity(idTipoPrioridadPedido);
					
					//tipoprioridadpedidoLogic.getEntityWithConnection(idTipoPrioridadPedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadpedidoLogic.setTipoPrioridadPedidos(new ArrayList<TipoPrioridadPedido>());
					tipoprioridadpedidoLogic.getTipoPrioridadPedidos().add(tipoprioridadpedidoLogic.getTipoPrioridadPedido());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprioridadpedidos=new ArrayList<TipoPrioridadPedido>();
					this.tipoprioridadpedidos.add(tipoprioridadpedido);
				}
				
				if(tipoprioridadpedidoLogic.getTipoPrioridadPedido()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprioridadpedidoLogic.getTipoPrioridadPedidosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprioridadpedidoLogic.getTipoPrioridadPedidos()==null||tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprioridadpedidos==null|| tipoprioridadpedidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidosAux=new ArrayList<TipoPrioridadPedido>();
						tipoprioridadpedidosAux.addAll(tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidosAux=new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidosAux.addAll(tipoprioridadpedidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprioridadpedidoLogic.getTipoPrioridadPedidosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPrioridadPedidos("BusquedaPorNombre",tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPrioridadPedidos("BusquedaPorNombre",tipoprioridadpedidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoLogic.setTipoPrioridadPedidos(new ArrayList<TipoPrioridadPedido>());
						tipoprioridadpedidoLogic.getTipoPrioridadPedidos().addAll(tipoprioridadpedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidos=new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidos.addAll(tipoprioridadpedidosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoprioridadpedidoLogic.getTipoPrioridadPedidosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoprioridadpedidoLogic.getTipoPrioridadPedidos()==null||tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoprioridadpedidos==null|| tipoprioridadpedidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidosAux=new ArrayList<TipoPrioridadPedido>();
						tipoprioridadpedidosAux.addAll(tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidosAux=new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidosAux.addAll(tipoprioridadpedidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoprioridadpedidoLogic.getTipoPrioridadPedidosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoPrioridadPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoPrioridadPedidos("FK_IdPais",tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoPrioridadPedidos("FK_IdPais",tipoprioridadpedidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoLogic.setTipoPrioridadPedidos(new ArrayList<TipoPrioridadPedido>());
						tipoprioridadpedidoLogic.getTipoPrioridadPedidos().addAll(tipoprioridadpedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidos=new ArrayList<TipoPrioridadPedido>();
							tipoprioridadpedidos.addAll(tipoprioridadpedidosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoPrioridadPedido();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoPrioridadPedido();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprioridadpedidos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoprioridadpedidos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoPrioridadPedido tipoprioridadpedido) {
		Boolean permite=true;
		
		if(this.tipoprioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoPrioridadPedidoConstantesFunciones.getOrderByListaTipoPrioridadPedido();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoPrioridadPedidoConstantesFunciones.getOrderByListaTipoPrioridadPedido();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadPedido tipoprioridadpedido:tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
				if(tipoprioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadpedidoTotales=tipoprioridadpedido;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadPedido tipoprioridadpedido:this.tipoprioridadpedidos) {
				if(tipoprioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadpedidoTotales=tipoprioridadpedido;
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
			this.tipoprioridadpedidoAux=new TipoPrioridadPedido();
			this.tipoprioridadpedidoAux.setsType(Constantes2.S_TOTALES);
			this.tipoprioridadpedidoAux.setIsNew(false);
			this.tipoprioridadpedidoAux.setIsChanged(false);
			this.tipoprioridadpedidoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoPrioridadPedidoConstantesFunciones.TotalizarValoresFilaTipoPrioridadPedido(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos(),this.tipoprioridadpedidoAux);
				
				this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().add(this.tipoprioridadpedidoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoPrioridadPedidoConstantesFunciones.TotalizarValoresFilaTipoPrioridadPedido(this.tipoprioridadpedidos,this.tipoprioridadpedidoAux);
				
				this.tipoprioridadpedidos.add(this.tipoprioridadpedidoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoprioridadpedidoTotales=new TipoPrioridadPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().remove(tipoprioridadpedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoprioridadpedidos.remove(tipoprioridadpedidoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoprioridadpedidoTotales=new TipoPrioridadPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoPrioridadPedido tipoprioridadpedido:tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
				if(tipoprioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadpedidoTotales=tipoprioridadpedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPrioridadPedidoConstantesFunciones.TotalizarValoresFilaTipoPrioridadPedido(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos(),tipoprioridadpedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoPrioridadPedido tipoprioridadpedido:this.tipoprioridadpedidos) {
				if(tipoprioridadpedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoprioridadpedidoTotales=tipoprioridadpedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoPrioridadPedidoConstantesFunciones.TotalizarValoresFilaTipoPrioridadPedido(this.tipoprioridadpedidos,tipoprioridadpedidoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoPrioridadPedidosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoPrioridadPedidosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoPrioridadPedidoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoPrioridadPedidosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadpedidoLogic.getTipoPrioridadPedidosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoPrioridadPedidosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadpedidoLogic.getTipoPrioridadPedidosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoPrioridadPedidoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadpedidoLogic.getTipoPrioridadPedidoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoPrioridadPedido() {
		this.isPermisoTodoTipoPrioridadPedido=false;
		this.isPermisoNuevoTipoPrioridadPedido=false;
		this.isPermisoActualizarTipoPrioridadPedido=false;
		this.isPermisoActualizarOriginalTipoPrioridadPedido=false;
		this.isPermisoEliminarTipoPrioridadPedido=false;
		this.isPermisoGuardarCambiosTipoPrioridadPedido=false;
		this.isPermisoConsultaTipoPrioridadPedido=false;
		this.isPermisoBusquedaTipoPrioridadPedido=false;
		this.isPermisoReporteTipoPrioridadPedido=false;		
		this.isPermisoOrdenTipoPrioridadPedido=false;		
		this.isPermisoPaginacionMedioTipoPrioridadPedido=false;		
		this.isPermisoPaginacionAltoTipoPrioridadPedido=false;
		this.isPermisoPaginacionTodoTipoPrioridadPedido=false;
		this.isPermisoCopiarTipoPrioridadPedido=false;		
		this.isPermisoVerFormTipoPrioridadPedido=false;		
		this.isPermisoDuplicarTipoPrioridadPedido=false;		
		this.isPermisoOrdenTipoPrioridadPedido=false;		
	}
	
	public void setPermisosUsuarioTipoPrioridadPedido(Boolean isPermiso) {
		this.isPermisoTodoTipoPrioridadPedido=isPermiso;
		this.isPermisoNuevoTipoPrioridadPedido=isPermiso;
		this.isPermisoActualizarTipoPrioridadPedido=isPermiso;
		this.isPermisoActualizarOriginalTipoPrioridadPedido=isPermiso;
		this.isPermisoEliminarTipoPrioridadPedido=isPermiso;
		this.isPermisoGuardarCambiosTipoPrioridadPedido=isPermiso;
		this.isPermisoConsultaTipoPrioridadPedido=isPermiso;
		this.isPermisoBusquedaTipoPrioridadPedido=isPermiso;
		this.isPermisoReporteTipoPrioridadPedido=isPermiso;
		this.isPermisoOrdenTipoPrioridadPedido=isPermiso;		
		this.isPermisoPaginacionMedioTipoPrioridadPedido=isPermiso;		
		this.isPermisoPaginacionAltoTipoPrioridadPedido=isPermiso;		
		this.isPermisoPaginacionTodoTipoPrioridadPedido=isPermiso;		
		this.isPermisoCopiarTipoPrioridadPedido=isPermiso;		
		this.isPermisoVerFormTipoPrioridadPedido=isPermiso;		
		this.isPermisoDuplicarTipoPrioridadPedido=isPermiso;
		this.isPermisoOrdenTipoPrioridadPedido=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoPrioridadPedido(Boolean isPermiso) {
		//this.isPermisoTodoTipoPrioridadPedido=isPermiso;
		this.isPermisoNuevoTipoPrioridadPedido=isPermiso;
		this.isPermisoActualizarTipoPrioridadPedido=isPermiso;
		this.isPermisoActualizarOriginalTipoPrioridadPedido=isPermiso;
		this.isPermisoEliminarTipoPrioridadPedido=isPermiso;
		this.isPermisoGuardarCambiosTipoPrioridadPedido=isPermiso;
		//this.isPermisoConsultaTipoPrioridadPedido=isPermiso;
		//this.isPermisoBusquedaTipoPrioridadPedido=isPermiso;
		//this.isPermisoReporteTipoPrioridadPedido=isPermiso;
		//this.isPermisoOrdenTipoPrioridadPedido=isPermiso;		
		//this.isPermisoPaginacionMedioTipoPrioridadPedido=isPermiso;		
		//this.isPermisoPaginacionAltoTipoPrioridadPedido=isPermiso;		
		//this.isPermisoPaginacionTodoTipoPrioridadPedido=isPermiso;		
		//this.isPermisoCopiarTipoPrioridadPedido=isPermiso;		
		//this.isPermisoDuplicarTipoPrioridadPedido=isPermiso;
		//this.isPermisoOrdenTipoPrioridadPedido=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoPrioridadPedidoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoPrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoPrioridadPedido(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoPrioridadPedidoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoPrioridadPedidoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoPrioridadPedidoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoPrioridadPedidoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoPrioridadPedido() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoPrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoPrioridadPedidoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoPrioridadPedido=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoPrioridadPedido=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoPrioridadPedido=this.isPermisoActualizarTipoPrioridadPedido;
			this.isPermisoEliminarTipoPrioridadPedido=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoPrioridadPedido=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoPrioridadPedido=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoPrioridadPedido=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoPrioridadPedido=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoPrioridadPedido=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrioridadPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoPrioridadPedido=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoPrioridadPedido=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoPrioridadPedido=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoPrioridadPedido=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoPrioridadPedido=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoPrioridadPedido=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoPrioridadPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoPrioridadPedido.setToolTipText(this.jTableDatosTipoPrioridadPedido.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoPrioridadPedido(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoPrioridadPedido(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoPrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoPrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoPrioridadPedido() throws Exception {
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
	public void inicializarCombosForeignKeyTipoPrioridadPedidoListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoPrioridadPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoPrioridadPedidoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoPrioridadPedidoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoPrioridadPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoReturnGeneral=new TipoPrioridadPedidoParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipoprioridadpedidoConstantesFunciones.cargarid_paisTipoPrioridadPedido)
					 || (this.esRecargarFks && this.tipoprioridadpedidoConstantesFunciones.cargarid_paisTipoPrioridadPedido)) {

					if(!this.tipoprioridadpedidoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipoprioridadpedidoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoprioridadpedidoReturnGeneral=tipoprioridadpedidoLogic.cargarCombosLoteForeignKeyTipoPrioridadPedido(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipoprioridadpedidoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoPrioridadPedido()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipoprioridadpedidoSessionBean==null) {
				this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
			}

			if(!this.tipoprioridadpedidoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoPrioridadPedido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoPrioridadPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoPrioridadPedido()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrioridadPedido();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipoprioridadpedido.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoPrioridadPedido()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipoprioridadpedidoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoPrioridadPedido()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoPrioridadPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoPrioridadPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoPrioridadPedido()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoPrioridadPedido()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoPrioridadPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoPrioridadPedido()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido!=null && this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoPrioridadPedidoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoPrioridadPedidoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoPrioridadPedidoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean(); 
		this.tipoprioridadpedidoConstantesFunciones=new TipoPrioridadPedidoConstantesFunciones(); 
		this.tipoprioridadpedidoBean=new TipoPrioridadPedido();//(this.tipoprioridadpedidoConstantesFunciones); 		
		this.tipoprioridadpedidoReturnGeneral=new TipoPrioridadPedidoParameterReturnGeneral(); 
		
		this.tipoprioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoprioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoPrioridadPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoPrioridadPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoPrioridadPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoPrioridadPedido(true);
			
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
			
			this.tipoprioridadpedidoConstantesFunciones=new TipoPrioridadPedidoConstantesFunciones(); 
			this.tipoprioridadpedidoBean=new TipoPrioridadPedido();//this.tipoprioridadpedidoConstantesFunciones); 			
			this.tipoprioridadpedidoReturnGeneral=new TipoPrioridadPedidoParameterReturnGeneral(); 
		
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Prioridad Pedido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoprioridadpedido=new TipoPrioridadPedido();
			this.tipoprioridadpedidos = new ArrayList<TipoPrioridadPedido>();
			this.tipoprioridadpedidosAux = new ArrayList<TipoPrioridadPedido>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic=new TipoPrioridadPedidoLogic();
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoprioridadpedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoprioridadpedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoPrioridadPedido);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrioridadPedido);	
					}
					
					if(this.jInternalFrameImportacionTipoPrioridadPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrioridadPedido);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoPrioridadPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoPrioridadPedido);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrioridadPedido);
				this.jInternalFrameDetalleFormTipoPrioridadPedido.setVisible(false);
				this.jInternalFrameDetalleFormTipoPrioridadPedido.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrioridadPedido);
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoPrioridadPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrioridadPedido);
					this.jInternalFrameImportacionTipoPrioridadPedido.setVisible(false);
					this.jInternalFrameImportacionTipoPrioridadPedido.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoPrioridadPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrioridadPedido);
					this.jInternalFrameOrderByTipoPrioridadPedido.setVisible(false);
					this.jInternalFrameOrderByTipoPrioridadPedido.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoPrioridadPedidoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoPrioridadPedidoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoprioridadpedidoReturnGeneral=new TipoPrioridadPedidoParameterReturnGeneral();
			
			this.tipoprioridadpedidoParameterGeneral=new TipoPrioridadPedidoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoprioridadpedidoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoPrioridadPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPrioridadPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado(),this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoPrioridadPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado(),this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaDuplicarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaCopiarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaVerFormTipoPrioridadPedido=true;
			this.isVisibilidadCeldaOrdenTipoPrioridadPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoPrioridadPedido();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoPrioridadPedido(false);
			
			this.setPermisosUsuarioTipoPrioridadPedido();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado() && this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoPrioridadPedidoClasesRelacionadas();
			}
			
			if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoPrioridadPedidoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoPrioridadPedido();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoPrioridadPedido();
			}
			
			if(!this.isPermisoBusquedaTipoPrioridadPedido) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoPrioridadPedido,this.isPermisoPaginacionMedioTipoPrioridadPedido,this.isPermisoPaginacionTodoTipoPrioridadPedido);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoPrioridadPedidoConstantesFunciones.getTiposSeleccionarTipoPrioridadPedido());
				
				this.tiposColumnasSelect=TipoPrioridadPedidoConstantesFunciones.getTiposSeleccionarTipoPrioridadPedido(true);
				
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
			//if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoPrioridadPedido();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoPrioridadPedido(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoPrioridadPedido(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadPedido() ;
			
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
				tipoprioridadpedidoImplementable= (TipoPrioridadPedidoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPrioridadPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoprioridadpedidoImplementableHome= (TipoPrioridadPedidoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoPrioridadPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoprioridadpedidos= new ArrayList<TipoPrioridadPedido>();
			this.tipoprioridadpedidosEliminados= new ArrayList<TipoPrioridadPedido>();
						
			this.isEsNuevoTipoPrioridadPedido=false;
			this.esParaAccionDesdeFormularioTipoPrioridadPedido=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoPrioridadPedido(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoPrioridadPedido();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoPrioridadPedidoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoPrioridadPedido(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoPrioridadPedido();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoPrioridadPedido();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoPrioridadPedido.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoPrioridadPedido.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoPrioridadPedido.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoPrioridadPedido(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoPrioridadPedido: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoPrioridadPedido() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoPrioridadPedido")) {
				iIndex=this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoPrioridadPedido();	
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
	
	public void cargarCombosForeignKeyTipoPrioridadPedido(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoPrioridadPedido(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoPrioridadPedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoPrioridadPedidoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoPrioridadPedido();
		
		this.cargarCombosFrameForeignKeyTipoPrioridadPedido();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoPrioridadPedido();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoPrioridadPedido();
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
	
	public void jButtonNuevoTipoPrioridadPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			
			if(jTableDatosTipoPrioridadPedido.getRowCount()>=1) {
				jTableDatosTipoPrioridadPedido.removeRowSelectionInterval(0, jTableDatosTipoPrioridadPedido.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoPrioridadPedido=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoPrioridadPedido(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoPrioridadPedido(true);			
			//this.tipoprioridadpedido=new TipoPrioridadPedido();
			//this.tipoprioridadpedido.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido() ;
			
			if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrioridadPedido(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoprioridadpedido);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);				
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoPrioridadPedido: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoPrioridadPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoPrioridadPedido.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoPrioridadPedido.getSelectedRows().length;			
			}
			
			tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoPrioridadPedido--;			
				//TipoPrioridadPedido tipoprioridadpedidoAux= new TipoPrioridadPedido();			
				//tipoprioridadpedidoAux.setId(this.iIdNuevoTipoPrioridadPedido);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoPrioridadPedido tipoprioridadpedidoOrigen=new TipoPrioridadPedido();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoPrioridadPedido tipoprioridadpedidoOrigen : tipoprioridadpedidosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoprioridadpedidoOrigen =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoprioridadpedidoOrigen =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoPrioridadPedido();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoprioridadpedido.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoPrioridadPedido(tipoprioridadpedidoOrigen,this.tipoprioridadpedido,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().add(this.tipoprioridadpedidoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprioridadpedidos.add(this.tipoprioridadpedidoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
				
				this.jTableDatosTipoPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadPedido(), this.getIndiceNuevoTipoPrioridadPedido());
				
				int iLastRow =  this.jTableDatosTipoPrioridadPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrioridadPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrioridadPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();									
		
			TipoPrioridadPedido tipoprioridadpedidoOrigen=new TipoPrioridadPedido();
			TipoPrioridadPedido tipoprioridadpedidoDestino=new TipoPrioridadPedido();
				
			tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoPrioridadPedido.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoprioridadpedidosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoPrioridadPedido.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoOrigen =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprioridadpedidoOrigen =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoprioridadpedidoDestino =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoprioridadpedidoDestino =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoprioridadpedidoOrigen =tipoprioridadpedidosSeleccionados.get(0);
				tipoprioridadpedidoDestino =tipoprioridadpedidosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoPrioridadPedido(tipoprioridadpedidoOrigen,tipoprioridadpedidoDestino,true,false);
				
				tipoprioridadpedidoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoprioridadpedidoDestino,tipoprioridadpedidoLogic.getTipoPrioridadPedidos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoprioridadpedidoDestino,tipoprioridadpedidos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
				
				//this.jTableDatosTipoPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadPedido(), this.getIndiceNuevoTipoPrioridadPedido());
				
				int iLastRow =  this.jTableDatosTipoPrioridadPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoPrioridadPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoPrioridadPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoPrioridadPedido.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(!isVisible);
			this.jPanelPaginacionTipoPrioridadPedido.setVisible(!isVisible);
			this.jPanelAccionesTipoPrioridadPedido.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoPrioridadPedido();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoPrioridadPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoPrioridadPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoPrioridadPedido();
			
			this.abrirFrameOrderByTipoPrioridadPedido();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoPrioridadPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoPrioridadPedido(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrioridadPedido);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoPrioridadPedido.isMaximum()) {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoPrioridadPedido.setSize(this.jInternalFrameDetalleFormTipoPrioridadPedido.iWidthFormulario,this.jInternalFrameDetalleFormTipoPrioridadPedido.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoPrioridadPedido.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoPrioridadPedido.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoPrioridadPedido.isMaximum()) {
						this.jInternalFrameDetalleFormTipoPrioridadPedido.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoPrioridadPedido.jContentPaneDetalleTipoPrioridadPedido.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrioridadPedido.jContentPaneDetalleTipoPrioridadPedido.getWidth(),TipoPrioridadPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoPrioridadPedido.jContentPaneDetalleTipoPrioridadPedido.getWidth(),TipoPrioridadPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoPrioridadPedido.jContentPaneDetalleTipoPrioridadPedido.getWidth(),TipoPrioridadPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoPrioridadPedido.setVisible(true);
	        this.jInternalFrameDetalleFormTipoPrioridadPedido.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoPrioridadPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoPrioridadPedido==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadPedido,false,this);
				} else {
					this.jInternalFrameOrderByTipoPrioridadPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoPrioridadPedido,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoPrioridadPedido);
				this.jInternalFrameOrderByTipoPrioridadPedido.setVisible(false);
				this.jInternalFrameOrderByTipoPrioridadPedido.setSelected(false);
				
				this.jInternalFrameOrderByTipoPrioridadPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrioridadPedido"));
				
				this.inicializarActualizarBindingTablaOrderByTipoPrioridadPedido();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoPrioridadPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoPrioridadPedido==null) {
				
				this.jInternalFrameImportacionTipoPrioridadPedido=new ImportacionJInternalFrame(TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoPrioridadPedido);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoPrioridadPedido);
				this.jInternalFrameImportacionTipoPrioridadPedido.setVisible(false);
				this.jInternalFrameImportacionTipoPrioridadPedido.setSelected(false);


				this.jInternalFrameImportacionTipoPrioridadPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrioridadPedido"));
				this.jInternalFrameImportacionTipoPrioridadPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrioridadPedido"));
				this.jInternalFrameImportacionTipoPrioridadPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrioridadPedido"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoPrioridadPedido() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido==null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido=new ReporteDinamicoJInternalFrame(TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoPrioridadPedido);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoPrioridadPedido);
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrioridadPedido"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrioridadPedido();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoPrioridadPedido() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoPrioridadPedido);
			
	       	this.jInternalFrameDetalleFormTipoPrioridadPedido.setVisible(false);
	        this.jInternalFrameDetalleFormTipoPrioridadPedido.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoPrioridadPedido.dispose();
			//this.jInternalFrameDetalleFormTipoPrioridadPedido=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoPrioridadPedido() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoPrioridadPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoPrioridadPedido.setVisible(true);
	        this.jInternalFrameImportacionTipoPrioridadPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoPrioridadPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoPrioridadPedido.setVisible(true);
	        this.jInternalFrameOrderByTipoPrioridadPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoPrioridadPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoPrioridadPedido.setVisible(false);
	        this.jInternalFrameOrderByTipoPrioridadPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoPrioridadPedido() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoPrioridadPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoPrioridadPedido.setVisible(false);
	        this.jInternalFrameImportacionTipoPrioridadPedido.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoPrioridadPedido(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoPrioridadPedido(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoPrioridadPedido(true);
			//this.isEsNuevoTipoPrioridadPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false) ;
			
			if(tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrioridadPedido(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoPrioridadPedidoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoPrioridadPedido(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoPrioridadPedido(true);
			//this.isEsNuevoTipoPrioridadPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoprioridadpedido.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false) ;
			
			if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoPrioridadPedido(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoPrioridadPedido.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoPrioridadPedido(false);
			
			//if(!this.isEsNuevoTipoPrioridadPedido) {								
				int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
				
			}
			
			if(this.permiteMantenimiento(this.tipoprioridadpedido)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoPrioridadPedido=true;
					this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
					this.isEsNuevoTipoPrioridadPedido=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoPrioridadPedido=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoPrioridadPedido=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(false);
				
				this.habilitarDeshabilitarControlesTipoPrioridadPedido(false);
			
												
				
				if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoPrioridadPedido();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,tipoprioridadpedidoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoPrioridadPedido(this.tipoprioridadpedido,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoPrioridadPedido.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoprioridadpedidoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoprioridadpedido.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				this.tipoprioridadpedido.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				this.tipoprioridadpedido.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoprioridadpedido)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoPrioridadPedidoModel) this.jTableDatosTipoPrioridadPedido.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoPrioridadPedido=true;
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
				this.isEsNuevoTipoPrioridadPedido=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(false);
				
				this.habilitarDeshabilitarControlesTipoPrioridadPedido(false);
				
				
				
				if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoPrioridadPedido();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoPrioridadPedido.getRowCount()>=1) {
				jTableDatosTipoPrioridadPedido.removeRowSelectionInterval(0, jTableDatosTipoPrioridadPedido.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoPrioridadPedido(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(false) ;
			
			this.isEsNuevoTipoPrioridadPedido=false;
			
			if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoPrioridadPedido();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoPrioridadPedido(false);
				
				//SI ES MANUAL
				if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoPrioridadPedido();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoPrioridadPedido--;			
			//TipoPrioridadPedido tipoprioridadpedidoAux= new TipoPrioridadPedido();			
			//tipoprioridadpedidoAux.setId(this.iIdNuevoTipoPrioridadPedido);
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoPrioridadPedido();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
			
			this.tipoprioridadpedido.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().add(this.tipoprioridadpedidoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoprioridadpedidos.add(this.tipoprioridadpedidoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			
			this.jTableDatosTipoPrioridadPedido.setRowSelectionInterval(this.getIndiceNuevoTipoPrioridadPedido(), this.getIndiceNuevoTipoPrioridadPedido());
			
			int iLastRow =  this.jTableDatosTipoPrioridadPedido.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoPrioridadPedido.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoPrioridadPedido.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
			
			//SI ES MANUAL
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrioridadPedido();
			}
			
			//this.abrirFrameTreeTipoPrioridadPedido();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Prioridad PedidoS ?", "MANTENIMIENTO DE Tipo Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoPrioridadPedido.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoPrioridadPedido();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoprioridadpedidoReturnGeneral=tipoprioridadpedidoLogic.procesarImportacionTipoPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoprioridadpedidoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoPrioridadPedidoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoPrioridadPedido.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoPrioridadPedido.setFileImportacion(this.jInternalFrameImportacionTipoPrioridadPedido.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoPrioridadPedido.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoPrioridadPedido.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoPrioridadPedido.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoPrioridadPedido.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		

		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoPrioridadPedidoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoPrioridadPedidoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoPrioridadPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoPrioridadPedido tipoprioridadpedido:tipoprioridadpedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprioridadpedido.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoPrioridadPedido tipoprioridadpedido:tipoprioridadpedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoprioridadpedido.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoPrioridadPedido(row);				
			//	iRow++;
			//}				
			
			//for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoPrioridadPedido(tipoprioridadpedidoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
			
			//SI ES MANUAL
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoPrioridadPedido();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
			
			//SI ES MANUAL
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrioridadPedido();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
			
			//SI ES MANUAL
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoPrioridadPedido();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoPrioridadPedido() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoPrioridadPedido.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoPrioridadPedido.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoPrioridadPedido.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoPrioridadPedido.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoPrioridadPedido.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoPrioridadPedido.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoPrioridadPedido.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoPrioridadPedido(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoPrioridadPedido(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoPrioridadPedido(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoPrioridadPedido(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoPrioridadPedido(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoPrioridadPedido(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadPedido(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoPrioridadPedido(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoPrioridadPedido() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoPrioridadPedido();
		
		this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrioridadPedido();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadPedido() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrioridadPedido(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrioridadPedido(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoPrioridadPedido.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoPrioridadPedido.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoPrioridadPedido.jCheckBoxPostAccionNuevoTipoPrioridadPedido.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoPrioridadPedido.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoPrioridadPedido.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoPrioridadPedido.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoPrioridadPedido.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
				this.jInternalFrameDetalleFormTipoPrioridadPedido.jCheckBoxPostAccionNuevoTipoPrioridadPedido.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoPrioridadPedido.jCheckBoxPostAccionSinCerrarTipoPrioridadPedido.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoPrioridadPedido.jCheckBoxPostAccionSinMensajeTipoPrioridadPedido.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoPrioridadPedido.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoPrioridadPedido.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoPrioridadPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoPrioridadPedido.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoPrioridadPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoPrioridadPedido.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoPrioridadPedido.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoPrioridadPedido(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoPrioridadPedido(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoPrioridadPedido() throws Exception {
		try	{
			if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrioridadPedido();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrioridadPedido() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoPrioridadPedido() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoPrioridadPedido.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoPrioridadPedido.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoPrioridadPedido.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoPrioridadPedido.addItem(reporte);
			}
			
			
			if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoPrioridadPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoPrioridadPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoPrioridadPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoPrioridadPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoPrioridadPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoPrioridadPedido.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoPrioridadPedido.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrioridadPedido();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoPrioridadPedido() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoPrioridadPedido()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoPrioridadPedido.getText();
		if(this.jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoPrioridadPedido.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoPrioridadPedido(Boolean esInicializar) throws Exception {				
		if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoPrioridadPedido();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoPrioridadPedido() throws Exception {
		this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoPrioridadPedido() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoPrioridadPedidoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedidoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoPrioridadPedido(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoprioridadpedidos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoPrioridadPedido.setModel(new TipoPrioridadPedidoModel(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoPrioridadPedido.setModel(new TipoPrioridadPedidoModel(this.tipoprioridadpedidos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoPrioridadPedido!=null && this.jInternalFrameOrderByTipoPrioridadPedido.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoPrioridadPedido();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,tipoprioridadpedidoConstantesFunciones.resaltarSeleccionarTipoPrioridadPedido,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoPrioridadPedidoConstantesFunciones.SCLASSWEBTITULO,tipoprioridadpedidoConstantesFunciones.resaltarSeleccionarTipoPrioridadPedido,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,TipoPrioridadPedidoConstantesFunciones.LABEL_ID));

		if(this.tipoprioridadpedidoConstantesFunciones.mostraridTipoPrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadPedidoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoprioridadpedidoConstantesFunciones.resaltaridTipoPrioridadPedido,this.tipoprioridadpedidoConstantesFunciones.activaridTipoPrioridadPedido,this,true,"idTipoPrioridadPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprioridadpedidoConstantesFunciones.resaltaridTipoPrioridadPedido,this.tipoprioridadpedidoConstantesFunciones.activaridTipoPrioridadPedido,this,true,"idTipoPrioridadPedido","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS));

		if(this.tipoprioridadpedidoConstantesFunciones.mostrarid_paisTipoPrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipoprioridadpedidoConstantesFunciones.resaltarid_paisTipoPrioridadPedido,this,this.tipoprioridadpedidoConstantesFunciones.activarid_paisTipoPrioridadPedido));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipoprioridadpedidoConstantesFunciones.resaltarid_paisTipoPrioridadPedido,this,this.tipoprioridadpedidoConstantesFunciones.activarid_paisTipoPrioridadPedido,true,"id_paisTipoPrioridadPedido","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoprioridadpedidoConstantesFunciones.mostrarnombreTipoPrioridadPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoprioridadpedidoConstantesFunciones.resaltarnombreTipoPrioridadPedido,this.tipoprioridadpedidoConstantesFunciones.activarnombreTipoPrioridadPedido,this,true,"nombreTipoPrioridadPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoprioridadpedidoConstantesFunciones.resaltarnombreTipoPrioridadPedido,this.tipoprioridadpedidoConstantesFunciones.activarnombreTipoPrioridadPedido,this,true,"nombreTipoPrioridadPedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoPrioridadPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrioridadPedido.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoPrioridadPedido.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoPrioridadPedido.addColumn(tableColumn);
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
			
			this.jTableDatosTipoPrioridadPedido.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoPrioridadPedido.moveColumn(this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoPrioridadPedido.moveColumn(this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoPrioridadPedido.moveColumn(this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoPrioridadPedido.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoPrioridadPedido.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoPrioridadPedido,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoPrioridadPedido.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoPrioridadPedido.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoPrioridadPedido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoprioridadpedidoLogic.getTipoPrioridadPedidos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoprioridadpedidos.size()-1;
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
		//this.jTableDatosTipoPrioridadPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoPrioridadPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoPrioridadPedido();
			
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
				
				//this.isEsNuevoTipoPrioridadPedido=false;
					
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
				if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrioridadPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrioridadPedido.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoprioridadpedido.getsType().equals("DUPLICADO")
				   || this.tipoprioridadpedido.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoPrioridadPedido=true;
				
				} else {
					this.isEsNuevoTipoPrioridadPedido=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoprioridadpedido.getId()>=0 && !this.tipoprioridadpedido.getIsNew()) {						
						this.isEsNuevoTipoPrioridadPedido=false;
						
					} else {
						this.isEsNuevoTipoPrioridadPedido=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoPrioridadPedido(esRelaciones);						
				
				this.seleccionarTipoPrioridadPedido(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoprioridadpedido.getId()<0) {
					this.isEsNuevoTipoPrioridadPedido=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoPrioridadPedido(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoPrioridadPedido(evt,rowIndex);
				}	
				
				if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoPrioridadPedido: " + this.dDif); 
					}
				}								
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoPrioridadPedido(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoprioridadpedido)) {
					if(this.tipoprioridadpedido.getId()>0) {
						this.tipoprioridadpedido.setIsDeleted(true);
						
						this.tipoprioridadpedidosEliminados.add(this.tipoprioridadpedido);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().remove(this.tipoprioridadpedido);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoprioridadpedidos.remove(this.tipoprioridadpedido);				
					}
					
					
					((TipoPrioridadPedidoModel) this.jTableDatosTipoPrioridadPedido.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoPrioridadPedido(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoPrioridadPedido) {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoPrioridadPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoPrioridadPedido.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedido);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipoprioridadpedidoConstantesFunciones.cargarid_paisTipoPrioridadPedido || this.tipoprioridadpedidoConstantesFunciones.event_dependid_paisTipoPrioridadPedido) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipoprioridadpedido.getid_pais());
									//this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipoprioridadpedido.getPais()!=null) {
							this.paissForeignKey.add(tipoprioridadpedido.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipoprioridadpedido.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoPrioridadPedido("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoPrioridadPedido(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoPrioridadPedido(tipoprioridadpedido,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoPrioridadPedido(tipoprioridadpedido);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoPrioridadPedido(tipoprioridadpedido,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadPedido(tipoprioridadpedido);
	}
	
	public void setVariablesObjetoActualToFormularioTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setText(tipoprioridadpedido.getId().toString());
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setText(tipoprioridadpedido.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoPrioridadPedido tipoprioridadpedidoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoprioridadpedidoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoPrioridadPedido tipoprioridadpedidoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoprioridadpedidoLocal=this.tipoprioridadpedido;
			} else {
				tipoprioridadpedidoLocal=this.tipoprioridadpedidoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoprioridadpedidoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoPrioridadPedido(tipoprioridadpedidoLocal,true);
					
					if(tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoprioridadpedidoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoprioridadpedidoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(tipoprioridadpedido,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(tipoprioridadpedido);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(tipoprioridadpedido,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.getText()==null || this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.getText()=="" || this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setText("0");
			}

			if(conColumnasBase) {tipoprioridadpedido.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrioridadPedidoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelIdTipoPrioridadPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoprioridadpedido.setnombre(this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelnombreTipoPrioridadPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedidoBean,TipoPrioridadPedido tipoprioridadpedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipoprioridadpedidoBean.getid_pais()!=null && !tipoprioridadpedidoBean.getid_pais().equals(-1L))) {tipoprioridadpedido.setid_pais(tipoprioridadpedidoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedidoOrigen,TipoPrioridadPedido tipoprioridadpedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprioridadpedidoOrigen.getId()!=null && !tipoprioridadpedidoOrigen.getId().equals(0L))) {tipoprioridadpedido.setId(tipoprioridadpedidoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoprioridadpedidoOrigen.getid_pais()!=null && !tipoprioridadpedidoOrigen.getid_pais().equals(-1L))) {tipoprioridadpedido.setid_pais(tipoprioridadpedidoOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipoprioridadpedidoOrigen.getnombre()!=null && !tipoprioridadpedidoOrigen.getnombre().equals(""))) {tipoprioridadpedido.setnombre(tipoprioridadpedidoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setText(tipoprioridadpedido.getId().toString());
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setText(tipoprioridadpedido.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoPrioridadPedido(TipoPrioridadPedidoBean tipoprioridadpedidoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setText(tipoprioridadpedidoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setText(tipoprioridadpedidoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoPrioridadPedido(TipoPrioridadPedidoParameterReturnGeneral tipoprioridadpedidoReturnGeneral,TipoPrioridadPedidoBean tipoprioridadpedidoBean,Boolean conDefault) throws Exception { 
		try {
			TipoPrioridadPedido tipoprioridadpedidoLocal=new TipoPrioridadPedido();
			
			tipoprioridadpedidoLocal=tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoprioridadpedidoLocal.getId()!=null && !tipoprioridadpedidoLocal.getId().equals(0L))) {tipoprioridadpedidoBean.setId(tipoprioridadpedidoLocal.getId());}}
			if(conDefault || (!conDefault && tipoprioridadpedidoLocal.getid_pais()!=null && !tipoprioridadpedidoLocal.getid_pais().equals(-1L))) {tipoprioridadpedidoBean.setid_pais(tipoprioridadpedidoLocal.getid_pais());}
			if(conDefault || (!conDefault && tipoprioridadpedidoLocal.getnombre()!=null && !tipoprioridadpedidoLocal.getnombre().equals(""))) {tipoprioridadpedidoBean.setnombre(tipoprioridadpedidoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoPrioridadPedidoGenerico(Long idTipoPrioridadPedidoSeleccionado,JComboBox jComboBoxTipoPrioridadPedido,List<TipoPrioridadPedido> tipoprioridadpedidosLocal)throws Exception {
		try {
			TipoPrioridadPedido  tipoprioridadpedidoTemp=null;

			for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosLocal) {
				if(tipoprioridadpedidoAux.getId()!=null && tipoprioridadpedidoAux.getId().equals(idTipoPrioridadPedidoSeleccionado)) {
					tipoprioridadpedidoTemp=tipoprioridadpedidoAux;
					break;
				}
			}

			jComboBoxTipoPrioridadPedido.setSelectedItem(tipoprioridadpedidoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoPrioridadPedidoGenerico(JComboBox jComboBoxTipoPrioridadPedido,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrioridadPedido.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoPrioridadPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoPrioridadPedido.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoPrioridadPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoPrioridadPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoPrioridadPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprioridadpedido=(TipoPrioridadPedido) tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprioridadpedido =(TipoPrioridadPedido) tipoprioridadpedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipoprioridadpedido.getIsNew() && !tipoprioridadpedido.getIsChanged() && !tipoprioridadpedido.getIsDeleted()) {
				sDescripcion=tipoprioridadpedido.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipoprioridadpedido.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoPrioridadPedido tipoprioridadpedidoRow=new TipoPrioridadPedido();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprioridadpedidoRow=(TipoPrioridadPedido) tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoprioridadpedidoRow=(TipoPrioridadPedido) tipoprioridadpedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoPrioridadPedido(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido));			
			this.jButtonDuplicarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaDuplicarTipoPrioridadPedido && this.isPermisoDuplicarTipoPrioridadPedido));			
			this.jButtonCopiarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaCopiarTipoPrioridadPedido && this.isPermisoCopiarTipoPrioridadPedido));
			this.jButtonVerFormTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaVerFormTipoPrioridadPedido && this.isPermisoVerFormTipoPrioridadPedido));
			
			this.jButtonAbrirOrderByTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadPedido && this.isPermisoOrdenTipoPrioridadPedido));			
			
			this.jButtonNuevoRelacionesTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido));			
			this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaModificarTipoPrioridadPedido && this.isPermisoActualizarTipoPrioridadPedido));	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaActualizarTipoPrioridadPedido && this.isPermisoActualizarTipoPrioridadPedido));	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaEliminarTipoPrioridadPedido && this.isPermisoEliminarTipoPrioridadPedido));
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarTipoPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadPedido);							
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido));						
			this.jButtonDuplicarToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaDuplicarTipoPrioridadPedido && this.isPermisoDuplicarTipoPrioridadPedido));						
			this.jButtonCopiarToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaCopiarTipoPrioridadPedido && this.isPermisoCopiarTipoPrioridadPedido));			
			this.jButtonVerFormToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaVerFormTipoPrioridadPedido && this.isPermisoVerFormTipoPrioridadPedido));			
			this.jButtonAbrirOrderByToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadPedido && this.isPermisoOrdenTipoPrioridadPedido));
			this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido));			
			this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));			
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaModificarTipoPrioridadPedido && this.isPermisoActualizarTipoPrioridadPedido));	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaActualizarTipoPrioridadPedido  && this.isPermisoActualizarTipoPrioridadPedido));	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaEliminarTipoPrioridadPedido && this.isPermisoEliminarTipoPrioridadPedido));
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarToolBarTipoPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadPedido);				
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido));			
			this.jMenuItemDuplicarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaDuplicarTipoPrioridadPedido && this.isPermisoDuplicarTipoPrioridadPedido));			
			this.jMenuItemCopiarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaCopiarTipoPrioridadPedido && this.isPermisoCopiarTipoPrioridadPedido));			
			this.jMenuItemVerFormTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaVerFormTipoPrioridadPedido && this.isPermisoVerFormTipoPrioridadPedido));			
			this.jMenuItemAbrirOrderByTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadPedido && this.isPermisoOrdenTipoPrioridadPedido));			
			//this.jMenuItemMostrarOcultarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadPedido && this.isPermisoOrdenTipoPrioridadPedido));
			this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadPedido && this.isPermisoOrdenTipoPrioridadPedido));			
			//this.jMenuItemDetalleMostrarOcultarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaOrdenTipoPrioridadPedido && this.isPermisoOrdenTipoPrioridadPedido));			
			this.jMenuItemNuevoRelacionesTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido));			
			this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaNuevoTipoPrioridadPedido && this.isPermisoNuevoTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));									
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemModificarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaModificarTipoPrioridadPedido && this.isPermisoActualizarTipoPrioridadPedido));	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemActualizarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaActualizarTipoPrioridadPedido && this.isPermisoActualizarTipoPrioridadPedido));	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemEliminarTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaEliminarTipoPrioridadPedido && this.isPermisoEliminarTipoPrioridadPedido));
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemCancelarTipoPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadPedido);				
			}
			
			this.jMenuItemGuardarCambiosTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));						
			this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=this.jButtonNuevoTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaDuplicarTipoPrioridadPedido=this.jButtonDuplicarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCopiarTipoPrioridadPedido=this.jButtonCopiarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaVerFormTipoPrioridadPedido=this.jButtonVerFormTipoPrioridadPedido.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoPrioridadPedido=this.jButtonAbrirOrderByTipoPrioridadPedido.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=this.jButtonNuevoRelacionesTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=this.jButtonModificarTipoPrioridadPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaGuardarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=this.jButtonGuardarCambiosTablaTipoPrioridadPedido.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=this.jButtonNuevoToolBarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarToolBarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarToolBarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarToolBarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarToolBarTipoPrioridadPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrioridadPedido=this.jButtonGuardarCambiosToolBarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=this.jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=this.jMenuItemNuevoTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=this.jMenuItemNuevoRelacionesTipoPrioridadPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemModificarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemActualizarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemEliminarTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemCancelarTipoPrioridadPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoPrioridadPedido=this.jMenuItemGuardarCambiosTipoPrioridadPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoPrioridadPedido(Boolean esInicializar) {
		if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrioridadPedido();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoPrioridadPedido(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoPrioridadPedido() {
		this.jButtonNuevoTipoPrioridadPedido.setVisible(this.isPermisoNuevoTipoPrioridadPedido);			
		this.jButtonDuplicarTipoPrioridadPedido.setVisible(this.isPermisoDuplicarTipoPrioridadPedido);			
		this.jButtonCopiarTipoPrioridadPedido.setVisible(this.isPermisoCopiarTipoPrioridadPedido);			
		this.jButtonVerFormTipoPrioridadPedido.setVisible(this.isPermisoVerFormTipoPrioridadPedido);			
		
		this.jButtonAbrirOrderByTipoPrioridadPedido.setVisible(this.isPermisoOrdenTipoPrioridadPedido);					
		
		this.jButtonNuevoRelacionesTipoPrioridadPedido.setVisible(this.isPermisoNuevoTipoPrioridadPedido);			
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarTipoPrioridadPedido.setVisible(this.isPermisoActualizarTipoPrioridadPedido);	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarTipoPrioridadPedido.setVisible(this.isPermisoActualizarTipoPrioridadPedido);	
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarTipoPrioridadPedido.setVisible(this.isPermisoEliminarTipoPrioridadPedido);
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarTipoPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadPedido);						
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.setVisible(this.isPermisoGuardarCambiosTipoPrioridadPedido);							
		}
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.setVisible(this.isPermisoActualizarTipoPrioridadPedido);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrioridadPedido() {
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarTipoPrioridadPedido.setVisible(this.isPermisoActualizarTipoPrioridadPedido);	
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarTipoPrioridadPedido.setVisible(this.isPermisoActualizarTipoPrioridadPedido);	
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarTipoPrioridadPedido.setVisible(this.isPermisoEliminarTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarTipoPrioridadPedido.setVisible(this.isVisibilidadCeldaCancelarTipoPrioridadPedido);							
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.setVisible((this.isVisibilidadCeldaGuardarTipoPrioridadPedido && this.isPermisoGuardarCambiosTipoPrioridadPedido));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoPrioridadPedido() {
		if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoPrioridadPedido();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoPrioridadPedido() {
	}
	
	public void jTableDatosTipoPrioridadPedidoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoPrioridadPedido(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoPrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.gettipoprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadpedido==null) {
						this.tipoprioridadpedido = new TipoPrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
				}

				if(this.tipoprioridadpedido.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoprioridadpedido.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoPrioridadPedidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoPrioridadPedido(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoPrioridadPedido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoPrioridadPedido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.gettipoprioridadpedido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipoprioridadpedidoLogic.getConnexion());

				if(this.tipoprioridadpedido.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipoprioridadpedido.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoPrioridadPedido=(TitledBorder)this.jScrollPanelDatosTipoPrioridadPedido.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoPrioridadPedido.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoPrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.gettipoprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadpedido==null) {
						this.tipoprioridadpedido = new TipoPrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
				}

				if(this.tipoprioridadpedido.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipoprioridadpedido.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoPrioridadPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.gettipoprioridadpedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoprioridadpedido==null) {
						this.tipoprioridadpedido = new TipoPrioridadPedido();
					}

					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);
				}

				if(this.tipoprioridadpedido.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoprioridadpedido.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoPrioridadPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);

			this.getTipoPrioridadPedidosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoPrioridadPedido(false);

			//if(TipoPrioridadPedidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPaisTipoPrioridadPedidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);

			this.getTipoPrioridadPedidosFK_IdPais();

			this.inicializarActualizarBindingTipoPrioridadPedido(false);

			//if(TipoPrioridadPedidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoprioridadpedidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoPrioridadPedido() {
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.dispose();
			this.jInternalFrameDetalleFormTipoPrioridadPedido=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
			this.jInternalFrameReporteDinamicoTipoPrioridadPedido.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoPrioridadPedido.dispose();
			this.jInternalFrameReporteDinamicoTipoPrioridadPedido=null;
		}
		
		if(this.jInternalFrameImportacionTipoPrioridadPedido!=null) {
			this.jInternalFrameImportacionTipoPrioridadPedido.setVisible(false);	    			
			this.jInternalFrameImportacionTipoPrioridadPedido.dispose();
			this.jInternalFrameImportacionTipoPrioridadPedido=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoPrioridadPedido();
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoPrioridadPedido")) {
				jButtonDuplicarTipoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoPrioridadPedido")) {
				jButtonCopiarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoPrioridadPedido")) {
				jButtonVerFormTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoPrioridadPedido")) {
				jButtonDuplicarTipoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoPrioridadPedido")) {
				jButtonDuplicarTipoPrioridadPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoPrioridadPedido")) {
				jButtonModificarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoPrioridadPedido")) {
				jButtonModificarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoPrioridadPedido")) {
				jButtonModificarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoPrioridadPedido")) {
				jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoPrioridadPedido")) {
				jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoPrioridadPedido")) {
				jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoPrioridadPedido")) {
				jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoPrioridadPedido")) {
				jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoPrioridadPedido")) {
				jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoPrioridadPedido")) {
				jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoPrioridadPedido")) {
				jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoPrioridadPedido")) {
				jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoPrioridadPedido")) {
				jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoPrioridadPedido")) {
				jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoPrioridadPedido")) {
				jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoPrioridadPedido")) {
				jButtonMostrarOcultarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoPrioridadPedido")) {
				jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoPrioridadPedido")) {
				jButtonCopiarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoPrioridadPedido")) {
				jButtonVerFormTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoPrioridadPedido")) {
				jButtonCopiarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoPrioridadPedido")) {
				jButtonVerFormTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoPrioridadPedido")) {
				jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoPrioridadPedido")) {
				jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoPrioridadPedido")) {
				jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoPrioridadPedido")) {
				jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoPrioridadPedido")) {
				jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoPrioridadPedido")) {
				jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoPrioridadPedido")) {
				jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoPrioridadPedido")) {
				jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoPrioridadPedido")) {
				jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoPrioridadPedido") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoPrioridadPedido")) {
				jButtonAbrirOrderByTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoPrioridadPedido") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoPrioridadPedido")) {
				jButtonMostrarOcultarTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrioridadPedido")) {
				jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoPrioridadPedido")) {
				jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoPrioridadPedido")) {
				jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoPrioridadPedido")) {
				jButtonCerrarReporteDinamicoTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoPrioridadPedido")) {
				jButtonGenerarReporteDinamicoTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoPrioridadPedido")) {
				
				jButtonGenerarExcelReporteDinamicoTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoPrioridadPedido")) {
				jButtonCerrarImportacionTipoPrioridadPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoPrioridadPedido")) {
				
				jButtonGenerarImportacionTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoPrioridadPedido")) {
				
				jButtonAbrirImportacionTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoPrioridadPedido")) {
				jComboBoxTiposAccionesTipoPrioridadPedidoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoPrioridadPedido")) {
				jComboBoxTiposRelacionesTipoPrioridadPedidoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoPrioridadPedido")) {
				jComboBoxTiposAccionesTipoPrioridadPedidoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoPrioridadPedido")) {
				
				jComboBoxTiposSeleccionarTipoPrioridadPedidoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoPrioridadPedido")) {
				jTextFieldValorCampoGeneralTipoPrioridadPedidoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoPrioridadPedido")) {
				jButtonAbrirOrderByTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoPrioridadPedido")) {
				jButtonAbrirOrderByTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoPrioridadPedido")) {
				jButtonCerrarOrderByTipoPrioridadPedidoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPrioridadPedidoBusqueda")) {
				this.jButtonidTipoPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoPrioridadPedidoUpdate")) {
				this.jButtonid_paisTipoPrioridadPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoPrioridadPedidoBusqueda")) {
				this.jButtonid_paisTipoPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPrioridadPedidoBusqueda")) {
				this.jButtonnombreTipoPrioridadPedidoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoPrioridadPedido")) {
				this.jButtonBusquedaPorNombreTipoPrioridadPedidoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdPaisTipoPrioridadPedido")) {
				this.jButtonFK_IdPaisTipoPrioridadPedidoActionPerformed(evt);
			}
			
			;
			
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoPrioridadPedido();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoPrioridadPedido tipoprioridadpedidoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoprioridadpedidoLocal=this.tipoprioridadpedido;
			} else {
				tipoprioridadpedidoLocal=this.tipoprioridadpedidoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
							
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
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
			
			


			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
								
						
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
								
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
							
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
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
			
			


			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
								
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoPrioridadPedido")) {
					jCheckBoxSeleccionarTodosTipoPrioridadPedidoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoPrioridadPedido")) {
					jCheckBoxSeleccionadosTipoPrioridadPedidoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoPrioridadPedido")) {
					
				}
				
				


				
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
												
				
				


				
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
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
			
			


			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoprioridadpedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoprioridadpedido);
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
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
				
				


				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoPrioridadPedido.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoPrioridadPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoPrioridadPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoprioridadpedidoAnterior =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoPrioridadPedido")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoPrioridadPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoPrioridadPedido.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoprioridadpedido =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoprioridadpedido);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoPrioridadPedido")) {
				
				}
				
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoPrioridadPedido")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoPrioridadPedido.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoPrioridadPedido")) {
			
			}
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoPrioridadPedido();
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoPrioridadPedido")) {
				jButtonDuplicarTipoPrioridadPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoPrioridadPedido")) {
				jButtonCopiarTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoPrioridadPedido")) {
				jButtonVerFormTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoPrioridadPedido")) {
				jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoPrioridadPedido")) {
				jButtonModificarTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoPrioridadPedido")) {
				jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoPrioridadPedido")) {
				jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoPrioridadPedido")) {
				jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoPrioridadPedido")) {
				jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoPrioridadPedido")) {
				jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoPrioridadPedido")) {
				jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoPrioridadPedido")) {
				jButtonAbrirOrderByTipoPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoPrioridadPedido")) {
				jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoPrioridadPedido")) {
				jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoPrioridadPedido")) {
				jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoPrioridadPedidoBusqueda")) {
				this.jButtonidTipoPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoPrioridadPedidoUpdate")) {
				this.jButtonid_paisTipoPrioridadPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoPrioridadPedidoBusqueda")) {
				this.jButtonid_paisTipoPrioridadPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoPrioridadPedidoBusqueda")) {
				this.jButtonnombreTipoPrioridadPedidoBusquedaActionPerformed(evt);
			}
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoPrioridadPedido();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoPrioridadPedido")) {
				closingInternalFrameTipoPrioridadPedido();
				
			} else if(sTipo.equals("jButtonCancelarTipoPrioridadPedido")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoPrioridadPedido = (JInternalFrameBase)evt.getSource();
	            	
	            TipoPrioridadPedidoBeanSwingJInternalFrame jInternalFrameParent=(TipoPrioridadPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrioridadPedido.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoPrioridadPedidoActionPerformed(null);
			}
			
			TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoprioridadpedido,new Object(),this.tipoprioridadpedidoParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoPrioridadPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoPrioridadPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoPrioridadPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoprioridadpedido)) {
			if(!esControlTabla) {
				if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);			
				}
				
				if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprioridadpedidoReturnGeneral=tipoprioridadpedidoLogic.procesarEventosTipoPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos(),this.tipoprioridadpedido,this.tipoprioridadpedidoParameterGeneral,this.isEsNuevoTipoPrioridadPedido,classes);//this.tipoprioridadpedidoLogic.getTipoPrioridadPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral,this.tipoprioridadpedidoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrioridadPedido(classes,this.tipoprioridadpedidoReturnGeneral,this.tipoprioridadpedidoBean,false);
					}
						
					if(this.tipoprioridadpedidoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido());	
					}
						
					if(this.tipoprioridadpedidoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido(),classes);//this.tipoprioridadpedidoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoPrioridadPedido(this.tipoprioridadpedido,classes);//this.tipoprioridadpedidoBean);									
				}
			
				if(TipoPrioridadPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoPrioridadPedido(this.tipoprioridadpedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoPrioridadPedido(this.tipoprioridadpedido);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoprioridadpedidoAnterior!=null) {
						this.tipoprioridadpedido=this.tipoprioridadpedidoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoprioridadpedidoReturnGeneral=tipoprioridadpedidoLogic.procesarEventosTipoPrioridadPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos(),this.tipoprioridadpedido,this.tipoprioridadpedidoParameterGeneral,this.isEsNuevoTipoPrioridadPedido,classes);//this.tipoprioridadpedidoLogic.getTipoPrioridadPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoprioridadpedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido(),tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido(),this.tipoprioridadpedidos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoPrioridadPedido.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoPrioridadPedido.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoPrioridadPedido();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoPrioridadPedido() throws Exception {
		
		TipoPrioridadPedidoModel tipoprioridadpedidoModel=(TipoPrioridadPedidoModel)this.jTableDatosTipoPrioridadPedido.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoprioridadpedidoModel.tipoprioridadpedidos=this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoprioridadpedidoModel.tipoprioridadpedidos=this.tipoprioridadpedidos;
		}
		
		
		((TipoPrioridadPedidoModel) this.jTableDatosTipoPrioridadPedido.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoPrioridadPedido() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoprioridadpedidoAnterior(),this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoprioridadpedidoAnterior(),this.tipoprioridadpedidos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoPrioridadPedido();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
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
										
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadpedido,new Object(),generalEntityParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoPrioridadPedidoConstantesFunciones.getClassesRelationshipsOfTipoPrioridadPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoPrioridadPedidoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoPrioridadPedido(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoPrioridadPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoPrioridadPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoprioridadpedido,new Object(),generalEntityParameterGeneral,this.tipoprioridadpedidoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoPrioridadPedido(TipoPrioridadPedidoBean tipoprioridadpedidoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoPrioridadPedido(ArrayList<Classe> classes,TipoPrioridadPedidoReturnGeneral tipoprioridadpedidoReturnGeneral,TipoPrioridadPedidoBean tipoprioridadpedidoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoprioridadpedido)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido = new TipoPrioridadPedidoDetalleFormJInternalFrame(jDesktopPane,this.tipoprioridadpedidoSessionBean.getConGuardarRelaciones(),this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.setVisible(false);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.tipoprioridadpedidoLogic=this.tipoprioridadpedidoLogic;
		
		this.cargarCombosFrameForeignKeyTipoPrioridadPedido("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoPrioridadPedido();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoPrioridadPedido();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoPrioridadPedido("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoPrioridadPedido();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrioridadPedido"));
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarTipoPrioridadPedido"));

		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrioridadPedido"));
					
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemModificarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrioridadPedido"));
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrioridadPedido"));
						
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemActualizarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarTipoPrioridadPedido"));
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrioridadPedido"));
								
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemEliminarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarTipoPrioridadPedido"));
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrioridadPedido"));
					
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemCancelarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrioridadPedido"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemDetalleCerrarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrioridadPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrioridadPedido"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrioridadPedido"));
		
		
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrioridadPedido"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonidTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrioridadPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonid_paisTipoPrioridadPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoPrioridadPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonid_paisTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoPrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonnombreTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrioridadPedidoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrioridadPedido"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoPrioridadPedido"));
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoPrioridadPedido"));
		}
		
		this.jTableDatosTipoPrioridadPedido.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoPrioridadPedido"));
		
		this.jTableDatosTipoPrioridadPedido.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoPrioridadPedido"));
		
		this.jButtonNuevoTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"NuevoTipoPrioridadPedido"));
		
		this.jButtonDuplicarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"DuplicarTipoPrioridadPedido"));
		
		this.jButtonCopiarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"CopiarTipoPrioridadPedido"));
		
		this.jButtonVerFormTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"VerFormTipoPrioridadPedido"));
		
		
		this.jButtonNuevoToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoPrioridadPedido"));
			
		this.jButtonDuplicarToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoPrioridadPedido"));
			
		this.jMenuItemNuevoTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoPrioridadPedido"));
			
		this.jMenuItemDuplicarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoPrioridadPedido"));		
		
		
		this.jButtonNuevoRelacionesTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoPrioridadPedido"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoPrioridadPedido"));
			
		this.jMenuItemNuevoRelacionesTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoPrioridadPedido"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarTipoPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonModificarToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoPrioridadPedido"));
			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemModificarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"ActualizarTipoPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonActualizarToolBarTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoPrioridadPedido"));
				
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemActualizarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarTipoPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonEliminarToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoPrioridadPedido"));
						
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemEliminarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarTipoPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonCancelarToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoPrioridadPedido"));
			
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemCancelarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoPrioridadPedido"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoPrioridadPedido"));		
		
		
		this.jButtonCerrarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CerrarTipoPrioridadPedido"));
		
		
		this.jButtonCerrarToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoPrioridadPedido"));
			
		this.jMenuItemCerrarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoPrioridadPedido"));
			
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jMenuItemDetalleCerrarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoPrioridadPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoPrioridadPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoPrioridadPedido"));
		}
		
		this.jButtonCopiarToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoPrioridadPedido"));
			
		this.jButtonVerFormToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoPrioridadPedido"));
		
		this.jMenuItemGuardarCambiosTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoPrioridadPedido"));
			
		this.jMenuItemCopiarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoPrioridadPedido"));		
		
		this.jMenuItemVerFormTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoPrioridadPedido"));		
		
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrioridadPedido"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoPrioridadPedido"));
			
		this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoPrioridadPedido"));		
		
		
		
		this.jButtonRecargarInformacionTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoPrioridadPedido"));
					
		this.jButtonRecargarInformacionToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoPrioridadPedido"));
		
		this.jMenuItemRecargarInformacionTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoPrioridadPedido"));		
		
		
		
		this.jButtonAnterioresTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"AnterioresTipoPrioridadPedido"));
		
		
		this.jButtonAnterioresToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoPrioridadPedido"));
		
		this.jMenuItemAnterioresTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoPrioridadPedido"));		
		
		
		this.jButtonSiguientesTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"SiguientesTipoPrioridadPedido"));
		
		
		this.jButtonSiguientesToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoPrioridadPedido"));
			
		this.jMenuItemSiguientesTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoPrioridadPedido"));
			
		this.jMenuItemAbrirOrderByTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoPrioridadPedido"));
			
		this.jMenuItemMostrarOcultarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoPrioridadPedido"));
			
		this.jMenuItemDetalleAbrirOrderByTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoPrioridadPedido"));
			
		this.jMenuItemDetalleMostarOcultarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoPrioridadPedido"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoPrioridadPedido"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoPrioridadPedido"));
			
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoPrioridadPedido"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoPrioridadPedido"));

		this.jCheckBoxSeleccionadosTipoPrioridadPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoPrioridadPedido"));
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoPrioridadPedido"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoPrioridadPedido"));
			
		this.jComboBoxTiposAccionesTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoPrioridadPedido"));
					
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoPrioridadPedido"));
			
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoPrioridadPedido"));		
		
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonidTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrioridadPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonid_paisTipoPrioridadPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoPrioridadPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonid_paisTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoPrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonnombreTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrioridadPedidoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoPrioridadPedido"));

			this.jButtonFK_IdPaisTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoPrioridadPedido"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoPrioridadPedido!=null) {
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrioridadPedido"));
				this.jInternalFrameReporteDinamicoTipoPrioridadPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrioridadPedido"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoPrioridadPedido"));				
			//this.jButtonGenerarReporteDinamicoTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoPrioridadPedido"));
			//this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoPrioridadPedido"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoPrioridadPedido!=null) {
				this.jInternalFrameImportacionTipoPrioridadPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoPrioridadPedido"));
				this.jInternalFrameImportacionTipoPrioridadPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoPrioridadPedido"));
				this.jInternalFrameImportacionTipoPrioridadPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoPrioridadPedido"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoPrioridadPedido"));
			
			this.jButtonAbrirOrderByToolBarTipoPrioridadPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoPrioridadPedido"));			
			
			if(this.jInternalFrameOrderByTipoPrioridadPedido!=null) {
				this.jInternalFrameOrderByTipoPrioridadPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoPrioridadPedido"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoPrioridadPedido.jTabbedPaneRelacionesTipoPrioridadPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoPrioridadPedido"));
		
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
            		closingInternalFrameTipoPrioridadPedido();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoPrioridadPedido = (JInternalFrameBase)event.getSource();
	            	
	            TipoPrioridadPedidoBeanSwingJInternalFrame jInternalFrameParent=(TipoPrioridadPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoPrioridadPedido.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoPrioridadPedidoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoPrioridadPedido.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoPrioridadPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoPrioridadPedido.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoPrioridadPedido.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoPrioridadPedido";
		inputMap = this.jButtonNuevoTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoPrioridadPedido";
		inputMap = this.jButtonNuevoRelacionesTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoPrioridadPedidoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoPrioridadPedido";
		inputMap = this.jButtonModificarTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoPrioridadPedido";
		inputMap = this.jButtonActualizarTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoPrioridadPedido";
		inputMap = this.jButtonEliminarTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoPrioridadPedido";
		inputMap = this.jButtonCancelarTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoPrioridadPedido";
		inputMap = this.jButtonCerrarTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoPrioridadPedido";
		inputMap = this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonGuardarCambiosTipoPrioridadPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoPrioridadPedido.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoPrioridadPedidoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoPrioridadPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoPrioridadPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoPrioridadPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoPrioridadPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoPrioridadPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoPrioridadPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonidTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoPrioridadPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonid_paisTipoPrioridadPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoPrioridadPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonid_paisTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoPrioridadPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jButtonnombreTipoPrioridadPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoPrioridadPedidoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoPrioridadPedido"));

		this.jButtonFK_IdPaisTipoPrioridadPedido.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoPrioridadPedido"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoPrioridadPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoPrioridadPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoPrioridadPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoPrioridadPedido.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoPrioridadPedido(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
					tipoprioridadpedidoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidos) {
					tipoprioridadpedidoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoPrioridadPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
						tipoprioridadpedidoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidos) {
						tipoprioridadpedidoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrioridadPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrioridadPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoPrioridadPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoPrioridadPedido.getSelectedRows();
			
			TipoPrioridadPedido tipoprioridadpedidoLocal=new TipoPrioridadPedido();
			
			//this.seleccionarTodosTipoPrioridadPedido(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoprioridadpedidoLocal =(TipoPrioridadPedido) this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos().toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoprioridadpedidoLocal =(TipoPrioridadPedido) this.tipoprioridadpedidos.toArray()[this.jTableDatosTipoPrioridadPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoprioridadpedidoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
						tipoprioridadpedidoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidos) {
						tipoprioridadpedidoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoPrioridadPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoPrioridadPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoPrioridadPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoPrioridadPedidoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoPrioridadPedidoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoPrioridadPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoPrioridadPedido.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
				
						if(sTipoSeleccionar.equals(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprioridadpedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidos) {
					
						if(sTipoSeleccionar.equals(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoprioridadpedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoPrioridadPedidoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoPrioridadPedido=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoPrioridadPedido.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoPrioridadPedido) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoPrioridadPedido(conSplash);
				
					this.generarReporteTipoPrioridadPedidosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoPrioridadPedidosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPrioridadPedidosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoPrioridadPedidosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrioridadPedido();
				
				this.exportarTipoPrioridadPedidosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoPrioridadPedidos();
				//this.importarTipoPrioridadPedidos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoPrioridadPedido();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoPrioridadPedidosSeleccionados();
				//this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Prioridad Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoPrioridadPedido();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoPrioridadPedido)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoPrioridadPedido(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoPrioridadPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxTiposAccionesFormularioTipoPrioridadPedido.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoPrioridadPedido();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoPrioridadPedido(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoPrioridadPedidoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoPrioridadPedido();
			
			if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
			TipoPrioridadPedido tipoprioridadpedido=new TipoPrioridadPedido();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoPrioridadPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoPrioridadPedido.getSelectedItem();
			
			
			
			
			tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoprioridadpedidosSeleccionados.size()==1) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosSeleccionados) {
					tipoprioridadpedido=tipoprioridadpedidoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoPrioridadPedido();
			
      		//this.finishProcessTipoPrioridadPedido(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoPrioridadPedidoReturnGeneral() throws Exception {
		if(this.tipoprioridadpedidoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoprioridadpedidoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoprioridadpedidoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoprioridadpedidoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoprioridadpedidoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoprioridadpedidoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
		}
		
		if(this.tipoprioridadpedidoReturnGeneral.getConRetornoLista() || this.tipoprioridadpedidoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoprioridadpedidoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprioridadpedidoLogic.setTipoPrioridadPedidos(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedidos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoprioridadpedidoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoprioridadpedidoLogic.setTipoPrioridadPedido(this.tipoprioridadpedidoReturnGeneral.getTipoPrioridadPedido());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoPrioridadPedido(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoPrioridadPedido() throws Exception {
		
		
	}
	
	public ArrayList<TipoPrioridadPedido> getTipoPrioridadPedidosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoPrioridadPedido) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidoLogic.getTipoPrioridadPedidos()) {
					if(tipoprioridadpedidoAux.getIsSelected()) {
						tipoprioridadpedidosSeleccionados.add(tipoprioridadpedidoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoPrioridadPedido tipoprioridadpedidoAux:this.tipoprioridadpedidos) {
					if(tipoprioridadpedidoAux.getIsSelected()) {
						tipoprioridadpedidosSeleccionados.add(tipoprioridadpedidoAux);				
					}
				}
			}
			
			if(tipoprioridadpedidosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoprioridadpedidosSeleccionados.addAll(this.tipoprioridadpedidoLogic.getTipoPrioridadPedidos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoprioridadpedidosSeleccionados.addAll(this.tipoprioridadpedidos);				
					}
				}
			}
		} else {
			tipoprioridadpedidosSeleccionados.add(this.tipoprioridadpedido);
		}
		
		return tipoprioridadpedidosSeleccionados;
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
	
	public void generarReporteTipoPrioridadPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoPrioridadPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoPrioridadPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPrioridadPedidosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoPrioridadPedidosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Prioridad Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoPrioridadPedidosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoPrioridadPedido();
		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoPrioridadPedido();
		
		
		//this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados ,tipoprioridadpedidoImplementable,tipoprioridadpedidoImplementableHome);
	}
	
	public void mostrarImportacionTipoPrioridadPedidos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoPrioridadPedido();
		
		this.abrirFrameImportacionTipoPrioridadPedido();		
		
			
		//this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados ,tipoprioridadpedidoImplementable,tipoprioridadpedidoImplementableHome);
	}
	
	public void importarTipoPrioridadPedidos() throws Exception {		
	
	}
	
	public void exportarTipoPrioridadPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoPrioridadPedidosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoPrioridadPedidosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoPrioridadPedidosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Prioridad Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoPrioridadPedido(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoPrioridadPedido(tipoprioridadpedidoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoprioridadpedidoAux.setsDetalleGeneralEntityReporte(tipoprioridadpedidoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoPrioridadPedido(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoPrioridadPedidoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadPedidoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoprioridadpedido.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadpedido.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadpedido.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoprioridadpedido.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoPrioridadPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoPrioridadPedido(row);				
				iRow++;
			}				
			
			for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoPrioridadPedido(tipoprioridadpedidoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoPrioridadPedidosSeleccionados() throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();		
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoprioridadpedido.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoprioridadpedidos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoprioridadpedido");
			//elementRoot.appendChild(element);
		
			for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosSeleccionados) {
				element = document.createElement("tipoprioridadpedido");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoPrioridadPedido(tipoprioridadpedidoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Prioridad Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoPrioridadPedido(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadpedido.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadpedido.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoprioridadpedido.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoPrioridadPedido(TipoPrioridadPedido tipoprioridadpedido,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoPrioridadPedidoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoprioridadpedido.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoPrioridadPedidoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoprioridadpedido.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoPrioridadPedidoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipoprioridadpedido.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoPrioridadPedidoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoprioridadpedido.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoPrioridadPedidosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados=new ArrayList<TipoPrioridadPedido>();
		
		tipoprioridadpedidosSeleccionados=this.getTipoPrioridadPedidosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoPrioridadPedido(tipoprioridadpedidosSeleccionados);
		
		this.generarReporteTipoPrioridadPedidos("Todos",tipoprioridadpedidosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoPrioridadPedido(ArrayList<TipoPrioridadPedido> tipoprioridadpedidosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoPrioridadPedido tipoprioridadpedidoAux:tipoprioridadpedidosSeleccionados) {
				tipoprioridadpedidoAux.setsDetalleGeneralEntityReporte(tipoprioridadpedidoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoPrioridadPedidoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipoprioridadpedidoAux.setsDescripcionGeneralEntityReporte1(tipoprioridadpedidoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoPrioridadPedidoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoprioridadpedidoAux.setsDescripcionGeneralEntityReporte1(tipoprioridadpedidoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoPrioridadPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoPrioridadPedido(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoPrioridadPedido=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=true;
				this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=true;
			}
			
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=true;
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
			this.isVisibilidadCeldaModificarTipoPrioridadPedido=true;
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaCancelarTipoPrioridadPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoPrioridadPedido=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoPrioridadPedidoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=true;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=true;
		} else {
			this.actualizarEstadoPanelsTipoPrioridadPedido(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoPrioridadPedido=false;
			//this.isVisibilidadCeldaVerFormTipoPrioridadPedido=false;
			this.isVisibilidadCeldaDuplicarTipoPrioridadPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoPrioridadPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoPrioridadPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoprioridadpedidoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;												
			}
			
			this.jButtonCerrarTipoPrioridadPedido.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoPrioridadPedido=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoprioridadpedido)) {
			this.isVisibilidadCeldaActualizarTipoPrioridadPedido=false;
			this.isVisibilidadCeldaEliminarTipoPrioridadPedido=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoPrioridadPedido() {
	}
	
	public void actualizarEstadoPanelsTipoPrioridadPedido(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosEdicionTipoPrioridadPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoPrioridadPedido!=null) {
				this.jScrollPanelDatosTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoPrioridadPedido!=null) {
				this.jPanelPaginacionTipoPrioridadPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
					this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoprioridadpedidoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoPrioridadPedido!=null) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoPrioridadPedido!=null) {
				this.jPanelParametrosReportesTipoPrioridadPedido.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadBusquedaPorNombre=isParaPaisNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoPrioridadPedido.remove(jPanelBusquedaPorNombreTipoPrioridadPedido);}

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoPrioridadPedido.remove(jPanelFK_IdPaisTipoPrioridadPedido);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoPrioridadPedidoSessionBean tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
		
		if(this.tipoprioridadpedidoSessionBean==null) {
			this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
		}
		
		this.tipoprioridadpedidoSessionBean.setsUltimaBusquedaTipoPrioridadPedido(this.getsAccionBusqueda());
		this.tipoprioridadpedidoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoprioridadpedidoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoprioridadpedidoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipoprioridadpedidoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoPrioridadPedidoSessionBean tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
		
		if(this.tipoprioridadpedidoSessionBean==null) {
			this.tipoprioridadpedidoSessionBean=new TipoPrioridadPedidoSessionBean();
		}
		
		if(this.tipoprioridadpedidoSessionBean.getsUltimaBusquedaTipoPrioridadPedido()!=null&&!this.tipoprioridadpedidoSessionBean.getsUltimaBusquedaTipoPrioridadPedido().equals("")) {
			this.setsAccionBusqueda(tipoprioridadpedidoSessionBean.getsUltimaBusquedaTipoPrioridadPedido());
			this.setiNumeroPaginacion(tipoprioridadpedidoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoprioridadpedidoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoprioridadpedidoSessionBean.getnombre());
				tipoprioridadpedidoSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipoprioridadpedidoSessionBean.getid_pais());
				tipoprioridadpedidoSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipoprioridadpedidoSessionBean.setsUltimaBusquedaTipoPrioridadPedido("");
		this.tipoprioridadpedidoSessionBean.setiNumeroPaginacion(TipoPrioridadPedidoConstantesFunciones.INUMEROPAGINACION);
		this.tipoprioridadpedidoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoPrioridadPedido(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoPrioridadPedido() {
		this.updateBorderResaltarBusquedasFormularioTipoPrioridadPedido();
		this.updateVisibilidadBusquedasFormularioTipoPrioridadPedido();
		this.updateHabilitarBusquedasFormularioTipoPrioridadPedido();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoPrioridadPedido() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponents().length>0) {
	

		if(this.tipoprioridadpedidoConstantesFunciones.resaltarBusquedaPorNombreTipoPrioridadPedido!=null) {
			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombreTipoPrioridadPedido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);
				jPanel.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltarBusquedaPorNombreTipoPrioridadPedido);
			}
		}

		if(this.tipoprioridadpedidoConstantesFunciones.resaltarFK_IdPaisTipoPrioridadPedido!=null) {
			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelFK_IdPaisTipoPrioridadPedido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);
				jPanel.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltarFK_IdPaisTipoPrioridadPedido);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoPrioridadPedido() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombreTipoPrioridadPedido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostrarBusquedaPorNombreTipoPrioridadPedido);
			if(!this.tipoprioridadpedidoConstantesFunciones.mostrarBusquedaPorNombreTipoPrioridadPedido && index>-1) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelFK_IdPaisTipoPrioridadPedido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostrarFK_IdPaisTipoPrioridadPedido);
			if(!this.tipoprioridadpedidoConstantesFunciones.mostrarFK_IdPaisTipoPrioridadPedido && index>-1) {
				this.jTabbedPaneBusquedasTipoPrioridadPedido.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoPrioridadPedido() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombreTipoPrioridadPedido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoprioridadpedidoConstantesFunciones.activarBusquedaPorNombreTipoPrioridadPedido);
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setEnabledAt(index,this.tipoprioridadpedidoConstantesFunciones.activarBusquedaPorNombreTipoPrioridadPedido);
			}

			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelFK_IdPaisTipoPrioridadPedido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoprioridadpedidoConstantesFunciones.activarFK_IdPaisTipoPrioridadPedido);
				this.jTabbedPaneBusquedasTipoPrioridadPedido.setEnabledAt(index,this.tipoprioridadpedidoConstantesFunciones.activarFK_IdPaisTipoPrioridadPedido);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoPrioridadPedido(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelBusquedaPorNombreTipoPrioridadPedido);

			this.jTabbedPaneBusquedasTipoPrioridadPedido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);

			this.tipoprioridadpedidoConstantesFunciones.setResaltarBusquedaPorNombreTipoPrioridadPedido(resaltar);

			jPanel.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltarBusquedaPorNombreTipoPrioridadPedido);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoPrioridadPedido.indexOfComponent(this.jPanelFK_IdPaisTipoPrioridadPedido);

			this.jTabbedPaneBusquedasTipoPrioridadPedido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoPrioridadPedido.getComponent(index);

			this.tipoprioridadpedidoConstantesFunciones.setResaltarFK_IdPaisTipoPrioridadPedido(resaltar);

			jPanel.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltarFK_IdPaisTipoPrioridadPedido);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoPrioridadPedido.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoPrioridadPedido() throws Exception {

		if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoPrioridadPedido();
		this.updateVisibilidadResaltarControlesFormularioTipoPrioridadPedido();
		this.updateHabilitarResaltarControlesFormularioTipoPrioridadPedido();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoPrioridadPedido() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoprioridadpedidoConstantesFunciones.resaltaridTipoPrioridadPedido!=null && this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltaridTipoPrioridadPedido);}
		if(this.tipoprioridadpedidoConstantesFunciones.resaltarid_paisTipoPrioridadPedido!=null && this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltarid_paisTipoPrioridadPedido);}
		if(this.tipoprioridadpedidoConstantesFunciones.resaltarnombreTipoPrioridadPedido!=null && this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setBorder(this.tipoprioridadpedidoConstantesFunciones.resaltarnombreTipoPrioridadPedido);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoPrioridadPedido() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
	
		//this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostraridTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelidTipoPrioridadPedido.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostraridTipoPrioridadPedido);
		//this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostrarid_paisTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelid_paisTipoPrioridadPedido.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostrarid_paisTipoPrioridadPedido);
		//this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostrarnombreTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jPanelnombreTipoPrioridadPedido.setVisible(this.tipoprioridadpedidoConstantesFunciones.mostrarnombreTipoPrioridadPedido);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoPrioridadPedido() throws Exception {
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoPrioridadPedido!=null) {
	
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jLabelidTipoPrioridadPedido.setEnabled(this.tipoprioridadpedidoConstantesFunciones.activaridTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jComboBoxid_paisTipoPrioridadPedido.setEnabled(this.tipoprioridadpedidoConstantesFunciones.activarid_paisTipoPrioridadPedido);
		this.jInternalFrameDetalleFormTipoPrioridadPedido.jTextAreanombreTipoPrioridadPedido.setEnabled(this.tipoprioridadpedidoConstantesFunciones.activarnombreTipoPrioridadPedido);
		}
	}
	
		
}