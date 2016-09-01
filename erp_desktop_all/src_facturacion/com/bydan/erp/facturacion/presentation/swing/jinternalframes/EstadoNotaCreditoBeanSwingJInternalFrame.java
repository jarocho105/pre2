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

import com.bydan.erp.facturacion.util.EstadoNotaCreditoConstantesFunciones;
import com.bydan.erp.facturacion.util.EstadoNotaCreditoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.EstadoNotaCreditoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.EstadoNotaCreditoBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class EstadoNotaCreditoBeanSwingJInternalFrame extends EstadoNotaCreditoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EstadoNotaCreditoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EstadoNotaCredito> estadonotacreditoValidator = new ClassValidator<EstadoNotaCredito>(EstadoNotaCredito.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EstadoNotaCredito estadonotacredito;	
	public EstadoNotaCredito estadonotacreditoAux;
	public EstadoNotaCredito estadonotacreditoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EstadoNotaCredito estadonotacreditoTotales;
	public Long idEstadoNotaCreditoActual;
	public Long iIdNuevoEstadoNotaCredito=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosNotaCreditoSoli=false;

	public Boolean getIsTienePermisosNotaCreditoSoli() {
		return isTienePermisosNotaCreditoSoli;
	}

	public void setIsTienePermisosNotaCreditoSoli(Boolean isTienePermisosNotaCreditoSoli) {
		this.isTienePermisosNotaCreditoSoli= isTienePermisosNotaCreditoSoli;
	}


	public Boolean isTienePermisosNotaCreditoPuntoVenta=false;

	public Boolean getIsTienePermisosNotaCreditoPuntoVenta() {
		return isTienePermisosNotaCreditoPuntoVenta;
	}

	public void setIsTienePermisosNotaCreditoPuntoVenta(Boolean isTienePermisosNotaCreditoPuntoVenta) {
		this.isTienePermisosNotaCreditoPuntoVenta= isTienePermisosNotaCreditoPuntoVenta;
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
	
	public Boolean isPermisoTodoEstadoNotaCredito;
	public Boolean isPermisoNuevoEstadoNotaCredito;
	public Boolean isPermisoActualizarEstadoNotaCredito;
	public Boolean isPermisoActualizarOriginalEstadoNotaCredito;
	public Boolean isPermisoEliminarEstadoNotaCredito;
	public Boolean isPermisoGuardarCambiosEstadoNotaCredito;
	public Boolean isPermisoConsultaEstadoNotaCredito;
	public Boolean isPermisoBusquedaEstadoNotaCredito;
	public Boolean isPermisoReporteEstadoNotaCredito;
	public Boolean isPermisoPaginacionMedioEstadoNotaCredito;
	public Boolean isPermisoPaginacionAltoEstadoNotaCredito;
	public Boolean isPermisoPaginacionTodoEstadoNotaCredito;
	public Boolean isPermisoCopiarEstadoNotaCredito;
	public Boolean isPermisoVerFormEstadoNotaCredito;
	public Boolean isPermisoDuplicarEstadoNotaCredito;
	public Boolean isPermisoOrdenEstadoNotaCredito;
	
	
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
	
	public EstadoNotaCreditoParameterReturnGeneral estadonotacreditoReturnGeneral;
	public EstadoNotaCreditoParameterReturnGeneral estadonotacreditoParameterGeneral;
	
	

	public NotaCreditoSoliLogic notacreditosoliSoliLogic=null;

	public NotaCreditoSoliLogic getNotaCreditoSoliSoliLogic() {
		return notacreditosoliSoliLogic;
	}

	public void setNotaCreditoSoliSoliLogic(NotaCreditoSoliLogic notacreditosoliSoliLogic) {
		this.notacreditosoliSoliLogic = notacreditosoliSoliLogic;
	}


	public NotaCreditoPuntoVentaLogic notacreditopuntoventaPuntoVentaLogic=null;

	public NotaCreditoPuntoVentaLogic getNotaCreditoPuntoVentaPuntoVentaLogic() {
		return notacreditopuntoventaPuntoVentaLogic;
	}

	public void setNotaCreditoPuntoVentaPuntoVentaLogic(NotaCreditoPuntoVentaLogic notacreditopuntoventaPuntoVentaLogic) {
		this.notacreditopuntoventaPuntoVentaLogic = notacreditopuntoventaPuntoVentaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEstadoNotaCredito=false;
	public Boolean esParaAccionDesdeFormularioEstadoNotaCredito=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public EstadoNotaCreditoLogic estadonotacreditoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EstadoNotaCredito estadonotacreditoBean;
	public EstadoNotaCreditoConstantesFunciones estadonotacreditoConstantesFunciones;
	//public EstadoNotaCreditoParameterReturnGeneral estadonotacreditoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<EstadoNotaCredito> estadonotacreditos;	
	//public List<EstadoNotaCredito> estadonotacreditosEliminados;
	//public List<EstadoNotaCredito> estadonotacreditosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEstadoNotaCredito=false;
	public Boolean isVisibilidadCeldaDuplicarEstadoNotaCredito=true;
	public Boolean isVisibilidadCeldaCopiarEstadoNotaCredito=true;
	public Boolean isVisibilidadCeldaVerFormEstadoNotaCredito=true;
	public Boolean isVisibilidadCeldaOrdenEstadoNotaCredito=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
	public Boolean isVisibilidadCeldaModificarEstadoNotaCredito=false;
	public Boolean isVisibilidadCeldaActualizarEstadoNotaCredito=false;
	public Boolean isVisibilidadCeldaEliminarEstadoNotaCredito=false;
	public Boolean isVisibilidadCeldaCancelarEstadoNotaCredito=false;
	public Boolean isVisibilidadCeldaGuardarEstadoNotaCredito=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;	
	
	
	
	public Long getiIdNuevoEstadoNotaCredito() {
		return this.iIdNuevoEstadoNotaCredito;
	}

	public void setiIdNuevoEstadoNotaCredito(Long iIdNuevoEstadoNotaCredito) {
		this.iIdNuevoEstadoNotaCredito = iIdNuevoEstadoNotaCredito;
	}
	
	public Long getidEstadoNotaCreditoActual() {
		return this.idEstadoNotaCreditoActual;
	}

	public void setidEstadoNotaCreditoActual(Long idEstadoNotaCreditoActual) {
		this.idEstadoNotaCreditoActual = idEstadoNotaCreditoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EstadoNotaCredito getestadonotacredito() {
		return this.estadonotacredito;
	}

	public void setestadonotacredito(EstadoNotaCredito estadonotacredito) {
		this.estadonotacredito = estadonotacredito;
	}
	
	public EstadoNotaCredito getestadonotacreditoAux() {
		return this.estadonotacreditoAux;
	}

	public void setestadonotacreditoAux(EstadoNotaCredito estadonotacreditoAux) {
		this.estadonotacreditoAux = estadonotacreditoAux;
	}				
	
	public EstadoNotaCredito getestadonotacreditoAnterior() {
		return this.estadonotacreditoAnterior;
	}

	public void setestadonotacreditoAnterior(EstadoNotaCredito estadonotacreditoAnterior) {
		this.estadonotacreditoAnterior = estadonotacreditoAnterior;
	}	
	
	public EstadoNotaCredito getestadonotacreditoTotales() {
		return this.estadonotacreditoTotales;
	}

	public void setestadonotacreditoTotales(EstadoNotaCredito estadonotacreditoTotales) {
		this.estadonotacreditoTotales = estadonotacreditoTotales;
	}	
	
	public EstadoNotaCredito getestadonotacreditoBean() {
		return this.estadonotacreditoBean;
	}

	public void setestadonotacreditoBean(EstadoNotaCredito estadonotacreditoBean) {
		this.estadonotacreditoBean = estadonotacreditoBean;
	}	
	
	public EstadoNotaCreditoParameterReturnGeneral getestadonotacreditoReturnGeneral() {
		return this.estadonotacreditoReturnGeneral;
	}

	public void setestadonotacreditoReturnGeneral(EstadoNotaCreditoParameterReturnGeneral estadonotacreditoReturnGeneral) {
		this.estadonotacreditoReturnGeneral = estadonotacreditoReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EstadoNotaCreditoLogic getEstadoNotaCreditoLogic()	{		
		return estadonotacreditoLogic;
	}

	public void setEstadoNotaCreditoLogic(EstadoNotaCreditoLogic estadonotacreditoLogic) {
		this.estadonotacreditoLogic = estadonotacreditoLogic;
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
	
	public Boolean getIsEsNuevoEstadoNotaCredito() {
		return isEsNuevoEstadoNotaCredito;
	}

	public void setIsEsNuevoEstadoNotaCredito(Boolean isEsNuevoEstadoNotaCredito) {
		this.isEsNuevoEstadoNotaCredito = isEsNuevoEstadoNotaCredito;
	}

	public Boolean getEsParaAccionDesdeFormularioEstadoNotaCredito() {
		return esParaAccionDesdeFormularioEstadoNotaCredito;
	}
	
	public void setEsParaAccionDesdeFormularioEstadoNotaCredito(Boolean esParaAccionDesdeFormularioEstadoNotaCredito) {
		this.esParaAccionDesdeFormularioEstadoNotaCredito = esParaAccionDesdeFormularioEstadoNotaCredito;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesEstadoNotaCredito() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EstadoNotaCreditoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoNotaCredito(this.estadonotacreditoLogic.getEstadoNotaCreditos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EstadoNotaCreditoConstantesFunciones.refrescarForeignKeysDescripcionesEstadoNotaCredito(this.estadonotacreditos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//estadonotacreditoLogic.setEstadoNotaCreditos(this.estadonotacreditos);
			estadonotacreditoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EstadoNotaCreditoParameterReturnGeneral getEstadoNotaCreditoParameterGeneral() {
		return this.estadonotacreditoParameterGeneral;
	}
	
	public void setEstadoNotaCreditoParameterGeneral(EstadoNotaCreditoParameterReturnGeneral estadonotacreditoParameterGeneral) {
		this.estadonotacreditoParameterGeneral = estadonotacreditoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEstadoNotaCredito() {
		return isPermisoTodoEstadoNotaCredito;
	}

	public void setIsPermisoTodoEstadoNotaCredito(Boolean isPermisoTodoEstadoNotaCredito) {
		this.isPermisoTodoEstadoNotaCredito = isPermisoTodoEstadoNotaCredito;
	}

	public Boolean getIsPermisoNuevoEstadoNotaCredito() {
		return isPermisoNuevoEstadoNotaCredito;
	}

	public void setIsPermisoNuevoEstadoNotaCredito(Boolean isPermisoNuevoEstadoNotaCredito) {
		this.isPermisoNuevoEstadoNotaCredito = isPermisoNuevoEstadoNotaCredito;
	}

	public Boolean getIsPermisoActualizarEstadoNotaCredito() {
		return isPermisoActualizarEstadoNotaCredito;
	}

	public void setIsPermisoActualizarEstadoNotaCredito(Boolean isPermisoActualizarEstadoNotaCredito) {
		this.isPermisoActualizarEstadoNotaCredito = isPermisoActualizarEstadoNotaCredito;
	}

	public Boolean getIsPermisoEliminarEstadoNotaCredito() {
		return isPermisoEliminarEstadoNotaCredito;
	}

	public void setIsPermisoEliminarEstadoNotaCredito(Boolean isPermisoEliminarEstadoNotaCredito) {
		this.isPermisoEliminarEstadoNotaCredito = isPermisoEliminarEstadoNotaCredito;
	}

	public Boolean getIsPermisoGuardarCambiosEstadoNotaCredito() {
		return isPermisoGuardarCambiosEstadoNotaCredito;
	}

	public void setIsPermisoGuardarCambiosEstadoNotaCredito(Boolean isPermisoGuardarCambiosEstadoNotaCredito) {
		this.isPermisoGuardarCambiosEstadoNotaCredito = isPermisoGuardarCambiosEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoConsultaEstadoNotaCredito() {
		return isPermisoConsultaEstadoNotaCredito;
	}

	public void setIsPermisoConsultaEstadoNotaCredito(Boolean isPermisoConsultaEstadoNotaCredito) {
		this.isPermisoConsultaEstadoNotaCredito = isPermisoConsultaEstadoNotaCredito;
	}

	public Boolean getIsPermisoBusquedaEstadoNotaCredito() {
		return isPermisoBusquedaEstadoNotaCredito;
	}

	public void setIsPermisoBusquedaEstadoNotaCredito(Boolean isPermisoBusquedaEstadoNotaCredito) {
		this.isPermisoBusquedaEstadoNotaCredito = isPermisoBusquedaEstadoNotaCredito;
	}

	public Boolean getIsPermisoReporteEstadoNotaCredito() {
		return isPermisoReporteEstadoNotaCredito;
	}

	public void setIsPermisoReporteEstadoNotaCredito(Boolean isPermisoReporteEstadoNotaCredito) {
		this.isPermisoReporteEstadoNotaCredito = isPermisoReporteEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoPaginacionMedioEstadoNotaCredito() {
		return isPermisoPaginacionMedioEstadoNotaCredito;
	}

	public void setIsPermisoPaginacionMedioEstadoNotaCredito(Boolean isPermisoPaginacionMedioEstadoNotaCredito) {
		this.isPermisoPaginacionMedioEstadoNotaCredito = isPermisoPaginacionMedioEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoPaginacionTodoEstadoNotaCredito() {
		return isPermisoPaginacionTodoEstadoNotaCredito;
	}

	public void setIsPermisoPaginacionTodoEstadoNotaCredito(Boolean isPermisoPaginacionTodoEstadoNotaCredito) {
		this.isPermisoPaginacionTodoEstadoNotaCredito = isPermisoPaginacionTodoEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoPaginacionAltoEstadoNotaCredito() {
		return isPermisoPaginacionAltoEstadoNotaCredito;
	}

	public void setIsPermisoPaginacionAltoEstadoNotaCredito(Boolean isPermisoPaginacionAltoEstadoNotaCredito) {
		this.isPermisoPaginacionAltoEstadoNotaCredito = isPermisoPaginacionAltoEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoCopiarEstadoNotaCredito() {
		return isPermisoCopiarEstadoNotaCredito;
	}

	public void setIsPermisoCopiarEstadoNotaCredito(Boolean isPermisoCopiarEstadoNotaCredito) {
		this.isPermisoCopiarEstadoNotaCredito = isPermisoCopiarEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoVerFormEstadoNotaCredito() {
		return isPermisoVerFormEstadoNotaCredito;
	}

	public void setIsPermisoVerFormEstadoNotaCredito(Boolean isPermisoVerFormEstadoNotaCredito) {
		this.isPermisoVerFormEstadoNotaCredito = isPermisoVerFormEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoDuplicarEstadoNotaCredito() {
		return isPermisoDuplicarEstadoNotaCredito;
	}

	public void setIsPermisoDuplicarEstadoNotaCredito(Boolean isPermisoDuplicarEstadoNotaCredito) {
		this.isPermisoDuplicarEstadoNotaCredito = isPermisoDuplicarEstadoNotaCredito;
	}
	
	public Boolean getIsPermisoOrdenEstadoNotaCredito() {
		return isPermisoOrdenEstadoNotaCredito;
	}

	public void setIsPermisoOrdenEstadoNotaCredito(Boolean isPermisoOrdenEstadoNotaCredito) {
		this.isPermisoOrdenEstadoNotaCredito = isPermisoOrdenEstadoNotaCredito;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEstadoNotaCredito() {
		return isVisibilidadCeldaNuevoEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaNuevoEstadoNotaCredito(Boolean isVisibilidadCeldaNuevoEstadoNotaCredito) {
		this.isVisibilidadCeldaNuevoEstadoNotaCredito = isVisibilidadCeldaNuevoEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEstadoNotaCredito() {
		return isVisibilidadCeldaDuplicarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaDuplicarEstadoNotaCredito(Boolean isVisibilidadCeldaDuplicarEstadoNotaCredito) {
		this.isVisibilidadCeldaDuplicarEstadoNotaCredito = isVisibilidadCeldaDuplicarEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEstadoNotaCredito() {
		return isVisibilidadCeldaCopiarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaCopiarEstadoNotaCredito(Boolean isVisibilidadCeldaCopiarEstadoNotaCredito) {
		this.isVisibilidadCeldaCopiarEstadoNotaCredito = isVisibilidadCeldaCopiarEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEstadoNotaCredito() {
		return isVisibilidadCeldaVerFormEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaVerFormEstadoNotaCredito(Boolean isVisibilidadCeldaVerFormEstadoNotaCredito) {
		this.isVisibilidadCeldaVerFormEstadoNotaCredito = isVisibilidadCeldaVerFormEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEstadoNotaCredito() {
		return isVisibilidadCeldaOrdenEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaOrdenEstadoNotaCredito(Boolean isVisibilidadCeldaOrdenEstadoNotaCredito) {
		this.isVisibilidadCeldaOrdenEstadoNotaCredito = isVisibilidadCeldaOrdenEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEstadoNotaCredito() {
		return isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEstadoNotaCredito(Boolean isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito) {
		this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito = isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEstadoNotaCredito() {
		return isVisibilidadCeldaModificarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaModificarEstadoNotaCredito(Boolean isVisibilidadCeldaModificarEstadoNotaCredito) {
		this.isVisibilidadCeldaModificarEstadoNotaCredito = isVisibilidadCeldaModificarEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEstadoNotaCredito() {
		return isVisibilidadCeldaActualizarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaActualizarEstadoNotaCredito(Boolean isVisibilidadCeldaActualizarEstadoNotaCredito) {
		this.isVisibilidadCeldaActualizarEstadoNotaCredito = isVisibilidadCeldaActualizarEstadoNotaCredito;
	}

	public Boolean getIsVisibilidadCeldaEliminarEstadoNotaCredito() {
		return isVisibilidadCeldaEliminarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaEliminarEstadoNotaCredito(Boolean isVisibilidadCeldaEliminarEstadoNotaCredito) {
		this.isVisibilidadCeldaEliminarEstadoNotaCredito = isVisibilidadCeldaEliminarEstadoNotaCredito;
	}

	public Boolean getIsVisibilidadCeldaCancelarEstadoNotaCredito() {
		return isVisibilidadCeldaCancelarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaCancelarEstadoNotaCredito(Boolean isVisibilidadCeldaCancelarEstadoNotaCredito) {
		this.isVisibilidadCeldaCancelarEstadoNotaCredito = isVisibilidadCeldaCancelarEstadoNotaCredito;
	}

	public Boolean getIsVisibilidadCeldaGuardarEstadoNotaCredito() {
		return isVisibilidadCeldaGuardarEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaGuardarEstadoNotaCredito(Boolean isVisibilidadCeldaGuardarEstadoNotaCredito) {
		this.isVisibilidadCeldaGuardarEstadoNotaCredito = isVisibilidadCeldaGuardarEstadoNotaCredito;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEstadoNotaCredito() {
		return isVisibilidadCeldaGuardarCambiosEstadoNotaCredito;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEstadoNotaCredito(Boolean isVisibilidadCeldaGuardarCambiosEstadoNotaCredito) {
		this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito = isVisibilidadCeldaGuardarCambiosEstadoNotaCredito;
	}
		
	public EstadoNotaCreditoSessionBean getestadonotacreditoSessionBean() {
		return this.estadonotacreditoSessionBean;
	}
	
	public void setestadonotacreditoSessionBean(EstadoNotaCreditoSessionBean estadonotacreditoSessionBean) {
		this.estadonotacreditoSessionBean=estadonotacreditoSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(EstadoNotaCredito estadonotacredito)throws Exception {
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
	
	public void bugActualizarReferenciaActual(EstadoNotaCredito estadonotacredito,EstadoNotaCredito estadonotacreditoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEstadoNotaCredito(estadonotacredito);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		estadonotacreditoAux.setId(estadonotacredito.getId());
		estadonotacreditoAux.setVersionRow(estadonotacredito.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEstadoNotaCredito();
		
			int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = estadonotacreditoValidator.getInvalidValues(this.estadonotacredito);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			estadonotacreditoLogic.setDatosCliente(datosCliente);
			estadonotacreditoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				estadonotacreditoAux=new  EstadoNotaCredito();
				
				estadonotacreditoAux.setIsNew(true);
				estadonotacreditoAux.setIsChanged(true);
				
				estadonotacreditoAux.setEstadoNotaCreditoOriginal(this.estadonotacredito);
				
				estadonotacreditoAux.setId(this.estadonotacredito.getId());	
				estadonotacreditoAux.setVersionRow(this.estadonotacredito.getVersionRow());	
				estadonotacreditoAux.setcodigo(this.estadonotacredito.getcodigo());	
				estadonotacreditoAux.setnombre(this.estadonotacredito.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadonotacreditoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(estadonotacreditoAux,estadonotacreditoLogic.getEstadoNotaCreditos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonotacreditoAux,estadonotacreditos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonotacreditoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonotacreditoLogic.saveEstadoNotaCreditos();//WithConnection
						//estadonotacreditoLogic.getSetVersionRowEstadoNotaCreditos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadonotacredito,estadonotacreditoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				estadonotacreditoAux=new  EstadoNotaCredito();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado() 
					|| (this.estadonotacreditoSessionBean.getEsGuardarRelacionado() && this.estadonotacredito.getId()>=0)) {
						
					estadonotacreditoAux.setIsNew(false);
				}
				
				estadonotacreditoAux.setIsDeleted(false);
			
				estadonotacreditoAux.setId(this.estadonotacredito.getId());	
				estadonotacreditoAux.setVersionRow(this.estadonotacredito.getVersionRow());	
				estadonotacreditoAux.setcodigo(this.estadonotacredito.getcodigo());	
				estadonotacreditoAux.setnombre(this.estadonotacredito.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadonotacreditoAux,estadonotacreditoLogic.getEstadoNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonotacreditoAux,estadonotacreditos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonotacreditoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonotacreditoLogic.saveEstadoNotaCreditos();//WithConnection
						//estadonotacreditoLogic.getSetVersionRowEstadoNotaCreditos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.estadonotacredito,estadonotacreditoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				estadonotacreditoAux=new  EstadoNotaCredito();
				
				estadonotacreditoAux.setIsNew(false);
				estadonotacreditoAux.setIsChanged(false);
				
				estadonotacreditoAux.setIsDeleted(true);
				
				estadonotacreditoAux.setId(this.estadonotacredito.getId());	
				estadonotacreditoAux.setVersionRow(this.estadonotacredito.getVersionRow());	
				estadonotacreditoAux.setcodigo(this.estadonotacredito.getcodigo());	
				estadonotacreditoAux.setnombre(this.estadonotacredito.getnombre());	
				
				if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.estadonotacreditoAux.getId()>=0) {	
						this.estadonotacreditosEliminados.add(estadonotacreditoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(estadonotacreditoAux,estadonotacreditoLogic.getEstadoNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonotacreditoAux,estadonotacreditos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.estadonotacreditoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonotacreditoLogic.saveEstadoNotaCreditos();//WithConnection
						//estadonotacreditoLogic.getSetVersionRowEstadoNotaCreditos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.quitarFilaTotales();}
							estadonotacreditoAux.setNotaCreditoSoliSolis(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());

							if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.quitarFilaTotales();}
							estadonotacreditoAux.setNotaCreditoPuntoVentaPuntoVentas(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.estadonotacreditoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(estadonotacreditoAux,estadonotacreditoLogic.getEstadoNotaCreditos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(estadonotacreditoAux,estadonotacreditos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.getEstadoNotaCreditos().addAll(this.estadonotacreditosEliminados);
					
					estadonotacreditoLogic.saveEstadoNotaCreditos();//WithConnection
					//estadonotacreditoLogic.getSetVersionRowEstadoNotaCreditos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.estadonotacreditosEliminados= new ArrayList<EstadoNotaCredito>();		
			}
			
			if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Estado Nota Credito GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.estadonotacredito=estadonotacreditoAux;
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
      		//this.finishProcessEstadoNotaCredito();
      	}
		
	}	
	
	public void actualizarRelaciones(EstadoNotaCredito estadonotacreditoLocal) throws Exception {
		
		if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				estadonotacreditoLocal.setNotaCreditoSoliSolis(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
				estadonotacreditoLocal.setNotaCreditoPuntoVentaPuntoVentas(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
			
			} else {
			
				estadonotacreditoLocal.setNotaCreditoSoliSolis(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosolis);
				estadonotacreditoLocal.setNotaCreditoPuntoVentaPuntoVentas(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EstadoNotaCredito estadonotacreditoLocal) throws Exception {	
		if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarEstadoNotaCreditoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = estadonotacreditoValidator.getInvalidValues(this.estadonotacredito);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EstadoNotaCredito estadonotacredito,List<EstadoNotaCredito> estadonotacreditos) throws Exception {
		try	{		
			EstadoNotaCreditoConstantesFunciones.actualizarLista(estadonotacredito,estadonotacreditos,this.estadonotacreditoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EstadoNotaCredito estadonotacredito,List<EstadoNotaCredito> estadonotacreditos) throws Exception {
		try	{			
			EstadoNotaCreditoConstantesFunciones.actualizarSelectedLista(estadonotacredito,estadonotacreditos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EstadoNotaCredito> estadonotacreditosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				estadonotacreditosLocal=this.estadonotacreditoLogic.getEstadoNotaCreditos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				estadonotacreditosLocal=this.estadonotacreditos;
			}
			//ARCHITECTURE
		
			for(EstadoNotaCredito estadonotacreditoLocal:estadonotacreditosLocal) {
				if(this.permiteMantenimiento(estadonotacreditoLocal) && estadonotacreditoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EstadoNotaCreditoConstantesFunciones.getEstadoNotaCreditoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EstadoNotaCreditoConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelcodigoEstadoNotaCredito,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EstadoNotaCreditoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelnombreEstadoNotaCredito,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelcodigoEstadoNotaCredito,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelnombreEstadoNotaCredito,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("NotaCreditoSoli")) {
			if(this.estadonotacredito==null) {
				this.estadonotacredito= new EstadoNotaCredito();
			}

			if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoNotaCredito
				this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);

				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.getnotacreditosoli().setEstadoNotaCreditoSoli(this.estadonotacredito);
			}

			return;
		}
		 else  if(sTipo.equals("NotaCreditoPuntoVenta")) {
			if(this.estadonotacredito==null) {
				this.estadonotacredito= new EstadoNotaCredito();
			}

			if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoEstadoNotaCredito
				this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);

				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.getnotacreditopuntoventa().setEstadoNotaCreditoPuntoVenta(this.estadonotacredito);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoEstadoNotaCredito--;	
		
		
		this.estadonotacreditoAux=new EstadoNotaCredito();
		
		this.estadonotacreditoAux.setId(this.iIdNuevoEstadoNotaCredito);
		this.estadonotacreditoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.estadonotacreditoLogic.getEstadoNotaCreditos().add(this.estadonotacreditoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.estadonotacreditos.add(this.estadonotacreditoAux);
		}
		//ARCHITECTURE
		
		this.estadonotacredito=this.estadonotacreditoAux;
		
		if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacredito);
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoNotaCredito(this.estadonotacredito);
		}
				
		//this.setDefaultControlesEstadoNotaCredito();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEstadoNotaCredito();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEstadoNotaCredito();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNotaCredito();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoNotaCredito(this.estadonotacreditoBean,this.estadonotacredito,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
			classes=EstadoNotaCreditoConstantesFunciones.getClassesRelationshipsOfEstadoNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.estadonotacreditoReturnGeneral=estadonotacreditoLogic.procesarEventosEstadoNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonotacreditoLogic.getEstadoNotaCreditos(),this.estadonotacredito,this.estadonotacreditoParameterGeneral,this.isEsNuevoEstadoNotaCredito,classes);//this.estadonotacreditoLogic.getEstadoNotaCredito()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEstadoNotaCredito(this.estadonotacreditoReturnGeneral,this.estadonotacreditoBean,false);
		
		if(this.estadonotacreditoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito());
		}
		
		if(this.estadonotacreditoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito(),classes);//this.estadonotacreditoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEstadoNotaCredito();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEstadoNotaCredito();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEstadoNotaCredito(false);
						
			if(estadonotacreditoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado() && NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoSoliActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() && NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoPuntoVentaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNotaCredito();
			}
			
			this.actualizarVisualTableDatosEstadoNotaCredito();
			
			this.jTableDatosEstadoNotaCredito.setRowSelectionInterval(this.getIndiceNuevoEstadoNotaCredito(), this.getIndiceNuevoEstadoNotaCredito());
			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
						
			this.actualizarEstadoCeldasBotonesEstadoNotaCredito("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEstadoNotaCredito(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setEnabled(isHabilitar && this.estadonotacreditoConstantesFunciones.activarcodigoEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setEnabled(isHabilitar && this.estadonotacreditoConstantesFunciones.activarnombreEstadoNotaCredito);	
		
	};
	
	public void setDefaultControlesEstadoNotaCredito() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEstadoNotaCredito(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.estadonotacreditoSessionBean.setConGuardarRelaciones(true);			
			this.estadonotacreditoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.estadonotacreditoSessionBean.setConGuardarRelaciones(false);			
			this.estadonotacreditoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoEstadoNotaCredito() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
				if(estadonotacreditoAux.getId().equals(this.iIdNuevoEstadoNotaCredito)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditos) {
				if(estadonotacreditoAux.getId().equals(this.iIdNuevoEstadoNotaCredito)) {
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
	
	public int getIndiceActualEstadoNotaCredito(EstadoNotaCredito estadonotacredito,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
				if(estadonotacreditoAux.getId().equals(estadonotacredito.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditos) {
				if(estadonotacreditoAux.getId().equals(estadonotacredito.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEstadoNotaCredito(EstadoNotaCredito estadonotacreditoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
				if(estadonotacreditoAux.getEstadoNotaCreditoOriginal().getId().equals(estadonotacreditoOriginal.getId())) {
					existe=true;
					estadonotacreditoOriginal.setId(estadonotacreditoAux.getId());
					estadonotacreditoOriginal.setVersionRow(estadonotacreditoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditos) {
				if(estadonotacreditoAux.getEstadoNotaCreditoOriginal().getId().equals(estadonotacreditoOriginal.getId())) {
					existe=true;
					estadonotacreditoOriginal.setId(estadonotacreditoAux.getId());
					estadonotacreditoOriginal.setVersionRow(estadonotacreditoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEstadoNotaCredito(Boolean esParaCancelar) throws Exception {
		estadonotacreditosAux=new ArrayList<EstadoNotaCredito>();
		estadonotacreditoAux=new EstadoNotaCredito();
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
					if(estadonotacreditoAux.getId()<0) {
						estadonotacreditosAux.add(estadonotacreditoAux);
					}		
				}
				this.iIdNuevoEstadoNotaCredito=0L;
				this.estadonotacreditoLogic.getEstadoNotaCreditos().removeAll(estadonotacreditosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditos) {
					if(estadonotacreditoAux.getId()<0) {
						estadonotacreditosAux.add(estadonotacreditoAux);
					}		
				}
				this.iIdNuevoEstadoNotaCredito=0L;
				this.estadonotacreditos.removeAll(estadonotacreditosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEstadoNotaCredito 
					&& this.estadonotacreditoLogic.getEstadoNotaCreditos().size()>0
					) {
					estadonotacreditoAux=this.estadonotacreditoLogic.getEstadoNotaCreditos().get(this.estadonotacreditoLogic.getEstadoNotaCreditos().size() - 1);
				
					if(estadonotacreditoAux.getId()<0) {
						this.estadonotacreditoLogic.getEstadoNotaCreditos().remove(estadonotacreditoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEstadoNotaCredito && this.estadonotacreditos.size()>0) {
					estadonotacreditoAux=this.estadonotacreditos.get(this.estadonotacreditos.size() - 1);
				
					if(estadonotacreditoAux.getId()<0) {
						this.estadonotacreditos.remove(estadonotacreditoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEstadoNotaCredito(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(estadonotacredito.getId()<0) {
				this.estadonotacreditoLogic.getEstadoNotaCreditos().remove(this.estadonotacredito);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(estadonotacredito.getId()<0) {
				this.estadonotacreditos.remove(this.estadonotacredito);
			}
		}			
	}
	
	public void setEstadosInicialesEstadoNotaCredito(List<EstadoNotaCredito> estadonotacreditosAux) throws Exception {
		EstadoNotaCreditoConstantesFunciones.setEstadosInicialesEstadoNotaCredito(estadonotacreditosAux);
	}
	
	public void setEstadosInicialesEstadoNotaCredito(EstadoNotaCredito estadonotacreditoAux) throws Exception {
		EstadoNotaCreditoConstantesFunciones.setEstadosInicialesEstadoNotaCredito(estadonotacreditoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEstadoNotaCreditoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEstadoNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEstadoNotaCreditoActual()) {
				if(!this.isEsNuevoEstadoNotaCredito) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEstadoNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEstadoNotaCredito=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEstadoNotaCreditoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Estado Nota Credito ?", "MANTENIMIENTO DE Estado Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEstadoNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EstadoNotaCredito estadonotacredito) throws Exception {
		EstadoNotaCreditoConstantesFunciones.seleccionarAsignar(this.estadonotacredito,estadonotacredito);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEstadoNotaCredito=this.isPermisoActualizarOriginalEstadoNotaCredito;
			
			
			this.seleccionarAsignar(estadonotacredito);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EstadoNotaCreditoConstantesFunciones.quitarEspaciosEstadoNotaCredito(this.estadonotacredito,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEstadoNotaCredito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.estadonotacreditoSessionBean.setsFuncionBusquedaRapida(this.estadonotacreditoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEstadoNotaCredito) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEstadoNotaCredito(esParaCancelar);				
				this.cancelarNuevoEstadoNotaCredito(esParaCancelar);								
			}
			
			this.estadonotacredito=new EstadoNotaCredito();
			
			this.inicializarEstadoNotaCredito();
			
			this.actualizarEstadoCeldasBotonesEstadoNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEstadoNotaCredito() throws Exception {
		try {
			EstadoNotaCreditoConstantesFunciones.inicializarEstadoNotaCredito(this.estadonotacredito);
			
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
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.estadonotacreditoLogic.getEstadoNotaCreditos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEstadoNotaCreditos(String sAccionBusqueda,List<EstadoNotaCredito> estadonotacreditosParaReportes) throws Exception {
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
					sPathReporteFinal="EstadoNotaCredito"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EstadoNotaCreditoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EstadoNotaCreditoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EstadoNotaCredito"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Estado Nota Creditos");		
		parameters.put("busquedapor", EstadoNotaCreditoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(NotaCreditoSoli.class));
			classes.add(new Classe(NotaCreditoPuntoVenta.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					EstadoNotaCreditoLogic estadonotacreditoLogicAuxiliar=new EstadoNotaCreditoLogic();
					estadonotacreditoLogicAuxiliar.setDatosCliente(estadonotacreditoLogic.getDatosCliente());				
					estadonotacreditoLogicAuxiliar.setEstadoNotaCreditos(estadonotacreditosParaReportes);
					
					estadonotacreditoLogicAuxiliar.cargarRelacionesLoteForeignKeyEstadoNotaCreditoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					estadonotacreditosParaReportes=estadonotacreditoLogicAuxiliar.getEstadoNotaCreditos();
					
					//estadonotacreditoLogic.getNewConnexionToDeep();
					
					//for (EstadoNotaCredito estadonotacredito:estadonotacreditosParaReportes) {
					//	estadonotacreditoLogic.deepLoad(estadonotacredito, false, DeepLoadType.INCLUDE, classes);
					//}						
					//estadonotacreditoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//estadonotacreditoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileNotaCreditoSoli = AuxiliarReportes.class.getResourceAsStream("NotaCreditoSoliDetalleRelacionesDesign.jasper");
			parameters.put("subreport_notacreditosoli", reportFileNotaCreditoSoli);

			InputStream reportFileNotaCreditoPuntoVenta = AuxiliarReportes.class.getResourceAsStream("NotaCreditoPuntoVentaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_notacreditopuntoventa", reportFileNotaCreditoPuntoVenta);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEstadoNotaCredito=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EstadoNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EstadoNotaCreditoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEstadoNotaCredito=new JRBeanArrayDataSource(EstadoNotaCreditoJInternalFrame.TraerEstadoNotaCreditoBeans(estadonotacreditosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEstadoNotaCredito);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EstadoNotaCreditoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EstadoNotaCreditoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EstadoNotaCreditoBean.TraerEstadoNotaCreditoBeans(estadonotacreditosParaReportes).toArray()));
							
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
				this.generarExcelReporteEstadoNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,estadonotacreditosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEstadoNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,estadonotacreditosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEstadoNotaCreditoActionPerformed(null);
					//this.generarExcelReporteEstadoNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,estadonotacreditosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEstadoNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,estadonotacreditosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEstadoNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,estadonotacreditosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEstadoNotaCreditos(sAccionBusqueda,sTipoArchivoReporte,estadonotacreditosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEstadoNotaCreditos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNotaCredito> estadonotacreditosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNotaCreditos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoNotaCredito("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EstadoNotaCredito estadonotacredito : estadonotacreditosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EstadoNotaCreditoConstantesFunciones.generarExcelReporteDataEstadoNotaCredito("NORMAL",row,workbook,estadonotacredito,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEstadoNotaCredito(String sTipo,Row row,Workbook workbook) {
		
		EstadoNotaCreditoConstantesFunciones.generarExcelReporteHeaderEstadoNotaCredito(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEstadoNotaCreditos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNotaCredito> estadonotacreditosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNotaCreditos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EstadoNotaCredito estadonotacredito : estadonotacreditosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EstadoNotaCreditoConstantesFunciones.getEstadoNotaCreditoDescripcion(estadonotacredito));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadonotacredito.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(estadonotacredito.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEstadoNotaCreditos(String sAccionBusqueda,String sTipoArchivoReporte,List<EstadoNotaCredito> estadonotacreditosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EstadoNotaCredito> estadonotacreditosRespaldo=null;
		
		classes=EstadoNotaCreditoConstantesFunciones.getClassesRelationshipsOfEstadoNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.estadonotacreditoLogic.setDatosCliente(this.datosCliente);
		this.estadonotacreditoLogic.setDatosDeep(this.datosDeep);
		this.estadonotacreditoLogic.setIsConDeep(true);
		
		estadonotacreditosRespaldo=this.estadonotacreditoLogic.getEstadoNotaCreditos();
		
		this.estadonotacreditoLogic.setEstadoNotaCreditos(estadonotacreditosParaReportes);	
		this.estadonotacreditoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		estadonotacreditosParaReportes=this.estadonotacreditoLogic.getEstadoNotaCreditos();
		this.estadonotacreditoLogic.setEstadoNotaCreditos(estadonotacreditosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EstadoNotaCreditos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEstadoNotaCredito("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EstadoNotaCredito estadonotacredito : estadonotacreditosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEstadoNotaCredito("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EstadoNotaCreditoConstantesFunciones.generarExcelReporteDataEstadoNotaCredito("NORMAL",row,workbook,estadonotacredito,cellStyleDataAux);
		
			
			


				//NotaCreditoSoli
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadonotacredito.getNotaCreditoSoliSolis()!=null && estadonotacredito.getNotaCreditoSoliSolis().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NotaCreditoSoliConstantesFunciones.generarExcelReporteHeaderNotaCreditoSoli("RELACIONADO",row,workbook);
				}

				if(estadonotacredito.getNotaCreditoSoliSolis()!=null) {
					i2=0;
					for(NotaCreditoSoli notacreditosoli : estadonotacredito.getNotaCreditoSoliSolis()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NotaCreditoSoliConstantesFunciones.generarExcelReporteDataNotaCreditoSoli("RELACIONADO",row,workbook,notacreditosoli,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//NotaCreditoPuntoVenta
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO))) {

				if(estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas()!=null && estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					NotaCreditoPuntoVentaConstantesFunciones.generarExcelReporteHeaderNotaCreditoPuntoVenta("RELACIONADO",row,workbook);
				}

				if(estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas()!=null) {
					i2=0;
					for(NotaCreditoPuntoVenta notacreditopuntoventa : estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						NotaCreditoPuntoVentaConstantesFunciones.generarExcelReporteDataNotaCreditoPuntoVenta("RELACIONADO",row,workbook,notacreditopuntoventa,cellStyleDataAuxHijo);
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
		cell.setCellValue(EstadoNotaCreditoConstantesFunciones.getEstadoNotaCreditoDescripcion(estadonotacredito));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEstadoNotaCredito() throws Exception {		
		this.startProcessEstadoNotaCredito(true);
	}
	
	public void startProcessEstadoNotaCredito(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesEstadoNotaCredito, this.jScrollPanelDatosEstadoNotaCredito,this.jPanelPaginacionEstadoNotaCredito, this.jScrollPanelDatosEdicionEstadoNotaCredito, this.jPanelAccionesEstadoNotaCredito,this.jPanelAccionesFormularioEstadoNotaCredito,this.jmenuBarEstadoNotaCredito,this.jmenuBarDetalleEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,this.jTtoolBarDetalleEstadoNotaCredito);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoNotaCredito=null; 
		
		final JPanel jPanelParametrosReportesEstadoNotaCredito=this.jPanelParametrosReportesEstadoNotaCredito;
		//final JScrollPane jScrollPanelDatosEstadoNotaCredito=this.jScrollPanelDatosEstadoNotaCredito;
		final JTable jTableDatosEstadoNotaCredito=this.jTableDatosEstadoNotaCredito;		
		final JPanel jPanelPaginacionEstadoNotaCredito=this.jPanelPaginacionEstadoNotaCredito;
		//final JScrollPane jScrollPanelDatosEdicionEstadoNotaCredito=this.jScrollPanelDatosEdicionEstadoNotaCredito;
		final JPanel jPanelAccionesEstadoNotaCredito=this.jPanelAccionesEstadoNotaCredito;
		
		JPanel jPanelCamposAuxiliarEstadoNotaCredito=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEstadoNotaCredito=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			jPanelCamposAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelCamposEstadoNotaCredito;
			jPanelAccionesFormularioAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelAccionesFormularioEstadoNotaCredito;
		}
		
		final JPanel jPanelCamposEstadoNotaCredito=jPanelCamposAuxiliarEstadoNotaCredito;
		final JPanel jPanelAccionesFormularioEstadoNotaCredito=jPanelAccionesFormularioAuxiliarEstadoNotaCredito;
		
		
		final JMenuBar jmenuBarEstadoNotaCredito=this.jmenuBarEstadoNotaCredito;
		final JToolBar jTtoolBarEstadoNotaCredito=this.jTtoolBarEstadoNotaCredito;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEstadoNotaCredito=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoNotaCredito=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			jmenuBarDetalleAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jmenuBarDetalleEstadoNotaCredito;
			jTtoolBarDetalleAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jTtoolBarDetalleEstadoNotaCredito;
		}
		
		final JMenuBar jmenuBarDetalleEstadoNotaCredito=jmenuBarDetalleAuxiliarEstadoNotaCredito;
		final JToolBar jTtoolBarDetalleEstadoNotaCredito=jTtoolBarDetalleAuxiliarEstadoNotaCredito;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoNotaCredito;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoNotaCredito;
			processRunnable.jTableDatos=jTableDatosEstadoNotaCredito;
			processRunnable.jPanelCampos=jPanelCamposEstadoNotaCredito;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoNotaCredito;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoNotaCredito;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoNotaCredito;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoNotaCredito;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoNotaCredito;
			processRunnable.jTtoolBar=jTtoolBarEstadoNotaCredito;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoNotaCredito;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEstadoNotaCredito ,jPanelParametrosReportesEstadoNotaCredito,jTableDatosEstadoNotaCredito, /*jScrollPanelDatosEstadoNotaCredito,*/jPanelCamposEstadoNotaCredito,jPanelPaginacionEstadoNotaCredito, /*jScrollPanelDatosEdicionEstadoNotaCredito,*/ jPanelAccionesEstadoNotaCredito,jPanelAccionesFormularioEstadoNotaCredito,jmenuBarEstadoNotaCredito,jmenuBarDetalleEstadoNotaCredito,jTtoolBarEstadoNotaCredito,jTtoolBarDetalleEstadoNotaCredito);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesEstadoNotaCredito, jScrollPanelDatosEstadoNotaCredito,jPanelPaginacionEstadoNotaCredito, jScrollPanelDatosEdicionEstadoNotaCredito, jPanelAccionesEstadoNotaCredito,jPanelAccionesFormularioEstadoNotaCredito,jmenuBarEstadoNotaCredito,jmenuBarDetalleEstadoNotaCredito,jTtoolBarEstadoNotaCredito,jTtoolBarDetalleEstadoNotaCredito);
						
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
	
	public void finishProcessEstadoNotaCredito() {// throws Exception 
		this.finishProcessEstadoNotaCredito(true);
	}
	
	public void finishProcessEstadoNotaCredito(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesEstadoNotaCredito, this.jScrollPanelDatosEstadoNotaCredito,this.jPanelPaginacionEstadoNotaCredito, this.jScrollPanelDatosEdicionEstadoNotaCredito, this.jPanelAccionesEstadoNotaCredito,this.jPanelAccionesFormularioEstadoNotaCredito,this.jmenuBarEstadoNotaCredito,this.jmenuBarDetalleEstadoNotaCredito,this.jTtoolBarEstadoNotaCredito,this.jTtoolBarDetalleEstadoNotaCredito);		
		
		final JTabbedPane jTabbedPaneBusquedasEstadoNotaCredito=null; 
		
		final JPanel jPanelParametrosReportesEstadoNotaCredito=this.jPanelParametrosReportesEstadoNotaCredito;
		//final JScrollPane jScrollPanelDatosEstadoNotaCredito=this.jScrollPanelDatosEstadoNotaCredito;
		final JTable jTableDatosEstadoNotaCredito=this.jTableDatosEstadoNotaCredito;		
		final JPanel jPanelPaginacionEstadoNotaCredito=this.jPanelPaginacionEstadoNotaCredito;
		//final JScrollPane jScrollPanelDatosEdicionEstadoNotaCredito=this.jScrollPanelDatosEdicionEstadoNotaCredito;
		final JPanel jPanelAccionesEstadoNotaCredito=this.jPanelAccionesEstadoNotaCredito;
		
		JPanel jPanelCamposAuxiliarEstadoNotaCredito=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEstadoNotaCredito=new JPanel();
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			jPanelCamposAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelCamposEstadoNotaCredito;
			jPanelAccionesFormularioAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelAccionesFormularioEstadoNotaCredito;
		}
		
		final JPanel jPanelCamposEstadoNotaCredito=jPanelCamposAuxiliarEstadoNotaCredito;
		final JPanel jPanelAccionesFormularioEstadoNotaCredito=jPanelAccionesFormularioAuxiliarEstadoNotaCredito;
		
		
		final JMenuBar jmenuBarEstadoNotaCredito=this.jmenuBarEstadoNotaCredito;		
		final JToolBar jTtoolBarEstadoNotaCredito=this.jTtoolBarEstadoNotaCredito;
				
		JMenuBar jmenuBarDetalleAuxiliarEstadoNotaCredito=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEstadoNotaCredito=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			jmenuBarDetalleAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jmenuBarDetalleEstadoNotaCredito;
			jTtoolBarDetalleAuxiliarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jTtoolBarDetalleEstadoNotaCredito;		
		}
		
		final JMenuBar jmenuBarDetalleEstadoNotaCredito=jmenuBarDetalleAuxiliarEstadoNotaCredito;
		final JToolBar jTtoolBarDetalleEstadoNotaCredito=jTtoolBarDetalleAuxiliarEstadoNotaCredito;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEstadoNotaCredito;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEstadoNotaCredito;
			processRunnable.jTableDatos=jTableDatosEstadoNotaCredito;
			processRunnable.jPanelCampos=jPanelCamposEstadoNotaCredito;
			processRunnable.jPanelPaginacion=jPanelPaginacionEstadoNotaCredito;
			processRunnable.jPanelAcciones=jPanelAccionesEstadoNotaCredito;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEstadoNotaCredito;
			
			
			processRunnable.jmenuBar=jmenuBarEstadoNotaCredito;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEstadoNotaCredito;
			processRunnable.jTtoolBar=jTtoolBarEstadoNotaCredito;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEstadoNotaCredito;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEstadoNotaCredito ,jPanelParametrosReportesEstadoNotaCredito, jTableDatosEstadoNotaCredito,/*jScrollPanelDatosEstadoNotaCredito,*/jPanelCamposEstadoNotaCredito,jPanelPaginacionEstadoNotaCredito, /*jScrollPanelDatosEdicionEstadoNotaCredito,*/ jPanelAccionesEstadoNotaCredito,jPanelAccionesFormularioEstadoNotaCredito,jmenuBarEstadoNotaCredito,jmenuBarDetalleEstadoNotaCredito,jTtoolBarEstadoNotaCredito,jTtoolBarDetalleEstadoNotaCredito));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEstadoNotaCredito(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEstadoNotaCredito(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEstadoNotaCredito(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEstadoNotaCredito(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEstadoNotaCredito,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEstadoNotaCredito,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEstadoNotaCredito(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEstadoNotaCredito,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEstadoNotaCredito,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.estadonotacreditoConstantesFunciones.getsFinalQueryEstadoNotaCredito();
		String  finalQueryPaginacionTodos=this.estadonotacreditoConstantesFunciones.getsFinalQueryEstadoNotaCredito();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EstadoNotaCreditoConstantesFunciones.getArrayColumnasGlobalesNoEstadoNotaCredito(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EstadoNotaCreditoConstantesFunciones.getArrayColumnasGlobalesEstadoNotaCredito(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EstadoNotaCreditoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.estadonotacreditosEliminados= new ArrayList<EstadoNotaCredito>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEstadoNotaCredito();
		
				///*EstadoNotaCreditoSessionBean*/this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
			
			if(this.estadonotacreditoSessionBean==null) {
				this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
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
					this.iNumeroPaginacion=EstadoNotaCreditoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EstadoNotaCreditoConstantesFunciones.getClassesForeignKeysOfEstadoNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/estadonotacredito."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			estadonotacreditosAux= new ArrayList<EstadoNotaCredito>();
			
				
			estadonotacreditoLogic.setDatosCliente(this.datosCliente);
			estadonotacreditoLogic.setDatosDeep(this.datosDeep);
			estadonotacreditoLogic.setIsConDeep(true);
			
			
			estadonotacreditoLogic.getEstadoNotaCreditoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					estadonotacreditoLogic.getTodosEstadoNotaCreditos(finalQueryGlobal,pagination);
					
					//estadonotacreditoLogic.getTodosEstadoNotaCreditosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(estadonotacreditoLogic.getEstadoNotaCreditos()==null|| estadonotacreditoLogic.getEstadoNotaCreditos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonotacreditosAux= new ArrayList<EstadoNotaCredito>();
							estadonotacreditosAux.addAll(estadonotacreditoLogic.getEstadoNotaCreditos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonotacreditosAux= new ArrayList<EstadoNotaCredito>();
							estadonotacreditosAux.addAll(estadonotacreditos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonotacreditoLogic.getTodosEstadoNotaCreditos(finalQueryGlobal+"",this.pagination);												
							
							//estadonotacreditoLogic.getTodosEstadoNotaCreditosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditoLogic.getEstadoNotaCreditos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							estadonotacreditoLogic.setEstadoNotaCreditos(new ArrayList<EstadoNotaCredito>());					
							estadonotacreditoLogic.getEstadoNotaCreditos().addAll(estadonotacreditosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonotacreditos=new ArrayList<EstadoNotaCredito>();
							estadonotacreditos.addAll(estadonotacreditosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEstadoNotaCredito=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEstadoNotaCredito=this.idActual;
				
				} else if(this.idEstadoNotaCreditoActual!=null && this.idEstadoNotaCreditoActual!=0L) {
					idEstadoNotaCredito=idEstadoNotaCreditoActual;
				}
				
					
				this.sDetalleReporte=EstadoNotaCreditoConstantesFunciones.getDetalleIndicePorId(idEstadoNotaCredito);
				
				this.estadonotacreditos=new ArrayList<EstadoNotaCredito>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					estadonotacreditoLogic.getEntity(idEstadoNotaCredito);
					
					//estadonotacreditoLogic.getEntityWithConnection(idEstadoNotaCredito);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonotacreditoLogic.setEstadoNotaCreditos(new ArrayList<EstadoNotaCredito>());
					estadonotacreditoLogic.getEstadoNotaCreditos().add(estadonotacreditoLogic.getEstadoNotaCredito());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadonotacreditos=new ArrayList<EstadoNotaCredito>();
					this.estadonotacreditos.add(estadonotacredito);
				}
				
				if(estadonotacreditoLogic.getEstadoNotaCredito()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEstadoNotaCredito();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEstadoNotaCredito();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadonotacreditoLogic.getEstadoNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonotacreditos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=estadonotacreditoLogic.getEstadoNotaCreditos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=estadonotacreditos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EstadoNotaCredito estadonotacredito) {
		Boolean permite=true;
		
		if(this.estadonotacredito.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EstadoNotaCreditoConstantesFunciones.getOrderByListaEstadoNotaCredito();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EstadoNotaCreditoConstantesFunciones.getOrderByListaEstadoNotaCredito();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNotaCredito estadonotacredito:estadonotacreditoLogic.getEstadoNotaCreditos()) {
				if(estadonotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					estadonotacreditoTotales=estadonotacredito;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNotaCredito estadonotacredito:this.estadonotacreditos) {
				if(estadonotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					estadonotacreditoTotales=estadonotacredito;
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
			this.estadonotacreditoAux=new EstadoNotaCredito();
			this.estadonotacreditoAux.setsType(Constantes2.S_TOTALES);
			this.estadonotacreditoAux.setIsNew(false);
			this.estadonotacreditoAux.setIsChanged(false);
			this.estadonotacreditoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EstadoNotaCreditoConstantesFunciones.TotalizarValoresFilaEstadoNotaCredito(this.estadonotacreditoLogic.getEstadoNotaCreditos(),this.estadonotacreditoAux);
				
				this.estadonotacreditoLogic.getEstadoNotaCreditos().add(this.estadonotacreditoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EstadoNotaCreditoConstantesFunciones.TotalizarValoresFilaEstadoNotaCredito(this.estadonotacreditos,this.estadonotacreditoAux);
				
				this.estadonotacreditos.add(this.estadonotacreditoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		estadonotacreditoTotales=new EstadoNotaCredito();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadonotacreditoLogic.getEstadoNotaCreditos().remove(estadonotacreditoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.estadonotacreditos.remove(estadonotacreditoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		estadonotacreditoTotales=new EstadoNotaCredito();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EstadoNotaCredito estadonotacredito:estadonotacreditoLogic.getEstadoNotaCreditos()) {
				if(estadonotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					estadonotacreditoTotales=estadonotacredito;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoNotaCreditoConstantesFunciones.TotalizarValoresFilaEstadoNotaCredito(this.estadonotacreditoLogic.getEstadoNotaCreditos(),estadonotacreditoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EstadoNotaCredito estadonotacredito:this.estadonotacreditos) {
				if(estadonotacredito.getsType().equals(Constantes2.S_TOTALES)) {
					estadonotacreditoTotales=estadonotacredito;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EstadoNotaCreditoConstantesFunciones.TotalizarValoresFilaEstadoNotaCredito(this.estadonotacreditos,estadonotacreditoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEstadoNotaCreditoPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getEstadoNotaCreditoPorCodigo(String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonotacreditoLogic.getEstadoNotaCreditoPorCodigo(codigo);
				
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
	
	public void inicializarPermisosEstadoNotaCredito() {
		this.isPermisoTodoEstadoNotaCredito=false;
		this.isPermisoNuevoEstadoNotaCredito=false;
		this.isPermisoActualizarEstadoNotaCredito=false;
		this.isPermisoActualizarOriginalEstadoNotaCredito=false;
		this.isPermisoEliminarEstadoNotaCredito=false;
		this.isPermisoGuardarCambiosEstadoNotaCredito=false;
		this.isPermisoConsultaEstadoNotaCredito=false;
		this.isPermisoBusquedaEstadoNotaCredito=false;
		this.isPermisoReporteEstadoNotaCredito=false;		
		this.isPermisoOrdenEstadoNotaCredito=false;		
		this.isPermisoPaginacionMedioEstadoNotaCredito=false;		
		this.isPermisoPaginacionAltoEstadoNotaCredito=false;
		this.isPermisoPaginacionTodoEstadoNotaCredito=false;
		this.isPermisoCopiarEstadoNotaCredito=false;		
		this.isPermisoVerFormEstadoNotaCredito=false;		
		this.isPermisoDuplicarEstadoNotaCredito=false;		
		this.isPermisoOrdenEstadoNotaCredito=false;		
	}
	
	public void setPermisosUsuarioEstadoNotaCredito(Boolean isPermiso) {
		this.isPermisoTodoEstadoNotaCredito=isPermiso;
		this.isPermisoNuevoEstadoNotaCredito=isPermiso;
		this.isPermisoActualizarEstadoNotaCredito=isPermiso;
		this.isPermisoActualizarOriginalEstadoNotaCredito=isPermiso;
		this.isPermisoEliminarEstadoNotaCredito=isPermiso;
		this.isPermisoGuardarCambiosEstadoNotaCredito=isPermiso;
		this.isPermisoConsultaEstadoNotaCredito=isPermiso;
		this.isPermisoBusquedaEstadoNotaCredito=isPermiso;
		this.isPermisoReporteEstadoNotaCredito=isPermiso;
		this.isPermisoOrdenEstadoNotaCredito=isPermiso;		
		this.isPermisoPaginacionMedioEstadoNotaCredito=isPermiso;		
		this.isPermisoPaginacionAltoEstadoNotaCredito=isPermiso;		
		this.isPermisoPaginacionTodoEstadoNotaCredito=isPermiso;		
		this.isPermisoCopiarEstadoNotaCredito=isPermiso;		
		this.isPermisoVerFormEstadoNotaCredito=isPermiso;		
		this.isPermisoDuplicarEstadoNotaCredito=isPermiso;
		this.isPermisoOrdenEstadoNotaCredito=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEstadoNotaCredito(Boolean isPermiso) {
		//this.isPermisoTodoEstadoNotaCredito=isPermiso;
		this.isPermisoNuevoEstadoNotaCredito=isPermiso;
		this.isPermisoActualizarEstadoNotaCredito=isPermiso;
		this.isPermisoActualizarOriginalEstadoNotaCredito=isPermiso;
		this.isPermisoEliminarEstadoNotaCredito=isPermiso;
		this.isPermisoGuardarCambiosEstadoNotaCredito=isPermiso;
		//this.isPermisoConsultaEstadoNotaCredito=isPermiso;
		//this.isPermisoBusquedaEstadoNotaCredito=isPermiso;
		//this.isPermisoReporteEstadoNotaCredito=isPermiso;
		//this.isPermisoOrdenEstadoNotaCredito=isPermiso;		
		//this.isPermisoPaginacionMedioEstadoNotaCredito=isPermiso;		
		//this.isPermisoPaginacionAltoEstadoNotaCredito=isPermiso;		
		//this.isPermisoPaginacionTodoEstadoNotaCredito=isPermiso;		
		//this.isPermisoCopiarEstadoNotaCredito=isPermiso;		
		//this.isPermisoDuplicarEstadoNotaCredito=isPermiso;
		//this.isPermisoOrdenEstadoNotaCredito=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEstadoNotaCreditoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
		if(EstadoNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosNotaCreditoSoli=false;
		this.isTienePermisosNotaCreditoSoli=this.verificarGetPermisosUsuarioOpcionEstadoNotaCreditoClaseRelacionada(this.opcionsRelacionadas,NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosNotaCreditoPuntoVenta=false;
		this.isTienePermisosNotaCreditoPuntoVenta=this.verificarGetPermisosUsuarioOpcionEstadoNotaCreditoClaseRelacionada(this.opcionsRelacionadas,NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebEstadoNotaCredito(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEstadoNotaCreditoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosNotaCreditoSoli=conPermiso;
		this.isTienePermisosNotaCreditoPuntoVenta=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioEstadoNotaCreditoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEstadoNotaCreditoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEstadoNotaCreditoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosNotaCreditoSoli && this.jInternalFrameDetalleFormEstadoNotaCredito!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.remove(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosNotaCreditoPuntoVenta && this.jInternalFrameDetalleFormEstadoNotaCredito!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.remove(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioEstadoNotaCredito() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EstadoNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EstadoNotaCreditoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEstadoNotaCredito=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEstadoNotaCredito=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEstadoNotaCredito=this.isPermisoActualizarEstadoNotaCredito;
			this.isPermisoEliminarEstadoNotaCredito=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEstadoNotaCredito=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEstadoNotaCredito=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEstadoNotaCredito=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEstadoNotaCredito=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEstadoNotaCredito=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoNotaCredito=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEstadoNotaCredito=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEstadoNotaCredito=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEstadoNotaCredito=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEstadoNotaCredito=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEstadoNotaCredito=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEstadoNotaCredito=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEstadoNotaCredito=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEstadoNotaCredito.setToolTipText(this.jTableDatosEstadoNotaCredito.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEstadoNotaCredito(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEstadoNotaCredito(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EstadoNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EstadoNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEstadoNotaCredito() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosNotaCreditoSoli && this.estadonotacreditoConstantesFunciones.mostrarNotaCreditoSoliEstadoNotaCredito && !EstadoNotaCreditoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Solicitud Nota Credito");
			reporte.setsDescripcion("Solicitud Nota Credito");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosNotaCreditoPuntoVenta && this.estadonotacreditoConstantesFunciones.mostrarNotaCreditoPuntoVentaEstadoNotaCredito && !EstadoNotaCreditoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Nota Credito");
			reporte.setsDescripcion("Nota Credito");
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
	
		
	public void inicializarCombosForeignKeyEstadoNotaCreditoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEstadoNotaCreditoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EstadoNotaCreditoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEstadoNotaCreditoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyEstadoNotaCreditoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEstadoNotaCredito()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyEstadoNotaCredito()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEstadoNotaCredito(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEstadoNotaCredito()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNotaCredito();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEstadoNotaCredito(EstadoNotaCredito estadonotacredito)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEstadoNotaCredito(EstadoNotaCredito estadonotacredito,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEstadoNotaCredito()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEstadoNotaCredito()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEstadoNotaCredito()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEstadoNotaCredito()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEstadoNotaCredito()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEstadoNotaCredito()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEstadoNotaCredito(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEstadoNotaCredito()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public EstadoNotaCreditoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EstadoNotaCreditoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EstadoNotaCreditoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean(); 
		this.estadonotacreditoConstantesFunciones=new EstadoNotaCreditoConstantesFunciones(); 
		this.estadonotacreditoBean=new EstadoNotaCredito();//(this.estadonotacreditoConstantesFunciones); 		
		this.estadonotacreditoReturnGeneral=new EstadoNotaCreditoParameterReturnGeneral(); 
		
		this.estadonotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.estadonotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EstadoNotaCreditoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EstadoNotaCreditoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EstadoNotaCreditoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEstadoNotaCredito(true);
			
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
			
			this.estadonotacreditoConstantesFunciones=new EstadoNotaCreditoConstantesFunciones(); 
			this.estadonotacreditoBean=new EstadoNotaCredito();//this.estadonotacreditoConstantesFunciones); 			
			this.estadonotacreditoReturnGeneral=new EstadoNotaCreditoParameterReturnGeneral(); 
		
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Estado Nota Credito Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.estadonotacredito=new EstadoNotaCredito();
			this.estadonotacreditos = new ArrayList<EstadoNotaCredito>();
			this.estadonotacreditosAux = new ArrayList<EstadoNotaCredito>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic=new EstadoNotaCreditoLogic();
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			//this.estadonotacreditoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.estadonotacreditoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEstadoNotaCredito);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoNotaCredito);	
					}
					
					if(this.jInternalFrameImportacionEstadoNotaCredito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoNotaCredito);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEstadoNotaCredito!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEstadoNotaCredito);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoNotaCredito);
				this.jInternalFrameDetalleFormEstadoNotaCredito.setVisible(false);
				this.jInternalFrameDetalleFormEstadoNotaCredito.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoNotaCredito);
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.setVisible(false);
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEstadoNotaCredito!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEstadoNotaCredito);
					this.jInternalFrameImportacionEstadoNotaCredito.setVisible(false);
					this.jInternalFrameImportacionEstadoNotaCredito.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEstadoNotaCredito!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEstadoNotaCredito);
					this.jInternalFrameOrderByEstadoNotaCredito.setVisible(false);
					this.jInternalFrameOrderByEstadoNotaCredito.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEstadoNotaCreditoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EstadoNotaCreditoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.estadonotacreditoReturnGeneral=new EstadoNotaCreditoParameterReturnGeneral();
			
			this.estadonotacreditoParameterGeneral=new EstadoNotaCreditoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.estadonotacreditoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EstadoNotaCreditoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(NotaCreditoSoliConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(NotaCreditoPuntoVentaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoNotaCreditoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadonotacreditoSessionBean.getEsGuardarRelacionado(),this.estadonotacreditoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EstadoNotaCreditoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.estadonotacreditoSessionBean.getEsGuardarRelacionado(),this.estadonotacreditoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaDuplicarEstadoNotaCredito=true;
			this.isVisibilidadCeldaCopiarEstadoNotaCredito=true;
			this.isVisibilidadCeldaVerFormEstadoNotaCredito=true;
			this.isVisibilidadCeldaOrdenEstadoNotaCredito=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
			this.isVisibilidadCeldaModificarEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=false;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEstadoNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEstadoNotaCredito();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEstadoNotaCredito(false);
			
			this.setPermisosUsuarioEstadoNotaCredito();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado() 
				|| (this.estadonotacreditoSessionBean.getEsGuardarRelacionado() && this.estadonotacreditoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEstadoNotaCreditoClasesRelacionadas();
			}
			
			if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEstadoNotaCreditoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEstadoNotaCredito();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEstadoNotaCredito();
			}
			
			if(!this.isPermisoBusquedaEstadoNotaCredito) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEstadoNotaCredito,this.isPermisoPaginacionMedioEstadoNotaCredito,this.isPermisoPaginacionTodoEstadoNotaCredito);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EstadoNotaCreditoConstantesFunciones.getTiposSeleccionarEstadoNotaCredito());
				
				this.tiposColumnasSelect=EstadoNotaCreditoConstantesFunciones.getTiposSeleccionarEstadoNotaCredito(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectEstadoNotaCredito();				
				//this.tiposRelacionesSelect=EstadoNotaCreditoConstantesFunciones.getTiposRelacionesEstadoNotaCredito(true);
				
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
			//if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEstadoNotaCredito();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioEstadoNotaCredito(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioEstadoNotaCredito(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNotaCredito() ;
			
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
			
			
			this.notacreditosoliSoliLogic=new NotaCreditoSoliLogic();
			this.notacreditopuntoventaPuntoVentaLogic=new NotaCreditoPuntoVentaLogic(); 
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
				estadonotacreditoImplementable= (EstadoNotaCreditoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoNotaCreditoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				estadonotacreditoImplementableHome= (EstadoNotaCreditoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EstadoNotaCreditoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.estadonotacreditos= new ArrayList<EstadoNotaCredito>();
			this.estadonotacreditosEliminados= new ArrayList<EstadoNotaCredito>();
						
			this.isEsNuevoEstadoNotaCredito=false;
			this.esParaAccionDesdeFormularioEstadoNotaCredito=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEstadoNotaCredito(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEstadoNotaCredito();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EstadoNotaCreditoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEstadoNotaCredito("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEstadoNotaCredito(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEstadoNotaCredito();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEstadoNotaCredito();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEstadoNotaCredito(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EstadoNotaCredito: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEstadoNotaCredito() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEstadoNotaCredito")) {
				iIndex=this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();	
				
				

				if(sTitle.equals("Nota Creditos")) {
					if(!NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoNotaCredito();

						this.cargarParteTabPanelRelacionadaNotaCreditoPuntoVenta(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Solicitud Nota Creditos")) {
					if(!NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessEstadoNotaCredito();

						this.cargarParteTabPanelRelacionadaNotaCreditoSoli(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEstadoNotaCredito();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaNotaCreditoPuntoVenta(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoNotaCredito.cargarSessionConBeanSwingJInternalFrameNotaCreditoPuntoVenta(false,true,iIndex);
		this.jButtonNotaCreditoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta();

		//this.jTabbedPaneRelacionesEstadoNotaCredito.updateUI();
		//this.jTabbedPaneRelacionesEstadoNotaCredito.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoNotaCredito.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaNotaCreditoSoli(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormEstadoNotaCredito.cargarSessionConBeanSwingJInternalFrameNotaCreditoSoli(false,true,iIndex);
		this.jButtonNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaNotaCreditoSoli();

		//this.jTabbedPaneRelacionesEstadoNotaCredito.updateUI();
		//this.jTabbedPaneRelacionesEstadoNotaCredito.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesEstadoNotaCredito.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("NotaCreditoSoli")) {
				int row=this.jTableDatosEstadoNotaCredito.getSelectedRow();
				jButtonNotaCreditoSoliActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("NotaCreditoPuntoVenta")) {
				int row=this.jTableDatosEstadoNotaCredito.getSelectedRow();
				jButtonNotaCreditoPuntoVentaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Solicitud Nota Credito")) {

					if(this.isTienePermisosNotaCreditoSoli && this.estadonotacreditoConstantesFunciones.mostrarNotaCreditoSoliEstadoNotaCredito && !EstadoNotaCreditoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Solicitud Nota Creditos"+"("+NotaCreditoSoliConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Solicitud Nota Creditos");

						if(estadonotacreditoConstantesFunciones.resaltarNotaCreditoSoliEstadoNotaCredito!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadonotacreditoConstantesFunciones.resaltarNotaCreditoSoliEstadoNotaCredito);
						}

						jmenuItem.setEnabled(this.estadonotacreditoConstantesFunciones.activarNotaCreditoSoliEstadoNotaCredito);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NotaCreditoSoli"));

						

						this.jInternalFrameDetalleFormEstadoNotaCredito.jmenuDetalleEstadoNotaCredito.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Nota Credito")) {

					if(this.isTienePermisosNotaCreditoPuntoVenta && this.estadonotacreditoConstantesFunciones.mostrarNotaCreditoPuntoVentaEstadoNotaCredito && !EstadoNotaCreditoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Nota Creditos"+"("+NotaCreditoPuntoVentaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Nota Creditos");

						if(estadonotacreditoConstantesFunciones.resaltarNotaCreditoPuntoVentaEstadoNotaCredito!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(estadonotacreditoConstantesFunciones.resaltarNotaCreditoPuntoVentaEstadoNotaCredito);
						}

						jmenuItem.setEnabled(this.estadonotacreditoConstantesFunciones.activarNotaCreditoPuntoVentaEstadoNotaCredito);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"NotaCreditoPuntoVenta"));

						

						this.jInternalFrameDetalleFormEstadoNotaCredito.jmenuDetalleEstadoNotaCredito.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyEstadoNotaCredito(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEstadoNotaCredito(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEstadoNotaCredito(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEstadoNotaCreditoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEstadoNotaCredito();
		
		this.cargarCombosFrameForeignKeyEstadoNotaCredito();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEstadoNotaCredito();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEstadoNotaCredito();
		}
	}
	
	
	
	public void jButtonNuevoEstadoNotaCreditoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			
			if(jTableDatosEstadoNotaCredito.getRowCount()>=1) {
				jTableDatosEstadoNotaCredito.removeRowSelectionInterval(0, jTableDatosEstadoNotaCredito.getRowCount()-1);						
			}
			
			this.isEsNuevoEstadoNotaCredito=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEstadoNotaCredito(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEstadoNotaCredito(true);			
			//this.estadonotacredito=new EstadoNotaCredito();
			//this.estadonotacredito.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNotaCredito(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito() ;
			
			if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNotaCredito(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.estadonotacredito);	
			this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);				
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EstadoNotaCredito: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEstadoNotaCreditoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEstadoNotaCredito.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEstadoNotaCredito.getSelectedRows().length;			
			}
			
			estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEstadoNotaCredito--;			
				//EstadoNotaCredito estadonotacreditoAux= new EstadoNotaCredito();			
				//estadonotacreditoAux.setId(this.iIdNuevoEstadoNotaCredito);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EstadoNotaCredito estadonotacreditoOrigen=new EstadoNotaCredito();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EstadoNotaCredito estadonotacreditoOrigen : estadonotacreditosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							estadonotacreditoOrigen =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							estadonotacreditoOrigen =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEstadoNotaCredito();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.estadonotacredito.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEstadoNotaCredito(estadonotacreditoOrigen,this.estadonotacredito,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadonotacreditoLogic.getEstadoNotaCreditos().add(this.estadonotacreditoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadonotacreditos.add(this.estadonotacreditoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
				
				this.jTableDatosEstadoNotaCredito.setRowSelectionInterval(this.getIndiceNuevoEstadoNotaCredito(), this.getIndiceNuevoEstadoNotaCredito());
				
				int iLastRow =  this.jTableDatosEstadoNotaCredito.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoNotaCredito.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoNotaCredito.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();									
		
			EstadoNotaCredito estadonotacreditoOrigen=new EstadoNotaCredito();
			EstadoNotaCredito estadonotacreditoDestino=new EstadoNotaCredito();
				
			estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEstadoNotaCredito.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || estadonotacreditosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEstadoNotaCredito.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonotacreditoOrigen =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadonotacreditoOrigen =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						estadonotacreditoDestino =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						estadonotacreditoDestino =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				estadonotacreditoOrigen =estadonotacreditosSeleccionados.get(0);
				estadonotacreditoDestino =estadonotacreditosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEstadoNotaCredito(estadonotacreditoOrigen,estadonotacreditoDestino,true,false);
				
				estadonotacreditoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(estadonotacreditoDestino,estadonotacreditoLogic.getEstadoNotaCreditos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(estadonotacreditoDestino,estadonotacreditos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
				
				//this.jTableDatosEstadoNotaCredito.setRowSelectionInterval(this.getIndiceNuevoEstadoNotaCredito(), this.getIndiceNuevoEstadoNotaCredito());
				
				int iLastRow =  this.jTableDatosEstadoNotaCredito.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEstadoNotaCredito.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEstadoNotaCredito.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEstadoNotaCredito.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEstadoNotaCredito.isVisible();
			
			
			this.jPanelParametrosReportesEstadoNotaCredito.setVisible(!isVisible);
			this.jPanelPaginacionEstadoNotaCredito.setVisible(!isVisible);
			this.jPanelAccionesEstadoNotaCredito.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEstadoNotaCredito();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEstadoNotaCredito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEstadoNotaCredito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEstadoNotaCredito();
			
			this.abrirFrameOrderByEstadoNotaCredito();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEstadoNotaCredito();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEstadoNotaCredito(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoNotaCredito);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEstadoNotaCredito.isMaximum()) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEstadoNotaCredito.setSize(this.jInternalFrameDetalleFormEstadoNotaCredito.iWidthFormulario,this.jInternalFrameDetalleFormEstadoNotaCredito.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEstadoNotaCredito.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEstadoNotaCredito.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEstadoNotaCredito.isMaximum()) {
						this.jInternalFrameDetalleFormEstadoNotaCredito.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEstadoNotaCredito.jContentPaneDetalleEstadoNotaCredito.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEstadoNotaCredito.jContentPaneDetalleEstadoNotaCredito.getWidth(),EstadoNotaCreditoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEstadoNotaCredito.jContentPaneDetalleEstadoNotaCredito.getWidth(),EstadoNotaCreditoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEstadoNotaCredito.jContentPaneDetalleEstadoNotaCredito.getWidth(),EstadoNotaCreditoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta();
					}

					if(NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaNotaCreditoSoli();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEstadoNotaCredito.setVisible(true);
	        this.jInternalFrameDetalleFormEstadoNotaCredito.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEstadoNotaCredito() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEstadoNotaCredito==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEstadoNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNotaCredito,false,this);
				} else {
					this.jInternalFrameOrderByEstadoNotaCredito=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEstadoNotaCredito,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEstadoNotaCredito);
				this.jInternalFrameOrderByEstadoNotaCredito.setVisible(false);
				this.jInternalFrameOrderByEstadoNotaCredito.setSelected(false);
				
				this.jInternalFrameOrderByEstadoNotaCredito.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoNotaCredito"));
				
				this.inicializarActualizarBindingTablaOrderByEstadoNotaCredito();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEstadoNotaCredito() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEstadoNotaCredito==null) {
				
				this.jInternalFrameImportacionEstadoNotaCredito=new ImportacionJInternalFrame(EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEstadoNotaCredito);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEstadoNotaCredito);
				this.jInternalFrameImportacionEstadoNotaCredito.setVisible(false);
				this.jInternalFrameImportacionEstadoNotaCredito.setSelected(false);


				this.jInternalFrameImportacionEstadoNotaCredito.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoNotaCredito"));
				this.jInternalFrameImportacionEstadoNotaCredito.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoNotaCredito"));
				this.jInternalFrameImportacionEstadoNotaCredito.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoNotaCredito"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEstadoNotaCredito() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEstadoNotaCredito==null) {
				this.jInternalFrameReporteDinamicoEstadoNotaCredito=new ReporteDinamicoJInternalFrame(EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEstadoNotaCredito);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEstadoNotaCredito);
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.setVisible(false);
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNotaCredito"));
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNotaCredito"));
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNotaCredito"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNotaCredito();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaNotaCreditoPuntoVenta() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoNotaCredito.jContentPaneDetalleEstadoNotaCredito.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaNotaCreditoSoli() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormEstadoNotaCredito.jContentPaneDetalleEstadoNotaCredito.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleEstadoNotaCredito() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEstadoNotaCredito);
			
	       	this.jInternalFrameDetalleFormEstadoNotaCredito.setVisible(false);
	        this.jInternalFrameDetalleFormEstadoNotaCredito.setSelected(false);
			
			//this.jInternalFrameDetalleFormEstadoNotaCredito.dispose();
			//this.jInternalFrameDetalleFormEstadoNotaCredito=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEstadoNotaCredito() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEstadoNotaCredito.setVisible(true);
	        this.jInternalFrameReporteDinamicoEstadoNotaCredito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEstadoNotaCredito() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEstadoNotaCredito.setVisible(true);
	        this.jInternalFrameImportacionEstadoNotaCredito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEstadoNotaCredito() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEstadoNotaCredito.setVisible(true);
	        this.jInternalFrameOrderByEstadoNotaCredito.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEstadoNotaCredito() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEstadoNotaCredito.setVisible(false);
	        this.jInternalFrameOrderByEstadoNotaCredito.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEstadoNotaCredito() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEstadoNotaCredito.setVisible(false);
	        this.jInternalFrameReporteDinamicoEstadoNotaCredito.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEstadoNotaCredito() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEstadoNotaCredito.setVisible(false);
	        this.jInternalFrameImportacionEstadoNotaCredito.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEstadoNotaCredito(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEstadoNotaCredito(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEstadoNotaCredito(true);
			//this.isEsNuevoEstadoNotaCredito=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEstadoNotaCredito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNotaCredito(false) ;
			
			if(estadonotacreditoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado() && NotaCreditoSoliJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoSoliActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado() && NotaCreditoPuntoVentaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonNotaCreditoPuntoVentaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNotaCredito(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEstadoNotaCreditoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEstadoNotaCredito(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEstadoNotaCredito(true);
			//this.isEsNuevoEstadoNotaCredito=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.estadonotacredito.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEstadoNotaCredito("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEstadoNotaCredito(false) ;
			
			if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEstadoNotaCredito(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEstadoNotaCredito(false);
			
			//if(!this.isEsNuevoEstadoNotaCredito) {								
				int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
				
			}
			
			if(this.permiteMantenimiento(this.estadonotacredito)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEstadoNotaCredito=true;
					this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
					this.isEsNuevoEstadoNotaCredito=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEstadoNotaCredito=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEstadoNotaCredito=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoNotaCredito(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(false);
				
				this.habilitarDeshabilitarControlesEstadoNotaCredito(false);
			
												
				
				if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEstadoNotaCredito();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEstadoNotaCreditoActionPerformed(evt,estadonotacreditoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEstadoNotaCredito(this.estadonotacredito,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEstadoNotaCredito.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,estadonotacreditoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.estadonotacredito.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				this.estadonotacredito.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				this.estadonotacredito.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.estadonotacredito)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EstadoNotaCreditoModel) this.jTableDatosEstadoNotaCredito.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEstadoNotaCredito=true;
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
				this.isEsNuevoEstadoNotaCredito=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEstadoNotaCredito(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(false);
				
				this.habilitarDeshabilitarControlesEstadoNotaCredito(false);
				
				
				
				if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEstadoNotaCredito();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEstadoNotaCredito.getRowCount()>=1) {
				jTableDatosEstadoNotaCredito.removeRowSelectionInterval(0, jTableDatosEstadoNotaCredito.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEstadoNotaCredito(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEstadoNotaCredito(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(false) ;
			
			this.isEsNuevoEstadoNotaCredito=false;
			
			if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEstadoNotaCredito();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEstadoNotaCredito(false);
				
				//SI ES MANUAL
				if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEstadoNotaCredito();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEstadoNotaCredito--;			
			//EstadoNotaCredito estadonotacreditoAux= new EstadoNotaCredito();			
			//estadonotacreditoAux.setId(this.iIdNuevoEstadoNotaCredito);
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEstadoNotaCredito();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
			
			this.estadonotacredito.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.estadonotacreditoLogic.getEstadoNotaCreditos().add(this.estadonotacreditoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.estadonotacreditos.add(this.estadonotacreditoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			
			this.jTableDatosEstadoNotaCredito.setRowSelectionInterval(this.getIndiceNuevoEstadoNotaCredito(), this.getIndiceNuevoEstadoNotaCredito());
			
			int iLastRow =  this.jTableDatosEstadoNotaCredito.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEstadoNotaCredito.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEstadoNotaCredito.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEstadoNotaCredito(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNotaCredito(false);
			
			//SI ES MANUAL
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNotaCredito();
			}
			
			//this.abrirFrameTreeEstadoNotaCredito();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Estado Nota CreditoS ?", "MANTENIMIENTO DE Estado Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEstadoNotaCredito.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEstadoNotaCredito();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.estadonotacreditoReturnGeneral=estadonotacreditoLogic.procesarImportacionEstadoNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.estadonotacreditoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEstadoNotaCreditoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEstadoNotaCredito.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEstadoNotaCredito.setFileImportacion(this.jInternalFrameImportacionEstadoNotaCredito.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEstadoNotaCredito.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEstadoNotaCredito.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEstadoNotaCredito.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEstadoNotaCredito.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		

		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EstadoNotaCreditoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EstadoNotaCreditoBaseDesign.jrxml";
			
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
			
			this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EstadoNotaCreditos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(EstadoNotaCredito estadonotacredito:estadonotacreditosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadonotacredito.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(EstadoNotaCredito estadonotacredito:estadonotacreditosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(estadonotacredito.getnombre());
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
			//	this.getFilaCabeceraExportarExcelEstadoNotaCredito(row);				
			//	iRow++;
			//}				
			
			//for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEstadoNotaCredito(estadonotacreditoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
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
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNotaCredito(false);
			
			//SI ES MANUAL
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEstadoNotaCredito();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNotaCredito(false);
			
			//SI ES MANUAL
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoNotaCredito();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEstadoNotaCreditoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEstadoNotaCredito(false);
			
			//SI ES MANUAL
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEstadoNotaCredito();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.estadonotacreditoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEstadoNotaCredito() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEstadoNotaCredito.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEstadoNotaCredito.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEstadoNotaCredito.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEstadoNotaCredito.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEstadoNotaCredito.setMinimumSize(dimensionMinimum);
		this.jTableDatosEstadoNotaCredito.setMaximumSize(dimensionMaximum);
		this.jTableDatosEstadoNotaCredito.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEstadoNotaCredito(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEstadoNotaCredito(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEstadoNotaCredito(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEstadoNotaCredito(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEstadoNotaCredito(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEstadoNotaCredito(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNotaCredito(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEstadoNotaCredito(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEstadoNotaCredito() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEstadoNotaCredito();
		
		this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoNotaCredito();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNotaCredito() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNotaCredito(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNotaCredito(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEstadoNotaCredito.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEstadoNotaCredito.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEstadoNotaCredito.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEstadoNotaCredito.jCheckBoxPostAccionNuevoEstadoNotaCredito.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEstadoNotaCredito.jCheckBoxPostAccionSinCerrarEstadoNotaCredito.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEstadoNotaCredito.jCheckBoxPostAccionSinMensajeEstadoNotaCredito.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEstadoNotaCredito.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEstadoNotaCredito.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEstadoNotaCredito.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.jCheckBoxPostAccionNuevoEstadoNotaCredito.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEstadoNotaCredito.jCheckBoxPostAccionSinCerrarEstadoNotaCredito.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEstadoNotaCredito.jCheckBoxPostAccionSinMensajeEstadoNotaCredito.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEstadoNotaCredito.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEstadoNotaCredito.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEstadoNotaCredito.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEstadoNotaCredito.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEstadoNotaCredito.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEstadoNotaCredito.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEstadoNotaCredito.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEstadoNotaCredito.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEstadoNotaCredito.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEstadoNotaCredito(Boolean esInicializar) throws Exception {
		try	{	
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEstadoNotaCredito(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEstadoNotaCredito() throws Exception {
		try	{
			if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoNotaCredito();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoNotaCredito() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEstadoNotaCredito() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEstadoNotaCredito.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEstadoNotaCredito.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEstadoNotaCredito.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEstadoNotaCredito.addItem(reporte);
			}
			
			
			if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEstadoNotaCredito.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEstadoNotaCredito.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEstadoNotaCredito.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEstadoNotaCredito.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEstadoNotaCredito.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEstadoNotaCredito.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEstadoNotaCredito.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNotaCredito();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEstadoNotaCredito() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
				
				if(this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEstadoNotaCredito()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEstadoNotaCredito(Boolean esInicializar) throws Exception {				
		if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEstadoNotaCredito();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEstadoNotaCredito() throws Exception {
		this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEstadoNotaCredito() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEstadoNotaCreditoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCreditoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEstadoNotaCredito(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=estadonotacreditoLogic.getEstadoNotaCreditos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=estadonotacreditos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEstadoNotaCredito.setModel(new EstadoNotaCreditoModel(this.estadonotacreditoLogic.getEstadoNotaCreditos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEstadoNotaCredito.setModel(new EstadoNotaCreditoModel(this.estadonotacreditos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEstadoNotaCredito!=null && this.jInternalFrameOrderByEstadoNotaCredito.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEstadoNotaCredito();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCredito,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO,estadonotacreditoConstantesFunciones.resaltarSeleccionarEstadoNotaCredito,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EstadoNotaCreditoConstantesFunciones.SCLASSWEBTITULO,estadonotacreditoConstantesFunciones.resaltarSeleccionarEstadoNotaCredito,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCredito,EstadoNotaCreditoConstantesFunciones.LABEL_ID));

		if(this.estadonotacreditoConstantesFunciones.mostraridEstadoNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNotaCreditoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.estadonotacreditoConstantesFunciones.resaltaridEstadoNotaCredito,this.estadonotacreditoConstantesFunciones.activaridEstadoNotaCredito,this,true,"idEstadoNotaCredito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonotacreditoConstantesFunciones.resaltaridEstadoNotaCredito,this.estadonotacreditoConstantesFunciones.activaridEstadoNotaCredito,this,true,"idEstadoNotaCredito","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCredito,EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO));

		if(this.estadonotacreditoConstantesFunciones.mostrarcodigoEstadoNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadonotacreditoConstantesFunciones.resaltarcodigoEstadoNotaCredito,this.estadonotacreditoConstantesFunciones.activarcodigoEstadoNotaCredito,this,true,"codigoEstadoNotaCredito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonotacreditoConstantesFunciones.resaltarcodigoEstadoNotaCredito,this.estadonotacreditoConstantesFunciones.activarcodigoEstadoNotaCredito,this,true,"codigoEstadoNotaCredito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCredito,EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE));

		if(this.estadonotacreditoConstantesFunciones.mostrarnombreEstadoNotaCredito && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.estadonotacreditoConstantesFunciones.resaltarnombreEstadoNotaCredito,this.estadonotacreditoConstantesFunciones.activarnombreEstadoNotaCredito,this,true,"nombreEstadoNotaCredito","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.estadonotacreditoConstantesFunciones.resaltarnombreEstadoNotaCredito,this.estadonotacreditoConstantesFunciones.activarnombreEstadoNotaCredito,this,true,"nombreEstadoNotaCredito","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EstadoNotaCreditoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosNotaCreditoSoli && this.estadonotacreditoConstantesFunciones.mostrarNotaCreditoSoliEstadoNotaCredito && !EstadoNotaCreditoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Solicitud Nota Creditos");
				tableColumn.setHeaderValue("Solicitud Nota Creditos");
				tableColumn.setCellRenderer(new NotaCreditoSoliTableCell(estadonotacreditoConstantesFunciones.resaltarNotaCreditoSoliEstadoNotaCredito,this,this.estadonotacreditoConstantesFunciones.activarNotaCreditoSoliEstadoNotaCredito));
				tableColumn.setCellEditor(new NotaCreditoSoliTableCell(estadonotacreditoConstantesFunciones.resaltarNotaCreditoSoliEstadoNotaCredito,this,this.estadonotacreditoConstantesFunciones.activarNotaCreditoSoliEstadoNotaCredito));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);
			}

			if(this.isTienePermisosNotaCreditoPuntoVenta && this.estadonotacreditoConstantesFunciones.mostrarNotaCreditoPuntoVentaEstadoNotaCredito && !EstadoNotaCreditoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Nota Creditos");
				tableColumn.setHeaderValue("Nota Creditos");
				tableColumn.setCellRenderer(new NotaCreditoPuntoVentaTableCell(estadonotacreditoConstantesFunciones.resaltarNotaCreditoPuntoVentaEstadoNotaCredito,this,this.estadonotacreditoConstantesFunciones.activarNotaCreditoPuntoVentaEstadoNotaCredito));
				tableColumn.setCellEditor(new NotaCreditoPuntoVentaTableCell(estadonotacreditoConstantesFunciones.resaltarNotaCreditoPuntoVentaEstadoNotaCredito,this,this.estadonotacreditoConstantesFunciones.activarNotaCreditoPuntoVentaEstadoNotaCredito));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadonotacreditoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadonotacreditoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.estadonotacreditoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.estadonotacreditoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.estadonotacreditoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.estadonotacreditoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);
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
			
			this.jTableDatosEstadoNotaCredito.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEstadoNotaCredito.moveColumn(this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEstadoNotaCredito.moveColumn(this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosEstadoNotaCredito.moveColumn(this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEstadoNotaCredito.moveColumn(this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEstadoNotaCredito.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEstadoNotaCredito.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEstadoNotaCredito,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEstadoNotaCredito.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEstadoNotaCredito.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEstadoNotaCredito.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEstadoNotaCredito.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=estadonotacreditoLogic.getEstadoNotaCreditos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=estadonotacreditos.size()-1;
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
		//this.jTableDatosEstadoNotaCredito.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEstadoNotaCredito.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEstadoNotaCredito();
			
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
				
				//this.isEsNuevoEstadoNotaCredito=false;
					
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
				if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoNotaCredito.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoNotaCredito.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.estadonotacredito.getsType().equals("DUPLICADO")
				   || this.estadonotacredito.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEstadoNotaCredito=true;
				
				} else {
					this.isEsNuevoEstadoNotaCredito=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
					if(this.estadonotacredito.getId()>=0 && !this.estadonotacredito.getIsNew()) {						
						this.isEsNuevoEstadoNotaCredito=false;
						
					} else {
						this.isEsNuevoEstadoNotaCredito=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEstadoNotaCredito(esRelaciones);						
				
				this.seleccionarEstadoNotaCredito(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.estadonotacredito.getId()<0) {
					this.isEsNuevoEstadoNotaCredito=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEstadoNotaCredito(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEstadoNotaCredito(evt,rowIndex);
				}	
				
				if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EstadoNotaCredito: " + this.dDif); 
					}
				}								
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEstadoNotaCredito(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.estadonotacredito)) {
					if(this.estadonotacredito.getId()>0) {
						this.estadonotacredito.setIsDeleted(true);
						
						this.estadonotacreditosEliminados.add(this.estadonotacredito);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.estadonotacreditoLogic.getEstadoNotaCreditos().remove(this.estadonotacredito);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.estadonotacreditos.remove(this.estadonotacredito);				
					}
					
					
					((EstadoNotaCreditoModel) this.jTableDatosEstadoNotaCredito.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEstadoNotaCredito(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEstadoNotaCredito(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEstadoNotaCredito) {
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEstadoNotaCredito.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEstadoNotaCredito.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacredito);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEstadoNotaCredito("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEstadoNotaCredito(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEstadoNotaCredito() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoNotaCredito(EstadoNotaCredito estadonotacredito) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEstadoNotaCredito(estadonotacredito,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEstadoNotaCredito(EstadoNotaCredito estadonotacredito,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEstadoNotaCredito(estadonotacredito);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEstadoNotaCredito(estadonotacredito,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEstadoNotaCredito(estadonotacredito);
	}
	
	public void setVariablesObjetoActualToFormularioEstadoNotaCredito(EstadoNotaCredito estadonotacredito) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setText(estadonotacredito.getId().toString());
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setText(estadonotacredito.getcodigo());
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setText(estadonotacredito.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EstadoNotaCredito estadonotacreditoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,estadonotacreditoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EstadoNotaCredito estadonotacreditoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				estadonotacreditoLocal=this.estadonotacredito;
			} else {
				estadonotacreditoLocal=this.estadonotacreditoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(estadonotacreditoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEstadoNotaCredito(estadonotacreditoLocal,true);
					
					if(estadonotacreditoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(estadonotacreditoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(estadonotacreditoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEstadoNotaCredito(EstadoNotaCredito estadonotacredito,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoNotaCredito(estadonotacredito,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(estadonotacredito);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoNotaCredito(EstadoNotaCredito estadonotacredito,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEstadoNotaCredito(estadonotacredito,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEstadoNotaCredito(EstadoNotaCredito estadonotacredito,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.getText()==null || this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.getText()=="" || this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.getText()=="Id") {
				this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setText("0");
			}

			if(conColumnasBase) {estadonotacredito.setId(Long.parseLong(this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNotaCreditoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelIdEstadoNotaCredito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadonotacredito.setcodigo(this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelcodigoEstadoNotaCredito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			estadonotacredito.setnombre(this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEstadoNotaCredito.jLabelnombreEstadoNotaCredito,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEstadoNotaCredito(EstadoNotaCredito estadonotacreditoBean,EstadoNotaCredito estadonotacredito,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEstadoNotaCredito(EstadoNotaCredito estadonotacreditoOrigen,EstadoNotaCredito estadonotacredito,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadonotacreditoOrigen.getId()!=null && !estadonotacreditoOrigen.getId().equals(0L))) {estadonotacredito.setId(estadonotacreditoOrigen.getId());}}
			if(conDefault || (!conDefault && estadonotacreditoOrigen.getcodigo()!=null && !estadonotacreditoOrigen.getcodigo().equals(""))) {estadonotacredito.setcodigo(estadonotacreditoOrigen.getcodigo());}
			if(conDefault || (!conDefault && estadonotacreditoOrigen.getnombre()!=null && !estadonotacreditoOrigen.getnombre().equals(""))) {estadonotacredito.setnombre(estadonotacreditoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoNotaCredito(EstadoNotaCredito estadonotacredito) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setText(estadonotacredito.getId().toString());
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setText(estadonotacredito.getcodigo());
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setText(estadonotacredito.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEstadoNotaCredito(EstadoNotaCreditoBean estadonotacreditoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setText(estadonotacreditoBean.getId().toString());
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setText(estadonotacreditoBean.getcodigo());
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setText(estadonotacreditoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEstadoNotaCredito(EstadoNotaCreditoParameterReturnGeneral estadonotacreditoReturnGeneral,EstadoNotaCreditoBean estadonotacreditoBean,Boolean conDefault) throws Exception { 
		try {
			EstadoNotaCredito estadonotacreditoLocal=new EstadoNotaCredito();
			
			estadonotacreditoLocal=estadonotacreditoReturnGeneral.getEstadoNotaCredito();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && estadonotacreditoLocal.getId()!=null && !estadonotacreditoLocal.getId().equals(0L))) {estadonotacreditoBean.setId(estadonotacreditoLocal.getId());}}
			if(conDefault || (!conDefault && estadonotacreditoLocal.getcodigo()!=null && !estadonotacreditoLocal.getcodigo().equals(""))) {estadonotacreditoBean.setcodigo(estadonotacreditoLocal.getcodigo());}
			if(conDefault || (!conDefault && estadonotacreditoLocal.getnombre()!=null && !estadonotacreditoLocal.getnombre().equals(""))) {estadonotacreditoBean.setnombre(estadonotacreditoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEstadoNotaCreditoGenerico(Long idEstadoNotaCreditoSeleccionado,JComboBox jComboBoxEstadoNotaCredito,List<EstadoNotaCredito> estadonotacreditosLocal)throws Exception {
		try {
			EstadoNotaCredito  estadonotacreditoTemp=null;

			for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosLocal) {
				if(estadonotacreditoAux.getId()!=null && estadonotacreditoAux.getId().equals(idEstadoNotaCreditoSeleccionado)) {
					estadonotacreditoTemp=estadonotacreditoAux;
					break;
				}
			}

			jComboBoxEstadoNotaCredito.setSelectedItem(estadonotacreditoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEstadoNotaCreditoGenerico(JComboBox jComboBoxEstadoNotaCredito,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEstadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEstadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEstadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoNotaCredito.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEstadoNotaCredito.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEstadoNotaCredito.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEstadoNotaCredito.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEstadoNotaCredito.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEstadoNotaCredito.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("NotaCreditoSoli")) {
			jButtonNotaCreditoSoliActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("NotaCreditoPuntoVenta")) {
			jButtonNotaCreditoPuntoVentaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonotacredito=(EstadoNotaCredito) estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadonotacredito =(EstadoNotaCredito) estadonotacreditos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EstadoNotaCredito estadonotacreditoRow=new EstadoNotaCredito();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonotacreditoRow=(EstadoNotaCredito) estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			estadonotacreditoRow=(EstadoNotaCredito) estadonotacreditos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonNotaCreditoSoliActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoNotaCredito estadonotacredito) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacredito = (EstadoNotaCredito)this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadonotacredito = (EstadoNotaCredito)this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadonotacredito!=null) {
						this.estadonotacredito = estadonotacredito;
					} else {
						this.estadonotacredito = new EstadoNotaCredito();
					}
				}

				if(this.isTienePermisosNotaCreditoSoli && this.permiteMantenimiento(this.estadonotacredito)) {
					NotaCreditoSoliBeanSwingJInternalFrame notacreditosoliBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup=new NotaCreditoSoliBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						notacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup;
					} else {
						notacreditosoliBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame;
					}

					List<EstadoNotaCredito> estadonotacreditos=new ArrayList<EstadoNotaCredito>();
					estadonotacreditos.add(this.estadonotacredito);
					if(!esRelacionado) {
						//notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setConGuardarRelaciones(false);
						//notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					notacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoNotaCredito.cargarNotaCreditoSoliBeanSwingJInternalFrame(estadonotacreditos,this.estadonotacredito,notacreditosoliBeanSwingJInternalFrame,/*conInicializar,*/notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getConGuardarRelaciones(),notacreditosoliBeanSwingJInternalFrame.notacreditosoliSessionBean.getEsGuardarRelacionado());
					notacreditosoliBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						notacreditosoliBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoSoli("no_relacionado");

						notacreditosoliBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA + (NotaCreditoSoliConstantesFunciones.ITAMANIOFILATABLA/2));

						notacreditosoliBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoNotaCredito=(TitledBorder)this.jScrollPanelDatosEstadoNotaCredito.getBorder();
						TitledBorder titledBorderNotaCreditoSoli=(TitledBorder)notacreditosoliBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoSoli.getBorder();

						titledBorderNotaCreditoSoli.setTitle(titledBorderEstadoNotaCredito.getTitle() + " -> Solicitud Nota Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,notacreditosoliBeanSwingJInternalFrame);
						}

						notacreditosoliBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(notacreditosoliBeanSwingJInternalFrame);

						notacreditosoliBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Solicitud Nota Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonNotaCreditoPuntoVentaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,EstadoNotaCredito estadonotacredito) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacredito = (EstadoNotaCredito)this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.estadonotacredito = (EstadoNotaCredito)this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(estadonotacredito!=null) {
						this.estadonotacredito = estadonotacredito;
					} else {
						this.estadonotacredito = new EstadoNotaCredito();
					}
				}

				if(this.isTienePermisosNotaCreditoPuntoVenta && this.permiteMantenimiento(this.estadonotacredito)) {
					NotaCreditoPuntoVentaBeanSwingJInternalFrame notacreditopuntoventaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup=new NotaCreditoPuntoVentaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						notacreditopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup;
					} else {
						notacreditopuntoventaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame;
					}

					List<EstadoNotaCredito> estadonotacreditos=new ArrayList<EstadoNotaCredito>();
					estadonotacreditos.add(this.estadonotacredito);
					if(!esRelacionado) {
						//notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setConGuardarRelaciones(false);
						//notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					notacreditopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormEstadoNotaCredito.cargarNotaCreditoPuntoVentaBeanSwingJInternalFrame(estadonotacreditos,this.estadonotacredito,notacreditopuntoventaBeanSwingJInternalFrame,/*conInicializar,*/notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getConGuardarRelaciones(),notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaSessionBean.getEsGuardarRelacionado());
					notacreditopuntoventaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						notacreditopuntoventaBeanSwingJInternalFrame.actualizarEstadoPanelsNotaCreditoPuntoVenta("no_relacionado");

						notacreditopuntoventaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA + (NotaCreditoPuntoVentaConstantesFunciones.ITAMANIOFILATABLA/2));

						notacreditopuntoventaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderEstadoNotaCredito=(TitledBorder)this.jScrollPanelDatosEstadoNotaCredito.getBorder();
						TitledBorder titledBorderNotaCreditoPuntoVenta=(TitledBorder)notacreditopuntoventaBeanSwingJInternalFrame.jScrollPanelDatosNotaCreditoPuntoVenta.getBorder();

						titledBorderNotaCreditoPuntoVenta.setTitle(titledBorderEstadoNotaCredito.getTitle() + " -> Nota Credito");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,notacreditopuntoventaBeanSwingJInternalFrame);
						}

						notacreditopuntoventaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(notacreditopuntoventaBeanSwingJInternalFrame);

						notacreditopuntoventaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Nota Credito",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEstadoNotaCredito(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito));			
			this.jButtonDuplicarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaDuplicarEstadoNotaCredito && this.isPermisoDuplicarEstadoNotaCredito));			
			this.jButtonCopiarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaCopiarEstadoNotaCredito && this.isPermisoCopiarEstadoNotaCredito));
			this.jButtonVerFormEstadoNotaCredito.setVisible((this.isVisibilidadCeldaVerFormEstadoNotaCredito && this.isPermisoVerFormEstadoNotaCredito));
			
			this.jButtonAbrirOrderByEstadoNotaCredito.setVisible((this.isVisibilidadCeldaOrdenEstadoNotaCredito && this.isPermisoOrdenEstadoNotaCredito));			
			
			this.jButtonNuevoRelacionesEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito));			
			this.jButtonNuevoGuardarCambiosEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaModificarEstadoNotaCredito && this.isPermisoActualizarEstadoNotaCredito));	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaActualizarEstadoNotaCredito && this.isPermisoActualizarEstadoNotaCredito));	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaEliminarEstadoNotaCredito && this.isPermisoEliminarEstadoNotaCredito));
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarEstadoNotaCredito.setVisible(this.isVisibilidadCeldaCancelarEstadoNotaCredito);							
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));			
			
			}
						
			this.jButtonGuardarCambiosTablaEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito));						
			this.jButtonDuplicarToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaDuplicarEstadoNotaCredito && this.isPermisoDuplicarEstadoNotaCredito));						
			this.jButtonCopiarToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaCopiarEstadoNotaCredito && this.isPermisoCopiarEstadoNotaCredito));			
			this.jButtonVerFormToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaVerFormEstadoNotaCredito && this.isPermisoVerFormEstadoNotaCredito));			
			this.jButtonAbrirOrderByToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaOrdenEstadoNotaCredito && this.isPermisoOrdenEstadoNotaCredito));
			this.jButtonNuevoRelacionesToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito));			
			this.jButtonNuevoGuardarCambiosToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));			
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaModificarEstadoNotaCredito && this.isPermisoActualizarEstadoNotaCredito));	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaActualizarEstadoNotaCredito  && this.isPermisoActualizarEstadoNotaCredito));	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaEliminarEstadoNotaCredito && this.isPermisoEliminarEstadoNotaCredito));
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarToolBarEstadoNotaCredito.setVisible(this.isVisibilidadCeldaCancelarEstadoNotaCredito);				
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito));			
			this.jMenuItemDuplicarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaDuplicarEstadoNotaCredito && this.isPermisoDuplicarEstadoNotaCredito));			
			this.jMenuItemCopiarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaCopiarEstadoNotaCredito && this.isPermisoCopiarEstadoNotaCredito));			
			this.jMenuItemVerFormEstadoNotaCredito.setVisible((this.isVisibilidadCeldaVerFormEstadoNotaCredito && this.isPermisoVerFormEstadoNotaCredito));			
			this.jMenuItemAbrirOrderByEstadoNotaCredito.setVisible((this.isVisibilidadCeldaOrdenEstadoNotaCredito && this.isPermisoOrdenEstadoNotaCredito));			
			//this.jMenuItemMostrarOcultarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaOrdenEstadoNotaCredito && this.isPermisoOrdenEstadoNotaCredito));
			this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito.setVisible((this.isVisibilidadCeldaOrdenEstadoNotaCredito && this.isPermisoOrdenEstadoNotaCredito));			
			//this.jMenuItemDetalleMostrarOcultarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaOrdenEstadoNotaCredito && this.isPermisoOrdenEstadoNotaCredito));			
			this.jMenuItemNuevoRelacionesEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito));			
			this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito.setVisible((this.isVisibilidadCeldaNuevoEstadoNotaCredito && this.isPermisoNuevoEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));									
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemModificarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaModificarEstadoNotaCredito && this.isPermisoActualizarEstadoNotaCredito));	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemActualizarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaActualizarEstadoNotaCredito && this.isPermisoActualizarEstadoNotaCredito));	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemEliminarEstadoNotaCredito.setVisible((this.isVisibilidadCeldaEliminarEstadoNotaCredito && this.isPermisoEliminarEstadoNotaCredito));
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemCancelarEstadoNotaCredito.setVisible(this.isVisibilidadCeldaCancelarEstadoNotaCredito);				
			}
			
			this.jMenuItemGuardarCambiosEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));						
			this.jMenuItemGuardarCambiosTablaEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=this.jButtonNuevoEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaDuplicarEstadoNotaCredito=this.jButtonDuplicarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaCopiarEstadoNotaCredito=this.jButtonCopiarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaVerFormEstadoNotaCredito=this.jButtonVerFormEstadoNotaCredito.isVisible();
			
			this.isVisibilidadCeldaOrdenEstadoNotaCredito=this.jButtonAbrirOrderByEstadoNotaCredito.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=this.jButtonNuevoRelacionesEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaModificarEstadoNotaCredito=this.jButtonModificarEstadoNotaCredito.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaGuardarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=this.jButtonGuardarCambiosTablaEstadoNotaCredito.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=this.jButtonNuevoToolBarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=this.jButtonNuevoRelacionesToolBarEstadoNotaCredito.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.isVisibilidadCeldaModificarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarToolBarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarToolBarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarToolBarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarToolBarEstadoNotaCredito.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoNotaCredito=this.jButtonGuardarCambiosToolBarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=this.jButtonGuardarCambiosTablaToolBarEstadoNotaCredito.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=this.jMenuItemNuevoEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=this.jMenuItemNuevoRelacionesEstadoNotaCredito.isVisible();
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.isVisibilidadCeldaModificarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemModificarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemActualizarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemEliminarEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemCancelarEstadoNotaCredito.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEstadoNotaCredito=this.jMenuItemGuardarCambiosEstadoNotaCredito.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=this.jMenuItemGuardarCambiosTablaEstadoNotaCredito.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEstadoNotaCredito(Boolean esInicializar) {
		if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
				//if(this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoNotaCredito();
			}
			
			this.inicializarActualizarBindingBotonesManualEstadoNotaCredito(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEstadoNotaCredito() {
		this.jButtonNuevoEstadoNotaCredito.setVisible(this.isPermisoNuevoEstadoNotaCredito);			
		this.jButtonDuplicarEstadoNotaCredito.setVisible(this.isPermisoDuplicarEstadoNotaCredito);			
		this.jButtonCopiarEstadoNotaCredito.setVisible(this.isPermisoCopiarEstadoNotaCredito);			
		this.jButtonVerFormEstadoNotaCredito.setVisible(this.isPermisoVerFormEstadoNotaCredito);			
		
		this.jButtonAbrirOrderByEstadoNotaCredito.setVisible(this.isPermisoOrdenEstadoNotaCredito);					
		
		this.jButtonNuevoRelacionesEstadoNotaCredito.setVisible(this.isPermisoNuevoEstadoNotaCredito);			
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarEstadoNotaCredito.setVisible(this.isPermisoActualizarEstadoNotaCredito);	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarEstadoNotaCredito.setVisible(this.isPermisoActualizarEstadoNotaCredito);	
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarEstadoNotaCredito.setVisible(this.isPermisoEliminarEstadoNotaCredito);
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarEstadoNotaCredito.setVisible(this.isVisibilidadCeldaCancelarEstadoNotaCredito);						
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.setVisible(this.isPermisoGuardarCambiosEstadoNotaCredito);							
		}
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.setVisible(this.isPermisoActualizarEstadoNotaCredito);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoNotaCredito() {
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarEstadoNotaCredito.setVisible(this.isPermisoActualizarEstadoNotaCredito);	
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarEstadoNotaCredito.setVisible(this.isPermisoActualizarEstadoNotaCredito);	
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarEstadoNotaCredito.setVisible(this.isPermisoEliminarEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarEstadoNotaCredito.setVisible(this.isVisibilidadCeldaCancelarEstadoNotaCredito);							
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.setVisible((this.isVisibilidadCeldaGuardarEstadoNotaCredito && this.isPermisoGuardarCambiosEstadoNotaCredito));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEstadoNotaCredito() {
		if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEstadoNotaCredito();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEstadoNotaCredito() {
	}
	
	public void jTableDatosEstadoNotaCreditoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEstadoNotaCredito(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEstadoNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.getestadonotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonotacredito==null) {
						this.estadonotacredito = new EstadoNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
				}

				if(this.estadonotacredito.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.estadonotacredito.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoEstadoNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.getestadonotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonotacredito==null) {
						this.estadonotacredito = new EstadoNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
				}

				if(this.estadonotacredito.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.estadonotacredito.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreEstadoNotaCreditoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.getestadonotacredito(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.estadonotacredito==null) {
						this.estadonotacredito = new EstadoNotaCredito();
					}

					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);
				}

				if(this.estadonotacredito.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.estadonotacredito.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEstadoNotaCredito(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameEstadoNotaCredito() {
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
		

		if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.setVisible(false);	    			
			this.jInternalFrameDetalleFormEstadoNotaCredito.dispose();
			this.jInternalFrameDetalleFormEstadoNotaCredito=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
			this.jInternalFrameReporteDinamicoEstadoNotaCredito.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEstadoNotaCredito.dispose();
			this.jInternalFrameReporteDinamicoEstadoNotaCredito=null;
		}
		
		if(this.jInternalFrameImportacionEstadoNotaCredito!=null) {
			this.jInternalFrameImportacionEstadoNotaCredito.setVisible(false);	    			
			this.jInternalFrameImportacionEstadoNotaCredito.dispose();
			this.jInternalFrameImportacionEstadoNotaCredito=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEstadoNotaCredito();
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			
			if(sTipo.equals("NuevoEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEstadoNotaCredito")) {
				jButtonDuplicarEstadoNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEstadoNotaCredito")) {
				jButtonCopiarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("VerFormEstadoNotaCredito")) {
				jButtonVerFormEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEstadoNotaCredito")) {
				jButtonDuplicarEstadoNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEstadoNotaCredito")) {
				jButtonDuplicarEstadoNotaCreditoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEstadoNotaCredito")) {
				jButtonModificarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEstadoNotaCredito")) {
				jButtonModificarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEstadoNotaCredito")) {
				jButtonModificarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEstadoNotaCredito")) {
				jButtonActualizarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEstadoNotaCredito")) {
				jButtonActualizarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEstadoNotaCredito")) {
				jButtonActualizarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("EliminarEstadoNotaCredito")) {
				jButtonEliminarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEstadoNotaCredito")) {
				jButtonEliminarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEstadoNotaCredito")) {
				jButtonEliminarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CancelarEstadoNotaCredito")) {
				jButtonCancelarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEstadoNotaCredito")) {
				jButtonCancelarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEstadoNotaCredito")) {
				jButtonCancelarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CerrarEstadoNotaCredito")) {
				jButtonCerrarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEstadoNotaCredito")) {
				jButtonCerrarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEstadoNotaCredito")) {
				jButtonCerrarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEstadoNotaCredito")) {
				jButtonMostrarOcultarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEstadoNotaCredito")) {
				jButtonCancelarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEstadoNotaCredito")) {
				jButtonCopiarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEstadoNotaCredito")) {
				jButtonVerFormEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEstadoNotaCredito")) {
				jButtonCopiarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEstadoNotaCredito")) {
				jButtonVerFormEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEstadoNotaCredito")) {
				jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEstadoNotaCredito")) {
				jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEstadoNotaCredito")) {
				jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEstadoNotaCredito")) {
				jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEstadoNotaCredito")) {
				jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEstadoNotaCredito")) {
				jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEstadoNotaCredito")) {
				jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEstadoNotaCredito")) {
				jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEstadoNotaCredito")) {
				jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEstadoNotaCredito") || sTipo.equals("MenuItemDetalleAbrirOrderByEstadoNotaCredito")) {
				jButtonAbrirOrderByEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEstadoNotaCredito") || sTipo.equals("MenuItemDetalleMostrarOcultarEstadoNotaCredito")) {
				jButtonMostrarOcultarEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoNotaCredito")) {
				jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEstadoNotaCredito")) {
				jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEstadoNotaCredito")) {
				jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEstadoNotaCredito")) {
				jButtonCerrarReporteDinamicoEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEstadoNotaCredito")) {
				jButtonGenerarReporteDinamicoEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEstadoNotaCredito")) {
				
				jButtonGenerarExcelReporteDinamicoEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEstadoNotaCredito")) {
				jButtonCerrarImportacionEstadoNotaCreditoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEstadoNotaCredito")) {
				
				jButtonGenerarImportacionEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEstadoNotaCredito")) {
				
				jButtonAbrirImportacionEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEstadoNotaCredito")) {
				jComboBoxTiposAccionesEstadoNotaCreditoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEstadoNotaCredito")) {
				jComboBoxTiposRelacionesEstadoNotaCreditoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEstadoNotaCredito")) {
				jComboBoxTiposAccionesEstadoNotaCreditoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEstadoNotaCredito")) {
				
				jComboBoxTiposSeleccionarEstadoNotaCreditoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEstadoNotaCredito")) {
				jTextFieldValorCampoGeneralEstadoNotaCreditoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEstadoNotaCredito")) {
				jButtonAbrirOrderByEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEstadoNotaCredito")) {
				jButtonAbrirOrderByEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEstadoNotaCredito")) {
				jButtonCerrarOrderByEstadoNotaCreditoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoNotaCreditoBusqueda")) {
				this.jButtonidEstadoNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoNotaCreditoBusqueda")) {
				this.jButtoncodigoEstadoNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoNotaCreditoBusqueda")) {
				this.jButtonnombreEstadoNotaCreditoBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEstadoNotaCredito();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EstadoNotaCredito estadonotacreditoLocal=null;
			
			if(!this.getEsControlTabla()) {
				estadonotacreditoLocal=this.estadonotacredito;
			} else {
				estadonotacreditoLocal=this.estadonotacreditoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
							
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
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
			
			


			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
								
						
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
								
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
							
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
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
			
			


			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
								
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
			
			this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEstadoNotaCredito")) {
					jCheckBoxSeleccionarTodosEstadoNotaCreditoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEstadoNotaCredito")) {
					jCheckBoxSeleccionadosEstadoNotaCreditoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEstadoNotaCredito")) {
					
				}
				
				


				
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
												
				
				


				
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
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
			
			


			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.estadonotacredito);
				
				this.actualizarInformacion("INFO_PADRE",false,this.estadonotacredito);
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
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
				
				


				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EstadoNotaCredito.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EstadoNotaCredito.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEstadoNotaCreditoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.estadonotacreditoAnterior =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEstadoNotaCredito")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEstadoNotaCreditoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEstadoNotaCredito.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.estadonotacredito =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.estadonotacredito);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEstadoNotaCredito")) {
				
				}
				
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEstadoNotaCredito")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEstadoNotaCredito.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEstadoNotaCredito")) {
			
			}
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEstadoNotaCredito();
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			if(sTipo.equals("NuevoEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEstadoNotaCredito")) {
				jButtonDuplicarEstadoNotaCreditoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEstadoNotaCredito")) {
				jButtonCopiarEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEstadoNotaCredito")) {
				jButtonVerFormEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEstadoNotaCredito")) {
				jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEstadoNotaCredito")) {
				jButtonModificarEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEstadoNotaCredito")) {
				jButtonActualizarEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEstadoNotaCredito")) {
				jButtonEliminarEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEstadoNotaCredito")) {
				jButtonCancelarEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEstadoNotaCredito")) {
				jButtonCerrarEstadoNotaCreditoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEstadoNotaCredito")) {
				jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEstadoNotaCredito")) {
				jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEstadoNotaCredito")) {
				jButtonAbrirOrderByEstadoNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEstadoNotaCredito")) {
				jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEstadoNotaCredito")) {
				jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEstadoNotaCredito")) {
				jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEstadoNotaCreditoBusqueda")) {
				this.jButtonidEstadoNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoEstadoNotaCreditoBusqueda")) {
				this.jButtoncodigoEstadoNotaCreditoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreEstadoNotaCreditoBusqueda")) {
				this.jButtonnombreEstadoNotaCreditoBusquedaActionPerformed(evt);
			}
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEstadoNotaCredito();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEstadoNotaCredito")) {
				closingInternalFrameEstadoNotaCredito();
				
			} else if(sTipo.equals("jButtonCancelarEstadoNotaCredito")) {
				JInternalFrameBase jInternalFrameDetalleFormEstadoNotaCredito = (JInternalFrameBase)evt.getSource();
	            	
	            EstadoNotaCreditoBeanSwingJInternalFrame jInternalFrameParent=(EstadoNotaCreditoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoNotaCredito.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEstadoNotaCreditoActionPerformed(null);
			}
			
			EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.estadonotacredito,new Object(),this.estadonotacreditoParameterGeneral,this.estadonotacreditoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEstadoNotaCredito(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEstadoNotaCredito(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEstadoNotaCredito(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.estadonotacredito)) {
			if(!esControlTabla) {
				if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);			
				}
				
				if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEstadoNotaCredito(this.estadonotacredito,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadonotacreditoReturnGeneral=estadonotacreditoLogic.procesarEventosEstadoNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonotacreditoLogic.getEstadoNotaCreditos(),this.estadonotacredito,this.estadonotacreditoParameterGeneral,this.isEsNuevoEstadoNotaCredito,classes);//this.estadonotacreditoLogic.getEstadoNotaCredito()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEstadoNotaCredito(this.estadonotacreditoReturnGeneral,this.estadonotacreditoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEstadoNotaCredito(classes,this.estadonotacreditoReturnGeneral,this.estadonotacreditoBean,false);
					}
						
					if(this.estadonotacreditoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito());	
					}
						
					if(this.estadonotacreditoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito(),classes);//this.estadonotacreditoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEstadoNotaCredito(this.estadonotacredito,classes);//this.estadonotacreditoBean);									
				}
			
				if(EstadoNotaCreditoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEstadoNotaCredito(this.estadonotacredito,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEstadoNotaCredito(this.estadonotacredito);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.estadonotacreditoAnterior!=null) {
						this.estadonotacredito=this.estadonotacreditoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.estadonotacreditoReturnGeneral=estadonotacreditoLogic.procesarEventosEstadoNotaCreditosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonotacreditoLogic.getEstadoNotaCreditos(),this.estadonotacredito,this.estadonotacreditoParameterGeneral,this.isEsNuevoEstadoNotaCredito,classes);//this.estadonotacreditoLogic.getEstadoNotaCredito()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.estadonotacreditoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.estadonotacreditoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito(),estadonotacreditoLogic.getEstadoNotaCreditos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito(),this.estadonotacreditos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEstadoNotaCredito.repaint();
				
				//((AbstractTableModel) this.jTableDatosEstadoNotaCredito.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEstadoNotaCredito();
			}
		}
	}
	
	public void actualizarVisualTableDatosEstadoNotaCredito() throws Exception {
		
		EstadoNotaCreditoModel estadonotacreditoModel=(EstadoNotaCreditoModel)this.jTableDatosEstadoNotaCredito.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			estadonotacreditoModel.estadonotacreditos=this.estadonotacreditoLogic.getEstadoNotaCreditos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			estadonotacreditoModel.estadonotacreditos=this.estadonotacreditos;
		}
		
		
		((EstadoNotaCreditoModel) this.jTableDatosEstadoNotaCredito.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEstadoNotaCredito() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getestadonotacreditoAnterior(),this.estadonotacreditoLogic.getEstadoNotaCreditos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getestadonotacreditoAnterior(),this.estadonotacreditos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEstadoNotaCredito();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEstadoNotaCredito(EstadoNotaCredito estadonotacredito,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(estadonotacredito.getNotaCreditoSoliSolis());
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas());
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
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
										
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonotacredito,new Object(),generalEntityParameterGeneral,this.estadonotacreditoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.estadonotacreditoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EstadoNotaCreditoConstantesFunciones.getClassesRelationshipsOfEstadoNotaCredito(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EstadoNotaCreditoConstantesFunciones.getClassesRelationshipsFromStringsOfEstadoNotaCredito(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEstadoNotaCredito(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EstadoNotaCreditoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.estadonotacredito,new Object(),generalEntityParameterGeneral,this.estadonotacreditoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEstadoNotaCredito(EstadoNotaCreditoBean estadonotacreditoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.setNotaCreditoSolis(estadonotacredito.getNotaCreditoSoliSolis());
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoSoli(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.setNotaCreditoPuntoVentas(estadonotacredito.getNotaCreditoPuntoVentaPuntoVentas());
					this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.inicializarActualizarBindingTablaNotaCreditoPuntoVenta(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEstadoNotaCredito(ArrayList<Classe> classes,EstadoNotaCreditoReturnGeneral estadonotacreditoReturnGeneral,EstadoNotaCreditoBean estadonotacreditoBean,Boolean conDefault) throws Exception {
		
			this.estadonotacreditoBean.setNotaCreditoSolis(estadonotacreditoReturnGeneral.getEstadoNotaCredito().getNotaCreditoSolis());
			this.estadonotacreditoBean.setNotaCreditoPuntoVentas(estadonotacreditoReturnGeneral.getEstadoNotaCredito().getNotaCreditoPuntoVentas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEstadoNotaCredito(EstadoNotaCredito estadonotacredito,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoSoli.class)) {
					estadonotacredito.setNotaCreditoSoliSolis(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliBeanSwingJInternalFrame.notacreditosoliLogic.getNotaCreditoSolis());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(NotaCreditoPuntoVenta.class)) {
					estadonotacredito.setNotaCreditoPuntoVentaPuntoVentas(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaBeanSwingJInternalFrame.notacreditopuntoventaLogic.getNotaCreditoPuntoVentas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.estadonotacredito)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEstadoNotaCredito = new EstadoNotaCreditoDetalleFormJInternalFrame(jDesktopPane,this.estadonotacreditoSessionBean.getConGuardarRelaciones(),this.estadonotacreditoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.setVisible(false);
		this.jInternalFrameDetalleFormEstadoNotaCredito.setSelected(false);						
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.estadonotacreditoLogic=this.estadonotacreditoLogic;
		
		this.cargarCombosFrameForeignKeyEstadoNotaCredito("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEstadoNotaCredito();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEstadoNotaCredito();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEstadoNotaCredito("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEstadoNotaCredito();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoNotaCredito"));
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarEstadoNotaCredito"));

		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoNotaCredito"));
					
		this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemModificarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"ActualizarEstadoNotaCredito"));
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoNotaCredito"));
						
		this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemActualizarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarEstadoNotaCredito"));
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoNotaCredito"));
								
		this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemEliminarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarEstadoNotaCredito"));
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoNotaCredito"));
					
		this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemCancelarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoNotaCredito"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemDetalleCerrarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoNotaCredito"));		
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNotaCredito"));
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNotaCredito"));
		
		
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoNotaCredito"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonidEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtoncodigoEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonnombreEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNotaCreditoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoNotaCredito"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEstadoNotaCredito"));
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEstadoNotaCredito"));
		}
		
		this.jTableDatosEstadoNotaCredito.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEstadoNotaCredito"));
		
		this.jTableDatosEstadoNotaCredito.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEstadoNotaCredito"));
		
		this.jButtonNuevoEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"NuevoEstadoNotaCredito"));
		
		this.jButtonDuplicarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"DuplicarEstadoNotaCredito"));
		
		this.jButtonCopiarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"CopiarEstadoNotaCredito"));
		
		this.jButtonVerFormEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"VerFormEstadoNotaCredito"));
		
		
		this.jButtonNuevoToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"NuevoToolBarEstadoNotaCredito"));
			
		this.jButtonDuplicarToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEstadoNotaCredito"));
			
		this.jMenuItemNuevoEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEstadoNotaCredito"));
			
		this.jMenuItemDuplicarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEstadoNotaCredito"));		
		
		
		this.jButtonNuevoRelacionesEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEstadoNotaCredito"));
		
		
		this.jButtonNuevoRelacionesToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEstadoNotaCredito"));
			
		this.jMenuItemNuevoRelacionesEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEstadoNotaCredito"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarEstadoNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonModificarToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"ModificarToolBarEstadoNotaCredito"));
			
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemModificarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"MenuItemModificarEstadoNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"ActualizarEstadoNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonActualizarToolBarEstadoNotaCredito.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEstadoNotaCredito"));
				
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemActualizarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEstadoNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarEstadoNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonEliminarToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"EliminarToolBarEstadoNotaCredito"));
						
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemEliminarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEstadoNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarEstadoNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonCancelarToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CancelarToolBarEstadoNotaCredito"));
			
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemCancelarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEstadoNotaCredito"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEstadoNotaCredito"));		
		
		
		this.jButtonCerrarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CerrarEstadoNotaCredito"));
		
		
		this.jButtonCerrarToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CerrarToolBarEstadoNotaCredito"));
			
		this.jMenuItemCerrarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEstadoNotaCredito"));
			
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jMenuItemDetalleCerrarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEstadoNotaCredito"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosEstadoNotaCredito"));
		}
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEstadoNotaCredito"));
		}
		
		this.jButtonCopiarToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CopiarToolBarEstadoNotaCredito"));
			
		this.jButtonVerFormToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"VerFormToolBarEstadoNotaCredito"));
		
		this.jMenuItemGuardarCambiosEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEstadoNotaCredito"));
			
		this.jMenuItemCopiarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEstadoNotaCredito"));		
		
		this.jMenuItemVerFormEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEstadoNotaCredito"));		
		
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoNotaCredito"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEstadoNotaCredito"));
			
		this.jMenuItemGuardarCambiosTablaEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEstadoNotaCredito"));		
		
		
		
		this.jButtonRecargarInformacionEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"RecargarInformacionEstadoNotaCredito"));
					
		this.jButtonRecargarInformacionToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEstadoNotaCredito"));
		
		this.jMenuItemRecargarInformacionEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEstadoNotaCredito"));		
		
		
		
		this.jButtonAnterioresEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"AnterioresEstadoNotaCredito"));
		
		
		this.jButtonAnterioresToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEstadoNotaCredito"));
		
		this.jMenuItemAnterioresEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEstadoNotaCredito"));		
		
		
		this.jButtonSiguientesEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"SiguientesEstadoNotaCredito"));
		
		
		this.jButtonSiguientesToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEstadoNotaCredito"));
			
		this.jMenuItemSiguientesEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEstadoNotaCredito"));
			
		this.jMenuItemAbrirOrderByEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEstadoNotaCredito"));
			
		this.jMenuItemMostrarOcultarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEstadoNotaCredito"));
			
		this.jMenuItemDetalleAbrirOrderByEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEstadoNotaCredito"));
			
		this.jMenuItemDetalleMostarOcultarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEstadoNotaCredito"));		
		
		
		this.jButtonNuevoGuardarCambiosEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEstadoNotaCredito"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEstadoNotaCredito"));
			
		this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEstadoNotaCredito"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEstadoNotaCredito"));

		this.jCheckBoxSeleccionadosEstadoNotaCredito.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEstadoNotaCredito"));
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEstadoNotaCredito"));
		}
		
		
		this.jComboBoxTiposRelacionesEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"TiposRelacionesEstadoNotaCredito"));
			
		this.jComboBoxTiposAccionesEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"TiposAccionesEstadoNotaCredito"));
					
		this.jComboBoxTiposSeleccionarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEstadoNotaCredito"));
			
		this.jTextFieldValorCampoGeneralEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEstadoNotaCredito"));		
		
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonidEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtoncodigoEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonnombreEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNotaCreditoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEstadoNotaCredito!=null) {
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNotaCredito"));
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNotaCredito"));
				this.jInternalFrameReporteDinamicoEstadoNotaCredito.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNotaCredito"));
			}
			
			//this.jButtonCerrarReporteDinamicoEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEstadoNotaCredito"));				
			//this.jButtonGenerarReporteDinamicoEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEstadoNotaCredito"));
			//this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEstadoNotaCredito"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEstadoNotaCredito!=null) {
				this.jInternalFrameImportacionEstadoNotaCredito.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEstadoNotaCredito"));
				this.jInternalFrameImportacionEstadoNotaCredito.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEstadoNotaCredito"));
				this.jInternalFrameImportacionEstadoNotaCredito.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEstadoNotaCredito"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"AbrirOrderByEstadoNotaCredito"));
			
			this.jButtonAbrirOrderByToolBarEstadoNotaCredito.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEstadoNotaCredito"));			
			
			if(this.jInternalFrameOrderByEstadoNotaCredito!=null) {
				this.jInternalFrameOrderByEstadoNotaCredito.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEstadoNotaCredito"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEstadoNotaCredito.jTabbedPaneRelacionesEstadoNotaCredito.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEstadoNotaCredito"));
		
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
            		closingInternalFrameEstadoNotaCredito();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEstadoNotaCredito = (JInternalFrameBase)event.getSource();
	            	
	            EstadoNotaCreditoBeanSwingJInternalFrame jInternalFrameParent=(EstadoNotaCreditoBeanSwingJInternalFrame)jInternalFrameDetalleFormEstadoNotaCredito.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEstadoNotaCreditoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEstadoNotaCredito.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEstadoNotaCreditoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEstadoNotaCredito.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEstadoNotaCredito.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEstadoNotaCredito";
		inputMap = this.jButtonNuevoEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEstadoNotaCredito";
		inputMap = this.jButtonNuevoRelacionesEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEstadoNotaCreditoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEstadoNotaCredito";
		inputMap = this.jButtonModificarEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEstadoNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEstadoNotaCredito";
		inputMap = this.jButtonActualizarEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEstadoNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEstadoNotaCredito";
		inputMap = this.jButtonEliminarEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEstadoNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEstadoNotaCredito";
		inputMap = this.jButtonCancelarEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEstadoNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEstadoNotaCredito";
		inputMap = this.jButtonCerrarEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEstadoNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEstadoNotaCredito";
		inputMap = this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonGuardarCambiosEstadoNotaCredito.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEstadoNotaCreditoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEstadoNotaCredito.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEstadoNotaCreditoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEstadoNotaCredito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEstadoNotaCreditoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEstadoNotaCredito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEstadoNotaCreditoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEstadoNotaCredito.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEstadoNotaCreditoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonidEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"idEstadoNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtoncodigoEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"codigoEstadoNotaCreditoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEstadoNotaCredito.jButtonnombreEstadoNotaCreditoBusqueda.addActionListener(new ButtonActionListener(this,"nombreEstadoNotaCreditoBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEstadoNotaCredito.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEstadoNotaCreditoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEstadoNotaCreditoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEstadoNotaCredito.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEstadoNotaCredito(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
					estadonotacreditoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditos) {
					estadonotacreditoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEstadoNotaCreditoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoNotaCredito(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
						estadonotacreditoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditos) {
						estadonotacreditoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoNotaCredito.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoNotaCredito.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCredito,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEstadoNotaCreditoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEstadoNotaCredito(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEstadoNotaCredito.getSelectedRows();
			
			EstadoNotaCredito estadonotacreditoLocal=new EstadoNotaCredito();
			
			//this.seleccionarTodosEstadoNotaCredito(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					estadonotacreditoLocal =(EstadoNotaCredito) this.estadonotacreditoLogic.getEstadoNotaCreditos().toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					estadonotacreditoLocal =(EstadoNotaCredito) this.estadonotacreditos.toArray()[this.jTableDatosEstadoNotaCredito.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				estadonotacreditoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
						estadonotacreditoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditos) {
						estadonotacreditoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEstadoNotaCredito.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEstadoNotaCredito.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEstadoNotaCredito,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEstadoNotaCreditoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEstadoNotaCreditoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEstadoNotaCreditoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEstadoNotaCredito(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEstadoNotaCredito.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditoLogic.getEstadoNotaCreditos()) {
				
						if(sTipoSeleccionar.equals(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadonotacreditoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadonotacreditoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditos) {
					
						if(sTipoSeleccionar.equals(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							estadonotacreditoAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							estadonotacreditoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEstadoNotaCreditoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEstadoNotaCredito(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEstadoNotaCredito=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEstadoNotaCredito.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEstadoNotaCredito) {				
					conSplash=true;//false;										
					
					//this.startProcessEstadoNotaCredito(conSplash);
				
					this.generarReporteEstadoNotaCreditosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEstadoNotaCreditosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoNotaCreditosSeleccionados(false);
				//this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEstadoNotaCreditosSeleccionados(true);
				//this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoNotaCredito();
				
				this.exportarEstadoNotaCreditosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEstadoNotaCreditos();
				//this.importarEstadoNotaCreditos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEstadoNotaCredito();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEstadoNotaCreditosSeleccionados();
				//this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Estado Nota Credito", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEstadoNotaCredito();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEstadoNotaCredito)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEstadoNotaCredito(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEstadoNotaCredito.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEstadoNotaCredito.jComboBoxTiposAccionesFormularioEstadoNotaCredito.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEstadoNotaCredito();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEstadoNotaCredito(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEstadoNotaCreditoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEstadoNotaCredito();
			
			if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
			EstadoNotaCredito estadonotacredito=new EstadoNotaCredito();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEstadoNotaCredito(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEstadoNotaCredito.getSelectedItem();
			
			
			
			
			estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
			//this.sTipoAccion;
			
			if(estadonotacreditosSeleccionados.size()==1) {
				for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosSeleccionados) {
					estadonotacredito=estadonotacreditoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Solicitud Nota Credito")) {
					jButtonNotaCreditoSoliActionPerformed(null,rowIndex,true,false,estadonotacredito);
				}
				else if(this.sTipoRelacion.equals("Nota Credito")) {
					jButtonNotaCreditoPuntoVentaActionPerformed(null,rowIndex,true,false,estadonotacredito);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEstadoNotaCredito();
			
      		//this.finishProcessEstadoNotaCredito(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEstadoNotaCreditoReturnGeneral() throws Exception {
		if(this.estadonotacreditoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.estadonotacreditoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.estadonotacreditoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.estadonotacreditoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.estadonotacreditoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.estadonotacreditoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEstadoNotaCredito(false);
		}
		
		if(this.estadonotacreditoReturnGeneral.getConRetornoLista() || this.estadonotacreditoReturnGeneral.getConRetornoObjeto()) {
			if(this.estadonotacreditoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadonotacreditoLogic.setEstadoNotaCreditos(this.estadonotacreditoReturnGeneral.getEstadoNotaCreditos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.estadonotacreditoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.estadonotacreditoLogic.setEstadoNotaCredito(this.estadonotacreditoReturnGeneral.getEstadoNotaCredito());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEstadoNotaCredito(false);
		}
	}
	
	public void actualizarParametrosGeneralEstadoNotaCredito() throws Exception {
		
		
	}
	
	public ArrayList<EstadoNotaCredito> getEstadoNotaCreditosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEstadoNotaCredito) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditoLogic.getEstadoNotaCreditos()) {
					if(estadonotacreditoAux.getIsSelected()) {
						estadonotacreditosSeleccionados.add(estadonotacreditoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EstadoNotaCredito estadonotacreditoAux:this.estadonotacreditos) {
					if(estadonotacreditoAux.getIsSelected()) {
						estadonotacreditosSeleccionados.add(estadonotacreditoAux);				
					}
				}
			}
			
			if(estadonotacreditosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						estadonotacreditosSeleccionados.addAll(this.estadonotacreditoLogic.getEstadoNotaCreditos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						estadonotacreditosSeleccionados.addAll(this.estadonotacreditos);				
					}
				}
			}
		} else {
			estadonotacreditosSeleccionados.add(this.estadonotacredito);
		}
		
		return estadonotacreditosSeleccionados;
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
	
	public void generarReporteEstadoNotaCreditosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEstadoNotaCreditosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEstadoNotaCreditosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoNotaCreditosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEstadoNotaCreditosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesEstadoNotaCreditosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Estado Nota Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEstadoNotaCreditosSeleccionados() throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados);
		
	}	
	
	public void generarReporteNormalEstadoNotaCreditosSeleccionados() throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEstadoNotaCreditosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEstadoNotaCreditosSeleccionados() throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEstadoNotaCredito();
		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEstadoNotaCredito();
		
		
		//this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados ,estadonotacreditoImplementable,estadonotacreditoImplementableHome);
	}
	
	public void mostrarImportacionEstadoNotaCreditos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEstadoNotaCredito();
		
		this.abrirFrameImportacionEstadoNotaCredito();		
		
			
		//this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados ,estadonotacreditoImplementable,estadonotacreditoImplementableHome);
	}
	
	public void importarEstadoNotaCreditos() throws Exception {		
	
	}
	
	public void exportarEstadoNotaCreditosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEstadoNotaCreditosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEstadoNotaCreditosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEstadoNotaCreditosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Estado Nota Credito",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEstadoNotaCreditosSeleccionados() throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEstadoNotaCredito(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEstadoNotaCredito(estadonotacreditoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//estadonotacreditoAux.setsDetalleGeneralEntityReporte(estadonotacreditoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEstadoNotaCredito(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EstadoNotaCreditoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNotaCreditoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEstadoNotaCredito(EstadoNotaCredito estadonotacredito,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=estadonotacredito.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonotacredito.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonotacredito.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=estadonotacredito.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEstadoNotaCreditosSeleccionados() throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EstadoNotaCreditos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEstadoNotaCredito(row);				
				iRow++;
			}				
			
			for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEstadoNotaCredito(estadonotacreditoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEstadoNotaCreditosSeleccionados() throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();		
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"estadonotacredito.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("estadonotacreditos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("estadonotacredito");
			//elementRoot.appendChild(element);
		
			for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosSeleccionados) {
				element = document.createElement("estadonotacredito");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEstadoNotaCredito(estadonotacreditoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Estado Nota Credito",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEstadoNotaCredito(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEstadoNotaCredito(EstadoNotaCredito estadonotacredito,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(estadonotacredito.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(estadonotacredito.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(estadonotacredito.getnombre());				
	}
	
	public void setFilaDatosExportarXmlEstadoNotaCredito(EstadoNotaCredito estadonotacredito,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EstadoNotaCreditoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(estadonotacredito.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EstadoNotaCreditoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(estadonotacredito.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(EstadoNotaCreditoConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(estadonotacredito.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(EstadoNotaCreditoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(estadonotacredito.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoEstadoNotaCreditosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados=new ArrayList<EstadoNotaCredito>();
		
		estadonotacreditosSeleccionados=this.getEstadoNotaCreditosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEstadoNotaCredito(estadonotacreditosSeleccionados);
		
		this.generarReporteEstadoNotaCreditos("Todos",estadonotacreditosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEstadoNotaCredito(ArrayList<EstadoNotaCredito> estadonotacreditosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EstadoNotaCredito estadonotacreditoAux:estadonotacreditosSeleccionados) {
				estadonotacreditoAux.setsDetalleGeneralEntityReporte(estadonotacreditoAux.toString());
			
				if(sTipoSeleccionar.equals(EstadoNotaCreditoConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					estadonotacreditoAux.setsDescripcionGeneralEntityReporte1(estadonotacreditoAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(EstadoNotaCreditoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					estadonotacreditoAux.setsDescripcionGeneralEntityReporte1(estadonotacreditoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EstadoNotaCreditoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEstadoNotaCredito(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEstadoNotaCredito=true;
				this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=true;
				this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=true;
			}
			
			this.isVisibilidadCeldaModificarEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=false;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
			this.isVisibilidadCeldaModificarEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=true;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
			this.isVisibilidadCeldaModificarEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=true;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=true;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
			this.isVisibilidadCeldaModificarEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=true;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=true;
			this.isVisibilidadCeldaModificarEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=false;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=true;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=false;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
			this.isVisibilidadCeldaModificarEstadoNotaCredito=true;
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=false;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
			this.isVisibilidadCeldaCancelarEstadoNotaCredito=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				} else {
					this.isVisibilidadCeldaGuardarEstadoNotaCredito=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EstadoNotaCreditoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=true;
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=true;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=true;
		} else {
			this.actualizarEstadoPanelsEstadoNotaCredito(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEstadoNotaCredito=false;
			//this.isVisibilidadCeldaVerFormEstadoNotaCredito=false;
			this.isVisibilidadCeldaDuplicarEstadoNotaCredito=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!estadonotacreditoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
		} else {
			this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
			this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
			if(!estadonotacreditoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;												
			}
			
			this.jButtonCerrarEstadoNotaCredito.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEstadoNotaCredito=false;
		}
		
		if(!this.permiteMantenimiento(this.estadonotacredito)) {
			this.isVisibilidadCeldaActualizarEstadoNotaCredito=false;
			this.isVisibilidadCeldaEliminarEstadoNotaCredito=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEstadoNotaCredito() {
		this.isVisibilidadCeldaNuevoEstadoNotaCredito=false;
		this.isVisibilidadCeldaGuardarCambiosEstadoNotaCredito=false;
	}
	
	public void actualizarEstadoPanelsEstadoNotaCredito(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(false);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEdicionEstadoNotaCredito.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosEstadoNotaCredito!=null) {
				this.jScrollPanelDatosEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelPaginacionEstadoNotaCredito!=null) {
				this.jPanelPaginacionEstadoNotaCredito.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEstadoNotaCredito!=null) {
				this.jPanelParametrosReportesEstadoNotaCredito.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.estadonotacreditoSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionEstadoNotaCreditoSoliParaNotaCreditoSolis() throws Exception {
		Boolean isPaginaPopupNotaCreditoSoli=false;

		try {

			if(this.estadonotacreditoSessionBean==null) {
				this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean=new NotaCreditoSoliSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.setsPathNavegacionActual(estadonotacreditoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NotaCreditoSoliConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNotaCreditoSoli=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoSoli(EstadoNotaCreditoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.setisBusquedaDesdeForeignKeySesionEstadoNotaCreditoSoli(true);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditosoliSessionBean.setlidEstadoNotaCreditoSoliActual(this.idEstadoNotaCreditoActual);

			estadonotacreditoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoNotaCredito(true);
			estadonotacreditoSessionBean.setlIdEstadoNotaCreditoActualForeignKey(this.idEstadoNotaCreditoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionEstadoNotaCreditoPuntoVentaParaNotaCreditoPuntoVentas() throws Exception {
		Boolean isPaginaPopupNotaCreditoPuntoVenta=false;

		try {

			if(this.estadonotacreditoSessionBean==null) {
				this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
			}

			if(this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean==null) {
				this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean=new NotaCreditoPuntoVentaSessionBean();
			}

			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.setsPathNavegacionActual(estadonotacreditoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+NotaCreditoPuntoVentaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupNotaCreditoPuntoVenta=this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(true);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeNotaCreditoPuntoVenta(EstadoNotaCreditoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.setisBusquedaDesdeForeignKeySesionEstadoNotaCreditoPuntoVenta(true);
			this.jInternalFrameDetalleFormEstadoNotaCredito.notacreditopuntoventaSessionBean.setlidEstadoNotaCreditoPuntoVentaActual(this.idEstadoNotaCreditoActual);

			estadonotacreditoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEstadoNotaCredito(true);
			estadonotacreditoSessionBean.setlIdEstadoNotaCreditoActualForeignKey(this.idEstadoNotaCreditoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EstadoNotaCreditoSessionBean estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
		
		if(this.estadonotacreditoSessionBean==null) {
			this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
		}
		
		this.estadonotacreditoSessionBean.setsUltimaBusquedaEstadoNotaCredito(this.getsAccionBusqueda());
		this.estadonotacreditoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.estadonotacreditoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EstadoNotaCreditoSessionBean estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
		
		if(this.estadonotacreditoSessionBean==null) {
			this.estadonotacreditoSessionBean=new EstadoNotaCreditoSessionBean();
		}
		
		if(this.estadonotacreditoSessionBean.getsUltimaBusquedaEstadoNotaCredito()!=null&&!this.estadonotacreditoSessionBean.getsUltimaBusquedaEstadoNotaCredito().equals("")) {
			this.setsAccionBusqueda(estadonotacreditoSessionBean.getsUltimaBusquedaEstadoNotaCredito());
			this.setiNumeroPaginacion(estadonotacreditoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(estadonotacreditoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.estadonotacreditoSessionBean.setsUltimaBusquedaEstadoNotaCredito("");
		this.estadonotacreditoSessionBean.setiNumeroPaginacion(EstadoNotaCreditoConstantesFunciones.INUMEROPAGINACION);
		this.estadonotacreditoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEstadoNotaCredito(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEstadoNotaCredito() {
		this.updateBorderResaltarBusquedasFormularioEstadoNotaCredito();
		this.updateVisibilidadBusquedasFormularioEstadoNotaCredito();
		this.updateHabilitarBusquedasFormularioEstadoNotaCredito();
	}
	
	public void updateBorderResaltarBusquedasFormularioEstadoNotaCredito() {					
	}
	
	public void updateVisibilidadBusquedasFormularioEstadoNotaCredito() {
	}
	
	public void updateHabilitarBusquedasFormularioEstadoNotaCredito() {
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
	
	public void updateControlesFormularioEstadoNotaCredito() throws Exception {

		if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEstadoNotaCredito();
		this.updateVisibilidadResaltarControlesFormularioEstadoNotaCredito();
		this.updateHabilitarResaltarControlesFormularioEstadoNotaCredito();
		
	}
	
	public void updateBorderResaltarControlesFormularioEstadoNotaCredito() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.estadonotacreditoConstantesFunciones.resaltaridEstadoNotaCredito!=null && this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setBorder(this.estadonotacreditoConstantesFunciones.resaltaridEstadoNotaCredito);}
		if(this.estadonotacreditoConstantesFunciones.resaltarcodigoEstadoNotaCredito!=null && this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setBorder(this.estadonotacreditoConstantesFunciones.resaltarcodigoEstadoNotaCredito);}
		if(this.estadonotacreditoConstantesFunciones.resaltarnombreEstadoNotaCredito!=null && this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setBorder(this.estadonotacreditoConstantesFunciones.resaltarnombreEstadoNotaCredito);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEstadoNotaCredito() throws Exception {		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
	
		//this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setVisible(this.estadonotacreditoConstantesFunciones.mostraridEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelidEstadoNotaCredito.setVisible(this.estadonotacreditoConstantesFunciones.mostraridEstadoNotaCredito);
		//this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setVisible(this.estadonotacreditoConstantesFunciones.mostrarcodigoEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelcodigoEstadoNotaCredito.setVisible(this.estadonotacreditoConstantesFunciones.mostrarcodigoEstadoNotaCredito);
		//this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setVisible(this.estadonotacreditoConstantesFunciones.mostrarnombreEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jPanelnombreEstadoNotaCredito.setVisible(this.estadonotacreditoConstantesFunciones.mostrarnombreEstadoNotaCredito);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEstadoNotaCredito() throws Exception {
		if(this.jInternalFrameDetalleFormEstadoNotaCredito==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEstadoNotaCredito!=null) {
	
		this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldidEstadoNotaCredito.setEnabled(this.estadonotacreditoConstantesFunciones.activaridEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jTextFieldcodigoEstadoNotaCredito.setEnabled(this.estadonotacreditoConstantesFunciones.activarcodigoEstadoNotaCredito);
		this.jInternalFrameDetalleFormEstadoNotaCredito.jTextAreanombreEstadoNotaCredito.setEnabled(this.estadonotacreditoConstantesFunciones.activarnombreEstadoNotaCredito);
		}
	}
	
		
}