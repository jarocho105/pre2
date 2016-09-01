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
package com.bydan.erp.produccion.presentation.swing.jinternalframes;




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

import com.bydan.erp.produccion.util.EstadoOrdenProduConstantesFunciones;
import com.bydan.erp.produccion.util.EstadoOrdenProduParameterReturnGeneral;
//import com.bydan.erp.produccion.util.EstadoOrdenProduParameterGeneral;
//import com.bydan.erp.produccion.presentation.report.source.EstadoOrdenProduBean;
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

import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.produccion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.produccion.util.*;
import com.bydan.erp.produccion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.produccion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoOrdenProduBeanSwingJInternalFrame extends EstadoOrdenProduJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoOrdenProduBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoOrdenProdu> estadoordenproduValidator = new ClassValidator<EstadoOrdenProdu>(EstadoOrdenProdu.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoOrdenProdu estadoordenprodu;	
	public EstadoOrdenProdu estadoordenproduAux;
	public EstadoOrdenProdu estadoordenproduAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoOrdenProdu estadoordenproduTotales;
	public Long idEstadoOrdenProduActual;
	public Long iIdNuevoEstadoOrdenProdu=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosPedidoProdu=false;

	public Boolean getIsTienePermisosPedidoProdu() {
		return isTienePermisosPedidoProdu;
	}

	public void setIsTienePermisosPedidoProdu(Boolean isTienePermisosPedidoProdu) {
		this.isTienePermisosPedidoProdu= isTienePermisosPedidoProdu;
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
	
	public Boolean isPermisoTodoEstadoOrdenProdu;
	public Boolean isPermisoNuevoEstadoOrdenProdu;
	public Boolean isPermisoActualizarEstadoOrdenProdu;
	public Boolean isPermisoActualizarOriginalEstadoOrdenProdu;
	public Boolean isPermisoEliminarEstadoOrdenProdu;
	public Boolean isPermisoGuardarCambiosEstadoOrdenProdu;
	public Boolean isPermisoConsultaEstadoOrdenProdu;
	public Boolean isPermisoBusquedaEstadoOrdenProdu;
	public Boolean isPermisoReporteEstadoOrdenProdu;
	public Boolean isPermisoPaginacionMedioEstadoOrdenProdu;
	public Boolean isPermisoPaginacionAltoEstadoOrdenProdu;
	public Boolean isPermisoPaginacionTodoEstadoOrdenProdu;
	public Boolean isPermisoCopiarEstadoOrdenProdu;
	public Boolean isPermisoVerFormEstadoOrdenProdu;
	public Boolean isPermisoDuplicarEstadoOrdenProdu;
	public Boolean isPermisoOrdenEstadoOrdenProdu;
	
	
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
	
	public EstadoOrdenProduParameterReturnGeneral estadoordenproduReturnGeneral;
	public EstadoOrdenProduParameterReturnGeneral estadoordenproduParameterGeneral;
	
	

	public PedidoProduLogic pedidoproduLogic=null;

	public PedidoProduLogic getPedidoProduLogic() {
		return pedidoproduLogic;
	}

	public void setPedidoProduLogic(PedidoProduLogic pedidoproduLogic) {
		this.pedidoproduLogic = pedidoproduLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoOrdenProdu=false;
	public Boolean esParaAccionDesdeFormularioEstadoOrdenProdu=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoOrdenProduLogic estadoordenproduLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoOrdenProdu estadoordenproduBean;
	public EstadoOrdenProduConstantesFunciones estadoordenproduConstantesFunciones;
	//public EstadoOrdenProduParameterReturnGeneral estadoordenproduReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoOrdenProdu> estadoordenprodus;	
	//public List<EstadoOrdenProdu> estadoordenprodusEliminados;
	//public List<EstadoOrdenProdu> estadoordenprodusAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoOrdenProdu=true;
	public Boolean isVisibilidadCeldaCopiarEstadoOrdenProdu=true;
	public Boolean isVisibilidadCeldaVerFormEstadoOrdenProdu=true;
	public Boolean isVisibilidadCeldaOrdenEstadoOrdenProdu=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
	public Boolean isVisibilidadCeldaModificarEstadoOrdenProdu=false;
	public Boolean isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
	public Boolean isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
	public Boolean isVisibilidadCeldaCancelarEstadoOrdenProdu=false;
	public Boolean isVisibilidadCeldaGuardarEstadoOrdenProdu=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;	
	
	
	
	public Long getiIdNuevoEstadoOrdenProdu() {
		return this.iIdNuevoEstadoOrdenProdu;
	}

	public void setiIdNuevoEstadoOrdenProdu(Long iIdNuevoEstadoOrdenProdu) {
		this.iIdNuevoEstadoOrdenProdu = iIdNuevoEstadoOrdenProdu;
	}
	
	public Long getidEstadoOrdenProduActual() {
		return this.idEstadoOrdenProduActual;
	}

	public void setidEstadoOrdenProduActual(Long idEstadoOrdenProduActual) {
		this.idEstadoOrdenProduActual = idEstadoOrdenProduActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoOrdenProdu getestadoordenprodu() {
		return this.estadoordenprodu;
	}

	public void setestadoordenprodu(EstadoOrdenProdu estadoordenprodu) {
		this.estadoordenprodu = estadoordenprodu;
	}
	
	public EstadoOrdenProdu getestadoordenproduAux() {
		return this.estadoordenproduAux;
	}

	public void setestadoordenproduAux(EstadoOrdenProdu estadoordenproduAux) {
		this.estadoordenproduAux = estadoordenproduAux;
	}				
	
	public EstadoOrdenProdu getestadoordenproduAnterior() {
		return this.estadoordenproduAnterior;
	}

	public void setestadoordenproduAnterior(EstadoOrdenProdu estadoordenproduAnterior) {
		this.estadoordenproduAnterior = estadoordenproduAnterior;
	}	
	
	public EstadoOrdenProdu getestadoordenproduTotales() {
		return this.estadoordenproduTotales;
	}

	public void setestadoordenproduTotales(EstadoOrdenProdu estadoordenproduTotales) {
		this.estadoordenproduTotales = estadoordenproduTotales;
	}	
	
	public EstadoOrdenProdu getestadoordenproduBean() {
		return this.estadoordenproduBean;
	}

	public void setestadoordenproduBean(EstadoOrdenProdu estadoordenproduBean) {
		this.estadoordenproduBean = estadoordenproduBean;
	}	
	
	public EstadoOrdenProduParameterReturnGeneral getestadoordenproduReturnGeneral() {
		return this.estadoordenproduReturnGeneral;
	}

	public void setestadoordenproduReturnGeneral(EstadoOrdenProduParameterReturnGeneral estadoordenproduReturnGeneral) {
		this.estadoordenproduReturnGeneral = estadoordenproduReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoOrdenProduLogic getEstadoOrdenProduLogic()	{		
		return estadoordenproduLogic;
	}

	public void setEstadoOrdenProduLogic(EstadoOrdenProduLogic estadoordenproduLogic) {
		this.estadoordenproduLogic = estadoordenproduLogic;
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
	
	public Boolean getIsEsNuevoEstadoOrdenProdu() {
		return isEsNuevoEstadoOrdenProdu;
	}

	public void setIsEsNuevoEstadoOrdenProdu(Boolean isEsNuevoEstadoOrdenProdu) {
		this.isEsNuevoEstadoOrdenProdu = isEsNuevoEstadoOrdenProdu;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoOrdenProdu() {
		return esParaAccionDesdeFormularioEstadoOrdenProdu;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoOrdenProdu(Boolean esParaAccionDesdeFormularioEstadoOrdenProdu) {
		this.esParaAccionDesdeFormularioEstadoOrdenProdu = esParaAccionDesdeFormularioEstadoOrdenProdu;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoOrdenProdu() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoOrdenProduConstantesFunciones.refrescarForeignKeysDescripcionesEstadoOrdenProdu(this.estadoordenproduLogic.getEstadoOrdenProdus());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoOrdenProduConstantesFunciones.refrescarForeignKeysDescripcionesEstadoOrdenProdu(this.estadoordenprodus);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadoordenproduLogic.setEstadoOrdenProdus(this.estadoordenprodus);
			estadoordenproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoOrdenProduParameterReturnGeneral getEstadoOrdenProduParameterGeneral() {
		return this.estadoordenproduParameterGeneral;
	}
	
	public void setEstadoOrdenProduParameterGeneral(EstadoOrdenProduParameterReturnGeneral estadoordenproduParameterGeneral) {
		this.estadoordenproduParameterGeneral = estadoordenproduParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoOrdenProdu() {
		return isPermisoTodoEstadoOrdenProdu;
	}

	public void setIsPermisoTodoEstadoOrdenProdu(Boolean isPermisoTodoEstadoOrdenProdu) {
		this.isPermisoTodoEstadoOrdenProdu = isPermisoTodoEstadoOrdenProdu;
	}

	public Boolean getIsPermisoNuevoEstadoOrdenProdu() {
		return isPermisoNuevoEstadoOrdenProdu;
	}

	public void setIsPermisoNuevoEstadoOrdenProdu(Boolean isPermisoNuevoEstadoOrdenProdu) {
		this.isPermisoNuevoEstadoOrdenProdu = isPermisoNuevoEstadoOrdenProdu;
	}

	public Boolean getIsPermisoActualizarEstadoOrdenProdu() {
		return isPermisoActualizarEstadoOrdenProdu;
	}

	public void setIsPermisoActualizarEstadoOrdenProdu(Boolean isPermisoActualizarEstadoOrdenProdu) {
		this.isPermisoActualizarEstadoOrdenProdu = isPermisoActualizarEstadoOrdenProdu;
	}

	public Boolean getIsPermisoEliminarEstadoOrdenProdu() {
		return isPermisoEliminarEstadoOrdenProdu;
	}

	public void setIsPermisoEliminarEstadoOrdenProdu(Boolean isPermisoEliminarEstadoOrdenProdu) {
		this.isPermisoEliminarEstadoOrdenProdu = isPermisoEliminarEstadoOrdenProdu;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoOrdenProdu() {
		return isPermisoGuardarCambiosEstadoOrdenProdu;
	}

	public void setIsPermisoGuardarCambiosEstadoOrdenProdu(Boolean isPermisoGuardarCambiosEstadoOrdenProdu) {
		this.isPermisoGuardarCambiosEstadoOrdenProdu = isPermisoGuardarCambiosEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoConsultaEstadoOrdenProdu() {
		return isPermisoConsultaEstadoOrdenProdu;
	}

	public void setIsPermisoConsultaEstadoOrdenProdu(Boolean isPermisoConsultaEstadoOrdenProdu) {
		this.isPermisoConsultaEstadoOrdenProdu = isPermisoConsultaEstadoOrdenProdu;
	}

	public Boolean getIsPermisoBusquedaEstadoOrdenProdu() {
		return isPermisoBusquedaEstadoOrdenProdu;
	}

	public void setIsPermisoBusquedaEstadoOrdenProdu(Boolean isPermisoBusquedaEstadoOrdenProdu) {
		this.isPermisoBusquedaEstadoOrdenProdu = isPermisoBusquedaEstadoOrdenProdu;
	}

	public Boolean getIsPermisoReporteEstadoOrdenProdu() {
		return isPermisoReporteEstadoOrdenProdu;
	}

	public void setIsPermisoReporteEstadoOrdenProdu(Boolean isPermisoReporteEstadoOrdenProdu) {
		this.isPermisoReporteEstadoOrdenProdu = isPermisoReporteEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoOrdenProdu() {
		return isPermisoPaginacionMedioEstadoOrdenProdu;
	}

	public void setIsPermisoPaginacionMedioEstadoOrdenProdu(Boolean isPermisoPaginacionMedioEstadoOrdenProdu) {
		this.isPermisoPaginacionMedioEstadoOrdenProdu = isPermisoPaginacionMedioEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoOrdenProdu() {
		return isPermisoPaginacionTodoEstadoOrdenProdu;
	}

	public void setIsPermisoPaginacionTodoEstadoOrdenProdu(Boolean isPermisoPaginacionTodoEstadoOrdenProdu) {
		this.isPermisoPaginacionTodoEstadoOrdenProdu = isPermisoPaginacionTodoEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoOrdenProdu() {
		return isPermisoPaginacionAltoEstadoOrdenProdu;
	}

	public void setIsPermisoPaginacionAltoEstadoOrdenProdu(Boolean isPermisoPaginacionAltoEstadoOrdenProdu) {
		this.isPermisoPaginacionAltoEstadoOrdenProdu = isPermisoPaginacionAltoEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoCopiarEstadoOrdenProdu() {
		return isPermisoCopiarEstadoOrdenProdu;
	}

	public void setIsPermisoCopiarEstadoOrdenProdu(Boolean isPermisoCopiarEstadoOrdenProdu) {
		this.isPermisoCopiarEstadoOrdenProdu = isPermisoCopiarEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoVerFormEstadoOrdenProdu() {
		return isPermisoVerFormEstadoOrdenProdu;
	}

	public void setIsPermisoVerFormEstadoOrdenProdu(Boolean isPermisoVerFormEstadoOrdenProdu) {
		this.isPermisoVerFormEstadoOrdenProdu = isPermisoVerFormEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoDuplicarEstadoOrdenProdu() {
		return isPermisoDuplicarEstadoOrdenProdu;
	}

	public void setIsPermisoDuplicarEstadoOrdenProdu(Boolean isPermisoDuplicarEstadoOrdenProdu) {
		this.isPermisoDuplicarEstadoOrdenProdu = isPermisoDuplicarEstadoOrdenProdu;
	}
	
	public Boolean getIsPermisoOrdenEstadoOrdenProdu() {
		return isPermisoOrdenEstadoOrdenProdu;
	}

	public void setIsPermisoOrdenEstadoOrdenProdu(Boolean isPermisoOrdenEstadoOrdenProdu) {
		this.isPermisoOrdenEstadoOrdenProdu = isPermisoOrdenEstadoOrdenProdu;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoOrdenProdu() {
		return isVisibilidadCeldaNuevoEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaNuevoEstadoOrdenProdu(Boolean isVisibilidadCeldaNuevoEstadoOrdenProdu) {
		this.isVisibilidadCeldaNuevoEstadoOrdenProdu = isVisibilidadCeldaNuevoEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoOrdenProdu() {
		return isVisibilidadCeldaDuplicarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoOrdenProdu(Boolean isVisibilidadCeldaDuplicarEstadoOrdenProdu) {
		this.isVisibilidadCeldaDuplicarEstadoOrdenProdu = isVisibilidadCeldaDuplicarEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoOrdenProdu() {
		return isVisibilidadCeldaCopiarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaCopiarEstadoOrdenProdu(Boolean isVisibilidadCeldaCopiarEstadoOrdenProdu) {
		this.isVisibilidadCeldaCopiarEstadoOrdenProdu = isVisibilidadCeldaCopiarEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoOrdenProdu() {
		return isVisibilidadCeldaVerFormEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaVerFormEstadoOrdenProdu(Boolean isVisibilidadCeldaVerFormEstadoOrdenProdu) {
		this.isVisibilidadCeldaVerFormEstadoOrdenProdu = isVisibilidadCeldaVerFormEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoOrdenProdu() {
		return isVisibilidadCeldaOrdenEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaOrdenEstadoOrdenProdu(Boolean isVisibilidadCeldaOrdenEstadoOrdenProdu) {
		this.isVisibilidadCeldaOrdenEstadoOrdenProdu = isVisibilidadCeldaOrdenEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu() {
		return isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu(Boolean isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu = isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoOrdenProdu() {
		return isVisibilidadCeldaModificarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaModificarEstadoOrdenProdu(Boolean isVisibilidadCeldaModificarEstadoOrdenProdu) {
		this.isVisibilidadCeldaModificarEstadoOrdenProdu = isVisibilidadCeldaModificarEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoOrdenProdu() {
		return isVisibilidadCeldaActualizarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaActualizarEstadoOrdenProdu(Boolean isVisibilidadCeldaActualizarEstadoOrdenProdu) {
		this.isVisibilidadCeldaActualizarEstadoOrdenProdu = isVisibilidadCeldaActualizarEstadoOrdenProdu;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoOrdenProdu() {
		return isVisibilidadCeldaEliminarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaEliminarEstadoOrdenProdu(Boolean isVisibilidadCeldaEliminarEstadoOrdenProdu) {
		this.isVisibilidadCeldaEliminarEstadoOrdenProdu = isVisibilidadCeldaEliminarEstadoOrdenProdu;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoOrdenProdu() {
		return isVisibilidadCeldaCancelarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaCancelarEstadoOrdenProdu(Boolean isVisibilidadCeldaCancelarEstadoOrdenProdu) {
		this.isVisibilidadCeldaCancelarEstadoOrdenProdu = isVisibilidadCeldaCancelarEstadoOrdenProdu;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoOrdenProdu() {
		return isVisibilidadCeldaGuardarEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaGuardarEstadoOrdenProdu(Boolean isVisibilidadCeldaGuardarEstadoOrdenProdu) {
		this.isVisibilidadCeldaGuardarEstadoOrdenProdu = isVisibilidadCeldaGuardarEstadoOrdenProdu;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoOrdenProdu() {
		return isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoOrdenProdu(Boolean isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu) {
		this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu = isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu;
	}
		
	public EstadoOrdenProduSessionBean getestadoordenproduSessionBean() {
		return this.estadoordenproduSessionBean;
	}
	
	public void setestadoordenproduSessionBean(EstadoOrdenProduSessionBean estadoordenproduSessionBean) {
		this.estadoordenproduSessionBean=estadoordenproduSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoOrdenProdu estadoordenprodu,EstadoOrdenProdu estadoordenproduAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoOrdenProdu(estadoordenprodu);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadoordenproduAux.setId(estadoordenprodu.getId());
		estadoordenproduAux.setVersionRow(estadoordenprodu.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoOrdenProdu();
		
			int intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadoordenproduValidator.getInvalidValues(this.estadoordenprodu);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadoordenproduLogic.setDatosCliente(datosCliente);
			estadoordenproduLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadoordenproduAux=new  EstadoOrdenProdu();
				
				estadoordenproduAux.setIsNew(true);
				estadoordenproduAux.setIsChanged(true);
				
				estadoordenproduAux.setEstadoOrdenProduOriginal(this.estadoordenprodu);
				
				estadoordenproduAux.setId(this.estadoordenprodu.getId());	
				estadoordenproduAux.setVersionRow(this.estadoordenprodu.getVersionRow());	
				estadoordenproduAux.setnombre(this.estadoordenprodu.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoordenproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadoordenproduAux,estadoordenproduLogic.getEstadoOrdenProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordenproduAux,estadoordenprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoordenproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordenproduLogic.saveEstadoOrdenProdus();//WithConnection
						//estadoordenproduLogic.getSetVersionRowEstadoOrdenProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoordenprodu,estadoordenproduAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadoordenproduAux=new  EstadoOrdenProdu();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado() 
					|| (this.estadoordenproduSessionBean.getEsGuardarRelacionado() && this.estadoordenprodu.getId()>=0)) {
						
					estadoordenproduAux.setIsNew(false);
				}
				
				estadoordenproduAux.setIsDeleted(false);
			
				estadoordenproduAux.setId(this.estadoordenprodu.getId());	
				estadoordenproduAux.setVersionRow(this.estadoordenprodu.getVersionRow());	
				estadoordenproduAux.setnombre(this.estadoordenprodu.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoordenproduAux,estadoordenproduLogic.getEstadoOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordenproduAux,estadoordenprodus);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoordenproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordenproduLogic.saveEstadoOrdenProdus();//WithConnection
						//estadoordenproduLogic.getSetVersionRowEstadoOrdenProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadoordenprodu,estadoordenproduAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadoordenproduAux=new  EstadoOrdenProdu();
				
				estadoordenproduAux.setIsNew(false);
				estadoordenproduAux.setIsChanged(false);
				
				estadoordenproduAux.setIsDeleted(true);
				
				estadoordenproduAux.setId(this.estadoordenprodu.getId());	
				estadoordenproduAux.setVersionRow(this.estadoordenprodu.getVersionRow());	
				estadoordenproduAux.setnombre(this.estadoordenprodu.getnombre());	
				
				if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadoordenproduAux.getId()>=0) {	
						this.estadoordenprodusEliminados.add(estadoordenproduAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadoordenproduAux,estadoordenproduLogic.getEstadoOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordenproduAux,estadoordenprodus);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadoordenproduSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordenproduLogic.saveEstadoOrdenProdus();//WithConnection
						//estadoordenproduLogic.getSetVersionRowEstadoOrdenProdus();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.quitarFilaTotales();}
							estadoordenproduAux.setPedidoProdus(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadoordenproduSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadoordenproduAux,estadoordenproduLogic.getEstadoOrdenProdus());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadoordenproduAux,estadoordenprodus);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.getEstadoOrdenProdus().addAll(this.estadoordenprodusEliminados);
					
					estadoordenproduLogic.saveEstadoOrdenProdus();//WithConnection
					//estadoordenproduLogic.getSetVersionRowEstadoOrdenProdus();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadoordenprodusEliminados= new ArrayList<EstadoOrdenProdu>();		
			}
			
			if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Orden Produccion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadoordenprodu=estadoordenproduAux;
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
      		//this.finishProcessEstadoOrdenProdu();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoOrdenProdu estadoordenproduLocal) throws Exception {
		
		if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadoordenproduLocal.setPedidoProdus(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
			
			} else {
			
				estadoordenproduLocal.setPedidoProdus(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoprodus);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoOrdenProdu estadoordenproduLocal) throws Exception {	
		if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoOrdenProduActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadoordenproduValidator.getInvalidValues(this.estadoordenprodu);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoOrdenProdu estadoordenprodu,List<EstadoOrdenProdu> estadoordenprodus) throws Exception {
		try	{		
			EstadoOrdenProduConstantesFunciones.actualizarLista(estadoordenprodu,estadoordenprodus,this.estadoordenproduSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoOrdenProdu estadoordenprodu,List<EstadoOrdenProdu> estadoordenprodus) throws Exception {
		try	{			
			EstadoOrdenProduConstantesFunciones.actualizarSelectedLista(estadoordenprodu,estadoordenprodus);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoOrdenProdu> estadoordenprodusLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadoordenprodusLocal=this.estadoordenproduLogic.getEstadoOrdenProdus();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadoordenprodusLocal=this.estadoordenprodus;
			}
			//ARCHITECTURE
		
			for(EstadoOrdenProdu estadoordenproduLocal:estadoordenprodusLocal) {
				if(this.permiteMantenimiento(estadoordenproduLocal) && estadoordenproduLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoOrdenProduConstantesFunciones.getEstadoOrdenProduLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoOrdenProduConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenProdu.jLabelnombreEstadoOrdenProdu,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoOrdenProdu.jLabelnombreEstadoOrdenProdu,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("PedidoProdu")) {
			if(this.estadoordenprodu==null) {
				this.estadoordenprodu= new EstadoOrdenProdu();
			}

			if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoOrdenProdu
				this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);

				this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.getpedidoprodu().setEstadoOrdenProdu(this.estadoordenprodu);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoOrdenProdu--;	
		
		
		this.estadoordenproduAux=new EstadoOrdenProdu();
		
		this.estadoordenproduAux.setId(this.iIdNuevoEstadoOrdenProdu);
		this.estadoordenproduAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadoordenproduLogic.getEstadoOrdenProdus().add(this.estadoordenproduAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadoordenprodus.add(this.estadoordenproduAux);
		}
		//ARCHITECTURE
		
		this.estadoordenprodu=this.estadoordenproduAux;
		
		if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenprodu);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenProdu(this.estadoordenprodu);
		}
				
		//this.setDefaultControlesEstadoOrdenProdu();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoOrdenProdu();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoOrdenProdu();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoOrdenProdu();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoOrdenProdu(this.estadoordenproduBean,this.estadoordenprodu,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
			classes=EstadoOrdenProduConstantesFunciones.getClassesRelationshipsOfEstadoOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadoordenproduReturnGeneral=estadoordenproduLogic.procesarEventosEstadoOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoordenproduLogic.getEstadoOrdenProdus(),this.estadoordenprodu,this.estadoordenproduParameterGeneral,this.isEsNuevoEstadoOrdenProdu,classes);//this.estadoordenproduLogic.getEstadoOrdenProdu()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoOrdenProdu(this.estadoordenproduReturnGeneral,this.estadoordenproduBean,false);
		
		if(this.estadoordenproduReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu());
		}
		
		if(this.estadoordenproduReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu(),classes);//this.estadoordenproduBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoOrdenProdu();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoOrdenProdu();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
						
			if(estadoordenproduSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getEsGuardarRelacionado() && PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoProduActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoOrdenProdu();
			}
			
			this.actualizarVisualTableDatosEstadoOrdenProdu();
			
			this.jTableDatosEstadoOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenProdu(), this.getIndiceNuevoEstadoOrdenProdu());
			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
						
			this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoOrdenProdu(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setEnabled(isHabilitar && this.estadoordenproduConstantesFunciones.activarnombreEstadoOrdenProdu);	
		
	};
	
	public void setDefaultControlesEstadoOrdenProdu() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoOrdenProdu(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadoordenproduSessionBean.setConGuardarRelaciones(true);			
			this.estadoordenproduSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadoordenproduSessionBean.setConGuardarRelaciones(false);			
			this.estadoordenproduSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoOrdenProdu() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
				if(estadoordenproduAux.getId().equals(this.iIdNuevoEstadoOrdenProdu)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenprodus) {
				if(estadoordenproduAux.getId().equals(this.iIdNuevoEstadoOrdenProdu)) {
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
	
	public int getIndiceActualEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
				if(estadoordenproduAux.getId().equals(estadoordenprodu.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenprodus) {
				if(estadoordenproduAux.getId().equals(estadoordenprodu.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoOrdenProdu(EstadoOrdenProdu estadoordenproduOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
				if(estadoordenproduAux.getEstadoOrdenProduOriginal().getId().equals(estadoordenproduOriginal.getId())) {
					existe=true;
					estadoordenproduOriginal.setId(estadoordenproduAux.getId());
					estadoordenproduOriginal.setVersionRow(estadoordenproduAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenprodus) {
				if(estadoordenproduAux.getEstadoOrdenProduOriginal().getId().equals(estadoordenproduOriginal.getId())) {
					existe=true;
					estadoordenproduOriginal.setId(estadoordenproduAux.getId());
					estadoordenproduOriginal.setVersionRow(estadoordenproduAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoOrdenProdu(Boolean esParaCancelar) throws Exception {
		estadoordenprodusAux=new ArrayList<EstadoOrdenProdu>();
		estadoordenproduAux=new EstadoOrdenProdu();
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
					if(estadoordenproduAux.getId()<0) {
						estadoordenprodusAux.add(estadoordenproduAux);
					}		
				}
				this.iIdNuevoEstadoOrdenProdu=0L;
				this.estadoordenproduLogic.getEstadoOrdenProdus().removeAll(estadoordenprodusAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenprodus) {
					if(estadoordenproduAux.getId()<0) {
						estadoordenprodusAux.add(estadoordenproduAux);
					}		
				}
				this.iIdNuevoEstadoOrdenProdu=0L;
				this.estadoordenprodus.removeAll(estadoordenprodusAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoOrdenProdu 
					&& this.estadoordenproduLogic.getEstadoOrdenProdus().size()>0
					) {
					estadoordenproduAux=this.estadoordenproduLogic.getEstadoOrdenProdus().get(this.estadoordenproduLogic.getEstadoOrdenProdus().size() - 1);
				
					if(estadoordenproduAux.getId()<0) {
						this.estadoordenproduLogic.getEstadoOrdenProdus().remove(estadoordenproduAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoOrdenProdu && this.estadoordenprodus.size()>0) {
					estadoordenproduAux=this.estadoordenprodus.get(this.estadoordenprodus.size() - 1);
				
					if(estadoordenproduAux.getId()<0) {
						this.estadoordenprodus.remove(estadoordenproduAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoOrdenProdu(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadoordenprodu.getId()<0) {
				this.estadoordenproduLogic.getEstadoOrdenProdus().remove(this.estadoordenprodu);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadoordenprodu.getId()<0) {
				this.estadoordenprodus.remove(this.estadoordenprodu);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoOrdenProdu(List<EstadoOrdenProdu> estadoordenprodusAux) throws Exception {
		EstadoOrdenProduConstantesFunciones.setEstadosInicialesEstadoOrdenProdu(estadoordenprodusAux);
	}
	
	public void setEstadosInicialesEstadoOrdenProdu(EstadoOrdenProdu estadoordenproduAux) throws Exception {
		EstadoOrdenProduConstantesFunciones.setEstadosInicialesEstadoOrdenProdu(estadoordenproduAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoOrdenProduActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoOrdenProduActual()) {
				if(!this.isEsNuevoEstadoOrdenProdu) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoOrdenProdu=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoOrdenProduActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Orden Produccion ?", "MANTENIMIENTO DE Estado Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoOrdenProdu estadoordenprodu) throws Exception {
		EstadoOrdenProduConstantesFunciones.seleccionarAsignar(this.estadoordenprodu,estadoordenprodu);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoOrdenProdu=this.isPermisoActualizarOriginalEstadoOrdenProdu;
			
			
			this.seleccionarAsignar(estadoordenprodu);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoOrdenProduConstantesFunciones.quitarEspaciosEstadoOrdenProdu(this.estadoordenprodu,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadoordenproduSessionBean.setsFuncionBusquedaRapida(this.estadoordenproduSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoOrdenProdu) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoOrdenProdu(esParaCancelar);				
				this.cancelarNuevoEstadoOrdenProdu(esParaCancelar);								
			}
			
			this.estadoordenprodu=new EstadoOrdenProdu();
			
			this.inicializarEstadoOrdenProdu();
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoOrdenProdu() throws Exception {
		try {
			EstadoOrdenProduConstantesFunciones.inicializarEstadoOrdenProdu(this.estadoordenprodu);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadoordenproduLogic.getEstadoOrdenProdus().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoOrdenProdus(String sAccionBusqueda,List<EstadoOrdenProdu> estadoordenprodusParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoOrdenProdu"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoOrdenProduMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoOrdenProduMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoOrdenProdu"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Orden Produccions");		
		parameters.put("busquedapor", EstadoOrdenProduConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(PedidoProdu.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoOrdenProduLogic estadoordenproduLogicAuxiliar=new EstadoOrdenProduLogic();
					estadoordenproduLogicAuxiliar.setDatosCliente(estadoordenproduLogic.getDatosCliente());				
					estadoordenproduLogicAuxiliar.setEstadoOrdenProdus(estadoordenprodusParaReportes);
					
					estadoordenproduLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoOrdenProduWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadoordenprodusParaReportes=estadoordenproduLogicAuxiliar.getEstadoOrdenProdus();
					
					//estadoordenproduLogic.getNewConnexionToDeep();
					
					//for (EstadoOrdenProdu estadoordenprodu:estadoordenprodusParaReportes) {
					//	estadoordenproduLogic.deepLoad(estadoordenprodu, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadoordenproduLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadoordenproduLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFilePedidoProdu = AuxiliarReportes.class.getResourceAsStream("PedidoProduDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedidoprodu", reportFilePedidoProdu);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoOrdenProdu=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoOrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoOrdenProduConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoOrdenProdu=new JRBeanArrayDataSource(EstadoOrdenProduJInternalFrame.TraerEstadoOrdenProduBeans(estadoordenprodusParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoOrdenProdu);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoOrdenProduConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoOrdenProduConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoOrdenProduBean.TraerEstadoOrdenProduBeans(estadoordenprodusParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,estadoordenprodusParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,estadoordenprodusParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProduActionPerformed(null);
					//this.generarExcelReporteEstadoOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,estadoordenprodusParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,estadoordenprodusParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,estadoordenprodusParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoOrdenProdus(sAccionBusqueda,sTipoArchivoReporte,estadoordenprodusParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoOrdenProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoOrdenProdu> estadoordenprodusParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoOrdenProdus");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoOrdenProdu("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoOrdenProdu estadoordenprodu : estadoordenprodusParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoOrdenProduConstantesFunciones.generarExcelReporteDataEstadoOrdenProdu("NORMAL",row,workbook,estadoordenprodu,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoOrdenProdu(String sTipo,Row row,Workbook workbook) {
		
		EstadoOrdenProduConstantesFunciones.generarExcelReporteHeaderEstadoOrdenProdu(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoOrdenProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoOrdenProdu> estadoordenprodusParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoOrdenProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoOrdenProdu estadoordenprodu : estadoordenprodusParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoOrdenProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenprodu));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadoordenprodu.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoOrdenProdus(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoOrdenProdu> estadoordenprodusParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoOrdenProdu> estadoordenprodusRespaldo=null;
		
		classes=EstadoOrdenProduConstantesFunciones.getClassesRelationshipsOfEstadoOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadoordenproduLogic.setDatosCliente(this.datosCliente);
		this.estadoordenproduLogic.setDatosDeep(this.datosDeep);
		this.estadoordenproduLogic.setIsConDeep(true);
		
		estadoordenprodusRespaldo=this.estadoordenproduLogic.getEstadoOrdenProdus();
		
		this.estadoordenproduLogic.setEstadoOrdenProdus(estadoordenprodusParaReportes);	
		this.estadoordenproduLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadoordenprodusParaReportes=this.estadoordenproduLogic.getEstadoOrdenProdus();
		this.estadoordenproduLogic.setEstadoOrdenProdus(estadoordenprodusRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoOrdenProdus");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoOrdenProdu("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoOrdenProdu estadoordenprodu : estadoordenprodusParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoOrdenProdu("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoOrdenProduConstantesFunciones.generarExcelReporteDataEstadoOrdenProdu("NORMAL",row,workbook,estadoordenprodu,cellStyleDataAux);
		
			
			


				//PedidoProdu
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoProduConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadoordenprodu.getPedidoProdus()!=null && estadoordenprodu.getPedidoProdus().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoProduConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoProduConstantesFunciones.generarExcelReporteHeaderPedidoProdu("RELACIONADO",row,workbook);
				}

				if(estadoordenprodu.getPedidoProdus()!=null) {
					i2=0;
					for(PedidoProdu pedidoprodu : estadoordenprodu.getPedidoProdus()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoProduConstantesFunciones.generarExcelReporteDataPedidoProdu("RELACIONADO",row,workbook,pedidoprodu,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoOrdenProduConstantesFunciones.getEstadoOrdenProduDescripcion(estadoordenprodu));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoOrdenProdu() throws Exception {		
		this.startProcessEstadoOrdenProdu(true);
	}
	
	public void startProcessEstadoOrdenProdu(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoOrdenProdu, this.jScrollPanelDatosEstadoOrdenProdu,this.jPanelPaginacionEstadoOrdenProdu, this.jScrollPanelDatosEdicionEstadoOrdenProdu, this.jPanelAccionesEstadoOrdenProdu,this.jPanelAccionesFormularioEstadoOrdenProdu,this.jmenuBarEstadoOrdenProdu,this.jmenuBarDetalleEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,this.jTtoolBarDetalleEstadoOrdenProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoOrdenProdu=null; 
		
		final JPanel jPanelParametrosReportesEstadoOrdenProdu=this.jPanelParametrosReportesEstadoOrdenProdu;
		//final JScrollPane jScrollPanelDatosEstadoOrdenProdu=this.jScrollPanelDatosEstadoOrdenProdu;
		final JTable jTableDatosEstadoOrdenProdu=this.jTableDatosEstadoOrdenProdu;		
		final JPanel jPanelPaginacionEstadoOrdenProdu=this.jPanelPaginacionEstadoOrdenProdu;
		//final JScrollPane jScrollPanelDatosEdicionEstadoOrdenProdu=this.jScrollPanelDatosEdicionEstadoOrdenProdu;
		final JPanel jPanelAccionesEstadoOrdenProdu=this.jPanelAccionesEstadoOrdenProdu;
		
		JPanel jPanelCamposAuxiliarEstadoOrdenProdu=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoOrdenProdu=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			jPanelCamposAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jPanelCamposEstadoOrdenProdu;
			jPanelAccionesFormularioAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jPanelAccionesFormularioEstadoOrdenProdu;
		}
		
		final JPanel jPanelCamposEstadoOrdenProdu=jPanelCamposAuxiliarEstadoOrdenProdu;
		final JPanel jPanelAccionesFormularioEstadoOrdenProdu=jPanelAccionesFormularioAuxiliarEstadoOrdenProdu;
		
		
		final JMenuBar jmenuBarEstadoOrdenProdu=this.jmenuBarEstadoOrdenProdu;
		final JToolBar jTtoolBarEstadoOrdenProdu=this.jTtoolBarEstadoOrdenProdu;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoOrdenProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoOrdenProdu=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			jmenuBarDetalleAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jmenuBarDetalleEstadoOrdenProdu;
			jTtoolBarDetalleAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jTtoolBarDetalleEstadoOrdenProdu;
		}
		
		final JMenuBar jmenuBarDetalleEstadoOrdenProdu=jmenuBarDetalleAuxiliarEstadoOrdenProdu;
		final JToolBar jTtoolBarDetalleEstadoOrdenProdu=jTtoolBarDetalleAuxiliarEstadoOrdenProdu;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoOrdenProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoOrdenProdu;
			processRunnable.jTableDatos=jTableDatosEstadoOrdenProdu;
			processRunnable.jPanelCampos=jPanelCamposEstadoOrdenProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoOrdenProdu;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoOrdenProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoOrdenProdu;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoOrdenProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoOrdenProdu;
			processRunnable.jTtoolBar=jTtoolBarEstadoOrdenProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoOrdenProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoOrdenProdu ,jPanelParametrosReportesEstadoOrdenProdu,jTableDatosEstadoOrdenProdu, /*jScrollPanelDatosEstadoOrdenProdu,*/jPanelCamposEstadoOrdenProdu,jPanelPaginacionEstadoOrdenProdu, /*jScrollPanelDatosEdicionEstadoOrdenProdu,*/ jPanelAccionesEstadoOrdenProdu,jPanelAccionesFormularioEstadoOrdenProdu,jmenuBarEstadoOrdenProdu,jmenuBarDetalleEstadoOrdenProdu,jTtoolBarEstadoOrdenProdu,jTtoolBarDetalleEstadoOrdenProdu);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoOrdenProdu, jScrollPanelDatosEstadoOrdenProdu,jPanelPaginacionEstadoOrdenProdu, jScrollPanelDatosEdicionEstadoOrdenProdu, jPanelAccionesEstadoOrdenProdu,jPanelAccionesFormularioEstadoOrdenProdu,jmenuBarEstadoOrdenProdu,jmenuBarDetalleEstadoOrdenProdu,jTtoolBarEstadoOrdenProdu,jTtoolBarDetalleEstadoOrdenProdu);
						
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
	
	public void finishProcessEstadoOrdenProdu() {// throws Exception 
		this.finishProcessEstadoOrdenProdu(true);
	}
	
	public void finishProcessEstadoOrdenProdu(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoOrdenProdu, this.jScrollPanelDatosEstadoOrdenProdu,this.jPanelPaginacionEstadoOrdenProdu, this.jScrollPanelDatosEdicionEstadoOrdenProdu, this.jPanelAccionesEstadoOrdenProdu,this.jPanelAccionesFormularioEstadoOrdenProdu,this.jmenuBarEstadoOrdenProdu,this.jmenuBarDetalleEstadoOrdenProdu,this.jTtoolBarEstadoOrdenProdu,this.jTtoolBarDetalleEstadoOrdenProdu);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoOrdenProdu=null; 
		
		final JPanel jPanelParametrosReportesEstadoOrdenProdu=this.jPanelParametrosReportesEstadoOrdenProdu;
		//final JScrollPane jScrollPanelDatosEstadoOrdenProdu=this.jScrollPanelDatosEstadoOrdenProdu;
		final JTable jTableDatosEstadoOrdenProdu=this.jTableDatosEstadoOrdenProdu;		
		final JPanel jPanelPaginacionEstadoOrdenProdu=this.jPanelPaginacionEstadoOrdenProdu;
		//final JScrollPane jScrollPanelDatosEdicionEstadoOrdenProdu=this.jScrollPanelDatosEdicionEstadoOrdenProdu;
		final JPanel jPanelAccionesEstadoOrdenProdu=this.jPanelAccionesEstadoOrdenProdu;
		
		JPanel jPanelCamposAuxiliarEstadoOrdenProdu=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoOrdenProdu=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			jPanelCamposAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jPanelCamposEstadoOrdenProdu;
			jPanelAccionesFormularioAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jPanelAccionesFormularioEstadoOrdenProdu;
		}
		
		final JPanel jPanelCamposEstadoOrdenProdu=jPanelCamposAuxiliarEstadoOrdenProdu;
		final JPanel jPanelAccionesFormularioEstadoOrdenProdu=jPanelAccionesFormularioAuxiliarEstadoOrdenProdu;
		
		
		final JMenuBar jmenuBarEstadoOrdenProdu=this.jmenuBarEstadoOrdenProdu;		
		final JToolBar jTtoolBarEstadoOrdenProdu=this.jTtoolBarEstadoOrdenProdu;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoOrdenProdu=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoOrdenProdu=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			jmenuBarDetalleAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jmenuBarDetalleEstadoOrdenProdu;
			jTtoolBarDetalleAuxiliarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jTtoolBarDetalleEstadoOrdenProdu;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoOrdenProdu=jmenuBarDetalleAuxiliarEstadoOrdenProdu;
		final JToolBar jTtoolBarDetalleEstadoOrdenProdu=jTtoolBarDetalleAuxiliarEstadoOrdenProdu;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoOrdenProdu;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoOrdenProdu;
			processRunnable.jTableDatos=jTableDatosEstadoOrdenProdu;
			processRunnable.jPanelCampos=jPanelCamposEstadoOrdenProdu;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoOrdenProdu;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoOrdenProdu;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoOrdenProdu;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoOrdenProdu;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoOrdenProdu;
			processRunnable.jTtoolBar=jTtoolBarEstadoOrdenProdu;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoOrdenProdu;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoOrdenProdu ,jPanelParametrosReportesEstadoOrdenProdu, jTableDatosEstadoOrdenProdu,/*jScrollPanelDatosEstadoOrdenProdu,*/jPanelCamposEstadoOrdenProdu,jPanelPaginacionEstadoOrdenProdu, /*jScrollPanelDatosEdicionEstadoOrdenProdu,*/ jPanelAccionesEstadoOrdenProdu,jPanelAccionesFormularioEstadoOrdenProdu,jmenuBarEstadoOrdenProdu,jmenuBarDetalleEstadoOrdenProdu,jTtoolBarEstadoOrdenProdu,jTtoolBarDetalleEstadoOrdenProdu));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoOrdenProdu(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoOrdenProdu(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoOrdenProdu(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoOrdenProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoOrdenProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoOrdenProdu,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoOrdenProdu(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoOrdenProdu,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoOrdenProdu,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadoordenproduConstantesFunciones.getsFinalQueryEstadoOrdenProdu();
		String  finalQueryPaginacionTodos=this.estadoordenproduConstantesFunciones.getsFinalQueryEstadoOrdenProdu();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoOrdenProduConstantesFunciones.getArrayColumnasGlobalesNoEstadoOrdenProdu(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoOrdenProduConstantesFunciones.getArrayColumnasGlobalesEstadoOrdenProdu(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoOrdenProduConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadoordenprodusEliminados= new ArrayList<EstadoOrdenProdu>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoOrdenProdu();
		
				///*EstadoOrdenProduSessionBean*/this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
			
			if(this.estadoordenproduSessionBean==null) {
				this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
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
					this.iNumeroPaginacion=EstadoOrdenProduConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoOrdenProduConstantesFunciones.getClassesForeignKeysOfEstadoOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadoordenprodu."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadoordenprodusAux= new ArrayList<EstadoOrdenProdu>();
			
				
			estadoordenproduLogic.setDatosCliente(this.datosCliente);
			estadoordenproduLogic.setDatosDeep(this.datosDeep);
			estadoordenproduLogic.setIsConDeep(true);
			
			
			estadoordenproduLogic.getEstadoOrdenProduDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadoordenproduLogic.getTodosEstadoOrdenProdus(finalQueryGlobal,pagination);
					
					//estadoordenproduLogic.getTodosEstadoOrdenProdusWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadoordenproduLogic.getEstadoOrdenProdus()==null|| estadoordenproduLogic.getEstadoOrdenProdus().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoordenprodusAux= new ArrayList<EstadoOrdenProdu>();
							estadoordenprodusAux.addAll(estadoordenproduLogic.getEstadoOrdenProdus());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoordenprodusAux= new ArrayList<EstadoOrdenProdu>();
							estadoordenprodusAux.addAll(estadoordenprodus);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoordenproduLogic.getTodosEstadoOrdenProdus(finalQueryGlobal+"",this.pagination);												
							
							//estadoordenproduLogic.getTodosEstadoOrdenProdusWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoOrdenProdus("Todos",estadoordenproduLogic.getEstadoOrdenProdus() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadoordenproduLogic.setEstadoOrdenProdus(new ArrayList<EstadoOrdenProdu>());					
							estadoordenproduLogic.getEstadoOrdenProdus().addAll(estadoordenprodusAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoordenprodus=new ArrayList<EstadoOrdenProdu>();
							estadoordenprodus.addAll(estadoordenprodusAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoOrdenProdu=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoOrdenProdu=this.idActual;
				
				} else if(this.idEstadoOrdenProduActual!=null && this.idEstadoOrdenProduActual!=0L) {
					idEstadoOrdenProdu=idEstadoOrdenProduActual;
				}
				
					
				this.sDetalleReporte=EstadoOrdenProduConstantesFunciones.getDetalleIndicePorId(idEstadoOrdenProdu);
				
				this.estadoordenprodus=new ArrayList<EstadoOrdenProdu>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadoordenproduLogic.getEntity(idEstadoOrdenProdu);
					
					//estadoordenproduLogic.getEntityWithConnection(idEstadoOrdenProdu);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoordenproduLogic.setEstadoOrdenProdus(new ArrayList<EstadoOrdenProdu>());
					estadoordenproduLogic.getEstadoOrdenProdus().add(estadoordenproduLogic.getEstadoOrdenProdu());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoordenprodus=new ArrayList<EstadoOrdenProdu>();
					this.estadoordenprodus.add(estadoordenprodu);
				}
				
				if(estadoordenproduLogic.getEstadoOrdenProdu()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoOrdenProdu();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoOrdenProdu();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoordenproduLogic.getEstadoOrdenProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoordenprodus.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadoordenproduLogic.getEstadoOrdenProdus().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadoordenprodus.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoOrdenProdu estadoordenprodu) {
		Boolean permite=true;
		
		if(this.estadoordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoOrdenProduConstantesFunciones.getOrderByListaEstadoOrdenProdu();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoOrdenProduConstantesFunciones.getOrderByListaEstadoOrdenProdu();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenProdu estadoordenprodu:estadoordenproduLogic.getEstadoOrdenProdus()) {
				if(estadoordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordenproduTotales=estadoordenprodu;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenProdu estadoordenprodu:this.estadoordenprodus) {
				if(estadoordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordenproduTotales=estadoordenprodu;
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
			this.estadoordenproduAux=new EstadoOrdenProdu();
			this.estadoordenproduAux.setsType(Constantes2.S_TOTALES);
			this.estadoordenproduAux.setIsNew(false);
			this.estadoordenproduAux.setIsChanged(false);
			this.estadoordenproduAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoOrdenProduConstantesFunciones.TotalizarValoresFilaEstadoOrdenProdu(this.estadoordenproduLogic.getEstadoOrdenProdus(),this.estadoordenproduAux);
				
				this.estadoordenproduLogic.getEstadoOrdenProdus().add(this.estadoordenproduAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoOrdenProduConstantesFunciones.TotalizarValoresFilaEstadoOrdenProdu(this.estadoordenprodus,this.estadoordenproduAux);
				
				this.estadoordenprodus.add(this.estadoordenproduAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadoordenproduTotales=new EstadoOrdenProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoordenproduLogic.getEstadoOrdenProdus().remove(estadoordenproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadoordenprodus.remove(estadoordenproduTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadoordenproduTotales=new EstadoOrdenProdu();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoOrdenProdu estadoordenprodu:estadoordenproduLogic.getEstadoOrdenProdus()) {
				if(estadoordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordenproduTotales=estadoordenprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoOrdenProduConstantesFunciones.TotalizarValoresFilaEstadoOrdenProdu(this.estadoordenproduLogic.getEstadoOrdenProdus(),estadoordenproduTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoOrdenProdu estadoordenprodu:this.estadoordenprodus) {
				if(estadoordenprodu.getsType().equals(Constantes2.S_TOTALES)) {
					estadoordenproduTotales=estadoordenprodu;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoOrdenProduConstantesFunciones.TotalizarValoresFilaEstadoOrdenProdu(this.estadoordenprodus,estadoordenproduTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosEstadoOrdenProdu() {
		this.isPermisoTodoEstadoOrdenProdu=false;
		this.isPermisoNuevoEstadoOrdenProdu=false;
		this.isPermisoActualizarEstadoOrdenProdu=false;
		this.isPermisoActualizarOriginalEstadoOrdenProdu=false;
		this.isPermisoEliminarEstadoOrdenProdu=false;
		this.isPermisoGuardarCambiosEstadoOrdenProdu=false;
		this.isPermisoConsultaEstadoOrdenProdu=false;
		this.isPermisoBusquedaEstadoOrdenProdu=false;
		this.isPermisoReporteEstadoOrdenProdu=false;		
		this.isPermisoOrdenEstadoOrdenProdu=false;		
		this.isPermisoPaginacionMedioEstadoOrdenProdu=false;		
		this.isPermisoPaginacionAltoEstadoOrdenProdu=false;
		this.isPermisoPaginacionTodoEstadoOrdenProdu=false;
		this.isPermisoCopiarEstadoOrdenProdu=false;		
		this.isPermisoVerFormEstadoOrdenProdu=false;		
		this.isPermisoDuplicarEstadoOrdenProdu=false;		
		this.isPermisoOrdenEstadoOrdenProdu=false;		
	}
	
	public void setPermisosUsuarioEstadoOrdenProdu(Boolean isPermiso) {
		this.isPermisoTodoEstadoOrdenProdu=isPermiso;
		this.isPermisoNuevoEstadoOrdenProdu=isPermiso;
		this.isPermisoActualizarEstadoOrdenProdu=isPermiso;
		this.isPermisoActualizarOriginalEstadoOrdenProdu=isPermiso;
		this.isPermisoEliminarEstadoOrdenProdu=isPermiso;
		this.isPermisoGuardarCambiosEstadoOrdenProdu=isPermiso;
		this.isPermisoConsultaEstadoOrdenProdu=isPermiso;
		this.isPermisoBusquedaEstadoOrdenProdu=isPermiso;
		this.isPermisoReporteEstadoOrdenProdu=isPermiso;
		this.isPermisoOrdenEstadoOrdenProdu=isPermiso;		
		this.isPermisoPaginacionMedioEstadoOrdenProdu=isPermiso;		
		this.isPermisoPaginacionAltoEstadoOrdenProdu=isPermiso;		
		this.isPermisoPaginacionTodoEstadoOrdenProdu=isPermiso;		
		this.isPermisoCopiarEstadoOrdenProdu=isPermiso;		
		this.isPermisoVerFormEstadoOrdenProdu=isPermiso;		
		this.isPermisoDuplicarEstadoOrdenProdu=isPermiso;
		this.isPermisoOrdenEstadoOrdenProdu=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoOrdenProdu(Boolean isPermiso) {
		//this.isPermisoTodoEstadoOrdenProdu=isPermiso;
		this.isPermisoNuevoEstadoOrdenProdu=isPermiso;
		this.isPermisoActualizarEstadoOrdenProdu=isPermiso;
		this.isPermisoActualizarOriginalEstadoOrdenProdu=isPermiso;
		this.isPermisoEliminarEstadoOrdenProdu=isPermiso;
		this.isPermisoGuardarCambiosEstadoOrdenProdu=isPermiso;
		//this.isPermisoConsultaEstadoOrdenProdu=isPermiso;
		//this.isPermisoBusquedaEstadoOrdenProdu=isPermiso;
		//this.isPermisoReporteEstadoOrdenProdu=isPermiso;
		//this.isPermisoOrdenEstadoOrdenProdu=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoOrdenProdu=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoOrdenProdu=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoOrdenProdu=isPermiso;		
		//this.isPermisoCopiarEstadoOrdenProdu=isPermiso;		
		//this.isPermisoDuplicarEstadoOrdenProdu=isPermiso;
		//this.isPermisoOrdenEstadoOrdenProdu=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoOrdenProduClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(PedidoProduConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoOrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosPedidoProdu=false;
		this.isTienePermisosPedidoProdu=this.verificarGetPermisosUsuarioOpcionEstadoOrdenProduClaseRelacionada(this.opcionsRelacionadas,PedidoProduConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoOrdenProdu(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoOrdenProduClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosPedidoProdu=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoOrdenProduClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoOrdenProduClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoOrdenProduClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosPedidoProdu && this.jInternalFrameDetalleFormEstadoOrdenProdu!=null && this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.remove(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoOrdenProdu() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoOrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoOrdenProduConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoOrdenProdu=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoOrdenProdu=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoOrdenProdu=this.isPermisoActualizarEstadoOrdenProdu;
			this.isPermisoEliminarEstadoOrdenProdu=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoOrdenProdu=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoOrdenProdu=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoOrdenProdu=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoOrdenProdu=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoOrdenProdu=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoOrdenProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoOrdenProdu=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoOrdenProdu=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoOrdenProdu=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoOrdenProdu=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoOrdenProdu=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoOrdenProdu=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoOrdenProdu=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoOrdenProdu.setToolTipText(this.jTableDatosEstadoOrdenProdu.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoOrdenProdu(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoOrdenProdu(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoOrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoOrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoOrdenProdu() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosPedidoProdu && this.estadoordenproduConstantesFunciones.mostrarPedidoProduEstadoOrdenProdu && !EstadoOrdenProduConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido Produccion");
			reporte.setsDescripcion("Pedido Produccion");
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
	
		
	public void inicializarCombosForeignKeyEstadoOrdenProduListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoOrdenProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoOrdenProduJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoOrdenProduListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoOrdenProduListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoOrdenProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoOrdenProdu()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoOrdenProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoOrdenProdu()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoOrdenProdu();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoOrdenProdu()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoOrdenProdu()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoOrdenProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoOrdenProdu()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoOrdenProdu()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoOrdenProdu()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoOrdenProdu(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoOrdenProdu()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoOrdenProduBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoOrdenProduBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoOrdenProduBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean(); 
		this.estadoordenproduConstantesFunciones=new EstadoOrdenProduConstantesFunciones(); 
		this.estadoordenproduBean=new EstadoOrdenProdu();//(this.estadoordenproduConstantesFunciones); 		
		this.estadoordenproduReturnGeneral=new EstadoOrdenProduParameterReturnGeneral(); 
		
		this.estadoordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadoordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoOrdenProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoOrdenProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoOrdenProduBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoOrdenProdu(true);
			
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
			
			this.estadoordenproduConstantesFunciones=new EstadoOrdenProduConstantesFunciones(); 
			this.estadoordenproduBean=new EstadoOrdenProdu();//this.estadoordenproduConstantesFunciones); 			
			this.estadoordenproduReturnGeneral=new EstadoOrdenProduParameterReturnGeneral(); 
		
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Orden Produccion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadoordenprodu=new EstadoOrdenProdu();
			this.estadoordenprodus = new ArrayList<EstadoOrdenProdu>();
			this.estadoordenprodusAux = new ArrayList<EstadoOrdenProdu>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic=new EstadoOrdenProduLogic();
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estadoordenproduSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadoordenproduSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoOrdenProdu);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoOrdenProdu);	
					}
					
					if(this.jInternalFrameImportacionEstadoOrdenProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoOrdenProdu);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoOrdenProdu!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoOrdenProdu);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoOrdenProdu);
				this.jInternalFrameDetalleFormEstadoOrdenProdu.setVisible(false);
				this.jInternalFrameDetalleFormEstadoOrdenProdu.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoOrdenProdu);
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoOrdenProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoOrdenProdu);
					this.jInternalFrameImportacionEstadoOrdenProdu.setVisible(false);
					this.jInternalFrameImportacionEstadoOrdenProdu.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoOrdenProdu!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoOrdenProdu);
					this.jInternalFrameOrderByEstadoOrdenProdu.setVisible(false);
					this.jInternalFrameOrderByEstadoOrdenProdu.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoOrdenProduActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoOrdenProduConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadoordenproduReturnGeneral=new EstadoOrdenProduParameterReturnGeneral();
			
			this.estadoordenproduParameterGeneral=new EstadoOrdenProduParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadoordenproduLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoOrdenProduJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(PedidoProduConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoOrdenProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoordenproduSessionBean.getEsGuardarRelacionado(),this.estadoordenproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoOrdenProduConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadoordenproduSessionBean.getEsGuardarRelacionado(),this.estadoordenproduSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaDuplicarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaCopiarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaVerFormEstadoOrdenProdu=true;
			this.isVisibilidadCeldaOrdenEstadoOrdenProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoOrdenProdu();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoOrdenProdu(false);
			
			this.setPermisosUsuarioEstadoOrdenProdu();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado() 
				|| (this.estadoordenproduSessionBean.getEsGuardarRelacionado() && this.estadoordenproduSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoOrdenProduClasesRelacionadas();
			}
			
			if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoOrdenProduClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoOrdenProdu();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoOrdenProdu();
			}
			
			if(!this.isPermisoBusquedaEstadoOrdenProdu) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoOrdenProdu,this.isPermisoPaginacionMedioEstadoOrdenProdu,this.isPermisoPaginacionTodoEstadoOrdenProdu);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoOrdenProduConstantesFunciones.getTiposSeleccionarEstadoOrdenProdu());
				
				this.tiposColumnasSelect=EstadoOrdenProduConstantesFunciones.getTiposSeleccionarEstadoOrdenProdu(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoOrdenProdu();				
				//this.tiposRelacionesSelect=EstadoOrdenProduConstantesFunciones.getTiposRelacionesEstadoOrdenProdu(true);
				
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
			//if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoOrdenProdu();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoOrdenProdu(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoOrdenProdu(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenProdu() ;
			
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
			
			
			this.pedidoproduLogic=new PedidoProduLogic(); 
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
				estadoordenproduImplementable= (EstadoOrdenProduImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoOrdenProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadoordenproduImplementableHome= (EstadoOrdenProduImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoOrdenProduConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadoordenprodus= new ArrayList<EstadoOrdenProdu>();
			this.estadoordenprodusEliminados= new ArrayList<EstadoOrdenProdu>();
						
			this.isEsNuevoEstadoOrdenProdu=false;
			this.esParaAccionDesdeFormularioEstadoOrdenProdu=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoOrdenProdu(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoOrdenProdu();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoOrdenProduConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoOrdenProdu(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoOrdenProdu();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoOrdenProdu();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoOrdenProdu(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoOrdenProdu: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoOrdenProdu() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoProduConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoOrdenProdu")) {
				iIndex=this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();	
				
				

				if(sTitle.equals("Pedido Producciones")) {
					if(!PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoOrdenProdu();

						this.cargarParteTabPanelRelacionadaPedidoProdu(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoOrdenProdu();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPedidoProdu(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoOrdenProdu.cargarSessionConBeanSwingJInternalFramePedidoProdu(false,true,iIndex);
		this.jButtonPedidoProduActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedidoProdu();

		//this.jTabbedPaneRelacionesEstadoOrdenProdu.updateUI();
		//this.jTabbedPaneRelacionesEstadoOrdenProdu.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoOrdenProdu.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("PedidoProdu")) {
				int row=this.jTableDatosEstadoOrdenProdu.getSelectedRow();
				jButtonPedidoProduActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Pedido Produccion")) {

					if(this.isTienePermisosPedidoProdu && this.estadoordenproduConstantesFunciones.mostrarPedidoProduEstadoOrdenProdu && !EstadoOrdenProduConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedido Producciones"+"("+PedidoProduConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedido Producciones");

						if(estadoordenproduConstantesFunciones.resaltarPedidoProduEstadoOrdenProdu!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadoordenproduConstantesFunciones.resaltarPedidoProduEstadoOrdenProdu);
						}

						jmenuItem.setEnabled(this.estadoordenproduConstantesFunciones.activarPedidoProduEstadoOrdenProdu);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"PedidoProdu"));

						

						this.jInternalFrameDetalleFormEstadoOrdenProdu.jmenuDetalleEstadoOrdenProdu.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoOrdenProdu(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoOrdenProdu(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoOrdenProdu(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoOrdenProduListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoOrdenProdu();
		
		this.cargarCombosFrameForeignKeyEstadoOrdenProdu();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoOrdenProdu();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoOrdenProdu();
		}
	}
	
	
	
	public void jButtonNuevoEstadoOrdenProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			
			if(jTableDatosEstadoOrdenProdu.getRowCount()>=1) {
				jTableDatosEstadoOrdenProdu.removeRowSelectionInterval(0, jTableDatosEstadoOrdenProdu.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoOrdenProdu=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoOrdenProdu(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoOrdenProdu(true);			
			//this.estadoordenprodu=new EstadoOrdenProdu();
			//this.estadoordenprodu.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu() ;
			
			if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoOrdenProdu(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadoordenprodu);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);				
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoOrdenProdu: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoOrdenProduActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoOrdenProdu.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoOrdenProdu.getSelectedRows().length;			
			}
			
			estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoOrdenProdu--;			
				//EstadoOrdenProdu estadoordenproduAux= new EstadoOrdenProdu();			
				//estadoordenproduAux.setId(this.iIdNuevoEstadoOrdenProdu);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoOrdenProdu estadoordenproduOrigen=new EstadoOrdenProdu();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoOrdenProdu estadoordenproduOrigen : estadoordenprodusSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadoordenproduOrigen =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadoordenproduOrigen =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoOrdenProdu();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadoordenprodu.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoOrdenProdu(estadoordenproduOrigen,this.estadoordenprodu,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoordenproduLogic.getEstadoOrdenProdus().add(this.estadoordenproduAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoordenprodus.add(this.estadoordenproduAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
				
				this.jTableDatosEstadoOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenProdu(), this.getIndiceNuevoEstadoOrdenProdu());
				
				int iLastRow =  this.jTableDatosEstadoOrdenProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoOrdenProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoOrdenProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();									
		
			EstadoOrdenProdu estadoordenproduOrigen=new EstadoOrdenProdu();
			EstadoOrdenProdu estadoordenproduDestino=new EstadoOrdenProdu();
				
			estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoOrdenProdu.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadoordenprodusSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoOrdenProdu.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordenproduOrigen =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoordenproduOrigen =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadoordenproduDestino =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadoordenproduDestino =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadoordenproduOrigen =estadoordenprodusSeleccionados.get(0);
				estadoordenproduDestino =estadoordenprodusSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoOrdenProdu(estadoordenproduOrigen,estadoordenproduDestino,true,false);
				
				estadoordenproduDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadoordenproduDestino,estadoordenproduLogic.getEstadoOrdenProdus());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadoordenproduDestino,estadoordenprodus);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
				
				//this.jTableDatosEstadoOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenProdu(), this.getIndiceNuevoEstadoOrdenProdu());
				
				int iLastRow =  this.jTableDatosEstadoOrdenProdu.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoOrdenProdu.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoOrdenProdu.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoOrdenProdu.isVisible();
			
			
			this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(!isVisible);
			this.jPanelPaginacionEstadoOrdenProdu.setVisible(!isVisible);
			this.jPanelAccionesEstadoOrdenProdu.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoOrdenProdu();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoOrdenProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoOrdenProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoOrdenProdu();
			
			this.abrirFrameOrderByEstadoOrdenProdu();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoOrdenProdu();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoOrdenProdu(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoOrdenProdu);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoOrdenProdu.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoOrdenProdu.setSize(this.jInternalFrameDetalleFormEstadoOrdenProdu.iWidthFormulario,this.jInternalFrameDetalleFormEstadoOrdenProdu.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoOrdenProdu.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoOrdenProdu.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoOrdenProdu.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoOrdenProdu.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoOrdenProdu.jContentPaneDetalleEstadoOrdenProdu.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoOrdenProdu.jContentPaneDetalleEstadoOrdenProdu.getWidth(),EstadoOrdenProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoOrdenProdu.jContentPaneDetalleEstadoOrdenProdu.getWidth(),EstadoOrdenProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoOrdenProdu.jContentPaneDetalleEstadoOrdenProdu.getWidth(),EstadoOrdenProduConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedidoProdu();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoOrdenProdu.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoOrdenProdu.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoOrdenProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoOrdenProdu==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenProdu,false,this);
				} else {
					this.jInternalFrameOrderByEstadoOrdenProdu=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoOrdenProdu,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoOrdenProdu);
				this.jInternalFrameOrderByEstadoOrdenProdu.setVisible(false);
				this.jInternalFrameOrderByEstadoOrdenProdu.setSelected(false);
				
				this.jInternalFrameOrderByEstadoOrdenProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoOrdenProdu"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoOrdenProdu();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoOrdenProdu() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoOrdenProdu==null) {
				
				this.jInternalFrameImportacionEstadoOrdenProdu=new ImportacionJInternalFrame(EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoOrdenProdu);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoOrdenProdu);
				this.jInternalFrameImportacionEstadoOrdenProdu.setVisible(false);
				this.jInternalFrameImportacionEstadoOrdenProdu.setSelected(false);


				this.jInternalFrameImportacionEstadoOrdenProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoOrdenProdu"));
				this.jInternalFrameImportacionEstadoOrdenProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoOrdenProdu"));
				this.jInternalFrameImportacionEstadoOrdenProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoOrdenProdu"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoOrdenProdu() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu==null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu=new ReporteDinamicoJInternalFrame(EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoOrdenProdu);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoOrdenProdu);
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoOrdenProdu"));
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoOrdenProdu"));
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoOrdenProdu"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoOrdenProdu();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPedidoProdu() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoOrdenProdu.jContentPaneDetalleEstadoOrdenProdu.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoOrdenProdu() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoOrdenProdu);
			
	       	this.jInternalFrameDetalleFormEstadoOrdenProdu.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoOrdenProdu.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoOrdenProdu.dispose();
			//this.jInternalFrameDetalleFormEstadoOrdenProdu=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoOrdenProdu() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoOrdenProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoOrdenProdu.setVisible(true);
	        this.jInternalFrameImportacionEstadoOrdenProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoOrdenProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoOrdenProdu.setVisible(true);
	        this.jInternalFrameOrderByEstadoOrdenProdu.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoOrdenProdu() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoOrdenProdu.setVisible(false);
	        this.jInternalFrameOrderByEstadoOrdenProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoOrdenProdu() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoOrdenProdu() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoOrdenProdu.setVisible(false);
	        this.jInternalFrameImportacionEstadoOrdenProdu.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoOrdenProdu(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoOrdenProdu(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoOrdenProdu(true);
			//this.isEsNuevoEstadoOrdenProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false) ;
			
			if(estadoordenproduSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getEsGuardarRelacionado() && PedidoProduJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoProduActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoOrdenProdu(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoOrdenProduActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoOrdenProdu(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoOrdenProdu(true);
			//this.isEsNuevoEstadoOrdenProdu=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadoordenprodu.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false) ;
			
			if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoOrdenProdu(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoOrdenProdu(false);
			
			//if(!this.isEsNuevoEstadoOrdenProdu) {								
				int intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
				
			}
			
			if(this.permiteMantenimiento(this.estadoordenprodu)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoOrdenProdu=true;
					this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
					this.isEsNuevoEstadoOrdenProdu=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoOrdenProdu=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoOrdenProdu=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(false);
				
				this.habilitarDeshabilitarControlesEstadoOrdenProdu(false);
			
												
				
				if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoOrdenProdu();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoOrdenProduActionPerformed(evt,estadoordenproduSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoOrdenProdu(this.estadoordenprodu,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoOrdenProdu.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadoordenproduSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadoordenprodu.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				this.estadoordenprodu.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				this.estadoordenprodu.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadoordenprodu)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoOrdenProduModel) this.jTableDatosEstadoOrdenProdu.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoOrdenProdu=true;
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
				this.isEsNuevoEstadoOrdenProdu=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(false);
				
				this.habilitarDeshabilitarControlesEstadoOrdenProdu(false);
				
				
				
				if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoOrdenProdu();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoOrdenProdu.getRowCount()>=1) {
				jTableDatosEstadoOrdenProdu.removeRowSelectionInterval(0, jTableDatosEstadoOrdenProdu.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoOrdenProdu(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(false) ;
			
			this.isEsNuevoEstadoOrdenProdu=false;
			
			if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoOrdenProdu();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoOrdenProdu(false);
				
				//SI ES MANUAL
				if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoOrdenProdu();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoOrdenProdu--;			
			//EstadoOrdenProdu estadoordenproduAux= new EstadoOrdenProdu();			
			//estadoordenproduAux.setId(this.iIdNuevoEstadoOrdenProdu);
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoOrdenProdu();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
			
			this.estadoordenprodu.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadoordenproduLogic.getEstadoOrdenProdus().add(this.estadoordenproduAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadoordenprodus.add(this.estadoordenproduAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			
			this.jTableDatosEstadoOrdenProdu.setRowSelectionInterval(this.getIndiceNuevoEstadoOrdenProdu(), this.getIndiceNuevoEstadoOrdenProdu());
			
			int iLastRow =  this.jTableDatosEstadoOrdenProdu.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoOrdenProdu.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoOrdenProdu.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoOrdenProdu(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
			
			//SI ES MANUAL
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoOrdenProdu();
			}
			
			//this.abrirFrameTreeEstadoOrdenProdu();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Orden ProduccionS ?", "MANTENIMIENTO DE Estado Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoOrdenProdu.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoOrdenProdu();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadoordenproduReturnGeneral=estadoordenproduLogic.procesarImportacionEstadoOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadoordenproduParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoOrdenProduReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoOrdenProdu.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoOrdenProdu.setFileImportacion(this.jInternalFrameImportacionEstadoOrdenProdu.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoOrdenProdu.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoOrdenProdu.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoOrdenProdu.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoOrdenProdu.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		

		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoOrdenProduBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoOrdenProduBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoOrdenProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoOrdenProdu estadoordenprodu:estadoordenprodusSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadoordenprodu.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoOrdenProdu(row);				
			//	iRow++;
			//}				
			
			//for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoOrdenProdu(estadoordenproduAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
			
			//SI ES MANUAL
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoOrdenProdu();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
			
			//SI ES MANUAL
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoOrdenProdu();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoOrdenProduActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
			
			//SI ES MANUAL
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoOrdenProdu();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadoordenproduLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoOrdenProdu() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoOrdenProdu.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoOrdenProdu.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoOrdenProdu.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoOrdenProdu.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoOrdenProdu.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoOrdenProdu.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoOrdenProdu.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoOrdenProdu(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoOrdenProdu(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoOrdenProdu(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoOrdenProdu(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoOrdenProdu(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoOrdenProdu(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenProdu(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoOrdenProdu(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoOrdenProdu() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoOrdenProdu();
		
		this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoOrdenProdu();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenProdu() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoOrdenProdu(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoOrdenProdu(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoOrdenProdu.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoOrdenProdu.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoOrdenProdu.jCheckBoxPostAccionNuevoEstadoOrdenProdu.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoOrdenProdu.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoOrdenProdu.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoOrdenProdu.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoOrdenProdu.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
				this.jInternalFrameDetalleFormEstadoOrdenProdu.jCheckBoxPostAccionNuevoEstadoOrdenProdu.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoOrdenProdu.jCheckBoxPostAccionSinCerrarEstadoOrdenProdu.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoOrdenProdu.jCheckBoxPostAccionSinMensajeEstadoOrdenProdu.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoOrdenProdu.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoOrdenProdu.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoOrdenProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoOrdenProdu.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoOrdenProdu.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoOrdenProdu.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoOrdenProdu.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoOrdenProdu(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoOrdenProdu(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoOrdenProdu() throws Exception {
		try	{
			if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoOrdenProdu();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoOrdenProdu() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoOrdenProdu() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoOrdenProdu.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoOrdenProdu.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoOrdenProdu.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoOrdenProdu.addItem(reporte);
			}
			
			
			if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoOrdenProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoOrdenProdu.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoOrdenProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoOrdenProdu.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoOrdenProdu.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoOrdenProdu.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoOrdenProdu.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoOrdenProdu();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoOrdenProdu() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoOrdenProdu()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoOrdenProdu(Boolean esInicializar) throws Exception {				
		if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoOrdenProdu();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoOrdenProdu() throws Exception {
		this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoOrdenProdu() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoOrdenProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoOrdenProduPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoOrdenProduOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenProduOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoOrdenProduPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoOrdenProduPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoOrdenProdu(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadoordenproduLogic.getEstadoOrdenProdus().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadoordenprodus.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoOrdenProdu.setModel(new EstadoOrdenProduModel(this.estadoordenproduLogic.getEstadoOrdenProdus(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoOrdenProdu.setModel(new EstadoOrdenProduModel(this.estadoordenprodus,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoOrdenProdu!=null && this.jInternalFrameOrderByEstadoOrdenProdu.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoOrdenProdu();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenProdu,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoOrdenProduPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO,estadoordenproduConstantesFunciones.resaltarSeleccionarEstadoOrdenProdu,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoOrdenProduConstantesFunciones.SCLASSWEBTITULO,estadoordenproduConstantesFunciones.resaltarSeleccionarEstadoOrdenProdu,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenProdu,EstadoOrdenProduConstantesFunciones.LABEL_ID));

		if(this.estadoordenproduConstantesFunciones.mostraridEstadoOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoOrdenProduConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadoordenproduConstantesFunciones.resaltaridEstadoOrdenProdu,this.estadoordenproduConstantesFunciones.activaridEstadoOrdenProdu,this,true,"idEstadoOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoordenproduConstantesFunciones.resaltaridEstadoOrdenProdu,this.estadoordenproduConstantesFunciones.activaridEstadoOrdenProdu,this,true,"idEstadoOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenProdu,EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE));

		if(this.estadoordenproduConstantesFunciones.mostrarnombreEstadoOrdenProdu && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadoordenproduConstantesFunciones.resaltarnombreEstadoOrdenProdu,this.estadoordenproduConstantesFunciones.activarnombreEstadoOrdenProdu,this,true,"nombreEstadoOrdenProdu","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadoordenproduConstantesFunciones.resaltarnombreEstadoOrdenProdu,this.estadoordenproduConstantesFunciones.activarnombreEstadoOrdenProdu,this,true,"nombreEstadoOrdenProdu","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoOrdenProduPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosPedidoProdu && this.estadoordenproduConstantesFunciones.mostrarPedidoProduEstadoOrdenProdu && !EstadoOrdenProduConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedido Producciones");
				tableColumn.setHeaderValue("Pedido Producciones");
				tableColumn.setCellRenderer(new PedidoProduTableCell(estadoordenproduConstantesFunciones.resaltarPedidoProduEstadoOrdenProdu,this,this.estadoordenproduConstantesFunciones.activarPedidoProduEstadoOrdenProdu));
				tableColumn.setCellEditor(new PedidoProduTableCell(estadoordenproduConstantesFunciones.resaltarPedidoProduEstadoOrdenProdu,this,this.estadoordenproduConstantesFunciones.activarPedidoProduEstadoOrdenProdu));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoOrdenProdu.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoordenproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoordenproduSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoOrdenProdu.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadoordenproduSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadoordenproduSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoOrdenProdu.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadoordenproduSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadoordenproduSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoOrdenProdu.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoOrdenProdu.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoOrdenProdu.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoordenproduSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoOrdenProdu.moveColumn(this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoOrdenProdu.moveColumn(this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadoordenproduSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoOrdenProdu.moveColumn(this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoOrdenProdu.moveColumn(this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoOrdenProdu.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoOrdenProdu.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoOrdenProdu,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoOrdenProdu.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoOrdenProdu.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoOrdenProdu.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadoordenproduLogic.getEstadoOrdenProdus().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadoordenprodus.size()-1;
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
		//this.jTableDatosEstadoOrdenProdu.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoOrdenProdu.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoOrdenProdu();
			
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
				
				//this.isEsNuevoEstadoOrdenProdu=false;
					
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
				if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoOrdenProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoOrdenProdu.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadoordenprodu.getsType().equals("DUPLICADO")
				   || this.estadoordenprodu.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoOrdenProdu=true;
				
				} else {
					this.isEsNuevoEstadoOrdenProdu=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
					if(this.estadoordenprodu.getId()>=0 && !this.estadoordenprodu.getIsNew()) {						
						this.isEsNuevoEstadoOrdenProdu=false;
						
					} else {
						this.isEsNuevoEstadoOrdenProdu=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoOrdenProdu(esRelaciones);						
				
				this.seleccionarEstadoOrdenProdu(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadoordenprodu.getId()<0) {
					this.isEsNuevoEstadoOrdenProdu=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoOrdenProdu(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoOrdenProdu(evt,rowIndex);
				}	
				
				if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoOrdenProdu: " + this.dDif); 
					}
				}								
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoOrdenProdu(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadoordenprodu)) {
					if(this.estadoordenprodu.getId()>0) {
						this.estadoordenprodu.setIsDeleted(true);
						
						this.estadoordenprodusEliminados.add(this.estadoordenprodu);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadoordenproduLogic.getEstadoOrdenProdus().remove(this.estadoordenprodu);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadoordenprodus.remove(this.estadoordenprodu);				
					}
					
					
					((EstadoOrdenProduModel) this.jTableDatosEstadoOrdenProdu.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoOrdenProdu(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoOrdenProdu) {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoOrdenProdu.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoOrdenProdu.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenprodu);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoOrdenProdu("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoOrdenProdu(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoOrdenProdu(estadoordenprodu,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoOrdenProdu(estadoordenprodu);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoOrdenProdu(estadoordenprodu,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenProdu(estadoordenprodu);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setText(estadoordenprodu.getId().toString());
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setText(estadoordenprodu.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoOrdenProdu estadoordenproduLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadoordenproduLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoOrdenProdu estadoordenproduLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadoordenproduLocal=this.estadoordenprodu;
			} else {
				estadoordenproduLocal=this.estadoordenproduAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadoordenproduLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoOrdenProdu(estadoordenproduLocal,true);
					
					if(estadoordenproduSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadoordenproduLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadoordenproduLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(estadoordenprodu,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(estadoordenprodu);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(estadoordenprodu,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.getText()==null || this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.getText()=="" || this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setText("0");
			}

			if(conColumnasBase) {estadoordenprodu.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoOrdenProduConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenProdu.jLabelIdEstadoOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadoordenprodu.setnombre(this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoOrdenProdu.jLabelnombreEstadoOrdenProdu,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoOrdenProdu(EstadoOrdenProdu estadoordenproduBean,EstadoOrdenProdu estadoordenprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoOrdenProdu(EstadoOrdenProdu estadoordenproduOrigen,EstadoOrdenProdu estadoordenprodu,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoordenproduOrigen.getId()!=null && !estadoordenproduOrigen.getId().equals(0L))) {estadoordenprodu.setId(estadoordenproduOrigen.getId());}}
			if(conDefault || (!conDefault && estadoordenproduOrigen.getnombre()!=null && !estadoordenproduOrigen.getnombre().equals(""))) {estadoordenprodu.setnombre(estadoordenproduOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setText(estadoordenprodu.getId().toString());
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setText(estadoordenprodu.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoOrdenProdu(EstadoOrdenProduBean estadoordenproduBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setText(estadoordenproduBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setText(estadoordenproduBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoOrdenProdu(EstadoOrdenProduParameterReturnGeneral estadoordenproduReturnGeneral,EstadoOrdenProduBean estadoordenproduBean,Boolean conDefault) throws Exception { 
		try {
			EstadoOrdenProdu estadoordenproduLocal=new EstadoOrdenProdu();
			
			estadoordenproduLocal=estadoordenproduReturnGeneral.getEstadoOrdenProdu();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadoordenproduLocal.getId()!=null && !estadoordenproduLocal.getId().equals(0L))) {estadoordenproduBean.setId(estadoordenproduLocal.getId());}}
			if(conDefault || (!conDefault && estadoordenproduLocal.getnombre()!=null && !estadoordenproduLocal.getnombre().equals(""))) {estadoordenproduBean.setnombre(estadoordenproduLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoOrdenProduGenerico(Long idEstadoOrdenProduSeleccionado,JComboBox jComboBoxEstadoOrdenProdu,List<EstadoOrdenProdu> estadoordenprodusLocal)throws Exception {
		try {
			EstadoOrdenProdu  estadoordenproduTemp=null;

			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusLocal) {
				if(estadoordenproduAux.getId()!=null && estadoordenproduAux.getId().equals(idEstadoOrdenProduSeleccionado)) {
					estadoordenproduTemp=estadoordenproduAux;
					break;
				}
			}

			jComboBoxEstadoOrdenProdu.setSelectedItem(estadoordenproduTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoOrdenProduGenerico(JComboBox jComboBoxEstadoOrdenProdu,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoOrdenProdu.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoOrdenProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoOrdenProdu.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoOrdenProdu.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoOrdenProdu.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoOrdenProdu.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("PedidoProdu")) {
			jButtonPedidoProduActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoordenprodu=(EstadoOrdenProdu) estadoordenproduLogic.getEstadoOrdenProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoordenprodu =(EstadoOrdenProdu) estadoordenprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoOrdenProdu estadoordenproduRow=new EstadoOrdenProdu();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoordenproduRow=(EstadoOrdenProdu) estadoordenproduLogic.getEstadoOrdenProdus().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadoordenproduRow=(EstadoOrdenProdu) estadoordenprodus.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonPedidoProduActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoOrdenProdu estadoordenprodu) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordenprodu = (EstadoOrdenProdu)this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadoordenprodu = (EstadoOrdenProdu)this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadoordenprodu!=null) {
						this.estadoordenprodu = estadoordenprodu;
					} else {
						this.estadoordenprodu = new EstadoOrdenProdu();
					}
				}

				if(this.isTienePermisosPedidoProdu && this.permiteMantenimiento(this.estadoordenprodu)) {
					PedidoProduBeanSwingJInternalFrame pedidoproduBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup=new PedidoProduBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup;
					} else {
						pedidoproduBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame;
					}

					List<EstadoOrdenProdu> estadoordenprodus=new ArrayList<EstadoOrdenProdu>();
					estadoordenprodus.add(this.estadoordenprodu);
					if(!esRelacionado) {
						//pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setConGuardarRelaciones(false);
						//pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoproduBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoOrdenProdu.cargarPedidoProduBeanSwingJInternalFrame(estadoordenprodus,this.estadoordenprodu,pedidoproduBeanSwingJInternalFrame,/*conInicializar,*/pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getConGuardarRelaciones(),pedidoproduBeanSwingJInternalFrame.pedidoproduSessionBean.getEsGuardarRelacionado());
					pedidoproduBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoproduBeanSwingJInternalFrame.actualizarEstadoPanelsPedidoProdu("no_relacionado");

						pedidoproduBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoProduConstantesFunciones.ITAMANIOFILATABLA + (PedidoProduConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoproduBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoOrdenProdu=(TitledBorder)this.jScrollPanelDatosEstadoOrdenProdu.getBorder();
						TitledBorder titledBorderPedidoProdu=(TitledBorder)pedidoproduBeanSwingJInternalFrame.jScrollPanelDatosPedidoProdu.getBorder();

						titledBorderPedidoProdu.setTitle(titledBorderEstadoOrdenProdu.getTitle() + " -> Pedido Produccion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoproduBeanSwingJInternalFrame);
						}

						pedidoproduBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoproduBeanSwingJInternalFrame);

						pedidoproduBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido Produccion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoOrdenProdu(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu));			
			this.jButtonDuplicarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaDuplicarEstadoOrdenProdu && this.isPermisoDuplicarEstadoOrdenProdu));			
			this.jButtonCopiarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaCopiarEstadoOrdenProdu && this.isPermisoCopiarEstadoOrdenProdu));
			this.jButtonVerFormEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaVerFormEstadoOrdenProdu && this.isPermisoVerFormEstadoOrdenProdu));
			
			this.jButtonAbrirOrderByEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenProdu && this.isPermisoOrdenEstadoOrdenProdu));			
			
			this.jButtonNuevoRelacionesEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu));			
			this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaModificarEstadoOrdenProdu && this.isPermisoActualizarEstadoOrdenProdu));	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaActualizarEstadoOrdenProdu && this.isPermisoActualizarEstadoOrdenProdu));	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaEliminarEstadoOrdenProdu && this.isPermisoEliminarEstadoOrdenProdu));
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarEstadoOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenProdu);							
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu));						
			this.jButtonDuplicarToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaDuplicarEstadoOrdenProdu && this.isPermisoDuplicarEstadoOrdenProdu));						
			this.jButtonCopiarToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaCopiarEstadoOrdenProdu && this.isPermisoCopiarEstadoOrdenProdu));			
			this.jButtonVerFormToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaVerFormEstadoOrdenProdu && this.isPermisoVerFormEstadoOrdenProdu));			
			this.jButtonAbrirOrderByToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenProdu && this.isPermisoOrdenEstadoOrdenProdu));
			this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));			
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaModificarEstadoOrdenProdu && this.isPermisoActualizarEstadoOrdenProdu));	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaActualizarEstadoOrdenProdu  && this.isPermisoActualizarEstadoOrdenProdu));	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaEliminarEstadoOrdenProdu && this.isPermisoEliminarEstadoOrdenProdu));
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarToolBarEstadoOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenProdu);				
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu));			
			this.jMenuItemDuplicarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaDuplicarEstadoOrdenProdu && this.isPermisoDuplicarEstadoOrdenProdu));			
			this.jMenuItemCopiarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaCopiarEstadoOrdenProdu && this.isPermisoCopiarEstadoOrdenProdu));			
			this.jMenuItemVerFormEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaVerFormEstadoOrdenProdu && this.isPermisoVerFormEstadoOrdenProdu));			
			this.jMenuItemAbrirOrderByEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenProdu && this.isPermisoOrdenEstadoOrdenProdu));			
			//this.jMenuItemMostrarOcultarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenProdu && this.isPermisoOrdenEstadoOrdenProdu));
			this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenProdu && this.isPermisoOrdenEstadoOrdenProdu));			
			//this.jMenuItemDetalleMostrarOcultarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaOrdenEstadoOrdenProdu && this.isPermisoOrdenEstadoOrdenProdu));			
			this.jMenuItemNuevoRelacionesEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu));			
			this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaNuevoEstadoOrdenProdu && this.isPermisoNuevoEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));									
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemModificarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaModificarEstadoOrdenProdu && this.isPermisoActualizarEstadoOrdenProdu));	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemActualizarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaActualizarEstadoOrdenProdu && this.isPermisoActualizarEstadoOrdenProdu));	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemEliminarEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaEliminarEstadoOrdenProdu && this.isPermisoEliminarEstadoOrdenProdu));
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemCancelarEstadoOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenProdu);				
			}
			
			this.jMenuItemGuardarCambiosEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));						
			this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=this.jButtonNuevoEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoOrdenProdu=this.jButtonDuplicarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaCopiarEstadoOrdenProdu=this.jButtonCopiarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaVerFormEstadoOrdenProdu=this.jButtonVerFormEstadoOrdenProdu.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoOrdenProdu=this.jButtonAbrirOrderByEstadoOrdenProdu.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=this.jButtonNuevoRelacionesEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=this.jButtonModificarEstadoOrdenProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaGuardarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=this.jButtonGuardarCambiosTablaEstadoOrdenProdu.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=this.jButtonNuevoToolBarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarToolBarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarToolBarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarToolBarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarToolBarEstadoOrdenProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoOrdenProdu=this.jButtonGuardarCambiosToolBarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=this.jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=this.jMenuItemNuevoEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=this.jMenuItemNuevoRelacionesEstadoOrdenProdu.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemModificarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemActualizarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemEliminarEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemCancelarEstadoOrdenProdu.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoOrdenProdu=this.jMenuItemGuardarCambiosEstadoOrdenProdu.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoOrdenProdu(Boolean esInicializar) {
		if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
				//if(this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoOrdenProdu();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoOrdenProdu(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoOrdenProdu() {
		this.jButtonNuevoEstadoOrdenProdu.setVisible(this.isPermisoNuevoEstadoOrdenProdu);			
		this.jButtonDuplicarEstadoOrdenProdu.setVisible(this.isPermisoDuplicarEstadoOrdenProdu);			
		this.jButtonCopiarEstadoOrdenProdu.setVisible(this.isPermisoCopiarEstadoOrdenProdu);			
		this.jButtonVerFormEstadoOrdenProdu.setVisible(this.isPermisoVerFormEstadoOrdenProdu);			
		
		this.jButtonAbrirOrderByEstadoOrdenProdu.setVisible(this.isPermisoOrdenEstadoOrdenProdu);					
		
		this.jButtonNuevoRelacionesEstadoOrdenProdu.setVisible(this.isPermisoNuevoEstadoOrdenProdu);			
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarEstadoOrdenProdu.setVisible(this.isPermisoActualizarEstadoOrdenProdu);	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarEstadoOrdenProdu.setVisible(this.isPermisoActualizarEstadoOrdenProdu);	
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarEstadoOrdenProdu.setVisible(this.isPermisoEliminarEstadoOrdenProdu);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarEstadoOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenProdu);						
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.setVisible(this.isPermisoGuardarCambiosEstadoOrdenProdu);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.setVisible(this.isPermisoActualizarEstadoOrdenProdu);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoOrdenProdu() {
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarEstadoOrdenProdu.setVisible(this.isPermisoActualizarEstadoOrdenProdu);	
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarEstadoOrdenProdu.setVisible(this.isPermisoActualizarEstadoOrdenProdu);	
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarEstadoOrdenProdu.setVisible(this.isPermisoEliminarEstadoOrdenProdu);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarEstadoOrdenProdu.setVisible(this.isVisibilidadCeldaCancelarEstadoOrdenProdu);							
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.setVisible((this.isVisibilidadCeldaGuardarEstadoOrdenProdu && this.isPermisoGuardarCambiosEstadoOrdenProdu));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoOrdenProdu() {
		if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoOrdenProdu();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoOrdenProdu() {
	}
	
	public void jTableDatosEstadoOrdenProduListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoOrdenProdu(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.getestadoordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoordenprodu==null) {
						this.estadoordenprodu = new EstadoOrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
				}

				if(this.estadoordenprodu.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadoordenprodu.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoOrdenProduBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.getestadoordenprodu(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadoordenprodu==null) {
						this.estadoordenprodu = new EstadoOrdenProdu();
					}

					this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);
				}

				if(this.estadoordenprodu.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadoordenprodu.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoOrdenProdu(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoOrdenProdu() {
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.dispose();
			this.jInternalFrameDetalleFormEstadoOrdenProdu=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
			this.jInternalFrameReporteDinamicoEstadoOrdenProdu.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoOrdenProdu.dispose();
			this.jInternalFrameReporteDinamicoEstadoOrdenProdu=null;
		}
		
		if(this.jInternalFrameImportacionEstadoOrdenProdu!=null) {
			this.jInternalFrameImportacionEstadoOrdenProdu.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoOrdenProdu.dispose();
			this.jInternalFrameImportacionEstadoOrdenProdu=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoOrdenProdu();
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoOrdenProdu")) {
				jButtonDuplicarEstadoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoOrdenProdu")) {
				jButtonCopiarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoOrdenProdu")) {
				jButtonVerFormEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoOrdenProdu")) {
				jButtonDuplicarEstadoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoOrdenProdu")) {
				jButtonDuplicarEstadoOrdenProduActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoOrdenProdu")) {
				jButtonModificarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoOrdenProdu")) {
				jButtonModificarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoOrdenProdu")) {
				jButtonModificarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoOrdenProdu")) {
				jButtonActualizarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoOrdenProdu")) {
				jButtonActualizarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoOrdenProdu")) {
				jButtonActualizarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoOrdenProdu")) {
				jButtonEliminarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoOrdenProdu")) {
				jButtonEliminarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoOrdenProdu")) {
				jButtonEliminarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoOrdenProdu")) {
				jButtonCancelarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoOrdenProdu")) {
				jButtonCancelarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoOrdenProdu")) {
				jButtonCancelarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoOrdenProdu")) {
				jButtonCerrarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoOrdenProdu")) {
				jButtonCerrarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoOrdenProdu")) {
				jButtonCerrarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoOrdenProdu")) {
				jButtonMostrarOcultarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoOrdenProdu")) {
				jButtonCancelarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoOrdenProdu")) {
				jButtonCopiarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoOrdenProdu")) {
				jButtonVerFormEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoOrdenProdu")) {
				jButtonCopiarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoOrdenProdu")) {
				jButtonVerFormEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoOrdenProdu")) {
				jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoOrdenProdu")) {
				jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoOrdenProdu")) {
				jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoOrdenProdu")) {
				jButtonAnterioresEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoOrdenProdu")) {
				jButtonAnterioresEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoOrdenProdu")) {
				jButtonAnterioresEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoOrdenProdu")) {
				jButtonSiguientesEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoOrdenProdu")) {
				jButtonSiguientesEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoOrdenProdu")) {
				jButtonSiguientesEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoOrdenProdu") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoOrdenProdu")) {
				jButtonAbrirOrderByEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoOrdenProdu") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoOrdenProdu")) {
				jButtonMostrarOcultarEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoOrdenProdu")) {
				jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoOrdenProdu")) {
				jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoOrdenProdu")) {
				jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoOrdenProdu")) {
				jButtonCerrarReporteDinamicoEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoOrdenProdu")) {
				jButtonGenerarReporteDinamicoEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoOrdenProdu")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoOrdenProdu")) {
				jButtonCerrarImportacionEstadoOrdenProduActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoOrdenProdu")) {
				
				jButtonGenerarImportacionEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoOrdenProdu")) {
				
				jButtonAbrirImportacionEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoOrdenProdu")) {
				jComboBoxTiposAccionesEstadoOrdenProduActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoOrdenProdu")) {
				jComboBoxTiposRelacionesEstadoOrdenProduActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoOrdenProdu")) {
				jComboBoxTiposAccionesEstadoOrdenProduActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoOrdenProdu")) {
				
				jComboBoxTiposSeleccionarEstadoOrdenProduActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoOrdenProdu")) {
				jTextFieldValorCampoGeneralEstadoOrdenProduActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoOrdenProdu")) {
				jButtonAbrirOrderByEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoOrdenProdu")) {
				jButtonAbrirOrderByEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoOrdenProdu")) {
				jButtonCerrarOrderByEstadoOrdenProduActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoOrdenProduBusqueda")) {
				this.jButtonidEstadoOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoOrdenProduBusqueda")) {
				this.jButtonnombreEstadoOrdenProduBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoOrdenProdu();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoOrdenProdu estadoordenproduLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadoordenproduLocal=this.estadoordenprodu;
			} else {
				estadoordenproduLocal=this.estadoordenproduAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
							
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
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
			
			


			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
								
						
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
								
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
							
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
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
			
			


			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
								
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoOrdenProdu")) {
					jCheckBoxSeleccionarTodosEstadoOrdenProduItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoOrdenProdu")) {
					jCheckBoxSeleccionadosEstadoOrdenProduItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoOrdenProdu")) {
					
				}
				
				


				
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
												
				
				


				
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
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
			
			


			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoOrdenProduActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadoordenprodu);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadoordenprodu);
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
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
				
				


				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoOrdenProdu.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoOrdenProdu.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoOrdenProduActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadoordenproduAnterior =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoOrdenProdu")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoOrdenProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoOrdenProdu.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadoordenprodu =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadoordenprodu);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoOrdenProdu")) {
				
				}
				
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoOrdenProdu")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoOrdenProdu.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoOrdenProdu")) {
			
			}
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoOrdenProdu();
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoOrdenProdu")) {
				jButtonDuplicarEstadoOrdenProduActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoOrdenProdu")) {
				jButtonCopiarEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoOrdenProdu")) {
				jButtonVerFormEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoOrdenProdu")) {
				jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoOrdenProdu")) {
				jButtonModificarEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoOrdenProdu")) {
				jButtonActualizarEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoOrdenProdu")) {
				jButtonEliminarEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoOrdenProdu")) {
				jButtonCancelarEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoOrdenProdu")) {
				jButtonCerrarEstadoOrdenProduActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoOrdenProdu")) {
				jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoOrdenProdu")) {
				jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoOrdenProdu")) {
				jButtonAbrirOrderByEstadoOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoOrdenProdu")) {
				jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoOrdenProdu")) {
				jButtonAnterioresEstadoOrdenProduActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoOrdenProdu")) {
				jButtonSiguientesEstadoOrdenProduActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoOrdenProduBusqueda")) {
				this.jButtonidEstadoOrdenProduBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoOrdenProduBusqueda")) {
				this.jButtonnombreEstadoOrdenProduBusquedaActionPerformed(evt);
			}
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoOrdenProdu();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoOrdenProdu")) {
				closingInternalFrameEstadoOrdenProdu();
				
			} else if(sTipo.equals("jButtonCancelarEstadoOrdenProdu")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoOrdenProdu = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoOrdenProduBeanSwingJInternalFrame jInternalFrameParent=(EstadoOrdenProduBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoOrdenProdu.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoOrdenProduActionPerformed(null);
			}
			
			EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadoordenprodu,new Object(),this.estadoordenproduParameterGeneral,this.estadoordenproduReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoOrdenProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoOrdenProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoOrdenProdu(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadoordenprodu)) {
			if(!esControlTabla) {
				if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);			
				}
				
				if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoordenproduReturnGeneral=estadoordenproduLogic.procesarEventosEstadoOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordenproduLogic.getEstadoOrdenProdus(),this.estadoordenprodu,this.estadoordenproduParameterGeneral,this.isEsNuevoEstadoOrdenProdu,classes);//this.estadoordenproduLogic.getEstadoOrdenProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoOrdenProdu(this.estadoordenproduReturnGeneral,this.estadoordenproduBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoOrdenProdu(classes,this.estadoordenproduReturnGeneral,this.estadoordenproduBean,false);
					}
						
					if(this.estadoordenproduReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu());	
					}
						
					if(this.estadoordenproduReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu(),classes);//this.estadoordenproduBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoOrdenProdu(this.estadoordenprodu,classes);//this.estadoordenproduBean);									
				}
			
				if(EstadoOrdenProduJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoOrdenProdu(this.estadoordenprodu,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoOrdenProdu(this.estadoordenprodu);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadoordenproduAnterior!=null) {
						this.estadoordenprodu=this.estadoordenproduAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadoordenproduReturnGeneral=estadoordenproduLogic.procesarEventosEstadoOrdenProdusWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordenproduLogic.getEstadoOrdenProdus(),this.estadoordenprodu,this.estadoordenproduParameterGeneral,this.isEsNuevoEstadoOrdenProdu,classes);//this.estadoordenproduLogic.getEstadoOrdenProdu()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadoordenproduSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadoordenproduSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu(),estadoordenproduLogic.getEstadoOrdenProdus());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu(),this.estadoordenprodus);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoOrdenProdu.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoOrdenProdu.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoOrdenProdu();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoOrdenProdu() throws Exception {
		
		EstadoOrdenProduModel estadoordenproduModel=(EstadoOrdenProduModel)this.jTableDatosEstadoOrdenProdu.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadoordenproduModel.estadoordenprodus=this.estadoordenproduLogic.getEstadoOrdenProdus();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadoordenproduModel.estadoordenprodus=this.estadoordenprodus;
		}
		
		
		((EstadoOrdenProduModel) this.jTableDatosEstadoOrdenProdu.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoOrdenProdu() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadoordenproduAnterior(),this.estadoordenproduLogic.getEstadoOrdenProdus());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadoordenproduAnterior(),this.estadoordenprodus);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoOrdenProdu();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoProdu.class)) {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(estadoordenprodu.getPedidoProdus());
					this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
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
										
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordenprodu,new Object(),generalEntityParameterGeneral,this.estadoordenproduReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadoordenproduSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoOrdenProduConstantesFunciones.getClassesRelationshipsOfEstadoOrdenProdu(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoOrdenProduConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoOrdenProdu(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoOrdenProdu(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoOrdenProduBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadoordenprodu,new Object(),generalEntityParameterGeneral,this.estadoordenproduReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoOrdenProdu(EstadoOrdenProduBean estadoordenproduBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoProdu.class)) {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.setPedidoProdus(estadoordenprodu.getPedidoProdus());
					this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedidoProdu(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoOrdenProdu(ArrayList<Classe> classes,EstadoOrdenProduReturnGeneral estadoordenproduReturnGeneral,EstadoOrdenProduBean estadoordenproduBean,Boolean conDefault) throws Exception {
		
			this.estadoordenproduBean.setPedidoProdus(estadoordenproduReturnGeneral.getEstadoOrdenProdu().getPedidoProdus());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(PedidoProdu.class)) {
					estadoordenprodu.setPedidoProdus(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduBeanSwingJInternalFrame.pedidoproduLogic.getPedidoProdus());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadoordenprodu)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu = new EstadoOrdenProduDetalleFormJInternalFrame(jDesktopPane,this.estadoordenproduSessionBean.getConGuardarRelaciones(),this.estadoordenproduSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoOrdenProdu);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.setVisible(false);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.estadoordenproduLogic=this.estadoordenproduLogic;
		
		this.cargarCombosFrameForeignKeyEstadoOrdenProdu("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoOrdenProdu();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoOrdenProdu();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoOrdenProdu("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoOrdenProdu();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoOrdenProdu"));
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarEstadoOrdenProdu"));

		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoOrdenProdu"));
					
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemModificarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"ActualizarEstadoOrdenProdu"));
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoOrdenProdu"));
						
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemActualizarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarEstadoOrdenProdu"));
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoOrdenProdu"));
								
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemEliminarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarEstadoOrdenProdu"));
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoOrdenProdu"));
					
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemCancelarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoOrdenProdu"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemDetalleCerrarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoOrdenProdu"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoOrdenProdu"));
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoOrdenProdu"));
		
		
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoOrdenProdu"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonidEstadoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonnombreEstadoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoOrdenProduBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoOrdenProdu"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoOrdenProdu"));
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoOrdenProdu"));
		}
		
		this.jTableDatosEstadoOrdenProdu.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoOrdenProdu"));
		
		this.jTableDatosEstadoOrdenProdu.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoOrdenProdu"));
		
		this.jButtonNuevoEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"NuevoEstadoOrdenProdu"));
		
		this.jButtonDuplicarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"DuplicarEstadoOrdenProdu"));
		
		this.jButtonCopiarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"CopiarEstadoOrdenProdu"));
		
		this.jButtonVerFormEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"VerFormEstadoOrdenProdu"));
		
		
		this.jButtonNuevoToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoOrdenProdu"));
			
		this.jButtonDuplicarToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoOrdenProdu"));
			
		this.jMenuItemNuevoEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoOrdenProdu"));
			
		this.jMenuItemDuplicarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoOrdenProdu"));		
		
		
		this.jButtonNuevoRelacionesEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoOrdenProdu"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoOrdenProdu"));
			
		this.jMenuItemNuevoRelacionesEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoOrdenProdu"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarEstadoOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonModificarToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoOrdenProdu"));
			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemModificarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"ActualizarEstadoOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonActualizarToolBarEstadoOrdenProdu.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoOrdenProdu"));
				
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemActualizarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarEstadoOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonEliminarToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoOrdenProdu"));
						
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemEliminarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarEstadoOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonCancelarToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoOrdenProdu"));
			
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemCancelarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoOrdenProdu"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoOrdenProdu"));		
		
		
		this.jButtonCerrarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CerrarEstadoOrdenProdu"));
		
		
		this.jButtonCerrarToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoOrdenProdu"));
			
		this.jMenuItemCerrarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoOrdenProdu"));
			
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jMenuItemDetalleCerrarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoOrdenProdu"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoOrdenProdu"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoOrdenProdu"));
		}
		
		this.jButtonCopiarToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoOrdenProdu"));
			
		this.jButtonVerFormToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoOrdenProdu"));
		
		this.jMenuItemGuardarCambiosEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoOrdenProdu"));
			
		this.jMenuItemCopiarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoOrdenProdu"));		
		
		this.jMenuItemVerFormEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoOrdenProdu"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoOrdenProdu"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoOrdenProdu"));
			
		this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoOrdenProdu"));		
		
		
		
		this.jButtonRecargarInformacionEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoOrdenProdu"));
					
		this.jButtonRecargarInformacionToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoOrdenProdu"));
		
		this.jMenuItemRecargarInformacionEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoOrdenProdu"));		
		
		
		
		this.jButtonAnterioresEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"AnterioresEstadoOrdenProdu"));
		
		
		this.jButtonAnterioresToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoOrdenProdu"));
		
		this.jMenuItemAnterioresEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoOrdenProdu"));		
		
		
		this.jButtonSiguientesEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"SiguientesEstadoOrdenProdu"));
		
		
		this.jButtonSiguientesToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoOrdenProdu"));
			
		this.jMenuItemSiguientesEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoOrdenProdu"));
			
		this.jMenuItemAbrirOrderByEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoOrdenProdu"));
			
		this.jMenuItemMostrarOcultarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoOrdenProdu"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoOrdenProdu"));
			
		this.jMenuItemDetalleMostarOcultarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoOrdenProdu"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoOrdenProdu"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoOrdenProdu"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoOrdenProdu"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoOrdenProdu"));

		this.jCheckBoxSeleccionadosEstadoOrdenProdu.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoOrdenProdu"));
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoOrdenProdu"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoOrdenProdu"));
			
		this.jComboBoxTiposAccionesEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoOrdenProdu"));
					
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoOrdenProdu"));
			
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoOrdenProdu"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonidEstadoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonnombreEstadoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoOrdenProduBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoOrdenProdu!=null) {
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoOrdenProdu"));
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoOrdenProdu"));
				this.jInternalFrameReporteDinamicoEstadoOrdenProdu.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoOrdenProdu"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoOrdenProdu"));				
			//this.jButtonGenerarReporteDinamicoEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoOrdenProdu"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoOrdenProdu"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoOrdenProdu!=null) {
				this.jInternalFrameImportacionEstadoOrdenProdu.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoOrdenProdu"));
				this.jInternalFrameImportacionEstadoOrdenProdu.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoOrdenProdu"));
				this.jInternalFrameImportacionEstadoOrdenProdu.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoOrdenProdu"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoOrdenProdu"));
			
			this.jButtonAbrirOrderByToolBarEstadoOrdenProdu.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoOrdenProdu"));			
			
			if(this.jInternalFrameOrderByEstadoOrdenProdu!=null) {
				this.jInternalFrameOrderByEstadoOrdenProdu.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoOrdenProdu"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoOrdenProdu.jTabbedPaneRelacionesEstadoOrdenProdu.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoOrdenProdu"));
		
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
            		closingInternalFrameEstadoOrdenProdu();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoOrdenProdu = (JInternalFrameBase)event.getSource();
	            	
	            EstadoOrdenProduBeanSwingJInternalFrame jInternalFrameParent=(EstadoOrdenProduBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoOrdenProdu.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoOrdenProduActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoOrdenProdu.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoOrdenProduListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoOrdenProdu.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoOrdenProdu.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoOrdenProdu";
		inputMap = this.jButtonNuevoEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoOrdenProdu";
		inputMap = this.jButtonNuevoRelacionesEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoOrdenProduActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoOrdenProdu";
		inputMap = this.jButtonModificarEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoOrdenProdu";
		inputMap = this.jButtonActualizarEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoOrdenProdu";
		inputMap = this.jButtonEliminarEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoOrdenProdu";
		inputMap = this.jButtonCancelarEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoOrdenProdu";
		inputMap = this.jButtonCerrarEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoOrdenProdu";
		inputMap = this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonGuardarCambiosEstadoOrdenProdu.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoOrdenProduActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoOrdenProdu.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoOrdenProduItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoOrdenProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoOrdenProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoOrdenProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoOrdenProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoOrdenProdu.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoOrdenProduActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonidEstadoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoOrdenProduBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jButtonnombreEstadoOrdenProduBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoOrdenProduBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoOrdenProdu.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoOrdenProduActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoOrdenProduActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoOrdenProdu.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoOrdenProdu(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
					estadoordenproduAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodus) {
					estadoordenproduAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoOrdenProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoOrdenProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
						estadoordenproduAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodus) {
						estadoordenproduAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodus) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoOrdenProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoOrdenProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoOrdenProduItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoOrdenProdu(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoOrdenProdu.getSelectedRows();
			
			EstadoOrdenProdu estadoordenproduLocal=new EstadoOrdenProdu();
			
			//this.seleccionarTodosEstadoOrdenProdu(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadoordenproduLocal =(EstadoOrdenProdu) this.estadoordenproduLogic.getEstadoOrdenProdus().toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadoordenproduLocal =(EstadoOrdenProdu) this.estadoordenprodus.toArray()[this.jTableDatosEstadoOrdenProdu.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadoordenproduLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
						estadoordenproduAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodus) {
						estadoordenproduAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoOrdenProdu.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoOrdenProdu.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoOrdenProdu,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoOrdenProduItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoOrdenProduParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoOrdenProduActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoOrdenProdu(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoOrdenProdu.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenproduLogic.getEstadoOrdenProdus()) {
				
						if(sTipoSeleccionar.equals(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoordenproduAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodus) {
					
						if(sTipoSeleccionar.equals(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadoordenproduAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoOrdenProduActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoOrdenProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoOrdenProdu=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoOrdenProdu.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoOrdenProdu) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoOrdenProdu(conSplash);
				
					this.generarReporteEstadoOrdenProdusSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoOrdenProdusSeleccionados();
				//this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoOrdenProdusSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoOrdenProdusSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoOrdenProdu();
				
				this.exportarEstadoOrdenProdusSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoOrdenProdus();
				//this.importarEstadoOrdenProdus();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoOrdenProdu();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoOrdenProdusSeleccionados();
				//this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Orden Produccion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoOrdenProdu();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoOrdenProdu)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoOrdenProdu(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoOrdenProdu.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoOrdenProdu.jComboBoxTiposAccionesFormularioEstadoOrdenProdu.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoOrdenProdu();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoOrdenProdu(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoOrdenProduActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoOrdenProdu();
			
			if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
			EstadoOrdenProdu estadoordenprodu=new EstadoOrdenProdu();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoOrdenProdu(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoOrdenProdu.getSelectedItem();
			
			
			
			
			estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadoordenprodusSeleccionados.size()==1) {
				for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusSeleccionados) {
					estadoordenprodu=estadoordenproduAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Pedido Produccion")) {
					jButtonPedidoProduActionPerformed(null,rowIndex,true,false,estadoordenprodu);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoOrdenProdu();
			
      		//this.finishProcessEstadoOrdenProdu(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoOrdenProduReturnGeneral() throws Exception {
		if(this.estadoordenproduReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadoordenproduReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadoordenproduReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadoordenproduReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadoordenproduReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadoordenproduReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
		}
		
		if(this.estadoordenproduReturnGeneral.getConRetornoLista() || this.estadoordenproduReturnGeneral.getConRetornoObjeto()) {
			if(this.estadoordenproduReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoordenproduLogic.setEstadoOrdenProdus(this.estadoordenproduReturnGeneral.getEstadoOrdenProdus());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadoordenproduReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadoordenproduLogic.setEstadoOrdenProdu(this.estadoordenproduReturnGeneral.getEstadoOrdenProdu());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoOrdenProdu(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoOrdenProdu() throws Exception {
		
		
	}
	
	public ArrayList<EstadoOrdenProdu> getEstadoOrdenProdusSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoOrdenProdu) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoOrdenProdu estadoordenproduAux:estadoordenproduLogic.getEstadoOrdenProdus()) {
					if(estadoordenproduAux.getIsSelected()) {
						estadoordenprodusSeleccionados.add(estadoordenproduAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoOrdenProdu estadoordenproduAux:this.estadoordenprodus) {
					if(estadoordenproduAux.getIsSelected()) {
						estadoordenprodusSeleccionados.add(estadoordenproduAux);				
					}
				}
			}
			
			if(estadoordenprodusSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadoordenprodusSeleccionados.addAll(this.estadoordenproduLogic.getEstadoOrdenProdus());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadoordenprodusSeleccionados.addAll(this.estadoordenprodus);				
					}
				}
			}
		} else {
			estadoordenprodusSeleccionados.add(this.estadoordenprodu);
		}
		
		return estadoordenprodusSeleccionados;
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
	
	public void generarReporteEstadoOrdenProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoOrdenProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoOrdenProdusSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoOrdenProdusSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoOrdenProdusSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoOrdenProdusSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Orden Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoOrdenProdusSeleccionados() throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoOrdenProdusSeleccionados() throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoOrdenProdusSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoOrdenProdusSeleccionados() throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoOrdenProdu();
		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoOrdenProdu();
		
		
		//this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados ,estadoordenproduImplementable,estadoordenproduImplementableHome);
	}
	
	public void mostrarImportacionEstadoOrdenProdus() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoOrdenProdu();
		
		this.abrirFrameImportacionEstadoOrdenProdu();		
		
			
		//this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados ,estadoordenproduImplementable,estadoordenproduImplementableHome);
	}
	
	public void importarEstadoOrdenProdus() throws Exception {		
	
	}
	
	public void exportarEstadoOrdenProdusSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoOrdenProdusSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoOrdenProdusSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoOrdenProdusSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Orden Produccion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoOrdenProdusSeleccionados() throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoOrdenProdu(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoOrdenProdu(estadoordenproduAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadoordenproduAux.setsDetalleGeneralEntityReporte(estadoordenproduAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoOrdenProdu(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoOrdenProduConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoOrdenProduConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadoordenprodu.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoordenprodu.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadoordenprodu.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoOrdenProdusSeleccionados() throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoOrdenProdus");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoOrdenProdu(row);				
				iRow++;
			}				
			
			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoOrdenProdu(estadoordenproduAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoOrdenProdusSeleccionados() throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();		
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadoordenprodu.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadoordenprodus");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadoordenprodu");
			//elementRoot.appendChild(element);
		
			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusSeleccionados) {
				element = document.createElement("estadoordenprodu");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoOrdenProdu(estadoordenproduAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Orden Produccion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoOrdenProdu(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenProduConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenProduConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadoordenprodu.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadoordenprodu.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoOrdenProdu(EstadoOrdenProdu estadoordenprodu,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoOrdenProduConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadoordenprodu.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoOrdenProduConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadoordenprodu.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(EstadoOrdenProduConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadoordenprodu.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoOrdenProdusSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados=new ArrayList<EstadoOrdenProdu>();
		
		estadoordenprodusSeleccionados=this.getEstadoOrdenProdusSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoOrdenProdu(estadoordenprodusSeleccionados);
		
		this.generarReporteEstadoOrdenProdus("Todos",estadoordenprodusSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoOrdenProdu(ArrayList<EstadoOrdenProdu> estadoordenprodusSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoOrdenProdu estadoordenproduAux:estadoordenprodusSeleccionados) {
				estadoordenproduAux.setsDetalleGeneralEntityReporte(estadoordenproduAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoOrdenProduConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadoordenproduAux.setsDescripcionGeneralEntityReporte1(estadoordenproduAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoOrdenProduConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoOrdenProdu(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoOrdenProdu=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=true;
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
			this.isVisibilidadCeldaModificarEstadoOrdenProdu=true;
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaCancelarEstadoOrdenProdu=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoOrdenProdu=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoOrdenProduJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=true;
		} else {
			this.actualizarEstadoPanelsEstadoOrdenProdu(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoOrdenProdu=false;
			//this.isVisibilidadCeldaVerFormEstadoOrdenProdu=false;
			this.isVisibilidadCeldaDuplicarEstadoOrdenProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadoordenproduSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadoordenproduSessionBean.getEsGuardarRelacionado()) {
			if(!estadoordenproduSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;												
			}
			
			this.jButtonCerrarEstadoOrdenProdu.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoOrdenProdu=false;
		}
		
		if(!this.permiteMantenimiento(this.estadoordenprodu)) {
			this.isVisibilidadCeldaActualizarEstadoOrdenProdu=false;
			this.isVisibilidadCeldaEliminarEstadoOrdenProdu=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoOrdenProdu() {
		this.isVisibilidadCeldaNuevoEstadoOrdenProdu=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoOrdenProdu=false;
	}
	
	public void actualizarEstadoPanelsEstadoOrdenProdu(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEdicionEstadoOrdenProdu.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoOrdenProdu!=null) {
				this.jScrollPanelDatosEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoOrdenProdu!=null) {
				this.jPanelPaginacionEstadoOrdenProdu.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoOrdenProdu!=null) {
				this.jPanelParametrosReportesEstadoOrdenProdu.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadoordenproduSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoOrdenProduParaPedidoProdues() throws Exception {
		Boolean isPaginaPopupPedidoProdu=false;

		try {

			if(this.estadoordenproduSessionBean==null) {
				this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean=new PedidoProduSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.setsPathNavegacionActual(estadoordenproduSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoProduConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedidoProdu=this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedidoProdu(true);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedidoProdu(EstadoOrdenProduConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.setisBusquedaDesdeForeignKeySesionEstadoOrdenProdu(true);
			this.jInternalFrameDetalleFormEstadoOrdenProdu.pedidoproduSessionBean.setlidEstadoOrdenProduActual(this.idEstadoOrdenProduActual);

			estadoordenproduSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoOrdenProdu(true);
			estadoordenproduSessionBean.setlIdEstadoOrdenProduActualForeignKey(this.idEstadoOrdenProduActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoOrdenProduSessionBean estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
		
		if(this.estadoordenproduSessionBean==null) {
			this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
		}
		
		this.estadoordenproduSessionBean.setsUltimaBusquedaEstadoOrdenProdu(this.getsAccionBusqueda());
		this.estadoordenproduSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadoordenproduSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoOrdenProduSessionBean estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
		
		if(this.estadoordenproduSessionBean==null) {
			this.estadoordenproduSessionBean=new EstadoOrdenProduSessionBean();
		}
		
		if(this.estadoordenproduSessionBean.getsUltimaBusquedaEstadoOrdenProdu()!=null&&!this.estadoordenproduSessionBean.getsUltimaBusquedaEstadoOrdenProdu().equals("")) {
			this.setsAccionBusqueda(estadoordenproduSessionBean.getsUltimaBusquedaEstadoOrdenProdu());
			this.setiNumeroPaginacion(estadoordenproduSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadoordenproduSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadoordenproduSessionBean.setsUltimaBusquedaEstadoOrdenProdu("");
		this.estadoordenproduSessionBean.setiNumeroPaginacion(EstadoOrdenProduConstantesFunciones.INUMEROPAGINACION);
		this.estadoordenproduSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoOrdenProdu(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoOrdenProdu() {
		this.updateBorderResaltarBusquedasFormularioEstadoOrdenProdu();
		this.updateVisibilidadBusquedasFormularioEstadoOrdenProdu();
		this.updateHabilitarBusquedasFormularioEstadoOrdenProdu();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoOrdenProdu() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoOrdenProdu() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoOrdenProdu() {
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
	
	public void updateControlesFormularioEstadoOrdenProdu() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoOrdenProdu();
		this.updateVisibilidadResaltarControlesFormularioEstadoOrdenProdu();
		this.updateHabilitarResaltarControlesFormularioEstadoOrdenProdu();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoOrdenProdu() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadoordenproduConstantesFunciones.resaltaridEstadoOrdenProdu!=null && this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setBorder(this.estadoordenproduConstantesFunciones.resaltaridEstadoOrdenProdu);}
		if(this.estadoordenproduConstantesFunciones.resaltarnombreEstadoOrdenProdu!=null && this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setBorder(this.estadoordenproduConstantesFunciones.resaltarnombreEstadoOrdenProdu);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoOrdenProdu() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
	
		//this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setVisible(this.estadoordenproduConstantesFunciones.mostraridEstadoOrdenProdu);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jPanelidEstadoOrdenProdu.setVisible(this.estadoordenproduConstantesFunciones.mostraridEstadoOrdenProdu);
		//this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setVisible(this.estadoordenproduConstantesFunciones.mostrarnombreEstadoOrdenProdu);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jPanelnombreEstadoOrdenProdu.setVisible(this.estadoordenproduConstantesFunciones.mostrarnombreEstadoOrdenProdu);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoOrdenProdu() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoOrdenProdu!=null) {
	
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextFieldidEstadoOrdenProdu.setEnabled(this.estadoordenproduConstantesFunciones.activaridEstadoOrdenProdu);
		this.jInternalFrameDetalleFormEstadoOrdenProdu.jTextAreanombreEstadoOrdenProdu.setEnabled(this.estadoordenproduConstantesFunciones.activarnombreEstadoOrdenProdu);
		}
	}
	
		
}