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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoEstadoPedidoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoEstadoPedidoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoEstadoPedidoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoEstadoPedidoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
public class TipoEstadoPedidoBeanSwingJInternalFrame extends TipoEstadoPedidoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoEstadoPedidoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoEstadoPedido> tipoestadopedidoValidator = new ClassValidator<TipoEstadoPedido>(TipoEstadoPedido.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoEstadoPedido tipoestadopedido;	
	public TipoEstadoPedido tipoestadopedidoAux;
	public TipoEstadoPedido tipoestadopedidoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoEstadoPedido tipoestadopedidoTotales;
	public Long idTipoEstadoPedidoActual;
	public Long iIdNuevoTipoEstadoPedido=0L;
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
	
	public Boolean isPermisoTodoTipoEstadoPedido;
	public Boolean isPermisoNuevoTipoEstadoPedido;
	public Boolean isPermisoActualizarTipoEstadoPedido;
	public Boolean isPermisoActualizarOriginalTipoEstadoPedido;
	public Boolean isPermisoEliminarTipoEstadoPedido;
	public Boolean isPermisoGuardarCambiosTipoEstadoPedido;
	public Boolean isPermisoConsultaTipoEstadoPedido;
	public Boolean isPermisoBusquedaTipoEstadoPedido;
	public Boolean isPermisoReporteTipoEstadoPedido;
	public Boolean isPermisoPaginacionMedioTipoEstadoPedido;
	public Boolean isPermisoPaginacionAltoTipoEstadoPedido;
	public Boolean isPermisoPaginacionTodoTipoEstadoPedido;
	public Boolean isPermisoCopiarTipoEstadoPedido;
	public Boolean isPermisoVerFormTipoEstadoPedido;
	public Boolean isPermisoDuplicarTipoEstadoPedido;
	public Boolean isPermisoOrdenTipoEstadoPedido;
	
	
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
	
	public TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoReturnGeneral;
	public TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoEstadoPedido=false;
	public Boolean esParaAccionDesdeFormularioTipoEstadoPedido=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoEstadoPedidoLogic tipoestadopedidoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoEstadoPedido tipoestadopedidoBean;
	public TipoEstadoPedidoConstantesFunciones tipoestadopedidoConstantesFunciones;
	//public TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoReturnGeneral;
	
	//FK
	
	public PaisLogic paisLogic;
	
	//PARAMETROS
	
	
	//public List<TipoEstadoPedido> tipoestadopedidos;	
	//public List<TipoEstadoPedido> tipoestadopedidosEliminados;
	//public List<TipoEstadoPedido> tipoestadopedidosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoEstadoPedido=false;
	public Boolean isVisibilidadCeldaDuplicarTipoEstadoPedido=true;
	public Boolean isVisibilidadCeldaCopiarTipoEstadoPedido=true;
	public Boolean isVisibilidadCeldaVerFormTipoEstadoPedido=true;
	public Boolean isVisibilidadCeldaOrdenTipoEstadoPedido=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
	public Boolean isVisibilidadCeldaModificarTipoEstadoPedido=false;
	public Boolean isVisibilidadCeldaActualizarTipoEstadoPedido=false;
	public Boolean isVisibilidadCeldaEliminarTipoEstadoPedido=false;
	public Boolean isVisibilidadCeldaCancelarTipoEstadoPedido=false;
	public Boolean isVisibilidadCeldaGuardarTipoEstadoPedido=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;	
	
	
	public Boolean isVisibilidadFK_IdPais=false;
	
	public Long getiIdNuevoTipoEstadoPedido() {
		return this.iIdNuevoTipoEstadoPedido;
	}

	public void setiIdNuevoTipoEstadoPedido(Long iIdNuevoTipoEstadoPedido) {
		this.iIdNuevoTipoEstadoPedido = iIdNuevoTipoEstadoPedido;
	}
	
	public Long getidTipoEstadoPedidoActual() {
		return this.idTipoEstadoPedidoActual;
	}

	public void setidTipoEstadoPedidoActual(Long idTipoEstadoPedidoActual) {
		this.idTipoEstadoPedidoActual = idTipoEstadoPedidoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoEstadoPedido gettipoestadopedido() {
		return this.tipoestadopedido;
	}

	public void settipoestadopedido(TipoEstadoPedido tipoestadopedido) {
		this.tipoestadopedido = tipoestadopedido;
	}
	
	public TipoEstadoPedido gettipoestadopedidoAux() {
		return this.tipoestadopedidoAux;
	}

	public void settipoestadopedidoAux(TipoEstadoPedido tipoestadopedidoAux) {
		this.tipoestadopedidoAux = tipoestadopedidoAux;
	}				
	
	public TipoEstadoPedido gettipoestadopedidoAnterior() {
		return this.tipoestadopedidoAnterior;
	}

	public void settipoestadopedidoAnterior(TipoEstadoPedido tipoestadopedidoAnterior) {
		this.tipoestadopedidoAnterior = tipoestadopedidoAnterior;
	}	
	
	public TipoEstadoPedido gettipoestadopedidoTotales() {
		return this.tipoestadopedidoTotales;
	}

	public void settipoestadopedidoTotales(TipoEstadoPedido tipoestadopedidoTotales) {
		this.tipoestadopedidoTotales = tipoestadopedidoTotales;
	}	
	
	public TipoEstadoPedido gettipoestadopedidoBean() {
		return this.tipoestadopedidoBean;
	}

	public void settipoestadopedidoBean(TipoEstadoPedido tipoestadopedidoBean) {
		this.tipoestadopedidoBean = tipoestadopedidoBean;
	}	
	
	public TipoEstadoPedidoParameterReturnGeneral gettipoestadopedidoReturnGeneral() {
		return this.tipoestadopedidoReturnGeneral;
	}

	public void settipoestadopedidoReturnGeneral(TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoReturnGeneral) {
		this.tipoestadopedidoReturnGeneral = tipoestadopedidoReturnGeneral;
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
	
	
	public TipoEstadoPedidoLogic getTipoEstadoPedidoLogic()	{		
		return tipoestadopedidoLogic;
	}

	public void setTipoEstadoPedidoLogic(TipoEstadoPedidoLogic tipoestadopedidoLogic) {
		this.tipoestadopedidoLogic = tipoestadopedidoLogic;
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
	
	public Boolean getIsEsNuevoTipoEstadoPedido() {
		return isEsNuevoTipoEstadoPedido;
	}

	public void setIsEsNuevoTipoEstadoPedido(Boolean isEsNuevoTipoEstadoPedido) {
		this.isEsNuevoTipoEstadoPedido = isEsNuevoTipoEstadoPedido;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoEstadoPedido() {
		return esParaAccionDesdeFormularioTipoEstadoPedido;
	}
	
	public void setEsParaAccionDesdeFormularioTipoEstadoPedido(Boolean esParaAccionDesdeFormularioTipoEstadoPedido) {
		this.esParaAccionDesdeFormularioTipoEstadoPedido = esParaAccionDesdeFormularioTipoEstadoPedido;
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

			if(this.tipoestadopedidoSessionBean==null) {
				this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
			}

			if(!this.tipoestadopedidoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
					paisLogic.getEntityWithConnection(tipoestadopedidoSessionBean.getlidPaisActual());
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

					if(this.tipoestadopedido!=null) {
						this.tipoestadopedido.setPais(paisTemp);
					}

					if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
						this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setSelectedItem(paisTemp);
					}
				} else {
					//jComboBoxid_paisTipoEstadoPedido.setSelectedItem(paisTemp);
					if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
						if(this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){
					if(paisTemp!=null && jComboBoxid_paisFK_IdPaisTipoEstadoPedido!=null) {
						jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setSelectedItem(paisTemp);
					} else {
						if(jComboBoxid_paisFK_IdPaisTipoEstadoPedido!=null) {
							//jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setSelectedItem(paisTemp);
							if(jComboBoxid_paisFK_IdPaisTipoEstadoPedido.getItemCount()>0) {
								jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setSelectedIndex(0);
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
	public void setActualPaisForeignKeyGenerico(Long idPaisSeleccionado,JComboBox jComboBoxid_paisTipoEstadoPedidoGenerico)throws Exception
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
				jComboBoxid_paisTipoEstadoPedidoGenerico.setSelectedItem(paisTemp);
			} else {
				if(jComboBoxid_paisTipoEstadoPedidoGenerico!=null && jComboBoxid_paisTipoEstadoPedidoGenerico.getItemCount()>0) {
					jComboBoxid_paisTipoEstadoPedidoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPaisForeignKey(TipoEstadoPedido tipoestadopedido,JComboBox jComboBoxid_paisTipoEstadoPedidoGenerico)throws Exception
	{
		try
		{
			Pais  paisAux=new Pais();

			if(jComboBoxid_paisTipoEstadoPedidoGenerico==null) {
				paisAux=(Pais)this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.getSelectedItem();
			} else {
				paisAux=(Pais)jComboBoxid_paisTipoEstadoPedidoGenerico.getSelectedItem();
			}

			if(paisAux!=null && paisAux.getId()!=null) {
				tipoestadopedido.setid_pais(paisAux.getId());
				tipoestadopedido.setpais_descripcion(TipoEstadoPedidoConstantesFunciones.getPaisDescripcion(paisAux));
				tipoestadopedido.setPais(paisAux);			}
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

					if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { 
							this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.addItem(pais);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { 
					}

					if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdPais") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoEstadoPedido.removeAllItems();

							for(Pais pais:this.paissForeignKey) {
								this.jComboBoxid_paisFK_IdPaisTipoEstadoPedido.addItem(pais);
							}
						}

						if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
							this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setSelectedItem(pais);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
							this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setSelectedItem(pais);
						} else {
							this.jComboBoxid_paisFK_IdPaisTipoEstadoPedido.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoEstadoPedido() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoEstadoPedidoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEstadoPedido(this.tipoestadopedidoLogic.getTipoEstadoPedidos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoEstadoPedidoConstantesFunciones.refrescarForeignKeysDescripcionesTipoEstadoPedido(this.tipoestadopedidos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Pais.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoestadopedidoLogic.setTipoEstadoPedidos(this.tipoestadopedidos);
			tipoestadopedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoEstadoPedidoParameterReturnGeneral getTipoEstadoPedidoParameterGeneral() {
		return this.tipoestadopedidoParameterGeneral;
	}
	
	public void setTipoEstadoPedidoParameterGeneral(TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoParameterGeneral) {
		this.tipoestadopedidoParameterGeneral = tipoestadopedidoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoEstadoPedido() {
		return isPermisoTodoTipoEstadoPedido;
	}

	public void setIsPermisoTodoTipoEstadoPedido(Boolean isPermisoTodoTipoEstadoPedido) {
		this.isPermisoTodoTipoEstadoPedido = isPermisoTodoTipoEstadoPedido;
	}

	public Boolean getIsPermisoNuevoTipoEstadoPedido() {
		return isPermisoNuevoTipoEstadoPedido;
	}

	public void setIsPermisoNuevoTipoEstadoPedido(Boolean isPermisoNuevoTipoEstadoPedido) {
		this.isPermisoNuevoTipoEstadoPedido = isPermisoNuevoTipoEstadoPedido;
	}

	public Boolean getIsPermisoActualizarTipoEstadoPedido() {
		return isPermisoActualizarTipoEstadoPedido;
	}

	public void setIsPermisoActualizarTipoEstadoPedido(Boolean isPermisoActualizarTipoEstadoPedido) {
		this.isPermisoActualizarTipoEstadoPedido = isPermisoActualizarTipoEstadoPedido;
	}

	public Boolean getIsPermisoEliminarTipoEstadoPedido() {
		return isPermisoEliminarTipoEstadoPedido;
	}

	public void setIsPermisoEliminarTipoEstadoPedido(Boolean isPermisoEliminarTipoEstadoPedido) {
		this.isPermisoEliminarTipoEstadoPedido = isPermisoEliminarTipoEstadoPedido;
	}

	public Boolean getIsPermisoGuardarCambiosTipoEstadoPedido() {
		return isPermisoGuardarCambiosTipoEstadoPedido;
	}

	public void setIsPermisoGuardarCambiosTipoEstadoPedido(Boolean isPermisoGuardarCambiosTipoEstadoPedido) {
		this.isPermisoGuardarCambiosTipoEstadoPedido = isPermisoGuardarCambiosTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoConsultaTipoEstadoPedido() {
		return isPermisoConsultaTipoEstadoPedido;
	}

	public void setIsPermisoConsultaTipoEstadoPedido(Boolean isPermisoConsultaTipoEstadoPedido) {
		this.isPermisoConsultaTipoEstadoPedido = isPermisoConsultaTipoEstadoPedido;
	}

	public Boolean getIsPermisoBusquedaTipoEstadoPedido() {
		return isPermisoBusquedaTipoEstadoPedido;
	}

	public void setIsPermisoBusquedaTipoEstadoPedido(Boolean isPermisoBusquedaTipoEstadoPedido) {
		this.isPermisoBusquedaTipoEstadoPedido = isPermisoBusquedaTipoEstadoPedido;
	}

	public Boolean getIsPermisoReporteTipoEstadoPedido() {
		return isPermisoReporteTipoEstadoPedido;
	}

	public void setIsPermisoReporteTipoEstadoPedido(Boolean isPermisoReporteTipoEstadoPedido) {
		this.isPermisoReporteTipoEstadoPedido = isPermisoReporteTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoEstadoPedido() {
		return isPermisoPaginacionMedioTipoEstadoPedido;
	}

	public void setIsPermisoPaginacionMedioTipoEstadoPedido(Boolean isPermisoPaginacionMedioTipoEstadoPedido) {
		this.isPermisoPaginacionMedioTipoEstadoPedido = isPermisoPaginacionMedioTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoEstadoPedido() {
		return isPermisoPaginacionTodoTipoEstadoPedido;
	}

	public void setIsPermisoPaginacionTodoTipoEstadoPedido(Boolean isPermisoPaginacionTodoTipoEstadoPedido) {
		this.isPermisoPaginacionTodoTipoEstadoPedido = isPermisoPaginacionTodoTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoEstadoPedido() {
		return isPermisoPaginacionAltoTipoEstadoPedido;
	}

	public void setIsPermisoPaginacionAltoTipoEstadoPedido(Boolean isPermisoPaginacionAltoTipoEstadoPedido) {
		this.isPermisoPaginacionAltoTipoEstadoPedido = isPermisoPaginacionAltoTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoCopiarTipoEstadoPedido() {
		return isPermisoCopiarTipoEstadoPedido;
	}

	public void setIsPermisoCopiarTipoEstadoPedido(Boolean isPermisoCopiarTipoEstadoPedido) {
		this.isPermisoCopiarTipoEstadoPedido = isPermisoCopiarTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoVerFormTipoEstadoPedido() {
		return isPermisoVerFormTipoEstadoPedido;
	}

	public void setIsPermisoVerFormTipoEstadoPedido(Boolean isPermisoVerFormTipoEstadoPedido) {
		this.isPermisoVerFormTipoEstadoPedido = isPermisoVerFormTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoDuplicarTipoEstadoPedido() {
		return isPermisoDuplicarTipoEstadoPedido;
	}

	public void setIsPermisoDuplicarTipoEstadoPedido(Boolean isPermisoDuplicarTipoEstadoPedido) {
		this.isPermisoDuplicarTipoEstadoPedido = isPermisoDuplicarTipoEstadoPedido;
	}
	
	public Boolean getIsPermisoOrdenTipoEstadoPedido() {
		return isPermisoOrdenTipoEstadoPedido;
	}

	public void setIsPermisoOrdenTipoEstadoPedido(Boolean isPermisoOrdenTipoEstadoPedido) {
		this.isPermisoOrdenTipoEstadoPedido = isPermisoOrdenTipoEstadoPedido;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoEstadoPedido() {
		return isVisibilidadCeldaNuevoTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaNuevoTipoEstadoPedido(Boolean isVisibilidadCeldaNuevoTipoEstadoPedido) {
		this.isVisibilidadCeldaNuevoTipoEstadoPedido = isVisibilidadCeldaNuevoTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoEstadoPedido() {
		return isVisibilidadCeldaDuplicarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaDuplicarTipoEstadoPedido(Boolean isVisibilidadCeldaDuplicarTipoEstadoPedido) {
		this.isVisibilidadCeldaDuplicarTipoEstadoPedido = isVisibilidadCeldaDuplicarTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoEstadoPedido() {
		return isVisibilidadCeldaCopiarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaCopiarTipoEstadoPedido(Boolean isVisibilidadCeldaCopiarTipoEstadoPedido) {
		this.isVisibilidadCeldaCopiarTipoEstadoPedido = isVisibilidadCeldaCopiarTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoEstadoPedido() {
		return isVisibilidadCeldaVerFormTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaVerFormTipoEstadoPedido(Boolean isVisibilidadCeldaVerFormTipoEstadoPedido) {
		this.isVisibilidadCeldaVerFormTipoEstadoPedido = isVisibilidadCeldaVerFormTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoEstadoPedido() {
		return isVisibilidadCeldaOrdenTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaOrdenTipoEstadoPedido(Boolean isVisibilidadCeldaOrdenTipoEstadoPedido) {
		this.isVisibilidadCeldaOrdenTipoEstadoPedido = isVisibilidadCeldaOrdenTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoEstadoPedido() {
		return isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoEstadoPedido(Boolean isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido) {
		this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido = isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoEstadoPedido() {
		return isVisibilidadCeldaModificarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaModificarTipoEstadoPedido(Boolean isVisibilidadCeldaModificarTipoEstadoPedido) {
		this.isVisibilidadCeldaModificarTipoEstadoPedido = isVisibilidadCeldaModificarTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoEstadoPedido() {
		return isVisibilidadCeldaActualizarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaActualizarTipoEstadoPedido(Boolean isVisibilidadCeldaActualizarTipoEstadoPedido) {
		this.isVisibilidadCeldaActualizarTipoEstadoPedido = isVisibilidadCeldaActualizarTipoEstadoPedido;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoEstadoPedido() {
		return isVisibilidadCeldaEliminarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaEliminarTipoEstadoPedido(Boolean isVisibilidadCeldaEliminarTipoEstadoPedido) {
		this.isVisibilidadCeldaEliminarTipoEstadoPedido = isVisibilidadCeldaEliminarTipoEstadoPedido;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoEstadoPedido() {
		return isVisibilidadCeldaCancelarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaCancelarTipoEstadoPedido(Boolean isVisibilidadCeldaCancelarTipoEstadoPedido) {
		this.isVisibilidadCeldaCancelarTipoEstadoPedido = isVisibilidadCeldaCancelarTipoEstadoPedido;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoEstadoPedido() {
		return isVisibilidadCeldaGuardarTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaGuardarTipoEstadoPedido(Boolean isVisibilidadCeldaGuardarTipoEstadoPedido) {
		this.isVisibilidadCeldaGuardarTipoEstadoPedido = isVisibilidadCeldaGuardarTipoEstadoPedido;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoEstadoPedido() {
		return isVisibilidadCeldaGuardarCambiosTipoEstadoPedido;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoEstadoPedido(Boolean isVisibilidadCeldaGuardarCambiosTipoEstadoPedido) {
		this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido = isVisibilidadCeldaGuardarCambiosTipoEstadoPedido;
	}
		
	public TipoEstadoPedidoSessionBean gettipoestadopedidoSessionBean() {
		return this.tipoestadopedidoSessionBean;
	}
	
	public void settipoestadopedidoSessionBean(TipoEstadoPedidoSessionBean tipoestadopedidoSessionBean) {
		this.tipoestadopedidoSessionBean=tipoestadopedidoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdPais() {
		return this.isVisibilidadFK_IdPais;
	}

	public void setisVisibilidadFK_IdPais(Boolean isVisibilidadFK_IdPais) {
		this.isVisibilidadFK_IdPais=isVisibilidadFK_IdPais;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(TipoEstadoPedido tipoestadopedido)throws Exception {
		try {
			
				this.setActualParaGuardarPaisForeignKey(tipoestadopedido,null);
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
	
	public void bugActualizarReferenciaActual(TipoEstadoPedido tipoestadopedido,TipoEstadoPedido tipoestadopedidoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoEstadoPedido(tipoestadopedido);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoestadopedidoAux.setId(tipoestadopedido.getId());
		tipoestadopedidoAux.setVersionRow(tipoestadopedido.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoEstadoPedido();
		
			int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoestadopedidoValidator.getInvalidValues(this.tipoestadopedido);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoestadopedidoLogic.setDatosCliente(datosCliente);
			tipoestadopedidoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoestadopedidoAux=new  TipoEstadoPedido();
				
				tipoestadopedidoAux.setIsNew(true);
				tipoestadopedidoAux.setIsChanged(true);
				
				tipoestadopedidoAux.setTipoEstadoPedidoOriginal(this.tipoestadopedido);
				
				tipoestadopedidoAux.setId(this.tipoestadopedido.getId());	
				tipoestadopedidoAux.setVersionRow(this.tipoestadopedido.getVersionRow());	
				tipoestadopedidoAux.setid_pais(this.tipoestadopedido.getid_pais());	
				tipoestadopedidoAux.setnombre(this.tipoestadopedido.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoestadopedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoestadopedidoAux,tipoestadopedidoLogic.getTipoEstadoPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadopedidoAux,tipoestadopedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidoLogic.saveTipoEstadoPedidos();//WithConnection
						//tipoestadopedidoLogic.getSetVersionRowTipoEstadoPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoestadopedido,tipoestadopedidoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEstadoPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoestadopedidoAux=new  TipoEstadoPedido();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoestadopedidoSessionBean.getEsGuardarRelacionado() && this.tipoestadopedido.getId()>=0)) {
						
					tipoestadopedidoAux.setIsNew(false);
				}
				
				tipoestadopedidoAux.setIsDeleted(false);
			
				tipoestadopedidoAux.setId(this.tipoestadopedido.getId());	
				tipoestadopedidoAux.setVersionRow(this.tipoestadopedido.getVersionRow());	
				tipoestadopedidoAux.setid_pais(this.tipoestadopedido.getid_pais());	
				tipoestadopedidoAux.setnombre(this.tipoestadopedido.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoestadopedidoAux,tipoestadopedidoLogic.getTipoEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadopedidoAux,tipoestadopedidos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidoLogic.saveTipoEstadoPedidos();//WithConnection
						//tipoestadopedidoLogic.getSetVersionRowTipoEstadoPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoestadopedido,tipoestadopedidoAux);
					
					this.refrescarForeignKeysDescripcionesTipoEstadoPedido();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoestadopedidoAux=new  TipoEstadoPedido();
				
				tipoestadopedidoAux.setIsNew(false);
				tipoestadopedidoAux.setIsChanged(false);
				
				tipoestadopedidoAux.setIsDeleted(true);
				
				tipoestadopedidoAux.setId(this.tipoestadopedido.getId());	
				tipoestadopedidoAux.setVersionRow(this.tipoestadopedido.getVersionRow());	
				tipoestadopedidoAux.setid_pais(this.tipoestadopedido.getid_pais());	
				tipoestadopedidoAux.setnombre(this.tipoestadopedido.getnombre());	
				
				if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoestadopedidoAux.getId()>=0) {	
						this.tipoestadopedidosEliminados.add(tipoestadopedidoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoestadopedidoAux,tipoestadopedidoLogic.getTipoEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadopedidoAux,tipoestadopedidos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidoLogic.saveTipoEstadoPedidos();//WithConnection
						//tipoestadopedidoLogic.getSetVersionRowTipoEstadoPedidos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoestadopedidoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoestadopedidoAux,tipoestadopedidoLogic.getTipoEstadoPedidos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoestadopedidoAux,tipoestadopedidos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.getTipoEstadoPedidos().addAll(this.tipoestadopedidosEliminados);
					
					tipoestadopedidoLogic.saveTipoEstadoPedidos();//WithConnection
					//tipoestadopedidoLogic.getSetVersionRowTipoEstadoPedidos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoEstadoPedido();
				
				this.tipoestadopedidosEliminados= new ArrayList<TipoEstadoPedido>();		
			}
			
			if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Estado Pedido GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoestadopedido=tipoestadopedidoAux;
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
      		//this.finishProcessTipoEstadoPedido();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoEstadoPedido tipoestadopedidoLocal) throws Exception {
		
		if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoEstadoPedido tipoestadopedidoLocal) throws Exception {	
		if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(PaisDetalleFormJInternalFrame.class)) {
				PaisBeanSwingJInternalFrame paisBeanSwingJInternalFrameLocal=(PaisBeanSwingJInternalFrame) ((PaisDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				paisBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPais(paisBeanSwingJInternalFrameLocal.getpais(),true);
				paisBeanSwingJInternalFrameLocal.actualizarLista(paisBeanSwingJInternalFrameLocal.pais,this.paissForeignKey);

				paisBeanSwingJInternalFrameLocal.actualizarRelaciones(paisBeanSwingJInternalFrameLocal.pais);

				tipoestadopedidoLocal.setPais(paisBeanSwingJInternalFrameLocal.pais);

				this.addItemDefectoCombosForeignKeyPais();
				this.cargarCombosFramePaissForeignKey("Formulario");
				this.setActualPaisForeignKey(paisBeanSwingJInternalFrameLocal.pais.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoEstadoPedidoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoestadopedidoValidator.getInvalidValues(this.tipoestadopedido);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoEstadoPedido tipoestadopedido,List<TipoEstadoPedido> tipoestadopedidos) throws Exception {
		try	{		
			TipoEstadoPedidoConstantesFunciones.actualizarLista(tipoestadopedido,tipoestadopedidos,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoEstadoPedido tipoestadopedido,List<TipoEstadoPedido> tipoestadopedidos) throws Exception {
		try	{			
			TipoEstadoPedidoConstantesFunciones.actualizarSelectedLista(tipoestadopedido,tipoestadopedidos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoEstadoPedido> tipoestadopedidosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoestadopedidosLocal=this.tipoestadopedidoLogic.getTipoEstadoPedidos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoestadopedidosLocal=this.tipoestadopedidos;
			}
			//ARCHITECTURE
		
			for(TipoEstadoPedido tipoestadopedidoLocal:tipoestadopedidosLocal) {
				if(this.permiteMantenimiento(tipoestadopedidoLocal) && tipoestadopedidoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoEstadoPedidoConstantesFunciones.getTipoEstadoPedidoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoEstadoPedidoConstantesFunciones.IDPAIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoPedido.jLabelid_paisTipoEstadoPedido,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoEstadoPedidoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoPedido.jLabelnombreTipoEstadoPedido,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEstadoPedido.jLabelid_paisTipoEstadoPedido,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoEstadoPedido.jLabelnombreTipoEstadoPedido,"");
		
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
		this.iIdNuevoTipoEstadoPedido--;	
		
		
		this.tipoestadopedidoAux=new TipoEstadoPedido();
		
		this.tipoestadopedidoAux.setId(this.iIdNuevoTipoEstadoPedido);
		this.tipoestadopedidoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoestadopedidoLogic.getTipoEstadoPedidos().add(this.tipoestadopedidoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoestadopedidos.add(this.tipoestadopedidoAux);
		}
		//ARCHITECTURE
		
		this.tipoestadopedido=this.tipoestadopedidoAux;
		
		if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedido);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoPedido(this.tipoestadopedido);
		}
				
		//this.setDefaultControlesTipoEstadoPedido();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoEstadoPedido();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoEstadoPedido();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstadoPedido();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEstadoPedido(this.tipoestadopedidoBean,this.tipoestadopedido,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
			classes=TipoEstadoPedidoConstantesFunciones.getClassesRelationshipsOfTipoEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoestadopedidoReturnGeneral=tipoestadopedidoLogic.procesarEventosTipoEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestadopedidoLogic.getTipoEstadoPedidos(),this.tipoestadopedido,this.tipoestadopedidoParameterGeneral,this.isEsNuevoTipoEstadoPedido,classes);//this.tipoestadopedidoLogic.getTipoEstadoPedido()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoEstadoPedido(this.tipoestadopedidoReturnGeneral,this.tipoestadopedidoBean,false);
		
		if(this.tipoestadopedidoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido());
		}
		
		if(this.tipoestadopedidoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido(),classes);//this.tipoestadopedidoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoEstadoPedido();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoEstadoPedido();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoEstadoPedido(false);
						
			if(tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstadoPedido();
			}
			
			this.actualizarVisualTableDatosTipoEstadoPedido();
			
			this.jTableDatosTipoEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoPedido(), this.getIndiceNuevoTipoEstadoPedido());
			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
						
			this.actualizarEstadoCeldasBotonesTipoEstadoPedido("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoEstadoPedido(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setEnabled(isHabilitar && this.tipoestadopedidoConstantesFunciones.activarnombreTipoEstadoPedido);	
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setEnabled(isHabilitar && this.tipoestadopedidoConstantesFunciones.activarid_paisTipoEstadoPedido);
	};
	
	public void setDefaultControlesTipoEstadoPedido() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoEstadoPedido(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoestadopedidoSessionBean.setConGuardarRelaciones(true);			
			this.tipoestadopedidoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.setVisible(true);
			
					
		} else {
			//this.tipoestadopedidoSessionBean.setConGuardarRelaciones(false);			
			this.tipoestadopedidoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoEstadoPedido() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
				if(tipoestadopedidoAux.getId().equals(this.iIdNuevoTipoEstadoPedido)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidos) {
				if(tipoestadopedidoAux.getId().equals(this.iIdNuevoTipoEstadoPedido)) {
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
	
	public int getIndiceActualTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
				if(tipoestadopedidoAux.getId().equals(tipoestadopedido.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidos) {
				if(tipoestadopedidoAux.getId().equals(tipoestadopedido.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoEstadoPedido(TipoEstadoPedido tipoestadopedidoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
				if(tipoestadopedidoAux.getTipoEstadoPedidoOriginal().getId().equals(tipoestadopedidoOriginal.getId())) {
					existe=true;
					tipoestadopedidoOriginal.setId(tipoestadopedidoAux.getId());
					tipoestadopedidoOriginal.setVersionRow(tipoestadopedidoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidos) {
				if(tipoestadopedidoAux.getTipoEstadoPedidoOriginal().getId().equals(tipoestadopedidoOriginal.getId())) {
					existe=true;
					tipoestadopedidoOriginal.setId(tipoestadopedidoAux.getId());
					tipoestadopedidoOriginal.setVersionRow(tipoestadopedidoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoEstadoPedido(Boolean esParaCancelar) throws Exception {
		tipoestadopedidosAux=new ArrayList<TipoEstadoPedido>();
		tipoestadopedidoAux=new TipoEstadoPedido();
		
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
					if(tipoestadopedidoAux.getId()<0) {
						tipoestadopedidosAux.add(tipoestadopedidoAux);
					}		
				}
				this.iIdNuevoTipoEstadoPedido=0L;
				this.tipoestadopedidoLogic.getTipoEstadoPedidos().removeAll(tipoestadopedidosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidos) {
					if(tipoestadopedidoAux.getId()<0) {
						tipoestadopedidosAux.add(tipoestadopedidoAux);
					}		
				}
				this.iIdNuevoTipoEstadoPedido=0L;
				this.tipoestadopedidos.removeAll(tipoestadopedidosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoEstadoPedido 
					&& this.tipoestadopedidoLogic.getTipoEstadoPedidos().size()>0
					) {
					tipoestadopedidoAux=this.tipoestadopedidoLogic.getTipoEstadoPedidos().get(this.tipoestadopedidoLogic.getTipoEstadoPedidos().size() - 1);
				
					if(tipoestadopedidoAux.getId()<0) {
						this.tipoestadopedidoLogic.getTipoEstadoPedidos().remove(tipoestadopedidoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoEstadoPedido && this.tipoestadopedidos.size()>0) {
					tipoestadopedidoAux=this.tipoestadopedidos.get(this.tipoestadopedidos.size() - 1);
				
					if(tipoestadopedidoAux.getId()<0) {
						this.tipoestadopedidos.remove(tipoestadopedidoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoEstadoPedido(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoestadopedido.getId()<0) {
				this.tipoestadopedidoLogic.getTipoEstadoPedidos().remove(this.tipoestadopedido);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoestadopedido.getId()<0) {
				this.tipoestadopedidos.remove(this.tipoestadopedido);
			}
		}			
	}
	
	public void setEstadosInicialesTipoEstadoPedido(List<TipoEstadoPedido> tipoestadopedidosAux) throws Exception {
		TipoEstadoPedidoConstantesFunciones.setEstadosInicialesTipoEstadoPedido(tipoestadopedidosAux);
	}
	
	public void setEstadosInicialesTipoEstadoPedido(TipoEstadoPedido tipoestadopedidoAux) throws Exception {
		TipoEstadoPedidoConstantesFunciones.setEstadosInicialesTipoEstadoPedido(tipoestadopedidoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoEstadoPedidoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoEstadoPedidoActual()) {
				if(!this.isEsNuevoTipoEstadoPedido) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoEstadoPedido=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoEstadoPedidoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Estado Pedido ?", "MANTENIMIENTO DE Tipo Estado Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoEstadoPedido tipoestadopedido) throws Exception {
		TipoEstadoPedidoConstantesFunciones.seleccionarAsignar(this.tipoestadopedido,tipoestadopedido);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoEstadoPedido=this.isPermisoActualizarOriginalTipoEstadoPedido;
			
			
			this.seleccionarAsignar(tipoestadopedido);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoEstadoPedidoConstantesFunciones.quitarEspaciosTipoEstadoPedido(this.tipoestadopedido,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoEstadoPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoestadopedidoSessionBean.setsFuncionBusquedaRapida(this.tipoestadopedidoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoEstadoPedido) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoEstadoPedido(esParaCancelar);				
				this.cancelarNuevoTipoEstadoPedido(esParaCancelar);								
			}
			
			this.tipoestadopedido=new TipoEstadoPedido();
			
			this.inicializarTipoEstadoPedido();
			
			this.actualizarEstadoCeldasBotonesTipoEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoEstadoPedido() throws Exception {
		try {
			TipoEstadoPedidoConstantesFunciones.inicializarTipoEstadoPedido(this.tipoestadopedido);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoestadopedidoLogic.getTipoEstadoPedidos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoEstadoPedidos(String sAccionBusqueda,List<TipoEstadoPedido> tipoestadopedidosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoEstadoPedido"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoEstadoPedidoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoEstadoPedidoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoEstadoPedido"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Estado Pedidos");		
		parameters.put("busquedapor", TipoEstadoPedidoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoEstadoPedido=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoEstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoEstadoPedidoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoEstadoPedido=new JRBeanArrayDataSource(TipoEstadoPedidoJInternalFrame.TraerTipoEstadoPedidoBeans(tipoestadopedidosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoEstadoPedido);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoEstadoPedidoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoEstadoPedidoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoEstadoPedidoBean.TraerTipoEstadoPedidoBeans(tipoestadopedidosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoestadopedidosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoestadopedidosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedidoActionPerformed(null);
					//this.generarExcelReporteTipoEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoestadopedidosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoestadopedidosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoestadopedidosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoEstadoPedidos(sAccionBusqueda,sTipoArchivoReporte,tipoestadopedidosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoEstadoPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstadoPedido> tipoestadopedidosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstadoPedidos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEstadoPedido("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoEstadoPedido tipoestadopedido : tipoestadopedidosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoEstadoPedidoConstantesFunciones.generarExcelReporteDataTipoEstadoPedido("NORMAL",row,workbook,tipoestadopedido,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoEstadoPedido(String sTipo,Row row,Workbook workbook) {
		
		TipoEstadoPedidoConstantesFunciones.generarExcelReporteHeaderTipoEstadoPedido(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoEstadoPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstadoPedido> tipoestadopedidosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstadoPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoEstadoPedido tipoestadopedido : tipoestadopedidosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoEstadoPedidoConstantesFunciones.getTipoEstadoPedidoDescripcion(tipoestadopedido));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoestadopedido.getpais_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoestadopedido.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoEstadoPedidos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoEstadoPedido> tipoestadopedidosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoEstadoPedido> tipoestadopedidosRespaldo=null;
		
		classes=TipoEstadoPedidoConstantesFunciones.getClassesRelationshipsOfTipoEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoestadopedidoLogic.setDatosCliente(this.datosCliente);
		this.tipoestadopedidoLogic.setDatosDeep(this.datosDeep);
		this.tipoestadopedidoLogic.setIsConDeep(true);
		
		tipoestadopedidosRespaldo=this.tipoestadopedidoLogic.getTipoEstadoPedidos();
		
		this.tipoestadopedidoLogic.setTipoEstadoPedidos(tipoestadopedidosParaReportes);	
		this.tipoestadopedidoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoestadopedidosParaReportes=this.tipoestadopedidoLogic.getTipoEstadoPedidos();
		this.tipoestadopedidoLogic.setTipoEstadoPedidos(tipoestadopedidosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoEstadoPedidos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoEstadoPedido("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoEstadoPedido tipoestadopedido : tipoestadopedidosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoEstadoPedido("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoEstadoPedidoConstantesFunciones.generarExcelReporteDataTipoEstadoPedido("NORMAL",row,workbook,tipoestadopedido,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoEstadoPedidoConstantesFunciones.getTipoEstadoPedidoDescripcion(tipoestadopedido));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoEstadoPedido() throws Exception {		
		this.startProcessTipoEstadoPedido(true);
	}
	
	public void startProcessTipoEstadoPedido(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoEstadoPedido ,this.jPanelParametrosReportesTipoEstadoPedido, this.jScrollPanelDatosTipoEstadoPedido,this.jPanelPaginacionTipoEstadoPedido, this.jScrollPanelDatosEdicionTipoEstadoPedido, this.jPanelAccionesTipoEstadoPedido,this.jPanelAccionesFormularioTipoEstadoPedido,this.jmenuBarTipoEstadoPedido,this.jmenuBarDetalleTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,this.jTtoolBarDetalleTipoEstadoPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEstadoPedido=this.jTabbedPaneBusquedasTipoEstadoPedido; 
		
		final JPanel jPanelParametrosReportesTipoEstadoPedido=this.jPanelParametrosReportesTipoEstadoPedido;
		//final JScrollPane jScrollPanelDatosTipoEstadoPedido=this.jScrollPanelDatosTipoEstadoPedido;
		final JTable jTableDatosTipoEstadoPedido=this.jTableDatosTipoEstadoPedido;		
		final JPanel jPanelPaginacionTipoEstadoPedido=this.jPanelPaginacionTipoEstadoPedido;
		//final JScrollPane jScrollPanelDatosEdicionTipoEstadoPedido=this.jScrollPanelDatosEdicionTipoEstadoPedido;
		final JPanel jPanelAccionesTipoEstadoPedido=this.jPanelAccionesTipoEstadoPedido;
		
		JPanel jPanelCamposAuxiliarTipoEstadoPedido=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoEstadoPedido=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			jPanelCamposAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelCamposTipoEstadoPedido;
			jPanelAccionesFormularioAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelAccionesFormularioTipoEstadoPedido;
		}
		
		final JPanel jPanelCamposTipoEstadoPedido=jPanelCamposAuxiliarTipoEstadoPedido;
		final JPanel jPanelAccionesFormularioTipoEstadoPedido=jPanelAccionesFormularioAuxiliarTipoEstadoPedido;
		
		
		final JMenuBar jmenuBarTipoEstadoPedido=this.jmenuBarTipoEstadoPedido;
		final JToolBar jTtoolBarTipoEstadoPedido=this.jTtoolBarTipoEstadoPedido;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoEstadoPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEstadoPedido=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			jmenuBarDetalleAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jmenuBarDetalleTipoEstadoPedido;
			jTtoolBarDetalleAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jTtoolBarDetalleTipoEstadoPedido;
		}
		
		final JMenuBar jmenuBarDetalleTipoEstadoPedido=jmenuBarDetalleAuxiliarTipoEstadoPedido;
		final JToolBar jTtoolBarDetalleTipoEstadoPedido=jTtoolBarDetalleAuxiliarTipoEstadoPedido;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEstadoPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEstadoPedido;
			processRunnable.jTableDatos=jTableDatosTipoEstadoPedido;
			processRunnable.jPanelCampos=jPanelCamposTipoEstadoPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEstadoPedido;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEstadoPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEstadoPedido;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEstadoPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEstadoPedido;
			processRunnable.jTtoolBar=jTtoolBarTipoEstadoPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEstadoPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEstadoPedido ,jPanelParametrosReportesTipoEstadoPedido,jTableDatosTipoEstadoPedido, /*jScrollPanelDatosTipoEstadoPedido,*/jPanelCamposTipoEstadoPedido,jPanelPaginacionTipoEstadoPedido, /*jScrollPanelDatosEdicionTipoEstadoPedido,*/ jPanelAccionesTipoEstadoPedido,jPanelAccionesFormularioTipoEstadoPedido,jmenuBarTipoEstadoPedido,jmenuBarDetalleTipoEstadoPedido,jTtoolBarTipoEstadoPedido,jTtoolBarDetalleTipoEstadoPedido);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoEstadoPedido ,jPanelParametrosReportesTipoEstadoPedido, jScrollPanelDatosTipoEstadoPedido,jPanelPaginacionTipoEstadoPedido, jScrollPanelDatosEdicionTipoEstadoPedido, jPanelAccionesTipoEstadoPedido,jPanelAccionesFormularioTipoEstadoPedido,jmenuBarTipoEstadoPedido,jmenuBarDetalleTipoEstadoPedido,jTtoolBarTipoEstadoPedido,jTtoolBarDetalleTipoEstadoPedido);
						
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
	
	public void finishProcessTipoEstadoPedido() {// throws Exception 
		this.finishProcessTipoEstadoPedido(true);
	}
	
	public void finishProcessTipoEstadoPedido(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoEstadoPedido ,this.jPanelParametrosReportesTipoEstadoPedido, this.jScrollPanelDatosTipoEstadoPedido,this.jPanelPaginacionTipoEstadoPedido, this.jScrollPanelDatosEdicionTipoEstadoPedido, this.jPanelAccionesTipoEstadoPedido,this.jPanelAccionesFormularioTipoEstadoPedido,this.jmenuBarTipoEstadoPedido,this.jmenuBarDetalleTipoEstadoPedido,this.jTtoolBarTipoEstadoPedido,this.jTtoolBarDetalleTipoEstadoPedido);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoEstadoPedido=this.jTabbedPaneBusquedasTipoEstadoPedido; 
		
		final JPanel jPanelParametrosReportesTipoEstadoPedido=this.jPanelParametrosReportesTipoEstadoPedido;
		//final JScrollPane jScrollPanelDatosTipoEstadoPedido=this.jScrollPanelDatosTipoEstadoPedido;
		final JTable jTableDatosTipoEstadoPedido=this.jTableDatosTipoEstadoPedido;		
		final JPanel jPanelPaginacionTipoEstadoPedido=this.jPanelPaginacionTipoEstadoPedido;
		//final JScrollPane jScrollPanelDatosEdicionTipoEstadoPedido=this.jScrollPanelDatosEdicionTipoEstadoPedido;
		final JPanel jPanelAccionesTipoEstadoPedido=this.jPanelAccionesTipoEstadoPedido;
		
		JPanel jPanelCamposAuxiliarTipoEstadoPedido=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoEstadoPedido=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			jPanelCamposAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelCamposTipoEstadoPedido;
			jPanelAccionesFormularioAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelAccionesFormularioTipoEstadoPedido;
		}
		
		final JPanel jPanelCamposTipoEstadoPedido=jPanelCamposAuxiliarTipoEstadoPedido;
		final JPanel jPanelAccionesFormularioTipoEstadoPedido=jPanelAccionesFormularioAuxiliarTipoEstadoPedido;
		
		
		final JMenuBar jmenuBarTipoEstadoPedido=this.jmenuBarTipoEstadoPedido;		
		final JToolBar jTtoolBarTipoEstadoPedido=this.jTtoolBarTipoEstadoPedido;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoEstadoPedido=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoEstadoPedido=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			jmenuBarDetalleAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jmenuBarDetalleTipoEstadoPedido;
			jTtoolBarDetalleAuxiliarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jTtoolBarDetalleTipoEstadoPedido;		
		}
		
		final JMenuBar jmenuBarDetalleTipoEstadoPedido=jmenuBarDetalleAuxiliarTipoEstadoPedido;
		final JToolBar jTtoolBarDetalleTipoEstadoPedido=jTtoolBarDetalleAuxiliarTipoEstadoPedido;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoEstadoPedido;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoEstadoPedido;
			processRunnable.jTableDatos=jTableDatosTipoEstadoPedido;
			processRunnable.jPanelCampos=jPanelCamposTipoEstadoPedido;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoEstadoPedido;
			processRunnable.jPanelAcciones=jPanelAccionesTipoEstadoPedido;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoEstadoPedido;
			
			
			processRunnable.jmenuBar=jmenuBarTipoEstadoPedido;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoEstadoPedido;
			processRunnable.jTtoolBar=jTtoolBarTipoEstadoPedido;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoEstadoPedido;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoEstadoPedido ,jPanelParametrosReportesTipoEstadoPedido, jTableDatosTipoEstadoPedido,/*jScrollPanelDatosTipoEstadoPedido,*/jPanelCamposTipoEstadoPedido,jPanelPaginacionTipoEstadoPedido, /*jScrollPanelDatosEdicionTipoEstadoPedido,*/ jPanelAccionesTipoEstadoPedido,jPanelAccionesFormularioTipoEstadoPedido,jmenuBarTipoEstadoPedido,jmenuBarDetalleTipoEstadoPedido,jTtoolBarTipoEstadoPedido,jTtoolBarDetalleTipoEstadoPedido));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoEstadoPedido(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoEstadoPedido(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoEstadoPedido(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoEstadoPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoEstadoPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoEstadoPedido,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoEstadoPedido(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoEstadoPedido,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoEstadoPedido,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoestadopedidoConstantesFunciones.getsFinalQueryTipoEstadoPedido();
		String  finalQueryPaginacionTodos=this.tipoestadopedidoConstantesFunciones.getsFinalQueryTipoEstadoPedido();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoEstadoPedidoConstantesFunciones.getArrayColumnasGlobalesNoTipoEstadoPedido(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoEstadoPedidoConstantesFunciones.getArrayColumnasGlobalesTipoEstadoPedido(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoEstadoPedidoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoestadopedidosEliminados= new ArrayList<TipoEstadoPedido>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoEstadoPedido();
		
				///*TipoEstadoPedidoSessionBean*/this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
			
			if(this.tipoestadopedidoSessionBean==null) {
				this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
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
					this.iNumeroPaginacion=TipoEstadoPedidoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoEstadoPedidoConstantesFunciones.getClassesForeignKeysOfTipoEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoestadopedido."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoestadopedidosAux= new ArrayList<TipoEstadoPedido>();
			
				
			tipoestadopedidoLogic.setDatosCliente(this.datosCliente);
			tipoestadopedidoLogic.setDatosDeep(this.datosDeep);
			tipoestadopedidoLogic.setIsConDeep(true);
			
			
			tipoestadopedidoLogic.getTipoEstadoPedidoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoestadopedidoLogic.getTodosTipoEstadoPedidos(finalQueryGlobal,pagination);
					
					//tipoestadopedidoLogic.getTodosTipoEstadoPedidosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoestadopedidoLogic.getTipoEstadoPedidos()==null|| tipoestadopedidoLogic.getTipoEstadoPedidos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestadopedidosAux= new ArrayList<TipoEstadoPedido>();
							tipoestadopedidosAux.addAll(tipoestadopedidoLogic.getTipoEstadoPedidos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadopedidosAux= new ArrayList<TipoEstadoPedido>();
							tipoestadopedidosAux.addAll(tipoestadopedidos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestadopedidoLogic.getTodosTipoEstadoPedidos(finalQueryGlobal+"",this.pagination);												
							
							//tipoestadopedidoLogic.getTodosTipoEstadoPedidosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidoLogic.getTipoEstadoPedidos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoestadopedidoLogic.setTipoEstadoPedidos(new ArrayList<TipoEstadoPedido>());					
							tipoestadopedidoLogic.getTipoEstadoPedidos().addAll(tipoestadopedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadopedidos=new ArrayList<TipoEstadoPedido>();
							tipoestadopedidos.addAll(tipoestadopedidosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoEstadoPedido=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoEstadoPedido=this.idActual;
				
				} else if(this.idTipoEstadoPedidoActual!=null && this.idTipoEstadoPedidoActual!=0L) {
					idTipoEstadoPedido=idTipoEstadoPedidoActual;
				}
				
					
				this.sDetalleReporte=TipoEstadoPedidoConstantesFunciones.getDetalleIndicePorId(idTipoEstadoPedido);
				
				this.tipoestadopedidos=new ArrayList<TipoEstadoPedido>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoestadopedidoLogic.getEntity(idTipoEstadoPedido);
					
					//tipoestadopedidoLogic.getEntityWithConnection(idTipoEstadoPedido);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadopedidoLogic.setTipoEstadoPedidos(new ArrayList<TipoEstadoPedido>());
					tipoestadopedidoLogic.getTipoEstadoPedidos().add(tipoestadopedidoLogic.getTipoEstadoPedido());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestadopedidos=new ArrayList<TipoEstadoPedido>();
					this.tipoestadopedidos.add(tipoestadopedido);
				}
				
				if(tipoestadopedidoLogic.getTipoEstadoPedido()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdPais")) {
				this.sDetalleReporte=TipoEstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoestadopedidoLogic.getTipoEstadoPedidosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoestadopedidoLogic.getTipoEstadoPedidos()==null||tipoestadopedidoLogic.getTipoEstadoPedidos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoestadopedidos==null|| tipoestadopedidos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidosAux=new ArrayList<TipoEstadoPedido>();
						tipoestadopedidosAux.addAll(tipoestadopedidoLogic.getTipoEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadopedidosAux=new ArrayList<TipoEstadoPedido>();
							tipoestadopedidosAux.addAll(tipoestadopedidos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoestadopedidoLogic.getTipoEstadoPedidosFK_IdPais(finalQueryGlobal,pagination,id_paisFK_IdPais);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoEstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoEstadoPedidoConstantesFunciones.getDetalleIndiceFK_IdPais(id_paisFK_IdPais);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoEstadoPedidos("FK_IdPais",tipoestadopedidoLogic.getTipoEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoEstadoPedidos("FK_IdPais",tipoestadopedidos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidoLogic.setTipoEstadoPedidos(new ArrayList<TipoEstadoPedido>());
						tipoestadopedidoLogic.getTipoEstadoPedidos().addAll(tipoestadopedidosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadopedidos=new ArrayList<TipoEstadoPedido>();
							tipoestadopedidos.addAll(tipoestadopedidosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoEstadoPedido();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoEstadoPedido();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoestadopedidoLogic.getTipoEstadoPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestadopedidos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoestadopedidoLogic.getTipoEstadoPedidos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoestadopedidos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoEstadoPedido tipoestadopedido) {
		Boolean permite=true;
		
		if(this.tipoestadopedido.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoEstadoPedidoConstantesFunciones.getOrderByListaTipoEstadoPedido();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoEstadoPedidoConstantesFunciones.getOrderByListaTipoEstadoPedido();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoPedido tipoestadopedido:tipoestadopedidoLogic.getTipoEstadoPedidos()) {
				if(tipoestadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadopedidoTotales=tipoestadopedido;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoPedido tipoestadopedido:this.tipoestadopedidos) {
				if(tipoestadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadopedidoTotales=tipoestadopedido;
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
			this.tipoestadopedidoAux=new TipoEstadoPedido();
			this.tipoestadopedidoAux.setsType(Constantes2.S_TOTALES);
			this.tipoestadopedidoAux.setIsNew(false);
			this.tipoestadopedidoAux.setIsChanged(false);
			this.tipoestadopedidoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoEstadoPedidoConstantesFunciones.TotalizarValoresFilaTipoEstadoPedido(this.tipoestadopedidoLogic.getTipoEstadoPedidos(),this.tipoestadopedidoAux);
				
				this.tipoestadopedidoLogic.getTipoEstadoPedidos().add(this.tipoestadopedidoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoEstadoPedidoConstantesFunciones.TotalizarValoresFilaTipoEstadoPedido(this.tipoestadopedidos,this.tipoestadopedidoAux);
				
				this.tipoestadopedidos.add(this.tipoestadopedidoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoestadopedidoTotales=new TipoEstadoPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoestadopedidoLogic.getTipoEstadoPedidos().remove(tipoestadopedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoestadopedidos.remove(tipoestadopedidoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoestadopedidoTotales=new TipoEstadoPedido();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoEstadoPedido tipoestadopedido:tipoestadopedidoLogic.getTipoEstadoPedidos()) {
				if(tipoestadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadopedidoTotales=tipoestadopedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEstadoPedidoConstantesFunciones.TotalizarValoresFilaTipoEstadoPedido(this.tipoestadopedidoLogic.getTipoEstadoPedidos(),tipoestadopedidoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoEstadoPedido tipoestadopedido:this.tipoestadopedidos) {
				if(tipoestadopedido.getsType().equals(Constantes2.S_TOTALES)) {
					tipoestadopedidoTotales=tipoestadopedido;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoEstadoPedidoConstantesFunciones.TotalizarValoresFilaTipoEstadoPedido(this.tipoestadopedidos,tipoestadopedidoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoEstadoPedidosFK_IdPais()throws Exception {
		try {
			sAccionBusqueda="FK_IdPais";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoEstadoPedidoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoEstadoPedidosFK_IdPais(String sFinalQuery,Long id_pais)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadopedidoLogic.getTipoEstadoPedidosFK_IdPais(sFinalQuery,this.pagination,id_pais);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoEstadoPedidoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadopedidoLogic.getTipoEstadoPedidoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoEstadoPedido() {
		this.isPermisoTodoTipoEstadoPedido=false;
		this.isPermisoNuevoTipoEstadoPedido=false;
		this.isPermisoActualizarTipoEstadoPedido=false;
		this.isPermisoActualizarOriginalTipoEstadoPedido=false;
		this.isPermisoEliminarTipoEstadoPedido=false;
		this.isPermisoGuardarCambiosTipoEstadoPedido=false;
		this.isPermisoConsultaTipoEstadoPedido=false;
		this.isPermisoBusquedaTipoEstadoPedido=false;
		this.isPermisoReporteTipoEstadoPedido=false;		
		this.isPermisoOrdenTipoEstadoPedido=false;		
		this.isPermisoPaginacionMedioTipoEstadoPedido=false;		
		this.isPermisoPaginacionAltoTipoEstadoPedido=false;
		this.isPermisoPaginacionTodoTipoEstadoPedido=false;
		this.isPermisoCopiarTipoEstadoPedido=false;		
		this.isPermisoVerFormTipoEstadoPedido=false;		
		this.isPermisoDuplicarTipoEstadoPedido=false;		
		this.isPermisoOrdenTipoEstadoPedido=false;		
	}
	
	public void setPermisosUsuarioTipoEstadoPedido(Boolean isPermiso) {
		this.isPermisoTodoTipoEstadoPedido=isPermiso;
		this.isPermisoNuevoTipoEstadoPedido=isPermiso;
		this.isPermisoActualizarTipoEstadoPedido=isPermiso;
		this.isPermisoActualizarOriginalTipoEstadoPedido=isPermiso;
		this.isPermisoEliminarTipoEstadoPedido=isPermiso;
		this.isPermisoGuardarCambiosTipoEstadoPedido=isPermiso;
		this.isPermisoConsultaTipoEstadoPedido=isPermiso;
		this.isPermisoBusquedaTipoEstadoPedido=isPermiso;
		this.isPermisoReporteTipoEstadoPedido=isPermiso;
		this.isPermisoOrdenTipoEstadoPedido=isPermiso;		
		this.isPermisoPaginacionMedioTipoEstadoPedido=isPermiso;		
		this.isPermisoPaginacionAltoTipoEstadoPedido=isPermiso;		
		this.isPermisoPaginacionTodoTipoEstadoPedido=isPermiso;		
		this.isPermisoCopiarTipoEstadoPedido=isPermiso;		
		this.isPermisoVerFormTipoEstadoPedido=isPermiso;		
		this.isPermisoDuplicarTipoEstadoPedido=isPermiso;
		this.isPermisoOrdenTipoEstadoPedido=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoEstadoPedido(Boolean isPermiso) {
		//this.isPermisoTodoTipoEstadoPedido=isPermiso;
		this.isPermisoNuevoTipoEstadoPedido=isPermiso;
		this.isPermisoActualizarTipoEstadoPedido=isPermiso;
		this.isPermisoActualizarOriginalTipoEstadoPedido=isPermiso;
		this.isPermisoEliminarTipoEstadoPedido=isPermiso;
		this.isPermisoGuardarCambiosTipoEstadoPedido=isPermiso;
		//this.isPermisoConsultaTipoEstadoPedido=isPermiso;
		//this.isPermisoBusquedaTipoEstadoPedido=isPermiso;
		//this.isPermisoReporteTipoEstadoPedido=isPermiso;
		//this.isPermisoOrdenTipoEstadoPedido=isPermiso;		
		//this.isPermisoPaginacionMedioTipoEstadoPedido=isPermiso;		
		//this.isPermisoPaginacionAltoTipoEstadoPedido=isPermiso;		
		//this.isPermisoPaginacionTodoTipoEstadoPedido=isPermiso;		
		//this.isPermisoCopiarTipoEstadoPedido=isPermiso;		
		//this.isPermisoDuplicarTipoEstadoPedido=isPermiso;
		//this.isPermisoOrdenTipoEstadoPedido=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoEstadoPedidoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoEstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoEstadoPedido(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoEstadoPedidoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoEstadoPedidoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoEstadoPedidoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoEstadoPedidoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoEstadoPedido() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoEstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoEstadoPedidoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoEstadoPedido=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoEstadoPedido=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoEstadoPedido=this.isPermisoActualizarTipoEstadoPedido;
			this.isPermisoEliminarTipoEstadoPedido=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoEstadoPedido=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoEstadoPedido=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoEstadoPedido=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoEstadoPedido=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoEstadoPedido=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEstadoPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoEstadoPedido=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoEstadoPedido=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoEstadoPedido=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoEstadoPedido=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoEstadoPedido=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoEstadoPedido=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoEstadoPedido=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoEstadoPedido.setToolTipText(this.jTableDatosTipoEstadoPedido.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoEstadoPedido(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoEstadoPedido(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoEstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoEstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoEstadoPedido() throws Exception {
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
	public void inicializarCombosForeignKeyTipoEstadoPedidoListas()throws Exception {
		try	{						
			
				this.paissForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoEstadoPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoEstadoPedidoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoEstadoPedidoListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoEstadoPedidoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoReturnGeneral=new TipoEstadoPedidoParameterReturnGeneral();
						
			


				String finalQueryGlobalPais="";

				if(((this.paissForeignKey==null||this.paissForeignKey.size()<=0) && this.tipoestadopedidoConstantesFunciones.cargarid_paisTipoEstadoPedido)
					 || (this.esRecargarFks && this.tipoestadopedidoConstantesFunciones.cargarid_paisTipoEstadoPedido)) {

					if(!this.tipoestadopedidoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PaisConstantesFunciones.getArrayColumnasGlobalesPais(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPais=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PaisConstantesFunciones.TABLENAME);

						finalQueryGlobalPais=Funciones.GetFinalQueryAppend(finalQueryGlobalPais, "");
						finalQueryGlobalPais+=PaisConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPaissForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPais=" WHERE " + ConstantesSql.ID + "="+tipoestadopedidoSessionBean.getlidPaisActual();
					}
				} else {
					finalQueryGlobalPais="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipoestadopedidoReturnGeneral=tipoestadopedidoLogic.cargarCombosLoteForeignKeyTipoEstadoPedido(finalQueryGlobalPais);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalPais.equals("NONE")) {
				this.paissForeignKey=tipoestadopedidoReturnGeneral.getpaissForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoEstadoPedido()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyPais();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyPais()throws Exception {
		try {
			if(this.tipoestadopedidoSessionBean==null) {
				this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
			}

			if(!this.tipoestadopedidoSessionBean.getisBusquedaDesdeForeignKeySesionPais()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoEstadoPedido()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoEstadoPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoEstadoPedido()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstadoPedido();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoEstadoPedido(TipoEstadoPedido tipoestadopedido)throws Exception {	
		try {
			
			this.setActualPaisForeignKey(tipoestadopedido.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoEstadoPedido()throws Exception {	
		try {
			
			this.setActualPaisForeignKey(this.tipoestadopedidoConstantesFunciones.getid_pais(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoEstadoPedido()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoEstadoPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoEstadoPedido()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoEstadoPedido()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoEstadoPedido()throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoEstadoPedido(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFramePaissForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoEstadoPedido()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido!=null && this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoEstadoPedidoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoEstadoPedidoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoEstadoPedidoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean(); 
		this.tipoestadopedidoConstantesFunciones=new TipoEstadoPedidoConstantesFunciones(); 
		this.tipoestadopedidoBean=new TipoEstadoPedido();//(this.tipoestadopedidoConstantesFunciones); 		
		this.tipoestadopedidoReturnGeneral=new TipoEstadoPedidoParameterReturnGeneral(); 
		
		this.tipoestadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoestadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoEstadoPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoEstadoPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoEstadoPedidoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoEstadoPedido(true);
			
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
			
			this.tipoestadopedidoConstantesFunciones=new TipoEstadoPedidoConstantesFunciones(); 
			this.tipoestadopedidoBean=new TipoEstadoPedido();//this.tipoestadopedidoConstantesFunciones); 			
			this.tipoestadopedidoReturnGeneral=new TipoEstadoPedidoParameterReturnGeneral(); 
		
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Estado Pedido Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoestadopedido=new TipoEstadoPedido();
			this.tipoestadopedidos = new ArrayList<TipoEstadoPedido>();
			this.tipoestadopedidosAux = new ArrayList<TipoEstadoPedido>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic=new TipoEstadoPedidoLogic();
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoestadopedidoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoestadopedidoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoEstadoPedido);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEstadoPedido);	
					}
					
					if(this.jInternalFrameImportacionTipoEstadoPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEstadoPedido);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoEstadoPedido!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoEstadoPedido);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEstadoPedido);
				this.jInternalFrameDetalleFormTipoEstadoPedido.setVisible(false);
				this.jInternalFrameDetalleFormTipoEstadoPedido.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEstadoPedido);
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoEstadoPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoEstadoPedido);
					this.jInternalFrameImportacionTipoEstadoPedido.setVisible(false);
					this.jInternalFrameImportacionTipoEstadoPedido.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoEstadoPedido!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoEstadoPedido);
					this.jInternalFrameOrderByTipoEstadoPedido.setVisible(false);
					this.jInternalFrameOrderByTipoEstadoPedido.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoEstadoPedidoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoEstadoPedidoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoestadopedidoReturnGeneral=new TipoEstadoPedidoParameterReturnGeneral();
			
			this.tipoestadopedidoParameterGeneral=new TipoEstadoPedidoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoestadopedidoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoEstadoPedidoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEstadoPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado(),this.tipoestadopedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoEstadoPedidoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado(),this.tipoestadopedidoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaDuplicarTipoEstadoPedido=true;
			this.isVisibilidadCeldaCopiarTipoEstadoPedido=true;
			this.isVisibilidadCeldaVerFormTipoEstadoPedido=true;
			this.isVisibilidadCeldaOrdenTipoEstadoPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
			this.isVisibilidadCeldaModificarTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=false;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
			
			
			this.isVisibilidadFK_IdPais=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoEstadoPedido();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoEstadoPedido(false);
			
			this.setPermisosUsuarioTipoEstadoPedido();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoestadopedidoSessionBean.getEsGuardarRelacionado() && this.tipoestadopedidoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoEstadoPedidoClasesRelacionadas();
			}
			
			if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoEstadoPedidoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoEstadoPedido();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoEstadoPedido();
			}
			
			if(!this.isPermisoBusquedaTipoEstadoPedido) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoEstadoPedido,this.isPermisoPaginacionMedioTipoEstadoPedido,this.isPermisoPaginacionTodoTipoEstadoPedido);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoEstadoPedidoConstantesFunciones.getTiposSeleccionarTipoEstadoPedido());
				
				this.tiposColumnasSelect=TipoEstadoPedidoConstantesFunciones.getTiposSeleccionarTipoEstadoPedido(true);
				
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
			//if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoEstadoPedido();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoEstadoPedido(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoEstadoPedido(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoPedido() ;
			
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
				tipoestadopedidoImplementable= (TipoEstadoPedidoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEstadoPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoestadopedidoImplementableHome= (TipoEstadoPedidoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoEstadoPedidoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoestadopedidos= new ArrayList<TipoEstadoPedido>();
			this.tipoestadopedidosEliminados= new ArrayList<TipoEstadoPedido>();
						
			this.isEsNuevoTipoEstadoPedido=false;
			this.esParaAccionDesdeFormularioTipoEstadoPedido=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.paissForeignKey=new ArrayList<Pais>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoEstadoPedido(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoEstadoPedido();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoEstadoPedidoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoEstadoPedido("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoEstadoPedido(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoEstadoPedido();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoEstadoPedido();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoEstadoPedido.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoEstadoPedido.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoEstadoPedido.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoEstadoPedido(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoEstadoPedido: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoEstadoPedido() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoEstadoPedido")) {
				iIndex=this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoEstadoPedido();	
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
	
	public void cargarCombosForeignKeyTipoEstadoPedido(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoEstadoPedido(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoEstadoPedido(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoEstadoPedidoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoEstadoPedido();
		
		this.cargarCombosFrameForeignKeyTipoEstadoPedido();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoEstadoPedido();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoEstadoPedido();
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
	
	public void jButtonNuevoTipoEstadoPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			
			if(jTableDatosTipoEstadoPedido.getRowCount()>=1) {
				jTableDatosTipoEstadoPedido.removeRowSelectionInterval(0, jTableDatosTipoEstadoPedido.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoEstadoPedido=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoEstadoPedido(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoEstadoPedido(true);			
			//this.tipoestadopedido=new TipoEstadoPedido();
			//this.tipoestadopedido.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstadoPedido(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido() ;
			
			if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstadoPedido(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoestadopedido);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);				
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoEstadoPedido: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoEstadoPedidoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoEstadoPedido.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoEstadoPedido.getSelectedRows().length;			
			}
			
			tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoEstadoPedido--;			
				//TipoEstadoPedido tipoestadopedidoAux= new TipoEstadoPedido();			
				//tipoestadopedidoAux.setId(this.iIdNuevoTipoEstadoPedido);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoEstadoPedido tipoestadopedidoOrigen=new TipoEstadoPedido();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoEstadoPedido tipoestadopedidoOrigen : tipoestadopedidosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoestadopedidoOrigen =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoestadopedidoOrigen =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoEstadoPedido();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoestadopedido.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoEstadoPedido(tipoestadopedidoOrigen,this.tipoestadopedido,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoestadopedidoLogic.getTipoEstadoPedidos().add(this.tipoestadopedidoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoestadopedidos.add(this.tipoestadopedidoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
				
				this.jTableDatosTipoEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoPedido(), this.getIndiceNuevoTipoEstadoPedido());
				
				int iLastRow =  this.jTableDatosTipoEstadoPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEstadoPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEstadoPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();									
		
			TipoEstadoPedido tipoestadopedidoOrigen=new TipoEstadoPedido();
			TipoEstadoPedido tipoestadopedidoDestino=new TipoEstadoPedido();
				
			tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoEstadoPedido.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoestadopedidosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoEstadoPedido.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidoOrigen =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoestadopedidoOrigen =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoestadopedidoDestino =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoestadopedidoDestino =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoestadopedidoOrigen =tipoestadopedidosSeleccionados.get(0);
				tipoestadopedidoDestino =tipoestadopedidosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoEstadoPedido(tipoestadopedidoOrigen,tipoestadopedidoDestino,true,false);
				
				tipoestadopedidoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoestadopedidoDestino,tipoestadopedidoLogic.getTipoEstadoPedidos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoestadopedidoDestino,tipoestadopedidos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
				
				//this.jTableDatosTipoEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoPedido(), this.getIndiceNuevoTipoEstadoPedido());
				
				int iLastRow =  this.jTableDatosTipoEstadoPedido.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoEstadoPedido.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoEstadoPedido.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoEstadoPedido.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoEstadoPedido.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoEstadoPedido.setVisible(!isVisible);
			this.jPanelPaginacionTipoEstadoPedido.setVisible(!isVisible);
			this.jPanelAccionesTipoEstadoPedido.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoEstadoPedido();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoEstadoPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoEstadoPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoEstadoPedido();
			
			this.abrirFrameOrderByTipoEstadoPedido();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoEstadoPedido();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoEstadoPedido(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEstadoPedido);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoEstadoPedido.isMaximum()) {
					this.jInternalFrameDetalleFormTipoEstadoPedido.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoEstadoPedido.setSize(this.jInternalFrameDetalleFormTipoEstadoPedido.iWidthFormulario,this.jInternalFrameDetalleFormTipoEstadoPedido.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoEstadoPedido.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoEstadoPedido.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoEstadoPedido.isMaximum()) {
						this.jInternalFrameDetalleFormTipoEstadoPedido.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoEstadoPedido.jContentPaneDetalleTipoEstadoPedido.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoEstadoPedido.jContentPaneDetalleTipoEstadoPedido.getWidth(),TipoEstadoPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoEstadoPedido.jContentPaneDetalleTipoEstadoPedido.getWidth(),TipoEstadoPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoEstadoPedido.jContentPaneDetalleTipoEstadoPedido.getWidth(),TipoEstadoPedidoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoEstadoPedido.setVisible(true);
	        this.jInternalFrameDetalleFormTipoEstadoPedido.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoEstadoPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoEstadoPedido==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoPedido,false,this);
				} else {
					this.jInternalFrameOrderByTipoEstadoPedido=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoEstadoPedido,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoEstadoPedido);
				this.jInternalFrameOrderByTipoEstadoPedido.setVisible(false);
				this.jInternalFrameOrderByTipoEstadoPedido.setSelected(false);
				
				this.jInternalFrameOrderByTipoEstadoPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEstadoPedido"));
				
				this.inicializarActualizarBindingTablaOrderByTipoEstadoPedido();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoEstadoPedido() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoEstadoPedido==null) {
				
				this.jInternalFrameImportacionTipoEstadoPedido=new ImportacionJInternalFrame(TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoEstadoPedido);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoEstadoPedido);
				this.jInternalFrameImportacionTipoEstadoPedido.setVisible(false);
				this.jInternalFrameImportacionTipoEstadoPedido.setSelected(false);


				this.jInternalFrameImportacionTipoEstadoPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEstadoPedido"));
				this.jInternalFrameImportacionTipoEstadoPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEstadoPedido"));
				this.jInternalFrameImportacionTipoEstadoPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEstadoPedido"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoEstadoPedido() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoEstadoPedido==null) {
				this.jInternalFrameReporteDinamicoTipoEstadoPedido=new ReporteDinamicoJInternalFrame(TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoEstadoPedido);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoEstadoPedido);
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstadoPedido"));
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstadoPedido"));
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstadoPedido"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstadoPedido();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoEstadoPedido() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoEstadoPedido);
			
	       	this.jInternalFrameDetalleFormTipoEstadoPedido.setVisible(false);
	        this.jInternalFrameDetalleFormTipoEstadoPedido.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoEstadoPedido.dispose();
			//this.jInternalFrameDetalleFormTipoEstadoPedido=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoEstadoPedido() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoEstadoPedido.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoEstadoPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoEstadoPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoEstadoPedido.setVisible(true);
	        this.jInternalFrameImportacionTipoEstadoPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoEstadoPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoEstadoPedido.setVisible(true);
	        this.jInternalFrameOrderByTipoEstadoPedido.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoEstadoPedido() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoEstadoPedido.setVisible(false);
	        this.jInternalFrameOrderByTipoEstadoPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoEstadoPedido() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoEstadoPedido.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoEstadoPedido.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoEstadoPedido() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoEstadoPedido.setVisible(false);
	        this.jInternalFrameImportacionTipoEstadoPedido.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoEstadoPedido(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoEstadoPedido(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoEstadoPedido(true);
			//this.isEsNuevoTipoEstadoPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoEstadoPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstadoPedido(false) ;
			
			if(tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstadoPedido(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoEstadoPedidoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoEstadoPedido(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoEstadoPedido(true);
			//this.isEsNuevoTipoEstadoPedido=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoestadopedido.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoEstadoPedido("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoEstadoPedido(false) ;
			
			if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoEstadoPedido(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaPais(List<Pais> paissForeignKey)throws Exception{
		TableColumn tableColumnPais=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS));
		TableCellEditor tableCellEditorPais =tableColumnPais.getCellEditor();

		PaisTableCell paisTableCellFk=(PaisTableCell)tableCellEditorPais;

		if(paisTableCellFk!=null) {
			paisTableCellFk.setpaissForeignKey(paissForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoEstadoPedido.getSelectedRow();

		//if(intSelectedRow<=0) {
			//paisTableCellFk.setRowActual(intSelectedRow);
			//paisTableCellFk.setpaissForeignKeyActual(paissForeignKey);
		//}


		if(paisTableCellFk!=null) {
			paisTableCellFk.RecargarPaissForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoEstadoPedido(false);
			
			//if(!this.isEsNuevoTipoEstadoPedido) {								
				int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
				
			}
			
			if(this.permiteMantenimiento(this.tipoestadopedido)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoEstadoPedido=true;
					this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
					this.isEsNuevoTipoEstadoPedido=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoEstadoPedido=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoEstadoPedido=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEstadoPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(false);
				
				this.habilitarDeshabilitarControlesTipoEstadoPedido(false);
			
												
				
				if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoEstadoPedido();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoEstadoPedidoActionPerformed(evt,tipoestadopedidoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoEstadoPedido(this.tipoestadopedido,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoEstadoPedido.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoestadopedidoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoestadopedido.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				this.tipoestadopedido.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				this.tipoestadopedido.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoestadopedido)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoEstadoPedidoModel) this.jTableDatosTipoEstadoPedido.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoEstadoPedido=true;
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
				this.isEsNuevoTipoEstadoPedido=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoEstadoPedido(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(false);
				
				this.habilitarDeshabilitarControlesTipoEstadoPedido(false);
				
				
				
				if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoEstadoPedido();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoEstadoPedido.getRowCount()>=1) {
				jTableDatosTipoEstadoPedido.removeRowSelectionInterval(0, jTableDatosTipoEstadoPedido.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoEstadoPedido(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoEstadoPedido(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(false) ;
			
			this.isEsNuevoTipoEstadoPedido=false;
			
			if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoEstadoPedido();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoEstadoPedido(false);
				
				//SI ES MANUAL
				if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoEstadoPedido();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoEstadoPedido--;			
			//TipoEstadoPedido tipoestadopedidoAux= new TipoEstadoPedido();			
			//tipoestadopedidoAux.setId(this.iIdNuevoTipoEstadoPedido);
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoEstadoPedido();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
			
			this.tipoestadopedido.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoestadopedidoLogic.getTipoEstadoPedidos().add(this.tipoestadopedidoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoestadopedidos.add(this.tipoestadopedidoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			
			this.jTableDatosTipoEstadoPedido.setRowSelectionInterval(this.getIndiceNuevoTipoEstadoPedido(), this.getIndiceNuevoTipoEstadoPedido());
			
			int iLastRow =  this.jTableDatosTipoEstadoPedido.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoEstadoPedido.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoEstadoPedido.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoPedido(false);
			
			//SI ES MANUAL
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstadoPedido();
			}
			
			//this.abrirFrameTreeTipoEstadoPedido();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Estado PedidoS ?", "MANTENIMIENTO DE Tipo Estado Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoEstadoPedido.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoEstadoPedido();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoestadopedidoReturnGeneral=tipoestadopedidoLogic.procesarImportacionTipoEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoestadopedidoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoEstadoPedidoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoEstadoPedido.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoEstadoPedido.setFileImportacion(this.jInternalFrameImportacionTipoEstadoPedido.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoEstadoPedido.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoEstadoPedido.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoEstadoPedido.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoEstadoPedido.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		

		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoEstadoPedidoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoEstadoPedidoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Pais_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Pais_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Pais_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Pais_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoria="id_pais";
					break;

				case TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS:
					sNombreCampoCategoriaValor="id_pais";
					break;

				case TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Pais",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_pais");
					break;

				case TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoEstadoPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS);
					iRow++;

					for(TipoEstadoPedido tipoestadopedido:tipoestadopedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoestadopedido.getpais_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoEstadoPedido tipoestadopedido:tipoestadopedidosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoestadopedido.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoEstadoPedido(row);				
			//	iRow++;
			//}				
			
			//for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoEstadoPedido(tipoestadopedidoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoPedido(false);
			
			//SI ES MANUAL
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoEstadoPedido();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoPedido(false);
			
			//SI ES MANUAL
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEstadoPedido();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoEstadoPedido(false);
			
			//SI ES MANUAL
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoEstadoPedido();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoEstadoPedido() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoEstadoPedido.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoEstadoPedido.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoEstadoPedido.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoEstadoPedido.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoEstadoPedido.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoEstadoPedido.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoEstadoPedido.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoEstadoPedido(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoEstadoPedido(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoEstadoPedido(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoEstadoPedido(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoEstadoPedido(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoEstadoPedido(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoPedido(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoEstadoPedido(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoEstadoPedido() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoEstadoPedido();
		
		this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEstadoPedido();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoPedido() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstadoPedido(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstadoPedido(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoEstadoPedido.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoEstadoPedido.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoEstadoPedido.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoEstadoPedido.jCheckBoxPostAccionNuevoTipoEstadoPedido.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoEstadoPedido.jCheckBoxPostAccionSinCerrarTipoEstadoPedido.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoEstadoPedido.jCheckBoxPostAccionSinMensajeTipoEstadoPedido.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoEstadoPedido.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoEstadoPedido.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoEstadoPedido.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
				this.jInternalFrameDetalleFormTipoEstadoPedido.jCheckBoxPostAccionNuevoTipoEstadoPedido.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoEstadoPedido.jCheckBoxPostAccionSinCerrarTipoEstadoPedido.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoEstadoPedido.jCheckBoxPostAccionSinMensajeTipoEstadoPedido.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoEstadoPedido.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoEstadoPedido.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoEstadoPedido.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoEstadoPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoEstadoPedido.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoEstadoPedido.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoEstadoPedido.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoEstadoPedido.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoEstadoPedido.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoEstadoPedido(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoEstadoPedido(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoEstadoPedido() throws Exception {
		try	{
			if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEstadoPedido();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEstadoPedido() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoEstadoPedido() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoEstadoPedido.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoEstadoPedido.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoEstadoPedido.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoEstadoPedido.addItem(reporte);
			}
			
			
			if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoEstadoPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoEstadoPedido.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoEstadoPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoEstadoPedido.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoEstadoPedido.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoEstadoPedido.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoEstadoPedido.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstadoPedido();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoEstadoPedido() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoEstadoPedido()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_paisFK_IdPaisTipoEstadoPedido.getSelectedItem()!=null){this.id_paisFK_IdPais=((Pais)this.jComboBoxid_paisFK_IdPaisTipoEstadoPedido.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoEstadoPedido(Boolean esInicializar) throws Exception {				
		if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoEstadoPedido();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoEstadoPedido() throws Exception {
		this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoEstadoPedido() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoEstadoPedidoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedidoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoEstadoPedido(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoestadopedidoLogic.getTipoEstadoPedidos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoestadopedidos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoEstadoPedido.setModel(new TipoEstadoPedidoModel(this.tipoestadopedidoLogic.getTipoEstadoPedidos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoEstadoPedido.setModel(new TipoEstadoPedidoModel(this.tipoestadopedidos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoEstadoPedido!=null && this.jInternalFrameOrderByTipoEstadoPedido.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoEstadoPedido();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO,tipoestadopedidoConstantesFunciones.resaltarSeleccionarTipoEstadoPedido,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoEstadoPedidoConstantesFunciones.SCLASSWEBTITULO,tipoestadopedidoConstantesFunciones.resaltarSeleccionarTipoEstadoPedido,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,TipoEstadoPedidoConstantesFunciones.LABEL_ID));

		if(this.tipoestadopedidoConstantesFunciones.mostraridTipoEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstadoPedidoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoestadopedidoConstantesFunciones.resaltaridTipoEstadoPedido,this.tipoestadopedidoConstantesFunciones.activaridTipoEstadoPedido,this,true,"idTipoEstadoPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestadopedidoConstantesFunciones.resaltaridTipoEstadoPedido,this.tipoestadopedidoConstantesFunciones.activaridTipoEstadoPedido,this,true,"idTipoEstadoPedido","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS));

		if(this.tipoestadopedidoConstantesFunciones.mostrarid_paisTipoEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PaisTableCell(this.paissForeignKey,this.tipoestadopedidoConstantesFunciones.resaltarid_paisTipoEstadoPedido,this,this.tipoestadopedidoConstantesFunciones.activarid_paisTipoEstadoPedido));
			tableColumn.setCellEditor(new PaisTableCell(this.paissForeignKey,this.tipoestadopedidoConstantesFunciones.resaltarid_paisTipoEstadoPedido,this,this.tipoestadopedidoConstantesFunciones.activarid_paisTipoEstadoPedido,true,"id_paisTipoEstadoPedido","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoestadopedidoConstantesFunciones.mostrarnombreTipoEstadoPedido && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoestadopedidoConstantesFunciones.resaltarnombreTipoEstadoPedido,this.tipoestadopedidoConstantesFunciones.activarnombreTipoEstadoPedido,this,true,"nombreTipoEstadoPedido","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoestadopedidoConstantesFunciones.resaltarnombreTipoEstadoPedido,this.tipoestadopedidoConstantesFunciones.activarnombreTipoEstadoPedido,this,true,"nombreTipoEstadoPedido","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoEstadoPedidoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEstadoPedido.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoEstadoPedido.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoEstadoPedido.addColumn(tableColumn);
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
			
			this.jTableDatosTipoEstadoPedido.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoEstadoPedido.moveColumn(this.jTableDatosTipoEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoEstadoPedido.moveColumn(this.jTableDatosTipoEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoEstadoPedido.moveColumn(this.jTableDatosTipoEstadoPedido.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoEstadoPedido.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoEstadoPedido.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoEstadoPedido,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoEstadoPedido.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoEstadoPedido.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoEstadoPedido.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoEstadoPedido.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoestadopedidoLogic.getTipoEstadoPedidos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoestadopedidos.size()-1;
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
		//this.jTableDatosTipoEstadoPedido.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoEstadoPedido.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoEstadoPedido();
			
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
				
				//this.isEsNuevoTipoEstadoPedido=false;
					
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
				if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEstadoPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEstadoPedido.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoestadopedido.getsType().equals("DUPLICADO")
				   || this.tipoestadopedido.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoEstadoPedido=true;
				
				} else {
					this.isEsNuevoTipoEstadoPedido=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoestadopedido.getId()>=0 && !this.tipoestadopedido.getIsNew()) {						
						this.isEsNuevoTipoEstadoPedido=false;
						
					} else {
						this.isEsNuevoTipoEstadoPedido=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoEstadoPedido(esRelaciones);						
				
				this.seleccionarTipoEstadoPedido(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoestadopedido.getId()<0) {
					this.isEsNuevoTipoEstadoPedido=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoEstadoPedido(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoEstadoPedido(evt,rowIndex);
				}	
				
				if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoEstadoPedido: " + this.dDif); 
					}
				}								
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoEstadoPedido(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoestadopedido)) {
					if(this.tipoestadopedido.getId()>0) {
						this.tipoestadopedido.setIsDeleted(true);
						
						this.tipoestadopedidosEliminados.add(this.tipoestadopedido);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoestadopedidoLogic.getTipoEstadoPedidos().remove(this.tipoestadopedido);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoestadopedidos.remove(this.tipoestadopedido);				
					}
					
					
					((TipoEstadoPedidoModel) this.jTableDatosTipoEstadoPedido.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoEstadoPedido(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoEstadoPedido(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoEstadoPedido) {
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoEstadoPedido.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoEstadoPedido.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedido);
				}
				
				//ARCHITECTURE
				try {
					

					//Pais
					if(!this.tipoestadopedidoConstantesFunciones.cargarid_paisTipoEstadoPedido || this.tipoestadopedidoConstantesFunciones.event_dependid_paisTipoEstadoPedido) {
						//this.cargarCombosPaissForeignKeyLista(" where id="+this.tipoestadopedido.getid_pais());
									//this.inicializarActualizarBindingTipoEstadoPedido(false,false);
						this.paissForeignKey=new ArrayList<Pais>();

						if(tipoestadopedido.getPais()!=null) {
							this.paissForeignKey.add(tipoestadopedido.getPais());
						}

						this.addItemDefectoCombosForeignKeyPais();
						this.cargarCombosFramePaissForeignKey("Todos");
					}
					this.setActualPaisForeignKey(this.tipoestadopedido.getid_pais(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoEstadoPedido("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoEstadoPedido(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoEstadoPedido() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEstadoPedido(TipoEstadoPedido tipoestadopedido) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoEstadoPedido(tipoestadopedido,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoEstadoPedido(tipoestadopedido);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoEstadoPedido(tipoestadopedido,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoPedido(tipoestadopedido);
	}
	
	public void setVariablesObjetoActualToFormularioTipoEstadoPedido(TipoEstadoPedido tipoestadopedido) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setText(tipoestadopedido.getId().toString());
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setText(tipoestadopedido.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoEstadoPedido tipoestadopedidoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoestadopedidoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoEstadoPedido tipoestadopedidoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoestadopedidoLocal=this.tipoestadopedido;
			} else {
				tipoestadopedidoLocal=this.tipoestadopedidoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoestadopedidoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoEstadoPedido(tipoestadopedidoLocal,true);
					
					if(tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoestadopedidoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoestadopedidoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEstadoPedido(tipoestadopedido,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(tipoestadopedido);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoEstadoPedido(tipoestadopedido,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.getText()==null || this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.getText()=="" || this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setText("0");
			}

			if(conColumnasBase) {tipoestadopedido.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstadoPedidoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoPedido.jLabelIdTipoEstadoPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoestadopedido.setnombre(this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoEstadoPedido.jLabelnombreTipoEstadoPedido,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoEstadoPedido(TipoEstadoPedido tipoestadopedidoBean,TipoEstadoPedido tipoestadopedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipoestadopedidoBean.getid_pais()!=null && !tipoestadopedidoBean.getid_pais().equals(-1L))) {tipoestadopedido.setid_pais(tipoestadopedidoBean.getid_pais());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoEstadoPedido(TipoEstadoPedido tipoestadopedidoOrigen,TipoEstadoPedido tipoestadopedido,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoestadopedidoOrigen.getId()!=null && !tipoestadopedidoOrigen.getId().equals(0L))) {tipoestadopedido.setId(tipoestadopedidoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoestadopedidoOrigen.getid_pais()!=null && !tipoestadopedidoOrigen.getid_pais().equals(-1L))) {tipoestadopedido.setid_pais(tipoestadopedidoOrigen.getid_pais());}
			if(conDefault || (!conDefault && tipoestadopedidoOrigen.getnombre()!=null && !tipoestadopedidoOrigen.getnombre().equals(""))) {tipoestadopedido.setnombre(tipoestadopedidoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEstadoPedido(TipoEstadoPedido tipoestadopedido) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setText(tipoestadopedido.getId().toString());
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setText(tipoestadopedido.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoEstadoPedido(TipoEstadoPedidoBean tipoestadopedidoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setText(tipoestadopedidoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setText(tipoestadopedidoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoEstadoPedido(TipoEstadoPedidoParameterReturnGeneral tipoestadopedidoReturnGeneral,TipoEstadoPedidoBean tipoestadopedidoBean,Boolean conDefault) throws Exception { 
		try {
			TipoEstadoPedido tipoestadopedidoLocal=new TipoEstadoPedido();
			
			tipoestadopedidoLocal=tipoestadopedidoReturnGeneral.getTipoEstadoPedido();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoestadopedidoLocal.getId()!=null && !tipoestadopedidoLocal.getId().equals(0L))) {tipoestadopedidoBean.setId(tipoestadopedidoLocal.getId());}}
			if(conDefault || (!conDefault && tipoestadopedidoLocal.getid_pais()!=null && !tipoestadopedidoLocal.getid_pais().equals(-1L))) {tipoestadopedidoBean.setid_pais(tipoestadopedidoLocal.getid_pais());}
			if(conDefault || (!conDefault && tipoestadopedidoLocal.getnombre()!=null && !tipoestadopedidoLocal.getnombre().equals(""))) {tipoestadopedidoBean.setnombre(tipoestadopedidoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoEstadoPedidoGenerico(Long idTipoEstadoPedidoSeleccionado,JComboBox jComboBoxTipoEstadoPedido,List<TipoEstadoPedido> tipoestadopedidosLocal)throws Exception {
		try {
			TipoEstadoPedido  tipoestadopedidoTemp=null;

			for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosLocal) {
				if(tipoestadopedidoAux.getId()!=null && tipoestadopedidoAux.getId().equals(idTipoEstadoPedidoSeleccionado)) {
					tipoestadopedidoTemp=tipoestadopedidoAux;
					break;
				}
			}

			jComboBoxTipoEstadoPedido.setSelectedItem(tipoestadopedidoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoEstadoPedidoGenerico(JComboBox jComboBoxTipoEstadoPedido,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEstadoPedido.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoEstadoPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoEstadoPedido.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoEstadoPedido.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoEstadoPedido.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoEstadoPedido.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestadopedido=(TipoEstadoPedido) tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoestadopedido =(TipoEstadoPedido) tipoestadopedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Pais")) {
			//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
			if(!tipoestadopedido.getIsNew() && !tipoestadopedido.getIsChanged() && !tipoestadopedido.getIsDeleted()) {
				sDescripcion=tipoestadopedido.getpais_descripcion();
			} else {
				//sDescripcion=this.getActualPaisForeignKeyDescripcion((Long)value);
				sDescripcion=tipoestadopedido.getpais_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoEstadoPedido tipoestadopedidoRow=new TipoEstadoPedido();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestadopedidoRow=(TipoEstadoPedido) tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoestadopedidoRow=(TipoEstadoPedido) tipoestadopedidos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoEstadoPedido(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido));			
			this.jButtonDuplicarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaDuplicarTipoEstadoPedido && this.isPermisoDuplicarTipoEstadoPedido));			
			this.jButtonCopiarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaCopiarTipoEstadoPedido && this.isPermisoCopiarTipoEstadoPedido));
			this.jButtonVerFormTipoEstadoPedido.setVisible((this.isVisibilidadCeldaVerFormTipoEstadoPedido && this.isPermisoVerFormTipoEstadoPedido));
			
			this.jButtonAbrirOrderByTipoEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoPedido && this.isPermisoOrdenTipoEstadoPedido));			
			
			this.jButtonNuevoRelacionesTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido));			
			this.jButtonNuevoGuardarCambiosTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaModificarTipoEstadoPedido && this.isPermisoActualizarTipoEstadoPedido));	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaActualizarTipoEstadoPedido && this.isPermisoActualizarTipoEstadoPedido));	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaEliminarTipoEstadoPedido && this.isPermisoEliminarTipoEstadoPedido));
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarTipoEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoPedido);							
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido));						
			this.jButtonDuplicarToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaDuplicarTipoEstadoPedido && this.isPermisoDuplicarTipoEstadoPedido));						
			this.jButtonCopiarToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaCopiarTipoEstadoPedido && this.isPermisoCopiarTipoEstadoPedido));			
			this.jButtonVerFormToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaVerFormTipoEstadoPedido && this.isPermisoVerFormTipoEstadoPedido));			
			this.jButtonAbrirOrderByToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoPedido && this.isPermisoOrdenTipoEstadoPedido));
			this.jButtonNuevoRelacionesToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido));			
			this.jButtonNuevoGuardarCambiosToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));			
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaModificarTipoEstadoPedido && this.isPermisoActualizarTipoEstadoPedido));	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaActualizarTipoEstadoPedido  && this.isPermisoActualizarTipoEstadoPedido));	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaEliminarTipoEstadoPedido && this.isPermisoEliminarTipoEstadoPedido));
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarToolBarTipoEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoPedido);				
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido));			
			this.jMenuItemDuplicarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaDuplicarTipoEstadoPedido && this.isPermisoDuplicarTipoEstadoPedido));			
			this.jMenuItemCopiarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaCopiarTipoEstadoPedido && this.isPermisoCopiarTipoEstadoPedido));			
			this.jMenuItemVerFormTipoEstadoPedido.setVisible((this.isVisibilidadCeldaVerFormTipoEstadoPedido && this.isPermisoVerFormTipoEstadoPedido));			
			this.jMenuItemAbrirOrderByTipoEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoPedido && this.isPermisoOrdenTipoEstadoPedido));			
			//this.jMenuItemMostrarOcultarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoPedido && this.isPermisoOrdenTipoEstadoPedido));
			this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoPedido && this.isPermisoOrdenTipoEstadoPedido));			
			//this.jMenuItemDetalleMostrarOcultarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaOrdenTipoEstadoPedido && this.isPermisoOrdenTipoEstadoPedido));			
			this.jMenuItemNuevoRelacionesTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido));			
			this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido.setVisible((this.isVisibilidadCeldaNuevoTipoEstadoPedido && this.isPermisoNuevoTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));									
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemModificarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaModificarTipoEstadoPedido && this.isPermisoActualizarTipoEstadoPedido));	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemActualizarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaActualizarTipoEstadoPedido && this.isPermisoActualizarTipoEstadoPedido));	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemEliminarTipoEstadoPedido.setVisible((this.isVisibilidadCeldaEliminarTipoEstadoPedido && this.isPermisoEliminarTipoEstadoPedido));
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemCancelarTipoEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoPedido);				
			}
			
			this.jMenuItemGuardarCambiosTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));						
			this.jMenuItemGuardarCambiosTablaTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=this.jButtonNuevoTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaDuplicarTipoEstadoPedido=this.jButtonDuplicarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaCopiarTipoEstadoPedido=this.jButtonCopiarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaVerFormTipoEstadoPedido=this.jButtonVerFormTipoEstadoPedido.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoEstadoPedido=this.jButtonAbrirOrderByTipoEstadoPedido.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=this.jButtonNuevoRelacionesTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaModificarTipoEstadoPedido=this.jButtonModificarTipoEstadoPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaGuardarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=this.jButtonGuardarCambiosTablaTipoEstadoPedido.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=this.jButtonNuevoToolBarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=this.jButtonNuevoRelacionesToolBarTipoEstadoPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.isVisibilidadCeldaModificarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarToolBarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarToolBarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarToolBarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarToolBarTipoEstadoPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEstadoPedido=this.jButtonGuardarCambiosToolBarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=this.jButtonGuardarCambiosTablaToolBarTipoEstadoPedido.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=this.jMenuItemNuevoTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=this.jMenuItemNuevoRelacionesTipoEstadoPedido.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.isVisibilidadCeldaModificarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemModificarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemActualizarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemEliminarTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemCancelarTipoEstadoPedido.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoEstadoPedido=this.jMenuItemGuardarCambiosTipoEstadoPedido.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=this.jMenuItemGuardarCambiosTablaTipoEstadoPedido.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoEstadoPedido(Boolean esInicializar) {
		if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEstadoPedido();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoEstadoPedido(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoEstadoPedido() {
		this.jButtonNuevoTipoEstadoPedido.setVisible(this.isPermisoNuevoTipoEstadoPedido);			
		this.jButtonDuplicarTipoEstadoPedido.setVisible(this.isPermisoDuplicarTipoEstadoPedido);			
		this.jButtonCopiarTipoEstadoPedido.setVisible(this.isPermisoCopiarTipoEstadoPedido);			
		this.jButtonVerFormTipoEstadoPedido.setVisible(this.isPermisoVerFormTipoEstadoPedido);			
		
		this.jButtonAbrirOrderByTipoEstadoPedido.setVisible(this.isPermisoOrdenTipoEstadoPedido);					
		
		this.jButtonNuevoRelacionesTipoEstadoPedido.setVisible(this.isPermisoNuevoTipoEstadoPedido);			
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarTipoEstadoPedido.setVisible(this.isPermisoActualizarTipoEstadoPedido);	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarTipoEstadoPedido.setVisible(this.isPermisoActualizarTipoEstadoPedido);	
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarTipoEstadoPedido.setVisible(this.isPermisoEliminarTipoEstadoPedido);
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarTipoEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoPedido);						
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.setVisible(this.isPermisoGuardarCambiosTipoEstadoPedido);							
		}
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.setVisible(this.isPermisoActualizarTipoEstadoPedido);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEstadoPedido() {
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarTipoEstadoPedido.setVisible(this.isPermisoActualizarTipoEstadoPedido);	
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarTipoEstadoPedido.setVisible(this.isPermisoActualizarTipoEstadoPedido);	
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarTipoEstadoPedido.setVisible(this.isPermisoEliminarTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarTipoEstadoPedido.setVisible(this.isVisibilidadCeldaCancelarTipoEstadoPedido);							
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.setVisible((this.isVisibilidadCeldaGuardarTipoEstadoPedido && this.isPermisoGuardarCambiosTipoEstadoPedido));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoEstadoPedido() {
		if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoEstadoPedido();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoEstadoPedido() {
	}
	
	public void jTableDatosTipoEstadoPedidoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoEstadoPedido(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.gettipoestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestadopedido==null) {
						this.tipoestadopedido = new TipoEstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
				}

				if(this.tipoestadopedido.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoestadopedido.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_paisTipoEstadoPedidoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisopais=true;

			idTienePermisopais=this.tienePermisosUsuarioEnPaginaWebTipoEstadoPedido(PaisConstantesFunciones.CLASSNAME);

			if(idTienePermisopais) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoEstadoPedido.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoEstadoPedido.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.gettipoestadopedido(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);

				this.paisBeanSwingJInternalFrame=new PaisBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.paisBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.paisBeanSwingJInternalFrame.getPaisLogic().setConnexion(this.tipoestadopedidoLogic.getConnexion());

				if(this.tipoestadopedido.getid_pais()!=null) {
					this.paisBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.paisBeanSwingJInternalFrame.setIdActual(this.tipoestadopedido.getid_pais());
					this.paisBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.paisBeanSwingJInternalFrame.inicializarActualizarBindingTablaPais();
				}

				JInternalFrameBase jinternalFrame =this.paisBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoEstadoPedido=(TitledBorder)this.jScrollPanelDatosTipoEstadoPedido.getBorder();
				TitledBorder titledBorderpais=(TitledBorder)this.paisBeanSwingJInternalFrame.jScrollPanelDatosPais.getBorder();

				titledBorderpais.setTitle(titledBorderTipoEstadoPedido.getTitle() + " -> Pais");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_paisTipoEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.gettipoestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestadopedido==null) {
						this.tipoestadopedido = new TipoEstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
				}

				if(this.tipoestadopedido.getid_pais()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_pais = "+this.tipoestadopedido.getid_pais().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoEstadoPedidoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.gettipoestadopedido(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoestadopedido==null) {
						this.tipoestadopedido = new TipoEstadoPedido();
					}

					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);
				}

				if(this.tipoestadopedido.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoestadopedido.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoEstadoPedido(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdPaisTipoEstadoPedidoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);

			this.getTipoEstadoPedidosFK_IdPais();

			this.inicializarActualizarBindingTipoEstadoPedido(false);

			//if(TipoEstadoPedidoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoestadopedidoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoEstadoPedido() {
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoEstadoPedido.dispose();
			this.jInternalFrameDetalleFormTipoEstadoPedido=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
			this.jInternalFrameReporteDinamicoTipoEstadoPedido.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoEstadoPedido.dispose();
			this.jInternalFrameReporteDinamicoTipoEstadoPedido=null;
		}
		
		if(this.jInternalFrameImportacionTipoEstadoPedido!=null) {
			this.jInternalFrameImportacionTipoEstadoPedido.setVisible(false);	    			
			this.jInternalFrameImportacionTipoEstadoPedido.dispose();
			this.jInternalFrameImportacionTipoEstadoPedido=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoEstadoPedido();
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoEstadoPedido")) {
				jButtonDuplicarTipoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoEstadoPedido")) {
				jButtonCopiarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoEstadoPedido")) {
				jButtonVerFormTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoEstadoPedido")) {
				jButtonDuplicarTipoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoEstadoPedido")) {
				jButtonDuplicarTipoEstadoPedidoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoEstadoPedido")) {
				jButtonModificarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoEstadoPedido")) {
				jButtonModificarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoEstadoPedido")) {
				jButtonModificarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoEstadoPedido")) {
				jButtonActualizarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoEstadoPedido")) {
				jButtonActualizarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoEstadoPedido")) {
				jButtonActualizarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoEstadoPedido")) {
				jButtonEliminarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoEstadoPedido")) {
				jButtonEliminarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoEstadoPedido")) {
				jButtonEliminarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoEstadoPedido")) {
				jButtonCancelarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoEstadoPedido")) {
				jButtonCancelarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoEstadoPedido")) {
				jButtonCancelarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoEstadoPedido")) {
				jButtonCerrarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoEstadoPedido")) {
				jButtonCerrarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoEstadoPedido")) {
				jButtonCerrarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoEstadoPedido")) {
				jButtonMostrarOcultarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoEstadoPedido")) {
				jButtonCancelarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoEstadoPedido")) {
				jButtonCopiarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoEstadoPedido")) {
				jButtonVerFormTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoEstadoPedido")) {
				jButtonCopiarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoEstadoPedido")) {
				jButtonVerFormTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoEstadoPedido")) {
				jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoEstadoPedido")) {
				jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoEstadoPedido")) {
				jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoEstadoPedido")) {
				jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoEstadoPedido")) {
				jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoEstadoPedido")) {
				jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoEstadoPedido")) {
				jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoEstadoPedido")) {
				jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoEstadoPedido")) {
				jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoEstadoPedido") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoEstadoPedido")) {
				jButtonAbrirOrderByTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoEstadoPedido") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoEstadoPedido")) {
				jButtonMostrarOcultarTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEstadoPedido")) {
				jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoEstadoPedido")) {
				jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoEstadoPedido")) {
				jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoEstadoPedido")) {
				jButtonCerrarReporteDinamicoTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoEstadoPedido")) {
				jButtonGenerarReporteDinamicoTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoEstadoPedido")) {
				
				jButtonGenerarExcelReporteDinamicoTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoEstadoPedido")) {
				jButtonCerrarImportacionTipoEstadoPedidoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoEstadoPedido")) {
				
				jButtonGenerarImportacionTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoEstadoPedido")) {
				
				jButtonAbrirImportacionTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoEstadoPedido")) {
				jComboBoxTiposAccionesTipoEstadoPedidoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoEstadoPedido")) {
				jComboBoxTiposRelacionesTipoEstadoPedidoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoEstadoPedido")) {
				jComboBoxTiposAccionesTipoEstadoPedidoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoEstadoPedido")) {
				
				jComboBoxTiposSeleccionarTipoEstadoPedidoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoEstadoPedido")) {
				jTextFieldValorCampoGeneralTipoEstadoPedidoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoEstadoPedido")) {
				jButtonAbrirOrderByTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoEstadoPedido")) {
				jButtonAbrirOrderByTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoEstadoPedido")) {
				jButtonCerrarOrderByTipoEstadoPedidoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEstadoPedidoBusqueda")) {
				this.jButtonidTipoEstadoPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoEstadoPedidoUpdate")) {
				this.jButtonid_paisTipoEstadoPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoEstadoPedidoBusqueda")) {
				this.jButtonid_paisTipoEstadoPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEstadoPedidoBusqueda")) {
				this.jButtonnombreTipoEstadoPedidoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdPaisTipoEstadoPedido")) {
				this.jButtonFK_IdPaisTipoEstadoPedidoActionPerformed(evt);
			}
			
			;
			
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoEstadoPedido();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoEstadoPedido tipoestadopedidoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoestadopedidoLocal=this.tipoestadopedido;
			} else {
				tipoestadopedidoLocal=this.tipoestadopedidoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
							
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
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
			
			


			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
								
						
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
								
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
							
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
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
			
			


			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
								
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoEstadoPedido")) {
					jCheckBoxSeleccionarTodosTipoEstadoPedidoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoEstadoPedido")) {
					jCheckBoxSeleccionadosTipoEstadoPedidoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoEstadoPedido")) {
					
				}
				
				


				
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
												
				
				


				
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
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
			
			


			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoestadopedido);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoestadopedido);
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
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
				
				


				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoEstadoPedido.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoEstadoPedido.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoEstadoPedidoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoestadopedidoAnterior =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoEstadoPedido")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoEstadoPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoEstadoPedido.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoestadopedido =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoestadopedido);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoEstadoPedido")) {
				
				}
				
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoEstadoPedido")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoEstadoPedido.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoEstadoPedido")) {
			
			}
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoEstadoPedido();
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoEstadoPedido")) {
				jButtonDuplicarTipoEstadoPedidoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoEstadoPedido")) {
				jButtonCopiarTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoEstadoPedido")) {
				jButtonVerFormTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoEstadoPedido")) {
				jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoEstadoPedido")) {
				jButtonModificarTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoEstadoPedido")) {
				jButtonActualizarTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoEstadoPedido")) {
				jButtonEliminarTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoEstadoPedido")) {
				jButtonCancelarTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoEstadoPedido")) {
				jButtonCerrarTipoEstadoPedidoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoEstadoPedido")) {
				jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoEstadoPedido")) {
				jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoEstadoPedido")) {
				jButtonAbrirOrderByTipoEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoEstadoPedido")) {
				jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoEstadoPedido")) {
				jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoEstadoPedido")) {
				jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoEstadoPedidoBusqueda")) {
				this.jButtonidTipoEstadoPedidoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_paisTipoEstadoPedidoUpdate")) {
				this.jButtonid_paisTipoEstadoPedidoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_paisTipoEstadoPedidoBusqueda")) {
				this.jButtonid_paisTipoEstadoPedidoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoEstadoPedidoBusqueda")) {
				this.jButtonnombreTipoEstadoPedidoBusquedaActionPerformed(evt);
			}
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoEstadoPedido();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoEstadoPedido")) {
				closingInternalFrameTipoEstadoPedido();
				
			} else if(sTipo.equals("jButtonCancelarTipoEstadoPedido")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoEstadoPedido = (JInternalFrameBase)evt.getSource();
	            	
	            TipoEstadoPedidoBeanSwingJInternalFrame jInternalFrameParent=(TipoEstadoPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEstadoPedido.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoEstadoPedidoActionPerformed(null);
			}
			
			TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoestadopedido,new Object(),this.tipoestadopedidoParameterGeneral,this.tipoestadopedidoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoEstadoPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoEstadoPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoEstadoPedido(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoestadopedido)) {
			if(!esControlTabla) {
				if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);			
				}
				
				if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoEstadoPedido(this.tipoestadopedido,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoestadopedidoReturnGeneral=tipoestadopedidoLogic.procesarEventosTipoEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadopedidoLogic.getTipoEstadoPedidos(),this.tipoestadopedido,this.tipoestadopedidoParameterGeneral,this.isEsNuevoTipoEstadoPedido,classes);//this.tipoestadopedidoLogic.getTipoEstadoPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoEstadoPedido(this.tipoestadopedidoReturnGeneral,this.tipoestadopedidoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoEstadoPedido(classes,this.tipoestadopedidoReturnGeneral,this.tipoestadopedidoBean,false);
					}
						
					if(this.tipoestadopedidoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido());	
					}
						
					if(this.tipoestadopedidoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido(),classes);//this.tipoestadopedidoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoEstadoPedido(this.tipoestadopedido,classes);//this.tipoestadopedidoBean);									
				}
			
				if(TipoEstadoPedidoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoEstadoPedido(this.tipoestadopedido,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoEstadoPedido(this.tipoestadopedido);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoestadopedidoAnterior!=null) {
						this.tipoestadopedido=this.tipoestadopedidoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoestadopedidoReturnGeneral=tipoestadopedidoLogic.procesarEventosTipoEstadoPedidosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadopedidoLogic.getTipoEstadoPedidos(),this.tipoestadopedido,this.tipoestadopedidoParameterGeneral,this.isEsNuevoTipoEstadoPedido,classes);//this.tipoestadopedidoLogic.getTipoEstadoPedido()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoestadopedidoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoestadopedidoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido(),tipoestadopedidoLogic.getTipoEstadoPedidos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido(),this.tipoestadopedidos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoEstadoPedido.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoEstadoPedido.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoEstadoPedido();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoEstadoPedido() throws Exception {
		
		TipoEstadoPedidoModel tipoestadopedidoModel=(TipoEstadoPedidoModel)this.jTableDatosTipoEstadoPedido.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoestadopedidoModel.tipoestadopedidos=this.tipoestadopedidoLogic.getTipoEstadoPedidos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoestadopedidoModel.tipoestadopedidos=this.tipoestadopedidos;
		}
		
		
		((TipoEstadoPedidoModel) this.jTableDatosTipoEstadoPedido.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoEstadoPedido() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoestadopedidoAnterior(),this.tipoestadopedidoLogic.getTipoEstadoPedidos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoestadopedidoAnterior(),this.tipoestadopedidos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoEstadoPedido();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
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
										
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadopedido,new Object(),generalEntityParameterGeneral,this.tipoestadopedidoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoEstadoPedidoConstantesFunciones.getClassesRelationshipsOfTipoEstadoPedido(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoEstadoPedidoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoEstadoPedido(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoEstadoPedido(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoEstadoPedidoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoestadopedido,new Object(),generalEntityParameterGeneral,this.tipoestadopedidoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoEstadoPedido(TipoEstadoPedidoBean tipoestadopedidoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoEstadoPedido(ArrayList<Classe> classes,TipoEstadoPedidoReturnGeneral tipoestadopedidoReturnGeneral,TipoEstadoPedidoBean tipoestadopedidoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoestadopedido)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoEstadoPedido = new TipoEstadoPedidoDetalleFormJInternalFrame(jDesktopPane,this.tipoestadopedidoSessionBean.getConGuardarRelaciones(),this.tipoestadopedidoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.setVisible(false);
		this.jInternalFrameDetalleFormTipoEstadoPedido.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.tipoestadopedidoLogic=this.tipoestadopedidoLogic;
		
		this.cargarCombosFrameForeignKeyTipoEstadoPedido("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoEstadoPedido();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoEstadoPedido();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoEstadoPedido("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoEstadoPedido();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEstadoPedido"));
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarTipoEstadoPedido"));

		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEstadoPedido"));
					
		this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemModificarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"ActualizarTipoEstadoPedido"));
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEstadoPedido"));
						
		this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemActualizarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarTipoEstadoPedido"));
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEstadoPedido"));
								
		this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemEliminarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarTipoEstadoPedido"));
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEstadoPedido"));
					
		this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemCancelarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEstadoPedido"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemDetalleCerrarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEstadoPedido"));		
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstadoPedido"));
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstadoPedido"));
		
		
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEstadoPedido"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonidTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstadoPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonid_paisTipoEstadoPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonid_paisTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonnombreTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstadoPedidoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEstadoPedido"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoEstadoPedido"));
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoEstadoPedido"));
		}
		
		this.jTableDatosTipoEstadoPedido.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoEstadoPedido"));
		
		this.jTableDatosTipoEstadoPedido.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoEstadoPedido"));
		
		this.jButtonNuevoTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"NuevoTipoEstadoPedido"));
		
		this.jButtonDuplicarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"DuplicarTipoEstadoPedido"));
		
		this.jButtonCopiarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"CopiarTipoEstadoPedido"));
		
		this.jButtonVerFormTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"VerFormTipoEstadoPedido"));
		
		
		this.jButtonNuevoToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoEstadoPedido"));
			
		this.jButtonDuplicarToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoEstadoPedido"));
			
		this.jMenuItemNuevoTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoEstadoPedido"));
			
		this.jMenuItemDuplicarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoEstadoPedido"));		
		
		
		this.jButtonNuevoRelacionesTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoEstadoPedido"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoEstadoPedido"));
			
		this.jMenuItemNuevoRelacionesTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoEstadoPedido"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarTipoEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonModificarToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoEstadoPedido"));
			
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemModificarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"ActualizarTipoEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonActualizarToolBarTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoEstadoPedido"));
				
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemActualizarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarTipoEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonEliminarToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoEstadoPedido"));
						
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemEliminarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarTipoEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonCancelarToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoEstadoPedido"));
			
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemCancelarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoEstadoPedido"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoEstadoPedido"));		
		
		
		this.jButtonCerrarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CerrarTipoEstadoPedido"));
		
		
		this.jButtonCerrarToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoEstadoPedido"));
			
		this.jMenuItemCerrarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoEstadoPedido"));
			
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jMenuItemDetalleCerrarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoEstadoPedido"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoEstadoPedido"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoEstadoPedido"));
		}
		
		this.jButtonCopiarToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoEstadoPedido"));
			
		this.jButtonVerFormToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoEstadoPedido"));
		
		this.jMenuItemGuardarCambiosTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoEstadoPedido"));
			
		this.jMenuItemCopiarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoEstadoPedido"));		
		
		this.jMenuItemVerFormTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoEstadoPedido"));		
		
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEstadoPedido"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoEstadoPedido"));
			
		this.jMenuItemGuardarCambiosTablaTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoEstadoPedido"));		
		
		
		
		this.jButtonRecargarInformacionTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoEstadoPedido"));
					
		this.jButtonRecargarInformacionToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoEstadoPedido"));
		
		this.jMenuItemRecargarInformacionTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoEstadoPedido"));		
		
		
		
		this.jButtonAnterioresTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"AnterioresTipoEstadoPedido"));
		
		
		this.jButtonAnterioresToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoEstadoPedido"));
		
		this.jMenuItemAnterioresTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoEstadoPedido"));		
		
		
		this.jButtonSiguientesTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"SiguientesTipoEstadoPedido"));
		
		
		this.jButtonSiguientesToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoEstadoPedido"));
			
		this.jMenuItemSiguientesTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoEstadoPedido"));
			
		this.jMenuItemAbrirOrderByTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoEstadoPedido"));
			
		this.jMenuItemMostrarOcultarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoEstadoPedido"));
			
		this.jMenuItemDetalleAbrirOrderByTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoEstadoPedido"));
			
		this.jMenuItemDetalleMostarOcultarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoEstadoPedido"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoEstadoPedido"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoEstadoPedido"));
			
		this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoEstadoPedido"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoEstadoPedido"));

		this.jCheckBoxSeleccionadosTipoEstadoPedido.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoEstadoPedido"));
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoEstadoPedido"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoEstadoPedido"));
			
		this.jComboBoxTiposAccionesTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoEstadoPedido"));
					
		this.jComboBoxTiposSeleccionarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoEstadoPedido"));
			
		this.jTextFieldValorCampoGeneralTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoEstadoPedido"));		
		
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonidTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstadoPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonid_paisTipoEstadoPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonid_paisTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonnombreTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstadoPedidoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdPaisTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoEstadoPedido"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoEstadoPedido!=null) {
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstadoPedido"));
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstadoPedido"));
				this.jInternalFrameReporteDinamicoTipoEstadoPedido.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstadoPedido"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoEstadoPedido"));				
			//this.jButtonGenerarReporteDinamicoTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoEstadoPedido"));
			//this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoEstadoPedido"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoEstadoPedido!=null) {
				this.jInternalFrameImportacionTipoEstadoPedido.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoEstadoPedido"));
				this.jInternalFrameImportacionTipoEstadoPedido.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoEstadoPedido"));
				this.jInternalFrameImportacionTipoEstadoPedido.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoEstadoPedido"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoEstadoPedido"));
			
			this.jButtonAbrirOrderByToolBarTipoEstadoPedido.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoEstadoPedido"));			
			
			if(this.jInternalFrameOrderByTipoEstadoPedido!=null) {
				this.jInternalFrameOrderByTipoEstadoPedido.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoEstadoPedido"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoEstadoPedido.jTabbedPaneRelacionesTipoEstadoPedido.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoEstadoPedido"));
		
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
            		closingInternalFrameTipoEstadoPedido();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoEstadoPedido = (JInternalFrameBase)event.getSource();
	            	
	            TipoEstadoPedidoBeanSwingJInternalFrame jInternalFrameParent=(TipoEstadoPedidoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoEstadoPedido.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoEstadoPedidoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoEstadoPedido.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoEstadoPedidoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoEstadoPedido.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoEstadoPedido.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoEstadoPedido";
		inputMap = this.jButtonNuevoTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoEstadoPedido";
		inputMap = this.jButtonNuevoRelacionesTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoEstadoPedidoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoEstadoPedido";
		inputMap = this.jButtonModificarTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoEstadoPedido";
		inputMap = this.jButtonActualizarTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoEstadoPedido";
		inputMap = this.jButtonEliminarTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoEstadoPedido";
		inputMap = this.jButtonCancelarTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoEstadoPedido";
		inputMap = this.jButtonCerrarTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoEstadoPedido";
		inputMap = this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonGuardarCambiosTipoEstadoPedido.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoEstadoPedidoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoEstadoPedido.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoEstadoPedidoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoEstadoPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoEstadoPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoEstadoPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoEstadoPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoEstadoPedido.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoEstadoPedidoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonidTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoEstadoPedidoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonid_paisTipoEstadoPedidoUpdate.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoPedidoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonid_paisTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"id_paisTipoEstadoPedidoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoEstadoPedido.jButtonnombreTipoEstadoPedidoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoEstadoPedidoBusqueda"));
		
		
		this.jButtonFK_IdPaisTipoEstadoPedido.addActionListener(new ButtonActionListener(this,"FK_IdPaisTipoEstadoPedido"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoEstadoPedido.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoEstadoPedidoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoEstadoPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoEstadoPedido.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoEstadoPedido(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
					tipoestadopedidoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidos) {
					tipoestadopedidoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoEstadoPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
						tipoestadopedidoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidos) {
						tipoestadopedidoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEstadoPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEstadoPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoEstadoPedidoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoEstadoPedido.getSelectedRows();
			
			TipoEstadoPedido tipoestadopedidoLocal=new TipoEstadoPedido();
			
			//this.seleccionarTodosTipoEstadoPedido(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoestadopedidoLocal =(TipoEstadoPedido) this.tipoestadopedidoLogic.getTipoEstadoPedidos().toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoestadopedidoLocal =(TipoEstadoPedido) this.tipoestadopedidos.toArray()[this.jTableDatosTipoEstadoPedido.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoestadopedidoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
						tipoestadopedidoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidos) {
						tipoestadopedidoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoEstadoPedido.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoEstadoPedido.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoEstadoPedido,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoEstadoPedidoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoEstadoPedidoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoEstadoPedidoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoEstadoPedido.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidoLogic.getTipoEstadoPedidos()) {
				
						if(sTipoSeleccionar.equals(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoestadopedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidos) {
					
						if(sTipoSeleccionar.equals(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoestadopedidoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoEstadoPedidoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoEstadoPedido=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoEstadoPedido.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoEstadoPedido) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoEstadoPedido(conSplash);
				
					this.generarReporteTipoEstadoPedidosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoEstadoPedidosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEstadoPedidosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoEstadoPedidosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEstadoPedido();
				
				this.exportarTipoEstadoPedidosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoEstadoPedidos();
				//this.importarTipoEstadoPedidos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoEstadoPedido();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoEstadoPedidosSeleccionados();
				//this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Estado Pedido", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoEstadoPedido();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoEstadoPedido)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoEstadoPedido(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoEstadoPedido.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxTiposAccionesFormularioTipoEstadoPedido.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoEstadoPedido();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoEstadoPedido(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoEstadoPedidoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoEstadoPedido();
			
			if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
			TipoEstadoPedido tipoestadopedido=new TipoEstadoPedido();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoEstadoPedido(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoEstadoPedido.getSelectedItem();
			
			
			
			
			tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoestadopedidosSeleccionados.size()==1) {
				for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosSeleccionados) {
					tipoestadopedido=tipoestadopedidoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoEstadoPedido();
			
      		//this.finishProcessTipoEstadoPedido(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoEstadoPedidoReturnGeneral() throws Exception {
		if(this.tipoestadopedidoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoestadopedidoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoestadopedidoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoestadopedidoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoestadopedidoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoestadopedidoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoEstadoPedido(false);
		}
		
		if(this.tipoestadopedidoReturnGeneral.getConRetornoLista() || this.tipoestadopedidoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoestadopedidoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoestadopedidoLogic.setTipoEstadoPedidos(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedidos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoestadopedidoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoestadopedidoLogic.setTipoEstadoPedido(this.tipoestadopedidoReturnGeneral.getTipoEstadoPedido());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoEstadoPedido(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoEstadoPedido() throws Exception {
		
		
	}
	
	public ArrayList<TipoEstadoPedido> getTipoEstadoPedidosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoEstadoPedido) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidoLogic.getTipoEstadoPedidos()) {
					if(tipoestadopedidoAux.getIsSelected()) {
						tipoestadopedidosSeleccionados.add(tipoestadopedidoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoEstadoPedido tipoestadopedidoAux:this.tipoestadopedidos) {
					if(tipoestadopedidoAux.getIsSelected()) {
						tipoestadopedidosSeleccionados.add(tipoestadopedidoAux);				
					}
				}
			}
			
			if(tipoestadopedidosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoestadopedidosSeleccionados.addAll(this.tipoestadopedidoLogic.getTipoEstadoPedidos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoestadopedidosSeleccionados.addAll(this.tipoestadopedidos);				
					}
				}
			}
		} else {
			tipoestadopedidosSeleccionados.add(this.tipoestadopedido);
		}
		
		return tipoestadopedidosSeleccionados;
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
	
	public void generarReporteTipoEstadoPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoEstadoPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoEstadoPedidosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEstadoPedidosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoEstadoPedidosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Estado Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoEstadoPedidosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoEstadoPedido();
		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoEstadoPedido();
		
		
		//this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados ,tipoestadopedidoImplementable,tipoestadopedidoImplementableHome);
	}
	
	public void mostrarImportacionTipoEstadoPedidos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoEstadoPedido();
		
		this.abrirFrameImportacionTipoEstadoPedido();		
		
			
		//this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados ,tipoestadopedidoImplementable,tipoestadopedidoImplementableHome);
	}
	
	public void importarTipoEstadoPedidos() throws Exception {		
	
	}
	
	public void exportarTipoEstadoPedidosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoEstadoPedidosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoEstadoPedidosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoEstadoPedidosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Estado Pedido",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoEstadoPedido(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoEstadoPedido(tipoestadopedidoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoestadopedidoAux.setsDetalleGeneralEntityReporte(tipoestadopedidoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoEstadoPedido(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoEstadoPedidoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstadoPedidoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoestadopedido.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestadopedido.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestadopedido.getpais_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoestadopedido.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoEstadoPedidos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoEstadoPedido(row);				
				iRow++;
			}				
			
			for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoEstadoPedido(tipoestadopedidoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoEstadoPedidosSeleccionados() throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();		
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoestadopedido.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoestadopedidos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoestadopedido");
			//elementRoot.appendChild(element);
		
			for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosSeleccionados) {
				element = document.createElement("tipoestadopedido");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoEstadoPedido(tipoestadopedidoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Estado Pedido",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoEstadoPedido(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestadopedido.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestadopedido.getpais_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoestadopedido.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoEstadoPedido(TipoEstadoPedido tipoestadopedido,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoEstadoPedidoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoestadopedido.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoEstadoPedidoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoestadopedido.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementpais_descripcion = document.createElement(TipoEstadoPedidoConstantesFunciones.IDPAIS);
		elementpais_descripcion.appendChild(document.createTextNode(tipoestadopedido.getpais_descripcion()));
		element.appendChild(elementpais_descripcion);

		Element elementnombre = document.createElement(TipoEstadoPedidoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoestadopedido.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoEstadoPedidosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados=new ArrayList<TipoEstadoPedido>();
		
		tipoestadopedidosSeleccionados=this.getTipoEstadoPedidosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoEstadoPedido(tipoestadopedidosSeleccionados);
		
		this.generarReporteTipoEstadoPedidos("Todos",tipoestadopedidosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoEstadoPedido(ArrayList<TipoEstadoPedido> tipoestadopedidosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoEstadoPedido tipoestadopedidoAux:tipoestadopedidosSeleccionados) {
				tipoestadopedidoAux.setsDetalleGeneralEntityReporte(tipoestadopedidoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoEstadoPedidoConstantesFunciones.LABEL_IDPAIS)) {
					existe=true;
					tipoestadopedidoAux.setsDescripcionGeneralEntityReporte1(tipoestadopedidoAux.getpais_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoEstadoPedidoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoestadopedidoAux.setsDescripcionGeneralEntityReporte1(tipoestadopedidoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoEstadoPedidoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoEstadoPedido(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoEstadoPedido=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=true;
				this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=true;
			}
			
			this.isVisibilidadCeldaModificarTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=false;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
			this.isVisibilidadCeldaModificarTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=true;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
			this.isVisibilidadCeldaModificarTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=true;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=true;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
			this.isVisibilidadCeldaModificarTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=true;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=true;
			this.isVisibilidadCeldaModificarTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=false;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=false;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
			this.isVisibilidadCeldaModificarTipoEstadoPedido=true;
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=false;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
			this.isVisibilidadCeldaCancelarTipoEstadoPedido=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoEstadoPedido=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoEstadoPedidoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=true;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=true;
		} else {
			this.actualizarEstadoPanelsTipoEstadoPedido(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoEstadoPedido=false;
			//this.isVisibilidadCeldaVerFormTipoEstadoPedido=false;
			this.isVisibilidadCeldaDuplicarTipoEstadoPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoestadopedidoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoEstadoPedido=false;
			this.isVisibilidadCeldaGuardarCambiosTipoEstadoPedido=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoestadopedidoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;												
			}
			
			this.jButtonCerrarTipoEstadoPedido.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoEstadoPedido=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoestadopedido)) {
			this.isVisibilidadCeldaActualizarTipoEstadoPedido=false;
			this.isVisibilidadCeldaEliminarTipoEstadoPedido=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoEstadoPedido() {
	}
	
	public void actualizarEstadoPanelsTipoEstadoPedido(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoEstadoPedido!=null) {
				this.jScrollPanelDatosEdicionTipoEstadoPedido.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoEstadoPedido!=null) {
				this.jScrollPanelDatosTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoEstadoPedido!=null) {
				this.jPanelPaginacionTipoEstadoPedido.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
					this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoestadopedidoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoEstadoPedido!=null) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoEstadoPedido!=null) {
				this.jPanelParametrosReportesTipoEstadoPedido.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaPais(Boolean isParaPais){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPaisNegation=!isParaPais;

			this.isVisibilidadFK_IdPais=isParaPais;
			if(!this.isVisibilidadFK_IdPais) {this.jTabbedPaneBusquedasTipoEstadoPedido.remove(jPanelFK_IdPaisTipoEstadoPedido);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoEstadoPedidoSessionBean tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
		
		if(this.tipoestadopedidoSessionBean==null) {
			this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
		}
		
		this.tipoestadopedidoSessionBean.setsUltimaBusquedaTipoEstadoPedido(this.getsAccionBusqueda());
		this.tipoestadopedidoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoestadopedidoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
			tipoestadopedidoSessionBean.setid_pais(this.getid_paisFK_IdPais());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoEstadoPedidoSessionBean tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
		
		if(this.tipoestadopedidoSessionBean==null) {
			this.tipoestadopedidoSessionBean=new TipoEstadoPedidoSessionBean();
		}
		
		if(this.tipoestadopedidoSessionBean.getsUltimaBusquedaTipoEstadoPedido()!=null&&!this.tipoestadopedidoSessionBean.getsUltimaBusquedaTipoEstadoPedido().equals("")) {
			this.setsAccionBusqueda(tipoestadopedidoSessionBean.getsUltimaBusquedaTipoEstadoPedido());
			this.setiNumeroPaginacion(tipoestadopedidoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoestadopedidoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdPais")) {
				this.setid_paisFK_IdPais(tipoestadopedidoSessionBean.getid_pais());
				tipoestadopedidoSessionBean.setid_pais(-1L);
			}
		}
		
		this.tipoestadopedidoSessionBean.setsUltimaBusquedaTipoEstadoPedido("");
		this.tipoestadopedidoSessionBean.setiNumeroPaginacion(TipoEstadoPedidoConstantesFunciones.INUMEROPAGINACION);
		this.tipoestadopedidoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoEstadoPedido(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoEstadoPedido() {
		this.updateBorderResaltarBusquedasFormularioTipoEstadoPedido();
		this.updateVisibilidadBusquedasFormularioTipoEstadoPedido();
		this.updateHabilitarBusquedasFormularioTipoEstadoPedido();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoEstadoPedido() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoEstadoPedido.getComponents().length>0) {
	

		if(this.tipoestadopedidoConstantesFunciones.resaltarFK_IdPaisTipoEstadoPedido!=null) {
			index= this.jTabbedPaneBusquedasTipoEstadoPedido.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoPedido);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoPedido.getComponent(index);
				jPanel.setBorder(this.tipoestadopedidoConstantesFunciones.resaltarFK_IdPaisTipoEstadoPedido);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoEstadoPedido() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoEstadoPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoEstadoPedido.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoPedido);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoPedido.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoestadopedidoConstantesFunciones.mostrarFK_IdPaisTipoEstadoPedido);
			if(!this.tipoestadopedidoConstantesFunciones.mostrarFK_IdPaisTipoEstadoPedido && index>-1) {
				this.jTabbedPaneBusquedasTipoEstadoPedido.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoEstadoPedido() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoEstadoPedido.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoEstadoPedido.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoPedido);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoPedido.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoestadopedidoConstantesFunciones.activarFK_IdPaisTipoEstadoPedido);
				this.jTabbedPaneBusquedasTipoEstadoPedido.setEnabledAt(index,this.tipoestadopedidoConstantesFunciones.activarFK_IdPaisTipoEstadoPedido);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoEstadoPedido(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdPais")) {
			index= this.jTabbedPaneBusquedasTipoEstadoPedido.indexOfComponent(this.jPanelFK_IdPaisTipoEstadoPedido);

			this.jTabbedPaneBusquedasTipoEstadoPedido.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoEstadoPedido.getComponent(index);

			this.tipoestadopedidoConstantesFunciones.setResaltarFK_IdPaisTipoEstadoPedido(resaltar);

			jPanel.setBorder(this.tipoestadopedidoConstantesFunciones.resaltarFK_IdPaisTipoEstadoPedido);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoEstadoPedido.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoEstadoPedido() throws Exception {

		if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoEstadoPedido();
		this.updateVisibilidadResaltarControlesFormularioTipoEstadoPedido();
		this.updateHabilitarResaltarControlesFormularioTipoEstadoPedido();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoEstadoPedido() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoestadopedidoConstantesFunciones.resaltaridTipoEstadoPedido!=null && this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setBorder(this.tipoestadopedidoConstantesFunciones.resaltaridTipoEstadoPedido);}
		if(this.tipoestadopedidoConstantesFunciones.resaltarid_paisTipoEstadoPedido!=null && this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setBorder(this.tipoestadopedidoConstantesFunciones.resaltarid_paisTipoEstadoPedido);}
		if(this.tipoestadopedidoConstantesFunciones.resaltarnombreTipoEstadoPedido!=null && this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setBorder(this.tipoestadopedidoConstantesFunciones.resaltarnombreTipoEstadoPedido);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoEstadoPedido() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
	
		//this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setVisible(this.tipoestadopedidoConstantesFunciones.mostraridTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelidTipoEstadoPedido.setVisible(this.tipoestadopedidoConstantesFunciones.mostraridTipoEstadoPedido);
		//this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setVisible(this.tipoestadopedidoConstantesFunciones.mostrarid_paisTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelid_paisTipoEstadoPedido.setVisible(this.tipoestadopedidoConstantesFunciones.mostrarid_paisTipoEstadoPedido);
		//this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setVisible(this.tipoestadopedidoConstantesFunciones.mostrarnombreTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.jPanelnombreTipoEstadoPedido.setVisible(this.tipoestadopedidoConstantesFunciones.mostrarnombreTipoEstadoPedido);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoEstadoPedido() throws Exception {
		if(this.jInternalFrameDetalleFormTipoEstadoPedido==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoEstadoPedido!=null) {
	
		this.jInternalFrameDetalleFormTipoEstadoPedido.jTextFieldidTipoEstadoPedido.setEnabled(this.tipoestadopedidoConstantesFunciones.activaridTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.jComboBoxid_paisTipoEstadoPedido.setEnabled(this.tipoestadopedidoConstantesFunciones.activarid_paisTipoEstadoPedido);
		this.jInternalFrameDetalleFormTipoEstadoPedido.jTextAreanombreTipoEstadoPedido.setEnabled(this.tipoestadopedidoConstantesFunciones.activarnombreTipoEstadoPedido);
		}
	}
	
		
}